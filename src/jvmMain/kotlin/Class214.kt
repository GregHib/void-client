/* Class214 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class214 {
    @JvmStatic
    fun method1573(`is`: IntArray, i: Int, i_0_: Int) {
        var i = i
        var i_0_ = i_0_
        i_0_ = i + i_0_ - 7
        while (i < i_0_) {
            `is`[i++] = 0
            `is`[i++] = 0
            `is`[i++] = 0
            `is`[i++] = 0
            `is`[i++] = 0
            `is`[i++] = 0
            `is`[i++] = 0
            `is`[i++] = 0
        }
        i_0_ += 7
        while (i < i_0_) `is`[i++] = 0
    }

    @JvmStatic
    fun method1574(fs: FloatArray, i: Int, fs_1_: FloatArray, i_2_: Int, i_3_: Int) {
        var i = i
        var i_2_ = i_2_
        var i_3_ = i_3_
        if (fs == fs_1_) {
            if (i == i_2_) return
            if (i_2_ > i && i_2_ < i + i_3_) {
                i_3_--
                i += i_3_
                i_2_ += i_3_
                i_3_ = i - i_3_
                i_3_ += 7
                while (i >= i_3_) {
                    fs_1_[i_2_--] = fs[i--]
                    fs_1_[i_2_--] = fs[i--]
                    fs_1_[i_2_--] = fs[i--]
                    fs_1_[i_2_--] = fs[i--]
                    fs_1_[i_2_--] = fs[i--]
                    fs_1_[i_2_--] = fs[i--]
                    fs_1_[i_2_--] = fs[i--]
                    fs_1_[i_2_--] = fs[i--]
                }
                i_3_ -= 7
                while (i >= i_3_) fs_1_[i_2_--] = fs[i--]
                return
            }
        }
        i_3_ += i
        i_3_ -= 7
        while (i < i_3_) {
            fs_1_[i_2_++] = fs[i++]
            fs_1_[i_2_++] = fs[i++]
            fs_1_[i_2_++] = fs[i++]
            fs_1_[i_2_++] = fs[i++]
            fs_1_[i_2_++] = fs[i++]
            fs_1_[i_2_++] = fs[i++]
            fs_1_[i_2_++] = fs[i++]
            fs_1_[i_2_++] = fs[i++]
        }
        i_3_ += 7
        while (i < i_3_) fs_1_[i_2_++] = fs[i++]
    }

    @JvmStatic
    fun <T> method1575(objects: Array<T?>, i: Int, objects_4_: Array<T?>, i_5_: Int, i_6_: Int) {
        var i = i
        var i_5_ = i_5_
        var i_6_ = i_6_
        if (objects.contentEquals(objects_4_)) {
            if (i == i_5_) return
            if (i_5_ > i && i_5_ < i + i_6_) {
                i_6_--
                i += i_6_
                i_5_ += i_6_
                i_6_ = i - i_6_
                i_6_ += 7
                while (i >= i_6_) {
                    objects_4_[i_5_--] = objects[i--]
                    objects_4_[i_5_--] = objects[i--]
                    objects_4_[i_5_--] = objects[i--]
                    objects_4_[i_5_--] = objects[i--]
                    objects_4_[i_5_--] = objects[i--]
                    objects_4_[i_5_--] = objects[i--]
                    objects_4_[i_5_--] = objects[i--]
                    objects_4_[i_5_--] = objects[i--]
                }
                i_6_ -= 7
                while (i >= i_6_) objects_4_[i_5_--] = objects[i--]
                return
            }
        }
        i_6_ += i
        i_6_ -= 7
        while (i < i_6_) {
            objects_4_[i_5_++] = objects[i++]
            objects_4_[i_5_++] = objects[i++]
            objects_4_[i_5_++] = objects[i++]
            objects_4_[i_5_++] = objects[i++]
            objects_4_[i_5_++] = objects[i++]
            objects_4_[i_5_++] = objects[i++]
            objects_4_[i_5_++] = objects[i++]
            objects_4_[i_5_++] = objects[i++]
        }
        i_6_ += 7
        while (i < i_6_) objects_4_[i_5_++] = objects[i++]
    }

    @JvmStatic
    fun method1576(`is`: ShortArray, i: Int, is_7_: ShortArray, i_8_: Int, i_9_: Int) {
        var i = i
        var i_8_ = i_8_
        var i_9_ = i_9_
        if (`is` == is_7_) {
            if (i == i_8_) return
            if (i_8_ > i && i_8_ < i + i_9_) {
                i_9_--
                i += i_9_
                i_8_ += i_9_
                i_9_ = i - i_9_
                i_9_ += 7
                while (i >= i_9_) {
                    is_7_[i_8_--] = `is`[i--]
                    is_7_[i_8_--] = `is`[i--]
                    is_7_[i_8_--] = `is`[i--]
                    is_7_[i_8_--] = `is`[i--]
                    is_7_[i_8_--] = `is`[i--]
                    is_7_[i_8_--] = `is`[i--]
                    is_7_[i_8_--] = `is`[i--]
                    is_7_[i_8_--] = `is`[i--]
                }
                i_9_ -= 7
                while (i >= i_9_) is_7_[i_8_--] = `is`[i--]
                return
            }
        }
        i_9_ += i
        i_9_ -= 7
        while (i < i_9_) {
            is_7_[i_8_++] = `is`[i++]
            is_7_[i_8_++] = `is`[i++]
            is_7_[i_8_++] = `is`[i++]
            is_7_[i_8_++] = `is`[i++]
            is_7_[i_8_++] = `is`[i++]
            is_7_[i_8_++] = `is`[i++]
            is_7_[i_8_++] = `is`[i++]
            is_7_[i_8_++] = `is`[i++]
        }
        i_9_ += 7
        while (i < i_9_) is_7_[i_8_++] = `is`[i++]
    }

    @JvmStatic
    fun method1577(`is`: ByteArray, i: Int, is_10_: ByteArray, i_11_: Int, i_12_: Int) {
        var i = i
        var i_11_ = i_11_
        var i_12_ = i_12_
        if (`is` == is_10_) {
            if (i == i_11_) return
            if (i_11_ > i && i_11_ < i + i_12_) {
                i_12_--
                i += i_12_
                i_11_ += i_12_
                i_12_ = i - i_12_
                i_12_ += 7
                while (i >= i_12_) {
                    is_10_[i_11_--] = `is`[i--]
                    is_10_[i_11_--] = `is`[i--]
                    is_10_[i_11_--] = `is`[i--]
                    is_10_[i_11_--] = `is`[i--]
                    is_10_[i_11_--] = `is`[i--]
                    is_10_[i_11_--] = `is`[i--]
                    is_10_[i_11_--] = `is`[i--]
                    is_10_[i_11_--] = `is`[i--]
                }
                i_12_ -= 7
                while (i >= i_12_) is_10_[i_11_--] = `is`[i--]
                return
            }
        }
        i_12_ += i
        i_12_ -= 7
        while (i < i_12_) {
            is_10_[i_11_++] = `is`[i++]
            is_10_[i_11_++] = `is`[i++]
            is_10_[i_11_++] = `is`[i++]
            is_10_[i_11_++] = `is`[i++]
            is_10_[i_11_++] = `is`[i++]
            is_10_[i_11_++] = `is`[i++]
            is_10_[i_11_++] = `is`[i++]
            is_10_[i_11_++] = `is`[i++]
        }
        i_12_ += 7
        while (i < i_12_) is_10_[i_11_++] = `is`[i++]
    }

    fun method1578(`is`: IntArray, i: Int, is_13_: IntArray, i_14_: Int, i_15_: Int) {
        var i = i
        var i_14_ = i_14_
        var i_15_ = i_15_
        if (`is` == is_13_) {
            if (i == i_14_) return
            if (i_14_ > i && i_14_ < i + i_15_) {
                i_15_--
                i += i_15_
                i_14_ += i_15_
                i_15_ = i - i_15_
                i_15_ += 7
                while (i >= i_15_) {
                    is_13_[i_14_--] = `is`[i--]
                    is_13_[i_14_--] = `is`[i--]
                    is_13_[i_14_--] = `is`[i--]
                    is_13_[i_14_--] = `is`[i--]
                    is_13_[i_14_--] = `is`[i--]
                    is_13_[i_14_--] = `is`[i--]
                    is_13_[i_14_--] = `is`[i--]
                    is_13_[i_14_--] = `is`[i--]
                }
                i_15_ -= 7
                while (i >= i_15_) is_13_[i_14_--] = `is`[i--]
                return
            }
        }
        i_15_ += i
        i_15_ -= 7
        while (i < i_15_) {
            is_13_[i_14_++] = `is`[i++]
            is_13_[i_14_++] = `is`[i++]
            is_13_[i_14_++] = `is`[i++]
            is_13_[i_14_++] = `is`[i++]
            is_13_[i_14_++] = `is`[i++]
            is_13_[i_14_++] = `is`[i++]
            is_13_[i_14_++] = `is`[i++]
            is_13_[i_14_++] = `is`[i++]
        }
        i_15_ += 7
        while (i < i_15_) is_13_[i_14_++] = `is`[i++]
    }

    fun method1579(`is`: IntArray, i: Int, i_16_: Int, i_17_: Int) {
        var i = i
        var i_16_ = i_16_
        i_16_ = i + i_16_ - 7
        while (i < i_16_) {
            `is`[i++] = i_17_
            `is`[i++] = i_17_
            `is`[i++] = i_17_
            `is`[i++] = i_17_
            `is`[i++] = i_17_
            `is`[i++] = i_17_
            `is`[i++] = i_17_
            `is`[i++] = i_17_
        }
        i_16_ += 7
        while (i < i_16_) `is`[i++] = i_17_
    }
}
