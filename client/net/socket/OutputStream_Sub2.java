/* OutputStream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.io.OutputStream;

final class OutputStream_Sub2 extends OutputStream {
    static int anInt101;
    static int anInt102;
    static int anInt103;
    static int anInt104;
    static int anInt105;
    static Component24 aClass105_106;
    static int anInt107;
    static long aLong108 = (long) (Math.random() * 9.999999999E9);

    static final byte[] method135(byte i, byte[] is, int i_0_) {
        anInt103++;
        if (i < 101) method139(34);
        byte[] is_1_ = new byte[i_0_];
        Component313.arraycopy(is, 0, is_1_, 0, i_0_);
        return is_1_;
    }

    static final RenderableSub4 method136(int i, boolean bool, boolean bool_2_) {
        anInt105++;
        synchronized (Renderable.aClass243Array3974) {
            RenderableSub4 class318_sub4;
            if (Renderable.aClass243Array3974.length > i && !Renderable.aClass243Array3974[i].method1871((byte) 111)) {
                class318_sub4 = (RenderableSub4) Renderable.aClass243Array3974[i].method1870(-104);
                class318_sub4.unlink(false);
                Component374.anIntArray4128[i]--;
            } else {
                class318_sub4 = new RenderableSub4();
                class318_sub4.aClass318_Sub3Array6414 = new RenderableSub3[i];
                for (int i_3_ = 0; i > i_3_; i_3_++)
                    class318_sub4.aClass318_Sub3Array6414[i_3_] = new RenderableSub3();
            }
            class318_sub4.aBoolean6409 = bool;
            if (bool_2_ != false) aLong108 = 43L;
            return class318_sub4;
        }
    }

    static final boolean method137(int i, int i_4_, int i_5_) {
        anInt102++;
        int i_6_ = -114 / ((i_4_ - 36) / 55);
        return (0x70000 & i_5_) != 0 | DefinitionSub9.method3073(i, i_5_, (byte) 50) || Component235.method2015(i_5_, i, 7);
    }

    static final int method138(MenuEntry class348_sub42_sub12, boolean bool) {
        anInt107++;
        String string = Component192.formatMenuEntry((byte) -126, class348_sub42_sub12);
        int[] is = null;
        if (!Component3.method1197(-12081, (class348_sub42_sub12.opcode))) {
            if (class348_sub42_sub12.itemId == -1) {
                if (WaterShaderSub8.method3549(class348_sub42_sub12.opcode, (byte) -44)) {
                    NpcNode class348_sub22 = ((NpcNode) (Component21.aClass356_3654.get((int) class348_sub42_sub12.identifier, -6008)));
                    if (class348_sub22 != null) {
                        Npc npc = (class348_sub22.npc);
                        NpcComposition class79 = (npc.definition);
                        if (class79.anIntArray1377 != null) class79 = class79.method794((DisplayModeManagerContainer58.aClass170_10209), -1);
                        if (class79 != null) is = class79.anIntArray1342;
                    }
                } else if (Component71.method1813(8806, (class348_sub42_sub12.opcode))) {
                    Object object = null;
                    ObjectDefinition class51;
                    if ((class348_sub42_sub12.opcode) == 1001) class51 = (GradientPreset.aClass263_9195.getObjectDefinition(0, (int) (class348_sub42_sub12.identifier)));
                    else class51 = (GradientPreset.aClass263_9195.getObjectDefinition(0, (int) (0x7fffffffL & (class348_sub42_sub12.identifier) >>> 32)));
                    if (class51.anIntArray945 != null) class51 = class51.getTransformedDefinition((DisplayModeManagerContainer58.aClass170_10209), (byte) 47);
                    if (class51 != null) is = class51.anIntArray917;
                }
            } else is = (Exception_Sub1.itemDefinitions.getItemDefinition(-76, class348_sub42_sub12.itemId).anIntArray2772);
        } else is = (Exception_Sub1.itemDefinitions.getItemDefinition(-115, (int) class348_sub42_sub12.identifier).anIntArray2772);
        if (is != null) string += ImageTagText.method1273(is, true);
        int i = Component27.aClass143_4962.method1186(string, DisplayModeManagerContainer196.aClass105Array4234, bool);
        if (class348_sub42_sub12.aBoolean9597) i += ColoredText.aClass105_6097.method971() + 4;
        return i;
    }

    public final void write(int i) throws IOException {
        anInt104++;
        throw new IOException();
    }

    public static void method139(int i) {
        if (i > 53) aClass105_106 = null;
    }

    static {
        anInt101 = -1;
    }
}
