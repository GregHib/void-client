/* Class84 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class84 internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aLruByteCache_1449 = LruByteCache(16)
    private val aJs5Archive_1460: Js5Archive?

    fun method816(bool: Boolean) {
        anInt1455++
        synchronized(aLruByteCache_1449) {
            if (bool != false) method819(107.toByte(), 46)
            aLruByteCache_1449.method587(-119)
        }
    }

    fun method819(i: Byte, i_14_: Int) {
        synchronized(aLruByteCache_1449) {
            aLruByteCache_1449.method578(2, i_14_)
        }
        anInt1457++
    }

    private fun method820(i: Int, i_15_: Int): ParticleConfigParser {
        anInt1458++
        var particleConfigParser: ParticleConfigParser?
        synchronized(aLruByteCache_1449) {
            particleConfigParser = aLruByteCache_1449.method583(i.toLong(), 116) as ParticleConfigParser?
        }
        if (particleConfigParser != null) return particleConfigParser!!
        val `is`: ByteArray?
        synchronized(aJs5Archive_1460!!) {
            `is` = aJs5Archive_1460.method410(-1860, i_15_, i)
        }
        particleConfigParser = ParticleConfigParser()
        if (`is` != null) particleConfigParser!!.method2275(Buffer(`is`), (-123).toByte())
        synchronized(aLruByteCache_1449) {
            aLruByteCache_1449.method582(particleConfigParser, i.toLong(), (-106).toByte())
        }
        return particleConfigParser!!
    }

    fun method822(i: Byte) {
        synchronized(aLruByteCache_1449) {
            aLruByteCache_1449.method590(0)
        }
        if (i >= -13) method825(14)
        anInt1452++
    }

    fun method823(i: Int, i_17_: Int, i_18_: Int, i_19_: Int, spriteStore: SpriteStore, i_20_: Int): ParticleSystemRenderer? {
        anInt1453++
        var hintArrowRenderers: Array<HintArrowRenderer?>? = null
        val class300 = method820(i_20_, 29)
        if (i_19_ > -36) return null
        if (class300.anIntArray3821 != null) {
            hintArrowRenderers = arrayOfNulls<HintArrowRenderer>(class300.anIntArray3821!!.size)
            var i_21_ = 0
            while (hintArrowRenderers.size > i_21_) {
                val class38 = spriteStore.method301((class300.anIntArray3821!![i_21_]), 29)
                hintArrowRenderers[i_21_] = HintArrowRenderer(class38.anInt498, class38.anInt504, class38.anInt499, class38.anInt502, class38.anInt508, class38.anInt501, class38.anInt503, class38.aBoolean507)
                i_21_++
            }
        }
        return ParticleSystemRenderer(class300.anInt3817, hintArrowRenderers, class300.anInt3823, i_18_, i, i_17_)
    }

    init {
        try {
            aJs5Archive_1460 = js5Archive
            aJs5Archive_1460!!.method407(0, 29)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("lca.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anIntArray1450: IntArray? = intArrayOf(1, 2, 4, 8)
        @JvmField
        var anInt1451: Int = 0
        @JvmField
        var anInt1452: Int = 0
        @JvmField
        var anInt1453: Int = 0
        @JvmField
        var anInt1454: Int = 0
        @JvmField
        var anInt1455: Int = 0
        @JvmField
        var anInt1456: Int = 0
        @JvmField
        var anInt1457: Int = 0
        @JvmField
        var anInt1458: Int = 0
        @JvmField
        var anInt1459: Int = 0
        @JvmStatic
        fun method817(i: Int, i_0_: Int, i_1_: Int, i_2_: Int): ProjectedGroundDecor? {
            anInt1456++
            val class357 = HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i_1_]!![i_0_]!![i_2_]
            if (class357 == null) return null
            if (i != 252) return null
            var class318_sub1_sub3_sub3: ProjectedGroundDecor? = null
            var i_3_ = -1
            var class148 = class357.aWidgetNodeLink_4396
            while (class148 != null) {
                val class318_sub1_sub3 = class148.aClass318_Sub1_Sub3_2040
                if (class318_sub1_sub3 is ProjectedGroundDecor) {
                    val class318_sub1_sub3_sub3_4_ = class318_sub1_sub3
                    val i_5_ = 252 + (-1 + class318_sub1_sub3_sub3_4_.method2436(88.toByte())) * 256
                    val i_6_ = (-i_5_ + (class318_sub1_sub3_sub3_4_.x) shr 9)
                    val i_7_ = (-i_5_ + (class318_sub1_sub3_sub3_4_.y) shr 9)
                    val i_8_ = i_5_ + (class318_sub1_sub3_sub3_4_.x) shr 9
                    val i_9_ = ((class318_sub1_sub3_sub3_4_.y + i_5_) shr 9)
                    if (i_0_ >= i_6_ && i_7_ <= i_2_ && i_0_ <= i_8_ && i_2_ <= i_9_) {
                        val i_10_ = (1 + i_9_ - i_2_) * (-i_0_ + (1 + i_8_))
                        if (i_3_ < i_10_) {
                            i_3_ = i_10_
                            class318_sub1_sub3_sub3 = class318_sub1_sub3_sub3_4_
                        }
                    }
                }
                class148 = class148.aWidgetNodeLink_2038
            }
            return class318_sub1_sub3_sub3
        }

        fun method818(i: Int, i_11_: Int, i_12_: Int): Int {
            var i = i
            var i_12_ = i_12_
            anInt1451++
            var i_13_ = i_11_
            while (i > 0) {
                i_13_ = i_12_ and 0x1 or (i_13_ shl 1)
                i--
                i_12_ = i_12_ ushr 1
            }
            return i_13_
        }

        @JvmStatic
        fun method821(i: Int) {
            SoundCacheState.aLruByteCache_4139!!.method590(0)
            val i_16_ = -67 / ((i - 39) / 33)
            anInt1459++
        }

        fun method824(i: Int) {
            DelegatingRenderCanvas.anInt67 = i
            for (i_22_ in 0..<SpotAnimEntity.anInt6451) {
                for (i_23_ in 0..<RegionSceneShifter.anInt7054) {
                    if (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_22_]!![i_23_] == null) HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_22_]!![i_23_] = SceneCollisionEntry(i)
                }
            }
        }

        @JvmStatic
        fun method825(i: Int) {
            anIntArray1450 = null
            if (i > -73) anIntArray1450 = null
        }

        @JvmStatic
        fun method826(i: Int, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int, i_28_: Int, var_renderer: Renderer) {
            if ((SpotAnimVector.aAbstractModelRenderer_2309 == null || TimedTileQueueEntry.aAbstractModelRenderer_9658 == null || TimedTileQueueEntry.aAbstractModelRenderer_9659 == null) && CameraRotationStub.aJs5Archive_322!!.method421(false, ProjectedGroundDecor.anInt10257) && CameraRotationStub.aJs5Archive_322!!.method421(false, SkyboxGradient.anInt3937) && CameraRotationStub.aJs5Archive_322!!.method421(false, Class79.Companion.anInt1387)) {
                val spriteImage = SpriteImage.method1521(CameraRotationStub.aJs5Archive_322!!, SkyboxGradient.anInt3937, 0)
                TimedTileQueueEntry.aAbstractModelRenderer_9658 = var_renderer.method3691(spriteImage, true)
                spriteImage!!.method1518()
                ConfigVarProgress.aAbstractModelRenderer_4808 = var_renderer.method3691(spriteImage, true)
                SpotAnimVector.aAbstractModelRenderer_2309 = (var_renderer.method3691(SpriteImage.method1521(CameraRotationStub.aJs5Archive_322!!, ProjectedGroundDecor.anInt10257, 0), true))
                val spriteImage_29_ = SpriteImage.method1521(CameraRotationStub.aJs5Archive_322!!, Class79.Companion.anInt1387, 0)
                TimedTileQueueEntry.aAbstractModelRenderer_9659 = var_renderer.method3691(spriteImage_29_, true)
                spriteImage_29_!!.method1518()
                AbstractMenuEntry.aAbstractModelRenderer_1706 = var_renderer.method3691(spriteImage_29_, true)
            }
            anInt1454++
            if (SpotAnimVector.aAbstractModelRenderer_2309 != null && TimedTileQueueEntry.aAbstractModelRenderer_9658 != null && TimedTileQueueEntry.aAbstractModelRenderer_9659 != null) {
                val i_30_ = (-(TimedTileQueueEntry.aAbstractModelRenderer_9659!!.method971() * 2) + i_25_) / SpotAnimVector.aAbstractModelRenderer_2309!!.method971()
                for (i_31_ in 0..<i_30_) SpotAnimVector.aAbstractModelRenderer_2309!!.method974(i_24_ + (TimedTileQueueEntry.aAbstractModelRenderer_9659!!.method971() - -(i_31_ * SpotAnimVector.aAbstractModelRenderer_2309!!.method971())), -SpotAnimVector.aAbstractModelRenderer_2309!!.method969() + (i_28_ + i_26_))
                val i_32_ = ((i_26_ - (i + TimedTileQueueEntry.aAbstractModelRenderer_9659!!.method969())) / TimedTileQueueEntry.aAbstractModelRenderer_9658!!.method969())
                for (i_33_ in 0..<i_32_) {
                    TimedTileQueueEntry.aAbstractModelRenderer_9658!!.method974(i_24_, (TimedTileQueueEntry.aAbstractModelRenderer_9658!!.method969() * i_33_ + (i_28_ + i)))
                    ConfigVarProgress.aAbstractModelRenderer_4808!!.method974(-ConfigVarProgress.aAbstractModelRenderer_4808!!.method971() + i_25_ + i_24_, (TimedTileQueueEntry.aAbstractModelRenderer_9658!!.method969() * i_33_ + i + i_28_))
                }
                TimedTileQueueEntry.aAbstractModelRenderer_9659!!.method974(i_24_, (-TimedTileQueueEntry.aAbstractModelRenderer_9659!!.method969() + i_28_ + i_26_))
                AbstractMenuEntry.aAbstractModelRenderer_1706!!.method974(i_24_ + (i_25_ + -TimedTileQueueEntry.aAbstractModelRenderer_9659!!.method971()), i_28_ - (-i_26_ + TimedTileQueueEntry.aAbstractModelRenderer_9659!!.method969()))
            }
            val i_34_ = -24 % ((i_27_ - 85) / 35)
        }
    }
}
