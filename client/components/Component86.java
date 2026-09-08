/* Component86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component86
/**
 * RENAMED from `Class372` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    private final GlToolkitSub3 aHa_Sub3_4526;
    static int anInt4527;
    private final d modelProvider;
    static int anInt4529;
    static int anInt4530;
    private final NodeCache aClass60_4531 = new NodeCache(256);
    static int anInt4532 = 1407;

    final void method3585(int i) {
        anInt4530++;
        if (i == 7271) aClass60_4531.clear(0);
    }

    final void method3586(int i) {
        aClass60_4531.processSoftEntries(2, 5);
        if (i != -16130) method3586(-94);
        anInt4527++;
    }

    final Interface18_Impl3 method3587(byte i, int i_0_) {
        anInt4529++;
        Object object = aClass60_4531.get(i_0_, 107);
        if (object != null) return (Interface18_Impl3) object;
        if (!modelProvider.isModelLoaded(-7953, i_0_)) return null;
        if (i > -30) anInt4532 = 37;
        Model class12 = modelProvider.getModel(i_0_, -6662);
        int i_1_ = (!class12.aBoolean199 ? aHa_Sub3_4526.anInt8150 : 64);
        Interface18_Impl3 interface18_impl3;
        if (class12.aBoolean218 && aHa_Sub3_4526.method3666()) {
            float[] fs = modelProvider.getVertices(i_1_, 0.7F, false, -30824, i_1_, i_0_);
            interface18_impl3 = aHa_Sub3_4526.uniform2i(fs, i_1_, i_1_, Component83.aClass304_1662, -109, class12.aByte205 != 0);
        } else {
            int[] is;
            if (class12.anInt200 == 2 || !Component111.isOrthogonalWallType((byte) 4, class12.aByte213)) is = modelProvider.getIndices(-21540, i_1_, 0.7F, i_0_, false, i_1_);
            else is = modelProvider.getTriangles(true, i_0_, 0.7F, i_1_, i_1_, 83);
            interface18_impl3 = aHa_Sub3_4526.deleteRenderbuffer(i_1_, i_1_, -15137, class12.aByte205 != 0, is);
        }
        interface18_impl3.method66(class12.aBoolean217, class12.aBoolean215, 25688);
        aClass60_4531.putOne(interface18_impl3, i_0_, (byte) -107);
        return interface18_impl3;
    }

    Component86(GlToolkitSub3 var_ha_Sub3, d var_d) {
        try {
            aHa_Sub3_4526 = var_ha_Sub3;
            modelProvider = var_d;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("fw.<init>(" + (var_ha_Sub3 != null ? "{...}" : "null") + ',' + (var_d != null ? "{...}" : "null") + ')'));
        }
    }
}
