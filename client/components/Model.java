/* Model - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Model
/**
 * RENAMED from `Class12` (JODE-obfuscated) -> `Model`.
 * Evidence: root class; no distinctive extends/strings.
 * This is the **Model / Renderable** struct returned by the
 * `ModelProvider` interface (formerly `d`).
 */ {
    byte aByte198;
    boolean aBoolean199;
    int anInt200;
    byte aByte201;
    byte aByte202;
    int anInt203;
    boolean aBoolean204;
    byte aByte205;
    int anInt206;
    boolean aBoolean207;
    short aShort208;
    boolean aBoolean209;
    static int anInt210;
    byte aByte211;
    boolean aBoolean212;
    byte aByte213;
    static int anInt214;
    boolean aBoolean215;
    byte aByte216;
    boolean aBoolean217;
    boolean aBoolean218;

    static final void method223(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
        if (i_2_ > i) MenuOpener.fillInts(-27, i_2_, DisplayModeManagerContainer167.anIntArrayArray255[i_1_], i, i_0_);
        else MenuOpener.fillInts(-27, i, DisplayModeManagerContainer167.anIntArrayArray255[i_1_], i_2_, i_0_);
        anInt214++;
        if (i_3_ >= 20) {
            /* empty */
        }
    }

    static final void method224(byte i, int[][] is) {
        DisplayModeManagerContainer167.anIntArrayArray255 = is;
        anInt210++;
        if (i != -40) method224((byte) 100, null);
    }

    public Model() {
        /* empty */
    }
}
