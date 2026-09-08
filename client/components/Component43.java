/* Component43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component43
/**
 * RENAMED from `Class216` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ implements Interface13 {
    int anInt4974;
    static CacheStore aClass45_4975;
    static int anInt4976;
    static int anInt4977;
    int anInt4978;
    static int anInt4979;
    float[] aFloatArray4980;

    static final void method1583(byte i) {
        anInt4977++;
        if (r.anInt9721 != -1) {
            int i_0_ = AbstractGlTextureSub4.mouseHandler.getCursorX(true);
            int i_1_ = AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 72);
            NodeSub45 class348_sub45 = ((NodeSub45) Component327.aClass262_8744.first(4));
            if (class348_sub45 != null) {
                i_0_ = class348_sub45.getX((byte) -128);
                i_1_ = class348_sub45.getY(58);
            }
            // Purple console is drawn over ifaces — don't build tips / fire clicks under it.
            if (BuildInfo.consoleContains(i_0_, i_1_)) {
                return;
            }
            int i_2_ = 0;
            if (i != -73) anInt4976 = 105;
            int i_3_ = 0;
            if (Component210.gameCanvasAttached) {
                i_2_ = BufferCacheSub3.method4008((byte) -128);
                i_3_ = Component110.method260(false);
            }
            Component280.method1373(r.anInt9721, i_2_, i_2_, Component236.canvasWidth + i_2_, i_1_, i_0_, -1391, i_0_ + i_2_, PacketReader.canvasHeight + i_3_, i_3_, i_3_ + i_1_, i_3_);
            if (Component39.aClass46_2249 != null) NativeLibraryLoader.method1630(0, i_3_ + i_1_, i_2_ + i_0_);
        }
    }

    public static void method1584(byte i) {
        if (i != -64) method1584((byte) -48);
        aClass45_4975 = null;
    }

    Component43(int i, int i_4_) {
        this.anInt4978 = i_4_;
        this.anInt4974 = i;
        this.aFloatArray4980 = new float[i * i_4_];
    }
}
