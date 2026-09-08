import kotlin.jvm.JvmStatic
import kotlin.math.max

/* Class219 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ModelDefinitionCache internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?, js5Archive_17_: Js5Archive?) {
    var aLruByteCache_2862: LruByteCache = LruByteCache(20)
    private val aJs5Archive_2866: Js5Archive?
    var aJs5Archive_2873: Js5Archive? = null
    private val aLruByteCache_2875 = LruByteCache(64)

    fun method1598(i: Int) {
        anInt2863++
        withLock(aLruByteCache_2875) {
            aLruByteCache_2875.method587(-103)
        }
        withLock(this.aLruByteCache_2862) {
            if (i <= 42) method1598(36)
            this.aLruByteCache_2862.method587(-126)
        }
    }

    fun method1601(i: Int, i_15_: Int): ItemModelDefinition {
        anInt2874++
        var itemModelDefinition: ItemModelDefinition? = withLock(aLruByteCache_2875) {
            aLruByteCache_2875.method583(i_15_.toLong(), i + -148) as ItemModelDefinition?
        }
        if (itemModelDefinition != null) return itemModelDefinition
        val `is`: ByteArray? = withLock(aJs5Archive_2866!!) {
            aJs5Archive_2866.method410(-1860, i, i_15_)
        }
        itemModelDefinition = ItemModelDefinition()
        itemModelDefinition.aModelDefinitionCache_438 = this
        if (`is` != null) itemModelDefinition.method332(i xor 0x55.inv(), ByteBuffer(`is`))
        withLock(aLruByteCache_2875) {
            aLruByteCache_2875.method582(itemModelDefinition, i_15_.toLong(), (-109).toByte())
        }
        return itemModelDefinition
    }

    fun method1602(i: Int) {
        withLock(aLruByteCache_2875) {
            aLruByteCache_2875.method590(i)
        }
        anInt2865++
        withLock(this.aLruByteCache_2862) {
            this.aLruByteCache_2862.method590(0)
        }
    }

    fun method1603(i: Int, i_16_: Int) {
        anInt2870++
        withLock(aLruByteCache_2875) {
            aLruByteCache_2875.method578(2, i)
            if (i_16_ >= -22) this.aJs5Archive_2873 = null
        }
        withLock(this.aLruByteCache_2862) {
            this.aLruByteCache_2862.method578(2, i)
        }
    }

    init {
        try {
            this.aJs5Archive_2873 = js5Archive_17_
            aJs5Archive_2866 = js5Archive
            aJs5Archive_2866!!.method407(0, 46)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("sb.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_17_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt2863: Int = 0
        var aSingletonMarker_2864: SingletonMarker? = SingletonMarker()
        var anInt2865: Int = 0
        var anInt2867: Int = 0

        var aProjectileFactory_2868: ProjectileFactory? = ProjectileFactory(0, 1)
        var anInt2869: Int = 0
        var anInt2870: Int = 0
        var aByte2871: Byte = 0

        var anInt2872: Int = 0
        var anInt2874: Int = 0
        fun method1599(i: Byte, i_0_: Int, i_1_: Int): Boolean {
            anInt2869++
            if (i > -65) return false
            return (i_0_ and 0xc580) != 0
        }

        @JvmStatic
        fun method1600(bool: Boolean, i: Int, class318_sub1_sub3_sub3: ProjectedGroundDecor) {
            anInt2867++
            val class225 = class318_sub1_sub3_sub3.method2422(72.toByte())
            if (class318_sub1_sub3_sub3.anInt10319 == 0) {
                class318_sub1_sub3_sub3.anInt10326 = 0
                SceneObjectAnimator.anInt3062 = -1
                ScrollingWidgetComponentNode.anInt8387 = 0
            } else {
                if (i != ((class318_sub1_sub3_sub3.anInt10286).inv()) && (class318_sub1_sub3_sub3.anInt10218) == 0) {
                    val class17 = (ParticleEmitterNode.aAnimationTypeList_191!!.method835((class318_sub1_sub3_sub3.anInt10286), i + 7))
                    if ((class318_sub1_sub3_sub3.anInt10322) > 0 && class17.anInt262 == 0) {
                        SceneObjectAnimator.anInt3062 = -1
                        ScrollingWidgetComponentNode.anInt8387 = 0
                        class318_sub1_sub3_sub3.anInt10326++
                        return
                    }
                    if ((class318_sub1_sub3_sub3.anInt10322) <= 0 && class17.anInt245 == 0) {
                        ScrollingWidgetComponentNode.anInt8387 = 0
                        SceneObjectAnimator.anInt3062 = -1
                        class318_sub1_sub3_sub3.anInt10326++
                        return
                    }
                }
                if (class318_sub1_sub3_sub3.anInt10269 != -1 && (class318_sub1_sub3_sub3.anInt10225) <= GlGroundShaderPass.anInt7396) {
                    val class368 = (ConstantColourTextureNode.aGfxTypeList_9245!!.method2543(118.toByte(), (class318_sub1_sub3_sub3.anInt10269)))
                    if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                        val class17 = ParticleEmitterNode.aAnimationTypeList_191!!.method835(class368.anInt4503, 7)
                        if ((class318_sub1_sub3_sub3.anInt10322) > 0 && class17.anInt262 == 0) {
                            ScrollingWidgetComponentNode.anInt8387 = 0
                            class318_sub1_sub3_sub3.anInt10326++
                            SceneObjectAnimator.anInt3062 = -1
                            return
                        }
                        if ((class318_sub1_sub3_sub3.anInt10322) <= 0 && class17.anInt245 == 0) {
                            SceneObjectAnimator.anInt3062 = -1
                            ScrollingWidgetComponentNode.anInt8387 = 0
                            class318_sub1_sub3_sub3.anInt10326++
                            return
                        }
                    }
                }
                if (class318_sub1_sub3_sub3.anInt10269 != -1 && ((class318_sub1_sub3_sub3.anInt10225) <= GlGroundShaderPass.anInt7396)) {
                    val class368 = (ConstantColourTextureNode.aGfxTypeList_9245!!.method2543(98.toByte(), (class318_sub1_sub3_sub3.anInt10269)))
                    if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                        val class17 = ParticleEmitterNode.aAnimationTypeList_191!!.method835((class368.anInt4503), i xor 0x7)
                        if ((class318_sub1_sub3_sub3.anInt10322) > 0 && class17.anInt262 == 0) {
                            ScrollingWidgetComponentNode.anInt8387 = 0
                            class318_sub1_sub3_sub3.anInt10326++
                            SceneObjectAnimator.anInt3062 = -1
                            return
                        }
                        if ((class318_sub1_sub3_sub3.anInt10322) <= 0 && class17.anInt245 == 0) {
                            SceneObjectAnimator.anInt3062 = -1
                            ScrollingWidgetComponentNode.anInt8387 = 0
                            class318_sub1_sub3_sub3.anInt10326++
                            return
                        }
                    }
                }
                val i_2_ = class318_sub1_sub3_sub3.x
                val i_3_ = class318_sub1_sub3_sub3.y
                val i_4_ = (512 * (class318_sub1_sub3_sub3.anIntArray10320!![-1 + class318_sub1_sub3_sub3.anInt10319]) + class318_sub1_sub3_sub3.method2436(117.toByte()) * 256)
                val i_5_ = (512 * (class318_sub1_sub3_sub3.anIntArray10317!![-1 + class318_sub1_sub3_sub3.anInt10319]) - -(class318_sub1_sub3_sub3.method2436(72.toByte()) * 256))
                if (i_2_ >= i_4_) {
                    if (i_4_ < i_2_) {
                        if (i_5_ > i_3_) class318_sub1_sub3_sub3.method2440(49.toByte(), 6144)
                        else if (i_5_ < i_3_) class318_sub1_sub3_sub3.method2440(49.toByte(), 2048)
                        else class318_sub1_sub3_sub3.method2440(49.toByte(), 4096)
                    } else if (i_5_ <= i_3_) {
                        if (i_3_ > i_5_) class318_sub1_sub3_sub3.method2440(49.toByte(), 0)
                    } else class318_sub1_sub3_sub3.method2440(49.toByte(), 8192)
                } else if (i_3_ >= i_5_) {
                    if (i_5_ < i_3_) class318_sub1_sub3_sub3.method2440(49.toByte(), 14336)
                    else class318_sub1_sub3_sub3.method2440(49.toByte(), 12288)
                } else class318_sub1_sub3_sub3.method2440(49.toByte(), 10240)
                val i_6_ = (class318_sub1_sub3_sub3.aByteArray10321!![-1 + (class318_sub1_sub3_sub3.anInt10319)])
                if (!bool && (i_4_ - i_2_ > 1024 || i_4_ + -i_2_ < -1024 || -i_3_ + i_5_ > 1024 || i_5_ + -i_3_ < -1024)) {
                    class318_sub1_sub3_sub3.y = i_5_
                    class318_sub1_sub3_sub3.x = i_4_
                    class318_sub1_sub3_sub3.method2435((-108).toByte(), (class318_sub1_sub3_sub3.anInt10282), false)
                    SceneObjectAnimator.anInt3062 = -1
                    class318_sub1_sub3_sub3.anInt10319--
                    if ((class318_sub1_sub3_sub3.anInt10322) > 0) class318_sub1_sub3_sub3.anInt10322--
                    ScrollingWidgetComponentNode.anInt8387 = 0
                } else {
                    var i_7_ = 16
                    var bool_8_ = true
                    if (class318_sub1_sub3_sub3 is Npc) bool_8_ = class318_sub1_sub3_sub3.aNpcType_10505!!.aBoolean1331
                    if (bool_8_) {
                        val i_9_ = ((class318_sub1_sub3_sub3.anInt10282) - class318_sub1_sub3_sub3.aCompassSmoother_10217.anInt3370)
                        if (i_9_ != 0 && class318_sub1_sub3_sub3.anInt10275 == -1 && (class318_sub1_sub3_sub3.anInt10310) != 0) i_7_ = 8
                        if (!bool && (class318_sub1_sub3_sub3.anInt10319) > 2) i_7_ = 24
                        if (!bool && (class318_sub1_sub3_sub3.anInt10319) > 3) i_7_ = 32
                    } else {
                        if (!bool && class318_sub1_sub3_sub3.anInt10319 > 1) i_7_ = 24
                        if (!bool && class318_sub1_sub3_sub3.anInt10319 > 2) i_7_ = 32
                    }
                    if ((class318_sub1_sub3_sub3.anInt10326) > 0 && (class318_sub1_sub3_sub3.anInt10319) > 1) {
                        i_7_ = 32
                        class318_sub1_sub3_sub3.anInt10326--
                    }
                    if (i_6_.toInt() == 2) i_7_ = i_7_ shl 1
                    else if (i_6_.toInt() == 0) i_7_ = i_7_ shr 1
                    ScrollingWidgetComponentNode.anInt8387 = 0
                    if (class225.anInt2945 != -1) {
                        i_7_ = i_7_ shl 9
                        if ((class318_sub1_sub3_sub3.anInt10319) == 1) {
                            val i_10_ = (class318_sub1_sub3_sub3.anInt10325 * class318_sub1_sub3_sub3.anInt10325)
                            val i_11_ = ((if (i_4_ >= class318_sub1_sub3_sub3.x) -(class318_sub1_sub3_sub3.x) + i_4_ else (class318_sub1_sub3_sub3.x) + -i_4_) shl 9)
                            val i_12_ = ((if ((class318_sub1_sub3_sub3.y) <= i_5_) i_5_ - class318_sub1_sub3_sub3.y else (class318_sub1_sub3_sub3.y) + -i_5_) shl 9)
                            val i_13_ = max(i_12_, i_11_)
                            val i_14_ = class225.anInt2945 * 2 * i_13_
                            if (i_10_ <= i_14_) {
                                if (i_13_ < i_10_ / 2) {
                                    class318_sub1_sub3_sub3.anInt10325 -= class225.anInt2945
                                    if (class318_sub1_sub3_sub3.anInt10325 < 0) class318_sub1_sub3_sub3.anInt10325 = 0
                                } else if (i_7_ > class318_sub1_sub3_sub3.anInt10325) {
                                    class318_sub1_sub3_sub3.anInt10325 += class225.anInt2945
                                    if (class318_sub1_sub3_sub3.anInt10325 > i_7_) class318_sub1_sub3_sub3.anInt10325 = i_7_
                                }
                            } else class318_sub1_sub3_sub3.anInt10325 /= 2
                        } else if (i_7_ <= class318_sub1_sub3_sub3.anInt10325) {
                            if (class318_sub1_sub3_sub3.anInt10325 > 0) {
                                class318_sub1_sub3_sub3.anInt10325 -= class225.anInt2945
                                if (class318_sub1_sub3_sub3.anInt10325 < 0) class318_sub1_sub3_sub3.anInt10325 = 0
                            }
                        } else {
                            class318_sub1_sub3_sub3.anInt10325 += class225.anInt2945
                            if (i_7_ < class318_sub1_sub3_sub3.anInt10325) class318_sub1_sub3_sub3.anInt10325 = i_7_
                        }
                        i_7_ = (class318_sub1_sub3_sub3.anInt10325) shr 9
                        if (i_7_ < 1) i_7_ = 1
                    }
                    if (i_2_ == i_4_ && i_5_ == i_3_) SceneObjectAnimator.anInt3062 = -1
                    else {
                        if (i_4_ > i_2_) {
                            ScrollingWidgetComponentNode.anInt8387 = ScrollingWidgetComponentNode.anInt8387 or 0x4
                            class318_sub1_sub3_sub3.x += i_7_
                            if (i_4_ < (class318_sub1_sub3_sub3.x)) class318_sub1_sub3_sub3.x = i_4_
                        } else if (i_4_ < i_2_) {
                            ScrollingWidgetComponentNode.anInt8387 = ScrollingWidgetComponentNode.anInt8387 or 0x8
                            class318_sub1_sub3_sub3.x -= i_7_
                            if (class318_sub1_sub3_sub3.x < i_4_) class318_sub1_sub3_sub3.x = i_4_
                        }
                        if (i_7_ >= 32) SceneObjectAnimator.anInt3062 = 2
                        else SceneObjectAnimator.anInt3062 = i_6_.toInt()
                        if (i_3_ < i_5_) {
                            ScrollingWidgetComponentNode.anInt8387 = ScrollingWidgetComponentNode.anInt8387 or 0x1
                            class318_sub1_sub3_sub3.y += i_7_
                            if (i_5_ < (class318_sub1_sub3_sub3.y)) class318_sub1_sub3_sub3.y = i_5_
                        } else if (i_5_ < i_3_) {
                            ScrollingWidgetComponentNode.anInt8387 = ScrollingWidgetComponentNode.anInt8387 or 0x2
                            class318_sub1_sub3_sub3.y -= i_7_
                            if (i_5_ > (class318_sub1_sub3_sub3.y)) class318_sub1_sub3_sub3.y = i_5_
                        }
                    }
                    if (i_4_ == class318_sub1_sub3_sub3.x && i_5_ == (class318_sub1_sub3_sub3.y)) {
                        if ((class318_sub1_sub3_sub3.anInt10322) > 0) class318_sub1_sub3_sub3.anInt10322--
                        class318_sub1_sub3_sub3.anInt10319--
                    }
                }
            }
        }

        @JvmStatic
        fun method1604(i: Int) {
            aSingletonMarker_2864 = null
            aProjectileFactory_2868 = null
            if (i != 11868) anInt2872 = -94
        }
    }
}
