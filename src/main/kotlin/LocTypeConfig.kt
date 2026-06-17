import NormalMapTextureNode.Companion.method3140

/* Class277 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LocTypeConfig {
    var anInt3558: Int = 64
    var anInt3559: Int = 1190717
    var aBoolean3560: Boolean = false
    var aBoolean3561: Boolean = true
    var aLocDefinitionCache_3562: LocDefinitionCache? = null
    @JvmField
    var anInt3563: Int = 0
    var anInt3564: Int = 8
    var aBoolean3566: Boolean = true
    @JvmField
    var anInt3569: Int
    var anInt3570: Int = 512
    var anInt3573: Int = 0
    var anInt3574: Int = 127
    @JvmField
    var anInt3575: Int

    fun method2067(i: Int) {
        this.anInt3564 = (this.anInt3564 shl 8 or this.anInt3573)
        if (i != -4860) method2067(-102)
        anInt3571++
    }

    private fun method2069(i: Int, class348_sub49: Buffer, i_1_: Int) {
        anInt3567++
        if (i == -1) {
            if (i_1_ != 1) {
                if (i_1_ == 2) this.anInt3575 = class348_sub49.readUnsignedByte(255)
                else if (i_1_ == 3) {
                    this.anInt3575 = class348_sub49.readUnsignedShort(842397944)
                    if (this.anInt3575 == 65535) this.anInt3575 = -1
                } else if (i_1_ != 5) {
                    if (i_1_ != 7) {
                        if (i_1_ == 8) this.aLocDefinitionCache_3562!!.anInt3447 = this.anInt3573
                        else if (i_1_ == 9) this.anInt3570 = (class348_sub49.readUnsignedShort(842397944) shl 2)
                        else if (i_1_ == 10) this.aBoolean3566 = false
                        else if (i_1_ == 11) this.anInt3564 = class348_sub49.readUnsignedByte(255)
                        else if (i_1_ != 12) {
                            if (i_1_ != 13) {
                                if (i_1_ != 14) {
                                    if (i_1_ == 16) this.anInt3574 = class348_sub49.readUnsignedByte(255)
                                } else this.anInt3558 = (class348_sub49.readUnsignedByte(255) shl 2)
                            } else this.anInt3559 = class348_sub49.readMedium(-1)
                        } else this.aBoolean3560 = true
                    } else this.anInt3569 = (method3140(-67, class348_sub49.readMedium(-1)))
                } else this.aBoolean3561 = false
            } else this.anInt3563 = method3140(-57, class348_sub49.readMedium(-1))
        }
    }

    fun method2070(bool: Boolean, class348_sub49: Buffer) {
        if (bool != true) this.aBoolean3561 = false
        while (true) {
            val i = class348_sub49.readUnsignedByte(255)
            if (i == 0) break
            method2069(-1, class348_sub49, i)
        }
        anInt3565++
    }

    init {
        this.anInt3569 = -1
        this.anInt3575 = -1
    }

    companion object {
        var anInt3565: Int = 0
        var anInt3567: Int = 0
        @JvmField
        var aIndexedFileCache_3568: IndexedFileCache? = null
        var anInt3571: Int = 0
        var aCameraRotationStub_3572: CameraRotationStub? = CameraRotationStub()
        fun method2068(l: Long, l_0_: Long): Long {
            try {
                return l or l_0_
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatch.method2929(runtimeexception, "vd.D(" + l + ',' + l_0_ + ')')
            }
        }

        @JvmStatic
        fun method2071(i: Int) {
            aCameraRotationStub_3572 = null
            aIndexedFileCache_3568 = null
            if (i > -126) aCameraRotationStub_3572 = null
        }
    }
}
