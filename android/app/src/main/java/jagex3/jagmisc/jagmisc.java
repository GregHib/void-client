package jagex3.jagmisc;


public final class jagmisc {

    public static int ping0(byte arg0, byte arg1, byte arg2, byte arg3, long arg4) { return 0; }

    public static boolean init() { return false; }

    public static void Quit0() {}

    public static long nanoTime() { return System.nanoTime(); }

    public static long getTotalPhysicalMemory() { return 0L; }

    public static long getAvailablePhysicalMemory() { return 0L; }

    public static void quit() {
        Quit0();
    }

    public static int ping(byte arg0, byte arg1, byte arg2, byte arg3, long arg4) throws Throwable {
        int local6 = ping0(arg0, arg1, arg2, arg3, arg4);
        if (local6 < 0) {
            throw new Exception(String.valueOf(local6));
        }
        return local6;
    }

    public jagmisc() {
    }
}
