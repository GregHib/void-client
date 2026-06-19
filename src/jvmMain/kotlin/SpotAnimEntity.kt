import InputTrackerStatics.method3591
import MapRegionLoaderStatics.method756
import MapRegionLoaderStatics.method760
import MapRegionLoaderStatics.method761
import AnimationFrameState.method867
import InputStream_Sub1Statics.method126
import kotlin.math.atan2
import kotlin.math.sqrt
import SpotAnimEntityStatics.method2508
import SpotAnimEntityStatics.anInt6437
import SpotAnimEntityStatics.anInt6445
import SpotAnimEntityStatics.anInt6448

/* Class318_Sub7 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SpotAnimEntity internal constructor(var_renderer: Renderer?, modelFacePriorityNode: ModelFacePriorityNode?, class318_sub10: SceneGraphContainer?, l: Long) : SceneLinkedListNode() {
    var aDoublyLinkedNodeList_6433: DoublyLinkedNodeList? = null
    private var anInt6434 = 0
    private val aLong6435: Long
    var aModelFacePriorityNode_6436: ModelFacePriorityNode? = null
    var aClass318_Sub10_6439: SceneGraphContainer? = null
    var aSpotAnimDefinition_6441: SpotAnimDefinition? = null
    var aViewportTransform_6444: ViewportTransform
    var aBoolean6446: Boolean = false
    var anInt6447: Int = 0
    private var aViewportTransform_6449: ViewportTransform
    private var anInt6452 = 0
    private var aBoolean6453: Boolean
    private var anInt6454 = 0
    private var anInt6455 = 0
    private var anInt6456 = 0
    private var anInt6457 = 0
    private var anInt6458 = 0
    private var anInt6459 = 0

    fun method2507(bool: Boolean) {
        this.aViewportTransform_6444.anInt3670 = this.aModelFacePriorityNode_6436!!.anInt1890
        anInt6448++
        this.aViewportTransform_6444.anInt3666 = this.aModelFacePriorityNode_6436!!.anInt1889
        this.aViewportTransform_6444.anInt3668 = this.aModelFacePriorityNode_6436!!.anInt1883
        this.aViewportTransform_6444.anInt3669 = this.aModelFacePriorityNode_6436!!.anInt1874
        this.aViewportTransform_6444.anInt3680 = this.aModelFacePriorityNode_6436!!.anInt1876
        this.aViewportTransform_6444.anInt3679 = this.aModelFacePriorityNode_6436!!.anInt1880
        this.aViewportTransform_6444.anInt3678 = this.aModelFacePriorityNode_6436!!.anInt1891
        this.aViewportTransform_6444.anInt3672 = this.aModelFacePriorityNode_6436!!.anInt1884
        if (bool == true) {
            this.aViewportTransform_6444.anInt3675 = this.aModelFacePriorityNode_6436!!.anInt1882
            if ((this.aViewportTransform_6444.anInt3675 == (this.aViewportTransform_6444.anInt3668)) && ((this.aViewportTransform_6444.anInt3680) == (this.aViewportTransform_6444.anInt3668)) && ((this.aViewportTransform_6444.anInt3670) == (this.aViewportTransform_6444.anInt3678)) && ((this.aViewportTransform_6444.anInt3669) == (this.aViewportTransform_6444.anInt3670)) && ((this.aViewportTransform_6444.anInt3679) == (this.aViewportTransform_6444.anInt3666)) && ((this.aViewportTransform_6444.anInt3679) == (this.aViewportTransform_6444.anInt3672))) aBoolean6453 =
                true
            else if (aBoolean6453) {
                aViewportTransform_6449.anInt3678 = (this.aViewportTransform_6444.anInt3678)
                aBoolean6453 = false
                aViewportTransform_6449.anInt3672 = (this.aViewportTransform_6444.anInt3672)
                aViewportTransform_6449.anInt3666 = (this.aViewportTransform_6444.anInt3666)
                aViewportTransform_6449.anInt3670 = (this.aViewportTransform_6444.anInt3670)
                aViewportTransform_6449.anInt3668 = (this.aViewportTransform_6444.anInt3668)
                aViewportTransform_6449.anInt3679 = (this.aViewportTransform_6444.anInt3679)
                aViewportTransform_6449.anInt3675 = (this.aViewportTransform_6444.anInt3675)
                aViewportTransform_6449.anInt3669 = (this.aViewportTransform_6444.anInt3669)
                aViewportTransform_6449.anInt3680 = (this.aViewportTransform_6444.anInt3680)
            }
        }
    }

    fun method2511(bool: Boolean, var_renderer: Renderer?, l: Long) {
        try {
            anInt6437++
            if (bool != true) this.aDoublyLinkedNodeList_6433 = null
            var class318_sub9_sub2_sub1 = (this.aDoublyLinkedNodeList_6433!!.method1872(8) as ProjectileNode?)
            while (class318_sub9_sub2_sub1 != null) {
                class318_sub9_sub2_sub1.method2522(var_renderer, l)
                class318_sub9_sub2_sub1 = this.aDoublyLinkedNodeList_6433!!.method1878(126.toByte()) as ProjectileNode?
            }
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("rba.F(" + bool + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + l + ')'))
        }
    }

    fun method2513(var_renderer: Renderer?, i: Int, l: Long, i_9_: Int, bool: Boolean) {
        var bool = bool
        do {
            try {
                if (!this.aBoolean6446) {
                    if (HslColorTableNodeStatics.anInt6637 < (this.aSpotAnimDefinition_6441!!.anInt2379)) bool = false
                    else if (MapArchiveSourceStatics.anInt4797 <= (CollisionMapAccessor.anIntArray3551!![HslColorTableNodeStatics.anInt6637])) {
                        if (!aBoolean6453) {
                            if (this.aSpotAnimDefinition_6441!!.anInt2425 != -1) {
                                var i_10_ = (-aLong6435 + l).toInt()
                                if (!(this.aSpotAnimDefinition_6441!!.aBoolean2411) && (this.aSpotAnimDefinition_6441!!.anInt2425) < i_10_) bool = false
                                else i_10_ %= (this.aSpotAnimDefinition_6441!!.anInt2425)
                                if (!(this.aSpotAnimDefinition_6441!!.aBoolean2406) && ((this.aSpotAnimDefinition_6441!!.anInt2393) > i_10_)) bool = false
                                if (this.aSpotAnimDefinition_6441!!.aBoolean2406 && (this.aSpotAnimDefinition_6441!!.anInt2393) <= i_10_) bool = false
                            }
                        } else bool = false
                    } else bool = false
                } else bool = false
                anInt6445++
                if (bool) {
                    ObjectSpawnDecoder.anInt1803++
                    val i_11_ = (((this.aViewportTransform_6444.anInt3675) + this.aViewportTransform_6444.anInt3668 + this.aViewportTransform_6444.anInt3680) / 3)
                    val i_12_ = (((this.aViewportTransform_6444.anInt3669) + this.aViewportTransform_6444.anInt3678 + this.aViewportTransform_6444.anInt3670) / 3)
                    val i_13_ = (((this.aViewportTransform_6444.anInt3672) + this.aViewportTransform_6444.anInt3679 + this.aViewportTransform_6444.anInt3666) / 3)
                    if (i_11_ != (this.aViewportTransform_6444.anInt3673) || i_12_ != this.aViewportTransform_6444.anInt3667 || i_13_ != (this.aViewportTransform_6444.anInt3671)) {
                        this.aViewportTransform_6444.anInt3667 = i_12_
                        this.aViewportTransform_6444.anInt3673 = i_11_
                        this.aViewportTransform_6444.anInt3671 = i_13_
                        val i_14_ = (-this.aViewportTransform_6444.anInt3675 + this.aViewportTransform_6444.anInt3668)
                        val i_15_ = (-this.aViewportTransform_6444.anInt3678 + this.aViewportTransform_6444.anInt3670)
                        val i_16_ = (-this.aViewportTransform_6444.anInt3666 + this.aViewportTransform_6444.anInt3679)
                        val i_17_ = (this.aViewportTransform_6444.anInt3680 - this.aViewportTransform_6444.anInt3675)
                        val i_18_ = (this.aViewportTransform_6444.anInt3669 - this.aViewportTransform_6444.anInt3678)
                        val i_19_ = (-this.aViewportTransform_6444.anInt3666 + this.aViewportTransform_6444.anInt3672)
                        anInt6457 = i_17_ * i_16_ + -(i_14_ * i_19_)
                        anInt6455 = i_15_ * i_19_ + -(i_18_ * i_16_)
                        anInt6458 = -(i_17_ * i_15_) + i_18_ * i_14_
                        while ((anInt6455 > 32767 || anInt6457 > 32767 || anInt6458 > 32767 || anInt6455 < -32767 || anInt6457 < -32767 || anInt6458 < -32767)) {
                            anInt6458 = anInt6458 shr 1
                            anInt6457 = anInt6457 shr 1
                            anInt6455 = anInt6455 shr 1
                        }
                        var i_20_ = sqrt((anInt6455 * anInt6455 - (-(anInt6457 * anInt6457) + -(anInt6458 * anInt6458))).toDouble()).toInt()
                        if (i_20_ <= 0) i_20_ = 1
                        anInt6455 = anInt6455 * 32767 / i_20_
                        anInt6458 = 32767 * anInt6458 / i_20_
                        anInt6457 = 32767 * anInt6457 / i_20_
                        if ((this.aSpotAnimDefinition_6441!!.aShort2415) > 0 || this.aSpotAnimDefinition_6441!!.aShort2441 > 0) {
                            val i_21_ = (2607.5945876176133 * atan2(anInt6458.toDouble(), anInt6455.toDouble())).toInt()
                            val i_22_ = (2607.5945876176133 * (atan2(anInt6457.toDouble(), (sqrt((anInt6458 * anInt6458 + (anInt6455 * anInt6455)).toDouble()))))).toInt()
                            anInt6456 = (this.aSpotAnimDefinition_6441!!.aShort2415 - (this.aSpotAnimDefinition_6441!!.aShort2431))
                            anInt6459 = (this.aSpotAnimDefinition_6441!!.aShort2431 + i_21_ - (anInt6456 shr 1))
                            anInt6454 = (-this.aSpotAnimDefinition_6441!!.aShort2418 + (this.aSpotAnimDefinition_6441!!.aShort2441))
                            anInt6452 = i_22_ - (-(this.aSpotAnimDefinition_6441!!.aShort2418) - -(anInt6454 shr 1))
                        }
                    }
                    anInt6434 += ((((-this.aSpotAnimDefinition_6441!!.anInt2391 + this.aSpotAnimDefinition_6441!!.anInt2389).toDouble() * Math.random()) + this.aSpotAnimDefinition_6441!!.anInt2391.toDouble()) * i.toDouble()).toInt()
                    if (anInt6434 > 63) {
                        val i_23_ = anInt6434 shr 6
                        anInt6434 = anInt6434 and 0x3f
                        for (i_24_ in 0..<i_23_) {
                            val i_25_: Int
                            val i_26_: Int
                            val i_27_: Int
                            if (this.aSpotAnimDefinition_6441!!.aShort2415 <= 0 && this.aSpotAnimDefinition_6441!!.aShort2441 <= 0) {
                                i_25_ = anInt6455
                                i_27_ = anInt6458
                                i_26_ = anInt6457
                            } else {
                                var i_28_ = ((Math.random() * anInt6456.toDouble()).toInt() + anInt6459)
                                i_28_ = i_28_ and 0x3fff
                                val i_29_ = TrigLookupTablesStatics.anIntArray1207!![i_28_]
                                val i_30_ = TrigLookupTablesStatics.anIntArray1204!![i_28_]
                                var i_31_ = anInt6452 + (anInt6454.toDouble() * Math.random()).toInt()
                                i_31_ = i_31_ and 0x1fff
                                val i_32_ = TrigLookupTablesStatics.anIntArray1207!![i_31_]
                                val i_33_ = TrigLookupTablesStatics.anIntArray1204!![i_31_]
                                val i_34_ = 13
                                i_25_ = i_32_ * i_30_ shr i_34_
                                i_26_ = -1 * (i_33_ shl 1)
                                i_27_ = i_32_ * i_29_ shr i_34_
                            }
                            var f = Math.random().toFloat()
                            var f_35_ = Math.random().toFloat()
                            if (f + f_35_ > 1.0f) {
                                f_35_ = 1.0f - f_35_
                                f = -f + 1.0f
                            }
                            val f_36_ = 1.0f - (f + f_35_)
                            val i_37_ = ((this.aViewportTransform_6444.anInt3680.toFloat() * f_36_) + (f * (this.aViewportTransform_6444.anInt3675).toFloat() + (f_35_ * (this.aViewportTransform_6444.anInt3668).toFloat()))).toInt()
                            val i_38_ = (f * (this.aViewportTransform_6444.anInt3678).toFloat() + (this.aViewportTransform_6444.anInt3670).toFloat() * f_35_ + (this.aViewportTransform_6444.anInt3669).toFloat() * f_36_).toInt()
                            val i_39_ = ((this.aViewportTransform_6444.anInt3666.toFloat() * f) + (this.aViewportTransform_6444.anInt3679).toFloat() * f_35_ + (f_36_ * (this.aViewportTransform_6444.anInt3672).toFloat())).toInt()
                            val i_40_ = ((aViewportTransform_6449.anInt3680).toFloat() * f_36_ + (f_35_ * (aViewportTransform_6449.anInt3668).toFloat() + f * (aViewportTransform_6449.anInt3675).toFloat())).toInt()
                            val i_41_ = ((aViewportTransform_6449.anInt3670).toFloat() * f_35_ + (aViewportTransform_6449.anInt3678).toFloat() * f + (aViewportTransform_6449.anInt3669).toFloat() * f_36_).toInt()
                            val i_42_ = ((aViewportTransform_6449.anInt3672).toFloat() * f_36_ + ((aViewportTransform_6449.anInt3666.toFloat() * f) + (aViewportTransform_6449.anInt3679).toFloat() * f_35_)).toInt()
                            val i_43_ = i_37_ - i_40_
                            val i_44_ = -i_41_ + i_38_
                            val i_45_ = i_39_ + -i_42_
                            val i_46_ = (i_43_.toDouble() * Math.random() + i_40_.toDouble()).toInt()
                            val i_47_ = (i_41_.toDouble() + i_44_.toDouble() * Math.random()).toInt()
                            val i_48_ = (i_42_.toDouble() + i_45_.toDouble() * Math.random()).toInt()
                            val i_49_ = ((Math.random() * ((this.aSpotAnimDefinition_6441!!.anInt2438) + -(this.aSpotAnimDefinition_6441!!.anInt2392)).toDouble()).toInt() + this.aSpotAnimDefinition_6441!!.anInt2392)
                            val i_50_ = (this.aSpotAnimDefinition_6441!!.anInt2394 + ((-(this.aSpotAnimDefinition_6441!!.anInt2394) + (this.aSpotAnimDefinition_6441!!.anInt2407)).toDouble() * Math.random()).toInt())
                            val i_51_ = ((((this.aSpotAnimDefinition_6441!!.anInt2417) - (this.aSpotAnimDefinition_6441!!.anInt2442)).toDouble() * Math.random()).toInt() + this.aSpotAnimDefinition_6441!!.anInt2442)
                            val i_52_: Int
                            if (this.aSpotAnimDefinition_6441!!.aBoolean2443) {
                                val d = Math.random()
                                i_52_ =
                                    ((d * (this.aSpotAnimDefinition_6441!!.anInt2408).toDouble() + (this.aSpotAnimDefinition_6441!!.anInt2399).toDouble()).toInt() or ((((this.aSpotAnimDefinition_6441!!.anInt2433).toDouble() * d + (this.aSpotAnimDefinition_6441!!.anInt2429).toDouble()).toInt() shl 16) or (((this.aSpotAnimDefinition_6441!!.anInt2390).toDouble() + ((this.aSpotAnimDefinition_6441!!.anInt2403).toDouble() * d)).toInt() shl 8)) or (((this.aSpotAnimDefinition_6441!!.anInt2413).toDouble() + ((this.aSpotAnimDefinition_6441!!.anInt2410).toDouble() * (Math.random()))).toInt() shl 24))
                            } else i_52_ =
                                (((((this.aSpotAnimDefinition_6441!!.anInt2410).toDouble() * Math.random()) + (this.aSpotAnimDefinition_6441!!.anInt2413).toDouble()).toInt() shl 24) or ((((Math.random() * (this.aSpotAnimDefinition_6441!!.anInt2433).toDouble()) + (this.aSpotAnimDefinition_6441!!.anInt2429).toDouble()).toInt() shl 16) or (((Math.random() * (this.aSpotAnimDefinition_6441!!.anInt2403).toDouble()) + (this.aSpotAnimDefinition_6441!!.anInt2390).toDouble()).toInt() shl 8) or (((this.aSpotAnimDefinition_6441!!.anInt2408).toDouble() * Math.random()) + (this.aSpotAnimDefinition_6441!!.anInt2399).toDouble()).toInt()))
                            var i_53_ = (this.aSpotAnimDefinition_6441!!.anInt2414)
                            if (!var_renderer!!.method3644() && !(this.aSpotAnimDefinition_6441!!.aBoolean2382)) i_53_ = -1
                            if (ClientStatics.anInt5171 == TerrainTileShapeStatics.anInt8808) {
                                val class318_sub9_sub2_sub1 = (ProjectileNode(this, i_46_, i_47_, i_48_, i_25_, i_26_, i_27_, i_49_, i_50_, i_52_, i_51_, i_53_, (this.aSpotAnimDefinition_6441!!.aBoolean2435), (this.aSpotAnimDefinition_6441!!.aBoolean2430)))
                            } else {
                                val class318_sub9_sub2_sub1 = (DisplayModeOptionStateStatics.aClass318_Sub9_Sub2_Sub1Array6103!![TerrainTileShapeStatics.anInt8808])
                                TerrainTileShapeStatics.anInt8808 = 0x3ff and 1 + TerrainTileShapeStatics.anInt8808
                                class318_sub9_sub2_sub1!!.method2523(this, i_46_, i_47_, i_48_, i_25_, i_26_, i_27_, i_49_, i_50_, i_52_, i_51_, i_53_, (this.aSpotAnimDefinition_6441!!.aBoolean2435), (this.aSpotAnimDefinition_6441!!.aBoolean2430))
                            }
                        }
                    }
                }
                if (!this.aViewportTransform_6444.method2115(aViewportTransform_6449, true)) {
                    val class284 = aViewportTransform_6449
                    aViewportTransform_6449 = this.aViewportTransform_6444
                    this.aViewportTransform_6444 = class284
                    this.aViewportTransform_6444.anInt3678 = (this.aModelFacePriorityNode_6436!!.anInt1891)
                    this.aViewportTransform_6444.anInt3675 = (this.aModelFacePriorityNode_6436!!.anInt1882)
                    this.aViewportTransform_6444.anInt3670 = (this.aModelFacePriorityNode_6436!!.anInt1890)
                    this.aViewportTransform_6444.anInt3672 = (this.aModelFacePriorityNode_6436!!.anInt1884)
                    this.aViewportTransform_6444.anInt3680 = (this.aModelFacePriorityNode_6436!!.anInt1876)
                    this.aViewportTransform_6444.anInt3679 = (this.aModelFacePriorityNode_6436!!.anInt1880)
                    this.aViewportTransform_6444.anInt3666 = (this.aModelFacePriorityNode_6436!!.anInt1889)
                    this.aViewportTransform_6444.anInt3673 = aViewportTransform_6449.anInt3673
                    this.aViewportTransform_6444.anInt3669 = (this.aModelFacePriorityNode_6436!!.anInt1874)
                    this.aViewportTransform_6444.anInt3671 = aViewportTransform_6449.anInt3671
                    this.aViewportTransform_6444.anInt3667 = aViewportTransform_6449.anInt3667
                    this.aViewportTransform_6444.anInt3668 = (this.aModelFacePriorityNode_6436!!.anInt1883)
                }
                this.anInt6447 = 0
                var class318_sub9_sub2_sub1 = this.aDoublyLinkedNodeList_6433!!.method1872(i_9_ + 5) as ProjectileNode?
                while (class318_sub9_sub2_sub1 != null) {
                    class318_sub9_sub2_sub1.method2524(l, i)
                    this.anInt6447++
                    class318_sub9_sub2_sub1 = (this.aDoublyLinkedNodeList_6433!!.method1878(122.toByte()) as ProjectileNode?)
                }
                SkyboxGradient.anInt3936 += this.anInt6447
                if (i_9_ == 3) break
                method2508(124)
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("rba.C(" + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + l + ',' + i_9_ + ',' + bool + ')'))
            }
            break
        } while (false)
    }

    init {
        this.aViewportTransform_6444 = ViewportTransform()
        aViewportTransform_6449 = ViewportTransform()
        aBoolean6453 = false
        try {
            aLong6435 = l
            this.aModelFacePriorityNode_6436 = modelFacePriorityNode
            this.aClass318_Sub10_6439 = class318_sub10
            this.aSpotAnimDefinition_6441 = this.aModelFacePriorityNode_6436!!.method1125(59.toByte())
            if (!var_renderer!!.method3644() && (this.aSpotAnimDefinition_6441!!.anInt2387) != -1) this.aSpotAnimDefinition_6441 = method3591((this.aSpotAnimDefinition_6441!!.anInt2387), 0)
            this.aDoublyLinkedNodeList_6433 = DoublyLinkedNodeList()
            anInt6434 = (anInt6434 + 64.0 * Math.random()).toInt()
            method2507(true)
            aViewportTransform_6449.anInt3680 = this.aViewportTransform_6444.anInt3680
            aViewportTransform_6449.anInt3669 = this.aViewportTransform_6444.anInt3669
            aViewportTransform_6449.anInt3668 = this.aViewportTransform_6444.anInt3668
            aViewportTransform_6449.anInt3675 = this.aViewportTransform_6444.anInt3675
            aViewportTransform_6449.anInt3670 = this.aViewportTransform_6444.anInt3670
            aViewportTransform_6449.anInt3678 = this.aViewportTransform_6444.anInt3678
            aViewportTransform_6449.anInt3666 = this.aViewportTransform_6444.anInt3666
            aViewportTransform_6449.anInt3672 = this.aViewportTransform_6444.anInt3672
            aViewportTransform_6449.anInt3679 = this.aViewportTransform_6444.anInt3679
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("rba.<init>(" + (if (var_renderer != null) "{...}" else "null") + ',' + (if (modelFacePriorityNode != null) "{...}" else "null") + ',' + (if (class318_sub10 != null) "{...}" else "null") + ',' + l + ')'))
        }
    }
}
