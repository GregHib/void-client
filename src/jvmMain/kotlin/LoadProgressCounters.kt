import ProjectileConfigUtil.method313
import NodeDequeHolder.Companion.method878

/* Class182 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LoadProgressCounters {
    @JvmField
    var anInt2445: Int = 0
    @JvmField
    var anInt2448: Int = 0
    @JvmField
    var anInt2451: Int = 0
    @JvmField
    var anInt2454: Int = 0
    @JvmField
    var anInt2455: Int = 0
    @JvmField
    var anInt2456: Int = 0

    companion object {
        @JvmField
        var anInt2446: Int = 0
        var anCursorControllerArray2447: Array<CursorController?>? = null
        @JvmField
        var aKeyboardInputSource_2449: KeyboardInputSource? = null
        var anInt2450: Int = 0
        var anInt2452: Int = 0
        var anInt2453: Int = 0
        @JvmStatic
        fun method1372(i: Int) {
            TextureLoadExceptionStatics.anInt4596 = i
            BloomGraphicsOptionState.anInt5969 = 1
            anInt2452++
            var l = 0L
            if (NullOggStream.aString9043 == null) {
                GlRectangleTexture.method254(35, (-101).toByte())
                return
            } else {
                val class348_sub49 = ByteBuffer(method878((MapLabelMenuEntry.method1039((NullOggStream.aString9043!!), true)), -125))
                l = class348_sub49.readLong(-456577760)
                AnimationFrameDefinition.aLong6966 = class348_sub49.readLong(-456577760)
            }
            LocalPlayerState.method1138(method313(l, -100), true, "", (-115).toByte())
        }

        @JvmStatic
        fun method1373(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int) {
            anInt2450++
            if (TextureLoaderUtil.method2547(i, 84.toByte()) && i_5_ == -1391) {
                if (WorldMapTextLabel.aWidgetComponentArrayArray8584!![i] == null) Client.method107((WarpTextureNode.aWidgetComponentArrayArray9427!![i]!!), -1, i_1_, i_10_, i_2_, i_7_, i_0_, i_8_, i_4_, i_3_, i_6_, i_9_)
                else Client.method107(WorldMapTextLabel.aWidgetComponentArrayArray8584!![i]!!, -1, i_1_, i_10_, i_2_, i_7_, i_0_, i_8_, i_4_, i_3_, i_6_, i_9_)
            }
        }

        fun method1374(i: Int, class348_sub49: ByteBuffer): MinimapLineDrawer {
            if (i < 106) aKeyboardInputSource_2449 = null
            anInt2453++
            return MinimapLineDrawer(class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readMedium(-1), class348_sub49.readUnsignedByte(255))
        }

        @JvmStatic
        fun method1375(i: Int) {
            if (i != 5616) aKeyboardInputSource_2449 = null
            aKeyboardInputSource_2449 = null
            anCursorControllerArray2447 = null
        }
    }
}
