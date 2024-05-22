/* Class318_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318_Sub4 extends Class318 {
    static int anInt6407;
    static int anInt6408;
    boolean aBoolean6409;
    Class318_Sub1 aClass318_Sub1_6410;
    static int anInt6411 = 0;
    static int anInt6412;
    static int anInt6413;
    Class318_Sub3[] aClass318_Sub3Array6414;

    static final aa_Sub2 method2501(int i, ha_Sub3 var_ha_Sub3, int[] is, byte i_0_, int[] is_1_, int i_2_) {
        try {
            if (i_0_ >= -32) method2502(null, -18);
            anInt6412++;
            if (var_ha_Sub3.method3880(Class68.aClass68_1183, Class348_Sub40_Sub38.aClass304_9471, (byte) 125)) {
                byte[] is_3_ = new byte[i * i_2_];
                for (int i_4_ = 0; i > i_4_; i_4_++) {
                    int i_5_ = is[i_4_] + i_2_ * i_4_;
                    for (int i_6_ = 0; is_1_[i_4_] > i_6_; i_6_++)
                        is_3_[i_5_++] = (byte) -1;
                }
                return new aa_Sub2(var_ha_Sub3, i_2_, i, is_3_);
            }
            int[] is_7_ = new int[i * i_2_];
            for (int i_8_ = 0; i > i_8_; i_8_++) {
                int i_9_ = is[i_8_] + i_8_ * i_2_;
                for (int i_10_ = 0; i_10_ < is_1_[i_8_]; i_10_++)
                    is_7_[i_9_++] = -16777216;
            }
            return new aa_Sub2(var_ha_Sub3, i_2_, i, is_7_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("jda.A(" + i + ',' + (var_ha_Sub3 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + i_0_ + ',' + (is_1_ != null ? "{...}" : "null") + ',' + i_2_ + ')'));
        }
    }

    static final ClientScript method2502(byte[] is, int i) {
        if (i >= -76) return null;
        anInt6413++;
        ClientScript script = new ClientScript();
        Class348_Sub49 class348_sub49 = new Class348_Sub49(is);
        class348_sub49.anInt7197 = -2 + class348_sub49.aByteArray7154.length;
        int i_11_ = class348_sub49.readUnsignedShort(842397944);
        int i_12_ = -12 + -i_11_ + (-2 + (class348_sub49.aByteArray7154).length);
        class348_sub49.anInt7197 = i_12_;
        int i_13_ = class348_sub49.readInt((byte) -126);
        script.intVariableCount = class348_sub49.readUnsignedShort(842397944);
        script.stringVariableCount = class348_sub49.readUnsignedShort(842397944);
        script.intArgumentCount = class348_sub49.readUnsignedShort(842397944);
        script.stringArgumentCount = class348_sub49.readUnsignedShort(842397944);
        int i_14_ = class348_sub49.readUnsignedByte(255);
        if (i_14_ > 0) {
            script.aClass356Array9693 = new Class356[i_14_];
            for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
                int i_16_ = class348_sub49.readUnsignedShort(842397944);
                Class356 class356 = new Class356(Class33.method340(i_16_, (byte) 108));
                script.aClass356Array9693[i_15_] = class356;
                while (i_16_-- > 0) {
                    int i_17_ = class348_sub49.readInt((byte) -126);
                    int i_18_ = class348_sub49.readInt((byte) -126);
                    class356.method3483((byte) 124, i_17_, new Class348_Sub35(i_18_));
                }
            }
        }
        class348_sub49.anInt7197 = 0;
        script.name = class348_sub49.method3384(107);
        script.intOperands = new int[i_13_];
        script.instructions = new int[i_13_];
        script.stringOperands = new String[i_13_];
        int i_19_ = 0;
        while (class348_sub49.anInt7197 < i_12_) {
            int opcode = class348_sub49.readUnsignedShort(842397944);
            if (opcode != 3) {
                if (opcode >= 100 || opcode == 21 || opcode == 38 || opcode == 39) script.intOperands[i_19_] = class348_sub49.readUnsignedByte(255);
                else script.intOperands[i_19_] = class348_sub49.readInt((byte) -126);
            } else script.stringOperands[i_19_] = class348_sub49.readString((byte) -98).intern();
            script.instructions[i_19_++] = opcode;
        }
        return script;
    }

    static final boolean method2503(int i, int i_21_, int i_22_, byte[] is, int i_23_, int i_24_, int i_25_) {
        anInt6408++;
        int i_26_ = i_23_ % i_22_;
        int i_27_;
        if (i_26_ != 0) i_27_ = i_22_ - i_26_;
        else i_27_ = 0;
        int i_28_ = -((-1 + (i_22_ + i_25_)) / i_22_);
        if (i_24_ != -16259) method2501(-113, null, null, (byte) 40, null, -110);
        int i_29_ = -((i_22_ + i_23_ + -1) / i_22_);
        for (int i_30_ = i_28_; i_30_ < 0; i_30_++) {
            for (int i_31_ = i_29_; i_31_ < 0; i_31_++) {
                if (is[i_21_] == 0) return true;
                i_21_ += i_22_;
            }
            i_21_ -= i_27_;
            if (is[-1 + i_21_] == 0) return true;
            i_21_ += i;
        }
        return false;
    }

    final boolean method2504(int i, int i_32_, ha var_ha, int i_33_) {
        if (i_33_ >= -37) method2502(null, -82);
        anInt6407++;
        int i_34_ = this.aClass318_Sub1_6410.method2393(-117);
        if (this.aClass318_Sub3Array6414 != null) {
            for (int i_35_ = 0; this.aClass318_Sub3Array6414.length > i_35_; i_35_++) {
                this.aClass318_Sub3Array6414[i_35_].anInt6403 <<= i_34_;
                if (this.aClass318_Sub3Array6414[i_35_].method2500(i_32_, i) && this.aClass318_Sub1_6410.method2391(var_ha, i, i_32_, 0)) {
                    this.aClass318_Sub3Array6414[i_35_].anInt6403 >>= i_34_;
                    return true;
                }
                this.aClass318_Sub3Array6414[i_35_].anInt6403 >>= i_34_;
            }
        }
        return false;
    }
}
