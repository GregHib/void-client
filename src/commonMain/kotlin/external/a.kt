package external

import AbstractCameraTransform
import AbstractModel
import Disposable
import Renderer
import TerrainTile

/* a - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
expect class a : Disposable {
    var nativeid: Long
//    var aRunnable5112: Runnable?

    fun method142(var_terrainTile: TerrainTile, i: Int, i_0_: Int)

    fun R(l: Long, l_1_: Long, i: Int, i_2_: Int, l_3_: Long, bool: Boolean): Boolean

    fun method143(abstractModel: AbstractModel, i: Int, i_4_: Int, abstractCameraTransform: AbstractCameraTransform?, bool: Boolean, i_5_: Int): Boolean

    fun method144(abstractModel: AbstractModel, abstractModel_6_: AbstractModel?, i: Int, i_7_: Int, i_8_: Int, bool: Boolean)

    fun E(l: Long, bool: Boolean)

    fun e(l: Long, l_9_: Long, `is`: IntArray?, l_10_: Long)

    fun W(l: Long)

    fun finalize()

    fun method145(abstractModel: AbstractModel?, abstractCameraTransform: AbstractCameraTransform, `is`: IntArray?, i: Int)

    fun n(l: Long, l_11_: Long, i: Int, i_12_: Int, l_13_: Long, bool: Boolean, i_14_: Int): Boolean

    fun method146(abstractModel: AbstractModel, i: Int, i_15_: Int, abstractCameraTransform: AbstractCameraTransform?, bool: Boolean): Boolean

    fun method147(var_terrainTile: TerrainTile, i: Int, i_16_: Int, i_17_: Int)

    override fun w(bool: Boolean)

    fun method148(var_terrainTile: TerrainTile, i: Int, i_18_: Int, i_19_: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int, bools: Array<BooleanArray?>?)

    fun method149(abstractModel: AbstractModel, abstractCameraTransform: AbstractCameraTransform?, `is`: IntArray?, i: Int, i_24_: Int)

    fun na(l: Long, var_renderer: Renderer?, i: Int, i_25_: Int, i_26_: Int, i_27_: Int, i_28_: Int, i_29_: Int, i_30_: Int)

    fun O(l: Long, var_renderer: Renderer?, `is`: IntArray?, is_31_: IntArray?, is_32_: IntArray?, is_33_: ShortArray?, i: Int)

    fun method150(var_renderer: Renderer?, i: Int, i_34_: Int, i_35_: Int, i_36_: Int, i_37_: Int, i_38_: Int, i_39_: Int)

    fun f(l: Long, l_40_: Long, l_41_: Long, `is`: IntArray?, i: Int, i_42_: Int)

    fun r(l: Long, l_43_: Long, l_44_: Long, i: Int, i_45_: Int, i_46_: Int, bool: Boolean)

    fun method151(abstractModel: AbstractModel, `is`: IntArray?, abstractCameraTransform: AbstractCameraTransform?)

    fun method152(var_i: i, i: Byte, i_47_: Int, bool: Boolean): AbstractModel

    fun ta(l: Long, l_50_: Long, i: Int, i_51_: Int, i_52_: Int, i_53_: Int, i_54_: Int, i_55_: Int, i_56_: Int, bools: Array<BooleanArray?>?)

    fun Z(l: Long, l_57_: Long, i: Int, i_58_: Int, i_59_: Int)

    fun method153()

    fun method154()

    fun M(l: Long)

    fun H(l: Long, l_60_: Long, i: Int, i_61_: Int)

    fun UA(l: Long, l_62_: Long, l_63_: Long, `is`: IntArray?, i: Int)

    fun method155(var_renderer: Renderer?, `is`: IntArray?, is_64_: IntArray?, is_65_: IntArray?, is_66_: ShortArray?, i: Int)

    fun HA(l: Long, var_renderer: Renderer?, i: Int, i_67_: Int)

    fun method156()

    fun method157()
}