/* HashNodeSub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class HashNodeSub13
/**
 * RENAMED from `Class348_Sub42_Sub13` (JODE-obfuscated).
 * Evidence: subclass of HashNode (hierarchy)
 */ extends HashNode {
    static int anInt9613;
    static int anInt9614;
    int anInt9615;
    static boolean aBoolean9616 = false;
    String aString9617;
    static int anInt9618;
    static int anInt9619;
    static int anInt9620;
    HashTable aClass107_9621;

    static final void method3232(double d, byte i) {
        if (i <= -54) {
            if (d != Component201.aDouble8713) {
                for (int i_0_ = 0; i_0_ < 256; i_0_++) {
                    int i_1_ = (int) (255.0 * Math.pow((double) i_0_ / 255.0, d));
                    DisplayModeManagerContainer58.anIntArray10266[i_0_] = Math.min(i_1_, 255);
                }
                Component201.aDouble8713 = d;
            }
            anInt9618++;
        }
    }

    final boolean method3233(MenuEntry class348_sub42_sub12, int i) {
        anInt9613++;
        boolean bool = true;
        class348_sub42_sub12.unlink(true);
        MenuEntry class348_sub42_sub12_2_ = ((MenuEntry) this.aClass107_9621.first(-74));
        while (class348_sub42_sub12_2_ != null) {
            if (RenderableSub2.method2496(class348_sub42_sub12_2_.opcode, class348_sub42_sub12.opcode, true)) {
                Component325.method721(class348_sub42_sub12_2_, class348_sub42_sub12, -1);
                this.anInt9615++;
                return !bool;
            }
            class348_sub42_sub12_2_ = (MenuEntry) this.aClass107_9621.next((byte) 48);
            bool = false;
        }
        this.aClass107_9621.add(true, class348_sub42_sub12);
        int i_3_ = 80 % ((i - -81) / 33);
        this.anInt9615++;
        return bool;
    }

    final boolean method3234(byte i, MenuEntry class348_sub42_sub12) {
        anInt9614++;
        int i_4_ = 41 % ((-30 - i) / 39);
        int i_5_ = method3235(-17937);
        class348_sub42_sub12.unlink(true);
        this.anInt9615--;
        if (this.anInt9615 == 0) {
            this.unlink((byte) 112);
            this.unlink(true);
            DisplayModeManagerContainer345.anInt166--;
            Component293.aClass60_3301.putOne(this, class348_sub42_sub12.groupKey, (byte) -128);
            return false;
        }
        return i_5_ != method3235(-17937);
    }

    HashNodeSub13(String string) {
        this.aString9617 = string;
        this.aClass107_9621 = new HashTable();
    }

    final int method3235(int i) {
        if (i != -17937) return 104;
        anInt9619++;
        if ((this.aClass107_9621.sentinel) != this.aClass107_9621.sentinel.next) return ((MenuEntry) this.aClass107_9621.sentinel.next).opcode;
        return -1;
    }
}
