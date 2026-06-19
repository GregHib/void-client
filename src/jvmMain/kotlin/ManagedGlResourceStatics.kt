import WaterMaterialPassStatics.method2148
import CollisionFlagQueryStatics.method721

object ManagedGlResourceStatics {
    var anInt3151: Int = 0
            @JvmField
            var aClass348_Sub42_Sub13_3152: ContactList? = null
            var anInt3154: Int = 0
            var anInt3155: Int = 0
            @JvmStatic
            fun method1866(i: Int) {
                if (i != 0) aClass348_Sub42_Sub13_3152 = null
                aClass348_Sub42_Sub13_3152 = null
            }
    
            fun method1867(i: Int) {
                anInt3155++
                SceneNodeDequeStatics.anInt1498++
                val class348_sub47 = method2148(TileSceneEntityStatics.aFontMetaRef_8724, TheoraVideoStreamStatics.aIsaacCipher_9029, -99)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                InterfaceComponentGroupStatics.method3243(118, class348_sub47)
            }
    
            fun method1868(i: Byte, class348_sub42_sub13: ContactList) {
                val i_0_ = -104 / ((i - 38) / 54)
                anInt3154++
                class348_sub42_sub13.method3162(true)
                var bool = false
                var class348_sub42_sub13_1_ = (ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!.method1011(-85) as ContactList?)
                while (class348_sub42_sub13_1_ != null) {
                    if (SceneModelBuilderStatics.method2496(class348_sub42_sub13_1_.method3235(-17937), class348_sub42_sub13.method3235(-17937), true)) {
                        method721(class348_sub42_sub13_1_, class348_sub42_sub13, -1)
                        bool = true
                        break
                    }
                    class348_sub42_sub13_1_ = (ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!.method1003(84.toByte()) as ContactList?)
                }
                if (!bool) ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!.method1005(true, class348_sub42_sub13)
            }
}
