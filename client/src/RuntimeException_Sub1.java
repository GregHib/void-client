/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class RuntimeException_Sub1 extends RuntimeException {
    /** Detail message attached when wrapping a throwable for the error reporter. */
    String detail;
    /** Original cause retained alongside {@link #detail}. */
    Throwable cause;
    static int anInt4596;
    static int anInt4597;
    static int anInt4598;
    static boolean aBoolean4599;
    static int anInt4600 = 52;
    static StringCache aClass351_4601;
    static float[] aFloatArray4602;
    static int[] anIntArray4603;
    static boolean aBoolean4604;
    static int anInt4605;

    static final ShaderSub1 method4009(int i, int[] is, int[] is_0_, int i_1_, GlToolkitSub2 var_ha_Sub2, int i_2_) {
        try {
            anInt4597++;
            byte[] is_3_ = new byte[i * i_2_];
            for (int i_4_ = i_1_; i_4_ < i_2_; i_4_++) {
                int i_5_ = i * i_4_ - -is[i_4_];
                for (int i_6_ = 0; i_6_ < is_0_[i_4_]; i_6_++)
                    is_3_[i_5_++] = (byte) -1;
            }
            return new ShaderSub1(var_ha_Sub2, i, i_2_, is_3_);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("kg.C(" + i + ',' + (is != null ? "{...}" : "null") + ',' + (is_0_ != null ? "{...}" : "null") + ',' + i_1_ + ',' + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i_2_ + ')'));
        }
    }

    public static void clearStatics(int i) {
        if (i == -3) {
            anIntArray4603 = null;
            aFloatArray4602 = null;
            aClass351_4601 = null;
        }
    }

    RuntimeException_Sub1(Throwable throwable, String string) {
        this.detail = string;
        this.cause = throwable;
    }

    static final void method4011(int i, CacheStore class45) {
        anInt4598++;
        if (i != 1024) method4012(null, (byte) 68);
        client.anInt5171 = 0;
        NodeSub1Sub1.anInt8808 = 0;
        InflaterDecompressor.aClass243_2077 = new Component315();
        Component256.aClass318_Sub9_Sub2_Sub1Array6103 = new RenderableSub9Sub2Sub1[1024];
        NodeSub51.aClass318_Sub10Array7249 = new RenderableSub10[(ReferenceHolder.anIntArray9558[NodederUtil.anInt6637]) + 1];
        GlTexture.anInt8550 = 0;
        Component239.anInt4559 = 0;
        Component208.setEnumCacheStore(class45, (byte) -107);
        Component245.method172(30284, class45);
    }

    static final void method4012(byte[] is, byte i) {
        anInt4605++;
        Buffer class348_sub49 = new Buffer(is);
        int i_7_ = -91 % ((i - -51) / 42);
        boolean bool = false;
        for (; ; ) {
            int i_8_ = class348_sub49.readUnsignedByte(255);
            if (i_8_ == 0) break;
            if (i_8_ == 1) {
                if (Component151.anIntArray1786 == null) {
                    Component151.anIntArray1786 = new int[4];
                    Component72.anInt1905 = 4;
                    KeyStoreLoader.anIntArray1636 = new int[4];
                }
                for (int i_9_ = 0; i_9_ < Component151.anIntArray1786.length; i_9_++) {
                    Component151.anIntArray1786[i_9_] = class348_sub49.readShort(13638);
                    KeyStoreLoader.anIntArray1636[i_9_] = class348_sub49.readShort(13638);
                }
                bool = true;
            } else if (i_8_ != 2) {
                if (i_8_ == 3) {
                    Component72.anInt1905 = class348_sub49.readUnsignedByte(255);
                    Component151.anIntArray1786 = new int[Component72.anInt1905];
                    KeyStoreLoader.anIntArray1636 = new int[Component72.anInt1905];
                }
            } else Sprite.anInt6923 = class348_sub49.readUnsignedShort(842397944);
        }
        if (!bool) {
            if (Component151.anIntArray1786 == null) {
                Component151.anIntArray1786 = new int[4];
                KeyStoreLoader.anIntArray1636 = new int[4];
                Component72.anInt1905 = 4;
            }
            for (int i_10_ = 0; i_10_ < Component151.anIntArray1786.length; i_10_++) {
                Component151.anIntArray1786[i_10_] = 0;
                KeyStoreLoader.anIntArray1636[i_10_] = i_10_ * 20;
            }
        }
    }

    static {
        aBoolean4599 = true;
        anInt4596 = -1;
        aFloatArray4602 = new float[4];
        aBoolean4604 = false;
        aClass351_4601 = new StringCache(65, 3);
    }
}
