/* DisplayModeManagerContainer232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer232
/**
 * RENAMED from `Class265` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ implements Interface1 {
    private final Component247 aClass120_4687;
    private Component24 aClass105_4688;
    static DisplayModeManagerContainer238 aClass74_4689 = new DisplayModeManagerContainer238(2, 4);
    static int anInt4690;
    static int anInt4691;
    static int[] anIntArray4692;
    static boolean[][] aBooleanArrayArray4693 = {new boolean[4], new boolean[4], {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, new boolean[4], new boolean[4], new boolean[4], new boolean[4]};
    private final CacheStore aClass45_4694;
    static int anInt4695;
    static int anInt4696;

    public final void method7(int i) {
        aClass105_4688 = DummyClass.method3577((aClass120_4687.anInt4912), (byte) 116, aClass45_4694);
        if (i != 10286) aBooleanArrayArray4693 = null;
        anInt4695++;
    }

    static final Cp1252Decoder method2022(Buffer class348_sub49, int i) {
        if (i != 0) return null;
        anInt4691++;
        return new Cp1252Decoder(class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readShort(i + 13638), class348_sub49.readShort(13638), class348_sub49.readMedium(-1), class348_sub49.readMedium(-1), class348_sub49.readUnsignedByte(255));
    }

    public final void method9(byte i, boolean bool) {
        anInt4696++;
        if (i != -49) method2022(null, 101);
        if (bool) {
            int i_0_ = (Math.max(Component236.canvasWidth, DisplayModeManagerContainer23.canvasWidth));
            int i_1_ = (Math.max(PacketReader.canvasHeight, GlToolkitSub2.canvasHeight));
            // Stretch title/login background to the full viewport (same full-bleed
            // feel as in-game). Cover/fit left letterboxing or cropped art.
            aClass105_4688.method973(0, 0, i_0_, i_1_);
        }
    }

    public static void method2023(byte i) {
        if (i > -13) aClass74_4689 = null;
        aClass74_4689 = null;
        anIntArray4692 = null;
        aBooleanArrayArray4693 = null;
    }

    DisplayModeManagerContainer232(CacheStore class45, Component247 class120) {
        try {
            aClass45_4694 = class45;
            aClass120_4687 = class120;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("uk.<init>(" + (class45 != null ? "{...}" : "null") + ',' + (class120 != null ? "{...}" : "null") + ')'));
        }
    }

    public final boolean method8(byte i) {
        int i_8_ = -105 % ((25 - i) / 52);
        anInt4690++;
        return aClass45_4694.isSingletonFileReady(false, aClass120_4687.anInt4912);
    }
}
