package jaggl

const val GL_MODELVIEW = 5888
const val GL_PROJECTION = 5889
const val GL_TEXTURE_MATRIX = 5890

object Mat4 {
    fun identity(): FloatArray = floatArrayOf(
        1f, 0f, 0f, 0f,
        0f, 1f, 0f, 0f,
        0f, 0f, 1f, 0f,
        0f, 0f, 0f, 1f
    )

    fun multiply(a: FloatArray, b: FloatArray): FloatArray {
        val r = FloatArray(16)
        for (col in 0 until 4) {
            for (row in 0 until 4) {
                var sum = 0f
                for (k in 0 until 4) {
                    sum += a[k * 4 + row] * b[col * 4 + k]
                }
                r[col * 4 + row] = sum
            }
        }
        return r
    }

    fun translate(x: Float, y: Float, z: Float): FloatArray {
        val m = identity()
        m[12] = x; m[13] = y; m[14] = z
        return m
    }

    fun scale(x: Float, y: Float, z: Float): FloatArray {
        val m = identity()
        m[0] = x; m[5] = y; m[10] = z
        return m
    }

    /**
     * Equivalent to `multiply(a, translate(x, y, z))` but without building the throwaway identity
     * matrix or running the general 4x4 multiply (most of whose terms are known to be zero for a
     * translation) - same arithmetic, same operand order, so results are bit-identical.
     */
    fun translateBy(a: FloatArray, x: Float, y: Float, z: Float): FloatArray {
        val r = a.copyOf()
        r[12] = a[0] * x + a[4] * y + a[8] * z + a[12]
        r[13] = a[1] * x + a[5] * y + a[9] * z + a[13]
        r[14] = a[2] * x + a[6] * y + a[10] * z + a[14]
        r[15] = a[3] * x + a[7] * y + a[11] * z + a[15]
        return r
    }

    /** Equivalent to `multiply(a, scale(x, y, z))`, specialized the same way as [translateBy]. */
    fun scaleBy(a: FloatArray, x: Float, y: Float, z: Float): FloatArray {
        val r = a.copyOf()
        r[0] = a[0] * x; r[1] = a[1] * x; r[2] = a[2] * x; r[3] = a[3] * x
        r[4] = a[4] * y; r[5] = a[5] * y; r[6] = a[6] * y; r[7] = a[7] * y
        r[8] = a[8] * z; r[9] = a[9] * z; r[10] = a[10] * z; r[11] = a[11] * z
        return r
    }

    fun rotate(angleDeg: Float, x: Float, y: Float, z: Float): FloatArray {
        val len = kotlin.math.sqrt(x * x + y * y + z * z)
        if (len == 0f) return identity()
        val nx = x / len; val ny = y / len; val nz = z / len
        val rad = angleDeg * (kotlin.math.PI.toFloat() / 180f)
        val c = kotlin.math.cos(rad); val s = kotlin.math.sin(rad)
        val t = 1f - c
        val m = identity()
        m[0] = t * nx * nx + c
        m[1] = t * nx * ny + s * nz
        m[2] = t * nx * nz - s * ny
        m[4] = t * nx * ny - s * nz
        m[5] = t * ny * ny + c
        m[6] = t * ny * nz + s * nx
        m[8] = t * nx * nz + s * ny
        m[9] = t * ny * nz - s * nx
        m[10] = t * nz * nz + c
        return m
    }

    fun ortho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): FloatArray {
        val m = FloatArray(16)
        m[0] = (2.0 / (right - left)).toFloat()
        m[5] = (2.0 / (top - bottom)).toFloat()
        m[10] = (-2.0 / (far - near)).toFloat()
        m[12] = (-(right + left) / (right - left)).toFloat()
        m[13] = (-(top + bottom) / (top - bottom)).toFloat()
        m[14] = (-(far + near) / (far - near)).toFloat()
        m[15] = 1f
        return m
    }

    fun frustum(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): FloatArray {
        val m = FloatArray(16)
        m[0] = (2.0 * near / (right - left)).toFloat()
        m[5] = (2.0 * near / (top - bottom)).toFloat()
        m[8] = ((right + left) / (right - left)).toFloat()
        m[9] = ((top + bottom) / (top - bottom)).toFloat()
        m[10] = (-(far + near) / (far - near)).toFloat()
        m[11] = -1f
        m[14] = (-(2.0 * far * near) / (far - near)).toFloat()
        return m
    }
}

class MatrixStack {
    private val stacks = HashMap<Int, ArrayDeque<FloatArray>>()
    var mode: Int = GL_MODELVIEW

    var textureUnit: Int = 0

    init {
        stacks[GL_MODELVIEW] = ArrayDeque<FloatArray>().apply { addLast(Mat4.identity()) }
        stacks[GL_PROJECTION] = ArrayDeque<FloatArray>().apply { addLast(Mat4.identity()) }
        stacks[GL_TEXTURE_MATRIX] = ArrayDeque<FloatArray>().apply { addLast(Mat4.identity()) }
    }

    private val versions = HashMap<Int, Int>()

    private fun key(mode: Int): Int = if (mode == GL_TEXTURE_MATRIX) GL_TEXTURE_MATRIX + textureUnit else mode

    private fun current(): ArrayDeque<FloatArray> =
        stacks.getOrPut(key(mode)) { ArrayDeque<FloatArray>().apply { addLast(Mat4.identity()) } }

    private fun bump() {
        val k = key(mode)
        versions[k] = (versions[k] ?: 0) + 1
    }

    fun version(mode: Int, unit: Int = 0): Int =
        versions[if (mode == GL_TEXTURE_MATRIX) mode + unit else mode] ?: 0

    fun top(): FloatArray = current().last()

    private fun setTop(m: FloatArray) {
        val s = current()
        s.removeLast()
        s.addLast(m)
        bump()
    }

    fun push() { current().addLast(top().copyOf()); bump() }
    fun pop() { if (current().size > 1) current().removeLast(); bump() }
    fun loadIdentity() { setTop(Mat4.identity()) }
    fun loadMatrix(m: FloatArray) { setTop(m.copyOf(16)) }
    fun mult(m: FloatArray) { setTop(Mat4.multiply(top(), m)) }
    fun translate(x: Float, y: Float, z: Float) { setTop(Mat4.translateBy(top(), x, y, z)) }
    fun scale(x: Float, y: Float, z: Float) { setTop(Mat4.scaleBy(top(), x, y, z)) }
    fun rotate(a: Float, x: Float, y: Float, z: Float) { mult(Mat4.rotate(a, x, y, z)) }
    fun ortho(l: Double, r: Double, b: Double, t: Double, n: Double, f: Double) { mult(Mat4.ortho(l, r, b, t, n, f)) }
    fun frustum(l: Double, r: Double, b: Double, t: Double, n: Double, f: Double) { mult(Mat4.frustum(l, r, b, t, n, f)) }

    fun modelview(): FloatArray = stacks[GL_MODELVIEW]!!.last()
    fun projection(): FloatArray = stacks[GL_PROJECTION]!!.last()
    fun textureMatrix(unit: Int = 0): FloatArray =
        stacks.getOrPut(GL_TEXTURE_MATRIX + unit) { ArrayDeque<FloatArray>().apply { addLast(Mat4.identity()) } }.last()
    fun mvp(): FloatArray = Mat4.multiply(projection(), modelview())
}
