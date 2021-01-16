/* Class279_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

final class Class279_Sub1 extends Class279
{
    private int anInt6175;
    private byte[] aByteArray6176;
    private SourceDataLine aSourceDataLine6177;
    private boolean aBoolean6178 = false;
    private AudioFormat anAudioFormat6179;
    static Class aClass6180;
    
    final void method2091() {
	if (null != aSourceDataLine6177) {
	    aSourceDataLine6177.close();
	    aSourceDataLine6177 = null;
	}
    }
    
    final void method2082(int i) throws LineUnavailableException {
	try {
	    DataLine.Info info
		= (new DataLine.Info
		   ((aClass6180 == null
		     ? (aClass6180
			= method2096("javax.sound.sampled.SourceDataLine"))
		     : aClass6180),
		    anAudioFormat6179, i << (Class282.aBoolean3652 ? 2 : 1)));
	    aSourceDataLine6177 = (SourceDataLine) AudioSystem.getLine(info);
	    aSourceDataLine6177.open();
	    aSourceDataLine6177.start();
	    anInt6175 = i;
	} catch (LineUnavailableException lineunavailableexception) {
	    if (1 != Class286_Sub4.method2155(i, (byte) 43))
		method2082(Class33.method340(i, (byte) 108));
	    else {
		aSourceDataLine6177 = null;
		throw lineunavailableexception;
	    }
	}
    }
    
    final void method2095(Component component) {
	Mixer.Info[] infos = AudioSystem.getMixerInfo();
	if (null != infos) {
	    Mixer.Info[] infos_0_ = infos;
	    for (int i = 0; i < infos_0_.length; i++) {
		Mixer.Info info = infos_0_[i];
		if (info != null) {
		    String string = info.getName();
		    if (null != string
			&& string.toLowerCase().indexOf("soundmax") >= 0)
			aBoolean6178 = true;
		}
	    }
	}
	anAudioFormat6179
	    = new AudioFormat((float) Class22.anInt339, 16,
			      Class282.aBoolean3652 ? 2 : 1, true, false);
	aByteArray6176 = new byte[256 << (!Class282.aBoolean3652 ? 1 : 2)];
    }
    
    final int method2081() {
	return anInt6175 - (aSourceDataLine6177.available()
			    >> (Class282.aBoolean3652 ? 2 : 1));
    }
    
    final void method2083() throws LineUnavailableException {
	aSourceDataLine6177.flush();
	if (aBoolean6178) {
	    aSourceDataLine6177.close();
	    aSourceDataLine6177 = null;
	    DataLine.Info info
		= (new DataLine.Info
		   ((aClass6180 == null
		     ? (aClass6180
			= method2096("javax.sound.sampled.SourceDataLine"))
		     : aClass6180),
		    anAudioFormat6179,
		    anInt6175 << (!Class282.aBoolean3652 ? 1 : 2)));
	    aSourceDataLine6177 = (SourceDataLine) AudioSystem.getLine(info);
	    aSourceDataLine6177.open();
	    aSourceDataLine6177.start();
	}
    }
    
    final void method2094() {
	int i = 256;
	if (Class282.aBoolean3652)
	    i <<= 1;
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    int i_2_ = ((Class279_Sub1) this).anIntArray3603[i_1_];
	    if ((i_2_ + 8388608 & ~0xffffff) != 0)
		i_2_ = 0x7fffff ^ i_2_ >> 31;
	    aByteArray6176[i_1_ * 2] = (byte) (i_2_ >> 8);
	    aByteArray6176[i_1_ * 2 + 1] = (byte) (i_2_ >> 16);
	}
	aSourceDataLine6177.write(aByteArray6176, 0, i << 1);
    }
    
    static Class method2096(String string) {
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
