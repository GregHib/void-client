/* RenderableSub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class RenderableSub10
/**
 * RENAMED from `Class318_Sub10` (JODE-obfuscated).
 * Evidence: subclass of Renderable (hierarchy)
 */ extends Renderable {
    boolean aBoolean6470;
    private long aLong6471;
    private long aLong6472;
    private boolean aBoolean6473 = false;
    private static boolean[] aBooleanArray6474 = new boolean[32];
    RenderableSub9Sub2Sub1[] aClass318_Sub9_Sub2_Sub1Array6475;
    int anInt6476 = 0;
    private static boolean[] aBooleanArray6477 = new boolean[8];
    private Component315 aClass243_6478;
    NodeList aClass262_6479;
    private int anInt6480;
    Component122 aClass98_6481;
    boolean aBoolean6482;
    int anInt6483;
    private boolean aBoolean6484;
    private int anInt6485;

    final Component122 method2525() {
        return this.aClass98_6481;
    }

    static final RenderableSub10 method2526(int i, boolean bool) {
        if (GlTexture.anInt8550 != Component239.anInt4559) {
            RenderableSub10 class318_sub10 = NodeSub51.aClass318_Sub10Array7249[Component239.anInt4559];
            Component239.anInt4559 = Component239.anInt4559 + 1 & (ReferenceHolder.anIntArray9558[NodederUtil.anInt6637]);
            class318_sub10.method2531(i, bool);
            return class318_sub10;
        }
        return new RenderableSub10(i, bool);
    }

    public static void method2527() {
        aBooleanArray6474 = null;
        aBooleanArray6477 = null;
    }

    final void method2528(GraphicsToolkit var_ha) {
        this.aClass98_6481.aClass88_1569.method845((byte) 89);
        for (StaticElementRenderer class318_sub7 = (StaticElementRenderer) aClass243_6478.method1872(8); class318_sub7 != null; class318_sub7 = (StaticElementRenderer) aClass243_6478.method1878((byte) 126))
            class318_sub7.method2511(true, var_ha, aLong6471);
    }

    final void method2529() {
        aBoolean6484 = true;
    }

    final void method2530() {
        this.aBoolean6470 = true;
        for (HashNodeSub20 class348_sub42_sub20 = ((HashNodeSub20) this.aClass262_6479.first(4)); class348_sub42_sub20 != null; class348_sub42_sub20 = (HashNodeSub20) this.aClass262_6479.next((byte) 89)) {
            if (class348_sub42_sub20.aClass174_9704.anInt2296 == 1) class348_sub42_sub20.unlink(true);
        }
        for (int i = 0; i < (this.aClass318_Sub9_Sub2_Sub1Array6475).length; i++) {
            if (this.aClass318_Sub9_Sub2_Sub1Array6475[i] != null) {
                this.aClass318_Sub9_Sub2_Sub1Array6475[i].method2520();
                this.aClass318_Sub9_Sub2_Sub1Array6475[i] = null;
            }
        }
        this.anInt6476 = 0;
        aClass243_6478 = new Component315();
        anInt6480 = 0;
        this.aClass262_6479 = new NodeList();
        anInt6485 = 0;
        this.unlink(false);
        NodeSub51.aClass318_Sub10Array7249[GlTexture.anInt8550] = this;
        GlTexture.anInt8550 = (GlTexture.anInt8550 + 1 & ReferenceHolder.anIntArray9558[NodederUtil.anInt6637]);
    }

    private final void method2531(int i, boolean bool) {
        InflaterDecompressor.aClass243_2077.method1869(-88, this);
        aLong6472 = i;
        aLong6471 = i;
        aBoolean6484 = true;
        this.aBoolean6482 = bool;
    }

    private final void method2532(GraphicsToolkit var_ha, Component30[] class129s, boolean bool) {
        for (int i = 0; i < 32; i++)
            aBooleanArray6474[i] = false;
        while_110_:
        for (StaticElementRenderer class318_sub7 = (StaticElementRenderer) aClass243_6478.method1872(8); class318_sub7 != null; class318_sub7 = (StaticElementRenderer) aClass243_6478.method1878((byte) -28)) {
            if (class129s != null) {
                for (int i = 0; i < class129s.length; i++) {
                    if ((class318_sub7.aClass129_6436 == class129s[i]) || (class318_sub7.aClass129_6436 == class129s[i].aClass129_1888)) {
                        aBooleanArray6474[i] = true;
                        class318_sub7.method2507(true);
                        class318_sub7.aBoolean6446 = false;
                        continue while_110_;
                    }
                }
            }
            if (!bool) {
                if (class318_sub7.anInt6447 == 0) {
                    class318_sub7.unlink(false);
                    anInt6480--;
                } else class318_sub7.aBoolean6446 = true;
            }
        }
        if (class129s != null) {
            for (int i = 0; i < class129s.length; i++) {
                if (i == 32 || anInt6480 == 32) break;
                if (!aBooleanArray6474[i]) {
                    StaticElementRenderer class318_sub7 = new StaticElementRenderer(var_ha, class129s[i], this, aLong6472);
                    aClass243_6478.method1869(-126, class318_sub7);
                    anInt6480++;
                    aBooleanArray6474[i] = true;
                }
            }
        }
    }

    final void method2533(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        this.anInt6483 = i;
    }

    final void method2534() {
        aBoolean6473 = true;
    }

    final boolean method2535(GraphicsToolkit var_ha, long l) {
        if (aLong6472 != aLong6471) method2534();
        else method2537();
        if (l - aLong6472 > 750L) {
            method2530();
            return false;
        }
        int i = (int) (l - aLong6471);
        if (aBoolean6484) {
            for (StaticElementRenderer class318_sub7 = (StaticElementRenderer) aClass243_6478.method1872(8); class318_sub7 != null; class318_sub7 = (StaticElementRenderer) aClass243_6478.method1878((byte) 122)) {
                for (int i_4_ = 0; i_4_ < class318_sub7.aClass181_6441.anInt2422; i_4_++)
                    class318_sub7.method2513(var_ha, 1, l, 3, !aBoolean6473);
            }
            aBoolean6484 = false;
        }
        for (StaticElementRenderer class318_sub7 = (StaticElementRenderer) aClass243_6478.method1872(8); class318_sub7 != null; class318_sub7 = (StaticElementRenderer) aClass243_6478.method1878((byte) -72))
            class318_sub7.method2513(var_ha, i, l, 3, !aBoolean6473);
        aLong6471 = l;
        return true;
    }

    final void method2536(GraphicsToolkit var_ha, long l, Component30[] class129s, DisplayModeManagerContainer173[] class342s, boolean bool) {
        if (!this.aBoolean6470) {
            method2532(var_ha, class129s, bool);
            method2538(class342s, bool);
            aLong6472 = l;
        }
    }

    private final void method2537() {
        aBoolean6473 = false;
    }

    private final void method2538(DisplayModeManagerContainer173[] class342s, boolean bool) {
        for (int i = 0; i < 8; i++)
            aBooleanArray6477[i] = false;
        while_112_:
        for (HashNodeSub20 class348_sub42_sub20 = ((HashNodeSub20) this.aClass262_6479.first(4)); class348_sub42_sub20 != null; class348_sub42_sub20 = (HashNodeSub20) this.aClass262_6479.next((byte) 85)) {
            if (class342s != null) {
                for (int i = 0; i < class342s.length; i++) {
                    if ((class348_sub42_sub20.aClass342_9702) == class342s[i] || ((class348_sub42_sub20.aClass342_9702) == class342s[i].aClass342_4248)) {
                        aBooleanArray6477[i] = true;
                        class348_sub42_sub20.method3279(2);
                        continue while_112_;
                    }
                }
            }
            if (!bool) {
                class348_sub42_sub20.unlink((byte) 108);
                anInt6485--;
                if (class348_sub42_sub20.isChainLinked((byte) 1)) {
                    class348_sub42_sub20.unlink(true);
                    StaticElementRenderer.anInt6450--;
                }
            }
        }
        if (class342s != null) {
            for (int i = 0; i < class342s.length; i++) {
                if (i == 8 || anInt6485 == 8) break;
                if (!aBooleanArray6477[i]) {
                    HashNodeSub20 class348_sub42_sub20 = null;
                    if ((class342s[i].method2685((byte) -13).anInt2296) == 1 && StaticElementRenderer.anInt6450 < 32) {
                        class348_sub42_sub20 = new HashNodeSub20(class342s[i], this);
                        OpenGlShader.aClass32_7415.method335(class348_sub42_sub20, -8098, class342s[i].anInt4245);
                        StaticElementRenderer.anInt6450++;
                    }
                    if (class348_sub42_sub20 == null) class348_sub42_sub20 = new HashNodeSub20(class342s[i], this);
                    this.aClass262_6479.addTail(class348_sub42_sub20, -20180);
                    anInt6485++;
                    aBooleanArray6477[i] = true;
                }
            }
        }
    }

    final Component122 method2539() {
        this.aClass98_6481.aClass88_1569.method845((byte) 43);
        for (int i = 0; i < (this.aClass318_Sub9_Sub2_Sub1Array6475).length; i++) {
            if ((this.aClass318_Sub9_Sub2_Sub1Array6475[i] != null) && this.aClass318_Sub9_Sub2_Sub1Array6475[i].aClass318_Sub7_10419 != null) this.aClass98_6481.aClass88_1569.method844((this.aClass318_Sub9_Sub2_Sub1Array6475[i]), true);
        }
        return this.aClass98_6481;
    }

    final void method2540(long l) {
        aLong6472 = l;
    }

    private RenderableSub10(int i, boolean bool) {
        this.aBoolean6470 = false;
        aClass243_6478 = new Component315();
        anInt6480 = 0;
        this.aClass262_6479 = new NodeList();
        this.aBoolean6482 = false;
        anInt6485 = 0;
        aBoolean6484 = false;
        this.aClass98_6481 = new Component122();
        this.aClass318_Sub9_Sub2_Sub1Array6475 = new RenderableSub9Sub2Sub1[8192];
        method2531(i, bool);
    }
}
