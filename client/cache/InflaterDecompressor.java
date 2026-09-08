/* InflaterDecompressor - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class152` (JODE-obfuscated).
 * Zlib/gzip decompressor. Uses java.util.zip.Inflater; decompress(int, byte[]) reads the uncompressed length from a Buffer and inflates the payload.
 */

import java.util.zip.Inflater;

final class InflaterDecompressor {
    static int anInt2070;
    static int anInt2071;
    /** Shared java.util.zip inflater (nowrap/GZIP). */
    private Inflater inflater;
    static int anInt2073;
    static int anInt2074;
    static float[] aFloatArray2075 = new float[2];
    static boolean[] aBooleanArray2076 = new boolean[100];
    static Component315 aClass243_2077;
    static int anInt2078;

    final byte[] decompress(int i, byte[] is) {
        anInt2074++;
        Buffer class348_sub49 = new Buffer(is);
        class348_sub49.offset = is.length - 4;
        int i_0_ = class348_sub49.readIntLittleEndian(-86);
        class348_sub49.offset = 0;
        if (i != 9) aFloatArray2075 = null;
        byte[] is_1_ = new byte[i_0_];
        inflateGzip(is_1_, 29123, class348_sub49);
        return is_1_;
    }

    /**
     * After a login/world failure path: force clientState toward title (3) or reconnect (5)
     * depending on the current state (video player / disconnect hooks call this).
     */
    static final void returnFromLoginFailure(byte i) {
        if (i != 3) disposeSceneEntities(-39, null);
        anInt2078++;
        if (Component49.clientState != 9) {
            if (Component49.clientState == 5 || Component49.clientState == 6) Buffer.setClientState(2, 3);
            else if (Component49.clientState == 12) Buffer.setClientState(2, 3);
        } else Buffer.setClientState(2, 5);
    }

    public static void clearStatics(byte i) {
        if (i != -97) aFloatArray2075 = null;
        aClass243_2077 = null;
        aBooleanArray2076 = null;
        aFloatArray2075 = null;
    }

    /** Walk the tile grid and dispose {@link Interface10} entities (GPU/native resources). */
    static final void disposeSceneEntities(int i, Component186[][][] class357s) {
        anInt2070++;
        for (int i_2_ = i; i_2_ < class357s.length; i_2_++) {
            Component186[][] class357s_3_ = class357s[i_2_];
            for (int i_4_ = 0; i_4_ < class357s_3_.length; i_4_++) {
                for (int i_5_ = 0; (class357s_3_[i_4_].length > i_5_); i_5_++) {
                    Component186 class357 = class357s_3_[i_4_][i_5_];
                    if (class357 != null) {
                        if (class357.aClass318_Sub1_Sub1_4402 instanceof Interface10) ((Interface10) class357.aClass318_Sub1_Sub1_4402).method40(-12031);
                        if (class357.aClass318_Sub1_Sub5_4395 instanceof Interface10) ((Interface10) class357.aClass318_Sub1_Sub5_4395).method40(-12031);
                        if (class357.aClass318_Sub1_Sub5_4407 instanceof Interface10) ((Interface10) class357.aClass318_Sub1_Sub5_4407).method40(-12031);
                        if (class357.aClass318_Sub1_Sub4_4406 instanceof Interface10) ((Interface10) class357.aClass318_Sub1_Sub4_4406).method40(-12031);
                        if (class357.aClass318_Sub1_Sub4_4403 instanceof Interface10) ((Interface10) class357.aClass318_Sub1_Sub4_4403).method40(-12031);
                        for (Component3 class148 = class357.aClass148_4396; class148 != null; class148 = class148.aClass148_2038) {
                            Component327 class318_sub1_sub3 = (class148.aClass318_Sub1_Sub3_2040);
                            if (class318_sub1_sub3 instanceof Interface10) ((Interface10) class318_sub1_sub3).method40(i ^ ~0x2efe);
                        }
                    }
                }
            }
        }
    }

    public InflaterDecompressor() {
        this(-1, 1000000, 1000000);
    }

    /** Inflate GZIP payload from {@code class348_sub49} into {@code is}. */
    final void inflateGzip(byte[] is, int i, Buffer class348_sub49) {
        try {
            if (i != 29123) disposeSceneEntities(-91, null);
            anInt2073++;
            if ((class348_sub49.payload[class348_sub49.offset]) != 31 || (class348_sub49.payload[1 + class348_sub49.offset]) != -117) throw new RuntimeException("Invalid GZIP header!");
            if (inflater == null) inflater = new Inflater(true);
            try {
                inflater.setInput(class348_sub49.payload, class348_sub49.offset - -10, -8 - (10 + class348_sub49.offset - (class348_sub49.payload).length));
                inflater.inflate(is);
            } catch (Exception exception) {
                inflater.reset();
                throw new RuntimeException("Invalid GZIP compressed data!");
            }
            inflater.reset();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ol.A(" + (is != null ? "{...}" : "null") + ',' + i + ',' + (class348_sub49 != null ? "{...}" : "null") + ')'));
        }
    }

    private InflaterDecompressor(int i, int i_6_, int i_7_) {
        /* empty */
    }
}
