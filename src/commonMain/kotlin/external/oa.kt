package external

import AbstractCameraTransform
import AbstractModel
import AbstractModelRenderer
import AbstractTileShape
import CameraMarker
import CircleRasterizer
import ClientException
import Disposable
import FontDefinition
import Marker
import ModelDefinition
import NodeDequeHolder
import RSFont
import RenderConfig
import Renderer
import RendererType
import ShaderProgram
import Sprite
import SpriteDrawTarget
import SpriteImage
import TerrainTile
import awt.Canvas
import awt.Rectangle

/*
 * NativeGraphicsContext
 */
expect class oa(canvas: Canvas?, var_renderConfig: RenderConfig?, i: Int, i_177_: Int) : Renderer, Disposable {
    var nativeid: Long
    var anInt5141: Int

    /*private*/ fun MA(var_renderConfig: RenderConfig?, i: Int, i_0_: Int)

    override fun method3628(i: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int) 

    /*private*/ fun ma(l: Long)

    override fun method3697(i: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int): CircleRasterizer? 

    override fun method3651(var_shaderProgram: ShaderProgram?) 

    override fun w(bool: Boolean)

    override fun A(i: Int, var_sprite: Sprite?, i_11_: Int, i_12_: Int)

    override fun aa(i: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Int)

    override fun method3698() 

    @Throws(ClientException::class)
    override fun method3707(rectangles: Array<Rectangle?>?, i: Int, i_18_: Int, i_19_: Int) 

    override fun method3708(): Boolean 

    override fun method3685(nodeDequeHolder: NodeDequeHolder, i: Int) 

    override fun method3676(i: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int, i_28_: Int, i_29_: Int, i_30_: Int, i_31_: Int) 

    override fun method3663() 

    override fun method3691(spriteImage: SpriteImage?, bool: Boolean): AbstractModelRenderer 

    override fun HA(i: Int, i_32_: Int, i_33_: Int, i_34_: Int, `is`: IntArray?)

    override fun method3710() 

    /*private*/ fun AA(i: Short, i_35_: Short, i_36_: Int, i_37_: Byte, i_38_: Byte, i_39_: Int, bool: Boolean, i_40_: Byte, i_41_: Byte, i_42_: Byte, i_43_: Byte, bool_44_: Boolean, bool_45_: Boolean, bool_46_: Boolean, bool_47_: Boolean, bool_48_: Boolean, i_49_: Byte, bool_50_: Boolean, bool_51_: Boolean, i_52_: Int)

    override fun method3696(i: Int) 

    override fun H(i: Int, i_53_: Int, i_54_: Int, `is`: IntArray?)

    /*private*/ fun g() 

    override fun b(i: Int, i_55_: Int, i_56_: Int, i_57_: Int, d: Double)

    override fun method3700(f: Float, f_58_: Float, f_59_: Float) 

    override fun method3686(fontDefinition: FontDefinition?, spriteImages: Array<SpriteImage>?, bool: Boolean): RSFont 

    /*private*/ fun wa(i: Int, i_62_: Int, i_63_: Int, i_64_: Int, i_65_: Int, i_66_: Int)

    override fun method3644(): Boolean 

    fun method3973(): a? 

    /*private*/ fun t(var_p: p?)

    override fun method3705(): AbstractCameraTransform 

    /*private*/ fun WA(i: Short): Boolean 

    /*private*/ fun method3975(nodeDequeHolder: NodeDequeHolder, bool: Boolean) 

    override fun method3659(i: Int) 

    override fun method3632(`is`: IntArray?) 

    /*private*/ fun CA(i: Short, `is`: IntArray?, i_71_: Short, i_72_: Int, i_73_: Byte, i_74_: Byte, i_75_: Int, bool: Boolean, i_76_: Byte, i_77_: Byte, i_78_: Byte, i_79_: Byte, bool_80_: Boolean, bool_81_: Boolean, bool_82_: Boolean, bool_83_: Boolean, bool_84_: Boolean, i_85_: Byte, bool_86_: Boolean, bool_87_: Boolean, i_88_: Int)

    override fun DA(i: Int, i_89_: Int, i_90_: Int, i_91_: Int)

    override fun method3702(i: Int): ShaderProgram 

    override fun method3650(i: Int) 

    override fun method3667(i: Int, i_92_: Int): Int 

    override fun xa(f: Float)

    override fun method3701(canvas: Canvas?) 

    override fun method3636(i: Int, i_95_: Int, i_96_: Int, i_97_: Int, i_98_: Int, i_99_: Int, var_sprite: Sprite?, i_100_: Int, i_101_: Int) 

    /*@Synchronized*/
    /*protected*/ override fun finalize() 

    /*private*/ fun d(i: Int)

    override fun i(): Int

    /*private*/ fun n(l: Long, l_102_: Long)

    override fun method3684(nodeDequeHolder: NodeDequeHolder) 

    override fun method3704(): Int 

    override fun JA(i: Int, i_103_: Int, i_104_: Int, i_105_: Int, i_106_: Int, i_107_: Int): Int

    override fun method3652() 

    override fun method3669(canvas: Canvas?, i: Int, i_108_: Int) 

    /*private*/ fun c(i: Short): Boolean 

    override fun method3666(): Boolean 

    override fun Q(i: Int, i_109_: Int, i_110_: Int, i_111_: Int, i_112_: Int, i_113_: Int, `is`: ByteArray?, i_114_: Int, i_115_: Int)

    override fun method3629(i: Int, i_116_: Int, bool: Boolean): AbstractModelRenderer 

    override fun ya()

    override fun I(): Int

    override fun f(i: Int, i_117_: Int)

    override fun KA(i: Int, i_118_: Int, i_119_: Int, i_120_: Int)

    override fun method3646(i: Int) 

    override fun method3679(i: Int, i_121_: Int): Int 

    override fun ra(i: Int, i_122_: Int, i_123_: Int, i_124_: Int)

    override fun E(): Int

    override fun pa()

    override fun method3688(i: Int, i_125_: Int, i_126_: Int, i_127_: Int, i_128_: Int, i_129_: Int, i_130_: Int) 

    override fun GA(i: Int)

    override fun method3670(): Boolean 

    override fun X(i: Int)

    override fun method3625(modelDefinition: ModelDefinition?, i: Int, i_131_: Int, i_132_: Int, i_133_: Int): AbstractModel 

    override fun c(): RendererType 

    override fun method3674(i: Int, i_134_: Int, i_135_: Int, i_136_: Int, i_137_: Int, i_138_: Int, i_139_: Int, i_140_: Int, i_141_: Int) 

    override fun F(i: Int, i_142_: Int)

    override fun method3683(i: Int, i_143_: Int, i_144_: Int, i_145_: Int, bool: Boolean): AbstractModelRenderer 

    override fun method3631(i: Int) 

    override fun r(i: Int, i_147_: Int, i_148_: Int, i_149_: Int, i_150_: Int, i_151_: Int, i_152_: Int): Int

    /*private*/ fun va(var_shaderProgram: ShaderProgram?)

    override fun method3643(canvas: Canvas?, i: Int, i_153_: Int) 

    override fun method3706(circleRasterizer: CircleRasterizer?, circleRasterizer_154_: CircleRasterizer?, f: Float, circleRasterizer_155_: CircleRasterizer?): CircleRasterizer? 

    override fun K(`is`: IntArray?)

    override fun method3694(): Boolean 

    @Throws(ClientException::class)
    override fun method3626(i: Int, i_156_: Int) 

    override fun method3665(i: Int, i_157_: Int): CameraMarker 

    override fun method3642(i: Int, class348_sub1s: Array<AbstractTileShape?>?) 

    override fun za(i: Int, i_160_: Int, i_161_: Int, i_162_: Int, i_163_: Int)

    override fun na(i: Int, i_164_: Int, i_165_: Int, i_166_: Int): IntArray?

    override fun method3647(bool: Boolean) 

    override fun method3690(i: Int, i_167_: Int, i_168_: Int, i_169_: Int, i_170_: Int, f: Float): AbstractTileShape 

    override fun method3677(canvas: Canvas?) 

    override fun method3682(): Boolean 

    override fun method3653(circleRasterizer: CircleRasterizer?) 

    override fun method3654(): AbstractCameraTransform 

    override fun method3678(i: Int) 

    override fun EA(i: Int, i_171_: Int, i_172_: Int, i_173_: Int)

    override fun method3633() 

    override fun method3658(i: Int, i_174_: Int, i_175_: Int, i_176_: Int) 

    /*private*/ fun FA()

    override fun P(i: Int, i_178_: Int, i_179_: Int, i_180_: Int, i_181_: Int)

    override fun method3695(): Boolean 

    override fun U(i: Int, i_182_: Int, i_183_: Int, i_184_: Int, i_185_: Int)

    override fun Y(): IntArray

    override fun ZA(i: Int, f: Float, f_186_: Float, f_187_: Float, f_188_: Float, f_189_: Float)

    override fun method3634(cameraMarker: CameraMarker?, marker: Marker?): SpriteDrawTarget 

    override fun method3687(spriteDrawTarget: SpriteDrawTarget?) 

    override fun da(i: Int, i_190_: Int, i_191_: Int, `is`: IntArray?)

    override fun method3661(i: Int, i_192_: Int, `is`: IntArray?, is_193_: IntArray?): Sprite 

    override fun method3640(): AbstractCameraTransform? 

    override fun method3709(i: Int, i_194_: Int, i_195_: Int, i_196_: Int, i_197_: Int, i_198_: Int) 

    /*private*/ fun Z(i: Int, i_199_: Int, i_200_: Int, i_201_: Int, i_202_: Int, i_203_: Int, var_sprite: Sprite?, i_204_: Int, i_205_: Int)

    override fun C(bool: Boolean)

    override fun method3624(i: Int, i_206_: Int): Marker 

    override fun method3639(): Boolean 

    override fun L(i: Int, i_207_: Int, i_208_: Int)

    override fun method3711(`is`: IntArray?, i: Int, i_209_: Int, i_210_: Int, i_211_: Int, bool: Boolean): AbstractModelRenderer 

    override fun la()

    override fun method3630(bool: Boolean) 

    override fun M(): Int

    override fun method3627(): Boolean 

    /*private*/ fun OA(): Any 

    override fun method3655(): Boolean 

    override fun method3703(i: Int, i_212_: Int, i_213_: Int, i_214_: Int, i_215_: Int, i_216_: Int, var_sprite: Sprite?, i_217_: Int, i_218_: Int, i_219_: Int, i_220_: Int, i_221_: Int) 

    override fun method3638(abstractCameraTransform: AbstractCameraTransform?) 

    override fun method3672() 

    override fun method3648(i: Int, i_222_: Int, `is`: Array<IntArray?>, is_223_: Array<IntArray?>?, i_224_: Int, i_225_: Int, i_226_: Int): TerrainTile 

    override fun XA(): Int

    /*private*/ fun N(i: Int, `is`: IntArray?, fs: FloatArray?)

    override fun T(i: Int, i_227_: Int, i_228_: Int, i_229_: Int)

    override fun method3693(): Boolean 

    override fun method3673() 

    override fun method3671(): Boolean 

    override fun method3699(): Boolean
}
