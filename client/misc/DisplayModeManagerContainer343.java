/* DisplayModeManagerContainer343 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class DisplayModeManagerContainer343
/**
 * RENAMED from `Class318_Sub1_Sub2` (JODE-obfuscated).
 * Evidence: subclass of RenderableObject (hierarchy)
 */ extends RenderableObject {
    static int anInt8729;
    static int anInt8730;
    static int anInt8731;
    static NodeCache aClass60_8732 = new NodeCache(64);
    static int anInt8733;
    static int anInt8734;
    static int anInt8735;
    static int anInt8736;
    static DisplayModeManagerContainer88 aClass70_8737 = new DisplayModeManagerContainer88();
    static int anInt8738;

    /**
     * Persists dirty client preferences/varps to the {@code "2"} game-preferences RAF
     * via {@link ReflectionInvoker#openGamePreferences}.
     */
    static final void saveClientPreferences(int i) {
        anInt8729++;
        RandomAccessFileReader class234 = null;
        try {
            class234 = ReflectionInvoker.openGamePreferences("2", -1141472112);
            Buffer class348_sub49 = new Buffer(3 + 6 * DisplayModeManagerContainer147.anInt4168);
            class348_sub49.writeByte(false, 1);
            class348_sub49.writeShort((byte) 107, DisplayModeManagerContainer147.anInt4168);
            int i_0_ = -4 % ((-12 - i) / 38);
            for (int i_1_ = 0; (i_1_ < DisplayModeManagerContainer123.anIntArray1303.length); i_1_++) {
                if (WaterShaderProgram.aBooleanArray6270[i_1_]) {
                    class348_sub49.writeShort((byte) 107, i_1_);
                    class348_sub49.writeInt((byte) 124, DisplayModeManagerContainer123.anIntArray1303[i_1_]);
                }
            }
            class234.write((byte) 117, 0, class348_sub49.offset, (class348_sub49.payload));
        } catch (Exception exception) {
            /* empty */
        }
        try {
            if (class234 != null) class234.close(false);
        } catch (Exception exception) {
            /* empty */
        }
        Component225.aLong482 = Component240.currentTimeMillis(-117);
        Component357.aBoolean2469 = false;
    }

    final boolean method2382(byte i) {
        if (i > -51) return false;
        anInt8733++;
        Component3 class148 = Component195.method1449(this.plane, (this.x >> Component149.anInt4459), (this.y >> Component149.anInt4459));
        if (class148 == null || !class148.aClass318_Sub1_Sub3_2040.aBoolean8741) return ShaderSub2.method164(this.plane, (this.x >> Component149.anInt4459), (byte) -97, (this.y >> Component149.anInt4459));
        return (Component15.method1110(this.y >> Component149.anInt4459, class148.aClass318_Sub1_Sub3_2040.method2394(true) + this.method2394(true), this.plane, (byte) -79, this.x >> Component149.anInt4459));
    }

    final boolean method2378(int i) {
        if (i != 0) method2406(79);
        anInt8734++;
        return (DisplayModeManagerContainer153.aBooleanArrayArray1572[(Component197.anInt10084 + -Component256.anInt6111 + (this.x >> Component149.anInt4459))][(Component197.anInt10084 + (-DebugPanicSub2.anInt8502 + (this.y >> Component149.anInt4459)))]);
    }

    final void method2392(boolean bool) {
        if (bool != true) anInt8731 = 119;
        anInt8730++;
        throw new IllegalStateException();
    }

    public static void method2406(int i) {
        if (i > -126) anInt8731 = 118;
        aClass60_8732 = null;
        aClass70_8737 = null;
    }

    final int method2384(NodeSub1[] class348_sub1s, int i) {
        anInt8735++;
        int i_2_ = -79 % ((-14 - i) / 61);
        return this.method2390(class348_sub1s, (this.x >> Component149.anInt4459), -2, (this.y >> Component149.anInt4459));
    }

    final boolean method2388(int i) {
        if (i > -65) anInt8731 = -84;
        anInt8738++;
        return false;
    }

    final void method2380(GraphicsToolkit var_ha, int i, boolean bool, RenderableObject class318_sub1, int i_3_, byte i_4_, int i_5_) {
        try {
            if (i_4_ > -106) saveClientPreferences(-8);
            anInt8736++;
            throw new IllegalStateException();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("fha.N(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class318_sub1 != null ? "{...}" : "null") + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
        }
    }

    DisplayModeManagerContainer343(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
        this.x = i;
        this.plane = (byte) i_8_;
        this.anInt6382 = i_6_;
        this.aByte6376 = (byte) i_9_;
        this.y = i_7_;
    }
}
