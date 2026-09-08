/* Component231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Component231
/**
 * RENAMED from `Class22` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt328;
    static int anInt329;
    static Component183 aClass114_330 = new Component183(65, -1);
    int anInt331 = -1;
    int anInt332;
    static int anInt333;
    boolean aBoolean334;
    int anInt335;
    int anInt336 = 512;
    private int anInt337 = 0;
    static int anInt338;
    /** Mix / output sample rate in Hz (e.g. 22050). */
    static int sampleRate;
    static int anInt340;
    int anInt341;
    boolean aBoolean342;
    int anInt343;

    final void method290(Buffer class348_sub49, int i) {
        if (i != -1) this.anInt332 = 25;
        for (; ; ) {
            int i_0_ = class348_sub49.readUnsignedByte(255);
            if (i_0_ == 0) break;
            method291(i_0_, -4, class348_sub49);
        }
        anInt329++;
    }

    private final void method291(int i, int i_1_, Buffer class348_sub49) {
        if (i == 1) {
            anInt337 = class348_sub49.readMedium(-1);
            method292(anInt337, (byte) 117);
        } else if (i == 2) {
            this.anInt331 = class348_sub49.readUnsignedShort(i_1_ + 842397948);
            if (this.anInt331 == 65535) this.anInt331 = -1;
        } else if (i != 3) {
            if (i != 4) {
                if (i == 5) this.aBoolean334 = false;
            } else this.aBoolean342 = false;
        } else this.anInt336 = class348_sub49.readUnsignedShort(842397944) << 2;
        if (i_1_ != -4) method290(null, 12);
        anInt333++;
    }

    private final void method292(int i, byte i_2_) {
        anInt340++;
        double d = (double) (0xff & i >> 16) / 256.0;
        double d_3_ = (double) ((0xff2b & i) >> 8) / 256.0;
        double d_4_ = (double) (0xff & i) / 256.0;
        double d_5_ = d;
        if (d_3_ < d_5_) d_5_ = d_3_;
        if (d_4_ < d_5_) d_5_ = d_4_;
        double d_6_ = d;
        if (d_3_ > d_6_) d_6_ = d_3_;
        if (d_4_ > d_6_) d_6_ = d_4_;
        double d_7_ = 0.0;
        double d_8_ = 0.0;
        double d_9_ = (d_5_ + d_6_) / 2.0;
        if (d_6_ != d_5_) {
            if (d_9_ < 0.5) d_8_ = (d_6_ - d_5_) / (d_5_ + d_6_);
            if (d != d_6_) {
                if (d_6_ != d_3_) {
                    if (d_6_ == d_4_) d_7_ = (d - d_3_) / (-d_5_ + d_6_) + 4.0;
                } else d_7_ = (-d + d_4_) / (d_6_ - d_5_) + 2.0;
            } else d_7_ = (-d_4_ + d_3_) / (d_6_ - d_5_);
            if (d_9_ >= 0.5) d_8_ = (d_6_ - d_5_) / (-d_5_ + (2.0 - d_6_));
        }
        this.anInt332 = (int) (256.0 * d_8_);
        d_7_ /= 6.0;
        this.anInt335 = (int) (256.0 * d_9_);
        if (this.anInt332 >= 0) {
            if (this.anInt332 > 255) this.anInt332 = 255;
        } else this.anInt332 = 0;
        if (d_9_ > 0.5) this.anInt343 = (int) (512.0 * ((1.0 - d_9_) * d_8_));
        else this.anInt343 = (int) (512.0 * (d_9_ * d_8_));
        if (this.anInt335 < 0) this.anInt335 = 0;
        else if (this.anInt335 > 255) this.anInt335 = 255;
        if (this.anInt343 < 1) this.anInt343 = 1;
        int i_10_ = 39 % ((i_2_ - 61) / 55);
        this.anInt341 = (int) (d_7_ * (double) this.anInt343);
    }

    public static void method293(byte i) {
        aClass114_330 = null;
        if (i >= -40) method295(-6, -74, -119, null, -35, null, 125, 67, -102);
    }

    static final void method294(GraphicsToolkit var_ha, int i) {
        anInt328++;
        if (Component305.aClass262_9931.size(i) != 0) {
            if (Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350) == 0) {
                for (NodeSub7 class348_sub7 = ((NodeSub7) Component305.aClass262_9931.first(4)); class348_sub7 != null; class348_sub7 = (NodeSub7) Component305.aClass262_9931.next((byte) 31)) {
                    Exception_Sub1.itemDefinitions.method1932(var_ha, class348_sub7.anInt6647, class348_sub7.anInt6648, Component49.aClass324_4684, (!class348_sub7.aBoolean6650 ? null : (Component72.localPlayer.appearance)), class348_sub7.anInt6642, false, (byte) 83, var_ha, class348_sub7.anInt6649, false, class348_sub7.anInt6645);
                    class348_sub7.unlink((byte) 29);
                }
                Component160.method3466(i + -113);
            } else {
                if (NodeSub34.aHa6968 == null) {
                    Canvas canvas = new Canvas();
                    canvas.setSize(36, 32);
                    NodeSub34.aHa6968 = Component65.method958(true, 0, DefinitionSub4.modelProvider, 0, canvas, Component257.aClass45_4796);
                    DefinitionSub9.aClass324_9173 = (NodeSub34.aHa6968.method3686(Component388.method1819(LoadingState.p11FullGroupId, 0, -44, Component65.aClass45_1627), Component170.method1519(Component158.aClass45_322, LoadingState.p11FullGroupId, 0), true));
                }
                for (NodeSub7 class348_sub7 = ((NodeSub7) Component305.aClass262_9931.first(i + 4)); class348_sub7 != null; class348_sub7 = (NodeSub7) Component305.aClass262_9931.next((byte) 118)) {
                    Exception_Sub1.itemDefinitions.method1932(NodeSub34.aHa6968, class348_sub7.anInt6647, class348_sub7.anInt6648, DefinitionSub9.aClass324_9173, (class348_sub7.aBoolean6650 ? (Component72.localPlayer.appearance) : null), class348_sub7.anInt6642, false, (byte) 83, var_ha, class348_sub7.anInt6649, false, class348_sub7.anInt6645);
                    class348_sub7.unlink((byte) 21);
                }
            }
        }
    }

    static final void method295(int i, int i_11_, int i_12_, byte[] is, int i_13_, byte[] is_14_, int i_15_, int i_16_, int i_17_) {
        try {
            anInt338++;
            int i_18_ = -(i_13_ >> 2);
            i_13_ = -(0x3 & i_13_);
            if (i_12_ != 256) sampleRate = -63;
            for (int i_19_ = -i_15_; i_19_ < 0; i_19_++) {
                for (int i_20_ = i_18_; i_20_ < 0; i_20_++) {
                    is_14_[i_16_++] += is[i_11_++];
                    is_14_[i_16_++] += is[i_11_++];
                    is_14_[i_16_++] += is[i_11_++];
                    is_14_[i_16_++] += is[i_11_++];
                }
                for (int i_21_ = i_13_; i_21_ < 0; i_21_++)
                    is_14_[i_16_++] += is[i_11_++];
                i_16_ += i_17_;
                i_11_ += i;
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("hk.E(" + i + ',' + i_11_ + ',' + i_12_ + ',' + (is != null ? "{...}" : "null") + ',' + i_13_ + ',' + (is_14_ != null ? "{...}" : "null") + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ')'));
        }
    }

    public Component231() {
        this.aBoolean334 = true;
        this.aBoolean342 = true;
    }
}
