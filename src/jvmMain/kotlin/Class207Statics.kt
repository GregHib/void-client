object Class207Statics {
    @JvmStatic
    fun method1512(class45: Class45, i: Int): Class207? {
        val `is` = class45.method415(73.toByte(), i)
        if (`is` == null) return null
        return method1517(`is`)[0]
    }

    fun method1517(`is`: ByteArray): Array<Class207> {
        val class348_sub49 = Class348_Sub49(`is`)
        class348_sub49.anInt7197 = `is`.size - 2
        val i = class348_sub49.readUnsignedShort(842397944)
        val class207s: Array<Class207> = Array<Class207>(i) { Class207() }
        class348_sub49.anInt7197 = `is`.size - 7 - i * 8
        val i_73_ = class348_sub49.readUnsignedShort(842397944)
        val i_74_ = class348_sub49.readUnsignedShort(842397944)
        val i_75_ = (class348_sub49.readUnsignedByte(255) and 0xff) + 1
        for (i_76_ in 0..<i) class207s[i_76_].anInt2703 = class348_sub49.readUnsignedShort(842397944)
        for (i_77_ in 0..<i) class207s[i_77_].anInt2700 = class348_sub49.readUnsignedShort(842397944)
        for (i_78_ in 0..<i) class207s[i_78_].anInt2702 = class348_sub49.readUnsignedShort(842397944)
        for (i_79_ in 0..<i) class207s[i_79_].anInt2696 = class348_sub49.readUnsignedShort(842397944)
        for (i_80_ in 0..<i) {
            val class207 = class207s[i_80_]
            class207.anInt2698 = (i_73_ - class207.anInt2702 - class207.anInt2703)
            class207.anInt2701 = (i_74_ - class207.anInt2696 - class207.anInt2700)
        }
        class348_sub49.anInt7197 = `is`.size - 7 - i * 8 - (i_75_ - 1) * 3
        val is_81_ = IntArray(i_75_)
        for (i_82_ in 1..<i_75_) {
            is_81_[i_82_] = class348_sub49.readMedium(-1)
            if (is_81_[i_82_] == 0) is_81_[i_82_] = 1
        }
        for (i_83_ in 0..<i) class207s[i_83_].anIntArray2697 = is_81_
        class348_sub49.anInt7197 = 0
        for (i_84_ in 0..<i) {
            val class207 = class207s[i_84_]
            val i_85_ = (class207.anInt2702 * class207.anInt2696)
            class207.aByteArray2699 = ByteArray(i_85_)
            val i_86_ = class348_sub49.readUnsignedByte(255)
            if ((i_86_ and 0x2) == 0) {
                if ((i_86_ and 0x1) == 0) {
                    for (i_87_ in 0..<i_85_) class207.aByteArray2699[i_87_] = class348_sub49.readByte(-126)
                } else {
                    for (i_88_ in 0..<class207.anInt2702) {
                        for (i_89_ in 0..<class207.anInt2696) class207.aByteArray2699[(i_88_ + i_89_ * class207.anInt2702)] = class348_sub49.readByte(-96)
                    }
                }
            } else {
                var bool = false
                class207.aByteArray2695 = ByteArray(i_85_)
                if ((i_86_ and 0x1) == 0) {
                    for (i_90_ in 0..<i_85_) class207.aByteArray2699[i_90_] = class348_sub49.readByte(-118)
                    for (i_91_ in 0..<i_85_) {
                        val i_92_ = (class348_sub49.readByte(-89).also { class207.aByteArray2695!![i_91_] = it })
                        bool = bool or (i_92_.toInt() != -1)
                    }
                } else {
                    for (i_93_ in 0..<class207.anInt2702) {
                        for (i_94_ in 0..<class207.anInt2696) class207.aByteArray2699[(i_93_ + i_94_ * class207.anInt2702)] = class348_sub49.readByte(-84)
                    }
                    for (i_95_ in 0..<class207.anInt2702) {
                        for (i_96_ in 0..<class207.anInt2696) {
                            val i_97_ = (class348_sub49.readByte(-122).also { class207.aByteArray2695!![i_95_ + i_96_ * (class207.anInt2702)] = it })
                            bool = bool or (i_97_.toInt() != -1)
                        }
                    }
                }
                if (!bool) class207.aByteArray2695 = null
            }
        }
        return class207s
    }

    @JvmStatic
    fun method1519(class45: Class45, i: Int, i_105_: Int): Array<Class207>? {
        val `is` = class45.method410(-1860, i, i_105_)
        if (`is` == null) return null
        return method1517(`is`)
    }

    @JvmStatic
    fun method1521(class45: Class45, i: Int, i_112_: Int): Class207? {
        val `is` = class45.method410(-1860, i, i_112_)
        if (`is` == null) return null
        return method1517(`is`)[0]
    }

    @JvmStatic
    fun method1523(class45: Class45, i: Int): Array<Class207>? {
        val `is` = class45.method415(73.toByte(), i)
        if (`is` == null) return null
        return method1517(`is`)
    }
}
