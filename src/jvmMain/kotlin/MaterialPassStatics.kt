object MaterialPassStatics {
    @JvmField
            var anInt3681: Int = 0
            @JvmField
            var anInt3682: Int = 0
            @JvmField
            var aClass348_Sub2_3683: MidiFileBuilder? = null
            @JvmStatic
            fun method2135(i: Int) {
                if (i == 0) aClass348_Sub2_3683 = null
            }
    
            @JvmStatic
            fun method2138(i: Int): Boolean {
                anInt3681++
                val class348_sub48 = IntKeyNodeStatics.aNodeDeque_6978!!.method1995(4) as ModelResourceBundle?
                if (class348_sub48 == null) return false
                val i_3_ = 118 % ((-40 - i) / 50)
                var i_4_ = 0
                while ((class348_sub48.anInt7126 > i_4_)) {
                    if ((class348_sub48.aLinkedQueueNodeArray7135!![i_4_] != null) && (class348_sub48.aLinkedQueueNodeArray7135!![i_4_]!!.anInt1997) == 0) return false
                    if ((class348_sub48.aLinkedQueueNodeArray7127!![i_4_] != null) && (class348_sub48.aLinkedQueueNodeArray7127!![i_4_]!!.anInt1997) == 0) return false
                    i_4_++
                }
                return true
            }
}
