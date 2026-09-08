/* LoadingState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class56` (JODE-obfuscated).
 * Loading/progress state. getStageId/getProgress report progress; startLoadingTask(Frame, ReflectionInvoker, boolean) spins up a loading Task and waits. Holds current/max (currentProgress/maxProgress) and flags (isBlocking/isSmooth).
 */

import java.awt.*;

final class LoadingState {
    FriendsIgnoreList aClass274_1012;
    boolean isSmooth;
    static int anInt1014;
    FriendsIgnoreList aClass274_1015;
    boolean isBlocking;
    /** Ordinal loading stage id (logged as "load stage N"). */
    private final int stageId;
    static LoadingState aClass56_1018 = new LoadingState(0, FriendsIgnoreList.aClass274_3499, FriendsIgnoreList.aClass274_3499, 0, 1);
    static int anInt1019;
    static int anInt1020;
    int currentProgress;
    static int anInt1022;
    static LoadingState aClass56_1023 = new LoadingState(1, FriendsIgnoreList.aClass274_3499, 2);
    static LoadingState aClass56_1024 = new LoadingState(2, FriendsIgnoreList.aClass274_3499, FriendsIgnoreList.aClass274_3499, 2, 3);
    int maxProgress;
    static LoadingState aClass56_1026 = new LoadingState(3, FriendsIgnoreList.aClass274_3499, 3);
    static LoadingState aClass56_1027 = new LoadingState(4, FriendsIgnoreList.aClass274_3499, FriendsIgnoreList.aClass274_3499, 3, 4);
    static LoadingState aClass56_1028 = new LoadingState(5, FriendsIgnoreList.aClass274_3499, 4);
    static LoadingState aClass56_1029 = new LoadingState(6, FriendsIgnoreList.aClass274_3499, 4);
    static LoadingState aClass56_1030 = new LoadingState(7, FriendsIgnoreList.aClass274_3499, FriendsIgnoreList.aClass274_3499, 4, 5);
    static LoadingState aClass56_1031 = new LoadingState(8, FriendsIgnoreList.aClass274_3499, FriendsIgnoreList.aClass274_3499, 5, 98, true, true);//
    static LoadingState aClass56_1032 = new LoadingState(9, FriendsIgnoreList.aClass274_3499, 99);
    static LoadingState aClass56_1033 = new LoadingState(10, FriendsIgnoreList.aClass274_3499, 100);
    static LoadingState aClass56_1034 = new LoadingState(11, FriendsIgnoreList.aClass274_3500, FriendsIgnoreList.aClass274_3500, 0, 92, true, true);
    static LoadingState aClass56_1035 = new LoadingState(12, FriendsIgnoreList.aClass274_3500, FriendsIgnoreList.aClass274_3500, 92, 92);
    private static LoadingState aClass56_1036 = new LoadingState(13, FriendsIgnoreList.aClass274_3500, FriendsIgnoreList.aClass274_3500, 92, 93);
    static LoadingState aClass56_1037 = new LoadingState(14, FriendsIgnoreList.aClass274_3500, FriendsIgnoreList.aClass274_3500, 94, 95);
    static LoadingState aClass56_1038 = new LoadingState(15, FriendsIgnoreList.aClass274_3500, FriendsIgnoreList.aClass274_3500, 96, 97);
    static LoadingState aClass56_1039 = new LoadingState(16, FriendsIgnoreList.aClass274_3500, 97);
    static LoadingState aClass56_1040 = new LoadingState(17, FriendsIgnoreList.aClass274_3500, 97);
    static LoadingState aClass56_1041 = new LoadingState(18, FriendsIgnoreList.aClass274_3500, 100);
    static LoadingState aClass56_1042 = new LoadingState(19, FriendsIgnoreList.aClass274_3500, 100);
    static LoadingState aClass56_1043 = new LoadingState(20, FriendsIgnoreList.aClass274_3500, 100);
    /** JS5 group id for bitmap font archive {@code p11_full}. */
    static int p11FullGroupId;
    static int[] anIntArray1045 = new int[2];

    private LoadingState(int i, FriendsIgnoreList class274, int i_0_) {
        this(i, class274, class274, i_0_, i_0_, true, false);
    }

    /** @return ordinal stage id ({@link #stageId}). */
    final int getStageId(int i) {
        if (i >= -109) aClass56_1039 = null;
        anInt1019++;
        return stageId;
    }

    public final String toString() {
        anInt1022++;
        throw new IllegalStateException();
    }

    public static void getProgress(int i) {
        aClass56_1040 = null;
        aClass56_1032 = null;
        aClass56_1042 = null;
        aClass56_1038 = null;
        aClass56_1034 = null;
        aClass56_1027 = null;
        aClass56_1018 = null;
        aClass56_1026 = null;
        if (i > 42) {
            aClass56_1039 = null;
            aClass56_1031 = null;
            aClass56_1043 = null;
            aClass56_1033 = null;
            aClass56_1024 = null;
            aClass56_1029 = null;
            aClass56_1023 = null;
            aClass56_1036 = null;
            anIntArray1045 = null;
            aClass56_1041 = null;
            aClass56_1030 = null;
            aClass56_1037 = null;
            aClass56_1028 = null;
            aClass56_1035 = null;
        }
    }

    static final void startLoadingTask(Frame frame, ReflectionInvoker class297, boolean bool) {
        try {
            anInt1020++;
            for (; ; ) {
                Task class144 = class297.exitFullscreen((byte) 89, frame);
                while (class144.status == 0) SpriteAtlasShader.sleep((byte) -124, 10L);
                if (class144.status == 1) break;
                SpriteAtlasShader.sleep((byte) 33, 100L);
            }
            frame.setVisible(bool);
            frame.dispose();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("jj.D(" + (frame != null ? "{...}" : "null") + ',' + (class297 != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    private LoadingState(int i, FriendsIgnoreList class274, FriendsIgnoreList class274_1_, int i_2_, int i_3_) {
        this(i, class274, class274_1_, i_2_, i_3_, true, false);
    }

    /** All loading stage constants in ordinal order. */
    static final LoadingState[] allStages(int i) {
        anInt1014++;
        int i_4_ = 108 / ((i - 34) / 55);
        return (new LoadingState[]{aClass56_1018, aClass56_1023, aClass56_1024, aClass56_1026, aClass56_1027, aClass56_1028, aClass56_1029, aClass56_1030, aClass56_1031, aClass56_1032, aClass56_1033, aClass56_1034, aClass56_1035, aClass56_1036, aClass56_1037, aClass56_1038, aClass56_1039, aClass56_1040, aClass56_1041, aClass56_1042, aClass56_1043});
    }

    private LoadingState(int i, FriendsIgnoreList class274, FriendsIgnoreList class274_5_, int i_6_, int i_7_, boolean bool, boolean bool_8_) {
        try {
            this.aClass274_1012 = class274;
            this.currentProgress = i_7_;
            stageId = i;
            this.maxProgress = i_6_;
            this.aClass274_1015 = class274_5_;
            this.isBlocking = bool_8_;
            this.isSmooth = bool;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("jj.<init>(" + i + ',' + (class274 != null ? "{...}" : "null") + ',' + (class274_5_ != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ',' + bool + ',' + bool_8_ + ')'));
        }
    }
}
