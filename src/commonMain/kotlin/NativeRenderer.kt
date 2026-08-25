import kotlin.jvm.JvmStatic
import CubeMapMaterialPass.Companion.method2173
import MidiSequencePlayer.Companion.method2878
import InvertTextureNode.Companion.method3135
import jaclib.memory.Buffer
import jaclib.memory.Stream
import jaclib.memory.heap.NativeHeap
import jaclib.memory.heap.NativeHeapBuffer
import jagex3.graphics2.hw.NativeInterface
import OpenGlRenderNode.Companion.method3297
import direct.Direct3dModel
import awt.Canvas
import lang.Class
import lang.jClass
import util.Hashtable
import kotlin.math.cos
import kotlin.math.max
import kotlin.math.sin
import kotlin.math.sqrt

abstract class NativeRenderer(canvas: Canvas?, `object`: Any?, var_renderConfig: RenderConfig?, js5Archive: Js5Archive?, i: Int, i_289_: Int) : Renderer(var_renderConfig) {
    var aNativeHeap7891: NativeHeap? = null
    var aLong7905: Long = 0
    private var aCanvas7910: Canvas? = null
    var anObject7919: Any? = null

    var aNativeInterface7924: NativeInterface? = null
    var aCanvas7925: Canvas? = null
    private var aNodeDeque_7927: NodeDeque? = NodeDeque()
    var anInt7931: Int = 0
    var aNormalMapGenerator_7937: NormalMapGenerator? = null
    private var anInt7958 = 0
    var anInt7962: Int = 0
    var aNativeHeapBuffer7974: NativeHeapBuffer? = null
    private var anInt7987 = 0
    private var aHashtable8014: Hashtable<Any?, Any?>? = null
    private var anObject8020: Any? = null
    var aJs5Archive_8039: Js5Archive? = null
    var anInt8062: Int = 0
    var anInt8063: Int = 0
    var aBoolean8069: Boolean = true
    var aClass101_Sub2_8074: FloatCameraTransform = FloatCameraTransform()
    var anInt8079: Int = 0

    var aClass101_Sub2_8080: FloatCameraTransform = FloatCameraTransform()

    var aClass101_Sub2_8082: FloatCameraTransform = FloatCameraTransform()
    var aClass101_Sub2_8083: FloatCameraTransform = FloatCameraTransform()
    private val aClass101_Sub2_8084 = FloatCameraTransform()
    private var aClass101_Sub2_8085: FloatCameraTransform = FloatCameraTransform()
    lateinit var aRenderConfigFactoryArray8086: Array<RenderConfigFactory?>
    var aFloat8087: Float = 1.0f
    private var aStream8088: Stream?

    var aFloat8089: Float = 3584.0f
    var anInt8090: Int = 0
    var anInt8091: Int
    lateinit var aRenderConfigFactoryArray8092: Array<RenderConfigFactory?>

    var aFloat8093: Float = 1.0f

    var anInt8094: Int = 0

    var anInt8095: Int = 50
    var anInt8096: Int = 0
    private var aBoolean8097 = false
    private lateinit var anRenderableArray8098: Array<Renderable?>
    private var anInt8099 = -1
    private var anInt8100 = 0
    var aBoolean8101: Boolean = false
    var aFloatArray8102: FloatArray

    var aFloat8103: Float = 0f
    private var anInt8104: Int
    var anInt8105: Int = 0
    var anInt8106: Int = 0

    var anInt8107: Int = 3
    private var anInt8108 = 0
    var anInt8109: Int = 0
    var aBoolean8110: Boolean = true
    private val aFloatArray8111: FloatArray
    private var aBoolean8112 = false
    lateinit var aConfigFlagUtilArray8113: Array<ConfigFlagUtil?>

    var anInt8114: Int = 0
    var aFloat8115: Float = 0f
    var aBoolean8116: Boolean = true
    var anInt8117: Int = 0
    var aBoolean8118: Boolean = false
    var anInt8119: Int = 0
    private val aFloatArray8120: FloatArray
    private var aBoolean8121 = false
    var anInt8122: Int = 0
    var aBoolean8123: Boolean = false
    var aBoolean8124: Boolean = true

    var anInt8125: Int = 8

    var aFloat8126: Float = 0f
    private var aBoolean8127 = false
    private var aFloat8128 = 0f

    var anInt8129: Int = 512

    var anInt8130: Int = 0
    lateinit var aClass101_Sub2Array8131: Array<FloatCameraTransform?>
    lateinit var aClass348_Sub1Array8132: Array<AbstractTileShape?>

    var anInt8133: Int = 0

    var anInt8134: Int = 512
    var aFloatArray8135: FloatArray
    private var aGroundDecorRenderer_8136: GroundDecorRenderer? = null
    private val aMaterialTextureCache_8137: MaterialTextureCache?
    var anInt8138: Int = 0
    private val aAbstractRenderPassArray8139: Array<AbstractRenderPass?>
    private var aFloatArray8140: FloatArray?
    var aBoolean8141: Boolean = true
    private var aFloatArray8142: FloatArray?
    private var aAbstractRenderPass_8143: AbstractRenderPass? = null
    var anInt8144: Int
    var aBoolean8145: Boolean = false
    var anInt8146: Int = 0
    var anRenderable_8147: Renderable? = null
    var aBoolean8148: Boolean = true
    var aBoolean8149: Boolean = false
    var anInt8150: Int = 128
    var anInt8151: Int = 0
    private var aFloatArray8152: FloatArray
    private var aBoolean8153 = false
    var anInt8154: Int = 3584
    private var aFloat8155 = 1.0f
    private var anInt8156 = 0
    private var aFloatArray8157: FloatArray

    var aFloat8158: Float = 0f

    var aBoolean8159: Boolean = false
    var aBoolean8160: Boolean = false
    private var anInt8161 = 0
    private var anInt8162 = 0
    var aObjectByteSerializerHolder_8163: ObjectByteSerializerHolder?
    var aBoolean8164: Boolean = false
    var anInt8165: Int = 0
    private var aFloat8166 = 0f
    private var anInt8167: Int
    var aFloat8168: Float

    var aFloat8169: Float = 3584.0f
    var aFloatArray8170: FloatArray
    private var aClass299_Sub2_8171: TextureCubeProvider? = null
    private var anInt8172: Int
    var aFloat8173: Float = 0f
    var aFloat8174: Float
    var anInt8175: Int
    private var aBoolean8176 = false
    private var anInt8177: Int

    var anInt8178: Int = 0
    private var anInt8179: Int
    var aFloat8180: Float
    var anInt8181: Int
    var aBoolean8182: Boolean = false
    var anInt8183: Int
    var aSingletonMarker_8184: SingletonMarker

    var aFloat8185: Float = 0f
    var aFloat8186: Float

    var aClass64_Sub2_8187: Direct3dModel? = null

    var aClass64_Sub2_8188: Direct3dModel? = null

    var aClass64_Sub2_8189: Direct3dModel? = null
    private var aModelBatchBase_8190: ModelBatchBase? = null

    var aModelBatchBase_8191: ModelBatchBase? = null

    var aClass64_Sub2_8192: Direct3dModel? = null
    private var anInterface5_Impl1_8193: VertexBufferResource? = null

    var aClass64_Sub2_8194: Direct3dModel? = null
    private var anInterface5_Impl2_8195: IndexBufferResource? = null
    private val aClass101_Sub2_8196: FloatCameraTransform
    private var aModelBatchBase_8197: ModelBatchBase? = null

    var aClass64_Sub2_8198: Direct3dModel? = null

    var aClass64_Sub2_8199: Direct3dModel? = null

    var aClass64_Sub2_8200: Direct3dModel? = null
    private var anInterface5_Impl1_8201: VertexBufferResource? = null

    var aModelBatchBase_8202: ModelBatchBase? = null
    private var anInterface5_Impl1_8203: VertexBufferResource? = null
    var aModelBatchBase_8204: ModelBatchBase? = null
    private var aModelBatchBase_8205: ModelBatchBase? = null

    var aClass64_Sub2_8206: Direct3dModel? = null

    var aClass64_Sub2_8207: Direct3dModel? = null

    var aModelBatchBase_8208: ModelBatchBase? = null
    var aBoolean8209: Boolean = false
    private val anInt8210 = 0
    override fun da(i: Int, i_0_: Int, i_1_: Int, `is`: IntArray?) {
        try {
            anInt7966++
            val f = this.aClass101_Sub2_8080.method933((-105).toByte(), i.toFloat(), i_1_.toFloat(), i_0_.toFloat())
            val i_2_: Int
            val i_3_: Int
            if (f >= -0.0078125f && f <= 0.0078125f) {
                i_2_ = this.anInt8130
                i_3_ = this.anInt8094
            } else {
                i_3_ = (this.anInt8129.toFloat() * (this.aClass101_Sub2_8080.method929(i_1_.toFloat(), i_0_.toFloat(), 45.toByte(), i.toFloat())) / f).toInt()
                i_2_ = (this.anInt8134.toFloat() * (this.aClass101_Sub2_8080.method922(108.toByte(), i.toFloat(), i_1_.toFloat(), i_0_.toFloat())) / f).toInt()
            }
            `is`!![2] = f.toInt()
            `is`[0] = (i_3_.toFloat() - this.aFloat8126).toInt()
            `is`[1] = (i_2_.toFloat() - this.aFloat8103).toInt()
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.da(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3651(var_shaderProgram: ShaderProgram?) {
        try {
            anInt8005++
            this.aNativeHeap7891 = (var_shaderProgram as ArbVertexProgram).aNativeHeap9782
            this.aNativeHeapBuffer7974 = this.aNativeHeap7891!!.a(32768, false)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, "wga.PF(" + (if (var_shaderProgram != null) "{...}" else "null") + ')')
        }
    }

    override fun JA(i: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int): Int {
        anInt8071++
        var i_9_ = 0
        var f = (i_4_.toFloat() * this.aClass101_Sub2_8080.aFloat5691 + (this.aClass101_Sub2_8080.aFloat5736) * i.toFloat() + (i_5_.toFloat() * (this.aClass101_Sub2_8080.aFloat5716)) + (this.aClass101_Sub2_8080.aFloat5724))
        if (f < 1.0f) f = 1.0f
        var f_10_ = ((this.aClass101_Sub2_8080.aFloat5724) + ((this.aClass101_Sub2_8080.aFloat5691) * i_7_.toFloat() + (this.aClass101_Sub2_8080.aFloat5736) * i_6_.toFloat() + (i_8_.toFloat() * (this.aClass101_Sub2_8080.aFloat5716))))
        if (f_10_ < 1.0f) f_10_ = 1.0f
        if (!(this.anInt8095.toFloat() > f) || !(this.anInt8095.toFloat() > f_10_)) {
            if (f > this.anInt8154.toFloat() && this.anInt8154.toFloat() < f_10_) i_9_ = i_9_ or 0x20
        } else i_9_ = i_9_ or 0x10
        val i_11_ = (((this.aClass101_Sub2_8080.aFloat5729) + (i_5_.toFloat() * (this.aClass101_Sub2_8080.aFloat5704) + (i.toFloat() * (this.aClass101_Sub2_8080.aFloat5711) + (this.aClass101_Sub2_8080.aFloat5700) * i_4_.toFloat()))) * this.anInt8129.toFloat() / f).toInt()
        val i_12_ = (((this.aClass101_Sub2_8080.aFloat5729) + ((this.aClass101_Sub2_8080.aFloat5700 * i_7_.toFloat()) + i_6_.toFloat() * this.aClass101_Sub2_8080.aFloat5711 + i_8_.toFloat() * this.aClass101_Sub2_8080.aFloat5704)) * this.anInt8129.toFloat() / f_10_).toInt()
        if (i_11_.toFloat() < this.aFloat8126 && i_12_.toFloat() < this.aFloat8126) i_9_ = i_9_ or 0x1
        else if (this.aFloat8158 < i_11_.toFloat() && i_12_.toFloat() > this.aFloat8158) i_9_ = i_9_ or 0x2
        val i_13_ = (this.anInt8134.toFloat() * ((this.aClass101_Sub2_8080.aFloat5732) * i_5_.toFloat() + ((this.aClass101_Sub2_8080.aFloat5722 * i_4_.toFloat()) + i.toFloat() * this.aClass101_Sub2_8080.aFloat5708) + this.aClass101_Sub2_8080.aFloat5710) / f).toInt()
        val i_14_ = (this.anInt8134.toFloat() * (i_8_.toFloat() * (this.aClass101_Sub2_8080.aFloat5732) + (i_7_.toFloat() * this.aClass101_Sub2_8080.aFloat5722 + (i_6_.toFloat() * (this.aClass101_Sub2_8080.aFloat5708))) + this.aClass101_Sub2_8080.aFloat5710) / f_10_).toInt()
        if (!(this.aFloat8103 > i_13_.toFloat()) || !(i_14_.toFloat() < this.aFloat8103)) {
            if (i_13_.toFloat() > this.aFloat8185 && i_14_.toFloat() > this.aFloat8185) i_9_ = i_9_ or 0x8
        } else i_9_ = i_9_ or 0x4
        return i_9_
    }

    abstract fun method3812(i: Int, directionPaths: Array<DirectionPath>): ModelBatchBase

    override fun ZA(i: Int, f: Float, f_15_: Float, f_16_: Float, f_17_: Float, f_18_: Float) {
        anInt7912++
        val bool = i != anInt8172
        if (bool || f != this.aFloat8174 || f_15_ != this.aFloat8186) {
            anInt8172 = i
            this.aFloat8174 = f
            this.aFloat8186 = f_15_
            if (bool) {
                this.aFloat8087 = (anInt8172 and 0xff00).toFloat() / 65280.0f
                this.aFloat8180 = (0xff0000 and anInt8172).toFloat() / 1.671168E7f
                this.aFloat8168 = (0xff and anInt8172).toFloat() / 255.0f
                method3928(0)
            }
            this.aNativeInterface7924!!.setSunColour(this.aFloat8180, this.aFloat8087, this.aFloat8168, f, f_15_)
            method3842(true)
        }
        if (aFloatArray8142!![0] != f_16_ || aFloatArray8142!![1] != f_17_ || aFloatArray8142!![2] != f_18_) {
            aFloatArray8142!![2] = f_18_
            aFloatArray8142!![1] = f_17_
            aFloatArray8142!![0] = f_16_
            aFloatArray8140!![2] = -f_18_
            aFloatArray8140!![0] = -f_16_
            aFloatArray8140!![1] = -f_17_
            val f_19_ = (1.0 / sqrt((f_17_ * f_17_ + f_16_ * f_16_ + f_18_ * f_18_).toDouble())).toFloat()
            this.aFloatArray8170[1] = f_19_ * f_17_
            this.aFloatArray8170[2] = f_19_ * f_18_
            this.aFloatArray8170[0] = f_16_ * f_19_
            this.aFloatArray8102!![1] = -this.aFloatArray8170[1]
            this.aFloatArray8102!![2] = -this.aFloatArray8170[2]
            this.aFloatArray8102!![0] = -this.aFloatArray8170[0]
            this.aNativeInterface7924!!.setSunDirection(this.aFloatArray8170[0], this.aFloatArray8170[1], this.aFloatArray8170[2])
            method3892(0)
            this.anInt8133 = (f_16_ * 256.0f / f_17_).toInt()
            this.anInt8114 = (256.0f * f_18_ / f_17_).toInt()
        }
        method3884(101.toByte())
    }

    abstract fun method3813(bool: Boolean)

    fun method3814(bool: Boolean, bool_20_: Boolean, i: Int, i_21_: Byte) {
        if (i_21_ >= 27) {
            anInt8081++
            if (anInt8104 != i || !aBoolean8153 == this.aBoolean8160) {
                var interface18_impl3: Renderable2dTexture? = null
                var i_22_ = 0
                var i_23_: Byte = 0
                var i_24_ = 0
                var i_25_ = if (this.aBoolean8160) 3.toByte() else 0.toByte()
                if (i >= 0) {
                    interface18_impl3 = aMaterialTextureCache_8137!!.method3587((-97).toByte(), i)
                    val class12 = this.aRenderConfig4579!!.method3(i, -6662)
                    if (class12!!.aByte198.toInt() == 0 && class12.aByte211.toInt() == 0) method3879(-8629)
                    else {
                        val i_26_ = if (!class12.aBoolean199) 128 else 64
                        val i_27_ = i_26_ * 50
                        val class101_sub2 = method3820(false)
                        class101_sub2.method916(((this.anInt8146 % i_27_ * class12.aByte211).toFloat() / i_27_.toFloat()), true, 0.0f, ((class12.aByte198 * (this.anInt8146 % i_27_)).toFloat() / i_27_.toFloat()))
                        method3853(-32, LightDetailOptionState.aConfigFlagUtil_6030)
                    }
                    i_22_ = class12.anInt203
                    if (!this.aBoolean8160) {
                        i_23_ = class12.aByte202
                        i_25_ = class12.aByte213
                        i_24_ = class12.anInt206
                    }
                } else method3879(-8629)
                method3875(i_23_.toInt(), bool_20_, bool, i_25_.toInt(), i_24_, -103)
                if (aAbstractRenderPass_8143 == null) {
                    method3850((-86).toByte(), interface18_impl3)
                    method3923(true, i_22_)
                } else aAbstractRenderPass_8143!!.method3527(i_22_, interface18_impl3, -16776)
                aBoolean8153 = this.aBoolean8160
                anInt8104 = i
            }
            anInt8100 = anInt8100 and 0x7.inv()
        }
    }

    fun method3815(i: Int, class101_sub2: FloatCameraTransform?) {
        try {
            anInt8029++
            if (i != 0) this.anInt8062 = -6
            this.aClass101_Sub2_8074.method898(class101_sub2)
            this.aBoolean8069 = false
            method3836(1)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.JH(" + i + ',' + (if (class101_sub2 != null) "{...}" else "null") + ')'))
        }
    }

    private fun method3816(i: Byte) {
        anInterface5_Impl1_8203 = method3889(true, 16711680)
        val i_28_ = -85 / ((41 - i) / 54)
        anInt7948++
        anInterface5_Impl1_8203!!.method20(24, 125.toByte(), 12)
        aModelBatchBase_8205 = method3812(0, (arrayOf<DirectionPath>(DirectionPath(SpriteMaskShape.aSpriteMaskShape_4073!!))))
    }

    fun method3817(i: Int, i_29_: Int) {
        if (i <= 53) method3878(-0.15425435f, 84, -0.11598543f, 0.9862154f, -1.0921319f, -1.1620088f, -1.5202727f)
        if (anInt8167 != i_29_) {
            val bool: Boolean
            val objectByteSerializerHolder: ObjectByteSerializerHolder?
            val bool_30_: Boolean
            if (i_29_ == 1) {
                bool = true
                objectByteSerializerHolder = ClientMachineInfo.aObjectByteSerializerHolder_6602
                bool_30_ = true
            } else if (i_29_ == 2) {
                objectByteSerializerHolder = D3dRenderDevice.aObjectByteSerializerHolder_1201
                bool_30_ = true
                bool = false
            } else if (i_29_ == 128) {
                bool = true
                objectByteSerializerHolder = BoundsConstraintEntry.aObjectByteSerializerHolder_5169
                bool_30_ = true
            } else {
                bool_30_ = false
                objectByteSerializerHolder = NpcDefinition.aObjectByteSerializerHolder_2944
                bool = false
            }
            if (bool != this.aBoolean8141) {
                this.aBoolean8141 = bool
                method3939(100.toByte())
            }
            if (!bool_30_ == this.aBoolean8116) {
                this.aBoolean8116 = bool_30_
                method3947(4)
            }
            if (objectByteSerializerHolder != this.aObjectByteSerializerHolder_8163) {
                this.aObjectByteSerializerHolder_8163 = objectByteSerializerHolder
                method3950(0)
            }
            anInt8100 = anInt8100 and 0x1c.inv()
            anInt8167 = i_29_
        }
        anInt7938++
    }

    override fun method3661(i: Int, i_31_: Int, `is`: IntArray?, is_32_: IntArray?): Sprite {
        try {
            anInt7957++
            return SceneEntityModel.method2501(i_31_, this, `is`, (-42).toByte(), is_32_, i)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.RF(" + i + ',' + i_31_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_32_ != null) "{...}" else "null") + ')'))
        }
    }

    abstract fun method3818(bool: Boolean)

    abstract fun method3819(i: Byte)

    fun method3820(bool: Boolean): FloatCameraTransform {
        anInt8004++
        if (bool != false) method3903(true)
        return (this.aClass101_Sub2Array8131[this.anInt8175])!!
    }

    fun method3821(i: Int) {
        anInt7890++
        method3932((-125).toByte())
        method3929(true)
        if (i != -4845) method3858(false)
    }

    fun method3822(i: Int, i_33_: Int): IndexBufferResource {
        if (anInterface5_Impl2_8195!!.method16(false) < 2 * i_33_) anInterface5_Impl2_8195!!.method23(15959, i_33_)
        anInt7975++
        return anInterface5_Impl2_8195!!
    }

    open fun method3823(i: Byte) {
        val i_34_ = 23 / ((-39 - i) / 62)
        this.anInt8122 = this.anInt8151
        anInt8006++
        this.anInt8151 = 0
    }

    override fun method3699(): Boolean {
        anInt7903++
        return this.aBoolean8182
    }

    override fun method3708(): Boolean {
        anInt7902++
        return false
    }

    fun method3825(i: Int) {
        if (anInt8100 != 8) {
            method3895(-8)
            method3838(true, true)
            method3890(true, 111.toByte())
            method3946(i xor 0x17.inv(), true)
            method3817(69, 1)
            anInt8100 = 8
        }
        anInt8007++
        if (i != 8) method3901(20.toByte())
    }

    override fun method3652() {
        anInt8065++
        if (!aBoolean8176) {
            var class348 = aNodeDeque_7927!!.method1995(4)
            while (class348 != null) {
                (class348 as ArbVertexProgram).method3445(-9503)
                class348 = aNodeDeque_7927!!.method1990(102.toByte())
            }
            val enumeration = aHashtable8014!!.keys()
            while (enumeration.hasMoreElements()) {
                val canvas = enumeration.nextElement() as Canvas?
                method3911(canvas, 1, aHashtable8014!!.get(canvas))
            }
            method2173(true, -125, false)
            this.aNativeInterface7924!!.release()
            aBoolean8176 = true
        }
    }

    override fun HA(i: Int, i_44_: Int, i_45_: Int, i_46_: Int, `is`: IntArray?) {
        try {
            anInt7979++
            val f = (this.aClass101_Sub2_8080.method933((-105).toByte(), i.toFloat(), i_45_.toFloat(), i_44_.toFloat()))
            if (this.anInt8095.toFloat() <= f && this.anInt8154.toFloat() >= f) {
                val i_47_ = (this.anInt8129.toFloat() * (this.aClass101_Sub2_8080.method929(i_45_.toFloat(), i_44_.toFloat(), 45.toByte(), i.toFloat())) / i_46_.toFloat()).toInt()
                val i_48_ = (this.anInt8134.toFloat() * (this.aClass101_Sub2_8080.method922(67.toByte(), i.toFloat(), i_45_.toFloat(), i_44_.toFloat())) / i_46_.toFloat()).toInt()
                `is`!![2] = f.toInt()
                `is`[1] = (-this.aFloat8103 + i_48_.toFloat()).toInt()
                `is`[0] = (-this.aFloat8126 + i_47_.toFloat()).toInt()
            } else {
                `is`!![2] = -1
                `is`[1] = `is`[2]
                `is`[0] = `is`[1]
            }
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.HA(" + i + ',' + i_44_ + ',' + i_45_ + ',' + i_46_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3670(): Boolean {
        anInt7898++
        return true
    }

    fun method3826(i: Byte): Int {
        if (i.toInt() != -70) method3702(-1)
        anInt8050++
        return anInt8177
    }

    override fun Q(i: Int, i_49_: Int, i_50_: Int, i_51_: Int, i_52_: Int, i_53_: Int, `is`: ByteArray?, i_54_: Int, i_55_: Int) {
        try {
            anInt8000++
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.Q(" + i + ',' + i_49_ + ',' + i_50_ + ',' + i_51_ + ',' + i_52_ + ',' + i_53_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_54_ + ',' + i_55_ + ')'))
        }
    }

    override fun method3638(abstractCameraTransform: AbstractCameraTransform?) {
        do {
            try {
                this.aClass101_Sub2_8080 = abstractCameraTransform as FloatCameraTransform
                anInt7923++
                this.aClass101_Sub2_8083.method898(this.aClass101_Sub2_8080)
                this.aClass101_Sub2_8083.method934(64.toByte())
                aClass101_Sub2_8084.method931(-25519, this.aClass101_Sub2_8083)
                this.aClass101_Sub2_8082.method931(-25519, this.aClass101_Sub2_8080)
                if (!this.aSingletonMarker_8184.method1450(-112)) break
                method3913(107.toByte())
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, "wga.DE(" + (if (abstractCameraTransform != null) "{...}" else "null") + ')')
            }
            break
        } while (false)
    }

    abstract fun method3827(i: Byte)

    private fun method3828(bool: Boolean) {
        anInterface5_Impl1_8193 = method3889(bool, 16711680)
        anInt7985++
        anInterface5_Impl1_8193!!.method20(140, 123.toByte(), 28)
        for (i in 0..3) {
            val buffer = anInterface5_Impl1_8193!!.method19(true, 26775)
            if (buffer != null) {
                val stream = method3893(buffer, 9179)
                if (Stream.c()) {
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(1.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(1.0f)
                    stream.a(0.0f)
                    stream.a(1.0f)
                    stream.a(1.0f)
                    stream.a(1.0f)
                    stream.a(0.0f)
                    stream.a(1.0f)
                    stream.a(1.0f)
                    stream.a(1.0f)
                    stream.a(1.0f)
                    stream.a(1.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(1.0f)
                    stream.a(0.0f)
                    stream.a(1.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                } else {
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(1.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(1.0f)
                    stream.b(0.0f)
                    stream.b(1.0f)
                    stream.b(1.0f)
                    stream.b(1.0f)
                    stream.b(0.0f)
                    stream.b(1.0f)
                    stream.b(1.0f)
                    stream.b(1.0f)
                    stream.b(1.0f)
                    stream.b(1.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(1.0f)
                    stream.b(0.0f)
                    stream.b(1.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                }
                stream.a()
                if (anInterface5_Impl1_8193!!.method18(6331)) break
            }
        }
        aModelBatchBase_8197 = method3812(0, (arrayOf<DirectionPath>(DirectionPath(arrayOf<SpriteMaskShape?>(SpriteMaskShape.aSpriteMaskShape_4073, SpriteMaskShape.aSpriteMaskShape_4078, SpriteMaskShape.aSpriteMaskShape_4078)))))
    }

    abstract fun method3829(trigLookupTables: TrigLookupTables?, i: Int, i_56_: Byte, bool: Boolean)

    abstract fun method3830(i: Int, `is`: IntArray?, bool: Boolean, i_57_: Byte, i_58_: Int, i_59_: Int, i_60_: Int): Renderable2dTexture?

    override fun method3631(i: Int) {
        anInt7963++
        require(i == 1) { "" }
    }

    private fun method3831(i: Byte) {
        if (i.toInt() != 19) method3629(31, -7, false)
        aBoolean8097 = false
        anInt7893++
        method3906(122.toByte())
        if (HintIconState.aSingletonMarker_2372 == this.aSingletonMarker_8184) method3929(true)
    }

    open fun method3832(i: Int, i_61_: Byte): AbstractRenderPass? {
        if (i_61_ > -57) method3817(22, -65)
        anInt7969++
        val i_62_ = i
        while_231_@ do {
            while_230_@ do {
                do {
                    if (i_62_ != 6) {
                        if (i_62_ != 1) {
                            if (i_62_ != 2) {
                                if (i_62_ != 7) break@while_231_
                            } else break
                            break@while_230_
                        }
                    } else return BasicGlRenderPass(this)
                    return GlCubemapLightPass(this)
                } while (false)
                return FixedFunctionWaterPass(this, this.aNormalMapGenerator_7937)
            } while (false)
            return GlShadowRenderPass(this)
        } while (false)
        return NullRenderPass(this)
    }

    fun method3833(i: Byte): Int {
        anInt7994++
        if (i.toInt() != -58) method3820(true)
        return anInt8179
    }

    fun method3834(i: Int): RenderableCubeTexture? {
        if (i != -16777216) anInt8100 = 109
        anInt7934++
        if (aClass299_Sub2_8171 != null) return aClass299_Sub2_8171!!.method2266(true)
        return null
    }

    fun method3835(fs: FloatArray?, i: Int): FloatArray {
        try {
            fs!![0] = this.aFloatArray8135[0]
            fs[4] = this.aFloatArray8135[1]
            fs[12] = this.aFloatArray8135[3]
            if (i > -77) method3827(43.toByte())
            anInt8053++
            fs[8] = this.aFloatArray8135[2]
            fs[9] = this.aFloatArray8135[6]
            fs[13] = this.aFloatArray8135[7]
            fs[2] = this.aFloatArray8135[8]
            fs[1] = this.aFloatArray8135[4]
            fs[5] = this.aFloatArray8135[5]
            fs[10] = this.aFloatArray8135[10]
            fs[14] = this.aFloatArray8135[11]
            fs[3] = this.aFloatArray8135[12]
            fs[6] = this.aFloatArray8135[9]
            fs[7] = this.aFloatArray8135[13]
            fs[15] = this.aFloatArray8135[15]
            fs[11] = this.aFloatArray8135[14]
            return fs
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.OA(" + (if (fs != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    private fun method3836(i: Int) {
        if (WidgetNodeLink.aSingletonMarker_2042 == this.aSingletonMarker_8184) {
            val f = method3858(false)
            this.aClass101_Sub2_8074.method920(f, false, 0.0f, f)
        }
        anInt8023++
        aBoolean8121 = false
        method3901((-48).toByte())
        if (i == 1) {
            if (aAbstractRenderPass_8143 != null) aAbstractRenderPass_8143!!.method3523(12.toByte())
        }
    }

    fun method3837(bool: Boolean): FloatArray {
        if (bool != true) method3863(-25)
        anInt7992++
        return aFloatArray8111
    }

    fun method3838(bool: Boolean, bool_63_: Boolean) {
        if (this.aBoolean8123 == !bool_63_) {
            this.aBoolean8123 = bool_63_
            method3827((-84).toByte())
            anInt8100 = anInt8100 and 0x1f.inv()
        }
        anInt7967++
    }

    fun method3839(i: Int, i_64_: Int, i_65_: Int, bool: Boolean, `is`: IntArray?): Renderable2dTexture? {
        try {
            if (i_65_ != -15137) this.aFloat8126 = -0.13315333f
            anInt7965++
            return method3830(i_64_, `is`, bool, 107.toByte(), 0, 0, i)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.JG(" + i + ',' + i_64_ + ',' + i_65_ + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    abstract fun method3840(i: Int, bool: Boolean): IndexBufferResource?

    abstract fun method3841(i: Byte)

    abstract fun method3842(bool: Boolean)

    abstract fun method3843(i: Int, i_66_: Int, i_67_: Int, i_68_: Int, `is`: ByteArray?, textureFormatInfo: TextureFormatInfo?, i_69_: Int, bool: Boolean): Renderable2dTexture?

    override fun X(i: Int) {
        var i = i
        anInt7920++
        this.anInt8107 = 0
        while ( /**/i > 1) {
            this.anInt8107++
            i = i shr 1
        }
        this.anInt8125 = 1 shl this.anInt8107
    }

    abstract fun method3844(i: Int, canvas: Canvas?, `object`: Any?)

    override fun aa(i: Int, i_70_: Int, i_71_: Int, i_72_: Int, i_73_: Int, i_74_: Int) {
        method3903(false)
        anInt8017++
        method3894(-28186, i_73_)
        method3849(47.toByte(), 0, RenderListTextureNode.aTrigLookupTables_9485)
        method3885(0, true, RenderListTextureNode.aTrigLookupTables_9485)
        method3817(113, i_74_)
        this.aClass101_Sub2_8074.method932(1.0f, i_72_.toFloat(), i_71_.toFloat(), (-22).toByte())
        this.aClass101_Sub2_8074.method891(i, i_70_, 0)
        method3915(0)
        method3926(67.toByte(), false)
        method3933(-70)
        method3926(83.toByte(), true)
        method3885(0, true, LoadingBarRenderer.aTrigLookupTables_4247)
        method3849(47.toByte(), 0, LoadingBarRenderer.aTrigLookupTables_4247)
    }

    private fun method3845(i: Byte) {
        if (WidgetNodeLink.aSingletonMarker_2042 != this.aSingletonMarker_8184) {
            val class196 = this.aSingletonMarker_8184
            this.aSingletonMarker_8184 = WidgetNodeLink.aSingletonMarker_2042!!
            if (class196.method1450(-48)) method3913((-121).toByte())
            method3919(20794)
            this.aFloatArray8135 = aFloatArray8120
            method3929(true)
            anInt8100 = anInt8100 and 0x18.inv()
        }
        anInt7907++
        if (i < 12) aStringArray8019 = null
    }

    private fun method3846(i: Byte) {
        anInt7928++
        aBoolean8112 = false
        val i_75_ = -77 / ((i - 78) / 48)
        method3949((-58).toByte())
        if (WidgetComponent.aSingletonMarker_838 == this.aSingletonMarker_8184) method3929(true)
    }

    private fun method3847(i: Int) {
        if (WidgetComponent.aSingletonMarker_838 != this.aSingletonMarker_8184) {
            val class196 = this.aSingletonMarker_8184
            this.aSingletonMarker_8184 = WidgetComponent.aSingletonMarker_838!!
            if (!class196.method1450(-45)) method3913(94.toByte())
            method3949((-113).toByte())
            this.aFloatArray8135 = aFloatArray8157
            method3929(true)
            anInt8100 = anInt8100 and 0x7.inv()
        }
        anInt7999++
    }

    fun method3848(i: Int): FloatCameraTransform {
        anInt8031++
        if (i != 5) method3890(false, 95.toByte())
        return (this.aClass101_Sub2Array8131[this.anInt8175])!!
    }

    fun method3849(i: Byte, i_76_: Int, trigLookupTables: TrigLookupTables?) {
        try {
            if (i.toInt() != 47) this.aFloat8087 = -0.68323714f
            anInt8036++
            method3924(false, false, i_76_, trigLookupTables, false)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.NJ(" + i + ',' + i_76_ + ',' + (if (trigLookupTables != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3709(i: Int, i_77_: Int, i_78_: Int, i_79_: Int, i_80_: Int, i_81_: Int) {
        anInt7915++
        var f = -i.toFloat() + i_78_.toFloat()
        var f_82_ = i_79_.toFloat() - i_77_.toFloat()
        if (f != 0.0f || f_82_ != 0.0f) {
            val f_83_ = (1.0 / sqrt((f_82_ * f_82_ + f * f).toDouble())).toFloat()
            f_82_ *= f_83_
            f *= f_83_
        } else f = 1.0f
        if (method3878(i_77_.toFloat(), 0, i_78_.toFloat() + f, 0.0f, f_82_ + i_79_.toFloat(), 0.0f, i.toFloat())) {
            method3903(false)
            method3894(-28186, i_80_)
            method3849(47.toByte(), 0, RenderListTextureNode.aTrigLookupTables_9485)
            method3885(0, true, RenderListTextureNode.aTrigLookupTables_9485)
            method3817(112, i_81_)
            method3942(5)
            method3926(45.toByte(), false)
            method3907(true)
            method3926(48.toByte(), true)
            method3885(0, true, LoadingBarRenderer.aTrigLookupTables_4247)
            method3849(47.toByte(), 0, LoadingBarRenderer.aTrigLookupTables_4247)
        }
    }

    fun method3850(i: Byte, renderable: Renderable?) {
        try {
            if (anRenderableArray8098[this.anInt8175] !== renderable) {
                anRenderableArray8098[this.anInt8175] = renderable
                if (renderable != null) renderable.method63((-30).toByte())
                else method3819((-107).toByte())
                anInt8100 = anInt8100 and 0x1.inv()
            }
            val i_84_ = 96 / ((i - 20) / 42)
            anInt7900++
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.WA(" + i + ',' + (if (renderable != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3640(): AbstractCameraTransform {
        anInt7945++
        return this.aClass101_Sub2_8080
    }

    override fun A(i: Int, var_sprite: Sprite?, i_85_: Int, i_86_: Int) {
        try {
            anInt7940++
            val var_aa_Sub2 = var_sprite as IndexedSprite
            val interface18_impl3 = var_aa_Sub2.anInterface18_Impl3_5196
            method3864(81)
            method3850((-47).toByte(), interface18_impl3)
            method3817(99, 1)
            method3874(RenderQueueState.aRenderConfigFactory_6519, 114, RenderQueueState.aRenderConfigFactory_6519)
            method3849(47.toByte(), 0, RenderListTextureNode.aTrigLookupTables_9485)
            method3894(-28186, i)
            this.aClass101_Sub2_8074.method932(0.0f, this.anInt7962.toFloat(), this.anInt7931.toFloat(), (-52).toByte())
            method3915(0)
            this.aClass101_Sub2Array8131[0]!!.method932(1.0f, interface18_impl3!!.method71((-46).toByte(), this.anInt7962.toFloat()), interface18_impl3.method67(this.anInt7931.toFloat(), 109), (-37).toByte())
            this.aClass101_Sub2Array8131[0]!!.method920(interface18_impl3.method71((-52).toByte(), -i_86_.toFloat()), false, 0.0f, interface18_impl3.method67(-i_85_.toFloat(), 94))
            this.aConfigFlagUtilArray8113[0] = LightDetailOptionState.aConfigFlagUtil_6030
            method3905(127.toByte())
            method3933(-127)
            method3879(-8629)
            method3849(47.toByte(), 0, LoadingBarRenderer.aTrigLookupTables_4247)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.A(" + i + ',' + (if (var_sprite != null) "{...}" else "null") + ',' + i_85_ + ',' + i_86_ + ')'))
        }
    }

    override fun method3625(modelDefinition: ModelDefinition?, i: Int, i_87_: Int, i_88_: Int, i_89_: Int): AbstractModel {
        try {
            anInt8016++
            return Direct3dModel(this, modelDefinition, i, i_88_, i_89_, i_87_)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.EG(" + (if (modelDefinition != null) "{...}" else "null") + ',' + i + ',' + i_87_ + ',' + i_88_ + ',' + i_89_ + ')'))
        }
    }

    override fun method3669(canvas: Canvas?, i: Int, i_90_: Int) {
        do {
            try {
                anInt8025++
                var `object`: Any? = null
                if (canvas == null || canvas === this.aCanvas7925) `object` = anObject8020
                else if (aHashtable8014!!.containsKey(canvas)) `object` = aHashtable8014!!.get(canvas)
                if (`object` == null) throw RuntimeException()
                method3844(12727, canvas, `object`)
                if (canvas !== aCanvas7910) break
                method3917(false)
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("wga.HF(" + (if (canvas != null) "{...}" else "null") + ',' + i + ',' + i_90_ + ')'))
            }
            break
        } while (false)
    }

    abstract fun method3851(i: Int)

    override fun method3694(): Boolean {
        anInt7901++
        return false
    }

    fun method3852(i: Int, bool: Boolean) {
        anInt8003++
        if (bool == !this.aBoolean8148) {
            this.aBoolean8148 = bool
            method3827((-43).toByte())
        }
        if (i != 9) aFloatArray8140 = null
    }

    fun method3853(i: Int, configFlagUtil: ConfigFlagUtil?) {
        try {
            anInt8057++
            if (i != -32) aFloatArray8142 = null
            this.aConfigFlagUtilArray8113[this.anInt8175] = configFlagUtil
            method3905(111.toByte())
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.HI(" + i + ',' + (if (configFlagUtil != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3695(): Boolean {
        anInt7991++
        return true
    }

    fun method3854(i: Byte): FloatCameraTransform {
        anInt7983++
        val i_91_ = 97 / ((i - 35) / 63)
        return aClass101_Sub2_8084
    }

    abstract fun method3855(textureFormatInfo: TextureFormatInfo?, i: Int, i_92_: Int, fs: FloatArray?, bool: Boolean, i_93_: Int, i_94_: Int, i_95_: Int): Renderable2dTexture?

    private fun method3856(i: Byte) {
        anInt8044++
        if (aAbstractRenderPass_8143 != null) aAbstractRenderPass_8143!!.method3522(-16252)
        method3851(25644)
        if (i <= 56) aBoolean8176 = false
    }

    fun method3857(i: Byte) {
        val i_96_ = -76 % ((i - 44) / 41)
        anInt8051++
        if (anInt8100 != 16) {
            method3847(0)
            method3838(true, true)
            method3890(true, 125.toByte())
            method3946(-32, true)
            method3817(123, 1)
            anInt8100 = 16
        }
    }

    override fun method3629(i: Int, i_97_: Int, bool: Boolean): AbstractModelRenderer {
        anInt8040++
        return AnimatedModelRenderer(this, i, i_97_, bool)
    }

    abstract fun method3858(bool: Boolean): Float

    abstract fun method3859(i: Int)

    private fun method3860(cameraRotationStub: CameraRotationStub?, i: Int, i_98_: Int) {
        try {
            method3925(-96, anInterface5_Impl1_8193, 0)
            anInt8067++
            method3862(0, aModelBatchBase_8197)
            method3899(i, 0, cameraRotationStub, true)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.QI(" + (if (cameraRotationStub != null) "{...}" else "null") + ',' + i + ',' + i_98_ + ')'))
        }
    }

    abstract fun method3861(i: Int, i_99_: Byte, i_100_: Int, movementDirection: MovementDirection?, textureFormatInfo: TextureFormatInfo?): Renderable2dTexture?

    abstract fun method3862(i: Int, modelBatchBase: ModelBatchBase?)

    fun method3863(i: Int): Int {
        val i_101_ = -95 / ((i - 7) / 57)
        anInt7917++
        return anInt8099
    }

    override fun K(`is`: IntArray?) {
        try {
            `is`!![0] = this.anInt8106
            anInt8061++
            `is`[3] = this.anInt8096
            `is`[2] = this.anInt8183
            `is`[1] = this.anInt8165
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, "wga.K(" + (if (`is` != null) "{...}" else "null") + ')')
        }
    }

    fun method3864(i: Int) {
        val i_102_ = 51 / ((40 - i) / 34)
        if (anInt8100 != 2) {
            method3845(76.toByte())
            method3838(true, false)
            method3866(false, true)
            method3890(false, 102.toByte())
            method3946(-32, false)
            method3814(false, false, -2, 43.toByte())
            anInt8100 = 2
        }
        anInt7930++
    }

    override fun method3705(): AbstractCameraTransform {
        anInt8077++
        return aClass101_Sub2_8196
    }

    override fun C(bool: Boolean) {
        this.aBoolean8124 = bool
        anInt7989++
        method3841((-116).toByte())
    }

    fun method3865(bool: Boolean, i: Int) {
        if (bool == !this.aBoolean8110) {
            this.aBoolean8110 = bool
            method3818(true)
        }
        anInt7953++
    }

    fun method3866(bool: Boolean, bool_103_: Boolean) {
        anInt8010++
        if (!this.aBoolean8145 != !bool) {
            this.aBoolean8145 = bool
            method3883(-24)
            anInt8100 = anInt8100 and 0x7.inv()
        }
        if (bool_103_ != true) this.anInt8095 = 22
    }

    override fun method3703(i: Int, i_104_: Int, i_105_: Int, i_106_: Int, i_107_: Int, i_108_: Int, var_sprite: Sprite?, i_109_: Int, i_110_: Int, i_111_: Int, i_112_: Int, i_113_: Int) {
        try {
            anInt7914++
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.IF(" + i + ',' + i_104_ + ',' + i_105_ + ',' + i_106_ + ',' + i_107_ + ',' + i_108_ + ',' + (if (var_sprite != null) "{...}" else "null") + ',' + i_109_ + ',' + i_110_ + ',' + i_111_ + ',' + i_112_ + ',' + i_113_ + ')'))
        }
    }

    override fun method3639(): Boolean {
        anInt8073++
        return aAbstractRenderPassArray8139[3]!!.method3530(-78)
    }

    fun method3867(f: Float, i: Int) {
        anInt8024++
        if (f != aFloat8155) {
            aFloat8155 = f
            method3846(30.toByte())
        }
        val i_114_ = 72 % ((-8 - i) / 36)
    }

    abstract fun method3868(bool: Boolean)

    fun method3869(i: Byte, bool: Boolean, i_115_: Int): NativeHeapBuffer {
        val i_116_ = -44 % ((-27 - i) / 52)
        anInt7916++
        return this.aNativeHeap7891!!.a(i_115_, bool)
    }

    override fun E(): Int {
        anInt7951++
        return (this.anInt8079 + this.anInt8062 + this.anInt8063)
    }

    abstract fun method3871(cameraNodeList: CameraNodeList?, i: Int)

    abstract fun method3872(i: Int, i_117_: Int, textureFormatInfo: TextureFormatInfo?, bool: Boolean, i_118_: Int, `is`: ByteArray?): Renderable3dTexture?

    override fun KA(i: Int, i_119_: Int, i_120_: Int, i_121_: Int) {
        anInt7972++
        if (i <= 0 && i_120_ >= -1 + this.anInt7931 && i_119_ <= 0 && this.anInt7962 - 1 <= i_121_) la()
        else {
            this.anInt8165 = max(i_119_, 0)
            this.anInt8106 = max(i, 0)
            this.anInt8096 = if (this.anInt7931 >= i_121_) i_121_ else 0
            this.anInt8183 = if (i_120_ > this.anInt7931) 0 else i_120_
            if (!this.aBoolean8209) {
                this.aBoolean8209 = true
                method3921(1)
            }
            method3888(6259)
            method3904(-70)
        }
    }

    override fun method3648(i: Int, i_122_: Int, `is`: Array<IntArray?>, is_123_: Array<IntArray?>?, i_124_: Int, i_125_: Int, i_126_: Int): TerrainTile {
        try {
            anInt8011++
            return NativeTerrainTile(this, i_125_, i_126_, i, i_122_, `is`, is_123_, i_124_)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.VE(" + i + ',' + i_122_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_123_ != null) "{...}" else "null") + ',' + i_124_ + ',' + i_125_ + ',' + i_126_ + ')'))
        }
    }

    override fun method3650(i: Int) {
        anInt7908++
    }

    override fun method3678(i: Int) {
        anInt8002++
    }

    fun method3874(renderConfigFactory: RenderConfigFactory?, i: Int, renderConfigFactory_129_: RenderConfigFactory?) {
        do {
            try {
                anInt7959++
                var bool = false
                if (renderConfigFactory_129_ != (this.aRenderConfigFactoryArray8086[this.anInt8175])) {
                    this.aRenderConfigFactoryArray8086[(this.anInt8175)] = renderConfigFactory_129_
                    method3920(10)
                    bool = true
                }
                if (i <= 97) method3888(89)
                if ((this.aRenderConfigFactoryArray8092[this.anInt8175]) != renderConfigFactory) {
                    this.aRenderConfigFactoryArray8092[(this.anInt8175)] = renderConfigFactory
                    bool = true
                    method3935(-100)
                }
                if (!bool) break
                anInt8100 = anInt8100 and 0x1d.inv()
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("wga.RI(" + (if (renderConfigFactory != null) "{...}" else "null") + ',' + i + ',' + (if (renderConfigFactory_129_ != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    override fun method3696(i: Int) {
        anInt7995++
        require(!(i < 128 || i > 1024))
        if (aMaterialTextureCache_8137 != null) aMaterialTextureCache_8137.method3585(7271)
        this.anInt8150 = i
    }

    private fun method3875(i: Int, bool: Boolean, bool_130_: Boolean, i_131_: Int, i_132_: Int, i_133_: Int) {
        var i = i
        var bool_130_ = bool_130_
        var i_131_ = i_131_
        var i_132_ = i_132_
        if (i_133_ >= -26) this.aModelBatchBase_8204 = null
        anInt7932++
        bool_130_ = bool_130_ and method3639()
        if (!bool_130_ && (i_131_ == 4 || i_131_ == 8 || i_131_ == 9)) {
            i_131_ = 2
            i_132_ = if (i_131_ == 4) i and 0x1 else 1
            i = 0
        }
        if (i_131_ != 0 && bool) i_131_ = i_131_ or 0x7fffffff.inv()
        if (anInt8156 != i_131_) {
            if (anInt8156 != 0) aAbstractRenderPassArray8139[0x7fffffff and anInt8156]!!.method3520(87.toByte())
            if (i_131_ != 0) {
                aAbstractRenderPass_8143 = aAbstractRenderPassArray8139[0x7fffffff and i_131_]
                aAbstractRenderPass_8143!!.method3525(15192, bool)
                aAbstractRenderPass_8143!!.method3521(bool, (-103).toByte())
                aAbstractRenderPass_8143!!.method3526(10756, i, i_132_)
            } else aAbstractRenderPass_8143 = null
            anInt8156 = i_131_
            anInt8161 = i
            anInt8108 = i_132_
        } else if (anInt8156 != 0) {
            aAbstractRenderPassArray8139[0x7fffffff and anInt8156]!!.method3521(bool, (-103).toByte())
            if (i != anInt8161 || anInt8108 != i_132_) {
                aAbstractRenderPassArray8139[anInt8156 and 0x7fffffff]!!.method3526(10756, i, i_132_)
                anInt8108 = i_132_
                anInt8161 = i
            }
        }
    }

    override fun za(i: Int, i_134_: Int, i_135_: Int, i_136_: Int, i_137_: Int) {
        anInt8026++
        method3903(false)
        method3894(-28186, i_136_)
        method3849(47.toByte(), 0, RenderListTextureNode.aTrigLookupTables_9485)
        method3885(0, true, RenderListTextureNode.aTrigLookupTables_9485)
        method3817(83, i_137_)
        this.aClass101_Sub2_8074.method932(1.0f, i_135_.toFloat(), i_135_.toFloat(), (-75).toByte())
        this.aClass101_Sub2_8074.method891(i, i_134_, 0)
        method3915(0)
        method3926(75.toByte(), false)
        method3925(23, anInterface5_Impl1_8201, 0)
        method3862(0, aModelBatchBase_8190)
        method3899(256, 0, AsyncResourceRequest.aCameraRotationStub_9661, true)
        method3926(41.toByte(), true)
        method3885(0, true, LoadingBarRenderer.aTrigLookupTables_4247)
        method3849(47.toByte(), 0, LoadingBarRenderer.aTrigLookupTables_4247)
    }

    override fun i(): Int {
        anInt8021++
        return this.anInt8095
    }

    abstract fun method3876(i: Int, canvas: Canvas?): Any?

    override fun la() {
        this.anInt8183 = this.anInt7931
        this.anInt8096 = this.anInt7962
        anInt8037++
        this.anInt8165 = 0
        this.anInt8106 = 0
        if (this.aBoolean8209) {
            this.aBoolean8209 = false
            method3921(1)
        }
        method3904(-95)
    }

    fun method3877(i: Byte): Int {
        if (i.toInt() != -126) return -10
        anInt7973++
        return this.anInt8175
    }

    override fun f(i: Int, i_138_: Int) {
        anInt7976++
        if (i != this.anInt8095 || this.anInt8154 != i_138_) {
            this.anInt8154 = i_138_
            this.anInt8095 = i
            method3831(19.toByte())
            method3846(127.toByte())
            method3856(57.toByte())
        }
    }

    override fun method3697(i: Int, i_139_: Int, i_140_: Int, i_141_: Int, i_142_: Int, i_143_: Int): CircleRasterizer {
        anInt7892++
        return CubemapTextureImplSource(this, i, i_139_, i_140_, i_141_, i_142_, i_143_)
    }

    private fun method3878(f: Float, i: Int, f_144_: Float, f_145_: Float, f_146_: Float, f_147_: Float, f_148_: Float): Boolean {
        if (i != 0) return true
        anInt8066++
        val buffer = anInterface5_Impl1_8203!!.method19(true, 26775)
        if (buffer == null) return false
        val stream = method3893(buffer, 9179)
        if (Stream.c()) {
            stream.a(f_148_)
            stream.a(f)
            stream.a(f_145_)
            stream.a(f_144_)
            stream.a(f_146_)
            stream.a(f_147_)
        } else {
            stream.b(f_148_)
            stream.b(f)
            stream.b(f_145_)
            stream.b(f_144_)
            stream.b(f_146_)
            stream.b(f_147_)
        }
        stream.a()
        return anInterface5_Impl1_8203!!.method18(i xor 0x18bb)
    }

    fun method3879(i: Int) {
        if (this.aConfigFlagUtilArray8113[this.anInt8175] != ParticleEmitterListNode.aConfigFlagUtil_9685) {
            this.aConfigFlagUtilArray8113[this.anInt8175] = ParticleEmitterListNode.aConfigFlagUtil_9685
            this.aClass101_Sub2Array8131[this.anInt8175]!!.method910()
            method3905(95.toByte())
        }
        if (i == -8629) anInt7896++
    }

    override fun ra(i: Int, i_149_: Int, i_150_: Int, i_151_: Int) {
        anInt8179 = i_150_
        anInt8177 = i_151_
        anInt8099 = i_149_
        anInt8064++
        this.aBoolean8160 = true
        anInt8162 = i
    }

    abstract fun method3880(movementDirection: MovementDirection?, textureFormatInfo: TextureFormatInfo?, i: Byte): Boolean

    abstract fun method3881(`object`: Any?, i: Byte, canvas: Canvas?)

    open fun method3882(i: Byte) {
        if (i < 45) this.aFloat8174 = -0.73899394f
        anInt7982++
        method3916(103.toByte())
    }

    abstract fun method3883(i: Int)

    override fun xa(f: Float) {
        if (this.aFloat8093 != f) {
            this.aFloat8093 = f
            this.aNativeInterface7924!!.setAmbient(f)
            method3928(0)
            method3884(101.toByte())
        }
        anInt7980++
    }

    abstract fun method3884(i: Byte)

    override fun method3655(): Boolean {
        anInt7913++
        return true
    }

    override fun method3659(i: Int) {
        anInt7954++
    }

    override fun method3644(): Boolean {
        anInt8054++
        return true
    }

    override fun method3676(i: Int, i_152_: Int, i_153_: Int, i_154_: Int, i_155_: Int, i_156_: Int, i_157_: Int, i_158_: Int, i_159_: Int, i_160_: Int, i_161_: Int, i_162_: Int, i_163_: Int) {
        anInt8032++
    }

    fun method3885(i: Int, bool: Boolean, trigLookupTables: TrigLookupTables?) {
        do {
            try {
                method3829(trigLookupTables, i, 80.toByte(), false)
                anInt8041++
                if (bool == true) break
                method3643(null, -42, 69)
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("wga.IH(" + i + ',' + bool + ',' + (if (trigLookupTables != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    override fun T(i: Int, i_164_: Int, i_165_: Int, i_166_: Int) {
        anInt8043++
        var bool = false
        if (this.anInt8106 < i) {
            bool = true
            this.anInt8106 = i
        }
        if (this.anInt8183 > i_165_) {
            this.anInt8183 = i_165_
            bool = true
        }
        if (this.anInt8165 < i_164_) {
            bool = true
            this.anInt8165 = i_164_
        }
        if (this.anInt8096 > i_166_) {
            this.anInt8096 = i_166_
            bool = true
        }
        if (bool) {
            if (!this.aBoolean8209) {
                this.aBoolean8209 = true
                method3921(1)
            }
            method3888(6259)
            method3904(-128)
        }
    }

    fun method3887(i: Byte): FloatCameraTransform {
        val i_167_ = 62 / ((i - -58) / 33)
        anInt7941++
        return this.aClass101_Sub2_8083
    }

    abstract fun method3888(i: Int)

    override fun method3682(): Boolean {
        anInt8056++
        return true
    }

    abstract fun method3889(bool: Boolean, i: Int): VertexBufferResource

    fun method3890(bool: Boolean, i: Byte) {
        if (i <= 10) this.aNativeHeapBuffer7974 = null
        if (bool == !this.aBoolean8164) {
            this.aBoolean8164 = bool
            method3859(3)
            anInt8100 = anInt8100 and 0x1f.inv()
        }
        anInt8072++
    }

    fun method3891(fs: FloatArray?, i: Int, i_168_: Int, textureFormatInfo: TextureFormatInfo?, i_169_: Int, bool: Boolean): Renderable2dTexture? {
        try {
            val i_170_ = 97 / ((i_169_ - -38) / 57)
            anInt8052++
            return method3855(textureFormatInfo, i, 0, fs, bool, 0, 2, i_168_)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.LI(" + (if (fs != null) "{...}" else "null") + ',' + i + ',' + i_168_ + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + i_169_ + ',' + bool + ')'))
        }
    }

    abstract fun method3892(i: Int)

    fun method3893(buffer: Buffer?, i: Int): Stream {
        try {
            anInt8048++
            aStream8088!!.a(buffer!!)
            if (i != 9179) this.aFloat8093 = -1.2765714f
            return aStream8088!!
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.FI(" + (if (buffer != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    override fun EA(i: Int, i_171_: Int, i_172_: Int, i_173_: Int) {
        anInt7909++
        if (!this.aBoolean8160) throw RuntimeException("")
        anInt8179 = i_172_
        anInt8162 = i
        anInt8177 = i_173_
        anInt8099 = i_171_
        if (aBoolean8153) {
            aAbstractRenderPassArray8139[3]!!.method3528(102)
            aAbstractRenderPassArray8139[3]!!.method3522(-16252)
        }
    }

    override fun method3632(`is`: IntArray?) {
        try {
            `is`!![1] = this.anInt7962
            `is`[0] = this.anInt7931
            anInt8076++
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, "wga.KE(" + (if (`is` != null) "{...}" else "null") + ')')
        }
    }

    override fun method3653(circleRasterizer: CircleRasterizer?) {
        try {
            aClass299_Sub2_8171 = circleRasterizer as TextureCubeProvider?
            anInt7950++
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, "wga.DF(" + (if (circleRasterizer != null) "{...}" else "null") + ')')
        }
    }

    fun method3894(i: Int, i_174_: Int) {
        if (i_174_ != this.anInt8119) {
            this.anInt8119 = i_174_
            method3945(-120)
        }
        if (i != -28186) this.aFloat8186 = 0.24125333f
        anInt7998++
    }

    override fun L(i: Int, i_175_: Int, i_176_: Int) {
        anInt8078++
        if (i != this.anInt8144 || this.anInt8091 != i_175_ || i_176_ != this.anInt8105) {
            this.anInt8144 = i
            this.anInt8105 = i_176_
            this.anInt8091 = i_175_
            method3856(119.toByte())
            method3827((-72).toByte())
        }
    }

    private fun method3895(i: Int) {
        anInt8035++
        if (i != -8) method3644()
        if (HintIconState.aSingletonMarker_2372 != this.aSingletonMarker_8184) {
            val class196 = this.aSingletonMarker_8184
            this.aSingletonMarker_8184 = HintIconState.aSingletonMarker_2372!!
            if (!class196.method1450(-90)) method3913(60.toByte())
            method3906(118.toByte())
            this.aFloatArray8135 = aFloatArray8152
            method3929(true)
            anInt8100 = anInt8100 and 0x7.inv()
        }
    }

    fun method3897(i: Int, i_177_: Int) {
        if (i != this.anInt8175) {
            this.anInt8175 = i
            method3868(false)
        }
        if (i_177_ != -4382) this.anInt8106 = 67
        anInt7961++
    }

    abstract fun method3898(i: Int)

    override fun method3630(bool: Boolean) {
        anInt8068++
    }

    abstract fun method3899(i: Int, i_178_: Int, cameraRotationStub: CameraRotationStub?, bool: Boolean)

    override fun DA(i: Int, i_179_: Int, i_180_: Int, i_181_: Int) {
        this.anInt8130 = i_179_
        this.anInt8134 = i_181_
        anInt8009++
        this.anInt8094 = i
        this.anInt8129 = i_180_
        method3846(127.toByte())
        method3831(19.toByte())
        method3932((-118).toByte())
        method3904(-82)
    }

    abstract fun method3900(`is`: Array<IntArray?>?, bool: Boolean, i: Int, i_182_: Int): RenderableCubeTexture?

    abstract fun method3901(i: Byte)

    fun method3902(i: Byte) {
        anInt7946++
        if (i.toInt() != -42) method3711(null, -98, 55, 15, 73, false)
        val hashtable: Hashtable<Any?, Any?> = Hashtable<Any?, Any?>()
        if (aHashtable8014 != null && !aHashtable8014!!.isEmpty()) {
            val enumeration = aHashtable8014!!.keys()
            while (enumeration.hasMoreElements()) {
                val canvas = enumeration.nextElement() as Canvas?
                hashtable.put(canvas, method3876(-1, canvas))
            }
        }
        aHashtable8014 = hashtable
        method3828(false)
        method3816((-87).toByte())
        method3914((-107).toByte())
        aGroundDecorRenderer_8136!!.method2100(124.toByte(), this)
    }

    private fun method3903(bool: Boolean) {
        if (anInt8100 != 1) {
            method3845(24.toByte())
            method3838(true, false)
            method3866(false, true)
            method3890(false, 55.toByte())
            method3946(-32, false)
            method3814(false, false, -2, 112.toByte())
            method3923(!bool, 1)
            method3850((-47).toByte(), this.anRenderable_8147)
            anInt8100 = 1
        }
        if (bool != false) EA(-102, -47, -121, -51)
        anInt7981++
    }

    override fun r(i: Int, i_183_: Int, i_184_: Int, i_185_: Int, i_186_: Int, i_187_: Int, i_188_: Int): Int {
        anInt7960++
        var i_189_ = 0
        val f = ((this.aClass101_Sub2_8080.aFloat5724) + ((this.aClass101_Sub2_8080.aFloat5691) * i_183_.toFloat() + (i.toFloat() * (this.aClass101_Sub2_8080.aFloat5736)) + (i_184_.toFloat() * (this.aClass101_Sub2_8080.aFloat5716))))
        val f_190_ = ((this.aClass101_Sub2_8080.aFloat5736) * i_185_.toFloat() + (this.aClass101_Sub2_8080.aFloat5691) * i_186_.toFloat() + (this.aClass101_Sub2_8080.aFloat5716) * i_187_.toFloat() + (this.aClass101_Sub2_8080.aFloat5724))
        if (!(this.anInt8095.toFloat() > f) || !(f_190_ < this.anInt8095.toFloat())) {
            if (this.anInt8154.toFloat() < f && this.anInt8154.toFloat() < f_190_) i_189_ = i_189_ or 0x20
        } else i_189_ = i_189_ or 0x10
        val i_191_ = ((i_183_.toFloat() * (this.aClass101_Sub2_8080.aFloat5700) + i.toFloat() * (this.aClass101_Sub2_8080.aFloat5711) + (i_184_.toFloat() * this.aClass101_Sub2_8080.aFloat5704) + (this.aClass101_Sub2_8080.aFloat5729)) * this.anInt8129.toFloat() / i_188_.toFloat()).toInt()
        val i_192_ = (this.anInt8129.toFloat() * ((this.aClass101_Sub2_8080.aFloat5729) + (i_185_.toFloat() * this.aClass101_Sub2_8080.aFloat5711 + (i_186_.toFloat() * (this.aClass101_Sub2_8080.aFloat5700)) + (i_187_.toFloat() * (this.aClass101_Sub2_8080.aFloat5704)))) / i_188_.toFloat()).toInt()
        if (this.aFloat8126 > i_191_.toFloat() && i_192_.toFloat() < this.aFloat8126) i_189_ = i_189_ or 0x1
        else if (this.aFloat8158 < i_191_.toFloat() && i_192_.toFloat() > this.aFloat8158) i_189_ = i_189_ or 0x2
        val i_193_ = (this.anInt8134.toFloat() * ((this.aClass101_Sub2_8080.aFloat5710) + ((this.aClass101_Sub2_8080.aFloat5732 * i_184_.toFloat()) + ((this.aClass101_Sub2_8080.aFloat5708) * i.toFloat() + (this.aClass101_Sub2_8080.aFloat5722) * i_183_.toFloat()))) / i_188_.toFloat()).toInt()
        val i_194_ = (this.anInt8134.toFloat() * ((this.aClass101_Sub2_8080.aFloat5732) * i_187_.toFloat() + (i_185_.toFloat() * this.aClass101_Sub2_8080.aFloat5708 + (i_186_.toFloat() * (this.aClass101_Sub2_8080.aFloat5722))) + this.aClass101_Sub2_8080.aFloat5710) / i_188_.toFloat()).toInt()
        if (!(i_193_.toFloat() < this.aFloat8103) || !(this.aFloat8103 > i_194_.toFloat())) {
            if (this.aFloat8185 < i_193_.toFloat() && this.aFloat8185 < i_194_.toFloat()) i_189_ = i_189_ or 0x8
        } else i_189_ = i_189_ or 0x4
        return i_189_
    }

    private fun method3904(i: Int) {
        anInt7885++
        if (i > -50) anInt8001 = 12
        this.aFloat8103 = (this.anInt8165 - this.anInt8130).toFloat()
        this.aFloat8126 = (this.anInt8106 + -this.anInt8094).toFloat()
        this.aFloat8185 = (this.anInt8096 + -this.anInt8130).toFloat()
        this.aFloat8158 = (-this.anInt8094 + this.anInt8183).toFloat()
    }

    private fun method3905(i: Byte) {
        method3940(1)
        if (i < 80) aNodeDeque_7927 = null
        anInt8047++
        if (aAbstractRenderPass_8143 != null) aAbstractRenderPass_8143!!.method3532(10425)
    }

    override fun method3643(canvas: Canvas?, i: Int, i_195_: Int) {
        do {
            try {
                anInt7955++
                if (canvas === this.aCanvas7925) throw RuntimeException()
                if (aHashtable8014!!.containsKey(canvas)) break
                if (!canvas!!.isShowing()) throw RuntimeException()
                canvas.setIgnoreRepaint(true)
                val `object` = method3876(-1, canvas)
                if (`object` == null) throw RuntimeException()
                aHashtable8014!!.put(canvas, `object`)
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("wga.VF(" + (if (canvas != null) "{...}" else "null") + ',' + i + ',' + i_195_ + ')'))
            }
            break
        } while (false)
    }

    override fun method3704(): Int {
        anInt7935++
        return -2 + this.anInt8138
    }

    private fun method3906(i: Byte) {
        if (i < 81) method3840(-113, false)
        if (!aBoolean8097) {
            val fs = aFloatArray8152
            val f = ((this.anInt8095 * -this.anInt8094).toFloat() / this.anInt8129.toFloat())
            val f_196_ = ((this.anInt8095 * (this.anInt7931 + -this.anInt8094)).toFloat() / this.anInt8129.toFloat())
            val f_197_ = ((this.anInt8095 * this.anInt8130).toFloat() / this.anInt8134.toFloat())
            val f_198_ = ((this.anInt8095 * (-this.anInt7962 + this.anInt8130)).toFloat() / this.anInt8134.toFloat())
            if (f == f_196_ || f_197_ == f_198_) {
                fs[12] = 0.0f
                fs[0] = 1.0f
                fs[13] = 0.0f
                fs[4] = 0.0f
                fs[3] = 0.0f
                fs[10] = 1.0f
                fs[15] = 1.0f
                fs[9] = 0.0f
                fs[14] = 0.0f
                fs[1] = 0.0f
                fs[2] = 0.0f
                fs[11] = 0.0f
                fs[6] = 0.0f
                fs[7] = 0.0f
                fs[8] = 0.0f
                fs[5] = 1.0f
            } else {
                val f_199_ = 2.0f * this.anInt8095.toFloat()
                fs[13] = 0.0f
                fs[3] = 0.0f
                fs[2] = 0.0f
                fs[11] = -1.0f
                fs[7] = 0.0f
                fs[5] = f_199_ / (-f_198_ + f_197_)
                fs[1] = 0.0f
                fs[12] = 0.0f
                aFloat8128 = ((this.anInt8154 * this.anInt8095).toFloat() / (this.anInt8095 - this.anInt8154).toFloat())
                fs[14] = aFloat8128
                fs[0] = f_199_ / (-f + f_196_)
                fs[15] = 0.0f
                fs[8] = (f_196_ + f) / (-f + f_196_)
                fs[9] = (f_197_ + f_198_) / (f_197_ - f_198_)
                aFloat8166 = (this.anInt8154.toFloat() / (-this.anInt8154 + this.anInt8095).toFloat())
                fs[10] = aFloat8166
                fs[4] = 0.0f
                fs[6] = 0.0f
            }
            method3912(-1568)
            aBoolean8097 = true
        }
        anInt7943++
    }

    private fun method3907(bool: Boolean) {
        anInt7888++
        method3925(-128, anInterface5_Impl1_8203, 0)
        method3862(0, aModelBatchBase_8205)
        method3899(1, 0, TileTransform.aCameraRotationStub_3217, bool)
    }

    override fun Y(): IntArray {
        anInt7886++
        return (intArrayOf(this.anInt8094, this.anInt8130, this.anInt8129, this.anInt8134))
    }

    private fun method3908(i: Byte) {
        if (i < 2) method3949(23.toByte())
        anInt8070++
        this.aFloat8089 = this.anInt8154.toFloat()
    }

    override fun method3688(i: Int, i_200_: Int, i_201_: Int, i_202_: Int, i_203_: Int, i_204_: Int, i_205_: Int) {
        anInt7942++
    }

    override fun method3683(i: Int, i_206_: Int, i_207_: Int, i_208_: Int, bool: Boolean): AbstractModelRenderer {
        anInt7993++
        val class105_sub1 = AnimatedModelRenderer(this, i_207_, i_208_, bool)
        class105_sub1.method979(0, 0, i_207_, i_208_, i, i_206_)
        return class105_sub1
    }

    fun method3909(i: Byte, i_209_: Int) {
        method3894(-28186, i.toInt() or (i.toInt() shl 8 or (i.toInt() shl 16 or (i.toInt() shl 24))))
        anInt7996++
        if (i_209_ > -103) method3887(51.toByte())
    }

    abstract fun method3910(i: Byte, i_210_: Int)

    override fun method3685(nodeDequeHolder: NodeDequeHolder, i: Int) {
        try {
            aGroundDecorRenderer_8136!!.method2101(this, nodeDequeHolder, i, 0)
            anInt7968++
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.FG(" + (if (nodeDequeHolder != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    override fun method3691(spriteImage: SpriteImage?, bool: Boolean): AbstractModelRenderer {
        try {
            anInt7978++
            val abstractModelRenderer: AbstractModelRenderer
            if (spriteImage!!.anInt2702 == 0 || spriteImage.anInt2696 == 0) abstractModelRenderer = this.method3662(1, IntArray(1), 94.toByte(), 0, 1, 1)!!
            else {
                val `is` = IntArray((spriteImage.anInt2702 * spriteImage.anInt2696))
                var i = 0
                var i_211_ = 0
                if (spriteImage.aByteArray2695 == null) {
                    var i_212_ = 0
                    while ((i_212_ < spriteImage.anInt2696)) {
                        for (i_213_ in 0..<spriteImage.anInt2702) {
                            val i_214_ = (spriteImage.anIntArray2697[0xff and (spriteImage.aByteArray2699[i++]).toInt()])
                            `is`[i_211_++] = (if (i_214_ != 0) WhirlpoolHash.method2057(i_214_, -16777216) else 0)
                        }
                        i_212_++
                    }
                } else {
                    for (i_215_ in 0..<spriteImage.anInt2696) {
                        var i_216_ = 0
                        while (spriteImage.anInt2702 > i_216_) {
                            `is`[i_211_++] = (WhirlpoolHash.method2057((spriteImage.anIntArray2697[WhirlpoolHash.method1166((spriteImage.aByteArray2699[i]).toInt(), 255)]), (spriteImage.aByteArray2695!![i].toInt() shl 24)))
                            i++
                            i_216_++
                        }
                    }
                }
                abstractModelRenderer = this.method3662(spriteImage.anInt2702, `is`, 94.toByte(), 0, spriteImage.anInt2702, spriteImage.anInt2696)!!
            }
            abstractModelRenderer.method985(spriteImage.anInt2703, spriteImage.anInt2700, spriteImage.anInt2698, spriteImage.anInt2701)
            return abstractModelRenderer
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.GF(" + (if (spriteImage != null) "{...}" else "null") + ',' + bool + ')'))
        }
    }

    override fun method3636(i: Int, i_217_: Int, i_218_: Int, i_219_: Int, i_220_: Int, i_221_: Int, var_sprite: Sprite?, i_222_: Int, i_223_: Int) {
        try {
            anInt7918++
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.ME(" + i + ',' + i_217_ + ',' + i_218_ + ',' + i_219_ + ',' + i_220_ + ',' + i_221_ + ',' + (if (var_sprite != null) "{...}" else "null") + ',' + i_222_ + ',' + i_223_ + ')'))
        }
    }

    override fun method3663() {
        anInt7887++
        if (aMaterialTextureCache_8137 != null) aMaterialTextureCache_8137.method3585(7271)
    }

    abstract fun method3911(canvas: Canvas?, i: Int, `object`: Any?)

    override fun method3654(): AbstractCameraTransform {
        anInt8060++
        return FloatCameraTransform()
    }

    private fun method3912(i: Int) {
        aFloatArray8152[14] = aFloat8128
        anInt8022++
        if (i == -1568) {
            aFloatArray8152[10] = aFloat8166
            this.aFloat8169 = ((aFloatArray8152[14] - this.anInt8154.toFloat()) / aFloatArray8152[10])
        }
    }

    private fun method3913(i: Byte) {
        val i_224_ = -106 / ((-8 - i) / 33)
        anInt8058++
        aBoolean8121 = false
        if (aAbstractRenderPass_8143 != null) aAbstractRenderPass_8143!!.method3531(false)
        method3898(12)
    }

    private fun method3914(i: Byte) {
        anInt7922++
        anInterface5_Impl1_8201 = method3889(false, 16711680)
        if (i <= -97) {
            anInterface5_Impl1_8201!!.method20(3096, 126.toByte(), 12)
            for (i_225_ in 0..3) {
                val buffer = anInterface5_Impl1_8201!!.method19(true, 26775)
                if (buffer != null) {
                    val stream = method3893(buffer, 9179)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    for (i_226_ in 0..256) {
                        val d = (3.141592653589793 * (i_226_ * 2).toDouble() / 256.0)
                        val f = cos(d).toFloat()
                        val f_227_ = sin(d).toFloat()
                        if (Stream.c()) {
                            stream.a(f_227_)
                            stream.a(f)
                            stream.a(0.0f)
                        } else {
                            stream.b(f_227_)
                            stream.b(f)
                            stream.b(0.0f)
                        }
                    }
                    stream.a()
                    if (anInterface5_Impl1_8201!!.method18(6331)) break
                }
            }
            aModelBatchBase_8190 = method3812(0, (arrayOf<DirectionPath>(DirectionPath(SpriteMaskShape.aSpriteMaskShape_4073!!))))
        }
    }

    fun method3915(i: Int) {
        this.aBoolean8069 = false
        anInt7964++
        method3836(1)
        if (i != 0) aFloatArray8142 = null
    }

    private fun method3916(i: Byte) {
        anInt8075++
        method3928(0)
        method3842(true)
        method3883(106)
        method3823(53.toByte())
        if (i.toInt() != 103) method3840(-124, true)
        method3892(0)
        method3884(101.toByte())
        method3818(true)
        method3859(i + -100)
        method3841((-116).toByte())
        method3827((-117).toByte())
        method3851(25644)
        method3947(4)
        method3950(0)
        method3939(100.toByte())
        for (i_228_ in this.anInt8090 + -1 downTo 0) {
            method3897(i_228_, i.toInt() xor 0x117a.inv())
            method3920(i.toInt() xor 0x6d)
            method3935(-101)
            method3879(i + -8732)
        }
        method3945(-127)
        method3937((-33).toByte())
        method3813(true)
        method3901((-102).toByte())
        method3898(12)
    }

    private fun method3917(bool: Boolean) {
        if (aCanvas7910 == null) {
            anInt7987 = 1
            anInt7958 = anInt7987
        } else {
            anInt7987 = aCanvas7910!!.getHeight()
            anInt7958 = aCanvas7910!!.getWidth()
        }
        if (bool != false) aHashtable8014 = null
        anInt8033++
        this.anInt7962 = anInt7987
        this.anInt7931 = anInt7958
        method3918(1)
        method3831(19.toByte())
        method3846(126.toByte())
        method3937((-33).toByte())
        method3904(-71)
        method3932((-126).toByte())
        la()
    }

    private fun method3918(i: Int) {
        anInt7904++
        if (i != 1) aStream8088 = null
        aBoolean8127 = false
        if (WidgetNodeLink.aSingletonMarker_2042 == this.aSingletonMarker_8184) {
            method3919(i + 20793)
            method3929(true)
        }
    }

    override fun P(i: Int, i_229_: Int, i_230_: Int, i_231_: Int, i_232_: Int) {
        anInt8013++
        method3709(i, i_229_, i, i_230_ + i_229_, i_231_, i_232_)
    }

    private fun method3919(i: Int) {
        if (i == 20794) {
            if (!aBoolean8127) {
                val fs = aFloatArray8120
                if (this.anInt7931 == 0 || this.anInt7962 == 0) {
                    fs[3] = 0.0f
                    fs[12] = 0.0f
                    fs[6] = 0.0f
                    fs[9] = 0.0f
                    fs[11] = 0.0f
                    fs[15] = 1.0f
                    fs[1] = 0.0f
                    fs[8] = 0.0f
                    fs[2] = 0.0f
                    fs[14] = 0.0f
                    fs[5] = 1.0f
                    fs[13] = 0.0f
                    fs[7] = 0.0f
                    fs[10] = 1.0f
                    fs[4] = 0.0f
                    fs[0] = 1.0f
                } else {
                    fs[9] = 0.0f
                    fs[12] = -1.0f
                    fs[2] = 0.0f
                    fs[0] = 2.0f / this.anInt7931.toFloat()
                    fs[4] = 0.0f
                    fs[15] = 1.0f
                    fs[13] = 1.0f
                    fs[6] = 0.0f
                    fs[3] = 0.0f
                    fs[10] = 0.5f
                    fs[8] = 0.0f
                    fs[1] = 0.0f
                    fs[14] = 0.5f
                    fs[7] = 0.0f
                    fs[5] = -2.0f / this.anInt7962.toFloat()
                    fs[11] = 0.0f
                }
                aBoolean8127 = true
            }
            anInt7970++
        }
    }

    override fun method3677(canvas: Canvas?) {
        try {
            anObject8020 = null
            anInt7936++
            aCanvas7910 = null
            if (canvas == null || canvas === this.aCanvas7925) {
                anObject8020 = this.anObject7919
                aCanvas7910 = this.aCanvas7925
            } else if (aHashtable8014!!.containsKey(canvas)) {
                anObject8020 = aHashtable8014!!.get(canvas)
                aCanvas7910 = canvas
            }
            if (aCanvas7910 == null || anObject8020 == null) throw RuntimeException()
            method3881(anObject8020, 99.toByte(), aCanvas7910)
            method3917(false)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, "wga.MF(" + (if (canvas != null) "{...}" else "null") + ')')
        }
    }

    abstract fun method3920(i: Int)

    abstract fun method3921(i: Int)

    override fun method3646(i: Int) {
        if (aMaterialTextureCache_8137 != null) aMaterialTextureCache_8137.method3586(-16130)
        anInt8059++
        this.anInt8146 = 0x7fffffff and i
    }

    override fun method3674(i: Int, i_233_: Int, i_234_: Int, i_235_: Int, i_236_: Int, i_237_: Int, i_238_: Int, i_239_: Int, i_240_: Int) {
        var i_240_ = i_240_
        anInt8046++
        var f = i_234_.toFloat() - i.toFloat()
        var f_241_ = i_235_.toFloat() - i_233_.toFloat()
        if (f != 0.0f || f_241_ != 0.0f) {
            val f_242_ = (1.0 / sqrt((f_241_ * f_241_ + f * f).toDouble())).toFloat()
            f *= f_242_
            f_241_ *= f_242_
        } else f = 1.0f
        method3903(false)
        method3894(-28186, i_236_)
        method3849(47.toByte(), 0, RenderListTextureNode.aTrigLookupTables_9485)
        method3885(0, true, RenderListTextureNode.aTrigLookupTables_9485)
        method3817(94, i_237_)
        method3942(5)
        method3926(86.toByte(), false)
        i_240_ %= i_238_ + i_239_
        val f_243_ = i_238_.toFloat() * f
        val f_244_ = i_238_.toFloat() * f_241_
        var f_245_ = 0.0f
        var f_246_ = 0.0f
        var f_247_ = f_243_
        var f_248_ = f_244_
        if (i_238_ >= i_240_) {
            f_248_ = (-i_240_ + i_238_).toFloat() * f_241_
            f_247_ = f * (i_238_ + -i_240_).toFloat()
        } else {
            f_246_ = (-i_240_ + (i_238_ - -i_239_)).toFloat() * f_241_
            f_245_ = f * (i_238_ + i_239_ - i_240_).toFloat()
        }
        var f_249_ = i.toFloat() + f_245_
        var f_250_ = f_246_ + i_233_.toFloat()
        val f_251_ = i_239_.toFloat() * f
        val f_252_ = f_241_ * i_239_.toFloat()
        while (true) {
            if (i_234_ > i) {
                if (f_249_ > i_234_.toFloat()) break
                if (i_234_.toFloat() < f_249_ + f_247_) f_247_ = i_234_.toFloat() - f_249_
            } else {
                if (f_249_ < i_234_.toFloat()) break
                if (i_234_.toFloat() > f_249_ + f_247_) f_247_ = i_234_.toFloat() - f_249_
            }
            if (i_233_ < i_235_) {
                if (i_235_.toFloat() < f_250_) break
                if (f_248_ + f_250_ > i_235_.toFloat()) f_248_ = i_235_.toFloat() - f_250_
            } else {
                if (f_250_ < i_235_.toFloat()) break
                if (f_248_ + f_250_ < i_235_.toFloat()) f_248_ = i_235_.toFloat() - f_250_
            }
            if (!method3878(f_250_, 0, f_249_ + f_247_, 0.0f, f_250_ + f_248_, 0.0f, f_249_)) return
            method3907(true)
            f_250_ += f_252_ + f_248_
            f_249_ += f_251_ + f_247_
            f_247_ = f_243_
            f_248_ = f_244_
        }
        method3926(88.toByte(), true)
        method3885(0, true, LoadingBarRenderer.aTrigLookupTables_4247)
        method3849(47.toByte(), 0, LoadingBarRenderer.aTrigLookupTables_4247)
    }

    override fun pa() {
        anInt7947++
        this.aBoolean8160 = false
    }

    fun method3922(bool: Boolean) {
        if (bool != false) M()
        anInt7911++
        val enumeration = aHashtable8014!!.keys()
        while (enumeration.hasMoreElements()) {
            val canvas = enumeration.nextElement() as Canvas?
            method3911(canvas, 1, aHashtable8014!!.get(canvas))
        }
        anInterface5_Impl1_8193!!.method21(23315)
        anInterface5_Impl1_8203!!.method21(23315)
        anInterface5_Impl1_8201!!.method21(23315)
        this.aClass64_Sub2_8198!!.method664(-23755)
        this.aClass64_Sub2_8194!!.method664(-23755)
        this.aClass64_Sub2_8187!!.method664(-23755)
        this.aClass64_Sub2_8199!!.method664(-23755)
        this.aClass64_Sub2_8189!!.method664(-23755)
        aGroundDecorRenderer_8136!!.method2105(-122)
        anInterface5_Impl2_8195!!.method21(23315)
    }

    fun method3923(bool: Boolean, i: Int) {
        if (i != 1) {
            if (i != 0) {
                if (i == 2) method3874(RenderQueueState.aRenderConfigFactory_6519, 117, MediaStreamClient.aRenderConfigFactory_3196)
                else if (i == 3) method3874(ParticleSystemState.aRenderConfigFactory_2207, 111, TheoraVideoStream.aRenderConfigFactory_9011)
                else if (i == 4) method3874(RegionTileNode.aRenderConfigFactory_6644, 126, RegionTileNode.aRenderConfigFactory_6644)
            } else method3874(ParticleSystemState.aRenderConfigFactory_2207, 120, ParticleSystemState.aRenderConfigFactory_2207)
        } else method3874(RenderQueueState.aRenderConfigFactory_6519, 127, RenderQueueState.aRenderConfigFactory_6519)
        anInt8034++
    }

    abstract fun method3924(bool: Boolean, bool_253_: Boolean, i: Int, trigLookupTables: TrigLookupTables?, bool_254_: Boolean)

    abstract fun method3925(i: Int, interface5_impl1: VertexBufferResource?, i_255_: Int)

    abstract fun method3926(i: Byte, bool: Boolean)

    override fun U(i: Int, i_256_: Int, i_257_: Int, i_258_: Int, i_259_: Int) {
        method3709(i, i_256_, i - -i_257_, i_256_, i_258_, i_259_)
        anInt7926++
    }

    fun method3927(bool: Boolean) {
        if (anInt8100 != 4) {
            method3845(49.toByte())
            method3838(true, false)
            method3866(false, bool)
            method3890(false, 108.toByte())
            method3946(-32, false)
            method3814(false, false, -2, 35.toByte())
            method3817(120, 1)
            method3923(true, 0)
            anInt8100 = 4
        }
        if (bool != true) this.aClass64_Sub2_8200 = null
        anInt7986++
    }

    abstract fun method3928(i: Int)

    override fun method3701(canvas: Canvas?) {
        do {
            try {
                anInt7906++
                if (this.aCanvas7925 === canvas) throw RuntimeException()
                if (!aHashtable8014!!.containsKey(canvas)) break
                method3911(canvas, 1, aHashtable8014!!.get(canvas))
                aHashtable8014!!.remove(canvas)
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, "wga.AG(" + (if (canvas != null) "{...}" else "null") + ')')
            }
            break
        } while (false)
    }

    override fun method3711(`is`: IntArray?, i: Int, i_260_: Int, i_261_: Int, i_262_: Int, bool: Boolean): AbstractModelRenderer {
        try {
            anInt7944++
            return AnimatedModelRenderer(this, i_261_, i_262_, `is`, i, i_260_)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.BE(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_260_ + ',' + i_261_ + ',' + i_262_ + ',' + bool + ')'))
        }
    }

    private fun method3929(bool: Boolean) {
        method3813(bool)
        anInt7949++
        if (aAbstractRenderPass_8143 != null) aAbstractRenderPass_8143!!.method3524(-14775)
    }

    fun method3930(i: Byte) {
        this.aClass101_Sub2Array8131 = arrayOfNulls<FloatCameraTransform>(this.anInt8090)
        anRenderableArray8098 = arrayOfNulls<Renderable>(this.anInt8090)
        this.aRenderConfigFactoryArray8086 = arrayOfNulls<RenderConfigFactory>(this.anInt8090)
        this.aRenderConfigFactoryArray8092 = arrayOfNulls<RenderConfigFactory>(this.anInt8090)
        this.aConfigFlagUtilArray8113 = arrayOfNulls<ConfigFlagUtil>(this.anInt8090)
        anInt7889++
        var i_263_ = 0
        while (this.anInt8090 > i_263_) {
            this.aRenderConfigFactoryArray8092[i_263_] = ParticleSystemState.aRenderConfigFactory_2207
            this.aRenderConfigFactoryArray8086[i_263_] = ParticleSystemState.aRenderConfigFactory_2207
            this.aConfigFlagUtilArray8113[i_263_] = ParticleEmitterListNode.aConfigFlagUtil_9685
            this.aClass101_Sub2Array8131[i_263_] = FloatCameraTransform()
            i_263_++
        }
        this.aClass348_Sub1Array8132 = arrayOfNulls<AbstractTileShape>(-2 + this.anInt8138)
        this.anRenderable_8147 = method3861(1, (-84).toByte(), 1, MovementDirection.aMovementDirection_1183, GroundItemRenderState.aTextureFormatInfo_1662)
        method3651(ArbVertexProgram(262144))
        this.aModelBatchBase_8204 = method3812(0, (arrayOf<DirectionPath>(DirectionPath(arrayOf<SpriteMaskShape?>(SpriteMaskShape.aSpriteMaskShape_4073, SpriteMaskShape.aSpriteMaskShape_4078)))))
        this.aModelBatchBase_8202 = method3812(i.toInt() xor 0x1a, (arrayOf<DirectionPath>(DirectionPath(arrayOf<SpriteMaskShape?>(SpriteMaskShape.aSpriteMaskShape_4073, SpriteMaskShape.aSpriteMaskShape_4076)))))
        this.aModelBatchBase_8208 = method3812(0, (arrayOf<DirectionPath>(DirectionPath(SpriteMaskShape.aSpriteMaskShape_4073!!), DirectionPath(SpriteMaskShape.aSpriteMaskShape_4076!!), DirectionPath(SpriteMaskShape.aSpriteMaskShape_4078!!), DirectionPath(SpriteMaskShape.aSpriteMaskShape_4075!!))))
        this.aModelBatchBase_8191 = method3812(0, (arrayOf<DirectionPath>(DirectionPath(SpriteMaskShape.aSpriteMaskShape_4073!!), DirectionPath(SpriteMaskShape.aSpriteMaskShape_4076!!), DirectionPath(SpriteMaskShape.aSpriteMaskShape_4078!!))))
        this.aClass64_Sub2_8206 = Direct3dModel(this, 0, 0, false, false)
        this.aClass64_Sub2_8198 = Direct3dModel(this, 0, 0, true, true)
        this.aClass64_Sub2_8192 = Direct3dModel(this, 0, 0, false, false)
        this.aClass64_Sub2_8194 = Direct3dModel(this, 0, 0, true, true)
        this.aClass64_Sub2_8200 = Direct3dModel(this, 0, 0, false, false)
        this.aClass64_Sub2_8187 = Direct3dModel(this, 0, 0, true, true)
        this.aClass64_Sub2_8188 = Direct3dModel(this, 0, 0, false, false)
        this.aClass64_Sub2_8199 = Direct3dModel(this, 0, 0, true, true)
        this.aClass64_Sub2_8207 = Direct3dModel(this, 0, 0, false, false)
        this.aClass64_Sub2_8189 = Direct3dModel(this, 0, 0, true, true)
        aGroundDecorRenderer_8136 = GroundDecorRenderer(this)
        anInterface5_Impl2_8195 = method3840(-28633, true)
        method3902((-42).toByte())
        this.aNormalMapGenerator_7937 = NormalMapGenerator(this)
        aAbstractRenderPassArray8139[1] = method3832(1, (-103).toByte())
        aAbstractRenderPassArray8139[2] = method3832(2, (-65).toByte())
        aAbstractRenderPassArray8139[4] = method3832(4, (-73).toByte())
        aAbstractRenderPassArray8139[5] = method3832(5, (-101).toByte())
        if (i.toInt() != 26) this.aModelBatchBase_8204 = null
        aAbstractRenderPassArray8139[6] = method3832(6, (-60).toByte())
        aAbstractRenderPassArray8139[7] = method3832(7, (-100).toByte())
        aAbstractRenderPassArray8139[3] = method3832(3, (-63).toByte())
        aAbstractRenderPassArray8139[8] = method3832(8, (-60).toByte())
        aAbstractRenderPassArray8139[9] = method3832(9, (-78).toByte())
        if (!aAbstractRenderPassArray8139[2]!!.method3530(-58)) aAbstractRenderPassArray8139[2] = method3832(0, (-74).toByte())
        if (!aAbstractRenderPassArray8139[4]!!.method3530(-74)) aAbstractRenderPassArray8139[4] = aAbstractRenderPassArray8139[2]
        if (!aAbstractRenderPassArray8139[8]!!.method3530(-116)) aAbstractRenderPassArray8139[8] = aAbstractRenderPassArray8139[4]
        if (!aAbstractRenderPassArray8139[9]!!.method3530(-104)) aAbstractRenderPassArray8139[9] = aAbstractRenderPassArray8139[8]
        method3882(52.toByte())
        la()
        this.method3673()
    }

    abstract fun method3931(bool: Boolean, textureFormatInfo: TextureFormatInfo?, movementDirection: MovementDirection?): Boolean

    fun method3932(i: Byte) {
        if (this.aSingletonMarker_8184 != ModelDefinitionCache.aSingletonMarker_2864) {
            val class196 = this.aSingletonMarker_8184
            this.aSingletonMarker_8184 = ModelDefinitionCache.aSingletonMarker_2864!!
            if (class196.method1450(-116)) method3913((-100).toByte())
            anInt8100 = anInt8100 and 0x1f.inv()
            this.aFloatArray8135 = aFloatArray8111
        }
        anInt7977++
        if (i > -106) this.anInt8146 = 6
    }

    override fun H(i: Int, i_264_: Int, i_265_: Int, `is`: IntArray?) {
        try {
            anInt8012++
            val f = (this.aClass101_Sub2_8080.method933((-105).toByte(), i.toFloat(), i_265_.toFloat(), i_264_.toFloat()))
            val i_266_: Int
            val i_267_: Int
            if (f >= -0.0078125f && f <= 0.0078125f) {
                i_266_ = this.anInt8130
                i_267_ = this.anInt8094
            } else {
                i_267_ = (this.anInt8129.toFloat() * (this.aClass101_Sub2_8080.method929(i_265_.toFloat(), i_264_.toFloat(), 45.toByte(), i.toFloat())) / f).toInt()
                i_266_ = (this.anInt8134.toFloat() * (this.aClass101_Sub2_8080.method922(64.toByte(), i.toFloat(), i_265_.toFloat(), i_264_.toFloat())) / f).toInt()
            }
            `is`!![1] = (i_266_.toFloat() - this.aFloat8103).toInt()
            `is`[0] = (i_267_.toFloat() - this.aFloat8126).toInt()
            `is`[2] = f.toInt()
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.H(" + i + ',' + i_264_ + ',' + i_265_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    fun method3933(i: Int) {
        anInt7956++
        if (i >= -34) aClass299_Sub2_8171 = null
        method3860(AsyncResourceRequest.aCameraRotationStub_9661, 2, 8)
    }

    override fun method3628(i: Int, i_268_: Int, i_269_: Int, i_270_: Int, i_271_: Int, i_272_: Int) {
        anInt7971++
        val f = method3858(false)
        method3903(false)
        method3894(-28186, i_271_)
        method3849(47.toByte(), 0, RenderListTextureNode.aTrigLookupTables_9485)
        method3885(0, true, RenderListTextureNode.aTrigLookupTables_9485)
        method3817(89, i_272_)
        this.aClass101_Sub2_8074.method932(1.0f, (-1 + i_270_).toFloat(), (i_269_ - 1).toFloat(), (-33).toByte())
        this.aClass101_Sub2_8074.method920(-f + i_268_.toFloat(), false, 0.0f, i.toFloat() - f)
        method3915(0)
        method3926(98.toByte(), false)
        method3860(GlBloomEffect.aCameraRotationStub_8832, 4, 8)
        method3926(104.toByte(), true)
        method3885(0, true, LoadingBarRenderer.aTrigLookupTables_4247)
        method3849(47.toByte(), 0, LoadingBarRenderer.aTrigLookupTables_4247)
    }

    fun method3934(i: Int): FloatCameraTransform {
        anInt8055++
        return this.aClass101_Sub2_8074
    }

    abstract fun method3935(i: Int)

    override fun XA(): Int {
        anInt7897++
        return this.anInt8154
    }

    override fun method3679(i: Int, i_273_: Int): Int {
        anInt8030++
        return i_273_ or i
    }

    abstract fun method3937(i: Byte)

    abstract fun method3938(cameraRotationStub: CameraRotationStub?, i: Int, interface5_impl2: IndexBufferResource?, i_276_: Int, i_277_: Int, i_278_: Int, i_279_: Int)

    override fun method3667(i: Int, i_280_: Int): Int {
        anInt7997++
        return i_280_ and i xor i_280_
    }

    abstract fun method3939(i: Byte)

    override fun method3686(fontDefinition: FontDefinition?, spriteImages: Array<SpriteImage>?, bool: Boolean): RSFont {
        try {
            anInt7952++
            return GlFontTextured(this, fontDefinition, spriteImages as Array<SpriteImage>, bool)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.JE(" + (if (fontDefinition != null) "{...}" else "null") + ',' + (if (spriteImages != null) "{...}" else "null") + ',' + bool + ')'))
        }
    }

    override fun method3642(i: Int, class348_sub1s: Array<AbstractTileShape?>?) {
        do {
            try {
                for (i_281_ in 0..<i) this.aClass348_Sub1Array8132[i_281_] = class348_sub1s!![i_281_]
                anInt7988++
                this.anInt8151 = i
                if (!this.aSingletonMarker_8184.method1450(-94)) break
                method3823(51.toByte())
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("wga.FF(" + i + ',' + (if (class348_sub1s != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    override fun method3627(): Boolean {
        anInt8038++
        return false
    }

    override fun method3702(i: Int): ShaderProgram {
        anInt8049++
        val var_za_Sub2 = ArbVertexProgram(i)
        aNodeDeque_7927!!.method1999(var_za_Sub2, -20180)
        return var_za_Sub2
    }

    override fun M(): Int {
        anInt7884++
        return anInt8210
    }

    abstract fun method3940(i: Int)

    fun method3941(i: Int): Int {
        val i_282_ = -33 / ((55 - i) / 36)
        anInt7921++
        return anInt8162
    }

    fun method3942(i: Int) {
        if (i != 5) anInt8045 = -47
        anInt8008++
        this.aClass101_Sub2_8074.method910()
        this.aBoolean8069 = true
        method3836(1)
    }

    override fun method3690(i: Int, i_283_: Int, i_284_: Int, i_285_: Int, i_286_: Int, f: Float): AbstractTileShape {
        anInt7894++
        return ParticleTileShape(i, i_283_, i_284_, i_285_, i_286_, f)
    }

    fun method3943(bool: Boolean, i: Int) {
        anInt7899++
        if (bool == !this.aBoolean8149) {
            this.aBoolean8149 = bool
            method3883(-90)
        }
    }

    fun method3944(`is`: ByteArray?, i: Int, textureFormatInfo: TextureFormatInfo?, i_287_: Int, bool: Boolean, i_288_: Int): Renderable2dTexture? {
        try {
            if (i_287_ != 2) return null
            anInt7929++
            return method3843(i_288_, 0, i, 0, `is`, textureFormatInfo, i_287_ xor 0x22, bool)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.MG(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + i_287_ + ',' + bool + ',' + i_288_ + ')'))
        }
    }

    abstract fun method3945(i: Int)

    override fun method3693(): Boolean {
        anInt7939++
        return true
    }

    fun method3946(i: Int, bool: Boolean) {
        anInt8027++
        if (!bool == this.aBoolean8118) {
            this.aBoolean8118 = bool
            method3841((-116).toByte())
            anInt8100 = anInt8100 and 0x1f.inv()
        }
    }

    abstract fun method3947(i: Int)

    override fun method3684(nodeDequeHolder: NodeDequeHolder) {
        try {
            aGroundDecorRenderer_8136!!.method2101(this, nodeDequeHolder, -1, 0)
            anInt7984++
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, "wga.EF(" + (if (nodeDequeHolder != null) "{...}" else "null") + ')')
        }
    }

    fun method3948(i: Int): FloatCameraTransform {
        if (!aBoolean8121) {
            aClass101_Sub2_8085.method927(this.aClass101_Sub2_8083, (this.aClass101_Sub2_8074))
            aBoolean8121 = true
        }
        anInt8042++
        if (i != -22036) anInt8104 = 66
        return aClass101_Sub2_8085
    }

    private fun method3949(i: Byte) {
        anInt7895++
        if (!aBoolean8112) {
            val fs = aFloatArray8157
            val f = this.anInt8095.toFloat()
            val f_291_ = this.anInt8154.toFloat()
            val f_292_ = (aFloat8155 * -this.anInt8130.toFloat() / this.anInt8134.toFloat())
            val f_293_ = (-this.anInt8094.toFloat() * aFloat8155 / this.anInt8129.toFloat())
            val f_294_ = (aFloat8155 * (-this.anInt8094 + this.anInt7931).toFloat() / this.anInt8129.toFloat())
            val f_295_ = ((-this.anInt8130 + this.anInt7962).toFloat() * aFloat8155 / this.anInt8134.toFloat())
            if (f_294_ == f_293_ || f_292_ == f_295_) {
                fs[11] = 0.0f
                fs[8] = 0.0f
                fs[7] = 0.0f
                fs[10] = 1.0f
                fs[15] = 1.0f
                fs[9] = 0.0f
                fs[0] = 1.0f
                fs[1] = 0.0f
                fs[13] = 0.0f
                fs[4] = 0.0f
                fs[6] = 0.0f
                fs[12] = 0.0f
                fs[5] = 1.0f
                fs[2] = 0.0f
                fs[14] = 0.0f
                fs[3] = 0.0f
            } else {
                fs[0] = 2.0f / (f_294_ - f_293_)
                fs[12] = (f_294_ + f_293_) / (f_293_ - f_294_)
                fs[6] = 0.0f
                fs[3] = 0.0f
                fs[11] = 0.0f
                fs[8] = 0.0f
                fs[14] = f / (f - f_291_)
                fs[1] = 0.0f
                fs[4] = 0.0f
                fs[2] = 0.0f
                fs[9] = 0.0f
                fs[13] = (f_292_ + f_295_) / (f_295_ - f_292_)
                fs[10] = 1.0f / (-f_291_ + f)
                fs[5] = 2.0f / (f_295_ - f_292_)
                fs[7] = 0.0f
                fs[15] = 1.0f
            }
            method3908(29.toByte())
            aBoolean8112 = true
        }
        if (i >= -37) method3631(74)
    }

    abstract fun method3950(i: Int)

    init {
        this.anInt8091 = -1
        this.aFloatArray8102 = floatArrayOf(0.0f, 0.0f, -1.0f, 0.0f)
        aFloatArray8142 = floatArrayOf(0.0f, 0.0f, 1.0f, 0.0f)
        aFloatArray8111 = floatArrayOf(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f)
        aFloatArray8157 = FloatArray(16)
        aFloatArray8120 = FloatArray(16)
        anInt8104 = -1
        this.anInt8144 = -1
        aAbstractRenderPassArray8139 = arrayOfNulls<AbstractRenderPass>(10)
        aFloatArray8140 = floatArrayOf(0.0f, 0.0f, 1.0f, 0.0f)
        this.aObjectByteSerializerHolder_8163 = ClientMachineInfo.aObjectByteSerializerHolder_6602
        aFloatArray8152 = FloatArray(16)
        this.aFloatArray8135 = aFloatArray8111
        anInt8167 = 1
        anInt8179 = -1
        this.anInt8175 = 0
        anInt8177 = 0
        this.aFloat8168 = 1.0f
        this.aFloat8174 = -1.0f
        this.aFloatArray8170 = floatArrayOf(0.0f, 0.0f, 1.0f, 0.0f)
        this.anInt8181 = 0
        this.aSingletonMarker_8184 = ModelDefinitionCache.aSingletonMarker_2864!!
        this.aFloat8180 = 1.0f
        this.aFloat8186 = -1.0f
        anInt8172 = 16777215
        this.anInt8183 = 0
        aStream8088 = Stream()
        aClass101_Sub2_8196 = FloatCameraTransform()
        try {
            try {
                this.anInt8117 = i
                this.aJs5Archive_8039 = js5Archive
                this.aCanvas7925 = canvas
                aCanvas7910 = this.aCanvas7925
                this.anObject7919 = `object`
                anObject8020 = this.anObject7919
                val dimension = canvas!!.getSize()
                anInt7987 = dimension.height
                this.anInt7962 = anInt7987
                anInt7958 = dimension.width
                this.anInt7931 = anInt7958
                this.anInt8178 = i_289_
                CachedRgbNoiseTexture.method566(false, true, (-127).toByte())
                if (this.aRenderConfig4579 == null) {
                    this.aNativeInterface7924 = NativeInterface(0, this.anInt8178)
                    aMaterialTextureCache_8137 = null
                } else {
                    aMaterialTextureCache_8137 = MaterialTextureCache(this, this.aRenderConfig4579)
                    this.aNativeInterface7924 = NativeInterface(this.aRenderConfig4579!!.method2(true), this.anInt8178)
                    var i_290_ = 0
                    while (this.aRenderConfig4579!!.method2(true) > i_290_) {
                        val class12 = this.aRenderConfig4579!!.method3(i_290_, -6662)
                        if (class12 != null) this.aNativeInterface7924!!.initTextureMetrics(i_290_, class12.aByte201, class12.aByte216)
                        i_290_++
                    }
                }
            } catch (throwable: Throwable) {
                throwable.printStackTrace()
                this.method3635((-58).toByte())
                throw RuntimeException("")
            }
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wga.<init>(" + (if (canvas != null) "{...}" else "null") + ',' + (if (`object` != null) "{...}" else "null") + ',' + (if (var_renderConfig != null) "{...}" else "null") + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + i + ',' + i_289_ + ')'))
        }
    }

    companion object {

        var anInt7884: Int = 0

        var anInt7885: Int = 0

        var anInt7886: Int = 0

        var anInt7887: Int = 0

        var anInt7888: Int = 0

        var anInt7889: Int = 0

        var anInt7890: Int = 0

        var anInt7892: Int = 0

        var anInt7893: Int = 0

        var anInt7894: Int = 0

        var anInt7895: Int = 0

        var anInt7896: Int = 0

        var anInt7897: Int = 0

        var anInt7898: Int = 0

        var anInt7899: Int = 0

        var anInt7900: Int = 0

        var anInt7901: Int = 0

        var anInt7902: Int = 0

        var anInt7903: Int = 0

        var anInt7904: Int = 0

        var anInt7906: Int = 0

        var anInt7907: Int = 0

        var anInt7908: Int = 0

        var anInt7909: Int = 0

        var anInt7911: Int = 0

        var anInt7912: Int = 0

        var anInt7913: Int = 0

        var anInt7914: Int = 0

        var anInt7915: Int = 0

        var anInt7916: Int = 0

        var anInt7917: Int = 0

        var anInt7918: Int = 0

        var anInt7920: Int = 0

        var anInt7921: Int = 0

        var anInt7922: Int = 0

        var anInt7923: Int = 0

        var anInt7926: Int = 0

        var anInt7928: Int = 0

        var anInt7929: Int = 0

        var anInt7930: Int = 0

        var anInt7932: Int = 0

        var anInt7933: Int = 0

        var anInt7934: Int = 0

        var anInt7935: Int = 0

        var anInt7936: Int = 0

        var anInt7938: Int = 0

        var anInt7939: Int = 0

        var anInt7940: Int = 0

        var anInt7941: Int = 0

        var anInt7942: Int = 0

        var anInt7943: Int = 0

        var anInt7944: Int = 0

        var anInt7945: Int = 0

        var anInt7946: Int = 0

        var anInt7947: Int = 0

        var anInt7948: Int = 0

        var anInt7949: Int = 0

        var anInt7950: Int = 0

        var anInt7951: Int = 0

        var anInt7952: Int = 0

        var anInt7953: Int = 0

        var anInt7954: Int = 0

        var anInt7955: Int = 0

        var anInt7956: Int = 0

        var anInt7957: Int = 0

        var anInt7959: Int = 0

        var anInt7960: Int = 0

        var anInt7961: Int = 0

        var anInt7963: Int = 0

        var anInt7964: Int = 0

        var anInt7965: Int = 0

        var anInt7966: Int = 0

        var anInt7967: Int = 0

        var anInt7968: Int = 0

        var anInt7969: Int = 0

        var anInt7970: Int = 0

        var anInt7971: Int = 0

        var anInt7972: Int = 0

        var anInt7973: Int = 0

        var anInt7975: Int = 0

        var anInt7976: Int = 0

        var anInt7977: Int = 0

        var anInt7978: Int = 0

        var anInt7979: Int = 0

        var anInt7980: Int = 0

        var anInt7981: Int = 0

        var anInt7982: Int = 0

        var anInt7983: Int = 0

        var anInt7984: Int = 0

        var anInt7985: Int = 0

        var anInt7986: Int = 0

        var anInt7988: Int = 0

        var anInt7989: Int = 0

        var anInt7990: Int = 0

        var anInt7991: Int = 0

        var anInt7992: Int = 0

        var anInt7993: Int = 0

        var anInt7994: Int = 0

        var anInt7995: Int = 0

        var anInt7996: Int = 0

        var anInt7997: Int = 0

        var anInt7998: Int = 0

        var anInt7999: Int = 0

        var anInt8000: Int = 0

        var anInt8001: Int

        var anInt8002: Int = 0

        var anInt8003: Int = 0

        var anInt8004: Int = 0

        var anInt8005: Int = 0

        var anInt8006: Int = 0

        var anInt8007: Int = 0

        var anInt8008: Int = 0

        var anInt8009: Int = 0

        var anInt8010: Int = 0

        var anInt8011: Int = 0

        var anInt8012: Int = 0

        var anInt8013: Int = 0

        var anInt8016: Int = 0

        var anInt8017: Int = 0

        var anInt8018: Int = 0

        var aStringArray8019: Array<String?>? = arrayOfNulls<String>(5)

        var anInt8021: Int = 0

        var anInt8022: Int = 0

        var anInt8023: Int = 0

        var anInt8024: Int = 0

        var anInt8025: Int = 0

        var anInt8026: Int = 0

        var anInt8027: Int = 0

        var anInt8028: Int = 0

        var anInt8029: Int = 0

        var anInt8030: Int = 0

        var anInt8031: Int = 0

        var anInt8032: Int = 0

        var anInt8033: Int = 0

        var anInt8034: Int = 0

        var anInt8035: Int = 0

        var anInt8036: Int = 0

        var anInt8037: Int = 0

        var anInt8038: Int = 0

        var anInt8040: Int = 0

        var anInt8041: Int = 0

        var anInt8042: Int = 0

        var anInt8043: Int = 0

        var anInt8044: Int = 0

        var anInt8045: Int = 0

        var anInt8046: Int = 0

        var anInt8047: Int = 0

        var anInt8048: Int = 0

        var anInt8049: Int = 0

        var anInt8050: Int = 0

        var anInt8051: Int = 0

        var anInt8052: Int = 0

        var anInt8053: Int = 0

        var anInt8054: Int = 0

        var anInt8055: Int = 0

        var anInt8056: Int = 0

        var anInt8057: Int = 0

        var anInt8058: Int = 0

        var anInt8059: Int = 0

        var anInt8060: Int = 0

        var anInt8061: Int = 0

        var anInt8064: Int = 0

        var anInt8065: Int = 0

        var anInt8066: Int = 0

        var anInt8067: Int = 0

        var anInt8068: Int = 0

        var anInt8070: Int = 0

        var anInt8071: Int = 0

        var anInt8072: Int = 0

        var anInt8073: Int = 0

        var anInt8075: Int = 0

        var anInt8076: Int = 0

        var anInt8077: Int = 0

        var anInt8078: Int = 0

        var anInt8081: Int = 0

        /*synthetic*/
        var aClass8211: Class<*>? = null

        fun method3824(i: Int, i_35_: Int, i_36_: Int, i_37_: Int, i_38_: Int, i_39_: Int, i_40_: Int, i_41_: Int) {
            var i_36_ = i_36_
            anInt7933++
            if (i_37_ >= 0 && i >= 0 && -1 + GlCubemapLightPass.anInt7319 > i_37_ && (i < -1 + RangeThresholdTextureNode.anInt9109)) {
                if (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029 == null) return
                if (i_41_ == 0) {
                    val renderTarget = method3297(i_40_, i_37_, i) as RenderTarget?
                    val renderTarget_42_ = ConfigArchiveLoader.method813(i_40_, i_37_, i) as RenderTarget?
                    if (renderTarget != null && i_36_ != 2) {
                        if (renderTarget is SequencedActorEntity) renderTarget.aSceneObjectAnimator_10115!!.method1671(262144, i_35_)
                        else MapSceneIconDef.method1591(i_37_, 89, i_41_, i_35_, renderTarget.method42(-76), i_36_, i, i_38_, i_40_)
                    }
                    if (renderTarget_42_ != null) {
                        if (renderTarget_42_ is SequencedActorEntity) renderTarget_42_.aSceneObjectAnimator_10115!!.method1671(262144, i_35_)
                        else MapSceneIconDef.method1591(i_37_, 92, i_41_, i_35_, renderTarget_42_.method42(-71), i_36_, i, i_38_, i_40_)
                    }
                } else if (i_41_ == 1) {
                    val renderTarget = (method3135(i_40_, i_37_, i) as RenderTarget?)
                    if (renderTarget != null) {
                        if (renderTarget is SequencedWallEntity) renderTarget.aSceneObjectAnimator_10155!!.method1671(262144, i_35_)
                        else {
                            val i_43_ = renderTarget.method42(-83)
                            if (i_36_ != 4 && i_36_ != 5) {
                                if (i_36_ != 6) {
                                    if (i_36_ == 7) MapSceneIconDef.method1591(i_37_, 50, i_41_, i_35_, i_43_, 4, i, 4 + (0x3 and 2 + i_38_), i_40_)
                                    else if (i_36_ == 8) {
                                        MapSceneIconDef.method1591(i_37_, 116, i_41_, i_35_, i_43_, 4, i, 4 + i_38_, i_40_)
                                        MapSceneIconDef.method1591(i_37_, 91, i_41_, i_35_, i_43_, 4, i, 4 + (0x3 and i_38_ - -2), i_40_)
                                    }
                                } else MapSceneIconDef.method1591(i_37_, 22, i_41_, i_35_, i_43_, 4, i, i_38_ + 4, i_40_)
                            } else MapSceneIconDef.method1591(i_37_, 86, i_41_, i_35_, i_43_, 4, i, i_38_, i_40_)
                        }
                    }
                } else if (i_41_ == 2) {
                    val renderTarget = ((ClickFeedbackTask.method1353(i_40_, i_37_, i, (if (aClass8211 != null) aClass8211 else (RenderTarget::class.jClass.also { aClass8211 = it })))) as RenderTarget?)
                    if (renderTarget != null) {
                        if (i_36_ == 11) i_36_ = 10
                        if (renderTarget !is SequencedGroundDecor) MapSceneIconDef.method1591(i_37_, 43, i_41_, i_35_, renderTarget.method42(-107), i_36_, i, i_38_, i_40_)
                        else renderTarget.aSceneObjectAnimator_10045!!.method1671(262144, i_35_)
                    }
                } else if (i_41_ == 3) {
                    val renderTarget = (method2878(i_40_, i_37_, i) as RenderTarget?)
                    if (renderTarget != null) {
                        if (renderTarget is WallSceneEntity) renderTarget.aSceneObjectAnimator_9955!!.method1671(262144, i_35_)
                        else MapSceneIconDef.method1591(i_37_, 28, i_41_, i_35_, renderTarget.method42(-123), i_36_, i, i_38_, i_40_)
                    }
                }
            }
            if (i_39_ < 98) method3936(-100)
        }

        @JvmStatic
        fun method3870(i: Int) {
            aStringArray8019 = null
            if (i <= 99) anInt8045 = -72
        }


        @JvmStatic
        fun method3886(i: Int) {
            ParticleProcessor.aLruByteCache_4273!!.method590(0)
            if (i >= -58) method3824(43, 63, -121, -1, 72, 77, -11, 22)
            anInt8018++
        }

        var aHuffmanCodec_1131: HuffmanCodec? = null
        @JvmStatic
        fun method3896(huffmanCodec: HuffmanCodec?, i: Byte) {
            do {
                try {
                    anInt8028++
                    NativeRenderer.aHuffmanCodec_1131 = huffmanCodec
                    break
                } catch (runtimeexception: RuntimeException) {
                    throw TextureLoadException.method2929(runtimeexception, ("wga.DI(" + (if (huffmanCodec != null) "{...}" else "null") + ',' + i + ')'))
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method3936(i: Int) {
            anInt7990++
            if (NodeDequeStatics.aModelLightingConfigArrayArray3335 != null) {
                var i_274_ = 0
                while ((i_274_ < NodeDequeStatics.aModelLightingConfigArrayArray3335!!.size)) {
                    var i_275_ = 0
                    while ((NodeDequeStatics.aModelLightingConfigArrayArray3335!![i_274_]!!.size > i_275_)) {
                        NodeDequeStatics.aModelLightingConfigArrayArray3335!![i_274_]!![i_275_] = LocalizedTextStatics.aModelLightingConfig_3547
                        i_275_++
                    }
                    i_274_++
                }
            }
            if (i != 0) method3870(-90)
        }

        init {
            anInt8001 = -1
        }
    }
}
