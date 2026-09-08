/* Component160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component160
/**
 * RENAMED from `Class354` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt4352;
    static int anInt4353;
    static int anInt4354;
    private final GlToolkitSub2 aHa_Sub2_4355;
    static int[][][] anIntArrayArrayArray4356;
    static int anInt4357;
    static int anInt4358;
    private final d modelProvider;
    static int anInt4360;
    private NodeCache aClass60_4361 = new NodeCache(256);

    final void method3463(byte i) {
        anInt4360++;
        aClass60_4361.clear(0);
        if (i != -110) aClass60_4361 = null;
    }

    static final byte method3464(char c, boolean bool) {
        anInt4354++;
        if (bool != false) method3464('\uffe1', false);
        byte i;
        if ((c <= 0 || c >= 128) && (c < 160 || c > 255)) {
            if (c != 8364) {
                if (c != 8218) {
                    if (c == 402) i = (byte) -125;
                    else if (c == 8222) i = (byte) -124;
                    else if (c == 8230) i = (byte) -123;
                    else if (c == 8224) i = (byte) -122;
                    else if (c == 8225) i = (byte) -121;
                    else if (c != 710) {
                        if (c == 8240) i = (byte) -119;
                        else if (c == 352) i = (byte) -118;
                        else if (c == 8249) i = (byte) -117;
                        else if (c == 338) i = (byte) -116;
                        else if (c != 381) {
                            if (c != 8216) {
                                if (c == 8217) i = (byte) -110;
                                else if (c != 8220) {
                                    if (c != 8221) {
                                        if (c == 8226) i = (byte) -107;
                                        else if (c != 8211) {
                                            if (c != 8212) {
                                                if (c == 732) i = (byte) -104;
                                                else if (c == 8482) i = (byte) -103;
                                                else if (c == 353) i = (byte) -102;
                                                else if (c != 8250) {
                                                    if (c != 339) {
                                                        if (c == 382) i = (byte) -98;
                                                        else if (c == 376) i = (byte) -97;
                                                        else i = (byte) 63;
                                                    } else i = (byte) -100;
                                                } else i = (byte) -101;
                                            } else i = (byte) -105;
                                        } else i = (byte) -106;
                                    } else i = (byte) -108;
                                } else i = (byte) -109;
                            } else i = (byte) -111;
                        } else i = (byte) -114;
                    } else i = (byte) -120;
                } else i = (byte) -126;
            } else i = (byte) -128;
        } else i = (byte) c;
        return i;
    }

    static final boolean method3465(int i, int i_0_, Component103 class338) {
        anInt4358++;
        DefinitionSub4.aClass101_9114.method897(class338.anIntArray4187[i], class338.anIntArray4191[i], class338.anIntArray4184[i], ShaderLinker.anIntArray10172);
        int i_1_ = ShaderLinker.anIntArray10172[2];
        if (i_1_ < 50) return false;
        class338.aShortArray4194[i] = (short) (Component325.anInt1202 + (ShaderLinker.anIntArray10172[0] * Component211.anInt1962 / i_1_));
        class338.aShortArray4183[i] = (short) ((DebugPanicSub2.anInt8498 * ShaderLinker.anIntArray10172[i_0_] / i_1_) + DisplayModeManagerContainer207.anInt9759);
        class338.aShortArray4188[i] = (short) i_1_;
        return true;
    }

    static final void method3466(int i) {
        int i_2_ = 22 / ((-2 - i) / 52);
        anInt4352++;
        for (int i_3_ = 0; i_3_ < 100; i_3_++)
            InflaterDecompressor.aBooleanArray2076[i_3_] = true;
    }

    final GlTexture method3467(int i, int i_4_) {
        anInt4357++;
        Object object = aClass60_4361.get(i, -127);
        if (object != null) return (GlTexture) object;
        if (!modelProvider.isModelLoaded(-7953, i)) return null;
        Model class12 = modelProvider.getModel(i, -6662);
        int i_5_ = (!class12.aBoolean199 ? aHa_Sub2_4355.anInt7712 : 64);
        GlTexture class258_sub3;
        if (class12.aBoolean218 && aHa_Sub2_4355.method3666()) {
            float[] fs = modelProvider.getVertices(i_5_, 0.7F, false, -30824, i_5_, i);
            class258_sub3 = new GlTexture(aHa_Sub2_4355, 3553, 34842, i_5_, i_5_, class12.aByte205 != 0, fs, 6408);
        } else {
            int[] is;
            if (class12.anInt200 == 2 || !Component111.isOrthogonalWallType((byte) 4, class12.aByte213)) is = modelProvider.getIndices(-21540, i_5_, 0.7F, i, false, i_5_);
            else is = modelProvider.getTriangles(true, i, 0.7F, i_5_, i_5_, i_4_ + -196);
            class258_sub3 = new GlTexture(aHa_Sub2_4355, 3553, 6408, i_5_, i_5_, class12.aByte205 != 0, is, 0, 0, false);
        }
        class258_sub3.method1965(class12.aBoolean215, class12.aBoolean217, 10243);
        if (i_4_ != 256) method3466(22);
        aClass60_4361.putOne(class258_sub3, i, (byte) -114);
        return class258_sub3;
    }

    public static void method3468(int i) {
        anIntArrayArrayArray4356 = null;
        if (i != -1401) anIntArrayArrayArray4356 = null;
    }

    final void method3469(int i) {
        if (i == 8218) {
            anInt4353++;
            aClass60_4361.processSoftEntries(2, 5);
        }
    }

    Component160(GlToolkitSub2 var_ha_Sub2, d var_d) {
        try {
            aHa_Sub2_4355 = var_ha_Sub2;
            modelProvider = var_d;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("eo.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + (var_d != null ? "{...}" : "null") + ')'));
        }
    }
}
