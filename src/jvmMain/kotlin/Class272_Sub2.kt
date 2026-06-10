import sun.net.www.protocol.http.AuthenticationInfo
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.*
import java.nio.charset.StandardCharsets
import java.util.*

class Class272_Sub2 : Class272() {
    private val aProxySelector6172: ProxySelector = ProxySelector.getDefault()

    @Throws(IOException::class)
    private fun method2052(string: String?, i: Int, string_0_: String?): Socket? {
        val socket = Socket(string, i)
        socket.setSoTimeout(10000)
        val outputstream = socket.getOutputStream()
        if (string_0_ != null) outputstream.write(("CONNECT " + this.aString3476 + ":" + this.anInt3470 + " HTTP/1.0\n" + string_0_ + "\n\n").toByteArray(StandardCharsets.ISO_8859_1))
        else outputstream.write(("CONNECT " + this.aString3476 + ":" + this.anInt3470 + " HTTP/1.0\n\n").toByteArray(StandardCharsets.ISO_8859_1))
        outputstream.flush()
        val bufferedreader = BufferedReader(InputStreamReader(socket.getInputStream()))
        var string_1_ = bufferedreader.readLine()
        if (string_1_ != null) {
            if (string_1_.startsWith("HTTP/1.0 200") || string_1_.startsWith("HTTP/1.1 200")) return socket
            if (string_1_.startsWith("HTTP/1.0 407") || string_1_.startsWith("HTTP/1.1 407")) {
                var i_2_ = 0
                string_1_ = bufferedreader.readLine()
                val string_3_ = "proxy-authenticate: "
                while ( /**/null != string_1_ && i_2_ < 50) {
                    if (string_1_.lowercase(Locale.getDefault()).startsWith(string_3_)) {
                        string_1_ = string_1_.substring(string_3_.length).trim { it <= ' ' }
                        val i_4_ = string_1_.indexOf(' ')
                        if (i_4_ != -1) string_1_ = string_1_.substring(0, i_4_)
                        throw IOException_Sub1(string_1_)
                    }
                    i_2_++
                    string_1_ = bufferedreader.readLine()
                }
                throw IOException_Sub1("")
            }
        }
        outputstream.close()
        bufferedreader.close()
        socket.close()
        return null
    }

    @Throws(IOException::class)
    override fun method2050(i: Int): Socket? {
        val flag1: Boolean
        val flag = System.getProperty("java.net.useSystemProxies").toBoolean()
        if (!flag) System.setProperty("java.net.useSystemProxies", "true")
        flag1 = anInt3470 == 443
        var ioexception_sub1: IOException_Sub1?
        val aobj1: Array<Any?>?
        var j: Int
        if (i >= -100) return null
        val list: MutableList<*>
        val list1: MutableList<*>
        try {
            list = aProxySelector6172.select(URI((if (flag1) "https" else "http") + "://" + aString3476))
            list1 = aProxySelector6172.select(URI((if (flag1) "http" else "https") + "://" + aString3476))
        } catch (urisyntaxexception: URISyntaxException) {
            return method2047(121.toByte())
        }
        list.addAll(list1)
        val aobj: Array<Any?> = list.toTypedArray()
        ioexception_sub1 = null
        aobj1 = aobj
        j = 0

        while (j < aobj1.size) {
            val localObject2 = aobj1[j]

            val localProxy = localObject2 as Proxy
            try {
                val localSocket = method2053(localProxy, 125.toByte())
                if (localSocket != null) {
                    return localSocket
                }
            } catch (localIOException_Sub1: IOException_Sub1) {
                ioexception_sub1 = localIOException_Sub1
            } catch (localIOException: IOException) {
            }
            ++j
        }
        if (ioexception_sub1 != null) throw ioexception_sub1
        else return method2047(92.toByte())
    }

    @Throws(IOException::class)
    private fun method2053(proxy: Proxy, i: Byte): Socket? {
        if (proxy.type() == Proxy.Type.DIRECT) return method2047(126.toByte())
        val socketaddress = proxy.address()
        if (socketaddress !is InetSocketAddress) return null
        val inetsocketaddress = socketaddress
        if (i.toInt() != 125) return null
        if (proxy.type() == Proxy.Type.HTTP) {
            var string: String? = null
            try {
//                val method = (AuthenticationInfo::class.java.getDeclaredMethod("getProxyAuth", (if (aClass6173 == null) String::class.java.also { aClass6173 = it } else aClass6173), Integer.TYPE))
//                method.setAccessible(true)
//                val `object` = method.invoke(null, inetsocketaddress.getHostName(), inetsocketaddress.getPort())
//                if (null != `object`) {
//                    val method_14_ = (AuthenticationInfo::class.java.getDeclaredMethod("supportsPreemptiveAuthorization"))
//                    method_14_.setAccessible(true)
//                    if ((method_14_.invoke(`object`, *arrayOfNulls<Any>(0)) as Boolean)) {
//                        val method_15_ = AuthenticationInfo::class.java.getDeclaredMethod("getHeaderName")
//                        method_15_.setAccessible(true)
//                        val method_16_ = (AuthenticationInfo::class.java.getDeclaredMethod("getHeaderValue", (if (aClass6174 == null) URL::class.java.also { aClass6174 = it } else aClass6174), (if (aClass6173 == null) (String::class.java.also { aClass6173 = it }) else aClass6173)))
//                        method_16_.setAccessible(true)
//                        val string_17_ = (method_15_.invoke(`object`, *arrayOfNulls<Any>(0)) as String?)
//                        val string_18_ = (method_16_.invoke(`object`, *(arrayOf<Any>(URL("https://" + (this.aString3476) + "/"), "https"))) as String?)
//                        string = string_17_ + ": " + string_18_
//                    }
//                }
            } catch (exception: Exception) {
                /* empty */
            }
            return method2052(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string)
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            val socket = Socket(proxy)
            socket.connect(InetSocketAddress((this.aString3476), (this.anInt3470)))
            return socket
        }
        return null
    }

    companion object {
        var aClass6173: Class<*>? = null
        var aClass6174: Class<*>? = null
    }
}
