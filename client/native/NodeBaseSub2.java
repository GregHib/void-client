/* NodeBaseSub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;

final class NodeBaseSub2
/**
 * RENAMED from `NodeBaseSub2` (JODE-obfuscated).
 * Evidence: extends NodeBase (NodeBase)
 */ extends NodeBase {
    static int anInt9777;
    static int anInt9778;
    static int anInt9779;
    static int regionTileX;
    static Component161 aClass138_9781;
    NativeHeap aNativeHeap9782;
    static boolean aBoolean9783 = false;

    static final Component321 method3442(int i, byte[] is, GlExtensionManager class377, int i_0_) {
        try {
            anInt9779++;
            if (is == null) return null;
            int i_1_ = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(i, i_1_);
            OpenGL.glProgramRawARB(i, 34933, is);
            OpenGL.glGetIntegerv(34379, Component65.anIntArray1626, 0);
            if (Component65.anIntArray1626[0] != -1) {
                OpenGL.glBindProgramARB(i, 0);
                return null;
            }
            OpenGL.glBindProgramARB(i, 0);
            if (i_0_ != 4) return null;
            return new Component321(class377, i, i_1_);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("cu.A(" + i + ',' + (is != null ? "{...}" : "null") + ',' + (class377 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
        }
    }

    static final void method3443(boolean bool, DisplayModeManagerContainer58 class318_sub1_sub3_sub3) {
        anInt9778++;
        if ((class318_sub1_sub3_sub3.anIntArray10242) != null || (class318_sub1_sub3_sub3.anIntArray10296) != null) {
            boolean bool_2_ = bool;
            for (int i = 0; i < (class318_sub1_sub3_sub3.anIntArray10242).length; i++) {
                int i_3_ = -1;
                if ((class318_sub1_sub3_sub3.anIntArray10242) != null) i_3_ = (class318_sub1_sub3_sub3.anIntArray10242[i]);
                if (i_3_ == -1) {
                    if (!class318_sub1_sub3_sub3.ensureCombatArray(-80, i, -1)) bool_2_ = false;
                } else {
                    bool_2_ = false;
                    boolean bool_4_ = false;
                    boolean bool_5_ = false;
                    int i_6_;
                    int i_7_;
                    if ((i_3_ & ~0x3fffffff) == -1073741824) {
                        int i_8_ = i_3_ & 0xfffffff;
                        int i_9_ = i_8_ >> 14;
                        i_7_ = (class318_sub1_sub3_sub3.x) - 512 * (i_9_ - regionTileX) - 256;
                        int i_10_ = i_8_ & 0x3fff;
                        i_6_ = (-256 - (i_10_ - Component330.regionTileY) * 512 + (class318_sub1_sub3_sub3.y));
                    } else if ((0x8000 & i_3_) == 0) {
                        NpcNode class348_sub22 = ((NpcNode) Component21.aClass356_3654.get(i_3_, -6008));
                        if (class348_sub22 == null) {
                            class318_sub1_sub3_sub3.ensureCombatArray(-96, i, -1);
                            continue;
                        }
                        Npc npc = (class348_sub22.npc);
                        i_6_ = ((class318_sub1_sub3_sub3.y) - npc.y);
                        i_7_ = (-(npc.x) + (class318_sub1_sub3_sub3.x));
                    } else {
                        int i_11_ = i_3_ & 0x7fff;
                        Player player = (InterfaceRenderer.players[i_11_]);
                        if (player == null) {
                            class318_sub1_sub3_sub3.ensureCombatArray(67, i, -1);
                            continue;
                        }
                        i_6_ = ((class318_sub1_sub3_sub3.y) - player.y);
                        i_7_ = (-(player.x) + (class318_sub1_sub3_sub3.x));
                    }
                    if (i_7_ != 0 || i_6_ != 0) class318_sub1_sub3_sub3.ensureCombatArray(-100, i, 0x3fff & (int) (Math.atan2(i_7_, i_6_) * 2607.5945876176133));
                }
            }
            if (bool_2_) {
                class318_sub1_sub3_sub3.anIntArray10242 = null;
                class318_sub1_sub3_sub3.anIntArray10296 = null;
            }
        }
    }

    public static void method3444(int i) {
        if (i <= -85) aClass138_9781 = null;
    }

    final void method3445(int i) {
        this.aNativeHeap9782.b();
        if (i != -9503) regionTileX = -29;
        anInt9777++;
    }

    NodeBaseSub2(int i) {
        this.aNativeHeap9782 = new NativeHeap(i);
    }

    static {
        aClass138_9781 = new Component161(14, 0, 4, 1);
    }
}
