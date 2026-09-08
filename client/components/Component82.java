/* Component82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component82
/**
 * RENAMED from `Class31` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    int anInt420;
    private int anInt421;
    int anInt422;
    private String aString423;
    int anInt424;
    static int anInt425;
    int anInt426 = -1;
    static int anInt427;
    static int anInt428;
    private int anInt429 = -1;
    static Component22 aClass113_430;
    int anInt431;
    static int anInt432;
    private int anInt433;
    int anInt434;
    int anInt435;
    static int anInt436;
    static int anInt437;
    Component386 aClass219_438;
    private int anInt439;
    static int anInt440;
    static int anInt441;
    static int anInt442;
    static int anInt443 = 1;
    int anInt444;
    static int anInt445;
    static int anInt446;

    final Component24 method324(GraphicsToolkit var_ha, boolean bool) {
        anInt440++;
        if (bool != true) return null;
        if (anInt429 < 0) return null;
        Component24 class105 = (Component24) this.aClass219_438.aClass60_2862.get(anInt429, -62);
        if (class105 == null) {
            method330(var_ha, -41);
            class105 = (Component24) this.aClass219_438.aClass60_2862.get(anInt429, 53);
        }
        return class105;
    }

    final Component24 method325(GraphicsToolkit var_ha, int i) {
        anInt428++;
        if (anInt439 < 0) return null;
        Component24 class105 = (Component24) this.aClass219_438.aClass60_2862.get(anInt439, -59);
        if (i < 23) return null;
        if (class105 == null) {
            method330(var_ha, -118);
            class105 = (Component24) this.aClass219_438.aClass60_2862.get(anInt439, 123);
        }
        return class105;
    }

    static final void method326(byte i) {
        anInt442++;
        if (!Cp1252Decoder.aBoolean5224) {
            DummyClass.aBoolean10174 = true;
            NodeSub27.cameraPitchRate += (12.0F - NodeSub27.cameraPitchRate) / 2.0F;
            Cp1252Decoder.aBoolean5224 = true;
            if (i != 68) aClass113_430 = null;
        }
    }

    final Component24 method327(GraphicsToolkit var_ha, byte i) {
        anInt432++;
        if (anInt421 < 0) return null;
        Component24 class105 = (Component24) this.aClass219_438.aClass60_2862.get(anInt421, 118);
        if (class105 == null) {
            method330(var_ha, -66);
            class105 = (Component24) this.aClass219_438.aClass60_2862.get(anInt421, 119);
        }
        int i_0_ = 20 % ((i - 19) / 51);
        return class105;
    }

    public static void method328(int i) {
        if (i != 0) anInt425 = -128;
        aClass113_430 = null;
    }

    private final void method329(Buffer class348_sub49, int i, int i_1_) {
        if (i_1_ != 1) {
            if (i_1_ != 2) {
                if (i_1_ == 3) anInt421 = class348_sub49.readUnsignedShort(842397944);
                else if (i_1_ != 4) {
                    if (i_1_ == 5) anInt433 = class348_sub49.readUnsignedShort(842397944);
                    else if (i_1_ == 6) anInt439 = class348_sub49.readUnsignedShort(842397944);
                    else if (i_1_ != 7) {
                        if (i_1_ != 8) {
                            if (i_1_ != 9) {
                                if (i_1_ != 10) {
                                    if (i_1_ == 11) this.anInt426 = 0;
                                    else if (i_1_ == 12) this.anInt431 = class348_sub49.readUnsignedByte(255);
                                    else if (i_1_ == 13) this.anInt420 = class348_sub49.readShort(i ^ ~0x3547);
                                    else if (i_1_ == 14) this.anInt426 = class348_sub49.readUnsignedShort(842397944);
                                } else this.anInt422 = class348_sub49.readShort(13638);
                            } else this.anInt434 = class348_sub49.readUnsignedShort(842397944);
                        } else aString423 = class348_sub49.readGjstr2(i ^ 0x34af);
                    } else this.anInt424 = class348_sub49.readShort(13638);
                } else anInt429 = class348_sub49.readUnsignedShort(842397944);
            } else this.anInt444 = class348_sub49.readMedium(-1);
        } else this.anInt435 = class348_sub49.readUnsignedShort(842397944);
        if (i != -2) method333(-112, 38);
        anInt437++;
    }

    private final void method330(GraphicsToolkit var_ha, int i) {
        anInt446++;
        CacheStore class45 = this.aClass219_438.aClass45_2873;
        if (anInt421 >= 0 && this.aClass219_438.aClass60_2862.get(anInt421, 121) == null && class45.isSingletonFileReady(false, anInt421)) {
            Component170 class207 = Component170.method1512(class45, anInt421);
            this.aClass219_438.aClass60_2862.putOne(var_ha.method3691(class207, true), anInt421, (byte) -112);
        }
        if (anInt433 >= 0 && this.aClass219_438.aClass60_2862.get(anInt433, -99) == null && class45.isSingletonFileReady(false, anInt433)) {
            Component170 class207 = Component170.method1512(class45, anInt433);
            this.aClass219_438.aClass60_2862.putOne(var_ha.method3691(class207, true), anInt433, (byte) -128);
        }
        if (anInt429 >= 0 && this.aClass219_438.aClass60_2862.get(anInt429, 86) == null && class45.isSingletonFileReady(false, anInt429)) {
            Component170 class207 = Component170.method1512(class45, anInt429);
            this.aClass219_438.aClass60_2862.putOne(var_ha.method3691(class207, true), anInt429, (byte) -108);
        }
        if (i > -7) this.anInt434 = -14;
        if (anInt439 >= 0 && this.aClass219_438.aClass60_2862.get(anInt439, -83) == null && class45.isSingletonFileReady(false, anInt439)) {
            Component170 class207 = Component170.method1512(class45, anInt439);
            this.aClass219_438.aClass60_2862.putOne(var_ha.method3691(class207, true), anInt439, (byte) -101);
        }
    }

    final Component24 method331(GraphicsToolkit var_ha, byte i) {
        anInt441++;
        if (anInt433 < 0) return null;
        int i_2_ = -84 % ((i - 32) / 35);
        Component24 class105 = (Component24) this.aClass219_438.aClass60_2862.get(anInt433, -50);
        if (class105 == null) {
            method330(var_ha, -89);
            class105 = (Component24) this.aClass219_438.aClass60_2862.get(anInt433, -117);
        }
        return class105;
    }

    final void method332(int i, Buffer class348_sub49) {
        if (i > -119) method333(119, -71);
        for (; ; ) {
            int i_3_ = class348_sub49.readUnsignedByte(255);
            if (i_3_ == 0) break;
            method329(class348_sub49, -2, i_3_);
        }
        anInt427++;
    }

    final String method333(int i, int i_4_) {
        anInt445++;
        String string = aString423;
        if (i_4_ != 0) return null;
        for (; ; ) {
            int i_5_ = string.indexOf("%1");
            if (i_5_ < 0) break;
            string = (string.substring(0, i_5_) + Component211.method1171(i, 55, false) + string.substring(i_5_ - -2));
        }
        return string;
    }

    public Component82() {
        aString423 = "";
        this.anInt424 = 0;
        anInt433 = -1;
        this.anInt422 = 0;
        anInt439 = -1;
        this.anInt431 = -1;
        this.anInt434 = 70;
        this.anInt435 = -1;
        anInt421 = -1;
        this.anInt420 = 0;
        this.anInt444 = 16777215;
    }

    static {
        aClass113_430 = new Component22();
    }
}
