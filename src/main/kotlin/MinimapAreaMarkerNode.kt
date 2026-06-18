import MinimapRectClipper.method226

/* Class348_Sub42_Sub19 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MinimapAreaMarkerNode : HashLinkedListNode() {
    var anInt9688: Int = 0
    var anInt9689: Int = 0
    var aString9690: String? = null
    var aBoundsConstraintEntry_9691: BoundsConstraintEntry? = null
    var aStringArray9692: Array<String?>? = null
    var aHashtableArray9693: Array<Hashtable?>? = null
    var anIntArray9694: IntArray? = null
    var anInt9695: Int = 0
    var anIntArray9696: IntArray? = null
    var anInt9697: Int = 0

    companion object {
        var aFontMetaRef_9687: FontMetaRef? = FontMetaRef(14, -1)
        var anInt9698: Int = 0
        @JvmField
        var anInt9699: Int = 0
        var aMapTileShapeArray9700: Array<MapTileShape?>? = null
        var anInt9701: Int = 0

        fun method3276(soundEnvelope: SoundEnvelope) {
            if (CalendarUtil.anInt4135 < 65535) {
                val class348_sub1 = soundEnvelope.aClass348_Sub1_2745
                WaterDetailOptionState.aSoundEnvelopeArray5993!![CalendarUtil.anInt4135] = soundEnvelope
                RenderNode.aBooleanArray9718!![CalendarUtil.anInt4135] = false
                CalendarUtil.anInt4135++
                var i = soundEnvelope.anInt2731
                if (soundEnvelope.aBoolean2749) i = 0
                var i_0_ = soundEnvelope.anInt2731
                if (soundEnvelope.aBoolean2737) i_0_ = MapAreaDefinition.anInt2524 - 1
                for (i_1_ in i..i_0_) {
                    var i_2_ = 0
                    var i_3_ = ((class348_sub1!!.method2717(89.toByte()) - class348_sub1.method2723(-1) + TheoraVideoStream.anInt9037) shr Tooltip.anInt4459)
                    if (i_3_ < 0) {
                        i_2_ -= i_3_
                        i_3_ = 0
                    }
                    var i_4_ = ((class348_sub1.method2717(122.toByte()) + class348_sub1.method2723(-1) - TheoraVideoStream.anInt9037) shr Tooltip.anInt4459)
                    if (i_4_ >= RegionSceneShifter.anInt7054) i_4_ = RegionSceneShifter.anInt7054 - 1
                    for (i_5_ in i_3_..i_4_) {
                        val i_6_ = soundEnvelope.aShortArray2742!![i_2_++].toInt()
                        var i_7_ = (((class348_sub1.method2724(-1) - class348_sub1.method2723(-1) + TheoraVideoStream.anInt9037) shr Tooltip.anInt4459) + (i_6_ ushr 8))
                        var i_8_ = i_7_ + (i_6_ and 0xff) - 1
                        if (i_7_ < 0) i_7_ = 0
                        if (i_8_ >= SpotAnimEntity.anInt6451) i_8_ = SpotAnimEntity.anInt6451 - 1
                        for (i_9_ in i_7_..i_8_) {
                            val l = (HardCacheEntryReference.aLongArrayArrayArray10431!![i_1_]!![i_9_]!![i_5_])
                            if ((l and 0xffffL) == 0L) HardCacheEntryReference.aLongArrayArrayArray10431!![i_1_]!![i_9_]!![i_5_] = l or CalendarUtil.anInt4135.toLong()
                            else if ((l and 0xffff0000L) == 0L) HardCacheEntryReference.aLongArrayArrayArray10431!![i_1_]!![i_9_]!![i_5_] = l or (CalendarUtil.anInt4135.toLong() shl 16)
                            else if ((l and 0xffff00000000L) == 0L) HardCacheEntryReference.aLongArrayArrayArray10431!![i_1_]!![i_9_]!![i_5_] = l or (CalendarUtil.anInt4135.toLong() shl 32)
                            else if ((l and 0xffffffffffffL.inv()) == 0L) HardCacheEntryReference.aLongArrayArrayArray10431!![i_1_]!![i_9_]!![i_5_] = l or (CalendarUtil.anInt4135.toLong() shl 48)
                        }
                    }
                }
            }
        }

        fun method3277(i: Byte) {
            anInt9698++
            if (ManagedGlResource.aClass348_Sub42_Sub13_3152 != null) {
                ManagedGlResource.aClass348_Sub42_Sub13_3152 = null
                method226(MinimapPolygonDrawer.anInt5252, TerrainTileShape.anInt8806, InputTracker.anInt4534, 0, ClickFeedbackTask.anInt4669)
            }
        }

        @JvmStatic
        fun method3278(i: Int) {
            aFontMetaRef_9687 = null
            if (i != 1) anInt9699 = -66
            aMapTileShapeArray9700 = null
        }
    }
}
