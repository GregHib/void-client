/* HashNodeSub16Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Date;

final class HashNodeSub16Sub1
/**
 * RENAMED from {@code Class348_Sub42_Sub16_Sub1} (JODE-obfuscated).
 * JS5 TCP response node: accumulates 512-byte blocks into {@link #buffer}
 * until {@link #incomplete} clears. {@link #padding} is the unused trailer
 * length on the last block; {@link #blockPosition} tracks progress within
 * the current 512-byte window (resets at 512).
 */ extends HashNodeSub16 {
    /**
     * Script / default cursor def id (CS2 opcode 5426). Last fallback when tip
     * and widget cursor ids are {@code -1}. Parked on this JS5 node class.
     */
    static int defaultCursorId = -1;
    static int anInt10448;
    /** Unused bytes at end of last block (payload length = buffer.length - padding). */
    byte padding;
    static boolean aBoolean10450;
    static int anInt10451;
    static int anInt10452;
    /** Growing response payload (header + archive bytes). */
    Buffer buffer;
    static int anInt10454;
    static int anInt10455;
    /** Bytes read in the current 512-byte JS5 block (0..512). */
    int blockPosition;

    /** Returns payload when complete; throws if still {@link #incomplete} or short. */
    final byte[] getData(int i) {
        anInt10454++;
        if (i != 16) return null;
        if (this.incomplete || (this.buffer.offset < (-this.padding + (this.buffer.payload).length))) throw new RuntimeException();
        return (this.buffer.payload);
    }

    static final void method3260(int i) {
        for (ColorTagNode class348_sub15 = (ColorTagNode) DisplayModeManagerContainer91.aClass356_389.first(0); class348_sub15 != null; class348_sub15 = (ColorTagNode) DisplayModeManagerContainer91.aClass356_389.next(0)) {
            if (class348_sub15.aClass55_Sub1_6768.method510((byte) -125)) DisplayModeManagerContainer282.getColorTag((byte) 70, (class348_sub15.anInt6773));
            else {
                class348_sub15.aClass55_Sub1_6768.method522((byte) -91);
                try {
                    class348_sub15.aClass55_Sub1_6768.method517(-2);
                } catch (Exception exception) {
                    ClientErrorReporter.reportError("TV: " + class348_sub15.anInt6773, exception, 15004);
                    DisplayModeManagerContainer282.getColorTag((byte) 15, (class348_sub15.anInt6773));
                }
                if (!class348_sub15.aBoolean6783 && !class348_sub15.aBoolean6781) {
                    OggUrlStream class348_sub23_sub1 = class348_sub15.aClass55_Sub1_6768.method512(0);
                    if (class348_sub23_sub1 != null) {
                        NodeSub16Sub2 class348_sub16_sub2 = class348_sub23_sub1.method2971(-61);
                        if (class348_sub16_sub2 != null) {
                            class348_sub16_sub2.method2827(-17708, (class348_sub15.anInt6782));
                            PlayerState.aClass348_Sub16_Sub4_7065.method2883(class348_sub16_sub2);
                            class348_sub15.aBoolean6783 = true;
                        }
                    }
                }
            }
        }
        int i_0_ = 48 % ((-17 - i) / 63);
        anInt10448++;
    }

    /** Format {@code l} as HTTP-date ({@code Day, DD-Mon-YYYY HH:MM:SS GMT}). */
    static final String formatHttpDate(long l, int i) {
        try {
            ParticleShader.aCalendar6221.setTime(new Date(l));
            anInt10455++;
            int i_1_ = ParticleShader.aCalendar6221.get(7);
            int i_2_ = ParticleShader.aCalendar6221.get(5);
            if (i <= 53) aBoolean10450 = false;
            int i_3_ = ParticleShader.aCalendar6221.get(2);
            int i_4_ = ParticleShader.aCalendar6221.get(1);
            int i_5_ = ParticleShader.aCalendar6221.get(11);
            int i_6_ = ParticleShader.aCalendar6221.get(12);
            int i_7_ = ParticleShader.aCalendar6221.get(13);
            return (ToolkitFactory.aStringArray1531[i_1_ - 1] + ", " + i_2_ / 10 + i_2_ % 10 + "-" + Component374.aStringArray4129[i_3_] + "-" + i_4_ + " " + i_5_ / 10 + i_5_ % 10 + ":" + i_6_ / 10 + i_6_ % 10 + ":" + i_7_ / 10 + i_7_ % 10 + " GMT");
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "mba.I(" + l + ',' + i + ')');
        }
    }

    /** Download progress 0..100 based on buffer offset vs expected length. */
    final int getProgressPercent(int i) {
        if (i != 16) this.padding = (byte) -4;
        anInt10452++;
        if (this.buffer == null) return 0;
        return (100 * this.buffer.offset / (-this.padding + (this.buffer.payload).length));
    }

    static final boolean hasFlag0x10(int i, int i_8_, int i_9_) {
        if (i_9_ <= 75) aBoolean10450 = false;
        anInt10451++;
        return (i & 0x10) != 0;
    }
}
