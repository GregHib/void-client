/* AudioLine - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class279` (JODE-obfuscated).
 * Abstract audio output line. {@link #open}/{@link #close}/{@link #flush}/{@link #process}
 * drive the mix pump; {@link #getBufferedSamples} reports queued PCM.
 * Subclasses: {@link SourceAudioLine}, AudioLineSub2.
 */

import java.awt.*;

class AudioLine {
    static int anInt3594;
    static int anInt3595;
    static int anInt3596;
    static int anInt3597;
    static int anInt3598;
    static int anInt3599;
    static int anInt3600;
    private final int anInt3601 = 32;
    private long aLong3602;
    int[] anIntArray3603;
    private NodeSub16 aClass348_Sub16_3604;
    static int anInt3605;
    static int anInt3606;
    static int anInt3607;
    static int anInt3608;
    static int anInt3609;
    private boolean aBoolean3610 = false;
    static int anInt3611;
    static int anInt3612;
    int anInt3613;
    private long aLong3614;
    private int anInt3615;
    private int anInt3616;
    private int anInt3617;
    private long aLong3618;
    private final NodeSub16[] aClass348_Sub16Array3619;
    int anInt3620;
    private final NodeSub16[] aClass348_Sub16Array3621;
    private int anInt3622;
    private boolean aBoolean3623;
    private int anInt3624;

    int getBufferedSamples() throws Exception {
        anInt3605++;
        return this.anInt3613;
    }

    void open(int i) throws Exception {
        anInt3607++;
    }

    void flush() throws Exception {
        anInt3606++;
    }

    final synchronized void process(int i) {
        anInt3595++;
        if (!aBoolean3610) {
            long l = Component240.currentTimeMillis(-107);
            try {
                if (l > aLong3602 + 6000L) aLong3602 = -6000L + l;
                if (i != -6858) anInt3616 = 114;
                for (/**/; aLong3602 + 5000L < l; l = Component240.currentTimeMillis(-96)) {
                    method2089(256, (byte) -99);
                    aLong3602 += 256000 / Component231.sampleRate;
                }
            } catch (Exception exception) {
                aLong3602 = l;
            }
            if (this.anIntArray3603 != null) {
                try {
                    if (aLong3614 != 0) {
                        if (aLong3614 > l) return;
                        open(this.anInt3613);
                        aBoolean3623 = true;
                        aLong3614 = 0L;
                    }
                    int i_0_ = getBufferedSamples();
                    if (-i_0_ + anInt3622 > anInt3624) anInt3624 = -i_0_ + anInt3622;
                    int i_1_ = this.anInt3620 - -anInt3616;
                    if (i_1_ - -256 > 16384) i_1_ = 16128;
                    if (256 + i_1_ > this.anInt3613) {
                        this.anInt3613 += 1024;
                        if (this.anInt3613 > 16384) this.anInt3613 = 16384;
                        close();
                        open(this.anInt3613);
                        i_0_ = 0;
                        aBoolean3623 = true;
                        if (256 + i_1_ > this.anInt3613) {
                            i_1_ = this.anInt3613 + -256;
                            anInt3616 = -this.anInt3620 + i_1_;
                        }
                    }
                    for (/**/; i_0_ < i_1_; i_0_ += 256) {
                        method2086(this.anIntArray3603, 256);
                        writeSamples();
                    }
                    if (l > aLong3618) {
                        if (!aBoolean3623) {
                            if (anInt3624 == 0 && anInt3617 == 0) {
                                close();
                                aLong3614 = 2000L + l;
                                return;
                            }
                            anInt3616 = Math.min(anInt3617, anInt3624);
                            anInt3617 = anInt3624;
                        } else aBoolean3623 = false;
                        aLong3618 = l - -2000L;
                        anInt3624 = 0;
                    }
                    anInt3622 = i_0_;
                } catch (Exception exception) {
                    close();
                    aLong3614 = 2000L + l;
                }
            }
        }
    }

    private final void method2085(int i, NodeSub16 class348_sub16, int i_2_) {
        anInt3597++;
        int i_3_ = i_2_ >> 5;
        if (i != -1846918107) method2088(true, null);
        NodeSub16 class348_sub16_4_ = aClass348_Sub16Array3621[i_3_];
        if (class348_sub16_4_ != null) class348_sub16_4_.aClass348_Sub16_6785 = class348_sub16;
        else aClass348_Sub16Array3619[i_3_] = class348_sub16;
        aClass348_Sub16Array3621[i_3_] = class348_sub16;
        class348_sub16.anInt6786 = i_2_;
    }

    private final void method2086(int[] is, int i) {
        int i_5_ = i;
        if (Component21.stereo) i_5_ <<= 1;
        Component313.method1573(is, 0, i_5_);
        anInt3615 -= i;
        if (aClass348_Sub16_3604 != null && anInt3615 <= 0) {
            anInt3615 += Component231.sampleRate >> 4;
            ColorTagNode.method2814(aClass348_Sub16_3604, 112);
            method2085(-1846918107, aClass348_Sub16_3604, aClass348_Sub16_3604.getVolume());
            int i_6_ = 0;
            int i_7_ = 255;
            int i_8_ = 7;
            while_88_:
            while (i_7_ != 0) {
                int i_9_;
                int i_10_;
                if (i_8_ < 0) {
                    i_9_ = i_8_ & 0x3;
                    i_10_ = -(i_8_ >> 2);
                } else {
                    i_9_ = i_8_;
                    i_10_ = 0;
                }
                for (int i_11_ = i_7_ >>> i_9_ & 0x11111111; i_11_ != 0; i_11_ >>>= 4) {
                    if ((i_11_ & 0x1) != 0) {
                        i_7_ &= ~(1 << i_9_);
                        NodeSub16 class348_sub16 = null;
                        NodeSub16 class348_sub16_12_ = aClass348_Sub16Array3619[i_9_];
                        while (class348_sub16_12_ != null) {
                            NodeSub19 class348_sub19 = (class348_sub16_12_.aClass348_Sub19_6787);
                            if (class348_sub19 != null && (class348_sub19.anInt6824 > i_10_)) {
                                i_7_ |= 1 << i_9_;
                                class348_sub16 = class348_sub16_12_;
                                class348_sub16_12_ = (class348_sub16_12_.aClass348_Sub16_6785);
                            } else {
                                class348_sub16_12_.aBoolean6784 = true;
                                int i_13_ = class348_sub16_12_.getDuration();
                                i_6_ += i_13_;
                                if (class348_sub19 != null) class348_sub19.anInt6824 += i_13_;
                                if (i_6_ >= anInt3601) break while_88_;
                                NodeSub16 class348_sub16_14_ = class348_sub16_12_.getNextNode();
                                if (class348_sub16_14_ != null) {
                                    int i_15_ = (class348_sub16_12_.anInt6786);
                                    for (/**/; class348_sub16_14_ != null; class348_sub16_14_ = class348_sub16_12_.getPreviousNode())
                                        method2085(-1846918107, class348_sub16_14_, (i_15_ * class348_sub16_14_.getVolume() >> 8));
                                }
                                NodeSub16 class348_sub16_16_ = (class348_sub16_12_.aClass348_Sub16_6785);
                                class348_sub16_12_.aClass348_Sub16_6785 = null;
                                if (class348_sub16 == null) aClass348_Sub16Array3619[i_9_] = class348_sub16_16_;
                                else class348_sub16.aClass348_Sub16_6785 = class348_sub16_16_;
                                if (class348_sub16_16_ == null) aClass348_Sub16Array3621[i_9_] = class348_sub16;
                                class348_sub16_12_ = class348_sub16_16_;
                            }
                        }
                    }
                    i_9_ += 4;
                    i_10_++;
                }
                i_8_--;
            }
            for (int i_17_ = 0; i_17_ < 8; i_17_++) {
                NodeSub16 class348_sub16 = aClass348_Sub16Array3619[i_17_];
                aClass348_Sub16Array3619[i_17_] = aClass348_Sub16Array3621[i_17_] = null;
                NodeSub16 class348_sub16_18_;
                for (/**/; class348_sub16 != null; class348_sub16 = class348_sub16_18_) {
                    class348_sub16_18_ = (class348_sub16.aClass348_Sub16_6785);
                    class348_sub16.aClass348_Sub16_6785 = null;
                }
            }
        }
        if (anInt3615 < 0) anInt3615 = 0;
        if (aClass348_Sub16_3604 != null) aClass348_Sub16_3604.synthesizeSamples(is, 0, i);
        aLong3602 = Component240.currentTimeMillis(-102);
    }

    final synchronized void method2087(int i) {
        aBoolean3623 = true;
        anInt3599++;
        try {
            if (i >= -110) aLong3602 = -66L;
            flush();
        } catch (Exception exception) {
            close();
            aLong3614 = 2000L + Component240.currentTimeMillis(-96);
        }
    }

    final synchronized void method2088(boolean bool, NodeSub16 class348_sub16) {
        if (bool != false) method2085(0, null, 69);
        aClass348_Sub16_3604 = class348_sub16;
        anInt3600++;
    }

    private final void method2089(int i, byte i_19_) {
        anInt3611++;
        anInt3615 -= i;
        if (anInt3615 < 0) anInt3615 = 0;
        if (aClass348_Sub16_3604 != null) aClass348_Sub16_3604.skip(i);
        if (i_19_ > -75) method2090(13, 6, true, (byte) 40, 67, -121, -107);
    }

    static final void method2090(int i, int i_20_, boolean bool, byte i_21_, int i_22_, int i_23_, int i_24_) {
        if ((bool ? Component192.preferences.aClass239_Sub26_7215.method1838(-32350) : Component192.preferences.aClass239_Sub26_7272.method1838(-32350)) != 0 && i != 0 && Component335.anInt2021 < 50 && i_24_ != -1)
            GlFramebufferTexture.aClass10Array8531[Component335.anInt2021++] = new RunescapeInfo(!bool ? (byte) 2 : (byte) 3, i_24_, i, i_23_, i_22_, 0, i_20_, null);
        if (i_21_ == -35) anInt3608++;
    }

    void close() {
        anInt3598++;
    }

    static final void method2092(int i, int i_25_, int[] is, int i_26_, Object[] objects) {
        try {
            int i_27_ = -92 / ((i_26_ - -55) / 57);
            if (i_25_ < i) {
                int i_28_ = (i + i_25_) / 2;
                int i_29_ = i_25_;
                int i_30_ = is[i_28_];
                is[i_28_] = is[i];
                is[i] = i_30_;
                Object object = objects[i_28_];
                objects[i_28_] = objects[i];
                objects[i] = object;
                int i_31_ = i_30_ != 2147483647 ? 1 : 0;
                for (int i_32_ = i_25_; i_32_ < i; i_32_++) {
                    if (is[i_32_] < (i_31_ & i_32_) + i_30_) {
                        int i_33_ = is[i_32_];
                        is[i_32_] = is[i_29_];
                        is[i_29_] = i_33_;
                        Object object_34_ = objects[i_32_];
                        objects[i_32_] = objects[i_29_];
                        objects[i_29_++] = object_34_;
                    }
                }
                is[i] = is[i_29_];
                is[i_29_] = i_30_;
                objects[i] = objects[i_29_];
                objects[i_29_] = object;
                method2092(-1 + i_29_, i_25_, is, 9, objects);
                method2092(i, i_29_ - -1, is, -127, objects);
            }
            anInt3594++;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("cba.K(" + i + ',' + i_25_ + ',' + (is != null ? "{...}" : "null") + ',' + i_26_ + ',' + (objects != null ? "{...}" : "null") + ')'));
        }
    }

    final synchronized void method2093(boolean bool) {
        anInt3609++;
        if (Component191.aClass250_2462 != null) {
            boolean bool_35_ = true;
            for (int i = 0; i < 2; i++) {
                if (Component191.aClass250_2462.lines[i] == this) Component191.aClass250_2462.lines[i] = null;
                if (Component191.aClass250_2462.lines[i] != null) bool_35_ = false;
            }
            if (bool_35_) {
                Component191.aClass250_2462.stopRequested = true;
                while (Component191.aClass250_2462.running) SpriteAtlasShader.sleep((byte) 68, 50L);
                Component191.aClass250_2462 = null;
            }
        }
        close();
        this.anIntArray3603 = null;
        aBoolean3610 = bool;
    }

    /** Write pending PCM to the backend (SourceDataLine / DirectSound). */
    void writeSamples() throws Exception {
        anInt3612++;
    }

    void initOnComponent(Component component) throws Exception {
        anInt3596++;
    }

    public AudioLine() {
        aLong3602 = Component240.currentTimeMillis(-99);
        aLong3614 = 0L;
        aLong3618 = 0L;
        anInt3615 = 0;
        anInt3617 = 0;
        aClass348_Sub16Array3621 = new NodeSub16[8];
        aBoolean3623 = true;
        anInt3622 = 0;
        aClass348_Sub16Array3619 = new NodeSub16[8];
        anInt3624 = 0;
    }
}
