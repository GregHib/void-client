/* DisplayModeManagerContainer91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer91
/**
 * RENAMED from `Class27` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt387;
    static int anInt388 = 0;
    static LruCache aClass356_389 = new LruCache(4);
    static int anInt390;
    static int anInt391;
    static int anInt392;
    static int anInt393;
    static int anInt394;
    static StringCache aClass351_395 = new StringCache(49, 6);
    static int anInt396 = -1;
    static int anInt397;
    static StringCache aClass351_398 = new StringCache(23, 8);
    static DisplayModeManagerContainer196 aClass341_399 = new DisplayModeManagerContainer196();

    static final void method312(int i, byte i_0_) {
        Component377.anInt859 = -1;
        if (i != 37) {
            if (i != 50) {
                if (i != 75) {
                    if (i != 100) {
                        if (i == 200) DisplayModeManagerContainer229.aFloat1249 = 16.0F;
                    } else DisplayModeManagerContainer229.aFloat1249 = 8.0F;
                } else DisplayModeManagerContainer229.aFloat1249 = 6.0F;
            } else DisplayModeManagerContainer229.aFloat1249 = 4.0F;
        } else DisplayModeManagerContainer229.aFloat1249 = 3.0F;
        anInt397++;
        Component377.anInt859 = -1;
        if (i_0_ != 56) anInt394 = 32;
    }

    static final String method313(long l, int i) {
        try {
            anInt392++;
            if (l <= 0L || l >= 6582952005840035281L) return null;
            if (l % 37L == 0L) return null;
            int i_1_ = 0;
            for (long l_2_ = l; l_2_ != 0; l_2_ /= 37L)
                i_1_++;
            if (i >= -82) anInt396 = -58;
            StringBuffer stringbuffer = new StringBuffer(i_1_);
            while (l != 0) {
                long l_3_ = l;
                l /= 37L;
                stringbuffer.append(Component377.aCharArray852[(int) (-(37L * l) + l_3_)]);
            }
            return stringbuffer.reverse().toString();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "ht.A(" + l + ',' + i + ')');
        }
    }

    static final void method314(byte i, int i_4_) {
        if (i >= -31) anInt394 = -128;
        Component225.anInt481 = i_4_;
        WaterShader.anInt7379 = 3;
        anInt390++;
        LoadingManager.anInt2173 = 100;
        DefinitionSub30.anInt9399 = -1;
    }

    /** Index of {@code string} in {@link Component185#languageNames}, or −1. */
    static final int languageIdFromName(byte i, String string) {
        anInt393++;
        int i_5_ = 0;
        if (i <= 70) return -84;
        for (/**/; i_5_ < Component185.languageNames.length; i_5_++) {
            if (Component185.languageNames[i_5_].equalsIgnoreCase(string)) return i_5_;
        }
        return -1;
    }

    public static void method316(byte i) {
        aClass356_389 = null;
        aClass351_398 = null;
        aClass341_399 = null;
        if (i != -94) method313(98L, -24);
        aClass351_395 = null;
    }

    static final void method317(String string, int i, boolean bool) {
        anInt391++;
        if (string != null) {
            if (MenuEntry.ignoreCount >= 100) DisplayModeManagerContainer213.method544((FriendsIgnoreList.aClass274_3522.getLocalized(ObjectDeserializer.languageId, 544)), false, 4);
            else {
                String string_6_ = DebugPanicSub1.method2127(2, string);
                if (string_6_ != null) {
                    for (int i_7_ = 0; (i_7_ < MenuEntry.ignoreCount); i_7_++) {
                        String string_8_ = DebugPanicSub1.method2127(2, (ObjectDefinition.ignoreNames[i_7_]));
                        if (string_8_ != null && string_8_.equals(string_6_)) {
                            DisplayModeManagerContainer213.method544((string + (FriendsIgnoreList.aClass274_3523.getLocalized(ObjectDeserializer.languageId, 544))), false, 4);
                            return;
                        }
                        if (DefinitionSub21.ignoreLastNames[i_7_] != null) {
                            String string_9_ = (DebugPanicSub1.method2127(2, (DefinitionSub21.ignoreLastNames[i_7_])));
                            if (string_9_ != null && string_9_.equals(string_6_)) {
                                DisplayModeManagerContainer213.method544(string + (FriendsIgnoreList.aClass274_3523.getLocalized((ObjectDeserializer.languageId), 544)), false, 4);
                                return;
                            }
                        }
                    }
                    if (i >= 90) {
                        for (int i_10_ = 0; i_10_ < DefinitionSub30.friendCount; i_10_++) {
                            String string_11_ = DebugPanicSub1.method2127(2, (Component178.friendNames[i_10_]));
                            if (string_11_ != null && string_11_.equals(string_6_)) {
                                DisplayModeManagerContainer213.method544(((FriendsIgnoreList.aClass274_3528.getLocalized(ObjectDeserializer.languageId, 544)) + string + (FriendsIgnoreList.aClass274_3529.getLocalized(ObjectDeserializer.languageId, 544))), false, 4);
                                return;
                            }
                            if (ShaderProgramSub2.friendFormerNames[i_10_] != null) {
                                String string_12_ = (DebugPanicSub1.method2127(2, (ShaderProgramSub2.friendFormerNames[i_10_])));
                                if (string_12_ != null && string_12_.equals(string_6_)) {
                                    DisplayModeManagerContainer213.method544(((FriendsIgnoreList.aClass274_3528.getLocalized(ObjectDeserializer.languageId, 544)) + string + (FriendsIgnoreList.aClass274_3529.getLocalized(ObjectDeserializer.languageId, 544))), false, 4);
                                    return;
                                }
                            }
                        }
                        if (DebugPanicSub1.method2127(2, (Component72.localPlayer.username)).equals(string_6_)) DisplayModeManagerContainer213.method544((FriendsIgnoreList.aClass274_3525.getLocalized(ObjectDeserializer.languageId, 544)), false, 4);
                        else {
                            Component298.anInt4628++;
                            ParticleSystem class348_sub47 = (ParticleShader.createOutboundPacket(HashNodeSub19.aClass351_9687, DisplayModeManagerContainer64.aClass77_9029, -94));
                            class348_sub47.particleBuffer.writeByte(false, Component31.method1745(string, -65) - -1);
                            class348_sub47.particleBuffer.writeString((byte) -5, string);
                            class348_sub47.particleBuffer.writeByte(false, !bool ? 0 : 1);
                            HashNodeSub14.enqueueOutboundPacket(-116, class348_sub47);
                        }
                    }
                }
            }
        }
    }
}
