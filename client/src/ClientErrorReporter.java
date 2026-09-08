/* ClientErrorReporter - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
/**
 * RENAMED from `Class156` (JODE-obfuscated).
 * Client error reporter. Posts exceptions/messages to the clienterror.ws?c= endpoint (TheoraVideoPlayer.printClientError) for server-side error logging.
 */

import java.io.DataInputStream;
import java.net.URL;

final class ClientErrorReporter {
    static float aFloat2111;
    static int anInt2112;
    static String[] aStringArray2113 = new String[100];
    static int anInt2114;
    private HashNode aClass348_Sub42_2115;
    static int anInt2116;
    static int[] anIntArray2117 = new int[2];
    private HashTable aClass107_2118;
    static int anInt2119;
    static int anInt2120;

    /** True if tile flag bit 0x800 is set (roof / bridge-style). */
    static final boolean hasRoofFlag(int i, int i_0_, int i_1_) {
        anInt2116++;
        if (i_1_ > -4) aFloat2111 = -0.9273654F;
        return (0x800 & i) != 0;
    }

    public static void clearStatics(int i) {
        aStringArray2113 = null;
        anIntArray2117 = null;
        if (i != 30114) anIntArray2117 = null;
    }

    final HashNode firstHashNode(int i) {
        anInt2114++;
        if (i <= 7) firstHashNode(79);
        HashNode class348_sub42 = (aClass107_2118.sentinel.next);
        if (class348_sub42 == aClass107_2118.sentinel) {
            aClass348_Sub42_2115 = null;
            return null;
        }
        aClass348_Sub42_2115 = class348_sub42.next;
        return class348_sub42;
    }

    /** True if tile flags include walk-block / roof-style collision bits (0x18 or 0x220==544). */
    static final boolean hasCollisionBlockFlags(int i, int i_2_, int i_3_) {
        if (i_3_ > -111) clearStatics(-81);
        anInt2119++;
        return ((i_2_ & 0x18) != 0 | (0x220 & i_2_) == 544);
    }

    public ClientErrorReporter() {
        /* empty */
    }

    /** Build an error string and POST it to the applet error endpoint. */
    static final void reportError(String string, Throwable throwable, int i) {
        anInt2112++;
        do {
            try {
                String string_4_ = "";
                if (throwable != null) string_4_ = GlWaterShader.throwableToString(false, throwable);
                if (string != null) {
                    if (throwable != null) string_4_ += " | ";
                    string_4_ += string;
                }
                TheoraVideoPlayer.printClientError(string_4_, -5192);
                string_4_ = DisplayModeManagerContainer196.replaceAll("%3a", true, ":", string_4_);
                string_4_ = DisplayModeManagerContainer196.replaceAll("%40", true, "@", string_4_);
                string_4_ = DisplayModeManagerContainer196.replaceAll("%26", true, "&", string_4_);
                string_4_ = DisplayModeManagerContainer196.replaceAll("%23", true, "#", string_4_);
                if (NodeSub8.anApplet6662 != null) {
                    if (i != 15004) hasRoofFlag(-69, 63, 124);
                    Task class144 = (BuildType.aClass297_2993.openUrlStream(new URL(NodeSub8.anApplet6662.getCodeBase(), ("clienterror.ws?c=" + NodeSub1Sub3.anInt8818 + "&u=" + (BufferCacheSub2.aString8265 != null ? BufferCacheSub2.aString8265 : String.valueOf(Component84.aLong1507)) + "&v1=" + ReflectionInvoker.javaVendor + "&v2=" + ReflectionInvoker.javaVersion + "&e=" + string_4_)), 8362));
                    while (class144.status == 0) SpriteAtlasShader.sleep((byte) -123, 1L);
                    if (class144.status != 1) break;
                    DataInputStream datainputstream = (DataInputStream) class144.result;
                    datainputstream.read();
                    datainputstream.close();
                }
            } catch (Exception exception) {
                break;
            }
            break;
        } while (false);
    }

    final HashNode nextHashNode(byte i) {
        anInt2120++;
        if (i < 44) aStringArray2113 = null;
        HashNode class348_sub42 = aClass348_Sub42_2115;
        if (class348_sub42 == aClass107_2118.sentinel) {
            aClass348_Sub42_2115 = null;
            return null;
        }
        aClass348_Sub42_2115 = class348_sub42.next;
        return class348_sub42;
    }

    ClientErrorReporter(HashTable class107) {
        aClass107_2118 = class107;
    }
}
