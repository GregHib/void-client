/* Class106 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class DualMaterialContainer internal constructor(class45: Class45?, class45_0_: Class45?) {
    private var aClass339_1633: Class339? = null
    private val aClass45_1637: Class45?
    private val aClass45_1641: Class45?

    private fun method998(i: Int): Class339 {
        anInt1632++
        if (aClass339_1633 == null) aClass339_1633 = Class339()
        return aClass339_1633!!
    }

    fun method1000(bool: Boolean, interface12: Interface12?): Interface1? {
        anInt1640++
        if (interface12 == null) return null
        val class223 = interface12.method51(120.toByte())
        if (ModelDefinitionCache.aProjectileFactory_2868 == class223) return ClickFeedbackTask(interface12 as Class52)
        if (MatrixCameraTransform.aProjectileFactory_5689 == class223) return WorldMapRenderer(method998(-107), interface12 as MinimapSpriteRenderer)
        if (class223 == Class348_Sub40_Sub21.aProjectileFactory_9274) return WidgetComponentNode(aClass45_1637, interface12 as Class288)
        if (class223 == Class28.aProjectileFactory_4997) return ScrollingWidgetComponentNode(aClass45_1637, interface12 as Class288_Sub1)
        if (class223 == Class348_Sub49.aProjectileFactory_7175) return Class5_Sub2(aClass45_1637!!, aClass45_1641!!, interface12 as Class369_Sub2)
        if (class223 == Class313.aProjectileFactory_3934) return Class5_Sub3(aClass45_1637, aClass45_1641!!, interface12 as Class369_Sub1)
        if (class223 == MapSceneDefLoader.aProjectileFactory_2489) return Class5_Sub1(aClass45_1637!!, aClass45_1641!!, interface12 as Class369_Sub3)
        if (class223 == SpotAnimVector.aProjectileFactory_2307) return Class67(aClass45_1637, aClass45_1641, interface12 as HeapInfoRecord)
        if (bool != true) anIntArray1636 = null
        if (OrientationRotator.aProjectileFactory_2045 == class223) return SplashImageLoadable(aClass45_1637, interface12 as ConfigValueProvider)
        if (LocTypeDefLoader.aProjectileFactory_2507 == class223) return Class5_Sub1_Sub1(aClass45_1637!!, aClass45_1641!!, interface12 as Class369_Sub3_Sub1)
        return null
    }

    init {
        try {
            aClass45_1637 = class45
            aClass45_1641 = class45_0_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("mia.<init>(" + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_0_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
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
        fun method1001(class45: Class45, i: Int) {
            anInt1634++
            Class56.anInt1044 = class45.method417("p11_full", i)
            WidgetDefinition.anInt235 = class45.method417("p12_full", i)
            Class291.anInt3736 = class45.method417("b12_full", 0)
        }
    }
}
