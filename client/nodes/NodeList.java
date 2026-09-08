/* NodeList - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class262` (JODE-obfuscated).
 * Doubly-linked list backed by a sentinel Node (sentinel = new Node()). Provides insert/remove (transferFrom/transferRange) and iteration (next). Also bundles unrelated static rendering helpers.
 */

import java.awt.*;

final class NodeList {
    static CacheStore aClass45_3323;
    static int anInt3324;
    static int anInt3325;
    static BitmapFont aClass324_3326;
    static int anInt3327;
    static int anInt3328;
    static int anInt3329;
    static int anInt3330;
    static Object anObject3331;
    static int anInt3332;
    static int anInt3333;
    Node sentinel = new Node();
    static DisplayModeManagerContainer56[][] aClass190ArrayArray3335;
    static int anInt3336;
    static int anInt3337;
    static int anInt3338;
    static int anInt3339;
    static int anInt3340;
    static int anInt3341;
    private Node cursor;

    final void transferFrom(NodeList class262_0_, byte i) {
        if (i != -115) first(-53);
        transferRange((this.sentinel.next), false, class262_0_);
        anInt3340++;
    }

    private final void transferRange(Node class348, boolean bool, NodeList class262_1_) {
        do {
            try {
                anInt3325++;
                Node class348_2_ = (this.sentinel.previous);
                this.sentinel.previous = class348.previous;
                class348.previous.next = this.sentinel;
                if (this.sentinel != class348) {
                    class348.previous = (class262_1_.sentinel.previous);
                    class348.previous.next = class348;
                    class262_1_.sentinel.previous = class348_2_;
                    class348_2_.next = class262_1_.sentinel;
                }
                if (bool == false) break;
                aClass45_3323 = null;
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("uh.K(" + (class348 != null ? "{...}" : "null") + ',' + bool + ',' + (class262_1_ != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final Node next(byte i) {
        anInt3329++;
        if (i < 29) cursor = null;
        Node class348 = cursor;
        if (this.sentinel == class348) {
            cursor = null;
            return null;
        }
        cursor = class348.next;
        return class348;
    }

    static final void method1991(float f, float f_3_, float[] fs, int i, int i_4_, boolean bool, int i_5_, int i_6_, int i_7_, int i_8_, float f_9_, float[] fs_10_, int i_11_, int i_12_) {
        do {
            try {
                anInt3338++;
                i_7_ -= i_6_;
                i -= i_4_;
                i_8_ -= i_11_;
                float f_13_ = fs[2] * (float) i + (fs[1] * (float) i_8_ + fs[0] * (float) i_7_);
                float f_14_ = ((float) i_7_ * fs[3] + (float) i_8_ * fs[4] + (float) i * fs[5]);
                float f_15_ = fs[8] * (float) i + (fs[6] * (float) i_7_ + (float) i_8_ * fs[7]);
                float f_16_;
                float f_17_;
                if (i_12_ == 0) {
                    f_16_ = 0.5F + (f_3_ + f_13_);
                    f_17_ = -f_15_ + f + 0.5F;
                } else if (i_12_ == 1) {
                    f_17_ = 0.5F + (f_15_ + f);
                    f_16_ = 0.5F + (f_3_ + f_13_);
                } else if (i_12_ == 2) {
                    f_16_ = 0.5F + (-f_13_ + f_3_);
                    f_17_ = -f_14_ + f_9_ + 0.5F;
                } else if (i_12_ == 3) {
                    f_17_ = -f_14_ + f_9_ + 0.5F;
                    f_16_ = f_13_ + f_3_ + 0.5F;
                } else if (i_12_ == 4) {
                    f_16_ = f_15_ + f + 0.5F;
                    f_17_ = -f_14_ + f_9_ + 0.5F;
                } else {
                    f_16_ = 0.5F + (f + -f_15_);
                    f_17_ = -f_14_ + f_9_ + 0.5F;
                }
                if (i_5_ == 1) {
                    float f_18_ = f_16_;
                    f_16_ = -f_17_;
                    f_17_ = f_18_;
                } else if (i_5_ == 2) {
                    f_17_ = -f_17_;
                    f_16_ = -f_16_;
                } else if (i_5_ == 3) {
                    float f_19_ = f_16_;
                    f_16_ = f_17_;
                    f_17_ = -f_19_;
                }
                fs_10_[1] = f_17_;
                fs_10_[0] = f_16_;
                if (bool == false) break;
                method1991(0.31271333F, 1.5829445F, null, -17, 88, true, -70, -107, 8, 5, -0.347415F, null, -24, -19);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("uh.B(" + f + ',' + f_3_ + ',' + (fs != null ? "{...}" : "null") + ',' + i + ',' + i_4_ + ',' + bool + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + f_9_ + ',' + (fs_10_ != null ? "{...}" : "null") + ',' + i_11_ + ',' + i_12_ + ')'));
            }
            break;
        } while (false);
    }

    static final void method1992(RenderableObject class318_sub1, int i, int i_20_, int i_21_) {
        if (i_20_ < StaticElementRenderer.anInt6451) {
            Component186 class357 = Component335.aClass357ArrayArrayArray2029[i][i_20_ + 1][i_21_];
            if (class357 != null && class357.aClass318_Sub1_Sub1_4402 != null && class357.aClass318_Sub1_Sub1_4402.method2388(-107)) class318_sub1.method2380(JaclibLoader.toolkit, 0, true, (class357.aClass318_Sub1_Sub1_4402), 0, (byte) -116, Component148.anInt3465);
        }
        if (i_21_ < StaticElementRenderer.anInt6451) {
            Component186 class357 = Component335.aClass357ArrayArrayArray2029[i][i_20_][i_21_ + 1];
            if (class357 != null && class357.aClass318_Sub1_Sub1_4402 != null && class357.aClass318_Sub1_Sub1_4402.method2388(-92)) class318_sub1.method2380(JaclibLoader.toolkit, 0, true, (class357.aClass318_Sub1_Sub1_4402), Component148.anInt3465, (byte) -128, 0);
        }
        if (i_20_ < StaticElementRenderer.anInt6451 && i_21_ < NodeSub41.anInt7054) {
            Component186 class357 = (Component335.aClass357ArrayArrayArray2029[i][i_20_ + 1][i_21_ + 1]);
            if (class357 != null && class357.aClass318_Sub1_Sub1_4402 != null && class357.aClass318_Sub1_Sub1_4402.method2388(-107)) class318_sub1.method2380(JaclibLoader.toolkit, 0, true, (class357.aClass318_Sub1_Sub1_4402), Component148.anInt3465, (byte) -117, Component148.anInt3465);
        }
        if (i_20_ < StaticElementRenderer.anInt6451 && i_21_ > 0) {
            Component186 class357 = (Component335.aClass357ArrayArrayArray2029[i][i_20_ + 1][i_21_ - 1]);
            if (class357 != null && class357.aClass318_Sub1_Sub1_4402 != null && class357.aClass318_Sub1_Sub1_4402.method2388(-90)) class318_sub1.method2380(JaclibLoader.toolkit, 0, true, (class357.aClass318_Sub1_Sub1_4402), -Component148.anInt3465, (byte) -116, Component148.anInt3465);
        }
    }

    final Node last(int i) {
        anInt3336++;
        Node class348 = this.sentinel.previous;
        if (this.sentinel == class348) {
            cursor = null;
            return null;
        }
        cursor = class348.previous;
        if (i > -65) last(67);
        return class348;
    }

    public static void method1994(int i) {
        aClass190ArrayArray3335 = null;
        anObject3331 = null;
        if (i != -13722) method2000(-104, 106, null, null);
        aClass45_3323 = null;
        aClass324_3326 = null;
    }

    final Node first(int i) {
        if (i != 4) addHead(null, -30);
        anInt3332++;
        Node class348 = this.sentinel.next;
        if (class348 == this.sentinel) {
            cursor = null;
            return null;
        }
        cursor = class348.next;
        return class348;
    }

    final void clear(int i) {
        if (i > 97) {
            anInt3339++;
            for (; ; ) {
                Node class348 = (this.sentinel.next);
                if (this.sentinel == class348) break;
                class348.unlink((byte) 24);
            }
            cursor = null;
        }
    }

    final Node peekFirst(int i) {
        anInt3341++;
        if (i != 8) aClass190ArrayArray3335 = null;
        Node class348 = this.sentinel.next;
        if (this.sentinel == class348) return null;
        class348.unlink((byte) 114);
        return class348;
    }

    final int size(int i) {
        anInt3333++;
        int i_22_ = i;
        Node class348 = this.sentinel.next;
        while (class348 != this.sentinel) {
            class348 = class348.next;
            i_22_++;
        }
        return i_22_;
    }

    final void addTail(Node class348, int i) {
        if (class348.previous != null) class348.unlink((byte) 91);
        anInt3328++;
        class348.next = this.sentinel;
        class348.previous = this.sentinel.previous;
        class348.previous.next = class348;
        if (i != -20180) addHead(null, -94);
        class348.next.previous = class348;
    }

    static final GraphicsToolkit method2000(int i, int i_23_, Canvas canvas, d var_d) {
        try {
            anInt3324++;
            if (i != 3) method1992(null, -40, 69, -1);
            return new GlToolkitSub2(canvas, var_d, i_23_);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("uh.D(" + i + ',' + i_23_ + ',' + (canvas != null ? "{...}" : "null") + ',' + (var_d != null ? "{...}" : "null") + ')'));
        }
    }

    /** Insert {@code class348} at the head (after sentinel); used for LRU touch. */
    final void addHead(Node class348, int i) {
        anInt3330++;
        if (class348.previous != null) class348.unlink((byte) 63);
        class348.previous = this.sentinel;
        class348.next = this.sentinel.next;
        if (i > -89) aClass324_3326 = null;
        class348.previous.next = class348;
        class348.next.previous = class348;
    }

    /** @return true when the list has no elements. */
    final boolean isEmpty(byte i) {
        if (i != 18) aClass190ArrayArray3335 = null;
        anInt3327++;
        return this.sentinel == this.sentinel.next;
    }

    /** Walk the list backwards from {@link #cursor}. */
    final Node previous(int i) {
        anInt3337++;
        Node class348 = cursor;
        if (class348 == this.sentinel) {
            cursor = null;
            return null;
        }
        int i_24_ = -111 / ((i - -88) / 38);
        cursor = class348.previous;
        return class348;
    }

    public NodeList() {
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }
}
