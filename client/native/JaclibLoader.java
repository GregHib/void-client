/* JaclibLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class9` (JODE-obfuscated).
 * Jaclib native-memory loader. Loads the jaclib (JNI memory/GL binding) native library used by the toolkit.
 */

final class JaclibLoader {
    static int anInt167;
    static int[] anIntArray168 = {28, 35, 40, 44};
    static int anInt169 = -1;
    static int anInt170;
    /** Shared GraphicsToolkit instance used by debug overlay / early init paths. */
    static GraphicsToolkit toolkit;

    /** Load {@code jaclib} then {@code hw3d} native libraries. */
    static final boolean loadNatives(int i) {
        anInt170++;
        if (i != 27165) return false;
        if (!DefinitionSub19.tryLoadNativeLibrary(-30282, "jaclib")) return false;
        return DefinitionSub19.tryLoadNativeLibrary(-30282, "hw3d");
    }

    /** Nulls jaclib statics (toolkit + scratch) at shutdown. */
    public static void clearStatics(boolean bool) {
        anIntArray168 = null;
        if (bool != false) clearStatics(true);
        toolkit = null;
    }
}
