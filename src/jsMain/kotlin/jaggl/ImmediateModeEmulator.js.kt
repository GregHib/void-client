package jaggl

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor

const val GL_QUADS = 7
const val GL_QUAD_STRIP = 8
const val GL_POLYGON = 9
private const val GL_LINES = 1
private const val GL_LINE_LOOP = 2
private const val GL_LINE_STRIP = 3

// Per-vertex layout, in floats: position(3) colour(4) texcoord0(3) normal(3) texcoord1(3).
// texcoord0 carries three components (not two) because glTexCoord3f/3i and the unit-0 branch of
// glMultiTexCoord3i feed real R coordinates - 3D-texture slice lookups (GlowPostProcessor's
// height-map walk) and cube-map face directions both depend on it, and dropping R silently
// collapses every slice/face onto r = 0.
private const val FLOATS_PER_VERTEX = 16
private const val OFFSET_COLOR = 3
private const val OFFSET_TEXCOORD0 = 7
private const val OFFSET_NORMAL = 10
private const val OFFSET_TEXCOORD1 = 13

private const val INITIAL_VERTEX_CAPACITY = 256 * FLOATS_PER_VERTEX

// Smallest vertex span the quad index buffer is built for; larger batches grow it by doubling.
private const val INITIAL_INDEX_VERTEX_SPAN = 256

private val QUAD_TRIANGLES = intArrayOf(0, 1, 2, 0, 2, 3)

class ImmediateModeEmulator(private val gl: WebGL2RenderingContext, private val state: GlState) {
    private var active = false
    private var mode = 0

    // Raw per-vertex float storage, grown by doubling as needed. Backed by a primitive FloatArray
    // (not ArrayList<Float>) so glVertex/glColor/glTexCoord - potentially thousands of calls per
    // frame for any surviving immediate-mode drawing - don't box every float into a wrapper object.
    private var vertices = FloatArray(INITIAL_VERTEX_CAPACITY)
    private var vertexFloatCount = 0
    private var vertexCount = 0

    private val streamBuffer: WebGLBuffer = gl.createBuffer()!!
    // Byte capacity currently allocated for streamBuffer. Kept so end() can orphan-and-refill an
    // existing store (bufferData(size) + bufferSubData) instead of reallocating it every flush -
    // sprite/glyph drawing flushes once per quad, so this runs hundreds of times a frame.
    private var streamBufferBytes = 0

    // GL_QUADS/GL_QUAD_STRIP are drawn as indexed triangles rather than by expanding the vertex
    // data 6-for-4 into a scratch array: the indices depend only on (mode, vertex count), so they
    // are built once and reused, and each quad uploads 4 vertices instead of 6.
    private val indexBuffer: WebGLBuffer = gl.createBuffer()!!
    private var indexScratch = IntArray(0)
    private var indexBufferMode = 0
    private var indexBufferVertexSpan = 0

    // Triangles that [expandLines] builds in place of scaled window lines.
    private var lineVertices = FloatArray(0)

    // Object -> logical window transform, set by [loadWindowTransform]. Window x/y of an object
    // point is (m * p).xy * (sx, sy) + (ox, oy); j00..j11 is its 2x2 Jacobian, inverted via det.
    private var m = FloatArray(16)
    private var sx = 0f
    private var sy = 0f
    private var ox = 0f
    private var oy = 0f
    private var j00 = 0f
    private var j01 = 0f
    private var j10 = 0f
    private var j11 = 0f
    private var det = 0f

    fun begin(mode: Int) {
        active = true
        this.mode = mode
        vertexFloatCount = 0
        vertexCount = 0
    }

    fun vertex(x: Float, y: Float, z: Float) {
        if (!active) return
        ensureVertexCapacity(vertexFloatCount + FLOATS_PER_VERTEX)
        var i = vertexFloatCount
        vertices[i++] = x; vertices[i++] = y; vertices[i++] = z
        vertices[i++] = state.currentColor[0]; vertices[i++] = state.currentColor[1]
        vertices[i++] = state.currentColor[2]; vertices[i++] = state.currentColor[3]
        vertices[i++] = state.currentTexCoord[0]; vertices[i++] = state.currentTexCoord[1]
        vertices[i++] = state.currentTexCoord[2]
        vertices[i++] = state.currentNormal[0]; vertices[i++] = state.currentNormal[1]; vertices[i++] = state.currentNormal[2]
        vertices[i++] = state.currentTexCoord1[0]; vertices[i++] = state.currentTexCoord1[1]
        vertices[i++] = state.currentTexCoord1[2]
        vertexFloatCount = i
        vertexCount++
    }

    fun end() {
        active = false
        val count = vertexCount
        val floatCount = vertexFloatCount
        // Reset before drawing so an unbalanced second glEnd() is a no-op rather than a silent
        // re-issue of the batch just drawn (which shows up as over-bright additive/blended geometry
        // rather than as an error).
        vertexCount = 0
        vertexFloatCount = 0
        if (count == 0) return

        var source = vertices
        var drawCount = count
        var drawFloatCount = floatCount
        var drawMode = if (mode == GL_POLYGON) WebGL2RenderingContext.TRIANGLE_FAN else mode
        var disableCull = false
        val scaled = OpenGL.drawScale > 1 && loadWindowTransform()
        val isLines = mode == GL_LINES || mode == GL_LINE_LOOP || mode == GL_LINE_STRIP
        if (scaled && !isLines && mode != 0) snapToPixelGrid(count)
        if (scaled && isLines) {
            val expanded = expandLines(count)
            if (expanded == 0) return
            if (expanded > 0) {
                source = lineVertices
                drawCount = expanded
                drawFloatCount = expanded * FLOATS_PER_VERTEX
                drawMode = WebGL2RenderingContext.TRIANGLES
                // Lines are never culled; the quads standing in for them must not be either.
                disableCull = gl.isEnabled(GL_CULL_FACE)
            }
        }
        val indexCount = indexCountFor(mode, count)
        if (indexCount == 0 && (mode == GL_QUADS || mode == GL_QUAD_STRIP)) return

        val view = source.asFloat32Array().subarray(0, drawFloatCount)
        gl.bindBuffer(WebGL2RenderingContext.ARRAY_BUFFER, streamBuffer)
        val byteCount = drawFloatCount * 4
        if (byteCount > streamBufferBytes) {
            var newBytes = if (streamBufferBytes == 0) byteCount else streamBufferBytes * 2
            while (newBytes < byteCount) newBytes *= 2
            streamBufferBytes = newBytes
        }
        // Orphan the previous contents (rather than reallocating the store) so the driver need not
        // stall on draws still reading the buffer from earlier flushes this frame.
        gl.bufferData(WebGL2RenderingContext.ARRAY_BUFFER, streamBufferBytes, WebGL2RenderingContext.STREAM_DRAW)
        gl.bufferSubData(WebGL2RenderingContext.ARRAY_BUFFER, 0, view)

        val stride = FLOATS_PER_VERTEX * 4
        gl.enableVertexAttribArray(ATTRIB_POSITION)
        gl.vertexAttribPointer(ATTRIB_POSITION, 3, WebGL2RenderingContext.FLOAT, false, stride, 0)
        gl.enableVertexAttribArray(ATTRIB_COLOR)
        gl.vertexAttribPointer(ATTRIB_COLOR, 4, WebGL2RenderingContext.FLOAT, false, stride, OFFSET_COLOR * 4)
        gl.enableVertexAttribArray(ATTRIB_TEXCOORD0)
        gl.vertexAttribPointer(ATTRIB_TEXCOORD0, 3, WebGL2RenderingContext.FLOAT, false, stride, OFFSET_TEXCOORD0 * 4)
        gl.enableVertexAttribArray(ATTRIB_NORMAL)
        gl.vertexAttribPointer(ATTRIB_NORMAL, 3, WebGL2RenderingContext.FLOAT, false, stride, OFFSET_NORMAL * 4)
        gl.enableVertexAttribArray(ATTRIB_TEXCOORD1)
        gl.vertexAttribPointer(ATTRIB_TEXCOORD1, 3, WebGL2RenderingContext.FLOAT, false, stride, OFFSET_TEXCOORD1 * 4)

        if (indexCount > 0) {
            ensureIndices(mode, count)
            state.prepareDraw()
            gl.bindBuffer(WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, indexBuffer)
            gl.drawElements(
                WebGL2RenderingContext.TRIANGLES, indexCount, WebGL2RenderingContext.UNSIGNED_INT, 0
            )
            gl.bindBuffer(WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, state.boundElementArrayBuffer)
        } else {
            state.prepareDraw()
            if (disableCull) gl.disable(GL_CULL_FACE)
            gl.drawArrays(drawMode, 0, drawCount)
            if (disableCull) gl.enable(GL_CULL_FACE)
        }

        gl.bindBuffer(WebGL2RenderingContext.ARRAY_BUFFER, state.boundArrayBuffer)
    }

    /**
     * Lines drawn to the window at an interface scale above 1. WebGL caps line width at 1, so a
     * 1px interface line would cover only one of the N physical rows of its logical pixel, leaving
     * gaps between borders and fills and half-drawn shadows. Rebuilds each segment as a quad
     * covering exactly the logical pixels GL's diamond-exit rule would have lit (one per column
     * for an x-major line, one per row for a y-major one, the last pixel excluded), so it
     * rasterises N physical pixels thick.
     *
     * Needs [loadWindowTransform]. Returns the number of triangle vertices written to
     * [lineVertices], or 0 when no segment covers a pixel.
     */
    private fun expandLines(count: Int): Int {
        val half = maxOf(OpenGL.lineWidth, 1f) / 2f

        val segments = when (mode) {
            GL_LINES -> count / 2
            GL_LINE_STRIP -> count - 1
            else -> if (count >= 2) count else 0
        }
        val required = segments * 6 * FLOATS_PER_VERTEX
        if (lineVertices.size < required) lineVertices = FloatArray(required)
        var written = 0
        val cornerX = FloatArray(4)
        val cornerY = FloatArray(4)
        val cornerT = FloatArray(4)
        for (segment in 0 until segments) {
            val a = if (mode == GL_LINES) segment * 2 else segment
            val b = if (mode == GL_LINES) a + 1 else (segment + 1) % count
            val aBase = a * FLOATS_PER_VERTEX
            val bBase = b * FLOATS_PER_VERTEX
            val axObj = vertices[aBase]
            val ayObj = vertices[aBase + 1]
            val azObj = vertices[aBase + 2]
            val ax = (m[0] * axObj + m[4] * ayObj + m[8] * azObj + m[12]) * sx + ox
            val ay = (m[1] * axObj + m[5] * ayObj + m[9] * azObj + m[13]) * sy + oy
            val bxObj = vertices[bBase]
            val byObj = vertices[bBase + 1]
            val bzObj = vertices[bBase + 2]
            val bx = (m[0] * bxObj + m[4] * byObj + m[8] * bzObj + m[12]) * sx + ox
            val by = (m[1] * bxObj + m[5] * byObj + m[9] * bzObj + m[13]) * sy + oy
            val dx = bx - ax
            val dy = by - ay
            if (abs(dx) >= abs(dy)) {
                if (dx == 0f) continue
                val xs = if (dx > 0) floor(ax) else floor(ax) + 1
                val xe = if (dx > 0) floor(bx) else floor(bx) + 1
                if (xs == xe) continue
                val slope = dy / dx
                val centre = floor(ay) + 0.5f
                val ys = centre + (xs - ax) * slope
                val ye = centre + (xe - ax) * slope
                cornerX[0] = xs; cornerY[0] = ys - half
                cornerX[1] = xs; cornerY[1] = ys + half
                cornerX[2] = xe; cornerY[2] = ye + half
                cornerX[3] = xe; cornerY[3] = ye - half
                val ts = (xs - ax) / dx
                val te = (xe - ax) / dx
                cornerT[0] = ts; cornerT[1] = ts; cornerT[2] = te; cornerT[3] = te
            } else {
                val ys = if (dy > 0) floor(ay) else floor(ay) + 1
                val ye = if (dy > 0) floor(by) else floor(by) + 1
                if (ys == ye) continue
                val slope = dx / dy
                val centre = floor(ax) + 0.5f
                val xs = centre + (ys - ay) * slope
                val xe = centre + (ye - ay) * slope
                cornerX[0] = xs - half; cornerY[0] = ys
                cornerX[1] = xs + half; cornerY[1] = ys
                cornerX[2] = xe + half; cornerY[2] = ye
                cornerX[3] = xe - half; cornerY[3] = ye
                val ts = (ys - ay) / dy
                val te = (ye - ay) / dy
                cornerT[0] = ts; cornerT[1] = ts; cornerT[2] = te; cornerT[3] = te
            }
            for (corner in QUAD_TRIANGLES) {
                val t = cornerT[corner]
                val out = written * FLOATS_PER_VERTEX
                for (f in 0 until FLOATS_PER_VERTEX) {
                    val from = vertices[aBase + f]
                    lineVertices[out + f] = from + (vertices[bBase + f] - from) * t
                }
                val wx = cornerX[corner] - ax
                val wy = cornerY[corner] - ay
                lineVertices[out] = axObj + (j11 * wx - j01 * wy) / det
                lineVertices[out + 1] = ayObj + (j00 * wy - j10 * wx) / det
                lineVertices[out + 2] = azObj
                written++
            }
        }
        return written
    }

    /**
     * Loads the object -> logical window transform for this draw. Only affine (orthographic)
     * transforms through the fixed-function path qualify, which is what all 2D drawing uses; the
     * 3D scene (perspective) and shader passes are left alone. False when the draw doesn't qualify.
     */
    private fun loadWindowTransform(): Boolean {
        if (state.vertexProgramEnabled || state.boundProgramObj != null) return false
        val mvp = state.matrixStack.mvp()
        if (mvp[3] != 0f || mvp[7] != 0f || mvp[11] != 0f || mvp[15] == 0f) return false
        m = mvp
        sx = OpenGL.viewportW / 2f / mvp[15]
        sy = OpenGL.viewportH / 2f / mvp[15]
        ox = OpenGL.viewportX + OpenGL.viewportW / 2f
        oy = OpenGL.viewportY + OpenGL.viewportH / 2f
        j00 = mvp[0] * sx
        j01 = mvp[4] * sx
        j10 = mvp[1] * sy
        j11 = mvp[5] * sy
        det = j00 * j11 - j01 * j10
        return det != 0f && !det.isNaN()
    }

    /**
     * Filled 2D geometry drawn to the window at an interface scale above 1. The client offsets
     * much of its 2D drawing by a fraction of a pixel (fillRect draws its quad at x + 0.35), which
     * at 1x still covers exactly the intended pixels because coverage is decided at pixel centres.
     * Scaled up N times, the same edge lands at N*x + 0.35*N, past the centre of the first
     * physical pixel, so fills shift a physical pixel right/down relative to sprites drawn at
     * integer positions - gaps between a menu's header and its options, fills overlapping a
     * border's shadow, seams between adjacent sprites. Snapping every vertex to the logical pixel
     * edge that 1x rasterisation would have used, ceil(x - 0.5), reproduces 1x coverage exactly,
     * N physical pixels per logical one. Needs [loadWindowTransform].
     */
    private fun snapToPixelGrid(count: Int) {
        for (v in 0 until count) {
            val base = v * FLOATS_PER_VERTEX
            val px = vertices[base]
            val py = vertices[base + 1]
            val pz = vertices[base + 2]
            val wx = (m[0] * px + m[4] * py + m[8] * pz + m[12]) * sx + ox
            val wy = (m[1] * px + m[5] * py + m[9] * pz + m[13]) * sy + oy
            val dx = ceil(wx - 0.5f) - wx
            val dy = ceil(wy - 0.5f) - wy
            vertices[base] = px + (j11 * dx - j01 * dy) / det
            vertices[base + 1] = py + (j00 * dy - j10 * dx) / det
        }
    }

    /** Triangle indices needed to draw [verts] vertices as [mode], or 0 if [mode] draws directly. */
    private fun indexCountFor(mode: Int, verts: Int): Int = when (mode) {
        // Trailing vertices that don't complete a quad are dropped, matching GL.
        GL_QUADS -> verts / 4 * 6
        GL_QUAD_STRIP -> if (verts >= 4) (verts - 2) / 2 * 6 else 0
        else -> 0
    }

    /**
     * Ensures [indexBuffer] holds indices covering at least [verts] vertices drawn as [mode].
     * Quad n only references vertices in its own span, so a shorter batch can draw a prefix of a
     * buffer built for a longer one.
     */
    private fun ensureIndices(mode: Int, verts: Int) {
        if (mode == indexBufferMode && verts <= indexBufferVertexSpan) return
        var span = if (mode == indexBufferMode) {
            maxOf(indexBufferVertexSpan, INITIAL_INDEX_VERTEX_SPAN)
        } else {
            INITIAL_INDEX_VERTEX_SPAN
        }
        while (span < verts) span *= 2

        val total = indexCountFor(mode, span)
        if (total > indexScratch.size) indexScratch = IntArray(total)
        var out = 0
        var i = 0
        if (mode == GL_QUADS) {
            while (i + 4 <= span) {
                indexScratch[out++] = i; indexScratch[out++] = i + 1; indexScratch[out++] = i + 2
                indexScratch[out++] = i; indexScratch[out++] = i + 2; indexScratch[out++] = i + 3
                i += 4
            }
        } else {
            // A quad strip's nth quad is (v[2n], v[2n+1], v[2n+3], v[2n+2]) - the last two are
            // swapped relative to GL_QUADS, so the fan from v[2n] runs 0,1,3 then 0,3,2.
            while (i + 4 <= span) {
                indexScratch[out++] = i; indexScratch[out++] = i + 1; indexScratch[out++] = i + 3
                indexScratch[out++] = i; indexScratch[out++] = i + 3; indexScratch[out++] = i + 2
                i += 2
            }
        }

        gl.bindBuffer(WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, indexBuffer)
        gl.bufferData(
            WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER,
            indexScratch.asUint32ArrayView(out),
            WebGL2RenderingContext.STATIC_DRAW
        )
        indexBufferMode = mode
        indexBufferVertexSpan = span
    }

    private fun ensureVertexCapacity(required: Int) {
        if (required <= vertices.size) return
        var newSize = vertices.size * 2
        while (newSize < required) newSize *= 2
        vertices = vertices.copyOf(newSize)
    }
}
