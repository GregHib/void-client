/* Class325 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SpriteMaskShape(i: Int, i_78_: Int, movementDirection: MovementDirection?) {
    var anInt4069: Int = 0
    var anInt4070: Int = 0
    private val aMovementDirection_4071: MovementDirection?
    private val anInt4072: Int
    override fun toString(): String {
        anInt4066++
        throw IllegalStateException()
    }

    init {
        try {
            anInt4072 = i_78_
            aMovementDirection_4071 = movementDirection
            this.anInt4070 = i
            this.anInt4069 = aMovementDirection_4071!!.anInt1178 * anInt4072
            if (this.anInt4070 >= 16) throw RuntimeException()
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("daa.<init>(" + i + ',' + i_78_ + ',' + (if (movementDirection != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt4066: Int = 0
    }
}