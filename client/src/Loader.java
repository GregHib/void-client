import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.net.URL;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Loader extends Applet {

	public static Properties aProperties1 = new Properties();
	public JFrame aJFrame2;
	public JPanel aJPanel3 = new JPanel();
	public static boolean isrs = true;

	public static void main(String[] arg0) {
		Loader l = new Loader();
		l.doFrame();
	}

	@Override
	public void init() {
		doApplet();
	}

	void doApplet() {
		setParms();
		startClient();
	}

	public void doFrame() {
		setParms();
		openFrame();
		startClient();
	}

	void setParms() {
		aProperties1.put("cabbase", "g.cab");
		aProperties1
		.put("java_arguments", "-Xmx102m -Dsun.java2d.noddraw=true");
		aProperties1.put("colourid", "0");
		aProperties1.put("worldid", "16");
		aProperties1.put("lobbyid", "15");
		aProperties1.put("lobbyaddress", isrs ? "lobby16.runescape.com": "127.0.0.1");
		aProperties1.put("demoid", "0");
		aProperties1.put("demoaddress", "");
		aProperties1.put("modewhere", "0");
		aProperties1.put("modewhat", "0");
		aProperties1.put("lang", "0");
		aProperties1.put("objecttag", "0");
		aProperties1.put("js", "1");
		aProperties1.put("game", "0");
		aProperties1.put("affid", "0");
		aProperties1.put("advert", "1");
		aProperties1.put("settings",
		"wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk");
		aProperties1.put("country", "0");
		aProperties1.put("haveie6", "0");
		aProperties1.put("havefirefox", "1");
		aProperties1.put("cookieprefix", "");
		aProperties1.put("cookiehost", "rs2rsps.no-ip.org");
		aProperties1.put("cachesubdirid", "0");
		aProperties1.put("crashurl", "");
		aProperties1.put("unsignedurl", "");
		aProperties1.put("sitesettings_member", "1");
		aProperties1.put("frombilling", "false");
		aProperties1.put("sskey", "");
		aProperties1.put("force64mb", "false");
		aProperties1.put("worldflags", "8");
	}

	void openFrame() {
		aJFrame2 = new JFrame("RS2RSPS");
		aJFrame2.setLayout(new BorderLayout());
		aJPanel3.setLayout(new BorderLayout());
		aJPanel3.add(this);
		aJPanel3.setPreferredSize(new Dimension(765, 503));
		aJFrame2.getContentPane().add(aJPanel3, "Center");
		aJFrame2.pack();
		aJFrame2.setVisible(true);
	}

	void startClient() {
		try {
			Applet_Sub1.provideLoaderApplet(this);
			client var_client = new client();
			var_client.init();
			var_client.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getParameter(String arg0) {
		return (String) aProperties1.get(arg0);
	}

	@Override
	public URL getDocumentBase() {
		return getCodeBase();
	}

	@Override
	public URL getCodeBase() {
		URL url;
		try {
			if (isrs)
				url = new URL("http://world16.runescape.com");
			else
				url = new URL("http://127.0.0.1");
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
		return url;
	}
}