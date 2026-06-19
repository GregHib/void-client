object BrightnessOptionStateStatics {
    @JvmField
            var anIntArrayArray5894: Array<IntArray?>? = null
            @JvmField
            var anInt5895: Int = 0
            @JvmField
            var anInt5896: Int = 0
            @JvmField
            var anInt5897: Int = 0
            @JvmField
            var anInt5898: Int = 0
            @JvmField
            var anInt5899: Int = 0
            @JvmField
            var aCompiledScriptCache_5900: CompiledScriptCache? = null
            @JvmField
            var anInt5901: Int = 0
            @JvmField
            var anIntArray5902: IntArray? = IntArray(128)
            @JvmField
            var anInt5903: Int = 0
    
            @JvmStatic
            fun method1745(string: String, i: Int): Int {
                anInt5895++
                return string.length + 1
            }
    
            @JvmStatic
            fun method1746(i: Int) {
                anIntArray5902 = null
                if (i != -15628) aCompiledScriptCache_5900 = null
                aCompiledScriptCache_5900 = null
                anIntArrayArray5894 = null
            }
    
            init {
                run {
                    var i = 0
                    while (anIntArray5902!!.size > i) {
                        anIntArray5902!![i] = -1
                        i++
                    }
                }
                for (i in 65..90) anIntArray5902!![i] = -65 + i
                for (i in 97..122) anIntArray5902!![i] = i - 97 + 26
                for (i in 48..57) anIntArray5902!![i] = i + -48 - -52
                anIntArray5902!![43] = 62
                anIntArray5902!![42] = anIntArray5902!![43]
                anIntArray5902!![47] = 63
                anIntArray5902!![45] = anIntArray5902!![47]
            }
}
