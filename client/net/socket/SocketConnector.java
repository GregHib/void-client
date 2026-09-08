/* SocketConnector - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class272` (JODE-obfuscated).
 * Socket factory/connector. openSocket(byte) builds `new Socket(host, port)` from host/port; declares abstract connect(int) for subclasses.
 */

import java.io.IOException;
import java.net.Socket;

abstract class SocketConnector {
    int port;
    static int anInt3471;
    static int anInt3472;
    static int canvasWidth;
    static int anInt3474;
    static int[] anIntArray3475 = {1, 4, 1, 2};
    String host;

    final Socket openSocket(byte i) throws IOException {
        anInt3472++;
        if (i <= 84) anIntArray3475 = null;
        return new Socket(this.host, this.port);
    }

    public static void clearStatics(int i) {
        anIntArray3475 = null;
        if (i != 1) canvasWidth = -69;
    }

    /**
     * Drop to lobby/login: state 7 → logged-out path, otherwise stash world and set state 13.
     */
    static final void forceLogout(int i) {
        anInt3474++;
        if (i > 49) {
            if (Component49.clientState == 7) LoggedOutDefinition.disconnectAndReset(false, (byte) 11);
            else {
                ItemDefinition.aClass238_2773 = DefinitionSub8.aClass238_9165;
                DefinitionSub8.aClass238_9165 = null;
                Buffer.setClientState(2, 13);
            }
        }
    }

    public SocketConnector() {
        /* empty */
    }

    abstract Socket connect(int i) throws IOException;

    /** Open/focus the world-map UI with the given centre, zoom, and element filters. */
    static final void openWorldMap(int i, int i_0_, Component85 class221, DisplayModeManagerContainer196 class341, int i_1_, int i_2_, int i_3_, byte i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        try {
            Component181.aClass221_1542 = class221;
            Component272.anInt5871 = i_7_;
            Component139.aClass341_6128 = class341;
            Component328.anInt1479 = i;
            NodeSub7.aClass207_6643 = null;
            DisplayModeManagerContainer61.anInt3762 = i_8_;
            PrimitiveTypeDefinition.aClass207_9090 = null;
            Component156.anInt3704 = i_3_;
            Component120.anInt317 = i_5_;
            anInt3471++;
            Component209.anInt3451 = i_0_;
            OutputStream_Sub1.anInt98 = i_2_;
            Component200.anInt3712 = i_6_;
            DisplayModeManagerContainer67.aClass207_1727 = null;
            NodeSub32.anInt6938 = i_1_;
            Component135.method3490(true);
            int i_9_ = -77 % ((i_4_ - 29) / 34);
            DisplayModeManagerContainer61.aBoolean3763 = true;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("uu.E(" + i + ',' + i_0_ + ',' + (class221 != null ? "{...}" : "null") + ',' + (class341 != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
        }
    }
}
