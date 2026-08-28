package jaggl

import org.khronos.webgl.ArrayBufferView

/**
 * Kotlin/JS's stdlib no longer bundles WebGL context bindings (only the typed-array classes under
 * org.khronos.webgl survived), so the small slice of the WebGL2 API this shim actually calls is
 * declared here by hand as external declarations against the browser's real global objects.
 */
external interface WebGLBuffer
external interface WebGLTexture
external interface WebGLProgram
external interface WebGLShader
external interface WebGLFramebuffer
external interface WebGLRenderbuffer
external interface WebGLUniformLocation

external class WebGL2RenderingContext {
    fun createBuffer(): WebGLBuffer?
    fun bindBuffer(target: Int, buffer: WebGLBuffer?)
    fun bufferData(target: Int, size: Int, usage: Int)
    fun bufferData(target: Int, data: ArrayBufferView, usage: Int)
    fun bufferSubData(target: Int, offset: Int, data: ArrayBufferView)
    fun deleteBuffer(buffer: WebGLBuffer?)

    fun createTexture(): WebGLTexture?
    fun deleteTexture(texture: WebGLTexture?)
    fun bindTexture(target: Int, texture: WebGLTexture?)
    fun texParameteri(target: Int, pname: Int, param: Int)
    fun texParameterf(target: Int, pname: Int, param: Float)
    fun generateMipmap(target: Int)
    fun activeTexture(texture: Int)
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    fun copyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int)
    fun copyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int)
    fun copyTexSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, x: Int, y: Int, width: Int, height: Int)

    fun enableVertexAttribArray(index: Int)
    fun disableVertexAttribArray(index: Int)
    fun vertexAttribPointer(index: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Int)
    fun vertexAttrib2f(index: Int, x: Float, y: Float)
    fun vertexAttrib3f(index: Int, x: Float, y: Float, z: Float)
    fun vertexAttrib4f(index: Int, x: Float, y: Float, z: Float, w: Float)
    fun drawArrays(mode: Int, first: Int, count: Int)
    fun drawElements(mode: Int, count: Int, type: Int, offset: Int)

    fun enable(cap: Int)
    fun disable(cap: Int)
    fun hint(target: Int, mode: Int)
    fun lineWidth(width: Float)
    fun blendFunc(sfactor: Int, dfactor: Int)
    fun depthFunc(func: Int)
    fun depthMask(flag: Boolean)
    fun cullFace(mode: Int)
    fun colorMask(r: Boolean, g: Boolean, b: Boolean, a: Boolean)
    fun scissor(x: Int, y: Int, width: Int, height: Int)
    fun stencilFunc(func: Int, ref: Int, mask: Int)
    fun stencilOp(fail: Int, zfail: Int, zpass: Int)
    fun viewport(x: Int, y: Int, width: Int, height: Int)
    fun clearColor(r: Float, g: Float, b: Float, a: Float)
    fun clearDepth(depth: Float)
    fun clear(mask: Int)
    fun finish()
    fun flush()
    fun getError(): Int
    fun getParameter(pname: Int): Any?
    fun getSupportedExtensions(): Array<String>?
    fun pixelStorei(pname: Int, param: Int)
    fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView)

    fun createFramebuffer(): WebGLFramebuffer?
    fun deleteFramebuffer(framebuffer: WebGLFramebuffer?)
    fun bindFramebuffer(target: Int, framebuffer: WebGLFramebuffer?)
    fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: WebGLTexture?, level: Int)
    fun framebufferTextureLayer(target: Int, attachment: Int, texture: WebGLTexture?, level: Int, layer: Int)
    fun framebufferRenderbuffer(target: Int, attachment: Int, renderbuffertarget: Int, renderbuffer: WebGLRenderbuffer?)
    fun checkFramebufferStatus(target: Int): Int
    fun blitFramebuffer(srcX0: Int, srcY0: Int, srcX1: Int, srcY1: Int, dstX0: Int, dstY0: Int, dstX1: Int, dstY1: Int, mask: Int, filter: Int)
    fun drawBuffers(buffers: Array<Int>)
    fun readBuffer(mode: Int)

    fun createRenderbuffer(): WebGLRenderbuffer?
    fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer?)
    fun bindRenderbuffer(target: Int, renderbuffer: WebGLRenderbuffer?)
    fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int)
    fun renderbufferStorageMultisample(target: Int, samples: Int, internalformat: Int, width: Int, height: Int)

    fun createShader(type: Int): WebGLShader?
    fun shaderSource(shader: WebGLShader, source: String)
    fun compileShader(shader: WebGLShader)
    fun deleteShader(shader: WebGLShader?)
    fun getShaderParameter(shader: WebGLShader, pname: Int): Any?
    fun getShaderInfoLog(shader: WebGLShader): String?

    fun createProgram(): WebGLProgram?
    fun attachShader(program: WebGLProgram, shader: WebGLShader)
    fun detachShader(program: WebGLProgram, shader: WebGLShader)
    fun linkProgram(program: WebGLProgram)
    fun useProgram(program: WebGLProgram?)
    fun deleteProgram(program: WebGLProgram?)
    fun getProgramParameter(program: WebGLProgram, pname: Int): Any?
    fun getProgramInfoLog(program: WebGLProgram): String?
    fun getUniformLocation(program: WebGLProgram, name: String): WebGLUniformLocation?
    fun uniform1i(location: WebGLUniformLocation?, x: Int)
    fun uniform1f(location: WebGLUniformLocation?, x: Float)
    fun uniform2f(location: WebGLUniformLocation?, x: Float, y: Float)
    fun uniform3f(location: WebGLUniformLocation?, x: Float, y: Float, z: Float)
    fun uniform4f(location: WebGLUniformLocation?, x: Float, y: Float, z: Float, w: Float)
    fun uniform3fv(location: WebGLUniformLocation?, value: ArrayBufferView)
    fun uniform4fv(location: WebGLUniformLocation?, value: ArrayBufferView)
    fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, value: ArrayBufferView)
    fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, value: ArrayBufferView)
    fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, value: ArrayBufferView)

    companion object {
        val ARRAY_BUFFER: Int
        val ELEMENT_ARRAY_BUFFER: Int
        val TEXTURE_2D: Int
        val TEXTURE_CUBE_MAP: Int
        val TEXTURE0: Int
        val FLOAT: Int
        val UNSIGNED_BYTE: Int
        val STREAM_DRAW: Int
        val TRIANGLES: Int
        val TRIANGLE_STRIP: Int
        val TRIANGLE_FAN: Int
        val VERTEX_SHADER: Int
        val FRAGMENT_SHADER: Int
        val LINK_STATUS: Int
        val COMPILE_STATUS: Int
        val MAX_TEXTURE_IMAGE_UNITS: Int
        val ALIASED_POINT_SIZE_RANGE: Int
        val RGBA8: Int
        val RGB8: Int
        val R8: Int
        val RG8: Int
        val DEPTH_COMPONENT16: Int
        val DEPTH_COMPONENT24: Int
        val DEPTH24_STENCIL8: Int
        val GENERATE_MIPMAP_HINT: Int
        val FRAGMENT_SHADER_DERIVATIVE_HINT: Int
        val BACK: Int
        val NONE: Int
    }
}
