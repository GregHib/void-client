import BoundsConstraintEntryStatics.method2057
import jaclib.memory.Stream
import jaclib.memory.heap.NativeHeapBuffer
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glPopMatrix
import jaggl.OpenGLStatics.glPushMatrix
import jaggl.OpenGLStatics.glScalef
import TextureTileRendererStatics.anInt6827
import TextureTileRendererStatics.anInt6828
import TextureTileRendererStatics.anInt6829
import TextureTileRendererStatics.anInt6834
import TextureTileRendererStatics.anInt6838
import TextureTileRendererStatics.anInt6845

class TextureTileRenderer internal constructor(private val aS_Sub2_6839: OpenGlTerrainTile, var anInt6841: Int, i_38_: Int, var anInt6825: Int, var anInt6833: Int, var anInt6826: Int) : LinkedListNode() {
    private var aHa_Sub2_6831: OpenGlRenderer?
    var aFloat6832: Float
    private var aNativeHeapBuffer6840: NativeHeapBuffer? = null
    private val anIntArray6842: IntArray
    private val aClass119_Sub2_6843: NativeVertexBuffer
    private var aHoverActionEntry_6844: HoverActionEntry? = null
    private var aStream6846: Stream? = null

    fun method2945(i: Int, i_0_: Byte, i_1_: Int, i_2_: Int) {
        anInt6845++
        if (i_0_.toInt() != 18) this.anInt6825 = 85
        anIntArray6842[i_1_ * aS_Sub2_6839.anInt4587 + i] = method2057((anIntArray6842[i_1_ * aS_Sub2_6839.anInt4587 + i]), 1 shl i_2_)
    }

    fun method2946(i: Int, i_3_: Int) {
        aNativeHeapBuffer6840 = aHa_Sub2_6831!!.aNativeHeap7730!!.a(4 * i_3_, true)
        anInt6834++
        if (i != 2147483647) aHa_Sub2_6831 = null
        aStream6846 = Stream(aNativeHeapBuffer6840!!)
    }

    fun method2948(i: Int, i_8_: Int, `is`: IntArray) {
        anInt6829++
        var i_9_ = 0
        val class348_sub49_sub1 = aHa_Sub2_6831!!.aClass348_Sub49_Sub1_7798
        class348_sub49_sub1!!.anInt7197 = 0
        if (aHa_Sub2_6831!!.aBoolean7775) {
            var i_10_ = 0
            while (i_8_ > i_10_) {
                val i_11_ = `is`[i_10_]
                val is_12_ = aS_Sub2_6839.aShortArrayArray8267[i_11_]
                val i_13_ = anIntArray6842[i_11_]
                if (i_13_ != 0 && is_12_ != null) {
                    var i_14_ = 0
                    var i_15_ = 0
                    while (is_12_.size > i_15_) {
                        if ((i_13_ and (1 shl i_14_++)) == 0) i_15_ += 3
                        else {
                            class348_sub49_sub1.writeShort(107.toByte(), (is_12_[i_15_++].toInt() and 0xffff))
                            i_9_++
                            class348_sub49_sub1.writeShort(107.toByte(), (is_12_[i_15_++].toInt() and 0xffff))
                            i_9_++
                            i_9_++
                            class348_sub49_sub1.writeShort(107.toByte(), (0xffff and (is_12_[i_15_++]).toInt()))
                        }
                    }
                }
                i_10_++
            }
        } else {
            var i_16_ = 0
            while (i_8_ > i_16_) {
                val i_17_ = `is`[i_16_]
                val i_18_ = anIntArray6842[i_17_]
                val is_19_ = aS_Sub2_6839.aShortArrayArray8267[i_17_]
                if (i_18_ != 0 && is_19_ != null) {
                    var i_20_ = 0
                    var i_21_ = 0
                    while (i_21_ < is_19_.size) {
                        if ((i_18_ and (1 shl i_20_++)) == 0) i_21_ += 3
                        else {
                            i_9_++
                            class348_sub49_sub1.method3397(97, 0xffff and is_19_[i_21_++].toInt())
                            class348_sub49_sub1.method3397(125, 0xffff and is_19_[i_21_++].toInt())
                            i_9_++
                            i_9_++
                            class348_sub49_sub1.method3397(i xor 0x142f, (is_19_[i_21_++].toInt() and 0xffff))
                        }
                    }
                }
                i_16_++
            }
        }
        if (i_9_ > 0) {
            aClass119_Sub2_6843.method35(class348_sub49_sub1.aByteArray7154, 5123, 64, class348_sub49_sub1.anInt7197)
            aHa_Sub2_6831!!.method3794(aS_Sub2_6839.aHoverActionEntry_8276, aHoverActionEntry_6844, -26411, aS_Sub2_6839.aHoverActionEntry_8277, aS_Sub2_6839.aHoverActionEntry_8275)
            aHa_Sub2_6831!!.method3746(((0x7 and aS_Sub2_6839.anInt8235) != 0), this.anInt6841, ((aS_Sub2_6839.anInt8235 and 0x8) != 0), 112)
            if (aHa_Sub2_6831!!.aBoolean7846) aHa_Sub2_6831!!.EA(2147483647, this.anInt6825, this.anInt6833, this.anInt6826)
            glMatrixMode(5890)
            glPushMatrix()
            glScalef(1.0f / this.aFloat6832, 1.0f / this.aFloat6832, 1.0f)
            glMatrixMode(5888)
            aHa_Sub2_6831!!.method3794(aS_Sub2_6839.aHoverActionEntry_8276, aHoverActionEntry_6844, -26411, aS_Sub2_6839.aHoverActionEntry_8277, aS_Sub2_6839.aHoverActionEntry_8275)
            aHa_Sub2_6831!!.method3759(i_9_, -128, 4, aClass119_Sub2_6843, 0)
            glMatrixMode(5890)
            glPopMatrix()
            glMatrixMode(5888)
        }
        if (i != 5123) this.anInt6826 = 66
    }

    fun method2949(i: Byte, i_22_: Int, i_23_: Int, i_24_: Int, f: Float) {
        var i_24_ = i_24_
        if (i.toInt() == 97) {
            if (this.anInt6841 != -1) {
                val class12 = aHa_Sub2_6831!!.aRenderConfig4579!!.method3(this.anInt6841, -6662)
                val i_25_ = 0xff and class12!!.aByte201.toInt()
                if (i_25_ != 0 && class12.aByte213.toInt() != 4) {
                    val i_26_: Int
                    if (i_23_ >= 0) {
                        if (i_23_ > 127) i_26_ = 16777215
                        else i_26_ = 131586 * i_23_
                    } else i_26_ = 0
                    if (i_25_ != 256) {
                        val i_27_ = i_25_
                        val i_28_ = -i_25_ + 256
                        i_24_ = ((((i_28_ * (i_24_ and 0xff00ff) + (i_26_ and 0xff00ff) * i_27_) and 0xff00ff.inv()) - -(0xff0000 and (i_28_ * (0xff00 and i_24_) + i_27_ * (0xff00 and i_26_)))) shr 8)
                    } else i_24_ = i_26_
                }
                var i_29_ = 0xff and class12.aByte216.toInt()
                if (i_29_ != 0) {
                    i_29_ += 256
                    var i_30_ = i_29_ * ((0xff0000 and i_24_) shr 16)
                    if (i_30_ > 65535) i_30_ = 65535
                    var i_31_ = ((i_24_ and 0xff00) shr 8) * i_29_
                    if (i_31_ > 65535) i_31_ = 65535
                    var i_32_ = (0xff and i_24_) * i_29_
                    if (i_32_ > 65535) i_32_ = 65535
                    i_24_ = (0xff00 and i_31_) + (((0x5ff00ff.inv() and i_30_) shl 8) - -(i_32_ shr 8))
                }
            }
            anInt6838++
            aStream6846!!.e(i_22_ * 4)
            if (f != 1.0f) {
                var i_33_ = (i_24_ and 0xff1a66) shr 16
                var i_34_ = (0xff1d and i_24_) shr 8
                var i_35_ = i_24_ and 0xff
                i_33_ = (i_33_ * f).toInt()
                if (i_33_ < 0) i_33_ = 0
                else if (i_33_ > 255) i_33_ = 255
                i_34_ = (i_34_ * f).toInt()
                i_35_ = (i_35_ * f).toInt()
                if (i_34_ < 0) i_34_ = 0
                else if (i_34_ > 255) i_34_ = 255
                if (i_35_ < 0) i_35_ = 0
                else if (i_35_ > 255) i_35_ = 255
                i_24_ = i_34_ shl 8 or (i_33_ shl 16) or i_35_
            }
            aStream6846!!.f((i_24_ shr 16).toByte().toInt())
            aStream6846!!.f((i_24_ shr 8).toByte().toInt())
            aStream6846!!.f(i_24_.toByte().toInt())
        }
    }

    fun method2951(i: Int, i_36_: Int) {
        aStream6846!!.e(i_36_ * 4 + i)
        anInt6827++
        aStream6846!!.f(-1)
    }

    fun method2952(i: Int, i_37_: Int) {
        if (i == 17795) {
            aStream6846!!.a()
            anInt6828++
            val interface2 = aHa_Sub2_6831!!.method3739(8448, aNativeHeapBuffer6840, false, 4, i_37_ * 4)
            aHoverActionEntry_6844 = HoverActionEntry(interface2, 5121, 4, 0)
            aStream6846 = null
            aNativeHeapBuffer6840 = null
        }
    }

    init {
        anIntArray6842 = IntArray((aS_Sub2_6839.anInt4587 * aS_Sub2_6839.anInt4590))
        this.aFloat6832 = i_38_.toFloat()
        aHa_Sub2_6831 = aS_Sub2_6839.aHa_Sub2_8272
        aClass119_Sub2_6843 = NativeVertexBuffer(aHa_Sub2_6831, 5123, null, 1)
    }
}
