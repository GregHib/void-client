package jaggl

const val GL_QUADS = 7
const val GL_QUAD_STRIP = 8
const val GL_POLYGON = 9

private const val FLOATS_PER_VERTEX = 15
private const val INITIAL_VERTEX_CAPACITY = 256 * FLOATS_PER_VERTEX

class ImmediateModeEmulator(private val gl: WebGL2RenderingContext, private val state: GlState) {
    private var active = false
    private var mode = 0

    // Raw per-vertex float storage, grown by doubling as needed. Backed by a primitive FloatArray
    // (not ArrayList<Float>) so glVertex/glColor/glTexCoord - potentially thousands of calls per
    // frame for any surviving immediate-mode drawing - don't box every float into a wrapper object.
    private var vertices = FloatArray(INITIAL_VERTEX_CAPACITY)
    private var vertexFloatCount = 0
    private var vertexCount = 0

    // Scratch buffer for GL_QUADS/GL_QUAD_STRIP triangle-fan expansion, reused/grown across end()
    // calls instead of allocating a fresh ArrayList<Float> every flush.
    private var expanded = FloatArray(0)

    private val streamBuffer: WebGLBuffer = gl.createBuffer()!!

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
        vertices[i++] = state.currentNormal[0]; vertices[i++] = state.currentNormal[1]; vertices[i++] = state.currentNormal[2]
        vertices[i++] = state.currentTexCoord1[0]; vertices[i++] = state.currentTexCoord1[1]
        vertices[i++] = state.currentTexCoord1[2]
        vertexFloatCount = i
        vertexCount++
    }

    fun end() {
        active = false
        if (vertexCount == 0) return

        var drawMode = mode
        var data = vertices
        var count = vertexCount
        var floatCount = vertexFloatCount

        if (mode == GL_QUADS) {
            ensureExpandedCapacity(vertexCount / 4 * 6 * FLOATS_PER_VERTEX)
            var out = 0
            var i = 0
            while (i + 4 <= vertexCount) {
                val base = i * FLOATS_PER_VERTEX
                out = appendVertex(out, base)
                out = appendVertex(out, base + FLOATS_PER_VERTEX)
                out = appendVertex(out, base + 2 * FLOATS_PER_VERTEX)
                out = appendVertex(out, base)
                out = appendVertex(out, base + 2 * FLOATS_PER_VERTEX)
                out = appendVertex(out, base + 3 * FLOATS_PER_VERTEX)
                i += 4
            }
            data = expanded
            drawMode = WebGL2RenderingContext.TRIANGLES
            floatCount = out
            count = out / FLOATS_PER_VERTEX
        } else if (mode == GL_QUAD_STRIP) {
            ensureExpandedCapacity(vertexCount / 2 * 3 * FLOATS_PER_VERTEX)
            var out = 0
            var i = 0
            while (i + 4 <= vertexCount) {
                val base = i * FLOATS_PER_VERTEX
                out = appendVertex(out, base)
                out = appendVertex(out, base + FLOATS_PER_VERTEX)
                out = appendVertex(out, base + 3 * FLOATS_PER_VERTEX)
                out = appendVertex(out, base)
                out = appendVertex(out, base + 3 * FLOATS_PER_VERTEX)
                out = appendVertex(out, base + 2 * FLOATS_PER_VERTEX)
                i += 2
            }
            data = expanded
            drawMode = WebGL2RenderingContext.TRIANGLES
            floatCount = out
            count = out / FLOATS_PER_VERTEX
        } else if (mode == GL_POLYGON) {
            drawMode = WebGL2RenderingContext.TRIANGLE_FAN
        }

        val view = data.asFloat32Array().subarray(0, floatCount)
        gl.bindBuffer(WebGL2RenderingContext.ARRAY_BUFFER, streamBuffer)
        gl.bufferData(WebGL2RenderingContext.ARRAY_BUFFER, view, WebGL2RenderingContext.STREAM_DRAW)

        val stride = FLOATS_PER_VERTEX * 4
        gl.enableVertexAttribArray(ATTRIB_POSITION)
        gl.vertexAttribPointer(ATTRIB_POSITION, 3, WebGL2RenderingContext.FLOAT, false, stride, 0)
        gl.enableVertexAttribArray(ATTRIB_COLOR)
        gl.vertexAttribPointer(ATTRIB_COLOR, 4, WebGL2RenderingContext.FLOAT, false, stride, 3 * 4)
        gl.enableVertexAttribArray(ATTRIB_TEXCOORD0)
        gl.vertexAttribPointer(ATTRIB_TEXCOORD0, 2, WebGL2RenderingContext.FLOAT, false, stride, 7 * 4)
        gl.enableVertexAttribArray(ATTRIB_NORMAL)
        gl.vertexAttribPointer(ATTRIB_NORMAL, 3, WebGL2RenderingContext.FLOAT, false, stride, 9 * 4)
        gl.enableVertexAttribArray(ATTRIB_TEXCOORD1)
        gl.vertexAttribPointer(ATTRIB_TEXCOORD1, 3, WebGL2RenderingContext.FLOAT, false, stride, 12 * 4)

        state.prepareDraw()
        gl.drawArrays(drawMode, 0, count)

        gl.bindBuffer(WebGL2RenderingContext.ARRAY_BUFFER, state.boundArrayBuffer)
    }

    private fun ensureVertexCapacity(required: Int) {
        if (required <= vertices.size) return
        var newSize = vertices.size * 2
        while (newSize < required) newSize *= 2
        vertices = vertices.copyOf(newSize)
    }

    private fun ensureExpandedCapacity(required: Int) {
        if (required <= expanded.size) return
        var newSize = if (expanded.isEmpty()) required else expanded.size * 2
        while (newSize < required) newSize *= 2
        expanded = FloatArray(newSize)
    }

    private fun appendVertex(destOffset: Int, srcBase: Int): Int {
        for (k in 0 until FLOATS_PER_VERTEX) expanded[destOffset + k] = vertices[srcBase + k]
        return destOffset + FLOATS_PER_VERTEX
    }
}
