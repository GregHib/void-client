/* Component304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component304
/**
 * RENAMED from `Class65` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt1138;
    static int anInt1139;
    static int anInt1140;
    private final CacheStore aClass45_1141;
    static int anInt1142;
    static int anInt1143;
    static StringCache aClass351_1144;
    private final NodeCache aClass60_1145 = new NodeCache(256);
    static Component362[] aClass110_Sub1Array1146 = new Component362[0];
    static int anInt1147;
    static Component186[][][] aClass357ArrayArrayArray1148;

    final void method694(int i) {
        anInt1140++;
        if (i != -1007) method700(14, 98);
        synchronized (aClass60_1145) {
            aClass60_1145.purgeSoftReferences(i + 883);
        }
    }

    final void method695(boolean bool) {
        if (bool != true) aClass351_1144 = null;
        synchronized (aClass60_1145) {
            aClass60_1145.clear(0);
        }
        anInt1139++;
    }

    static final void method696(int i, int i_0_, int i_1_, int i_2_) {
        if (i_2_ == -1007) {
            if (i == 1009) ClientScriptExecutor.runScript(DisplayModeManagerContainer363.aClass273_4091, i_1_, i_0_);
            else if (i != 1012) {
                if (i == 1002) ClientScriptExecutor.runScript(DefinitionSub32.aClass273_9415, i_1_, i_0_);
                else if (i == 1003) ClientScriptExecutor.runScript(NodeSub12.aClass273_6743, i_1_, i_0_);
                else if (i == 1006) ClientScriptExecutor.runScript(Component66.aClass273_6018, i_1_, i_0_);
            } else ClientScriptExecutor.runScript(Component2.aClass273_8356, i_1_, i_0_);
            anInt1138++;
        }
    }

    final void method697(int i, int i_3_) {
        if (i_3_ == 26) {
            anInt1142++;
            synchronized (aClass60_1145) {
                aClass60_1145.processSoftEntries(i_3_ ^ 0x18, i);
            }
        }
    }

    public static void method698(int i) {
        aClass351_1144 = null;
        if (i != 2) aClass357ArrayArrayArray1148 = null;
        aClass357ArrayArrayArray1148 = null;
        aClass110_Sub1Array1146 = null;
    }

    static final void method699(CacheStore class45, byte i, CacheStore class45_4_, CacheStore class45_5_, CacheStore class45_6_) {
        try {
            DefinitionSub28.aClass45_9365 = class45_6_;
            anInt1147++;
            Component327.aClass45_8755 = class45_5_;
            Component267.aClass45_2978 = class45_4_;
            DefinitionSub33.openInterfaces = new DisplayModeManagerContainer57[Component267.aClass45_2978.getGroupCapacity(-1)][];
            ImageTagText.aBooleanArray2162 = new boolean[Component267.aClass45_2978.getGroupCapacity(-1)];
            int i_7_ = -72 % ((35 - i) / 41);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("kb.F(" + (class45 != null ? "{...}" : "null") + ',' + i + ',' + (class45_4_ != null ? "{...}" : "null") + ',' + (class45_5_ != null ? "{...}" : "null") + ',' + (class45_6_ != null ? "{...}" : "null") + ')'));
        }
    }

    final HashNodeSub1 method700(int i, int i_8_) {
        anInt1143++;
        int i_9_ = -128 / ((-3 - i_8_) / 49);
        HashNodeSub1 class348_sub42_sub1;
        synchronized (aClass60_1145) {
            class348_sub42_sub1 = (HashNodeSub1) aClass60_1145.get(i, -101);
        }
        if (class348_sub42_sub1 != null) return class348_sub42_sub1;
        byte[] is;
        synchronized (aClass45_1141) {
            is = aClass45_1141.getFile(-1860, 26, i);
        }
        class348_sub42_sub1 = new HashNodeSub1();
        if (is != null) class348_sub42_sub1.method3168(new Buffer(is), (byte) -101);
        synchronized (aClass60_1145) {
            aClass60_1145.putOne(class348_sub42_sub1, i, (byte) -114);
        }
        return class348_sub42_sub1;
    }

    Component304(GameType class230, int i, CacheStore class45) {
        try {
            aClass45_1141 = class45;
            aClass45_1141.getFileCount(0, 26);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("kb.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        aClass351_1144 = new StringCache(37, 2);
    }
}
