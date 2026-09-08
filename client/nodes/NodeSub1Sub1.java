/* NodeSub1Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NodeSub1Sub1
/**
 * RENAMED from `Class348_Sub1_Sub1` (JODE-obfuscated).
 * Evidence: subclass of NodeSub1 (hierarchy)
 */ extends NodeSub1 {
    static s[] aSArray8801;
    static int anInt8802;
    static int anInt8803;
    static int anInt8804;
    static boolean aBoolean8805 = false;
    static int anInt8806;
    static NodeCache aClass60_8807;
    static int anInt8808 = 0;
    static int anInt8809;

    NodeSub1Sub1(int i, int i_0_, int i_1_, int i_2_, int i_3_, float f) {
        super(i, i_0_, i_1_, i_2_, i_3_, f);
    }

    final void method2725(int i, byte i_4_, int i_5_, int i_6_) {
        this.anInt6553 = i_5_;
        this.anInt6548 = i_6_;
        if (i_4_ == 70) {
            anInt8809++;
            this.anInt6562 = i;
        }
    }

    static final int method2726(int i, int i_7_, int i_8_) {
        if (i_8_ > i_7_) {
            int i_9_ = i_7_;
            i_7_ = i_8_;
            i_8_ = i_9_;
        }
        if (i != -21806) method2727((byte) -128, null, null);
        anInt8804++;
        int i_10_;
        for (/**/; i_8_ != 0; i_8_ = i_10_) {
            i_10_ = i_7_ % i_8_;
            i_7_ = i_8_;
        }
        return i_7_;
    }

    static final void method2727(byte i, Component251 class237_sub1, byte[][] is) {
        try {
            anInt8802++;
            int[] is_11_ = {-1, 0, 0, 0, 0};
            int i_12_ = 67 % ((i - 14) / 47);
            int i_13_ = is.length;
            for (int i_14_ = 0; i_13_ > i_14_; i_14_++) {
                byte[] is_15_ = is[i_14_];
                if (is_15_ != null) {
                    Buffer class348_sub49 = new Buffer(is_15_);
                    int i_16_ = (OggStreamReader.anIntArray9042[i_14_] >> 8);
                    int i_17_ = 0xff & OggStreamReader.anIntArray9042[i_14_];
                    int i_18_ = -NodeBaseSub2.regionTileX + i_16_ * 64;
                    int i_19_ = -Component330.regionTileY + i_17_ * 64;
                    Component381.method3570(false);
                    class237_sub1.method1681(class348_sub49, i_18_, NodeSub45.aClass361Array7108, Component330.regionTileY, NodeBaseSub2.regionTileX, i_19_, (byte) 110);
                    class237_sub1.method1691(i_19_, NodeSub8.toolkit, class348_sub49, is_11_, i_18_, (byte) -126);
                    if (!class237_sub1.aBoolean3109 && i_16_ == GraphicsToolkit.anInt4581 / 8 && (i_17_ == DisplayModeManagerContainer363.anInt4095 / 8) && is_11_[0] != -1) {
                        Component293.aClass305_3304 = ComponentDownloader.aClass84_413.method823(is_11_[2], is_11_[3], is_11_[1], -66, (Component132.aClass25_1813), is_11_[0]);
                        Component316.anInt2481 = is_11_[4];
                    }
                }
            }
            for (int i_20_ = 0; i_20_ < i_13_; i_20_++) {
                int i_21_ = ((OggStreamReader.anIntArray9042[i_20_] >> 8) * 64 - NodeBaseSub2.regionTileX);
                int i_22_ = (-Component330.regionTileY + ((0xff & OggStreamReader.anIntArray9042[i_20_]) * 64));
                byte[] is_23_ = is[i_20_];
                if (is_23_ == null && DisplayModeManagerContainer363.anInt4095 < 800) {
                    Component381.method3570(false);
                    class237_sub1.method1688(i_22_, 64, 64, 125, i_21_);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("bg.E(" + i + ',' + (class237_sub1 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method2728(byte i) {
        if (i != 9) aClass60_8807 = null;
        aClass60_8807 = null;
        aSArray8801 = null;
    }

    final void method2716(int i, float f) {
        this.aFloat6550 = f;
        if (i != -1) aClass60_8807 = null;
        anInt8803++;
    }

    static {
        aClass60_8807 = new NodeCache(8);
    }
}
