package jaclib.peer;


public abstract class Peer {

    // $FF: synthetic field
    public static Class a;

    protected PeerReference reference;

    static {
        init(a == null ? (a = getClass("jaclib.peer.PeerReference")) : a);
    }

    static Class getClass(String name) {
        Class instance;
        try {
            instance = Class.forName(name);
        } catch (ClassNotFoundException ex) {
            throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(ex);
        }
        return instance;
    }

    public static void init(Class arg0) {}

    public static char[] z(String arg0) {
        char[] local1 = arg0.toCharArray();
        if (local1.length < 2) {
            local1[0] = (char) (local1[0] ^ 0x37);
        }
        return local1;
    }

    public static String z(char[] arg0) {
        int local2 = arg0.length;
        char[] local0 = arg0;
        int local3 = local2;
        for (int local5 = 0; local5 < local3; local5++) {
            char local10 = local0[local5];
            byte local15;
            switch (local5 % 5) {
                case 0:
                    local15 = 83;
                    break;
                case 1:
                    local15 = 93;
                    break;
                case 2:
                    local15 = 47;
                    break;
                case 3:
                    local15 = 54;
                    break;
                default:
                    local15 = 55;
            }
            local0[local5] = (char) (local10 ^ local15);
        }
        return (new String(local0)).intern();
    }

    protected Peer() {
    }

    protected long a() {
        return this.reference.b(0);
    }

    public final boolean a(byte arg0) {
        return this.reference.a(0);
    }
}
