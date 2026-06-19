import MovementDirection

object MovementDirectionStatics {
    var aMovementDirection_1179: MovementDirection? = MovementDirection(1)
            @JvmField
            var anInt1180: Int = 0
            var aMovementDirection_1181: MovementDirection? = MovementDirection(2)
            var aMovementDirection_1182: MovementDirection? = MovementDirection(4)
            @JvmField
            var aMovementDirection_1183: MovementDirection? = MovementDirection(1)
            @JvmField
            var aMovementDirection_1184: MovementDirection? = MovementDirection(2)
            var aMovementDirection_1185: MovementDirection? = MovementDirection(4)
            var aMovementDirection_1186: MovementDirection? = MovementDirection(2)
            @JvmField
            var aMovementDirection_1187: MovementDirection? = MovementDirection(4)
            var anInt1188: Int = 0
            @JvmField
            var aHudTabPanel_1189: HudTabPanel?
            @JvmField
            var anIntArrayArray1190: Array<IntArray?>? = arrayOf<IntArray?>(intArrayOf(2, 4), intArrayOf(2, 4), intArrayOf(5, 2, 4), intArrayOf(4, 5, 2), intArrayOf(2, 4, 5), intArrayOf(5, 2, 4), intArrayOf(1, 6, 2, 5), intArrayOf(1, 6, 7, 1), intArrayOf(6, 7, 1, 1), intArrayOf(0, 8, 9, 8, 9, 4), intArrayOf(8, 9, 4, 0, 8, 9), intArrayOf(2, 10, 0, 10, 11, 11), intArrayOf(2, 4), intArrayOf(1, 6, 7, 1), intArrayOf(1, 6, 7, 1))
    
            @JvmStatic
            fun method719(i: Byte) {
                aMovementDirection_1183 = null
                aMovementDirection_1184 = null
                aMovementDirection_1181 = null
                if (i.toInt() == 72) {
                    aMovementDirection_1182 = null
                    anIntArrayArray1190 = null
                    aMovementDirection_1187 = null
                    aHudTabPanel_1189 = null
                    aMovementDirection_1179 = null
                    aMovementDirection_1186 = null
                    aMovementDirection_1185 = null
                }
            }
    
            init {
                aHudTabPanel_1189 = HudTabPanel("LIVE", 0)
            }
}
