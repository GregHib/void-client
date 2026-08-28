package jaggl

const val GL_QUADS = 7
const val GL_QUAD_STRIP = 8
const val GL_POLYGON = 9

private const val FLOATS_PER_VERTEX = 15

class ImmediateModeEmulator(private val gl: WebGL2RenderingContext, private val state: GlState) {
    private var active = false
    private var mode = 0
    private val vertices = ArrayList<Float>()
    private var vertexCount = 0
    private val streamBuffer: WebGLBuffer = gl.createBuffer()!!

    fun begin(mode: Int) {
        active = true
        this.mode = mode
        vertices.clear()
        vertexCount = 0
    }

    fun vertex(x: Float, y: Float, z: Float) {
        if (!active) return
        vertices.add(x); vertices.add(y); vertices.add(z)
        vertices.add(state.currentColor[0]); vertices.add(state.currentColor[1])
        vertices.add(state.currentColor[2]); vertices.add(state.currentColor[3])
        vertices.add(state.currentTexCoord[0]); vertices.add(state.currentTexCoord[1])
        vertices.add(state.currentNormal[0]); vertices.add(state.currentNormal[1]); vertices.add(state.currentNormal[2])
        vertices.add(state.currentTexCoord1[0]); vertices.add(state.currentTexCoord1[1])
        vertices.add(state.currentTexCoord1[2])
        vertexCount++
    }

    fun end() {
        active = false
        if (vertexCount == 0) return

        var drawMode = mode
        var data = vertices
        var count = vertexCount

        if (mode == GL_QUADS) {
            val expanded = ArrayList<Float>(vertexCount / 4 * 6 * FLOATS_PER_VERTEX)
            var i = 0
            while (i + 4 <= vertexCount) {
                val base = i * FLOATS_PER_VERTEX
                appendVertex(expanded, base)
                appendVertex(expanded, base + FLOATS_PER_VERTEX)
                appendVertex(expanded, base + 2 * FLOATS_PER_VERTEX)
                appendVertex(expanded, base)
                appendVertex(expanded, base + 2 * FLOATS_PER_VERTEX)
                appendVertex(expanded, base + 3 * FLOATS_PER_VERTEX)
                i += 4
            }
            data = expanded
            drawMode = WebGL2RenderingContext.TRIANGLES
            count = expanded.size / FLOATS_PER_VERTEX
        } else if (mode == GL_QUAD_STRIP) {
            val expanded = ArrayList<Float>(vertexCount / 2 * 3 * FLOATS_PER_VERTEX)
            var i = 0
            while (i + 4 <= vertexCount) {
                val base = i * FLOATS_PER_VERTEX
                appendVertex(expanded, base)
                appendVertex(expanded, base + FLOATS_PER_VERTEX)
                appendVertex(expanded, base + 3 * FLOATS_PER_VERTEX)
                appendVertex(expanded, base)
                appendVertex(expanded, base + 3 * FLOATS_PER_VERTEX)
                appendVertex(expanded, base + 2 * FLOATS_PER_VERTEX)
                i += 2
            }
            data = expanded
            drawMode = WebGL2RenderingContext.TRIANGLES
            count = expanded.size / FLOATS_PER_VERTEX
        } else if (mode == GL_POLYGON) {
            drawMode = WebGL2RenderingContext.TRIANGLE_FAN
        }

        val array = data.toFloatArray()
        gl.bindBuffer(WebGL2RenderingContext.ARRAY_BUFFER, streamBuffer)
        gl.bufferData(WebGL2RenderingContext.ARRAY_BUFFER, array.asFloat32Array(), WebGL2RenderingContext.STREAM_DRAW)

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

    private fun appendVertex(dest: ArrayList<Float>, base: Int) {
        for (k in 0 until FLOATS_PER_VERTEX) dest.add(vertices[base + k])
    }
}
