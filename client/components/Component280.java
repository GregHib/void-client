/* Component280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component280
/**
 * RENAMED from `Class182` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    int anInt2445;
    static int anInt2446;
    static Interface16[] anInterface16Array2447;
    int anInt2448;
    static InputHandler aClass346_2449;
    static int anInt2450;
    int anInt2451;
    static int anInt2452;
    static int anInt2453;
    int anInt2454;
    int anInt2455;
    int anInt2456;

    static final void method1372(int i) {
        RuntimeException_Sub1.anInt4596 = i;
        Component205.anInt5969 = 1;
        anInt2452++;
        long l = 0L;
        if (OggStreamReader.aString9043 == null) {
            WorldNameText.method254(35, (byte) -101);
            return;
        } else {
            Buffer class348_sub49 = new Buffer(Component122.method878((Component362.method1039((OggStreamReader.aString9043), true)), -125));
            l = class348_sub49.readLong(-456577760);
            ObjectDeserializer.userHash = class348_sub49.readLong(-456577760);
        }
        Component72.method1138(DisplayModeManagerContainer91.method313(l, -100), true, "", (byte) -115);
    }

    static final void method1373(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
        anInt2450++;
        if (Component233.method2547(i, (byte) 84) && i_5_ == -1391) {
            if (Component14.aClass46ArrayArray8584[i] == null) client.method107((DefinitionSub33.openInterfaces[i]), -1, i_1_, i_10_, i_2_, i_7_, i_0_, i_8_, i_4_, i_3_, i_6_, i_9_);
            else client.method107(Component14.aClass46ArrayArray8584[i], -1, i_1_, i_10_, i_2_, i_7_, i_0_, i_8_, i_4_, i_3_, i_6_, i_9_);
        }
    }

    static final Component230 method1374(int i, Buffer class348_sub49) {
        if (i < 106) aClass346_2449 = null;
        anInt2453++;
        return new Component230(class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readMedium(-1), class348_sub49.readUnsignedByte(255));
    }

    public static void method1375(int i) {
        if (i != 5616) aClass346_2449 = null;
        aClass346_2449 = null;
        anInterface16Array2447 = null;
    }

    public Component280() {
        /* empty */
    }
}
