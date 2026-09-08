/* RenderableSub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class RenderableSub9
/**
 * RENAMED from `Class318_Sub9` (JODE-obfuscated).
 * Evidence: subclass of Renderable (hierarchy)
 */ extends Renderable {
    static int anInt6467;
    RenderableSub9 aClass318_Sub9_6468;
    RenderableSub9 aClass318_Sub9_6469;

    final void method2514(int i) {
        anInt6467++;
        if (this.aClass318_Sub9_6468 != null) {
            this.aClass318_Sub9_6468.aClass318_Sub9_6469 = this.aClass318_Sub9_6469;
            this.aClass318_Sub9_6469.aClass318_Sub9_6468 = this.aClass318_Sub9_6468;
            this.aClass318_Sub9_6469 = null;
            this.aClass318_Sub9_6468 = null;
            int i_0_ = 123 / ((6 - i) / 37);
        }
    }

    public RenderableSub9() {
        /* empty */
    }
}
