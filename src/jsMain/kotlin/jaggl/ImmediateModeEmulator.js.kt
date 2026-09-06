package jaggl

const val GL_QUADS = 7
const val GL_QUAD_STRIP = 8
const val GL_POLYGON = 9

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

        val indexCount = indexCountFor(mode, count)
        val drawMode = if (mode == GL_POLYGON) WebGL2RenderingContext.TRIANGLE_FAN else mode
        if (indexCount == 0 && (mode == GL_QUADS || mode == GL_QUAD_STRIP)) return

        val view = vertices.asFloat32Array().subarray(0, floatCount)
        gl.bindBuffer(WebGL2RenderingContext.ARRAY_BUFFER, streamBuffer)
        val byteCount = floatCount * 4
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
            gl.drawArrays(drawMode, 0, count)
        }

        gl.bindBuffer(WebGL2RenderingContext.ARRAY_BUFFER, state.boundArrayBuffer)
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
