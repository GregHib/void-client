/* Component326 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class Component326
/**
 * RENAMED from `Class55_Sub1` (JODE-obfuscated).
 * Evidence: subclass of JagTheoraDecoder (hierarchy)
 */ extends JagTheoraDecoder {
    static boolean aBoolean5265 = false;
    static int anInt5266;
    private final CacheStore aClass45_5267;
    static int anInt5268;
    private int[] anIntArray5269;
    private int anInt5270;
    /** Live world-list channel. */
    static NamedInteger LIVE = new NamedInteger("LIVE", 0);
    private final int anInt5272;
    static int anInt5273;
    private final Buffer aClass348_Sub49_5274;
    private byte[][] aByteArrayArray5275 = new byte[10][];
    private final Buffer aClass348_Sub49_5276;

    final void method522(byte i) {
        anInt5266++;
        if (anIntArray5269 != null && i < -27) {
            for (int i_0_ = 0; i_0_ < 10 && anIntArray5269.length > anInt5270 + i_0_; i_0_++) {
                if (aByteArrayArray5275[i_0_] == null && aClass45_5267.isFileReady(-10499, (anIntArray5269[i_0_ + anInt5270]), 0)) aByteArrayArray5275[i_0_] = aClass45_5267.getFile(-1860, (anIntArray5269[anInt5270 + i_0_]), 0);
            }
        }
    }

    public static void method523(int i) {
        if (i <= 80) method524(-87, true, 104, 0);
        LIVE = null;
    }

    private Component326(int i, CacheStore class45, int i_1_) {
        super(i);
        aClass348_Sub49_5274 = new Buffer(null);
        aClass348_Sub49_5276 = new Buffer(null);
        aClass45_5267 = class45;
        anInt5272 = i_1_;
    }

    static final void method524(int i, boolean bool, int i_2_, int i_3_) {
        if (i_3_ > -108) aBoolean5265 = false;
        if (DisplayModeManagerContainer91.aClass356_389.get(i_2_, -6008) == null) {
            if (PauseTimer.aBoolean510) {
                ColorTagNode class348_sub15 = new ColorTagNode(i_2_, new Component326(4096, (Component334.aClass45_2015), i_2_), i, bool);
                class348_sub15.aClass55_Sub1_6768.method509(-92, Component185.languageNames[ObjectDeserializer.languageId]);
                DisplayModeManagerContainer91.aClass356_389.put((byte) 35, i_2_, class348_sub15);
            } else DisplayModeManagerContainer165.method2285(bool, (byte) -90, i_2_);
        }
        anInt5268++;
    }

    final int method516(byte i, byte[] is) throws IOException {
        anInt5273++;
        if (anIntArray5269 == null) {
            if (!aClass45_5267.isFileReady(-10499, anInt5272, 0)) return 0;
            byte[] is_4_ = aClass45_5267.getFile(-1860, anInt5272, 0);
            if (is_4_ == null) throw new IllegalStateException("");
            aClass348_Sub49_5276.payload = is_4_;
            aClass348_Sub49_5276.offset = 0;
            int i_5_ = is_4_.length >> 1;
            anIntArray5269 = new int[i_5_];
            for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
                anIntArray5269[i_6_] = aClass348_Sub49_5276.readUnsignedShort(842397944);
        }
        if (anInt5270 >= anIntArray5269.length) return -1;
        method522((byte) -74);
        if (i != 21) aByteArrayArray5275 = null;
        aClass348_Sub49_5276.payload = is;
        aClass348_Sub49_5276.offset = 0;
        while (aClass348_Sub49_5276.offset < aClass348_Sub49_5276.payload.length) {
            if (aClass348_Sub49_5274.payload == null) {
                if (aByteArrayArray5275[0] == null) {
                    aClass348_Sub49_5276.payload = null;
                    return aClass348_Sub49_5276.offset;
                }
                aClass348_Sub49_5274.payload = aByteArrayArray5275[0];
            }
            int i_7_ = (-aClass348_Sub49_5276.offset + (aClass348_Sub49_5276.payload).length);
            int i_8_ = (-aClass348_Sub49_5274.offset + (aClass348_Sub49_5274.payload).length);
            if (i_8_ <= i_7_) {
                aClass348_Sub49_5276.writeBytes(i_8_, aClass348_Sub49_5274.offset, aClass348_Sub49_5274.payload, -58);
                aClass348_Sub49_5274.offset = 0;
                aClass348_Sub49_5274.payload = null;
                anInt5270++;
                for (int i_9_ = 0; i_9_ < 9; i_9_++)
                    aByteArrayArray5275[i_9_] = aByteArrayArray5275[i_9_ - -1];
                aByteArrayArray5275[9] = null;
                if (anInt5270 >= anIntArray5269.length) {
                    aClass348_Sub49_5276.payload = null;
                    return aClass348_Sub49_5276.offset;
                }
            } else {
                aClass348_Sub49_5274.readBytes(2147483647, aClass348_Sub49_5276.offset, i_7_, aClass348_Sub49_5276.payload);
                aClass348_Sub49_5276.payload = null;
                return is.length;
            }
        }
        aClass348_Sub49_5276.payload = null;
        return is.length;
    }
}
