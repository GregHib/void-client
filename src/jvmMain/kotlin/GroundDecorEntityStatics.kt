import FontStatics.method2570

object GroundDecorEntityStatics {
    @JvmField
            var anInt8739: Int = 0
            @JvmField
            var anInt8740: Int = 0
            @JvmField
            var anInt8742: Int = 0
            @JvmField
            var aNodeDeque_8744: NodeDeque? = NodeDeque()
            @JvmField
            var anInt8746: Int = 0
            @JvmField
            var anInt8748: Int = 0
            @JvmField
            var anInt8749: Int = 0
            @JvmField
            var anInt8752: Int = 0
            @JvmField
            var anInt8753: Int = 0
            @JvmField
            var anInt8754: Int = 0
            @JvmField
            var aJs5Archive_8755: Js5Archive? = null
            @JvmField
            var aIntRange_8756: IntRange? = IntRange(107, 6)
    
            @JvmStatic
            fun method2408(i: Byte): Int {
                anInt8754++
                val i_4_ = -71 % ((-2 - i) / 44)
                return TileTextureNodeStatics.anInt9411++
            }
    
            @JvmStatic
            fun method2410(i: Byte, i_5_: Int, i_6_: Int): Boolean {
                anInt8752++
                if (i >= -21) return true
                if (!ScrollbarComponentStatics.aBoolean8335) return false
                val i_7_ = i_6_ shr 16
                val i_8_ = i_6_ and 0xffff
                if (WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![i_7_] == null || WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![i_7_]!![i_8_] == null) return false
                val class46 = WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![i_7_]!![i_8_]
                if (i_5_ == -1 && class46!!.anInt774 == 0) {
                    var class348_sub42_sub12 = (SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1995(4) as? ContactEntry?)
                    while (class348_sub42_sub12 != null) {
                        if (class348_sub42_sub12.anInt9608 == 6 || class348_sub42_sub12.anInt9608 == 1011 || (class348_sub42_sub12.anInt9608 == 13) || (class348_sub42_sub12.anInt9608 == 18) || (class348_sub42_sub12.anInt9608 == 16)) {
                            var class46_9_ = method2570(1512932720, (class348_sub42_sub12.anInt9607))
                            while (class46_9_ != null) {
                                if (class46_9_.anInt830 == class46!!.anInt830) return true
                                class46_9_ = WorldMapSceneStatics.method1687(class46_9_, 3)
                            }
                        }
                        class348_sub42_sub12 = SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1990(56.toByte()) as? ContactEntry?
                    }
                } else {
                    var class348_sub42_sub12 = (SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1995(4) as? ContactEntry?)
                    while (class348_sub42_sub12 != null) {
                        if ((class348_sub42_sub12.anInt9602 == i_5_) && (class348_sub42_sub12.anInt9607 == class46!!.anInt830) && ((class348_sub42_sub12.anInt9608) == 6 || (class348_sub42_sub12.anInt9608) == 1011 || (class348_sub42_sub12.anInt9608) == 13 || (class348_sub42_sub12.anInt9608) == 18 || (class348_sub42_sub12.anInt9608) == 16)) return true
                        class348_sub42_sub12 = SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1990(93.toByte()) as? ContactEntry?
                    }
                }
                return false
            }
    
            fun method2411(cameraNodeList: CameraNodeList?, i: Int): Int {
                anInt8742++
                if (cameraNodeList == NativeShaderProgramStatics.aCameraNodeList_9773) return 9216
                if (cameraNodeList == ItemModelDefinitionStatics.aCameraNodeList_430) return 34065
                if (NpcDefinitionCacheStatics.aCameraNodeList_3314 == cameraNodeList) return 34066
                throw IllegalArgumentException()
            }
    
            @JvmStatic
            fun method2412(bool: Boolean) {
                aJs5Archive_8755 = null
                aIntRange_8756 = null
                aNodeDeque_8744 = null
                if (bool != true) method2408((-121).toByte())
            }
    
            @JvmStatic
            fun method2413(i: Int, class348_sub49_sub2: CipheredPacketBuffer): Int {
                anInt8749++
                val i_35_ = class348_sub49_sub2.readBits((-24).toByte(), 2)
                if (i != 1) aNodeDeque_8744 = null
                val i_36_: Int
                if (i_35_ != 0) {
                    if (i_35_ == 1) i_36_ = class348_sub49_sub2.readBits((-24).toByte(), 5)
                    else if (i_35_ != 2) i_36_ = class348_sub49_sub2.readBits((-24).toByte(), 11)
                    else i_36_ = class348_sub49_sub2.readBits((-24).toByte(), 8)
                } else i_36_ = 0
                return i_36_
            }
}
