/* Component52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component52
/**
 * RENAMED from `Class256` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt3294;
    static int[] anIntArray3295 = new int[25];

    static final RadixParser method1943(boolean bool, int i) {
        anInt3294++;
        RadixParser class174 = ((RadixParser) DisplayModeManagerContainer343.aClass60_8732.get(i, -78));
        if (class174 != null) return class174;
        byte[] is = Component54.aClass45_8670.getFile(-1860, 1, i);
        class174 = new RadixParser();
        if (bool != false) method1944(64);
        class174.anInt2303 = i;
        if (is != null) class174.method1336(83, new Buffer(is));
        class174.method1337(-1);
        if (class174.anInt2296 == 2 && (Component317.aClass356_8679.get(i, -6008) == null)) {
            Component317.aClass356_8679.put((byte) 87, i, new NodeSub35(DebugPanicSub1.anInt8492));
            Component248.aClass174Array311[DebugPanicSub1.anInt8492++] = class174;
        }
        DisplayModeManagerContainer343.aClass60_8732.putOne(class174, i, (byte) -109);
        return class174;
    }

    public static void method1944(int i) {
        anIntArray3295 = null;
        if (i != 1) method1944(-45);
    }
}
