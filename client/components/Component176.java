/* Component176 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component176
/**
 * RENAMED from `Class293` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ implements Runnable {
    private long aLong3742;
    private Component168 aClass315_3743;
    private volatile boolean aBoolean3744;
    private volatile boolean aBoolean3745;
    private final GraphicsToolkit aHa3746;
    private final int[] anIntArray3747;
    private final NodeSub1[] aClass348_Sub1Array3748 = new NodeSub1[8];
    private final int anInt3749;
    private volatile boolean aBoolean3750;

    final long method2204() {
        return aLong3742;
    }

    public final void run() {
        while (aBoolean3745) method2207();
    }

    final void method2205() {
        aBoolean3750 = false;
        aBoolean3745 = false;
        synchronized (this) {
            this.notify();
        }
    }

    final void method2206(Component168 class315) {
        if (aClass315_3743 != null) aClass315_3743.method2356(null, (byte) -108);
        aClass315_3743 = class315;
        if (aClass315_3743 != null) aClass315_3743.method2356(this, (byte) -108);
    }

    private final void method2207() {
        aHa3746.resetTextureState(anInt3749);
        while (!aBoolean3750 && aBoolean3745) {
            if (aClass315_3743 == null || aClass315_3743.method2360(-112)) {
                aBoolean3744 = false;
                aLong3742 = Component230.aClass47_5262.method446(1);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            } else {
                aBoolean3744 = true;
                Renderable class318 = aClass315_3743.method2362(25061);
                if (class318 instanceof RenderableObject) {
                    RenderableObject class318_sub1 = (RenderableObject) class318;
                    if (class318_sub1.aBoolean6387) class318_sub1.method2387(JaclibLoader.toolkit, -127);
                    else {
                        PauseTimer.method365(class318_sub1, aClass348_Sub1Array3748);
                        if (Component149.debugOverlayFont != null) Component149.debugOverlayFont.drawText(aClass315_3743.aString3953, -256, class318_sub1.anInt6380, class318_sub1.anInt6386, -16777216, -114);
                    }
                } else {
                    int i = ((RenderableSub2) class318).anInt6394;
                    if (i >= 1 && i <= 4) {
                        s var_s = ShaderSub1.aSArray5191[i - 1];
                        for (int i_0_ = 0; i_0_ < (Component197.anInt10084 + Component197.anInt10084); i_0_++) {
                            for (int i_1_ = 0; i_1_ < (Component197.anInt10084 + Component197.anInt10084); i_1_++) {
                                if (Component95.aBooleanArrayArrayArray1751[i - 1][i_0_][i_1_]) {
                                    int i_2_ = (Component256.anInt6111 - Component197.anInt10084 + i_0_);
                                    int i_3_ = (DebugPanicSub2.anInt8502 - Component197.anInt10084 + i_1_);
                                    if (i_2_ >= 0 && i_2_ < var_s.tileWidth && i_3_ >= 0 && i_3_ < var_s.tileLength) {
                                        JaclibLoader.toolkit.H(i_2_ << Component149.anInt4459, var_s.getHeight((byte) -86, i_3_, i_2_), i_3_ << Component149.anInt4459, anIntArray3747);
                                        if (WaterSurfaceShader.method2154(anIntArray3747[0]) == anInt3749 - 1) var_s.method3979(i_2_, i_3_);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        aHa3746.method3678(anInt3749);
        while (aBoolean3750 && aBoolean3745) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException interruptedexception) {
                    /* empty */
                }
            }
        }
    }

    final void method2208() {
        aBoolean3750 = true;
        synchronized (this) {
            this.notify();
        }
    }

    final void method2209() {
        aBoolean3750 = false;
        synchronized (this) {
            this.notify();
        }
    }

    final boolean method2210() {
        return aClass315_3743 == null || (!aBoolean3744 && aClass315_3743.method2360(70));
    }

    Component176(int i, GraphicsToolkit var_ha) {
        anIntArray3747 = new int[3];
        aBoolean3750 = true;
        aBoolean3745 = true;
        aBoolean3744 = false;
        anInt3749 = i;
        aHa3746 = var_ha;
    }
}
