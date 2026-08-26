import AbstractCameraTransform
import AbstractModel
import Disposable
import ModelDefinition
import ModelFacePriorityNode
import RenderNode
import SceneOcculder
import TerrainTile
import WidgetRedrawRegion

/* i - Decompiled by JODE
* Visit http://jode.sourceforge.net/
* NativeModel
*/
expect class i : AbstractModel, Disposable {

    var aWidgetRedrawRegionArray5118: Array<WidgetRedrawRegion?>?

    var nativeid: Long

    var aModelFacePriorityNodeArray5119: Array<ModelFacePriorityNode?>?

    override fun C(i: Int)

    override fun k(i: Int)

    override fun w(bool: Boolean)

    override fun O(i: Int, i_0_: Int, i_1_: Int)

    override fun s(i: Int)

    override fun LA(i: Int)

    override fun fa(): Int

    override fun NA(): Boolean

    override fun F(): Boolean

    fun ZA(var_i_2_: i?, var_i_3_: i?, i: Int, bool: Boolean, bool_4_: Boolean)

    public override fun method613(abstractModel: AbstractModel?, i: Int, i_5_: Int, i_6_: Int, bool: Boolean)

    override fun aa(i: Short, i_7_: Short)

    public override fun method623(i: Int, i_8_: Int, abstractCameraTransform: AbstractCameraTransform?, bool: Boolean, i_9_: Int, i_10_: Int): Boolean

    override fun EA(): Int

    public override fun method619(): Array<ModelFacePriorityNode?>?

    override fun wa()

    override fun P(i: Int, i_11_: Int, i_12_: Int, i_13_: Int)

    public override fun method608(abstractCameraTransform: AbstractCameraTransform?, class318_sub3: SceneOcculder?, i: Int, i_14_: Int)

    override fun v()

    fun l(l: Long, i: Int, `is`: IntArray?, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int, bool: Boolean)

    public override fun method618(): Boolean

    public override fun method621()

    override fun VA(i: Int)

    public override fun method628(i: Int, i_19_: Int, abstractCameraTransform: AbstractCameraTransform?, bool: Boolean, i_20_: Int): Boolean

    public override fun method614(i: Byte, i_21_: Int, bool: Boolean): AbstractModel

    override fun na(): Int

    override fun HA(): Int

    public override fun method612()

    override fun p(i: Int, i_22_: Int, var_terrainTile: TerrainTile?, var_terrainTile_23_: TerrainTile?, i_24_: Int, i_25_: Int, i_26_: Int)

    override fun V(): Int

    override fun da(): Int

    public override fun method605(i: Int, `is`: IntArray, i_27_: Int, i_28_: Int, i_29_: Int, i_30_: Int, bool: Boolean)

    override fun G(): Int

    override fun ma(): Int

    fun R(
        var_oa: oa?,
        var_ya: ya?,
        i: Int,
        i_31_: Int,
        `is`: IntArray?,
        is_32_: IntArray?,
        is_33_: IntArray?,
        is_34_: IntArray?,
        is_35_: ShortArray?,
        i_36_: Int,
        is_37_: ShortArray?,
        is_38_: ShortArray?,
        is_39_: ShortArray?,
        is_40_: ByteArray?,
        is_41_: ByteArray?,
        is_42_: ByteArray?,
        is_43_: ByteArray?,
        is_44_: ShortArray?,
        is_45_: ShortArray?,
        is_46_: IntArray?,
        i_47_: Byte,
        is_48_: ShortArray?,
        i_49_: Int,
        is_50_: ByteArray?,
        is_51_: ShortArray?,
        is_52_: ShortArray?,
        is_53_: ShortArray?,
        is_54_: IntArray?,
        is_55_: IntArray?,
        is_56_: IntArray?,
        is_57_: ByteArray?,
        is_58_: ByteArray?,
        is_59_: IntArray?,
        is_60_: IntArray?,
        is_61_: IntArray?,
        is_62_: IntArray?,
        i_63_: Int,
        i_64_: Int,
        i_65_: Int,
        i_66_: Int,
        i_67_: Int,
        i_68_: Int,
        is_69_: IntArray?
    )

    override fun FA(i: Int)

    public override fun method624(i: Int, i_70_: Int, i_71_: Int, i_72_: Int)

    override fun ia(i: Short, i_73_: Short)

    fun finalize()

    override fun WA(): Int

    public override fun method610(abstractCameraTransform: AbstractCameraTransform, i: Int, bool: Boolean)

    public override fun method622()

    public override fun method615(abstractCameraTransform: AbstractCameraTransform?, class318_sub3: SceneOcculder?, i: Int)

    override fun r(): Boolean

    public override fun method620(abstractCameraTransform: AbstractCameraTransform?)

    override fun a(i: Int)

    public override fun method604(): Array<WidgetRedrawRegion?>?

    fun method693(`is`: IntArray?, abstractCameraTransform: AbstractCameraTransform?)

    override fun ua(): Int

    override fun H(i: Int, i_77_: Int, i_78_: Int)

    constructor(var_oa: oa, var_ya: ya?, modelDefinition: ModelDefinition, i: Int, i_79_: Int, i_80_: Int, i_81_: Int)

    fun A(l: Long, i: Int, bool: Boolean)

    override fun ba(var_renderNode: RenderNode?): RenderNode?

    fun oa(var_oa: oa?)

    constructor(var_oa: oa)

    override fun RA(): Int

    override fun I(i: Int, `is`: IntArray, i_92_: Int, i_93_: Int, i_94_: Int, bool: Boolean, i_95_: Int, is_96_: IntArray?)
}
