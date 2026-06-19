object MapSceneDefLoaderStatics {
    var anInt2481: Int = 0
            @JvmField
            var anInt2482: Int = 0
            var aIntRange_2483: IntRange?
            var anInt2484: Int = 0
            var anInt2485: Int = 0
            var anInt2486: Int = 0
            var anInt2487: Int = 0
            var aCharArray2488: CharArray? = charArrayOf(
                ' ',
                '\u00a0',
                '_',
                '-',
                '\u00e0',
                '\u00e1',
                '\u00e2',
                '\u00e4',
                '\u00e3',
                '\u00c0',
                '\u00c1',
                '\u00c2',
                '\u00c4',
                '\u00c3',
                '\u00e8',
                '\u00e9',
                '\u00ea',
                '\u00eb',
                '\u00c8',
                '\u00c9',
                '\u00ca',
                '\u00cb',
                '\u00ed',
                '\u00ee',
                '\u00ef',
                '\u00cd',
                '\u00ce',
                '\u00cf',
                '\u00f2',
                '\u00f3',
                '\u00f4',
                '\u00f6',
                '\u00f5',
                '\u00d2',
                '\u00d3',
                '\u00d4',
                '\u00d6',
                '\u00d5',
                '\u00f9',
                '\u00fa',
                '\u00fb',
                '\u00fc',
                '\u00d9',
                '\u00da',
                '\u00db',
                '\u00dc',
                '\u00e7',
                '\u00c7',
                '\u00ff',
                '\u0178',
                '\u00f1',
                '\u00d1',
                '\u00df'
            )
            @JvmField
            var aProjectileFactory_2489: ProjectileFactory?
    
            @JvmStatic
            fun method1394(i: Int, i_5_: Int, i_6_: Int) {
                val bool = (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![0]!![i_5_]!![i_6_] != null && HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![0]!![i_5_]!![i_6_]!!.aSceneCollisionEntry_4400 != null)
                for (i_7_ in i downTo 0) {
                    if (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i_7_]!![i_5_]!![i_6_] == null) {
                        val sceneCollisionEntry = (SceneCollisionEntry(i_7_).also { HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i_7_]!![i_5_]!![i_6_] = it })
                        if (bool) sceneCollisionEntry.aByte4399++
                    }
                }
            }
    
            @JvmStatic
            fun method1395(i: Byte) {
                aIntRange_2483 = null
                aCharArray2488 = null
                aProjectileFactory_2489 = null
                if (i.toInt() != 82) method1394(120, -36, -100)
            }
    
            init {
                aIntRange_2483 = IntRange(47, 6)
                aProjectileFactory_2489 = ProjectileFactory(3, 2)
            }
}
