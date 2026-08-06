import BrightnessOptionState.Companion.method1745
import GlVertexBufferArb.Companion.method2127
import WaterMaterialPass.Companion.method2148
import jaggl.OpenGL.Companion.glBindProgramARB
import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glProgramLocalParameter4fARB
import ArbVertexProgram.Companion.method3442

class GlWaterRenderPass internal constructor(glRenderDevice: GlRenderDevice, js5Archive: Js5Archive?, normalMapGenerator: NormalMapGenerator?) : AbstractRenderPass(glRenderDevice) {
    private val aTextureHandle_7293: TextureHandle?
    private val aNormalMapGenerator_7294: NormalMapGenerator?
    private var aGlRenderDevice_7296: GlRenderDevice? = null
    override fun method3527(i: Int, renderable: Renderable?, i_4_: Int) {
        anInt7288++
        if (i_4_ != -16776) aGlRenderDevice_7296 = null
    }

    override fun method3525(i: Int, bool: Boolean) {
        if (i == 15192) {
            anInt7287++
            glBindProgramARB(34336, aTextureHandle_7293!!.anInt2584)
            glEnable(34336)
            this.aHa_Sub3_4479.method3849(47.toByte(), 0, SceneObjectEntity.aTrigLookupTables_8737)
        }
    }

    init {
        try {
            aGlRenderDevice_7296 = glRenderDevice
            aNormalMapGenerator_7294 = normalMapGenerator
            if (js5Archive == null || !aNormalMapGenerator_7294!!.method2039(100) || !aGlRenderDevice_7296!!.aBoolean9923) aTextureHandle_7293 = null
            else aTextureHandle_7293 = method3442(34336, js5Archive.method391("gl", "transparent_water", -29832), aGlRenderDevice_7296, 4)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("ov.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (normalMapGenerator != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3521(bool: Boolean, i: Byte) {
        if (i.toInt() != -103) aShortArrayArrayArray7290 = null
        this.aHa_Sub3_4479.method3874((TheoraVideoStream.aRenderConfigFactory_9011), 106, (RenderQueueState.aRenderConfigFactory_6519))
        anInt7292++
    }

    override fun method3520(i: Byte) {
        anInt7295++
        if (i.toInt() == 87) {
            this.aHa_Sub3_4479.method3849(47.toByte(), 0, LoadingBarRenderer.aTrigLookupTables_4247)
            glBindProgramARB(34336, 0)
            glDisable(34820)
            glDisable(34336)
        }
    }

    override fun method3526(i: Int, i_5_: Int, i_6_: Int) {
        anInt7286++
        if (i == 10756) {
            if (aNormalMapGenerator_7294!!.aBoolean3458) {
                val f = ((this.aHa_Sub3_4479.anInt8146) % 4000).toFloat() / 4000.0f
                this.aHa_Sub3_4479.method3850(79.toByte(), aNormalMapGenerator_7294.anInterface18_Impl1_3452)
                glProgramLocalParameter4fARB(34336, 0, f, 0.0f, 0.0f, 1.0f)
            } else {
                val i_7_ = (16 * (this.aHa_Sub3_4479.anInt8146 % 4000) / 4000)
                this.aHa_Sub3_4479.method3850((-118).toByte(), (aNormalMapGenerator_7294.anInterface18_Impl3Array3459!![i_7_]))
                glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f)
            }
        }
    }

    override fun method3530(i: Int): Boolean {
        anInt7289++
        if (i >= -57) return true
        return aTextureHandle_7293 != null
    }

    companion object {

        var anInt7286: Int = 0

        var anInt7287: Int = 0

        var anInt7288: Int = 0

        var anInt7289: Int = 0

        var aShortArrayArrayArray7290: Array<Array<ShortArray?>?>? = null

        var anInt7291: Int = 0

        var anInt7292: Int = 0

        var anInt7295: Int = 0

        var anInt7297: Int = 0

        @JvmStatic
        fun method3536(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, class318_sub1_sub2: SceneObjectEntity) {
            val class357 = StringValueNode.method3321(i, i_0_, i_1_)
            if (class357 != null) {
                class318_sub1_sub2.x = (i_0_ shl ActorEntity.anInt4459) + ActorEntity.anInt9037
                class318_sub1_sub2.anInt6382 = i_2_
                class318_sub1_sub2.y = (i_1_ shl ActorEntity.anInt4459) + ActorEntity.anInt9037
                class357.aClass318_Sub1_Sub2_4408 = class318_sub1_sub2
                val i_3_ = if (ActorEntity.aTerrainTileArray5191 == ActorEntity.aTerrainTileArray4142) 1 else 0
                if (class318_sub1_sub2.method2376(-52)) {
                    if (class318_sub1_sub2.method2377(122.toByte())) {
                        class318_sub1_sub2.aClass318_Sub1_6379 = BackgroundWorkerThread.aClass318_Sub1Array3226!![i_3_]
                        BackgroundWorkerThread.aClass318_Sub1Array3226!![i_3_] = class318_sub1_sub2
                    } else {
                        class318_sub1_sub2.aClass318_Sub1_6379 = LinkedListNodeStatics.aClass318_Sub1Array4293!![i_3_]
                        LinkedListNodeStatics.aClass318_Sub1Array4293!![i_3_] = class318_sub1_sub2
                        PcmStreamBuffer.aBoolean8870 = true
                    }
                } else {
                    class318_sub1_sub2.aClass318_Sub1_6379 = OverlayColorTable.aClass318_Sub1Array1754!![i_3_]
                    OverlayColorTable.aClass318_Sub1Array1754!![i_3_] = class318_sub1_sub2
                }
            }
        }

        @JvmStatic
        fun method3537(i: Int) {
            aShortArrayArrayArray7290 = null
            if (i != 34336) anInt7297 = 99
        }

        @JvmStatic
        fun method3538(bool: Boolean, string: String?) {
            var string = string
            anInt7291++
            if (string != null) {
                if (string.startsWith("*")) string = string.substring(1)
                val string_8_ = method2127(2, string)
                if (string_8_ != null) {
                    var i = 0
                    while ((ContactEntry.anInt9604 > i)) {
                        var string_9_ = NpcConfig.aStringArray932!![i]
                        if (string_9_!!.startsWith("*")) string_9_ = string_9_.substring(1)
                        string_9_ = method2127(2, string_9_)
                        if (string_9_ != null && string_9_ == string_8_) {
                            ContactEntry.anInt9604--
                            var i_10_ = i
                            while (ContactEntry.anInt9604 > i_10_) {
                                NpcConfig.aStringArray932!![i_10_] = NpcConfig.aStringArray932!![i_10_ + 1]
                                ObjectSpawnDecoder.aStringArray1808!![i_10_] = ObjectSpawnDecoder.aStringArray1808!![1 + i_10_]
                                WeaveTextureNode.aStringArray9275!![i_10_] = (WeaveTextureNode.aStringArray9275!![1 + i_10_])
                                IndexedSprite.aStringArray5197!![i_10_] = IndexedSprite.aStringArray5197!![1 + i_10_]
                                BasicGlRenderPass.Companion.aBooleanArray7304!![i_10_] = BasicGlRenderPass.Companion.aBooleanArray7304!![i_10_ - -1]
                                i_10_++
                            }
                            GlVertexBufferArb.anInt8493++
                            Crc64Hashable.anInt4985 = ResourceLoaderThread.anInt3918
                            val class348_sub47 = method2148(Renderer.aOutgoingPacketHeader_4571, (TheoraVideoStream.aIsaacCipher_9029), -123)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, method1745(string, -65))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                            InterfaceComponentGroup.method3243(118, class348_sub47)
                            break
                        }
                        i++
                    }
                }
            }
        }
    }
}
