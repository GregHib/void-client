/* RSACipher - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class52` (JODE-obfuscated).
 * RSA cipher. Holds the RSA public exponent BigInteger("10001",16) (=65537) and implements Interface12 (method51 -> DisplayModeManagerContainer369). method490(byte, Buffer) builds a ciphered block.
 */

import java.awt.*;
import java.math.BigInteger;

final class RSACipher implements Interface12 {
    static int anInt4894;
    static int anInt4895;
    static BigInteger rsaPublicExponent = new BigInteger("10001", 16);
    static int anInt4897;
    static int anInt4898;
    int anInt4899;
    static int anInt4900;
    static Component161 aClass138_4901;
    static int anInt4902;
    static boolean aBoolean4903 = false;
    static Frame aFrame4904;
    static StringCache aClass351_4905;
    static int[] anIntArray4906;
    static StringCache aClass351_4907;

    static final CookieBuilder method490(byte i, Buffer class348_sub49) {
        anInt4897++;
        CookieBuilder class43 = new CookieBuilder();
        class43.anInt615 = class348_sub49.readUnsignedShort(842397944);
        class43.aClass348_Sub42_Sub10_614 = Component31.aClass355_5900.method3471(class43.anInt615, (byte) -90);
        int i_0_ = -91 / ((9 - i) / 54);
        return class43;
    }

    public final DisplayModeManagerContainer369 method51(byte i) {
        anInt4894++;
        if (i < 116) return null;
        return Component386.aClass223_2868;
    }

    static final void method491(byte i) {
        for (int i_1_ = 0; (ObjectDeserializer.aByteArrayArrayArray6962.length > i_1_); i_1_++) {
            for (int i_2_ = 0; i_2_ < ObjectDeserializer.aByteArrayArrayArray6962[0].length; i_2_++) {
                for (int i_3_ = 0; (ObjectDeserializer.aByteArrayArrayArray6962[0][0].length > i_3_); i_3_++)
                    ObjectDeserializer.aByteArrayArrayArray6962[i_1_][i_2_][i_3_] = (byte) 0;
            }
        }
        int i_4_ = 119 / ((i - 47) / 34);
        anInt4902++;
    }

    public static void method492(int i) {
        aClass351_4905 = null;
        aClass351_4907 = null;
        aFrame4904 = null;
        if (i < -17) {
            rsaPublicExponent = null;
            anIntArray4906 = null;
            aClass138_4901 = null;
        }
    }

    RSACipher(int i) {
        this.anInt4899 = i;
    }

    static final void method493(boolean bool) {
        if (ShaderCompilerSub2.aClass56Array6515 == null) {
            ShaderCompilerSub2.aClass56Array6515 = LoadingState.allStages(-91);
            RSARequest.currentLoadingState = ShaderCompilerSub2.aClass56Array6515[0];
            Component69.aLong3660 = Component240.currentTimeMillis(-119);
        }
        anInt4900++;
        if (ObjectDefinition.aClass311_897 == null) DisplayModeManagerContainer88.method726(116);
        LoadingState class56 = RSARequest.currentLoadingState;
        int i = LoadingManager.pulseLoading(-28660);
        if (class56 == RSARequest.currentLoadingState) {
            DisplayModeManagerContainer190.aString5420 = RSARequest.currentLoadingState.aClass274_1012.getLocalized(ObjectDeserializer.languageId, 544);
            if (RSARequest.currentLoadingState.isBlocking) Component111.anInt3236 = (i * ((RSARequest.currentLoadingState.currentProgress) + -(RSARequest.currentLoadingState.maxProgress)) / 100 + (RSARequest.currentLoadingState.maxProgress));
            if (RSARequest.currentLoadingState.isSmooth) DisplayModeManagerContainer190.aString5420 += Component111.anInt3236 + "%";
            if (Loader.debug && Component111.anInt3236 != lastLoggedLoadPct
                    && (Component111.anInt3236 < 5 || Component111.anInt3236 % 5 == 0)) {
                lastLoggedLoadPct = Component111.anInt3236;
                System.out.println("load " + DisplayModeManagerContainer190.aString5420
                        + " stage=" + RSARequest.currentLoadingState.getStageId(-120));
            }
        } else if (RSARequest.currentLoadingState == LoadingState.aClass56_1043) {
            ObjectDefinition.aClass311_897 = null;
            Buffer.setClientState(2, 3);
        } else {
            DisplayModeManagerContainer190.aString5420 = class56.aClass274_1015.getLocalized(ObjectDeserializer.languageId, 544);
            if (RSARequest.currentLoadingState.isSmooth) DisplayModeManagerContainer190.aString5420 += class56.currentProgress + "%";
            Component111.anInt3236 = class56.currentProgress;
            if (RSARequest.currentLoadingState.isBlocking || class56.isBlocking) Component69.aLong3660 = Component240.currentTimeMillis(-128);
            if (Loader.debug) {
                lastLoggedLoadPct = -1;
                System.out.println("load stage " + class56.getStageId(-120)
                        + "->" + RSARequest.currentLoadingState.getStageId(-120)
                        + " " + DisplayModeManagerContainer190.aString5420);
            }
        }
        if (bool == true) {
            if (ObjectDefinition.aClass311_897 != null) {
                ObjectDefinition.aClass311_897.method2316((RSARequest.currentLoadingState), DisplayModeManagerContainer190.aString5420, Component111.anInt3236, Component69.aLong3660, false);
                if (Component280.anInterface16Array2447 != null) {
                    for (int i_5_ = Component121.anInt4544 - -1; (Component280.anInterface16Array2447.length > i_5_); i_5_++) {
                        if (Component280.anInterface16Array2447[i_5_].method60(-19079) >= 100 && Component121.anInt4544 == -1 + i_5_ && Component49.clientState >= 1 && ObjectDefinition.aClass311_897.method2322(0)) {
                            try {
                                Component280.anInterface16Array2447[i_5_].method57(117);
                            } catch (Exception exception) {
                                Component280.anInterface16Array2447 = null;
                                break;
                            }
                            ObjectDefinition.aClass311_897.method2321(10559, Component280.anInterface16Array2447[i_5_]);
                            Component121.anInt4544++;
                            if ((Component121.anInt4544 >= (-1 + Component280.anInterface16Array2447.length)) && Component280.anInterface16Array2447.length > 1) Component121.anInt4544 = !Component134.aClass111_5813.method1044(26) ? -1 : 0;
                        }
                    }
                }
            }
        }
    }

    static final int method494(int i, int i_6_) {
        if (i <= 78) rsaPublicExponent = null;
        anInt4898++;
        return 0x7f & i_6_;
    }

    private static int lastLoggedLoadPct = -1;

    static {
        aClass138_4901 = new Component161(12, 0, 1, 0);
        anIntArray4906 = new int[4];
        aClass351_4905 = new StringCache(44, 3);
        aClass351_4907 = new StringCache(48, 11);
    }
}
