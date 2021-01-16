/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import com.ms.com.ComFailException;
import com.ms.directX.DSBufferDesc;
import com.ms.directX.DSCursors;
import com.ms.directX.DirectSound;
import com.ms.directX.DirectSoundBuffer;
import com.ms.directX.WaveFormatEx;

public final class Class1 implements Interface20
{
    private DSBufferDesc[] aDSBufferDescArray5152;
    private DirectSoundBuffer[] aDirectSoundBufferArray5153;
    private int[] anIntArray5154;
    private DSCursors[] aDSCursorsArray5155 = new DSCursors[2];
    private boolean[] aBooleanArray5156;
    private int anInt5157;
    private int anInt5158;
    private byte[][] aByteArrayArray5159;
    private int[] anIntArray5160;
    private int anInt5161;
    private DirectSound aDirectSound5162;
    private WaveFormatEx aWaveFormatEx5163;
    private int[] anIntArray5164;
    
    public final void method77(byte i, int i_0_) {
	try {
		aDirectSoundBufferArray5153[i_0_].stop();
	} catch (ComFailException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	aBooleanArray5156[i_0_] = false;
	if (i > 96) {
	    aDirectSoundBufferArray5153[i_0_].setCurrentPosition(0);
	    anIntArray5160[i_0_] = 0;
	}
    }
    
    public final void method74(int i, byte i_1_) {
	if (aDirectSoundBufferArray5153[i] != null) {
	    try {
		aDirectSoundBufferArray5153[i].stop();
	    } catch (com.ms.com.ComFailException comfailexception) {
		/* empty */
	    }
	    aDirectSoundBufferArray5153[i] = null;
	}
	int i_2_ = 73 / ((i_1_ - 79) / 43);
    }
    
    public final void method76(int i, int[] is) {
	int i_3_ = is.length;
	if (i_3_ != 256 * anInt5157)
	    throw new IllegalArgumentException();
	int i_4_ = anIntArray5160[i] * anInt5161;
	for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
	    int i_6_ = is[i_5_];
	    if ((i_6_ + 8388608 & ~0xffffff) != 0)
		i_6_ = 0x7fffff ^ i_6_ >> 31;
	    aByteArrayArray5159[i][i_4_ + i_5_ * 2] = (byte) (i_6_ >> 8);
	    aByteArrayArray5159[i][i_4_ + i_5_ * 2 + 1] = (byte) (i_6_ >> 16);
	}
	aDirectSoundBufferArray5153[i].writeBuffer(i_4_, i_3_ * 2,
						   aByteArrayArray5159[i], 0);
	anIntArray5160[i] = anIntArray5160[i] + i_3_ / anInt5157 & 0xffff;
	if (!aBooleanArray5156[i]) {
	    aDirectSoundBufferArray5153[i].play(1);
	    aBooleanArray5156[i] = true;
	}
    }
    
    public final int method75(byte i, int i_7_) {
	if (i >= -79)
	    return -15;
	if (!aBooleanArray5156[i_7_])
	    return 0;
	aDirectSoundBufferArray5153[i_7_]
	    .getCurrentPosition(aDSCursorsArray5155[i_7_]);
	int i_8_ = aDSCursorsArray5155[i_7_].write / anInt5161;
	int i_9_ = anIntArray5160[i_7_] + -i_8_ & 0xffff;
	if ((anIntArray5164[i_7_] ^ 0xffffffff) > (i_9_ ^ 0xffffffff)) {
	    for (int i_10_ = 0xffff & i_8_ + -anIntArray5160[i_7_]; i_10_ > 0;
		 i_10_ -= 256)
		method76(i_7_, anIntArray5154);
	    i_9_ = 0xffff & -i_8_ + anIntArray5160[i_7_];
	}
	return i_9_;
    }
    
    public final void method78(int i, boolean bool, Component component,
			       int i_11_) throws Exception {
	if (anInt5158 == 0) {
	    if (i < 8000 || (i ^ 0xffffffff) < -48001)
		throw new IllegalArgumentException();
	    anInt5157 = !bool ? 1 : 2;
	    if (i_11_ != 27929)
		aDirectSound5162 = null;
	    anInt5161 = bool ? 4 : 2;
	    anIntArray5154 = new int[anInt5157 * 256];
	    aDirectSound5162.initialize(null);
	    aDirectSound5162.setCooperativeLevel(component, 2);
	    for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -3; i_12_++)
		aDSBufferDescArray5152[i_12_].flags = 16384;
	    aWaveFormatEx5163.avgBytesPerSec = anInt5161 * i;
	    aWaveFormatEx5163.formatTag = 1;
	    aWaveFormatEx5163.bitsPerSample = 16;
	    aWaveFormatEx5163.blockAlign = anInt5161;
	    aWaveFormatEx5163.channels = anInt5157;
	    anInt5158 = i;
	    aWaveFormatEx5163.samplesPerSec = i;
	}
    }
    
    public final void method79(int i, int i_13_, byte i_14_) throws Exception {
	if (anInt5158 == 0 || aDirectSoundBufferArray5153[i_13_] != null)
	    throw new IllegalStateException();
	int i_15_ = anInt5161 * 65536;
	if (aByteArrayArray5159[i_13_] == null
	    || i_15_ != aByteArrayArray5159[i_13_].length) {
	    aByteArrayArray5159[i_13_] = new byte[i_15_];
	    aDSBufferDescArray5152[i_13_].bufferBytes = i_15_;
	}
	aDirectSoundBufferArray5153[i_13_]
	    = aDirectSound5162.createSoundBuffer(aDSBufferDescArray5152[i_13_],
						 aWaveFormatEx5163);
	aBooleanArray5156[i_13_] = false;
	if (i_14_ < 106)
	    method74(-6, (byte) -123);
	anIntArray5160[i_13_] = 0;
	anIntArray5164[i_13_] = i;
    }
    
    public Class1() throws Exception {
	aDSBufferDescArray5152 = new DSBufferDesc[2];
	aBooleanArray5156 = new boolean[2];
	aDirectSoundBufferArray5153 = new DirectSoundBuffer[2];
	aByteArrayArray5159 = new byte[2][];
	anIntArray5160 = new int[2];
	anIntArray5164 = new int[2];
	aDirectSound5162 = new DirectSound();
	aWaveFormatEx5163 = new WaveFormatEx();
	for (int i = 0; (i ^ 0xffffffff) > -3; i++)
	    aDSBufferDescArray5152[i] = new DSBufferDesc();
	for (int i = 0; (i ^ 0xffffffff) > -3; i++)
	    aDSCursorsArray5155[i] = new DSCursors();
    }
}
