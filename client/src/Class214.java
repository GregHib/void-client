/* Class214 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class214 {
    static final void method1573(int[] is, int i, int i_0_) {
        i_0_ = i + i_0_ - 7;
        while (i < i_0_) {
            is[i++] = 0;
            is[i++] = 0;
            is[i++] = 0;
            is[i++] = 0;
            is[i++] = 0;
            is[i++] = 0;
            is[i++] = 0;
            is[i++] = 0;
        }
        i_0_ += 7;
        while (i < i_0_)
            is[i++] = 0;
    }

    static final void method1574(float[] fs, int i, float[] fs_1_, int i_2_,
                                 int i_3_) {
        if (fs == fs_1_) {
            if (i == i_2_)
                return;
            if (i_2_ > i && i_2_ < i + i_3_) {
                i_3_--;
                i += i_3_;
                i_2_ += i_3_;
                i_3_ = i - i_3_;
                i_3_ += 7;
                while (i >= i_3_) {
                    fs_1_[i_2_--] = fs[i--];
                    fs_1_[i_2_--] = fs[i--];
                    fs_1_[i_2_--] = fs[i--];
                    fs_1_[i_2_--] = fs[i--];
                    fs_1_[i_2_--] = fs[i--];
                    fs_1_[i_2_--] = fs[i--];
                    fs_1_[i_2_--] = fs[i--];
                    fs_1_[i_2_--] = fs[i--];
                }
                i_3_ -= 7;
                while (i >= i_3_)
                    fs_1_[i_2_--] = fs[i--];
                return;
            }
        }
        i_3_ += i;
        i_3_ -= 7;
        while (i < i_3_) {
            fs_1_[i_2_++] = fs[i++];
            fs_1_[i_2_++] = fs[i++];
            fs_1_[i_2_++] = fs[i++];
            fs_1_[i_2_++] = fs[i++];
            fs_1_[i_2_++] = fs[i++];
            fs_1_[i_2_++] = fs[i++];
            fs_1_[i_2_++] = fs[i++];
            fs_1_[i_2_++] = fs[i++];
        }
        i_3_ += 7;
        while (i < i_3_)
            fs_1_[i_2_++] = fs[i++];
    }

    static final void method1575(Object[] objects, int i, Object[] objects_4_,
                                 int i_5_, int i_6_) {
        if (objects == objects_4_) {
            if (i == i_5_)
                return;
            if (i_5_ > i && i_5_ < i + i_6_) {
                i_6_--;
                i += i_6_;
                i_5_ += i_6_;
                i_6_ = i - i_6_;
                i_6_ += 7;
                while (i >= i_6_) {
                    objects_4_[i_5_--] = objects[i--];
                    objects_4_[i_5_--] = objects[i--];
                    objects_4_[i_5_--] = objects[i--];
                    objects_4_[i_5_--] = objects[i--];
                    objects_4_[i_5_--] = objects[i--];
                    objects_4_[i_5_--] = objects[i--];
                    objects_4_[i_5_--] = objects[i--];
                    objects_4_[i_5_--] = objects[i--];
                }
                i_6_ -= 7;
                while (i >= i_6_)
                    objects_4_[i_5_--] = objects[i--];
                return;
            }
        }
        i_6_ += i;
        i_6_ -= 7;
        while (i < i_6_) {
            objects_4_[i_5_++] = objects[i++];
            objects_4_[i_5_++] = objects[i++];
            objects_4_[i_5_++] = objects[i++];
            objects_4_[i_5_++] = objects[i++];
            objects_4_[i_5_++] = objects[i++];
            objects_4_[i_5_++] = objects[i++];
            objects_4_[i_5_++] = objects[i++];
            objects_4_[i_5_++] = objects[i++];
        }
        i_6_ += 7;
        while (i < i_6_)
            objects_4_[i_5_++] = objects[i++];
    }

    static final void method1576(short[] is, int i, short[] is_7_, int i_8_,
                                 int i_9_) {
        if (is == is_7_) {
            if (i == i_8_)
                return;
            if (i_8_ > i && i_8_ < i + i_9_) {
                i_9_--;
                i += i_9_;
                i_8_ += i_9_;
                i_9_ = i - i_9_;
                i_9_ += 7;
                while (i >= i_9_) {
                    is_7_[i_8_--] = is[i--];
                    is_7_[i_8_--] = is[i--];
                    is_7_[i_8_--] = is[i--];
                    is_7_[i_8_--] = is[i--];
                    is_7_[i_8_--] = is[i--];
                    is_7_[i_8_--] = is[i--];
                    is_7_[i_8_--] = is[i--];
                    is_7_[i_8_--] = is[i--];
                }
                i_9_ -= 7;
                while (i >= i_9_)
                    is_7_[i_8_--] = is[i--];
                return;
            }
        }
        i_9_ += i;
        i_9_ -= 7;
        while (i < i_9_) {
            is_7_[i_8_++] = is[i++];
            is_7_[i_8_++] = is[i++];
            is_7_[i_8_++] = is[i++];
            is_7_[i_8_++] = is[i++];
            is_7_[i_8_++] = is[i++];
            is_7_[i_8_++] = is[i++];
            is_7_[i_8_++] = is[i++];
            is_7_[i_8_++] = is[i++];
        }
        i_9_ += 7;
        while (i < i_9_)
            is_7_[i_8_++] = is[i++];
    }

    static final void method1577(byte[] is, int i, byte[] is_10_, int i_11_,
                                 int i_12_) {
        if (is == is_10_) {
            if (i == i_11_)
                return;
            if (i_11_ > i && i_11_ < i + i_12_) {
                i_12_--;
                i += i_12_;
                i_11_ += i_12_;
                i_12_ = i - i_12_;
                i_12_ += 7;
                while (i >= i_12_) {
                    is_10_[i_11_--] = is[i--];
                    is_10_[i_11_--] = is[i--];
                    is_10_[i_11_--] = is[i--];
                    is_10_[i_11_--] = is[i--];
                    is_10_[i_11_--] = is[i--];
                    is_10_[i_11_--] = is[i--];
                    is_10_[i_11_--] = is[i--];
                    is_10_[i_11_--] = is[i--];
                }
                i_12_ -= 7;
                while (i >= i_12_)
                    is_10_[i_11_--] = is[i--];
                return;
            }
        }
        i_12_ += i;
        i_12_ -= 7;
        while (i < i_12_) {
            is_10_[i_11_++] = is[i++];
            is_10_[i_11_++] = is[i++];
            is_10_[i_11_++] = is[i++];
            is_10_[i_11_++] = is[i++];
            is_10_[i_11_++] = is[i++];
            is_10_[i_11_++] = is[i++];
            is_10_[i_11_++] = is[i++];
            is_10_[i_11_++] = is[i++];
        }
        i_12_ += 7;
        while (i < i_12_)
            is_10_[i_11_++] = is[i++];
    }

    static final void method1578(int[] is, int i, int[] is_13_, int i_14_,
                                 int i_15_) {
        if (is == is_13_) {
            if (i == i_14_)
                return;
            if (i_14_ > i && i_14_ < i + i_15_) {
                i_15_--;
                i += i_15_;
                i_14_ += i_15_;
                i_15_ = i - i_15_;
                i_15_ += 7;
                while (i >= i_15_) {
                    is_13_[i_14_--] = is[i--];
                    is_13_[i_14_--] = is[i--];
                    is_13_[i_14_--] = is[i--];
                    is_13_[i_14_--] = is[i--];
                    is_13_[i_14_--] = is[i--];
                    is_13_[i_14_--] = is[i--];
                    is_13_[i_14_--] = is[i--];
                    is_13_[i_14_--] = is[i--];
                }
                i_15_ -= 7;
                while (i >= i_15_)
                    is_13_[i_14_--] = is[i--];
                return;
            }
        }
        i_15_ += i;
        i_15_ -= 7;
        while (i < i_15_) {
            is_13_[i_14_++] = is[i++];
            is_13_[i_14_++] = is[i++];
            is_13_[i_14_++] = is[i++];
            is_13_[i_14_++] = is[i++];
            is_13_[i_14_++] = is[i++];
            is_13_[i_14_++] = is[i++];
            is_13_[i_14_++] = is[i++];
            is_13_[i_14_++] = is[i++];
        }
        i_15_ += 7;
        while (i < i_15_)
            is_13_[i_14_++] = is[i++];
    }

    static final void method1579(int[] is, int i, int i_16_, int i_17_) {
        i_16_ = i + i_16_ - 7;
        while (i < i_16_) {
            is[i++] = i_17_;
            is[i++] = i_17_;
            is[i++] = i_17_;
            is[i++] = i_17_;
            is[i++] = i_17_;
            is[i++] = i_17_;
            is[i++] = i_17_;
            is[i++] = i_17_;
        }
        i_16_ += 7;
        while (i < i_16_)
            is[i++] = i_17_;
    }
}
