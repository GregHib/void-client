/* Component298 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Component298
/**
 * RENAMED from `Class5` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ implements Interface1 {
    static int anInt4627;
    static int anInt4628;
    static int anInt4629;
    private int anInt4630;
    private final CacheStore aClass45_4631;
    CacheStore aClass45_4632;
    static int anInt4633;
    static int anInt4634;
    Component27 aClass369_4635;
    static NodeCache aClass60_4636 = new NodeCache(64);
    private BitmapFont aClass324_4637;
    static int anInt4638;
    static int anInt4639;
    private long aLong4640;
    static int anInt4641;

    abstract void method178(int i, boolean bool, byte i_0_, int i_1_);

    public boolean method8(byte i) {
        int i_2_ = -94 % ((i - 25) / 52);
        anInt4641++;
        boolean bool = true;
        if (!this.aClass45_4632.isSingletonFileReady(false, this.aClass369_4635.anInt4965)) bool = false;
        if (!aClass45_4631.isSingletonFileReady(false, this.aClass369_4635.anInt4965)) bool = false;
        return bool;
    }

    public void method7(int i) {
        anInt4639++;
        if (i == 10286) {
            Component184 class143 = Component98.method1766((byte) -85, (this.aClass369_4635.anInt4965), aClass45_4631);
            aClass324_4637 = (NodeSub8.toolkit.method3686(class143, Component170.method1523(this.aClass45_4632, (this.aClass369_4635.anInt4965)), true));
        }
    }

    static final Component381 method179(int i, Buffer class348_sub49) {
        anInt4629++;
        Component27 class369 = NodeSub16Sub2.method2834((byte) -127, class348_sub49);
        int i_3_ = class348_sub49.readInt((byte) -126);
        int i_4_ = class348_sub49.readInt((byte) -126);
        if (i != 16533) aClass60_4636 = null;
        int i_5_ = class348_sub49.readUnsignedShort(842397944);
        return new Component381(class369.aClass221_4968, class369.aClass341_4973, class369.anInt4970, class369.anInt4959, class369.anInt4971, class369.anInt4963, class369.anInt4966, class369.anInt4965, class369.anInt4961, i_3_, i_4_, i_5_);
    }

    public static void method180(int i) {
        aClass60_4636 = null;
        if (i != -19960) method180(-71);
    }

    static final void method181(boolean bool, Npc npc) {
        if (bool != true) method180(54);
        anInt4627++;
        for (SceneNode class348_sub9 = (SceneNode) client.aClass262_5185.first(4); class348_sub9 != null; class348_sub9 = ((SceneNode) client.aClass262_5185.next((byte) 78))) {
            if ((class348_sub9.aNpc_6691) == npc) {
                if (class348_sub9.aClass348_Sub16_Sub5_6676 != null) {
                    PlayerState.aClass348_Sub16_Sub4_7065.method2880(class348_sub9.aClass348_Sub16_Sub5_6676);
                    class348_sub9.aClass348_Sub16_Sub5_6676 = null;
                }
                class348_sub9.unlink((byte) 27);
                break;
            }
        }
    }

    abstract void method182(int i, int i_6_, int i_7_, boolean bool);

    final int method183(int i) {
        anInt4633++;
        if (i <= 16) this.aClass369_4635 = null;
        int i_8_ = ObjectDefinition.aClass311_897.method2320((byte) 106);
        int i_9_ = 100 * i_8_;
        if (anInt4630 != i_8_ || i_8_ == 0) {
            anInt4630 = i_8_;
            aLong4640 = Component240.currentTimeMillis(-125);
        } else {
            int i_10_ = ObjectDefinition.aClass311_897.method2315((byte) 121);
            if (i_8_ < i_10_) {
                long l = aLong4640 - ObjectDefinition.aClass311_897.method2323(0);
                if (l > 0L) {
                    long l_11_ = (long) (i_10_ - i_8_) * (10000L * l / (long) i_8_);
                    long l_12_ = (-aLong4640 + Component240.currentTimeMillis(-89)) * 10000L;
                    if (l_11_ > l_12_) i_9_ = (int) ((long) (i_8_ * 100) + ((long) (i_10_ + -i_8_) * (l_12_ * 100L) / l_11_));
                    else i_9_ = i_10_ * 100;
                }
            }
        }
        return i_9_;
    }

    public final void method9(byte i, boolean bool) {
        if (i == -49) {
            anInt4634++;
            int i_13_ = ((this.aClass369_4635.aClass221_4968.method1607(DisplayModeManagerContainer23.canvasWidth, this.aClass369_4635.anInt4971, (byte) -123)) + this.aClass369_4635.anInt4970);
            int i_14_ = ((this.aClass369_4635.aClass341_4973.getAlignedOffset(GlToolkitSub2.canvasHeight, this.aClass369_4635.anInt4963, i ^ ~0x60b)) + this.aClass369_4635.anInt4959);
            method178(i_13_, bool, (byte) -84, i_14_);
            method182(63, i_14_, i_13_, bool);
            String string = ObjectDefinition.aClass311_897.method2318(i ^ 0x245b);
            if (-aLong4640 + Component240.currentTimeMillis(-100) > 10000L) string += " (" + ObjectDefinition.aClass311_897.method2324(i + 149).getStageId(-117) + ")";
            aClass324_4637.drawTextCentred((byte) 115, (i_13_ + this.aClass369_4635.anInt4971 / 2), this.aClass369_4635.anInt4961, string, -1, (this.aClass369_4635.anInt4966 + 4 + (i_14_ - -(this.aClass369_4635.anInt4963 / 2))));
        }
    }

    Component298(CacheStore class45, CacheStore class45_15_, Component27 class369) {
        try {
            aClass45_4631 = class45_15_;
            this.aClass45_4632 = class45;
            this.aClass369_4635 = class369;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("gl.<init>(" + (class45 != null ? "{...}" : "null") + ',' + (class45_15_ != null ? "{...}" : "null") + ',' + (class369 != null ? "{...}" : "null") + ')'));
        }
    }
}
