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
        var aSpriteMaskShape_4073: SpriteMaskShape? = SpriteMaskShape(0, 3, MovementDirection.aMovementDirection_1187)
        var aSpriteMaskShape_4075: SpriteMaskShape? = SpriteMaskShape(1, 3, MovementDirection.aMovementDirection_1187)
        var aSpriteMaskShape_4076: SpriteMaskShape? = SpriteMaskShape(2, 4, MovementDirection.aMovementDirection_1183)
        var aSpriteMaskShape_4077: SpriteMaskShape? = SpriteMaskShape(3, 1, MovementDirection.aMovementDirection_1187)
        var aSpriteMaskShape_4078: SpriteMaskShape? = SpriteMaskShape(4, 2, MovementDirection.aMovementDirection_1187)
        var aSpriteMaskShape_4079: SpriteMaskShape? = SpriteMaskShape(5, 3, MovementDirection.aMovementDirection_1187)
        var aSpriteMaskShape_4080: SpriteMaskShape? = SpriteMaskShape(6, 4, MovementDirection.aMovementDirection_1187)


        var aRectangleRegion_4082: RectangleRegion? = RectangleRegion(8, 0, 4, 1)

        @JvmStatic
        fun method2597(i: Int) {
            aSpriteMaskShape_4073 = null
            aSpriteMaskShape_4080 = null
            aSpriteMaskShape_4078 = null
            aRectangleRegion_4082 = null
            aSpriteMaskShape_4077 = null
            aSpriteMaskShape_4079 = null
            if (i == -27327) {
                aSpriteMaskShape_4076 = null
                aSpriteMaskShape_4075 = null
            }
        }
    }
}