/* Component146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component146
/**
 * RENAMED from `Class159` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt2124;
    int anInt2125 = 0;
    static int anInt2126;
    static int anInt2127 = 500;
    static int anInt2128;

    private final void method1251(Buffer class348_sub49, int i, int i_0_) {
        if (i == 5) this.anInt2125 = class348_sub49.readUnsignedShort(842397944);
        anInt2126++;
        int i_1_ = 60 % ((i_0_ - 33) / 57);
    }

    static final void method1252(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, byte i_8_, int i_9_) {
        anInt2124++;
        if (Component233.method2547(i_2_, (byte) 84)) {
            int i_11_ = 0;
            int i_12_ = 0;
            int i_13_ = 0;
            int i_14_ = 0;
            int i_15_ = 0;
            if (Component210.gameCanvasAttached) {
                i_11_ = Component112.anInt3941;
                i_15_ = HashNodeSub16Sub2.anInt10463;
                i_13_ = Component112.anInt3939;
                i_12_ = Component339.anInt3142;
                i_14_ = NodeSub3.anInt6585;
                HashNodeSub16Sub2.anInt10463 = 1;
            }
            int drawY = i;
            int loginShift = MobileKeyboard.loginLayerShift();
            if (loginShift > 0 && i_2_ == 744) {
                drawY -= loginShift;
            }
            if (Component14.aClass46ArrayArray8584[i_2_] == null) ImageDefinition.method3064(i_9_, drawY, i_4_ < 0, i_5_, i_3_, i_4_, i_6_, false, (DefinitionSub33.openInterfaces[i_2_]), -1, i_7_);
            else ImageDefinition.method3064(i_9_, drawY, i_4_ < 0, i_5_, i_3_, i_4_, i_6_, false, (Component14.aClass46ArrayArray8584[i_2_]), -1, i_7_);
            if (i_8_ <= 58) anInt2127 = -84;
            if (Component210.gameCanvasAttached) {
                if (i_4_ >= 0 && HashNodeSub16Sub2.anInt10463 == 2) Component103.method2663(-5590, Component112.anInt3941, Component112.anInt3939, Component339.anInt3142, NodeSub3.anInt6585);
                HashNodeSub16Sub2.anInt10463 = i_15_;
                Component112.anInt3939 = i_13_;
                Component339.anInt3142 = i_12_;
                NodeSub3.anInt6585 = i_14_;
                Component112.anInt3941 = i_11_;
            }
        } else if (i_4_ == -1) {
            for (int i_10_ = 0; i_10_ < 100; i_10_++)
                InflaterDecompressor.aBooleanArray2076[i_10_] = true;
        } else InflaterDecompressor.aBooleanArray2076[i_4_] = true;
    }

    final void method1253(Buffer class348_sub49, boolean bool) {
        for (; ; ) {
            int i = class348_sub49.readUnsignedByte(255);
            if (i == 0) break;
            method1251(class348_sub49, i, -105);
        }
        anInt2128++;
        if (bool != true) this.anInt2125 = 58;
    }

    public Component146() {
        /* empty */
    }
}
