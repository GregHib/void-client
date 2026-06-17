/* Class19 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WorldListEntry {
    @JvmField
    var aString306: String? = null
    @JvmField
    var anInt308: Int = 0
    @JvmField
    var aByte310: Byte = 0
    var aString312: String? = null
    @JvmField
    var aString313: String? = null
    @JvmField
    var aString314: String? = null

    companion object {
        @JvmField
        var aIntRange_304: IntRange?
        @JvmField
        var anInt305: Int = 0
        @JvmField
        var anInt307: Int = 0
        @JvmField
        var anInt309: Int = 0
        @JvmField
        var aSpotAnimVectorArray311s: Array<SpotAnimVector?>? = arrayOfNulls<SpotAnimVector>(16)
        var aIntRange_315: IntRange?

        fun method283(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
            var class318_sub5 = NpcDefinition.aClass243_2957!!.method1872(8) as Class318_Sub5?
            while (class318_sub5 != null) {
                if (class318_sub5.anInt6421 <= Class367_Sub11.anInt7396) class318_sub5.method2373(false)
                else {
                    Class318_Sub5.method2505(i_0_ shr 1, class318_sub5.anInt6420 * 2, 0, i_5_, i_2_ shr 1, class318_sub5.anInt6418, 256 + (class318_sub5.anInt6422 shl 9), i_1_, (class318_sub5.anInt6419 shl 9) + 256)
                    Class262.aClass324_3326!!.method2575(122.toByte(), i_3_ - -Class239_Sub21.anIntArray6062!![0], 0xffffff.inv() or class318_sub5.anInt6415, class318_sub5.aString6416, 0, i_4_ - -Class239_Sub21.anIntArray6062!![1])
                }
                class318_sub5 = (NpcDefinition.aClass243_2957!!.method1878(0.toByte()) as Class318_Sub5?)
            }
            anInt305++
            if (i >= -108) aIntRange_304 = null
        }

        @JvmStatic
        fun method284(i: Byte) {
            aIntRange_315 = null
            aIntRange_304 = null
            if (i.toInt() == 51) aSpotAnimVectorArray311s = null
        }

        @JvmStatic
        fun method285(i: Int): Array<ProjectileFactory?> {
            anInt309++
            return (arrayOf<ProjectileFactory?>(ModelDefinitionCache.aProjectileFactory_2868, Class348_Sub49.aProjectileFactory_7175, Class313.aProjectileFactory_3934, MapSceneDefLoader.aProjectileFactory_2489, MatrixCameraTransform.aProjectileFactory_5689, Class348_Sub40_Sub21.aProjectileFactory_9274, Class28.aProjectileFactory_4997, SpotAnimVector.aProjectileFactory_2307, OrientationRotator.aProjectileFactory_2045, LocTypeDefLoader.aProjectileFactory_2507))
        }

        @JvmStatic
        fun method286(i: Byte, class297: Class297): Array<Class57?> {
            anInt307++
            if (!class297.method2247(-4)) return arrayOfNulls<Class57>(0)
            val i_6_ = 52 / ((39 - i) / 61)
            val class144 = class297.method2240(972476528)
            while (class144!!.anInt1997 == 0) Class286_Sub5.method2161((-97).toByte(), 10L)
            if (class144.anInt1997 == 2) return arrayOfNulls<Class57>(0)
            val `is` = class144.anObject1998 as IntArray
            val class57s = arrayOfNulls<Class57>(`is`.size shr 2)
            var i_7_ = 0
            while (class57s.size > i_7_) {
                val class57 = Class57()
                class57s[i_7_] = class57
                class57.anInt1047 = `is`[i_7_ shl 2]
                class57.anInt1054 = `is`[1 + (i_7_ shl 2)]
                class57.anInt1046 = `is`[2 + (i_7_ shl 2)]
                class57.anInt1052 = `is`[(i_7_ shl 2) + 3]
                i_7_++
            }
            return class57s
        }

        init {
            aIntRange_304 = IntRange(70, -2)
            aIntRange_315 = IntRange(15, 16)
        }
    }
}
