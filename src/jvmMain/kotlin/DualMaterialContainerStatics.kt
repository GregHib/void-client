object DualMaterialContainerStatics {
    @JvmField
            var anInt1631: Int = 0
            @JvmField
            var anInt1632: Int = 0
            @JvmField
            var anInt1634: Int = 0
            @JvmField
            var anIntArray1635: IntArray? = IntArray(16)
            var anIntArray1636: IntArray? = null
            @JvmField
            var anIntArrayArray1638: Array<IntArray>? = arrayOf(intArrayOf(0, 1, 2, 3), intArrayOf(1, -1, -1, 0), intArrayOf(-1, 2, -1, 0), intArrayOf(-1, 0, -1, 2), intArrayOf(0, 1, -1, 2), intArrayOf(1, 2, -1, 0), intArrayOf(-1, 4, -1, 1), intArrayOf(-1, 3, 4, -1), intArrayOf(-1, 0, 2, -1), intArrayOf(-1, -1, 2, 0), intArrayOf(0, 2, 5, 3), intArrayOf(0, -1, 6, -1), intArrayOf(0, 1, 2, 3))
            @JvmField
            var anInt1639: Int = 0
            @JvmField
            var anInt1640: Int = 0
            @JvmStatic
            fun method999(i: Int) {
                anIntArray1636 = null
                anIntArray1635 = null
                anIntArrayArray1638 = null
            }
    
            @JvmStatic
            fun method1001(js5Archive: Js5Archive, i: Int) {
                anInt1634++
                ConnectionStateTypeStatics.anInt1044 = js5Archive.method417("p11_full", i)
                WidgetDefinitionStatics.anInt235 = js5Archive.method417("p12_full", i)
                CutsceneSequenceDataStatics.anInt3736 = js5Archive.method417("b12_full", 0)
            }
}
