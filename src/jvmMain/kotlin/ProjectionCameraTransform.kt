import WorldMapAreaLabelStatics.method3570
import ProjectionCameraTransformStatics.anInt5746
import ProjectionCameraTransformStatics.anInt5748
import ProjectionCameraTransformStatics.anInt5749
import ProjectionCameraTransformStatics.anInt5753
import ProjectionCameraTransformStatics.anInt5757
import ProjectionCameraTransformStatics.anInt5758
import ProjectionCameraTransformStatics.anInt5759
import ProjectionCameraTransformStatics.anInt5760
import ProjectionCameraTransformStatics.anInt5763
import ProjectionCameraTransformStatics.anInt5765
import ProjectionCameraTransformStatics.anInt5766
import ProjectionCameraTransformStatics.anInt5767
import ProjectionCameraTransformStatics.anInt5771
import ProjectionCameraTransformStatics.anInt5773
import ProjectionCameraTransformStatics.anInt5774
import ProjectionCameraTransformStatics.anInt5775
import ProjectionCameraTransformStatics.anInt5777
import ProjectionCameraTransformStatics.anInt5778
import ProjectionCameraTransformStatics.anInt5779
import ProjectionCameraTransformStatics.anInt5780
import ProjectionCameraTransformStatics.anInt5782
import ProjectionCameraTransformStatics.anInt5785

/* Class101_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ProjectionCameraTransform : AbstractCameraTransform() {
    var aFloat5747: Float = 0f
    var aFloat5750: Float = 0f
    @JvmField
    var aFloat5751: Float = 0f
    @JvmField
    var aFloat5754: Float = 0f
    @JvmField
    var aFloat5756: Float = 0f
    var aFloat5761: Float = 0f
    var aFloat5762: Float = 0f
    var aFloat5769: Float = 0f
    var aFloat5770: Float = 0f
    var aFloat5772: Float = 0f
    var aFloat5781: Float = 0f
    @JvmField
    var aFloat5784: Float = 0f
    override fun method902(i: Int) {
        anInt5779++
        this.aFloat5784 = 1.0f
        this.aFloat5769 = OggBitstreamDecoderStatics.aFloatArray6867!![0x3fff and i]
        this.aFloat5770 = this.aFloat5769
        this.aFloat5761 = OggBitstreamDecoderStatics.aFloatArray6865!![0x3fff and i]
        this.aFloat5751 = 0.0f
        this.aFloat5754 = this.aFloat5751
        this.aFloat5756 = this.aFloat5754
        this.aFloat5772 = this.aFloat5756
        this.aFloat5762 = this.aFloat5772
        this.aFloat5747 = this.aFloat5762
        this.aFloat5781 = this.aFloat5747
        this.aFloat5750 = -this.aFloat5761
    }

    fun method937(bool: Boolean, f: Float, f_0_: Float, f_1_: Float, f_2_: Float, fs: FloatArray) {
        anInt5765++
        val f_3_: Float
        val f_4_: Float
        val f_5_: Float
        if (f > 0.00390625f || f < -0.00390625f) {
            val f_6_ = -f_2_ / f
            f_4_ = (f_6_ * this.aFloat5770 + this.aFloat5747)
            f_5_ = (this.aFloat5751 + this.aFloat5756 * f_6_)
            f_3_ = (this.aFloat5772 + f_6_ * this.aFloat5761)
        } else if (f_1_ <= 0.00390625f && f_1_ >= -0.00390625f) {
            val f_8_ = -f_2_ / f_0_
            f_4_ = (f_8_ * this.aFloat5781 + this.aFloat5747)
            f_3_ = (this.aFloat5762 * f_8_ + this.aFloat5772)
            f_5_ = (this.aFloat5751 + f_8_ * this.aFloat5784)
        } else {
            val f_7_ = -f_2_ / f_1_
            f_3_ = (this.aFloat5769 * f_7_ + this.aFloat5772)
            f_4_ = (this.aFloat5750 * f_7_ + this.aFloat5747)
            f_5_ = (this.aFloat5754 * f_7_ + this.aFloat5751)
        }
        fs[0] = (f_0_ * this.aFloat5781 + (f * this.aFloat5770 + f_1_ * this.aFloat5750))
        fs[2] = (f_0_ * this.aFloat5784 + (this.aFloat5756 * f + this.aFloat5754 * f_1_))
        if (bool != true) this.aFloat5772 = -0.4364811f
        fs[1] = (this.aFloat5769 * f_1_ + this.aFloat5761 * f + this.aFloat5762 * f_0_)
        fs[3] = -(fs[0] * f_4_ + f_3_ * fs[1] + f_5_ * fs[2])
    }

    override fun method891(i: Int, i_9_: Int, i_10_: Int) {
        this.aFloat5751 += i_10_.toFloat()
        this.aFloat5772 += i_9_.toFloat()
        this.aFloat5747 += i.toFloat()
        anInt5785++
    }

    override fun method900(i: Int) {
        anInt5763++
        val f = OggBitstreamDecoderStatics.aFloatArray6867!![0x3fff and i]
        val f_11_ = OggBitstreamDecoderStatics.aFloatArray6865!![0x3fff and i]
        val f_12_ = this.aFloat5761
        val f_13_ = this.aFloat5769
        val f_14_ = this.aFloat5762
        this.aFloat5761 = f * f_12_ - this.aFloat5756 * f_11_
        val f_15_ = this.aFloat5772
        this.aFloat5756 = this.aFloat5756 * f + f_11_ * f_12_
        this.aFloat5769 = -(f_11_ * this.aFloat5754) + f_13_ * f
        this.aFloat5762 = f * f_14_ - this.aFloat5784 * f_11_
        this.aFloat5754 = f_13_ * f_11_ + f * this.aFloat5754
        this.aFloat5784 = f_14_ * f_11_ + f * this.aFloat5784
        this.aFloat5772 = -(f_11_ * this.aFloat5751) + f * f_15_
        this.aFloat5751 = f * this.aFloat5751 + f_15_ * f_11_
    }

    fun method939(f: Float, i: Int, f_16_: Float, i_17_: Int, i_18_: Int, i_19_: Int, f_20_: Float) {
        if (i_18_ == 0) {
            this.aFloat5762 = 0.0f
            this.aFloat5781 = this.aFloat5762
            this.aFloat5754 = this.aFloat5781
            this.aFloat5750 = this.aFloat5754
            this.aFloat5756 = this.aFloat5750
            this.aFloat5761 = this.aFloat5756
            this.aFloat5770 = i.toFloat()
            this.aFloat5784 = 1.0f
            this.aFloat5769 = i_17_.toFloat()
        } else {
            val f_21_ = OggBitstreamDecoderStatics.aFloatArray6867!![0x3fff and i_18_]
            val f_22_ = OggBitstreamDecoderStatics.aFloatArray6865!![i_18_ and 0x3fff]
            this.aFloat5761 = i.toFloat() * f_22_
            this.aFloat5769 = i_17_.toFloat() * f_21_
            this.aFloat5762 = 0.0f
            this.aFloat5781 = this.aFloat5762
            this.aFloat5754 = this.aFloat5781
            this.aFloat5756 = this.aFloat5754
            this.aFloat5784 = 1.0f
            this.aFloat5750 = -f_22_ * i_17_.toFloat()
            this.aFloat5770 = i.toFloat() * f_21_
        }
        anInt5746++
        this.aFloat5747 = f_16_
        this.aFloat5772 = f_20_
        this.aFloat5751 = f
        val i_23_ = -88 / ((i_19_ - 6) / 39)
    }

    override fun method897(i: Int, i_24_: Int, i_25_: Int, `is`: IntArray) {
        anInt5767++
        `is`[0] = (i_25_.toFloat() * this.aFloat5781 + (i.toFloat() * this.aFloat5770 + i_24_.toFloat() * this.aFloat5750) + this.aFloat5747).toInt()
        `is`[2] = (i_24_.toFloat() * this.aFloat5754 + this.aFloat5756 * i.toFloat() + this.aFloat5784 * i_25_.toFloat() + this.aFloat5751).toInt()
        `is`[1] = (this.aFloat5772 + (i_25_.toFloat() * this.aFloat5762 + (i.toFloat() * this.aFloat5761 + (i_24_.toFloat() * this.aFloat5769)))).toInt()
    }

    override fun method894(i: Int, i_26_: Int, i_27_: Int) {
        this.aFloat5751 = i_27_.toFloat()
        this.aFloat5747 = i.toFloat()
        this.aFloat5762 = 0.0f
        this.aFloat5781 = this.aFloat5762
        this.aFloat5754 = this.aFloat5781
        this.aFloat5750 = this.aFloat5754
        this.aFloat5756 = this.aFloat5750
        this.aFloat5761 = this.aFloat5756
        this.aFloat5772 = i_26_.toFloat()
        this.aFloat5784 = 1.0f
        this.aFloat5769 = this.aFloat5784
        this.aFloat5770 = this.aFloat5769
        anInt5749++
    }

    override fun method890(`is`: IntArray) {
        anInt5775++
        val f = `is`[0].toFloat() - this.aFloat5747
        val f_28_ = -this.aFloat5772 + `is`[1].toFloat()
        val f_29_ = -this.aFloat5751 + `is`[2].toFloat()
        `is`[1] = (this.aFloat5769 * f_28_ + f * this.aFloat5750 + this.aFloat5754 * f_29_).toInt()
        `is`[2] = (this.aFloat5784 * f_29_ + (f_28_ * this.aFloat5762 + this.aFloat5781 * f)).toInt()
        `is`[0] = (this.aFloat5770 * f + this.aFloat5761 * f_28_ + f_29_ * this.aFloat5756).toInt()
    }

    override fun method903(i: Int, i_30_: Int, i_31_: Int, i_32_: Int, i_33_: Int, i_34_: Int) {
        anInt5782++
        val f = OggBitstreamDecoderStatics.aFloatArray6867!![i_32_ and 0x3fff]
        val f_35_ = OggBitstreamDecoderStatics.aFloatArray6865!![i_32_ and 0x3fff]
        val f_36_ = OggBitstreamDecoderStatics.aFloatArray6867!![0x3fff and i_33_]
        val f_37_ = OggBitstreamDecoderStatics.aFloatArray6865!![0x3fff and i_33_]
        val f_38_ = OggBitstreamDecoderStatics.aFloatArray6867!![0x3fff and i_34_]
        val f_39_ = OggBitstreamDecoderStatics.aFloatArray6865!![0x3fff and i_34_]
        val f_40_ = f_35_ * f_38_
        val f_41_ = f_39_ * f_35_
        this.aFloat5762 = f_40_ * f_36_ + f_37_ * f_39_
        this.aFloat5756 = f * f_37_
        this.aFloat5770 = f_37_ * f_41_ + f_36_ * f_38_
        this.aFloat5769 = f_38_ * f
        this.aFloat5754 = -f_35_
        this.aFloat5750 = f_39_ * f
        this.aFloat5784 = f * f_36_
        this.aFloat5781 = f_38_ * -f_37_ + f_36_ * f_41_
        this.aFloat5761 = f_40_ * f_37_ + -f_36_ * f_39_
        this.aFloat5751 = (this.aFloat5756 * -i.toFloat() - this.aFloat5754 * i_30_.toFloat() - i_31_.toFloat() * this.aFloat5784)
        this.aFloat5747 = (-(this.aFloat5750 * i_30_.toFloat()) + this.aFloat5770 * -i.toFloat() - this.aFloat5781 * i_31_.toFloat())
        this.aFloat5772 = (-(i_31_.toFloat() * this.aFloat5762) + (this.aFloat5761 * -i.toFloat() - this.aFloat5769 * i_30_.toFloat()))
    }

    override fun method908(i: Int) {
        anInt5774++
        val f = OggBitstreamDecoderStatics.aFloatArray6867!![i and 0x3fff]
        val f_42_ = OggBitstreamDecoderStatics.aFloatArray6865!![i and 0x3fff]
        val f_43_ = this.aFloat5770
        val f_44_ = this.aFloat5750
        val f_45_ = this.aFloat5781
        this.aFloat5770 = f * f_43_ - this.aFloat5761 * f_42_
        val f_46_ = this.aFloat5747
        this.aFloat5761 = this.aFloat5761 * f + f_43_ * f_42_
        this.aFloat5750 = -(this.aFloat5769 * f_42_) + f_44_ * f
        this.aFloat5781 = -(f_42_ * this.aFloat5762) + f_45_ * f
        this.aFloat5769 = f * this.aFloat5769 + f_42_ * f_44_
        this.aFloat5762 = this.aFloat5762 * f + f_45_ * f_42_
        this.aFloat5747 = -(f_42_ * this.aFloat5772) + f * f_46_
        this.aFloat5772 = this.aFloat5772 * f + f_42_ * f_46_
    }

    fun method940(i: Int): FloatArray {
        ParticleEmitterDefExtStatics.aFloatArray8575!![0] = this.aFloat5770
        ParticleEmitterDefExtStatics.aFloatArray8575!![9] = this.aFloat5762
        ParticleEmitterDefExtStatics.aFloatArray8575!![12] = this.aFloat5747
        anInt5777++
        ParticleEmitterDefExtStatics.aFloatArray8575!![i] = this.aFloat5761
        ParticleEmitterDefExtStatics.aFloatArray8575!![6] = this.aFloat5754
        ParticleEmitterDefExtStatics.aFloatArray8575!![4] = this.aFloat5750
        ParticleEmitterDefExtStatics.aFloatArray8575!![10] = this.aFloat5784
        ParticleEmitterDefExtStatics.aFloatArray8575!![8] = this.aFloat5781
        ParticleEmitterDefExtStatics.aFloatArray8575!![14] = this.aFloat5751
        ParticleEmitterDefExtStatics.aFloatArray8575!![13] = this.aFloat5772
        ParticleEmitterDefExtStatics.aFloatArray8575!![2] = this.aFloat5756
        ParticleEmitterDefExtStatics.aFloatArray8575!![5] = this.aFloat5769
        return ParticleEmitterDefExtStatics.aFloatArray8575!!
    }

    override fun method907(): AbstractCameraTransform {
        anInt5748++
        val class101_sub3_47_ = ProjectionCameraTransform()
        class101_sub3_47_.aFloat5747 = this.aFloat5747
        class101_sub3_47_.aFloat5750 = this.aFloat5750
        class101_sub3_47_.aFloat5769 = this.aFloat5769
        class101_sub3_47_.aFloat5784 = this.aFloat5784
        class101_sub3_47_.aFloat5772 = this.aFloat5772
        class101_sub3_47_.aFloat5762 = this.aFloat5762
        class101_sub3_47_.aFloat5781 = this.aFloat5781
        class101_sub3_47_.aFloat5770 = this.aFloat5770
        class101_sub3_47_.aFloat5756 = this.aFloat5756
        class101_sub3_47_.aFloat5761 = this.aFloat5761
        class101_sub3_47_.aFloat5751 = this.aFloat5751
        class101_sub3_47_.aFloat5754 = this.aFloat5754
        return class101_sub3_47_
    }

    fun method942(i: Int) {
        this.aFloat5754 = -this.aFloat5754
        anInt5760++
        this.aFloat5761 = -this.aFloat5761
        if (i == 3128) {
            this.aFloat5769 = -this.aFloat5769
            this.aFloat5756 = -this.aFloat5756
            this.aFloat5784 = -this.aFloat5784
            this.aFloat5762 = -this.aFloat5762
            this.aFloat5772 = -this.aFloat5772
            this.aFloat5751 = -this.aFloat5751
        }
    }

    override fun method892(i: Int, i_49_: Int, i_50_: Int, `is`: IntArray) {
        var i = i
        var i_49_ = i_49_
        var i_50_ = i_50_
        i_49_ = (i_49_ - this.aFloat5772).toInt()
        anInt5773++
        i_50_ = (i_50_ - this.aFloat5751).toInt()
        i = (i - this.aFloat5747).toInt()
        `is`[0] = (this.aFloat5756 * i_50_.toFloat() + (i.toFloat() * this.aFloat5770 + i_49_.toFloat() * this.aFloat5761)).toInt()
        `is`[2] = (this.aFloat5781 * i.toFloat() + i_49_.toFloat() * this.aFloat5762 + this.aFloat5784 * i_50_.toFloat()).toInt()
        `is`[1] = (i_50_.toFloat() * this.aFloat5754 + (this.aFloat5750 * i.toFloat() + i_49_.toFloat() * this.aFloat5769)).toInt()
    }

    override fun method898(abstractCameraTransform: AbstractCameraTransform?) {
        anInt5758++
        val class101_sub3_51_ = abstractCameraTransform as ProjectionCameraTransform?
        this.aFloat5751 = class101_sub3_51_!!.aFloat5751
        this.aFloat5769 = class101_sub3_51_.aFloat5769
        this.aFloat5770 = class101_sub3_51_.aFloat5770
        this.aFloat5781 = class101_sub3_51_.aFloat5781
        this.aFloat5747 = class101_sub3_51_.aFloat5747
        this.aFloat5754 = class101_sub3_51_.aFloat5754
        this.aFloat5761 = class101_sub3_51_.aFloat5761
        this.aFloat5772 = class101_sub3_51_.aFloat5772
        this.aFloat5784 = class101_sub3_51_.aFloat5784
        this.aFloat5762 = class101_sub3_51_.aFloat5762
        this.aFloat5756 = class101_sub3_51_.aFloat5756
        this.aFloat5750 = class101_sub3_51_.aFloat5750
    }

    override fun method895(i: Int) {
        anInt5780++
        this.aFloat5769 = 1.0f
        this.aFloat5784 = OggBitstreamDecoderStatics.aFloatArray6867!![0x3fff and i]
        this.aFloat5770 = this.aFloat5784
        this.aFloat5781 = OggBitstreamDecoderStatics.aFloatArray6865!![0x3fff and i]
        this.aFloat5756 = -this.aFloat5781
        this.aFloat5751 = 0.0f
        this.aFloat5754 = this.aFloat5751
        this.aFloat5772 = this.aFloat5754
        this.aFloat5762 = this.aFloat5772
        this.aFloat5761 = this.aFloat5762
        this.aFloat5747 = this.aFloat5761
        this.aFloat5750 = this.aFloat5747
    }

    override fun method899(i: Int) {
        anInt5757++
        this.aFloat5770 = 1.0f
        this.aFloat5784 = OggBitstreamDecoderStatics.aFloatArray6867!![0x3fff and i]
        this.aFloat5769 = this.aFloat5784
        this.aFloat5754 = OggBitstreamDecoderStatics.aFloatArray6865!![0x3fff and i]
        this.aFloat5762 = -this.aFloat5754
        this.aFloat5751 = 0.0f
        this.aFloat5756 = this.aFloat5751
        this.aFloat5772 = this.aFloat5756
        this.aFloat5761 = this.aFloat5772
        this.aFloat5747 = this.aFloat5761
        this.aFloat5781 = this.aFloat5747
        this.aFloat5750 = this.aFloat5781
    }

    override fun method910() {
        anInt5759++
        this.aFloat5784 = 1.0f
        this.aFloat5769 = this.aFloat5784
        this.aFloat5770 = this.aFloat5769
        this.aFloat5751 = 0.0f
        this.aFloat5772 = this.aFloat5751
        this.aFloat5747 = this.aFloat5772
        this.aFloat5762 = this.aFloat5747
        this.aFloat5781 = this.aFloat5762
        this.aFloat5754 = this.aFloat5781
        this.aFloat5750 = this.aFloat5754
        this.aFloat5756 = this.aFloat5750
        this.aFloat5761 = this.aFloat5756
    }

    override fun method896(i: Int) {
        anInt5766++
        val f = OggBitstreamDecoderStatics.aFloatArray6867!![i and 0x3fff]
        val f_62_ = OggBitstreamDecoderStatics.aFloatArray6865!![i and 0x3fff]
        val f_63_ = this.aFloat5770
        val f_64_ = this.aFloat5750
        val f_65_ = this.aFloat5781
        this.aFloat5770 = f_63_ * f + this.aFloat5756 * f_62_
        val f_66_ = this.aFloat5747
        this.aFloat5756 = f * this.aFloat5756 - f_62_ * f_63_
        this.aFloat5750 = f * f_64_ + f_62_ * this.aFloat5754
        this.aFloat5754 = -(f_64_ * f_62_) + this.aFloat5754 * f
        this.aFloat5781 = f * f_65_ + this.aFloat5784 * f_62_
        this.aFloat5784 = -(f_65_ * f_62_) + f * this.aFloat5784
        this.aFloat5747 = this.aFloat5751 * f_62_ + f * f_66_
        this.aFloat5751 = this.aFloat5751 * f - f_62_ * f_66_
    }

    fun method945(bool: Boolean): FloatArray {
        if (bool != true) this.aFloat5756 = 0.66213727f
        ParticleEmitterDefExtStatics.aFloatArray8575!![14] = 0.0f
        ParticleEmitterDefExtStatics.aFloatArray8575!![0] = this.aFloat5770
        ParticleEmitterDefExtStatics.aFloatArray8575!![13] = 0.0f
        ParticleEmitterDefExtStatics.aFloatArray8575!![1] = this.aFloat5761
        ParticleEmitterDefExtStatics.aFloatArray8575!![12] = 0.0f
        ParticleEmitterDefExtStatics.aFloatArray8575!![10] = this.aFloat5784
        ParticleEmitterDefExtStatics.aFloatArray8575!![5] = this.aFloat5769
        ParticleEmitterDefExtStatics.aFloatArray8575!![6] = this.aFloat5754
        ParticleEmitterDefExtStatics.aFloatArray8575!![9] = this.aFloat5762
        anInt5778++
        ParticleEmitterDefExtStatics.aFloatArray8575!![2] = this.aFloat5756
        ParticleEmitterDefExtStatics.aFloatArray8575!![4] = this.aFloat5750
        ParticleEmitterDefExtStatics.aFloatArray8575!![8] = this.aFloat5781
        return ParticleEmitterDefExtStatics.aFloatArray8575!!
    }

    fun method946(abstractCameraTransform: AbstractCameraTransform, i: Int) {
        anInt5771++
        val class101_sub3_67_ = abstractCameraTransform as ProjectionCameraTransform
        this.aFloat5781 = class101_sub3_67_.aFloat5756
        if (i != -7929) method899(52)
        this.aFloat5750 = class101_sub3_67_.aFloat5761
        this.aFloat5770 = class101_sub3_67_.aFloat5770
        this.aFloat5756 = class101_sub3_67_.aFloat5781
        this.aFloat5762 = class101_sub3_67_.aFloat5754
        this.aFloat5761 = class101_sub3_67_.aFloat5750
        this.aFloat5769 = class101_sub3_67_.aFloat5769
        this.aFloat5747 = -((class101_sub3_67_.aFloat5772 * this.aFloat5750) + (class101_sub3_67_.aFloat5747 * this.aFloat5770) + (class101_sub3_67_.aFloat5751 * this.aFloat5781))
        this.aFloat5754 = class101_sub3_67_.aFloat5762
        this.aFloat5784 = class101_sub3_67_.aFloat5784
        this.aFloat5772 = -((class101_sub3_67_.aFloat5772 * this.aFloat5769) + (class101_sub3_67_.aFloat5747 * this.aFloat5761) + (class101_sub3_67_.aFloat5751 * this.aFloat5762))
        this.aFloat5751 = -((this.aFloat5756 * class101_sub3_67_.aFloat5747) + (this.aFloat5754 * class101_sub3_67_.aFloat5772) + (class101_sub3_67_.aFloat5751 * this.aFloat5784))
    }

    init {
        method910()
    }

    override fun method905(i: Int, i_68_: Int, i_69_: Int, `is`: IntArray) {
        anInt5753++
        `is`[1] = (i_69_.toFloat() * this.aFloat5762 + (i_68_.toFloat() * this.aFloat5769 + this.aFloat5761 * i.toFloat())).toInt()
        `is`[2] = (this.aFloat5754 * i_68_.toFloat() + this.aFloat5756 * i.toFloat() + i_69_.toFloat() * this.aFloat5784).toInt()
        `is`[0] = (this.aFloat5750 * i_68_.toFloat() + this.aFloat5770 * i.toFloat() + this.aFloat5781 * i_69_.toFloat()).toInt()
    }
}
