import WaterMaterialPassStatics.method2148
import StreamingResourceRequestStatics.method3262
import LocConfigModelBuilderStatics.method3563
import PlayerAppearanceUpdateDecoder.method3614
import CharacterRenderStateStatics.anInt6671

/* Class348_Sub9 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CharacterRenderState : LinkedListNode() {
    @JvmField
    var anInt6668: Int = 0
    @JvmField
    var anInt6670: Int = 0
    @JvmField
    var aClass348_Sub16_Sub5_6673: SampledVoice? = null
    @JvmField
    var aBoolean6674: Boolean = false
    @JvmField
    var anInt6675: Int = 0
    @JvmField
    var aClass348_Sub16_Sub5_6676: SampledVoice? = null
    @JvmField
    var anInt6677: Int = 0
    @JvmField
    var anInt6678: Int = 0
    @JvmField
    var aPlayer_6679: Player? = null
    @JvmField
    var anInt6680: Int = 0
    @JvmField
    var anInt6681: Int = 0
    var aClass348_Sub10_6683: VorbisAudioDecoder? = null
    @JvmField
    var aBoolean6684: Boolean = false
    @JvmField
    var anInt6685: Int = 0
    @JvmField
    var aClass348_Sub19_Sub1_6686: PcmSampleData? = null
    @JvmField
    var anInt6687: Int = 0
    @JvmField
    var aClass348_Sub10_6688: VorbisAudioDecoder? = null
    @JvmField
    var anInt6689: Int = 0
    @JvmField
    var aNpc_6691: Npc? = null
    var aClass348_Sub19_Sub1_6692: PcmSampleData? = null
    @JvmField
    var anInt6693: Int = 0
    @JvmField
    var anInt6694: Int = 0
    @JvmField
    var aNpcConfig_6695: NpcConfig? = null
    @JvmField
    var anInt6696: Int = 0
    @JvmField
    var anIntArray6697: IntArray? = null
    @JvmField
    var anInt6698: Int = 0
    @JvmField
    var aBoolean6699: Boolean = false

    fun method2781(i: Byte) {
        anInt6671++
        val i_11_ = this.anInt6685
        if (i.toInt() == 21) {
            val bool = this.aBoolean6674
            if (this.aNpcConfig_6695 == null) {
                if (this.aNpc_6691 == null) {
                    if ((this.aPlayer_6679) != null) {
                        this.anInt6685 = (CacheIndexManagerStatics.method2357(-1, (this.aPlayer_6679!!)))
                        this.anInt6694 = (this.aPlayer_6679!!.anInt10553) shl 9
                        this.anInt6677 = (this.aPlayer_6679!!.anInt10558)
                        this.anInt6681 = 256
                        this.anInt6696 = 256
                        this.aBoolean6674 = (this.aPlayer_6679!!.aBoolean10517)
                    }
                } else {
                    val i_12_ = (NpcAnimationResolverStatics.method214((this.aNpc_6691!!), -1))
                    if (i_12_ != i_11_) {
                        this.anInt6685 = i_12_
                        var class79 = (this.aNpc_6691!!.aNpcType_10505)
                        if (class79!!.anIntArray1377 != null) class79 = class79.method794((ProjectedGroundDecorStatics.aVarpStore_10209!!), -1)
                        if (class79 == null) {
                            this.anInt6694 = 0
                            this.anInt6677 = this.anInt6694
                            this.anInt6681 = 256
                            this.anInt6696 = 256
                            this.aBoolean6674 = this.aNpc_6691!!.aNpcType_10505!!.aBoolean1370
                        } else {
                            this.anInt6694 = class79.anInt1392 shl 9
                            this.anInt6681 = class79.anInt1363
                            this.anInt6677 = class79.anInt1356
                            this.aBoolean6674 = class79.aBoolean1370
                            this.anInt6696 = class79.anInt1340
                        }
                    }
                }
            } else {
                val class51 = (this.aNpcConfig_6695!!.method480(ProjectedGroundDecorStatics.aVarpStore_10209!!, 47.toByte()))
                if (class51 == null) {
                    this.anInt6681 = 256
                    this.aBoolean6674 = false
                    this.aBoolean6699 = false
                    this.anIntArray6697 = null
                    this.anInt6668 = 0
                    this.anInt6677 = 0
                    this.anInt6696 = 256
                    this.anInt6680 = 0
                    this.anInt6685 = -1
                    this.anInt6694 = 0
                } else {
                    this.anInt6681 = class51.anInt916
                    this.anInt6685 = class51.anInt887
                    this.anInt6696 = class51.anInt878
                    this.anInt6694 = class51.anInt889 shl 9
                    this.aBoolean6674 = class51.aBoolean888
                    this.anInt6680 = class51.anInt962
                    this.anInt6677 = class51.anInt936
                    this.anInt6668 = class51.anInt937
                    this.aBoolean6699 = class51.aBoolean903
                    this.anIntArray6697 = class51.anIntArray904
                }
            }
            if (((i_11_ != this.anInt6685) || bool == !this.aBoolean6674) && this.aClass348_Sub16_Sub5_6676 != null) {
                SpriteDefinitionStatics.aClass348_Sub16_Sub4_7065!!.method2880(this.aClass348_Sub16_Sub5_6676!!)
                this.aClass348_Sub19_Sub1_6686 = null
                this.aClass348_Sub16_Sub5_6676 = null
                this.aClass348_Sub10_6688 = null
            }
        }
    }
}
