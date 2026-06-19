import FileStoreLocator.method1464
import FileStoreLocator.method1466
import GameClock.method599
import java.awt.*
import java.awt.datatransfer.Transferable
import java.io.DataInputStream
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.lang.reflect.Method
import java.net.InetAddress
import java.net.Socket
import java.net.URL
import java.util.*
import kotlin.concurrent.Volatile

object PrivilegedOperationWorkerStatics {
    var aString3778: String? = null
            @JvmField
            var aString3780: String? = null
    
            @Volatile
            var aLong3781 = 0L
            @JvmField
            var aString3782: String? = null
            @JvmField
            var aMethod3783: Method? = null
            var aString3784: String? = null
            var aMethod3786: Method? = null
            var anInt3792: Int = -1
            var aString3796: String? = null
            var aString3800: String? = null
            lateinit var aString3803: String
            var aString3789: String? = null
    
            /*synthetic*/
            var aClass3804: Class<*>? = null
    
            /*synthetic*/
            var aClass3805: Class<*>? = null
    
            /*synthetic*/
            var aClass3806: Class<*>? = null
    
            /*synthetic*/
            var aClass3807: Class<*>? = null
    
            fun method2231(string: String?, i: Int): RandomAccessFileOnDisk? {
                if (i != -1141472112) return null
                return method2241(string, 12606, aString3789, anInt3792)
            }
    
            fun method2241(string: String?, i: Int, string_14_: String?, i_15_: Int): RandomAccessFileOnDisk? {
                val string_16_: String?
                if (i_15_ == 33) string_16_ = "jagex_" + string_14_ + "_preferences" + string + "_rc.dat"
                else if (i_15_ != 34) string_16_ = "jagex_" + string_14_ + "_preferences" + string + ".dat"
                else string_16_ = "jagex_" + string_14_ + "_preferences" + string + "_wip.dat"
                if (i != 12606) return null
                val strings = arrayOf<String>("c:/rscache/", "/rscache/", aString3800!!, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "")
                var i_17_ = 0
                while (strings.size > i_17_) {
                    val string_18_ = strings[i_17_]
                    if (string_18_.length <= 0 || File(string_18_).exists()) {
                        try {
                            val randomAccessFileOnDisk = RandomAccessFileOnDisk(File(string_18_, string_16_), "rw", 10000L)
                            return randomAccessFileOnDisk
                        } catch (exception: Exception) {
                            /* empty */
                        }
                    }
                    i_17_++
                }
                return null
            }
}
