import java.io.File
import java.io.RandomAccessFile
import java.util.*

object Class201 {
    private var anInt2641 = 0
    private val aHashtable2642: Hashtable<Any?, Any?>
    private var aString2643: String? = null
    private var aBoolean2644 = false
    private var aString2645: String? = null

    @JvmStatic
    fun method1464(i: Int, i_0_: Int, string: String?, string_1_: String?): File {
        if (!aBoolean2644) throw RuntimeException("")
        val file = aHashtable2642.get(string) as File?
        if (file != null) return file
        val strings = arrayOf<String>("c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString2643!!, "/tmp/", "")
        val strings_2_ = arrayOf<String>(".jagex_cache_" + i_0_, ".file_store_" + i_0_)
        for (i_3_ in i..1) {
            var i_4_ = 0
            while (strings_2_.size > i_4_) {
                var i_5_ = 0
                while (strings.size > i_5_) {
                    val string_6_ = (strings[i_5_] + strings_2_[i_4_] + "/" + (if (string_1_ == null) "" else string_1_ + "/") + string)
                    var randomaccessfile: RandomAccessFile? = null
                    try {
                        val file_7_ = File(string_6_)
                        if (i_3_ != 0 || file_7_.exists()) {
                            val string_8_ = strings[i_5_]
                            if (i_3_ != 1 || string_8_.length <= 0 || File(string_8_).exists()) {
                                File(strings[i_5_] + strings_2_[i_4_]).mkdir()
                                if (string_1_ != null) File(strings[i_5_] + strings_2_[i_4_] + "/" + string_1_).mkdir()
                                randomaccessfile = RandomAccessFile(file_7_, "rw")
                                val i_9_ = randomaccessfile.read()
                                randomaccessfile.seek(0L)
                                randomaccessfile.write(i_9_)
                                randomaccessfile.seek(0L)
                                randomaccessfile.close()
                                aHashtable2642.put(string, file_7_)
                                return file_7_
                            }
                        }
                    } catch (exception: Exception) {
                        try {
                            if (randomaccessfile != null) {
                                randomaccessfile.close()
                                val `object`: Any? = null
                            }
                        } catch (exception_10_: Exception) {
                            /* empty */
                        }
                    }
                    i_5_++
                }
                i_4_++
            }
        }
        throw RuntimeException()
    }

    @JvmStatic
    fun method1465(i: Byte, string: String?, i_11_: Int) {
        anInt2641 = i_11_
        if (i.toInt() != -121) aBoolean2644 = false
        aString2645 = string
        try {
            aString2643 = System.getProperty("user.home")
            if (aString2643 != null) aString2643 += "/"
        } catch (exception: Exception) {
            /* empty */
        }
        aBoolean2644 = true
        if (aString2643 == null) aString2643 = "~/"
    }

    @JvmStatic
    fun method1466(i: Int, string: String?): File {
        if (i != -2) method1466(75, null)
        return method1464(0, anInt2641, string, aString2645)
    }

    init {
        aHashtable2642 = Hashtable<Any?, Any?>(16)
    }
}
