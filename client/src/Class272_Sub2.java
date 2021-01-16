/* Class272_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public final class Class272_Sub2 extends Class272
{
	private ProxySelector aProxySelector6172 = ProxySelector.getDefault();
	static Class aClass6173;
	static Class aClass6174;

	private final Socket method2052(String string, int i, String string_0_)
	throws IOException {
		Socket socket = new Socket(string, i);
		socket.setSoTimeout(10000);
		OutputStream outputstream = socket.getOutputStream();
		if (string_0_ != null)
			outputstream.write(("CONNECT " + ((Class272_Sub2) this).aString3476
					+ ":" + ((Class272_Sub2) this).anInt3470
					+ " HTTP/1.0\n" + string_0_ + "\n\n")
					.getBytes(Charset.forName("ISO-8859-1")));
		else
			outputstream.write(("CONNECT " + ((Class272_Sub2) this).aString3476
					+ ":" + ((Class272_Sub2) this).anInt3470
					+ " HTTP/1.0\n\n")
					.getBytes(Charset.forName("ISO-8859-1")));
		outputstream.flush();
		BufferedReader bufferedreader
		= new BufferedReader(new InputStreamReader(socket
				.getInputStream()));
		String string_1_ = bufferedreader.readLine();
		if (string_1_ != null) {
			if (string_1_.startsWith("HTTP/1.0 200")
					|| string_1_.startsWith("HTTP/1.1 200"))
				return socket;
			if (string_1_.startsWith("HTTP/1.0 407")
					|| string_1_.startsWith("HTTP/1.1 407")) {
				int i_2_ = 0;
				string_1_ = bufferedreader.readLine();
				String string_3_ = "proxy-authenticate: ";
				for (/**/; null != string_1_ && i_2_ < 50;
				string_1_ = bufferedreader.readLine()) {
					if (string_1_.toLowerCase().startsWith(string_3_)) {
						string_1_
						= string_1_.substring(string_3_.length()).trim();
						int i_4_ = string_1_.indexOf(' ');
						if (0 != (i_4_ ^ 0xffffffff))
							string_1_ = string_1_.substring(0, i_4_);
						throw new IOException_Sub1(string_1_);
					}
					i_2_++;
				}
				throw new IOException_Sub1("");
			}
		}
		outputstream.close();
		bufferedreader.close();
		socket.close();
		return null;
	}

	final Socket method2050(int i) throws IOException
	{
		boolean flag1;
		boolean flag = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if(!flag)
			System.setProperty("java.net.useSystemProxies", "true");
		flag1 = -444 == ~anInt3470;
		IOException_Sub1 ioexception_sub1;
		Object aobj1[];
		int j;
		if(i >= -100)
			return (Socket)null;
		List list;
		List list1;
		try {
			list = aProxySelector6172.select(new URI((flag1 ? "https" : "http") + "://" + aString3476));
			list1 = aProxySelector6172.select(new URI((flag1 ? "http" : "https") + "://" + aString3476));
		}
		catch(URISyntaxException urisyntaxexception) {
			return method2047((byte)121);
		}
		list.addAll(list1);
		Object aobj[] = list.toArray();
		ioexception_sub1 = null;
		aobj1 = aobj;
		j = 0;

		for (; j < aobj1.length; ++j) {
			Object localObject2 = aobj1[j];

			Proxy localProxy = (Proxy)localObject2;
			try {
				Socket localSocket = method2053(localProxy, (byte)125);
				if (localSocket != null) {
					return localSocket;
				}
			}
			catch (IOException_Sub1 localIOException_Sub1) {
				ioexception_sub1 = localIOException_Sub1;
			}
			catch (IOException localIOException) {
			}
		}
		if(ioexception_sub1 != null)
			throw ioexception_sub1;
		else
			return method2047((byte)92);
	}

	private final Socket method2053(Proxy proxy, byte i) throws IOException {
		if (proxy.type() == Proxy.Type.DIRECT)
			return method2047((byte) 126);
		java.net.SocketAddress socketaddress = proxy.address();
		if (!(socketaddress instanceof InetSocketAddress))
			return null;
		InetSocketAddress inetsocketaddress
		= (InetSocketAddress) socketaddress;
		if (i != 125)
			return null;
		if (proxy.type() != Proxy.Type.HTTP) {
			if (proxy.type() == Proxy.Type.SOCKS) {
				Socket socket = new Socket(proxy);
				socket.connect(new InetSocketAddress((((Class272_Sub2) this)
						.aString3476),
						(((Class272_Sub2) this)
								.anInt3470)));
				return socket;
			}
		} else {
			String string = null;
			try {
				Class var_class
				= (Class.forName
						("sun.net.www.protocol.http.AuthenticationInfo"));
				Method method
				= (var_class.getDeclaredMethod
						("getProxyAuth",
								(new Class[]
								           { (aClass6173 == null
								        		   ? aClass6173 = method2054("java.lang.String")
								        				   : aClass6173),
								        				   Integer.TYPE })));
				method.setAccessible(true);
				Object object
				= method.invoke(null, (new Object[]
				                                  { inetsocketaddress.getHostName(),
						new Integer(inetsocketaddress
								.getPort()) }));
				if (null != object) {
					Method method_14_
					= (var_class.getDeclaredMethod
							("supportsPreemptiveAuthorization", new Class[0]));
					method_14_.setAccessible(true);
					if (((Boolean) method_14_.invoke(object, new Object[0]))
							.booleanValue()) {
						Method method_15_
						= var_class.getDeclaredMethod("getHeaderName",
								new Class[0]);
						method_15_.setAccessible(true);
						Method method_16_
						= (var_class.getDeclaredMethod
								("getHeaderValue",
										(new Class[]
										           { (aClass6174 == null
										        		   ? aClass6174 = method2054("java.net.URL")
										        				   : aClass6174),
										        				   (aClass6173 == null
										        						   ? (aClass6173
										        								   = method2054("java.lang.String"))
										        								   : aClass6173) })));
						method_16_.setAccessible(true);
						String string_17_
						= ((String)
								method_15_.invoke(object, new Object[0]));
						String string_18_
						= ((String)
								method_16_.invoke(object,
										(new Object[]
										            { new URL("https://"
										            		+ (((Class272_Sub2)
										            				this)
										            				.aString3476)
										            				+ "/"),
										            "https" })));
						string = string_17_ + ": " + string_18_;
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
			return method2052(inetsocketaddress.getHostName(),
					inetsocketaddress.getPort(), string);
		}
		return null;
	}

	static Class method2054(String string) {
		Class var_class = null;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			try {
				throw new NoClassDefFoundError().initCause(classnotfoundexception);
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return var_class;
	}
}
