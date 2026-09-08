/* IOException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class IOException_Sub1 extends IOException {
    static boolean aBoolean86 = false;
    static int anInt87;
    static int anInt88;
    static int anInt89;
    static Component183 aClass114_90 = new Component183(42, -1);
    static int[] anIntArray91 = new int[8];

    /** Quick-sort {@code ls[i..i_1_]} and mirror swaps into parallel {@code is}. */
    static final void quickSortParallel(int i, int i_0_, long[] ls, int i_1_, int[] is) {
        do {
            try {
                anInt89++;
                if (i_1_ > i) {
                    int i_2_ = (i_1_ + i) / 2;
                    int i_3_ = i;
                    long l = ls[i_2_];
                    ls[i_2_] = ls[i_1_];
                    ls[i_1_] = l;
                    int i_4_ = is[i_2_];
                    is[i_2_] = is[i_1_];
                    is[i_1_] = i_4_;
                    int i_5_ = l == 9223372036854775807L ? 0 : 1;
                    for (int i_6_ = i; i_1_ > i_6_; i_6_++) {
                        if (l - -(long) (i_5_ & i_6_) > ls[i_6_]) {
                            long l_7_ = ls[i_6_];
                            ls[i_6_] = ls[i_3_];
                            ls[i_3_] = l_7_;
                            int i_8_ = is[i_6_];
                            is[i_6_] = is[i_3_];
                            is[i_3_++] = i_8_;
                        }
                    }
                    ls[i_1_] = ls[i_3_];
                    ls[i_3_] = l;
                    is[i_1_] = is[i_3_];
                    is[i_3_] = i_4_;
                    quickSortParallel(i, -126, ls, -1 + i_3_, is);
                    quickSortParallel(1 + i_3_, -81, ls, i_1_, is);
                }
                if (i_0_ < -72) break;
                clearStatics(99);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("gv.A(" + i + ',' + i_0_ + ',' + (ls != null ? "{...}" : "null") + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    public static void clearStatics(int i) {
        if (i == 8) {
            anIntArray91 = null;
            aClass114_90 = null;
        }
    }

    /** Set {@link Component21#stereo}, {@link Component231#sampleRate}, and mixer thread priority. */
    static final void configureAudio(boolean bool, int i, boolean bool_9_, int i_10_) {
        anInt87++;
        if (i_10_ < 8000 || i_10_ > 48000) throw new IllegalArgumentException();
        Component193.audioThreadPriority = i;
        Component231.sampleRate = i_10_;
        Component21.stereo = bool;
        if (bool_9_ != true) clearStatics(-125);
    }

    IOException_Sub1(String string) {
        super(string);
    }
}
