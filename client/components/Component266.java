/* Component266 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component266
/**
 * RENAMED from `Class239_Sub13` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt5974;
    static int anInt5975;
    static int anInt5976;
    static int anInt5977;
    static int anInt5978;
    static int anInt5979;
    static int anInt5980 = 0;
    static int anInt5981;

    final int method1776(int i) {
        if (i != -32350) anInt5980 = 42;
        anInt5978++;
        return this.preferenceValue;
    }

    final void validateValue(boolean bool) {
        if (this.preferences.method3422(674) == WorldNameText.STELLARDAWN) this.preferenceValue = 2;
        if (bool == false) {
            anInt5974++;
            if (this.preferenceValue < 0 || this.preferenceValue > 2) this.preferenceValue = getDefaultValue(20014);
        }
    }

    static final void method1777(int i, DisplayModeManagerContainer58 class318_sub1_sub3_sub3) {
        if (i == -3) {
            if (class318_sub1_sub3_sub3 instanceof Npc) {
                Npc npc = (Npc) class318_sub1_sub3_sub3;
                if (npc.definition != null) ParticleShader.addNpcMenuOptions(((Component72.localPlayer.plane) != (npc.plane)), false, npc);
            } else if (class318_sub1_sub3_sub3 instanceof Player) {
                Player player = ((Player) class318_sub1_sub3_sub3);
                PlayerState.method3298((byte) 105, ((player.plane) != (Component72.localPlayer.plane)), player);
            }
            anInt5981++;
        }
    }

    final int getValue(int i, int i_0_) {
        if (i != 3) return 3;
        anInt5979++;
        return 1;
    }

    Component266(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final void setValue(int i, int i_1_) {
        anInt5977++;
        this.preferenceValue = i_1_;
        int i_2_ = -54 / ((82 - i) / 35);
    }

    final int getDefaultValue(int i) {
        anInt5975++;
        if (i != 20014) return 70;
        return 1;
    }

    Component266(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }
}
