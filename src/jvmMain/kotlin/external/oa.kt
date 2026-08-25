package external

import AbstractCameraTransform
import AbstractModel
import AbstractModelRenderer
import AbstractTileShape
import CameraMarker
import CircleRasterizer
import Disposable
import RSFont
import FontDefinition
import RendererType
import HashTileShape
import Hashtable
import Marker
import ModelDefinition
import NodeDeque
import NodeDequeHolder
import PositionedSceneNode
import RenderConfig
import Renderer
import ShaderProgram
import Sprite
import SpriteDrawTarget
import SpriteImage
import TerrainTile
import withLock
import awt.Canvas
import java.awt.Rectangle
import kotlin.math.max

/*
 * NativeGraphicsContext
 */
actual class oa(canvas: Canvas?, var_renderConfig: RenderConfig?, i: Int, i_177_: Int) : Renderer(var_renderConfig), Disposable {
    private var aYa5121: ya? = null
    actual var nativeid: Long = 0L
    private val aNodeDeque_5123: NodeDeque
    private var aBoolean5124 = false
    private var aAbstractCameraTransform_5125: AbstractCameraTransform? = null
    private val aHashtable_5126: Hashtable
    private var anInt5127: Int
    private var anInt5128: Int
    private var aAbstractCameraTransform_5131: AbstractCameraTransform? = null
    private var aP5137: p? = null
    actual var anInt5141: Int = 0
    private var aBoolean5142: Boolean
    private var anAArray5143: Array<a?>? = null

    /*private*/ actual external fun MA(var_renderConfig: RenderConfig?, i: Int, i_0_: Int)

    actual override fun method3628(i: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
        U(i, i_1_, i_2_, i_4_, i_5_)
        U(i, i_1_ + i_3_ - 1, i_2_, i_4_, i_5_)
        P(i, i_1_ + 1, i_3_ - 1, i_4_, i_5_)
        P(i + i_2_ - 1, i_1_ + 1, i_3_ - 1, i_4_, i_5_)
    }

    /*private*/ actual external fun ma(l: Long)

    actual override fun method3697(i: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int): CircleRasterizer? {
        return null
    }

    actual override fun method3651(var_shaderProgram: ShaderProgram?) {
        aYa5121 = var_shaderProgram as ya?
        va(var_shaderProgram)
    }

    actual external override fun w(bool: Boolean)

    actual external override fun A(i: Int, var_sprite: Sprite?, i_11_: Int, i_12_: Int)

    actual external override fun aa(i: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Int)

    actual override fun method3698() {
        /* empty */
    }

    @Throws(ClientException::class)
    actual override fun method3707(rectangles: Array<Rectangle?>?, i: Int, i_18_: Int, i_19_: Int) {
        checkNotNull(aP5137) { "off" }
        aP5137!!.method3434(rectangles!!, i, i_18_, i_19_)
    }

    actual override fun method3708(): Boolean {
        return true
    }

    actual override fun method3685(nodeDequeHolder: NodeDequeHolder, i: Int) {
        method3975(nodeDequeHolder!!, false)
        method3973()!!.method155(this, anIntArray5136, anIntArray5135, anIntArray5139, aShortArray5133, nodeDequeHolder.aSceneNodeDeque_1569.method840(0))
    }

    actual override fun method3676(i: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int, i_28_: Int, i_29_: Int, i_30_: Int, i_31_: Int) {
        /* empty */
    }

    actual override fun method3663() {
        /* empty */
    }

    actual override fun method3691(spriteImage: SpriteImage?, bool: Boolean): AbstractModelRenderer {
        val var_j = j(this, spriteImage!!.anIntArray2697, spriteImage.aByteArray2699, spriteImage.aByteArray2695, 0, spriteImage.anInt2702, spriteImage.anInt2702, spriteImage.anInt2696)
        var_j.method985(spriteImage.anInt2703, spriteImage.anInt2700, spriteImage.anInt2698, spriteImage.anInt2701)
        return var_j
    }

    actual external override fun HA(i: Int, i_32_: Int, i_33_: Int, i_34_: Int, `is`: IntArray?)

    actual override fun method3710() {
        /* empty */
    }

    /*private*/ actual external fun AA(i: Short, i_35_: Short, i_36_: Int, i_37_: Byte, i_38_: Byte, i_39_: Int, bool: Boolean, i_40_: Byte, i_41_: Byte, i_42_: Byte, i_43_: Byte, bool_44_: Boolean, bool_45_: Boolean, bool_46_: Boolean, bool_47_: Boolean, bool_48_: Boolean, i_49_: Byte, bool_50_: Boolean, bool_51_: Boolean, i_52_: Int)

    actual override fun method3696(i: Int) {
        throw IllegalStateException()
    }

    actual external override fun H(i: Int, i_53_: Int, i_54_: Int, `is`: IntArray?)

    /*private*/ actual fun g() { //
        System.gc()
        System.runFinalization()
        RequestGate.method1948((-33).toByte())
    }

    actual external override fun b(i: Int, i_55_: Int, i_56_: Int, i_57_: Int, d: Double)

    actual override fun method3700(f: Float, f_58_: Float, f_59_: Float) {
        /* empty */
    }

    actual override fun method3686(fontDefinition: FontDefinition?, spriteImages: Array<SpriteImage>?, bool: Boolean): RSFont {
        val `is` = IntArray(spriteImages!!.size)
        val is_60_ = IntArray(spriteImages.size)
        var bool_61_ = false
        for (i in spriteImages.indices) {
            `is`[i] = spriteImages[i]!!.anInt2702
            is_60_[i] = spriteImages[i]!!.anInt2696
            if (spriteImages[i]!!.aByteArray2695 != null) bool_61_ = true
        }
        if (bool) {
            require(!bool_61_) { "Cannot specify alpha with non-mono font unless someone writes it" }
            return h(this, aYa5121, fontDefinition, spriteImages, null)
        }
        require(!bool_61_) { "Cannot specify alpha with non-mono font unless someone writes it" }
        return n(this, aYa5121, fontDefinition, spriteImages, null)
    }

    /*private*/ actual external fun wa(i: Int, i_62_: Int, i_63_: Int, i_64_: Int, i_65_: Int, i_66_: Int)

    actual override fun method3644(): Boolean {
        return true
    }

    actual fun method3973(): a? {
        for (i in 0..<this.anInt5141) {
            if (anAArray5143!![i]!!.aRunnable5112 === Thread.currentThread()) return anAArray5143!![i]
        }
        return null
    }

    /*private*/ actual external fun t(var_p: p?)

    actual override fun method3705(): AbstractCameraTransform {
        return aAbstractCameraTransform_5131!!
    }

    /*private*/ actual fun WA(i: Short): Boolean { //
        withLock(this.aRenderConfig4579!!) {
            if (!this.aRenderConfig4579!!.method4(-7953, i.toInt())) return false
            val class12 = this.aRenderConfig4579!!.method3(i.toInt(), -6662)
            if (class12 == null) return false
            val `is`: IntArray?
            if (class12.anInt200 != 2) `is` = this.aRenderConfig4579!!.method5(true, i.toInt(), 0.7f, 128, 128, -128)
            else `is` = this.aRenderConfig4579!!.method6(-21540, 128, 0.7f, i.toInt(), true, 128)
            CA(i, `is`, class12.aShort208, class12.anInt200, class12.aByte213, class12.aByte202, class12.anInt206, class12.aBoolean199, class12.aByte201, class12.aByte216, class12.aByte198, class12.aByte211, class12.aBoolean209, class12.aBoolean204, class12.aBoolean212, class12.aBoolean217, class12.aBoolean215, class12.aByte205, class12.aBoolean218, class12.aBoolean207, class12.anInt203)
        }
        return true
    }

    /*private*/ actual fun method3975(nodeDequeHolder: NodeDequeHolder, bool: Boolean) {
        var i = 0
        var i_67_ = 0
        var i_68_ = 0
        var i_69_ = 0
        var i_70_ = 0
        var class318_sub9_sub2 = (nodeDequeHolder.aSceneNodeDeque_1569.method848(8) as PositionedSceneNode?)
        while (class318_sub9_sub2 != null) {
            anIntArray5136[i++] = class318_sub9_sub2.anInt8791
            anIntArray5136[i++] = class318_sub9_sub2.anInt8796
            anIntArray5136[i++] = class318_sub9_sub2.anInt8789
            anIntArray5135[i_67_++] = class318_sub9_sub2.anInt8790
            aShortArray5133[i_69_++] = class318_sub9_sub2.anInt8792.toShort()
            anIntArray5139[i_68_++] = class318_sub9_sub2.anInt8793
            if (bool) aByteArray5134[i_70_++] = class318_sub9_sub2.aByte8795
            class318_sub9_sub2 = (nodeDequeHolder.aSceneNodeDeque_1569.method846((-79).toByte()) as PositionedSceneNode?)
        }
    }

    actual override fun method3659(i: Int) {
        anAArray5143!![i]!!.method154()
    }

    actual override fun method3632(`is`: IntArray?) {
        val dimension = aP5137!!.aCanvas5147!!.getSize()
        `is`!![0] = dimension.width
        `is`[1] = dimension.height
    }

    /*private*/ actual external fun CA(i: Short, `is`: IntArray?, i_71_: Short, i_72_: Int, i_73_: Byte, i_74_: Byte, i_75_: Int, bool: Boolean, i_76_: Byte, i_77_: Byte, i_78_: Byte, i_79_: Byte, bool_80_: Boolean, bool_81_: Boolean, bool_82_: Boolean, bool_83_: Boolean, bool_84_: Boolean, i_85_: Byte, bool_86_: Boolean, bool_87_: Boolean, i_88_: Int)

    actual external override fun DA(i: Int, i_89_: Int, i_90_: Int, i_91_: Int)

    actual override fun method3702(i: Int): ShaderProgram {
        val var_ya = ya(this, i)
        aNodeDeque_5123.method1999(var_ya, -20180)
        return var_ya
    }

    actual override fun method3650(i: Int) {
        anInt5127 = i
        anInt5128 = anInt5127
        check(this.anInt5141 <= 1) { "No MT" }
        method3631(this.anInt5141)
        method3659(0)
    }

    actual override fun method3667(i: Int, i_92_: Int): Int {
        val i_93_ = i and 0xfffff
        val i_94_ = i_92_ and 0xfffff
        return i_93_ and i_94_ xor i_94_
    }

    actual external override fun xa(f: Float)

    actual override fun method3701(canvas: Canvas?) {
        if (aP5137!!.aCanvas5147 === canvas) method3677(null)
        val var_p = aHashtable_5126.method3480(canvas.hashCode().toLong(), -6008) as p?
        if (var_p != null) {
            var_p.method2715(110.toByte())
            var_p.method3436()
        }
    }

    actual override fun method3636(i: Int, i_95_: Int, i_96_: Int, i_97_: Int, i_98_: Int, i_99_: Int, var_sprite: Sprite?, i_100_: Int, i_101_: Int) {
        Z(i, i_95_, i_96_, i_97_, i_98_, i_99_, var_sprite, i_100_, i_101_)
    }

    @Synchronized
    /*protected*/ actual override fun finalize() {
        this.method3635((-45).toByte())
        if (this.nativeid != 0L) RequestGate.method1947(0, this)
    }

    /*private*/ actual external fun d(i: Int)

    actual external override fun i(): Int

    /*private*/ actual external fun n(l: Long, l_102_: Long)

    actual override fun method3684(nodeDequeHolder: NodeDequeHolder) {
        if (nodeDequeHolder!!.aSceneNodeDeque_1569.method840(0) != 0) {
            method3975(nodeDequeHolder, false)
            method3973()!!.method155(this, anIntArray5136, anIntArray5135, anIntArray5139, aShortArray5133, nodeDequeHolder.aSceneNodeDeque_1569.method840(0))
        }
    }

    actual override fun method3704(): Int {
        return 4
    }

    actual external override fun JA(i: Int, i_103_: Int, i_104_: Int, i_105_: Int, i_106_: Int, i_107_: Int): Int

    actual override fun method3652() {
        if (!aBoolean5124) {
            anAArray5143 = null
            aP5137 = null
            aYa5121 = null
            aAbstractCameraTransform_5131 = null
            aHashtable_5126.method3481(0)
            var var_ya = aNodeDeque_5123.method1995(4) as ya?
            while (var_ya != null) {
                var_ya.ga()
                var_ya = aNodeDeque_5123.method1990(36.toByte()) as ya?
            }
            aNodeDeque_5123.method1996(117)
            FA()
            if (aBoolean5142) {
                CubeMapMaterialPass.method2173(true, -110, false)
                aBoolean5142 = false
            }
            g()
            RequestGate.method1946(-108)
            aBoolean5124 = true
        }
    }

    actual override fun method3669(canvas: Canvas?, i: Int, i_108_: Int) {
        val var_p = aHashtable_5126.method3480(canvas.hashCode().toLong(), -6008) as p?
        var_p!!.method3435(canvas, i, i_108_)
        if (canvas != null && canvas === aP5137!!.aCanvas5147) method3677(canvas)
    }

    /*private*/ actual fun c(i: Short): Boolean { //
        withLock(this) {
            val class12 = this.aRenderConfig4579!!.method3(i.toInt(), -6662)
            if (class12 == null) return false
            AA(i, class12.aShort208, class12.anInt200, class12.aByte213, class12.aByte202, class12.anInt206, class12.aBoolean199, class12.aByte201, class12.aByte216, class12.aByte198, class12.aByte211, class12.aBoolean209, class12.aBoolean204, class12.aBoolean212, class12.aBoolean217, class12.aBoolean215, class12.aByte205, class12.aBoolean218, class12.aBoolean207, class12.anInt203)
        }
        return true
    }

    actual override fun method3666(): Boolean {
        return false
    }

    actual external override fun Q(i: Int, i_109_: Int, i_110_: Int, i_111_: Int, i_112_: Int, i_113_: Int, `is`: ByteArray?, i_114_: Int, i_115_: Int)

    actual override fun method3629(i: Int, i_116_: Int, bool: Boolean): AbstractModelRenderer {
        return j(this, i, i_116_)
    }

    actual external override fun ya()

    actual external override fun I(): Int

    actual external override fun f(i: Int, i_117_: Int)

    actual external override fun KA(i: Int, i_118_: Int, i_119_: Int, i_120_: Int)

    actual override fun method3646(i: Int) {
        RequestGate.method1948((-71).toByte())
        d(i)
        var var_ya = aNodeDeque_5123.method1995(4) as ya?
        while (var_ya != null) {
            var_ya.r()
            var_ya = aNodeDeque_5123.method1990(40.toByte()) as ya?
        }
    }

    actual override fun method3679(i: Int, i_121_: Int): Int {
        return i or i_121_
    }

    actual external override fun ra(i: Int, i_122_: Int, i_123_: Int, i_124_: Int)

    actual external override fun E(): Int

    actual external override fun pa()

    actual override fun method3688(i: Int, i_125_: Int, i_126_: Int, i_127_: Int, i_128_: Int, i_129_: Int, i_130_: Int) {
        method3973()!!.method150(this, i, i_125_, i_126_, i_127_, i_128_, i_129_, i_130_)
    }

    actual external override fun GA(i: Int)

    actual override fun method3670(): Boolean {
        return true
    }

    actual external override fun X(i: Int)

    actual override fun method3625(modelDefinition: ModelDefinition?, i: Int, i_131_: Int, i_132_: Int, i_133_: Int): AbstractModel {
        return i(this, aYa5121, modelDefinition!!, i, i_131_, i_132_, i_133_)
    }

    actual override fun c(): RendererType { //
        return RendererType(0, "SSE", 1, "CPU", 0L)
    }

    actual override fun method3674(i: Int, i_134_: Int, i_135_: Int, i_136_: Int, i_137_: Int, i_138_: Int, i_139_: Int, i_140_: Int, i_141_: Int) {
        /* empty */
    }

    actual external override fun F(i: Int, i_142_: Int)

    actual override fun method3683(i: Int, i_143_: Int, i_144_: Int, i_145_: Int, bool: Boolean): AbstractModelRenderer {
        return j(this, i, i_143_, i_144_, i_145_, !bool)
    }

    actual override fun method3631(i: Int) {
        this.anInt5141 = i
        anAArray5143 = arrayOfNulls<a>(this.anInt5141)
        for (i_146_ in 0..<this.anInt5141) anAArray5143!![i_146_] = a(this, anInt5128, anInt5127)
    }

    actual external override fun r(i: Int, i_147_: Int, i_148_: Int, i_149_: Int, i_150_: Int, i_151_: Int, i_152_: Int): Int

    /*private*/ actual external fun va(var_shaderProgram: ShaderProgram?)

    actual override fun method3643(canvas: Canvas?, i: Int, i_153_: Int) {
        var var_p = aHashtable_5126.method3480(canvas.hashCode().toLong(), -6008) as p?
        if (var_p == null) {
            canvas!!.setIgnoreRepaint(true)
            var_p = p(this, canvas, i, i_153_)
            aHashtable_5126.method3483(36.toByte(), canvas.hashCode().toLong(), var_p)
        } else if (var_p.anInt5145 != i || var_p.anInt5148 != i_153_) var_p.method3435(canvas, i, i_153_)
    }

    actual override fun method3706(circleRasterizer: CircleRasterizer?, circleRasterizer_154_: CircleRasterizer?, f: Float, circleRasterizer_155_: CircleRasterizer?): CircleRasterizer? {
        return null
    }

    actual external override fun K(`is`: IntArray?)

    actual override fun method3694(): Boolean {
        return true
    }

    @Throws(ClientException::class)
    actual override fun method3626(i: Int, i_156_: Int) {
        checkNotNull(aP5137) { "off" }
        aP5137!!.method3433(i, i_156_)
    }

    actual override fun method3665(i: Int, i_157_: Int): CameraMarker {
        return method3629(i, i_157_, false)
    }

    actual override fun method3642(i: Int, class348_sub1s: Array<AbstractTileShape?>?) {
        var i_158_ = 0
        for (i_159_ in 0..<i) {
            anIntArray5130[i_158_++] = class348_sub1s!![i_159_]!!.method2724(-1)
            anIntArray5130[i_158_++] = class348_sub1s!![i_159_]!!.method2722(123)
            anIntArray5130[i_158_++] = class348_sub1s!![i_159_]!!.method2717(103.toByte())
            anIntArray5130[i_158_++] = class348_sub1s!![i_159_]!!.method2723(-1)
            aFloatArray5138[i_159_] = class348_sub1s!![i_159_]!!.method2721(-65)
            anIntArray5130[i_158_++] = class348_sub1s!![i_159_]!!.method2720(-1)
        }
        N(i, anIntArray5130, aFloatArray5138)
    }

    actual external override fun za(i: Int, i_160_: Int, i_161_: Int, i_162_: Int, i_163_: Int)

    actual external override fun na(i: Int, i_164_: Int, i_165_: Int, i_166_: Int): IntArray?

    actual override fun method3647(bool: Boolean) {
        /* empty */
    }

    actual override fun method3690(i: Int, i_167_: Int, i_168_: Int, i_169_: Int, i_170_: Int, f: Float): AbstractTileShape {
        return HashTileShape(i, i_167_, i_168_, i_169_, i_170_, f)
    }

    actual override fun method3677(canvas: Canvas?) {
        if (canvas == null) {
            aP5137 = null
            t(null)
        } else {
            val var_p = aHashtable_5126.method3480(canvas.hashCode().toLong(), -6008) as p?
            aP5137 = var_p
            t(var_p)
        }
    }

    actual override fun method3682(): Boolean {
        return true
    }

    actual override fun method3653(circleRasterizer: CircleRasterizer?) {
        /* empty */
    }

    actual override fun method3654(): AbstractCameraTransform {
        return ja()
    }

    actual override fun method3678(i: Int) {
        anAArray5143!![i]!!.method156()
    }

    actual external override fun EA(i: Int, i_171_: Int, i_172_: Int, i_173_: Int)

    actual override fun method3633() {
        /* empty */
    }

    actual override fun method3658(i: Int, i_174_: Int, i_175_: Int, i_176_: Int) {
        /* empty */
    }

    /*private*/ actual external fun FA()

    actual external override fun P(i: Int, i_178_: Int, i_179_: Int, i_180_: Int, i_181_: Int)

    actual override fun method3695(): Boolean {
        return true
    }

    actual external override fun U(i: Int, i_182_: Int, i_183_: Int, i_184_: Int, i_185_: Int)

    actual external override fun Y(): IntArray

    actual external override fun ZA(i: Int, f: Float, f_186_: Float, f_187_: Float, f_188_: Float, f_189_: Float)

    actual override fun method3634(cameraMarker: CameraMarker?, marker: Marker?): SpriteDrawTarget {
        return wa(this, (cameraMarker as j?)!!, (marker as xa?)!!)
    }

    actual override fun method3687(spriteDrawTarget: SpriteDrawTarget?) {
        val var_wa = spriteDrawTarget as wa
        n(var_wa.aJ4732.nativeid, var_wa.aXa4733.nativeid)
    }

    actual external override fun da(i: Int, i_190_: Int, i_191_: Int, `is`: IntArray?)

    actual override fun method3661(i: Int, i_192_: Int, `is`: IntArray?, is_193_: IntArray?): Sprite {
        return na(this, aYa5121, i, i_192_, `is`, is_193_)
    }

    actual override fun method3640(): AbstractCameraTransform? {
        return aAbstractCameraTransform_5125
    }

    actual override fun method3709(i: Int, i_194_: Int, i_195_: Int, i_196_: Int, i_197_: Int, i_198_: Int) {
        wa(i, i_194_, i_195_, i_196_, i_197_, i_198_)
    }

    /*private*/ actual external fun Z(i: Int, i_199_: Int, i_200_: Int, i_201_: Int, i_202_: Int, i_203_: Int, var_sprite: Sprite?, i_204_: Int, i_205_: Int)

    actual external override fun C(bool: Boolean)

    actual override fun method3624(i: Int, i_206_: Int): Marker {
        return xa(i, i_206_)
    }

    actual override fun method3639(): Boolean {
        return true
    }

    actual external override fun L(i: Int, i_207_: Int, i_208_: Int)

    actual override fun method3711(`is`: IntArray?, i: Int, i_209_: Int, i_210_: Int, i_211_: Int, bool: Boolean): AbstractModelRenderer {
        return j(this, `is`, i, i_209_, i_210_, i_211_, false)
    }

    actual external override fun la()

    actual override fun method3630(bool: Boolean) {
        /* empty */
    }

    actual external override fun M(): Int

    actual override fun method3627(): Boolean {
        return false
    }

    /*private*/ actual fun OA(): Any { //
        return ba(this)
    }

    actual override fun method3655(): Boolean {
        return true
    }

    actual override fun method3703(i: Int, i_212_: Int, i_213_: Int, i_214_: Int, i_215_: Int, i_216_: Int, var_sprite: Sprite?, i_217_: Int, i_218_: Int, i_219_: Int, i_220_: Int, i_221_: Int) {
        /* empty */
    }

    actual override fun method3638(abstractCameraTransform: AbstractCameraTransform?) {
        aAbstractCameraTransform_5125 = abstractCameraTransform
        ma((abstractCameraTransform as ja).nativeid)
    }

    actual override fun method3672() {
        method3677(aP5137!!.aCanvas5147)
    }

    actual override fun method3648(i: Int, i_222_: Int, `is`: Array<IntArray?>, is_223_: Array<IntArray?>?, i_224_: Int, i_225_: Int, i_226_: Int): TerrainTile {
        return t(this, aYa5121, i, i_222_, `is`, is_223_, i_224_, i_225_, i_226_)
    }

    actual external override fun XA(): Int

    /*private*/ actual external fun N(i: Int, `is`: IntArray?, fs: FloatArray?)

    actual external override fun T(i: Int, i_227_: Int, i_228_: Int, i_229_: Int)

    actual override fun method3693(): Boolean {
        return true
    }

    actual override fun method3673() {
        /* empty */
    }

    actual override fun method3671(): Boolean {
        return false
    }

    actual override fun method3699(): Boolean {
        return false
    }

    init {
        aNodeDeque_5123 = NodeDeque()
        anInt5127 = 4096
        anInt5128 = 4096
        aHashtable_5126 = Hashtable(4)
        aBoolean5142 = false
        do {
            try {
                if (!BlankTextureNode.method3098(-30282, "sw3d")) throw RuntimeException("")
                RequestGate.method1949((-128).toByte())
                MA(aRenderConfig4579, 0, 0)
                CachedRgbNoiseTexture.method566(false, true, 23.toByte())
                aBoolean5142 = true
                aAbstractCameraTransform_5131 = ja()
                method3638(ja())
                method3631(1)
                method3659(0)
                if (canvas == null) break
                method3643(canvas, i, i_177_)
                method3677(canvas)
            } catch (throwable: Throwable) {
                throwable.printStackTrace()
                this.method3635(124.toByte())
                throw RuntimeException()
            }
            break
        } while (false)
    }

    companion object {
        private val anIntArray5122 = IntArray(max(max(104, 20), 24573))
        private val aFloatArray5129 = FloatArray(20)
        private val anIntArray5130: IntArray = anIntArray5122
        var anIntArray5132: IntArray = IntArray(6)
        private val aShortArray5133: ShortArray = ShortArray(8191)
        private val aByteArray5134: ByteArray = ByteArray(8191)
        private val anIntArray5135: IntArray = IntArray(8191)
        private val anIntArray5136: IntArray = anIntArray5122
        private val aFloatArray5138: FloatArray = aFloatArray5129
        private val anIntArray5139: IntArray = IntArray(8191)
        var anIntArray5140: IntArray = anIntArray5122
    }
}
