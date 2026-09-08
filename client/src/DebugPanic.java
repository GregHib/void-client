/* DebugPanic - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class285` (JODE-obfuscated).
 * Debug panic/assertion helper. Emits 'ARGH!' when an unrecoverable internal error or failed assertion occurs; used as a last-resort trap across the client.
 */

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;

abstract class DebugPanic implements Interface5 {
    static int anInt4735;
    private int anInt4736 = 0;
    static int anInt4737;
    static int anInt4738;
    private int anInt4739;
    static int anInt4740;
    static boolean aBoolean4741 = false;
    static int anInt4742;
    static BrowserUrlOpener aClass348_Sub16_Sub3_4743;
    /** Friend world activity / host strings when online. */
    static String[] friendWorldNames = new String[200];
    static int anInt4745;
    private int anInt4746 = -1;
    private int anInt4747;
    private NativeHeapBuffer aNativeHeapBuffer4748;
    static int anInt4749;
    private final boolean aBoolean4750;
    static int anInt4751;
    static int anInt4752;
    static int anInt4753 = 0;
        /** World-map Helvetica glyph cache at 22pt. */
    static FontGlyphCache helveticaGlyphs22;
    private final int anInt4755;
    static int anInt4756;
    static int anInt4757;
    static int anInt4758;
    GlExtensionManager aClass377_4759;

    static final float method2119(float f, int i, float f_0_, int i_1_, float f_2_) {
        anInt4738++;
        if (i_1_ >= -59) method2119(1.299765F, 45, -0.43444797F, -35, 0.059617087F);
        float[] fs = Component244.aFloatArrayArray4174[i];
        return fs[1] * f + f_2_ * fs[0] + fs[2] * f_0_;
    }

    final Buffer method2120(int i, MapBuffer mapbuffer, boolean bool) {
        anInt4756++;
        if (i != 0) this.aClass377_4759 = null;
        if (anInt4736 == 0) {
            method2126((byte) -36);
            if (anInt4746 <= 0) {
                anInt4736 = 2;
                return aNativeHeapBuffer4748;
            }
            OpenGL.glBindBufferARB(anInt4755, anInt4746);
            if (bool) {
                OpenGL.glBufferDataARBub(anInt4755, anInt4739, null, 0, aBoolean4750 ? 35040 : 35044);
                if (anInt4747 <= (this.aClass377_4759.aNativeHeapBuffer7974.b)) {
                    anInt4736 = 1;
                    return (this.aClass377_4759.aNativeHeapBuffer7974);
                }
            }
            if (!mapbuffer.a() && mapbuffer.a(anInt4755, anInt4747, 35001)) {
                anInt4736 = 2;
                return mapbuffer;
            }
        }
        return null;
    }

    final boolean method2121(int i, Source source, int i_3_) {
        anInt4745++;
        if (i != 25625) method2126((byte) -74);
        if (i_3_ > anInt4739) {
            method2126((byte) -36);
            if (anInt4746 <= 0) throw new RuntimeException("ARGH!");
            OpenGL.glBindBufferARB(anInt4755, anInt4746);
            OpenGL.glBufferDataARBa(anInt4755, i_3_, source.getAddress(), !aBoolean4750 ? 35044 : 35040);
            this.aClass377_4759.anInt8063 += i_3_ - anInt4747;
            anInt4739 = i_3_;
        } else if (anInt4746 > 0) {
            OpenGL.glBindBufferARB(anInt4755, anInt4746);
            OpenGL.glBufferSubDataARBa(anInt4755, 0, anInt4747, source.getAddress());
            this.aClass377_4759.anInt8063 += i_3_ - anInt4747;
        } else throw new RuntimeException("ARGH!");
        anInt4747 = i_3_;
        return true;
    }

    void method21(int i) {
        if (i != 23315) helveticaGlyphs22 = null;
        anInt4749++;
        if (anInt4746 > 0) {
            this.aClass377_4759.method3969(anInt4747, anInt4746, 3089);
            anInt4746 = -1;
        }
    }

    final long method2122(int i) {
        anInt4758++;
        if (i != 27819) return 59L;
        if (anInt4746 == 0) return aNativeHeapBuffer4748.getAddress();
        return 0L;
    }

    final boolean method2123(MapBuffer mapbuffer, int i) {
        anInt4735++;
        boolean bool = true;
        if (i != anInt4736) {
            if (anInt4746 > 0) {
                OpenGL.glBindBufferARB(anInt4755, anInt4746);
                if (anInt4736 != 1) bool = mapbuffer.b();
                else OpenGL.glBufferSubDataARBa(anInt4755, 0, anInt4739, this.aClass377_4759.aNativeHeapBuffer7974.getAddress());
            }
            anInt4736 = 0;
        }
        return bool;
    }

    public static void method2124(int i) {
        aClass348_Sub16_Sub3_4743 = null;
        helveticaGlyphs22 = null;
        friendWorldNames = null;
        if (i != 0) method2119(-1.1717526F, -45, -2.0738192F, 18, -0.4863547F);
    }

    void method23(int i, int i_4_) {
        anInt4752++;
        if (i_4_ > anInt4739) {
            method2126((byte) -36);
            if (anInt4746 <= 0) aNativeHeapBuffer4748 = this.aClass377_4759.invalidateSubFramebuffer((byte) 47, false, i_4_);
            else {
                OpenGL.glBindBufferARB(anInt4755, anInt4746);
                OpenGL.glBufferDataARBub(anInt4755, i_4_, null, 0, !aBoolean4750 ? 35044 : 35040);
                this.aClass377_4759.anInt8063 += i_4_ - anInt4739;
            }
            anInt4739 = i_4_;
        }
        anInt4747 = i_4_;
        if (i != 15959) friendWorldNames = null;
    }

    final void method2125(int i) {
        anInt4742++;
        if (i == 0) {
            if (this.aClass377_4759.aBoolean9920) OpenGL.glBindBufferARB(anInt4755, anInt4746);
        }
    }

    public int method16(boolean bool) {
        anInt4740++;
        if (bool != false) method2122(127);
        return anInt4747;
    }

    protected final void finalize() throws Throwable {
        anInt4751++;
        method21(23315);
        super.finalize();
    }

    private final void method2126(byte i) {
        anInt4757++;
        if (i != -36) anInt4736 = -3;
        if (anInt4746 < 0) {
            if (this.aClass377_4759.aBoolean9920) {
                OpenGL.glGenBuffersARB(1, Component92.anIntArray3311, 0);
                anInt4746 = Component92.anIntArray3311[0];
                OpenGL.glBindBufferARB(anInt4755, anInt4746);
            } else anInt4746 = 0;
        }
    }

    DebugPanic(GlExtensionManager class377, int i, boolean bool) {
        this.aClass377_4759 = class377;
        anInt4755 = i;
        aBoolean4750 = bool;
    }
}
