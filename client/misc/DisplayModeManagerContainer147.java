/* DisplayModeManagerContainer147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer147
/**
 * RENAMED from `Class335` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt4166;
    static int perDrawReset = 0;
    static int anInt4168 = 0;
    static int anInt4169;

    static final void method2655(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        anInt4166++;
        for (SceneNode class348_sub9 = (SceneNode) SceneManager.aClass262_2859.first(4); class348_sub9 != null; class348_sub9 = ((SceneNode) SceneManager.aClass262_2859.next((byte) 97)))
            TcpSocketStream.method1708(i_1_, i_3_, i_0_, i_2_, (byte) -78, class348_sub9);
        for (SceneNode class348_sub9 = (SceneNode) client.aClass262_5185.first(4); class348_sub9 != null; class348_sub9 = ((SceneNode) client.aClass262_5185.next((byte) 85))) {
            int i_4_ = 1;
            Component241 class225 = class348_sub9.aNpc_6691.getDefinition((byte) 72);
            if (class348_sub9.aNpc_6691.anInt10268 == -1 || class348_sub9.aNpc_6691.aBoolean10213) i_4_ = 0;
            else if ((class225.anInt2919 == class348_sub9.aNpc_6691.anInt10268) || (class225.anInt2920 == class348_sub9.aNpc_6691.anInt10268) || (class225.anInt2949 == class348_sub9.aNpc_6691.anInt10268) || (class348_sub9.aNpc_6691.anInt10268 == class225.anInt2914))
                i_4_ = 2;
            else if ((class348_sub9.aNpc_6691.anInt10268 == class225.anInt2940) || (class225.anInt2924 == class348_sub9.aNpc_6691.anInt10268) || (class225.anInt2947 == class348_sub9.aNpc_6691.anInt10268) || (class348_sub9.aNpc_6691.anInt10268 == class225.anInt2958))
                i_4_ = 3;
            if (class348_sub9.anInt6675 != i_4_) {
                int i_5_ = DisplayModeManagerContainer345.method214((class348_sub9.aNpc_6691), -1);
                NpcComposition class79 = (class348_sub9.aNpc_6691.definition);
                if (class79.anIntArray1377 != null) class79 = class79.method794((DisplayModeManagerContainer58.aClass170_10209), -1);
                if (class79 == null || i_5_ == -1) {
                    class348_sub9.anInt6675 = i_4_;
                    class348_sub9.aBoolean6674 = false;
                    class348_sub9.anInt6685 = -1;
                } else if ((class348_sub9.anInt6685 == i_5_) && (!class79.aBoolean1370 != class348_sub9.aBoolean6674)) {
                    class348_sub9.anInt6677 = class79.anInt1356;
                    class348_sub9.anInt6675 = i_4_;
                } else {
                    boolean bool = false;
                    if ((class348_sub9.aClass348_Sub16_Sub5_6676) == null) bool = true;
                    else {
                        class348_sub9.anInt6677 -= 512;
                        if (class348_sub9.anInt6677 <= 0) {
                            PlayerState.aClass348_Sub16_Sub4_7065.method2880(class348_sub9.aClass348_Sub16_Sub5_6676);
                            bool = true;
                            class348_sub9.aClass348_Sub16_Sub5_6676 = null;
                        }
                    }
                    if (bool) {
                        class348_sub9.aBoolean6674 = class79.aBoolean1370;
                        class348_sub9.anInt6685 = i_5_;
                        class348_sub9.aClass348_Sub19_Sub1_6686 = null;
                        class348_sub9.aClass348_Sub10_6688 = null;
                        class348_sub9.anInt6675 = i_4_;
                        class348_sub9.anInt6677 = class79.anInt1356;
                    }
                }
            }
            class348_sub9.anInt6678 = (class348_sub9.aNpc_6691.x);
            class348_sub9.anInt6698 = ((class348_sub9.aNpc_6691.x) - -(class348_sub9.aNpc_6691.getSize((byte) 55) << 8));
            class348_sub9.anInt6689 = (class348_sub9.aNpc_6691.y);
            class348_sub9.anInt6687 = ((class348_sub9.aNpc_6691.y) + (class348_sub9.aNpc_6691.getSize((byte) 92) << 8));
            TcpSocketStream.method1708(i_1_, i_3_, i_0_, i_2_, (byte) -78, class348_sub9);
        }
        SceneNode class348_sub9 = ((SceneNode) HashNodeSub16Sub2.aClass356_10465.first(0));
        int i_6_ = -122 / (-i / 47);
        for (/**/; class348_sub9 != null; class348_sub9 = ((SceneNode) HashNodeSub16Sub2.aClass356_10465.next(0))) {
            int i_7_ = 1;
            Component241 class225 = class348_sub9.aPlayer_6679.getDefinition((byte) 72);
            if (class348_sub9.aPlayer_6679.anInt10268 != -1 && !class348_sub9.aPlayer_6679.aBoolean10213) {
                if ((class348_sub9.aPlayer_6679.anInt10268 != class225.anInt2919) && (class225.anInt2920 != class348_sub9.aPlayer_6679.anInt10268) && (class225.anInt2949 != class348_sub9.aPlayer_6679.anInt10268) && (class348_sub9.aPlayer_6679.anInt10268 != class225.anInt2914)) {
                    if ((class348_sub9.aPlayer_6679.anInt10268 == class225.anInt2940) || (class225.anInt2924 == class348_sub9.aPlayer_6679.anInt10268) || ((class348_sub9.aPlayer_6679.anInt10268) == class225.anInt2947) || (class225.anInt2958 == class348_sub9.aPlayer_6679.anInt10268))
                        i_7_ = 3;
                } else i_7_ = 2;
            } else i_7_ = 0;
            if (class348_sub9.anInt6675 != i_7_) {
                int i_8_ = (Component168.method2357(-1, (class348_sub9.aPlayer_6679)));
                if (i_8_ == class348_sub9.anInt6685 && (class348_sub9.aPlayer_6679.aBoolean10517 == class348_sub9.aBoolean6674)) {
                    class348_sub9.anInt6677 = class348_sub9.aPlayer_6679.anInt10558;
                    class348_sub9.anInt6675 = i_7_;
                } else {
                    boolean bool = false;
                    if ((class348_sub9.aClass348_Sub16_Sub5_6676) != null) {
                        class348_sub9.anInt6677 -= 512;
                        if (class348_sub9.anInt6677 <= 0) {
                            PlayerState.aClass348_Sub16_Sub4_7065.method2880(class348_sub9.aClass348_Sub16_Sub5_6676);
                            class348_sub9.aClass348_Sub16_Sub5_6676 = null;
                            bool = true;
                        }
                    } else bool = true;
                    if (bool) {
                        class348_sub9.aBoolean6674 = (class348_sub9.aPlayer_6679.aBoolean10517);
                        class348_sub9.anInt6677 = (class348_sub9.aPlayer_6679.anInt10558);
                        class348_sub9.aClass348_Sub10_6688 = null;
                        class348_sub9.anInt6685 = i_8_;
                        class348_sub9.aClass348_Sub19_Sub1_6686 = null;
                        class348_sub9.anInt6675 = i_7_;
                    }
                }
            }
            class348_sub9.anInt6678 = (class348_sub9.aPlayer_6679.x);
            class348_sub9.anInt6698 = ((class348_sub9.aPlayer_6679.x) + (class348_sub9.aPlayer_6679.getSize((byte) 123) << 8));
            class348_sub9.anInt6689 = (class348_sub9.aPlayer_6679.y);
            class348_sub9.anInt6687 = ((class348_sub9.aPlayer_6679.y) - -(class348_sub9.aPlayer_6679.getSize((byte) 126) << 8));
            TcpSocketStream.method1708(i_1_, i_3_, i_0_, i_2_, (byte) -78, class348_sub9);
        }
    }
}
