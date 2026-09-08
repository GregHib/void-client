/* DisplayModeManagerContainer332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer332
/**
 * RENAMED from `Class28` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ implements Interface15 {
    static int anInt4996;
    static DisplayModeManagerContainer369 aClass223_4997 = new DisplayModeManagerContainer369(6, 1);
    static Component183 aClass114_4998;
    static int anInt4999 = 0;
    static String aString5000 = null;
    static String aString5001 = null;
    static boolean aBoolean5002 = false;

    public DisplayModeManagerContainer332() {
        /* empty */
    }

    public final String method54(int i, long l, Component161 class138, int[] is) {
        try {
            anInt4996++;
            if (RandomAccessFileReader.aClass138_3044 == class138) {
                Component208 class117 = NodeSub7.aClass33_6653.method337(true, is[0]);
                return class117.getString((int) l, 91);
            }
            if (Component40.aClass138_6321 == class138 || NodeBase.aClass138_7274 == class138) {
                ItemDefinition class213 = Exception_Sub1.itemDefinitions.getItemDefinition(i + -99, (int) l);
                return class213.itemName;
            }
            if (i != 1) method54(85, -41L, null, null);
            if (class138 == DefinitionGroup.aClass138_9530 || class138 == Component182.aClass138_9748 || DisplayModeManagerContainer5.aClass138_1213 == class138) return NodeSub7.aClass33_6653.method337(true, is[0]).getString((int) l, i ^ 0x48);
            return null;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("hu.A(" + i + ',' + l + ',' + (class138 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method318(int i) {
        aString5001 = null;
        aString5000 = null;
        int i_0_ = 74 / ((i - 58) / 49);
        aClass223_4997 = null;
        aClass114_4998 = null;
    }

    static {
        aClass114_4998 = new Component183(59, 3);
    }
}
