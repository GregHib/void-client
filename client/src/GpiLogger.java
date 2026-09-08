/* GpiLogger - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub16_Sub1` (JODE-obfuscated).
 * GPS/position logger. Extends NodeSub16; emits '---endgpp---' / 'gpi1 pos:' trace lines for the client's location/position debug stream.
 */

final class GpiLogger extends NodeSub16 {
    static int anInt8845;
    static int anInt8846;
    static int anInt8847;
    NodeList aClass262_8848 = new NodeList();
    static int anInt8849;
    static int anInt8850;
    static int anInt8851;
    private final BrowserUrlOpener aClass348_Sub16_Sub3_8852;
    static DisplayModeManagerContainer238 aClass74_8853 = new DisplayModeManagerContainer238(11, 8);
    static int anInt8854;
    NodeSub16Sub4 aClass348_Sub16_Sub4_8855 = new NodeSub16Sub4();
    static int anInt8856;
    static StringCache aClass351_8857 = new StringCache(54, 15);
    static int anInt8858;
    static int anInt8859;

    final NodeSub16 getPreviousNode() {
        anInt8856++;
        PlayerState class348_sub43;
        do {
            class348_sub43 = (PlayerState) this.aClass262_8848.next((byte) 122);
            if (class348_sub43 == null) return null;
        } while (class348_sub43.aClass348_Sub16_Sub5_7081 == null);
        return class348_sub43.aClass348_Sub16_Sub5_7081;
    }

    final void synthesizeSamples(int[] is, int i, int i_0_) {
        anInt8847++;
        this.aClass348_Sub16_Sub4_8855.synthesizeSamples(is, i, i_0_);
        while_125_:
        for (PlayerState class348_sub43 = ((PlayerState) this.aClass262_8848.first(4)); class348_sub43 != null; class348_sub43 = (PlayerState) this.aClass262_8848.next((byte) 121)) {
            if (!aClass348_Sub16_Sub3_8852.isVoiceActive(-107, class348_sub43)) {
                int i_1_ = i;
                int i_2_ = i_0_;
                while (class348_sub43.anInt7086 < i_2_) {
                    method2825(i_1_ + i_2_, class348_sub43, i_1_, (byte) -114, class348_sub43.anInt7086, is);
                    i_1_ += class348_sub43.anInt7086;
                    i_2_ -= class348_sub43.anInt7086;
                    if (aClass348_Sub16_Sub3_8852.synthesizeVoice(is, i_2_, class348_sub43, i_1_, (byte) -4)) continue while_125_;
                }
                method2825(i_1_ + i_2_, class348_sub43, i_1_, (byte) -114, i_2_, is);
                class348_sub43.anInt7086 -= i_2_;
            }
        }
    }

    static final void method2822(int i, DisplayModeManagerContainer207 class348_sub49_sub2, int i_3_) {
        MatrixSub3.anInt5768 = 0;
        anInt8846++;
        JagTheoraDecoder.aBoolean979 = false;
        if (i < -17) {
            NsnDefinition.method3094(-21478, class348_sub49_sub2);
            Component121.method3612(75, class348_sub49_sub2);
            if (JagTheoraDecoder.aBoolean979) System.out.println("---endgpp---");
            if (class348_sub49_sub2.offset != i_3_) throw new RuntimeException("gpi1 pos:" + class348_sub49_sub2.offset + " psize:" + i_3_);
        }
    }

    public static void method2823(int i) {
        if (i != 0) method2823(33);
        aClass351_8857 = null;
        aClass74_8853 = null;
    }

    private final void method2824(int i, byte i_4_, PlayerState class348_sub43) {
        if (((aClass348_Sub16_Sub3_8852.anIntArray8895[class348_sub43.anInt7067]) & 0x4) != 0 && (class348_sub43.anInt7087 < 0)) {
            int i_5_ = ((aClass348_Sub16_Sub3_8852.anIntArray8906[class348_sub43.anInt7067]) / Component231.sampleRate);
            int i_6_ = ((-class348_sub43.anInt7082 + (1048575 + i_5_)) / i_5_);
            class348_sub43.anInt7082 = (i_5_ * i + class348_sub43.anInt7082 & 0xfffff);
            if (i_6_ <= i) {
                if ((aClass348_Sub16_Sub3_8852.anIntArray8914[class348_sub43.anInt7067]) != 0) {
                    class348_sub43.aClass348_Sub16_Sub5_7081 = (NodeSub16Sub5.createSynthNode((class348_sub43.aClass348_Sub19_Sub1_7077), class348_sub43.aClass348_Sub16_Sub5_7081.method2914(), 0, class348_sub43.aClass348_Sub16_Sub5_7081.getSample()));
                    aClass348_Sub16_Sub3_8852.method2874(95, (class348_sub43.aClass348_Sub17_7085.aShortArray6795[class348_sub43.anInt7071]) < 0, class348_sub43);
                } else
                    class348_sub43.aClass348_Sub16_Sub5_7081 = (NodeSub16Sub5.createSynthNode((class348_sub43.aClass348_Sub19_Sub1_7077), class348_sub43.aClass348_Sub16_Sub5_7081.method2914(), class348_sub43.aClass348_Sub16_Sub5_7081.method2906(), class348_sub43.aClass348_Sub16_Sub5_7081.getSample()));
                if ((class348_sub43.aClass348_Sub17_7085.aShortArray6795[class348_sub43.anInt7071]) < 0) class348_sub43.aClass348_Sub16_Sub5_7081.method2917(-1);
                i = class348_sub43.anInt7082 / i_5_;
            }
        }
        anInt8849++;
        int i_7_ = -70 / ((14 - i_4_) / 61);
        class348_sub43.aClass348_Sub16_Sub5_7081.skip(i);
    }

    final int getDuration() {
        anInt8858++;
        return 0;
    }

    final void skip(int i) {
        this.aClass348_Sub16_Sub4_8855.skip(i);
        anInt8850++;
        while_127_:
        for (PlayerState class348_sub43 = ((PlayerState) this.aClass262_8848.first(4)); class348_sub43 != null; class348_sub43 = (PlayerState) this.aClass262_8848.next((byte) 38)) {
            if (!aClass348_Sub16_Sub3_8852.isVoiceActive(53, class348_sub43)) {
                int i_8_ = i;
                while (i_8_ > class348_sub43.anInt7086) {
                    method2824(class348_sub43.anInt7086, (byte) 115, class348_sub43);
                    i_8_ -= class348_sub43.anInt7086;
                    if (aClass348_Sub16_Sub3_8852.synthesizeVoice(null, i_8_, class348_sub43, 0, (byte) -4)) continue while_127_;
                }
                method2824(i_8_, (byte) 84, class348_sub43);
                class348_sub43.anInt7086 -= i_8_;
            }
        }
    }

    private final void method2825(int i, PlayerState class348_sub43, int i_9_, byte i_10_, int i_11_, int[] is) {
        try {
            anInt8859++;
            if (i_10_ != -114) getDuration();
            if ((0x4 & (aClass348_Sub16_Sub3_8852.anIntArray8895[class348_sub43.anInt7067])) != 0 && (class348_sub43.anInt7087 < 0)) {
                int i_12_ = ((aClass348_Sub16_Sub3_8852.anIntArray8906[class348_sub43.anInt7067]) / Component231.sampleRate);
                for (; ; ) {
                    int i_13_ = ((i_12_ + (1048575 + -class348_sub43.anInt7082)) / i_12_);
                    if (i_13_ > i_11_) break;
                    class348_sub43.aClass348_Sub16_Sub5_7081.synthesizeSamples(is, i_9_, i_13_);
                    i_9_ += i_13_;
                    class348_sub43.anInt7082 += -1048576 + i_12_ * i_13_;
                    i_11_ -= i_13_;
                    int i_14_ = Component231.sampleRate / 100;
                    int i_15_ = 262144 / i_12_;
                    if (i_15_ < i_14_) i_14_ = i_15_;
                    NodeSub16Sub5 class348_sub16_sub5 = (class348_sub43.aClass348_Sub16_Sub5_7081);
                    if ((aClass348_Sub16_Sub3_8852.anIntArray8914[class348_sub43.anInt7067]) != 0) {
                        class348_sub43.aClass348_Sub16_Sub5_7081 = (NodeSub16Sub5.createSynthNode((class348_sub43.aClass348_Sub19_Sub1_7077), class348_sub16_sub5.method2914(), 0, class348_sub16_sub5.getSample()));
                        aClass348_Sub16_Sub3_8852.method2874(116, ((class348_sub43.aClass348_Sub17_7085.aShortArray6795[class348_sub43.anInt7071]) < 0), class348_sub43);
                        class348_sub43.aClass348_Sub16_Sub5_7081.setPitch(i_14_, class348_sub16_sub5.method2906());
                    } else class348_sub43.aClass348_Sub16_Sub5_7081 = (NodeSub16Sub5.createSynthNode((class348_sub43.aClass348_Sub19_Sub1_7077), class348_sub16_sub5.method2914(), class348_sub16_sub5.method2906(), class348_sub16_sub5.getSample()));
                    if ((class348_sub43.aClass348_Sub17_7085.aShortArray6795[class348_sub43.anInt7071]) < 0) class348_sub43.aClass348_Sub16_Sub5_7081.method2917(-1);
                    class348_sub16_sub5.method2902(i_14_);
                    class348_sub16_sub5.synthesizeSamples(is, i_9_, -i_9_ + i);
                    if (class348_sub16_sub5.method2895()) this.aClass348_Sub16_Sub4_8855.method2883(class348_sub16_sub5);
                }
                class348_sub43.anInt7082 += i_11_ * i_12_;
            }
            class348_sub43.aClass348_Sub16_Sub5_7081.synthesizeSamples(is, i_9_, i_11_);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("bea.H(" + i + ',' + (class348_sub43 != null ? "{...}" : "null") + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    static final DisplayModeManagerContainer32 method2826(int i) {
        anInt8845++;
        try {
            return new Component12();
        } catch (Throwable throwable) {
            if (i != 15) return null;
            return new Component375();
        }
    }

    final NodeSub16 getNextNode() {
        anInt8851++;
        PlayerState class348_sub43 = ((PlayerState) this.aClass262_8848.first(4));
        if (class348_sub43 == null) return null;
        if (class348_sub43.aClass348_Sub16_Sub5_7081 != null) return class348_sub43.aClass348_Sub16_Sub5_7081;
        return getPreviousNode();
    }

    GpiLogger(BrowserUrlOpener class348_sub16_sub3) {
        aClass348_Sub16_Sub3_8852 = class348_sub16_sub3;
    }
}
