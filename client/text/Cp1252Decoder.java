/* Cp1252Decoder - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
/**
 * RENAMED from `Class50_Sub1` (JODE-obfuscated).
 * CP1252 charset decoder. Extends Component47; reports 'Non cp1252 character 0x' for bytes outside the Windows-1252 code page when decoding client strings.
 */

final class Cp1252Decoder extends Component47 {
    static DisplayModeManagerContainer204 aClass101_5209;
    static int anInt5210;
    static int anInt5211;
    private final int anInt5212;
    private final int anInt5213;
    private int anInt5214;
    static int anInt5215;
    static int anInt5216;
    static StringCache aClass351_5217;
    static int anInt5218;
    /** True when the OS reported at least two display modes (fullscreen path allowed). */
    static boolean fullscreenAvailable = true;
    static int anInt5220;
    static boolean aBoolean5221 = false;
    private final int anInt5222;
    static String[] aStringArray5223;
    static boolean aBoolean5224;
    static boolean[][] aBooleanArrayArray5225;
    static boolean aBoolean5226;

    final void method455(int i, int i_0_, int i_1_) {
        anInt5220++;
        if (i_1_ >= -98) aBoolean5221 = false;
        int i_2_ = anInt5214 * i >> 12;
        int i_3_ = i * anInt5213 >> 12;
        int i_4_ = anInt5212 * i_0_ >> 12;
        int i_5_ = i_0_ * anInt5222 >> 12;
        DisplayModeManagerContainer356.method2267(10499, i_5_, i_2_, this.anInt865, this.anInt864, this.anInt862, i_4_, i_3_);
    }

    public static void method460(int i) {
        if (i != 2) method460(-52);
        aClass101_5209 = null;
        aBooleanArrayArray5225 = null;
        aStringArray5223 = null;
        aClass351_5217 = null;
    }

    Cp1252Decoder(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
        super(i_9_, i_10_, i_11_);
        anInt5214 = i;
        anInt5222 = i_8_;
        anInt5213 = i_7_;
        anInt5212 = i_6_;
    }

    final void method457(int i, int i_12_, int i_13_) {
        anInt5211++;
        if (i_13_ >= -29) method460(-42);
    }

    final void method456(int i, int i_14_, int i_15_) {
        if (i <= 87) anInt5214 = -17;
        anInt5218++;
        int i_16_ = i_14_ * anInt5214 >> 12;
        int i_17_ = anInt5213 * i_14_ >> 12;
        int i_18_ = anInt5212 * i_15_ >> 12;
        int i_19_ = i_15_ * anInt5222 >> 12;
        GraphicsToolkit.method3641(i_18_, i_19_, (byte) -75, this.anInt864, i_17_, i_16_);
    }

    static final byte[] unwrapBytes(boolean bool, Object object, int i) {
        anInt5215++;
        if (object == null) return null;
        if (object instanceof byte[]) {
            byte[] is = (byte[]) object;
            if (bool) return GlToolkitSub3.texStorage2D(is, 0);
            return is;
        }
        if (i != 53146732) return null;
        if (object instanceof AbstractBuffer) {
            AbstractBuffer class344 = (AbstractBuffer) object;
            return class344.toByteArray(-3672);
        }
        throw new IllegalArgumentException();
    }

    static final char method462(byte i, int i_20_) {
        anInt5216++;
        int i_21_ = 0xff & i;
        if (i_21_ == 0) throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(i_21_, 16) + " provided");
        if (i_21_ >= 128 && i_21_ < 160) {
            int i_22_ = Component352.cp1252HighChars[i_21_ + -128];
            if (i_22_ == 0) i_22_ = 63;
            i_21_ = i_22_;
        }
        if (i_20_ != -128) method463(null, false);
        return (char) i_21_;
    }

    static final int[] method463(ParticleSystem class348_sub47, boolean bool) {
        anInt5210++;
        Buffer class348_sub49 = new Buffer(518);
        int[] is = new int[4];
        for (int i = 0; i < 4; i++)
            is[i] = (int) (Math.random() * 9.9999999E7);
        class348_sub49.writeByte(bool, 10);
        class348_sub49.writeInt((byte) 114, is[0]);
        class348_sub49.writeInt((byte) 97, is[1]);
        class348_sub49.writeInt((byte) 109, is[2]);
        class348_sub49.writeInt((byte) 105, is[3]);
        for (int i = 0; i < 10; i++)
            class348_sub49.writeInt((byte) 120, (int) (9.9999999E7 * Math.random()));
        class348_sub49.writeShort((byte) 107, (int) (9.9999999E7 * Math.random()));
        class348_sub49.applyRsa(Sprite.aBigInteger6921, (byte) -98, Component269.aBigInteger8762);
        class348_sub47.particleBuffer.writeBytes(class348_sub49.offset, 0, class348_sub49.payload, 80);
        return is;
    }

    static {
        aClass351_5217 = new StringCache(17, 8);
        aBooleanArrayArray5225 = (new boolean[][]{new boolean[4], {false, true, true, false}, {true, false, true, false}, {true, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {true, true, false, false}, new boolean[4], {false, true, false, true}, new boolean[4]});
        aBoolean5226 = false;
        aBoolean5224 = false;
    }
}
