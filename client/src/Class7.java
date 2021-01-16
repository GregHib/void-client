/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public final class Class7
{
	private GraphicsDevice aGraphicsDevice157;
	private DisplayMode aDisplayMode158;

	public final void method209(Frame frame, int i, int i_0_, int i_1_,
			int i_2_) {
		aDisplayMode158 = aGraphicsDevice157.getDisplayMode();
		if (aDisplayMode158 == null)
			throw new NullPointerException();
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		method212(frame, (byte) 51);
		if (0 == i_2_) {
			int i_3_ = aDisplayMode158.getRefreshRate();
			DisplayMode[] displaymodes = aGraphicsDevice157.getDisplayModes();
			boolean bool = false;
			for (int i_4_ = 0;
			(displaymodes.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff);
			i_4_++) {
				if (i == displaymodes[i_4_].getWidth()
						&& i_0_ == displaymodes[i_4_].getHeight()
						&& displaymodes[i_4_].getBitDepth() == i_1_) {
					int i_5_ = displaymodes[i_4_].getRefreshRate();
					if (!bool
							|| Math.abs(-i_3_ + i_5_) < Math.abs(i_2_ + -i_3_)) {
						bool = true;
						i_2_ = i_5_;
					}
				}
			}
			if (!bool)
				i_2_ = i_3_;
		}
		aGraphicsDevice157.setDisplayMode(new DisplayMode(i, i_0_, i_1_,
				i_2_));
	}

	public final int[] method210() {
		DisplayMode[] displaymodes = aGraphicsDevice157.getDisplayModes();
		int[] is = new int[displaymodes.length << -1444763358];
		for (int i = 0; i < displaymodes.length; i++) {
			is[i << 1179533410] = displaymodes[i].getWidth();
			is[1 + (i << 856020194)] = displaymodes[i].getHeight();
			is[(i << -1137663966) + 2] = displaymodes[i].getBitDepth();
			is[(i << -2065826366) + 3] = displaymodes[i].getRefreshRate();
		}
		return is;
	}

	public final void method211() {
		if (aDisplayMode158 != null) {
			aGraphicsDevice157.setDisplayMode(aDisplayMode158);
			if (!aGraphicsDevice157.getDisplayMode().equals(aDisplayMode158))
				throw new RuntimeException
				("Did not return to correct resolution!");
			aDisplayMode158 = null;
		}
		method212(null, (byte) 104);
	}

	public Class7() throws Exception {
		GraphicsEnvironment graphicsenvironment
		= GraphicsEnvironment.getLocalGraphicsEnvironment();
		aGraphicsDevice157 = graphicsenvironment.getDefaultScreenDevice();
		if (!aGraphicsDevice157.isFullScreenSupported()) {
			GraphicsDevice[] graphicsdevices
			= graphicsenvironment.getScreenDevices();
			GraphicsDevice[] graphicsdevices_6_ = graphicsdevices;
			for (int i = 0; graphicsdevices_6_.length > i; i++) {
				GraphicsDevice graphicsdevice = graphicsdevices_6_[i];
				if (null != graphicsdevice
						&& graphicsdevice.isFullScreenSupported()) {
					aGraphicsDevice157 = graphicsdevice;
					return;
				}
			}
			throw new Exception();
		}
	}

	private final void method212(Frame frame, byte i) {
		boolean bool = false;
		if (i <= 47)
			method212(null, (byte) -25);
		try {
			Field field = Class.forName("sun.awt.Win32GraphicsDevice")
			.getDeclaredField("valid");
			field.setAccessible(true);
			boolean bool_7_
			= ((Boolean) field.get(aGraphicsDevice157)).booleanValue();
			if (bool_7_) {
				field.set(aGraphicsDevice157, Boolean.FALSE);
				bool = true;
			}
		} catch (Throwable throwable) {
			/* empty */
		}
		try {
			aGraphicsDevice157.setFullScreenWindow(frame);
		} catch (Throwable object) {
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice")
					.getDeclaredField("valid");
					field.set(aGraphicsDevice157, Boolean.TRUE);
				} catch (Exception e) {
				}
			}
		}
		if (bool) {
			try {
				Field field = Class.forName("sun.awt.Win32GraphicsDevice")
				.getDeclaredField("valid");
				field.set(aGraphicsDevice157, Boolean.TRUE);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}
}
