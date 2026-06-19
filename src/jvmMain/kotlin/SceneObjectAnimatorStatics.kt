import ModelBatchBaseStatics.method1130
import HostPingThreadStatics.method1301

object SceneObjectAnimatorStatics {
    var anInt3050: Int = 0
            var anInt3058: Int = 0
            var anInt3061: Int = 0
            @JvmField
            var anInt3062: Int = 0
            var anInt3066: Int = 0
            var anIntArray3068: IntArray? = null
            var anInt3070: Int = 0
            @JvmField
            var aBufferedRandomAccessFile_3075: BufferedRandomAccessFile? = null
            var anInt3076: Int = 0
            var anInt3077: Int = 0
            var anInt3078: Int = 0
            var anInt3080: Int = 0
            var anInt3082: Int = 0
            var anInt3086: Int = 0
            var anInt3087: Int = 0
    
            fun method1669(i: Int, i_6_: Int): String {
                if (i != -19918) method1669(75, 33)
                anInt3066++
                return ((0xff and (i_6_ shr 24)).toString() + "." + ((i_6_ and 0xffb428) shr 16) + "." + (i_6_ shr 8 and 0xff) + "." + (i_6_ and 0xff))
            }
    
            @JvmStatic
            fun method1673(i: Int) {
                aBufferedRandomAccessFile_3075 = null
                anIntArray3068 = null
                if (i >= -19) method1669(-110, -13)
            }
}
