/* DisplayModeManagerContainer96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

final class DisplayModeManagerContainer96
/**
 * RENAMED from `Class119_Sub1` (JODE-obfuscated).
 * Evidence: subclass of Component125 (hierarchy)
 */ extends Component125 implements Interface2 {
    private int anInt4697;
    static int anInt4698;
    static int anInt4699;
    static int anInt4700;
    static int anInt4701;
    static byte aByte4702;
    static int anInt4703;
    static int anInt4704;
    static int anInt4705;

    DisplayModeManagerContainer96(GlToolkitSub2 var_ha_Sub2, int i, byte[] is, int i_0_) {
        super(var_ha_Sub2, is, i_0_);
        try {
            anInt4697 = i;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("cw.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + i_0_ + ')'));
        }
    }

    DisplayModeManagerContainer96(GlToolkitSub2 var_ha_Sub2, int i, Buffer buffer) {
        super(var_ha_Sub2, buffer);
        try {
            anInt4697 = i;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("cw.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + (buffer != null ? "{...}" : "null") + ')'));
        }
    }

    public final long method12(byte i) {
        if (i != 42) method1077(null, (byte) -124);
        anInt4704++;
        return this.aBuffer1792.getAddress();
    }

    static final void method1077(GraphicsToolkit var_ha, byte i) {
        anInt4700++;
        if ((DisplayModeManagerContainer306.menuEntryCount >= 2 || r.aBoolean9722) && Component156.aClass46_3701 == null) {
            if (i >= -71) method1077(null, (byte) -41);
            String string;
            if (r.aBoolean9722 && DisplayModeManagerContainer306.menuEntryCount < 2) string = (DisplayModeManagerContainer332.aString5001 + FriendsIgnoreList.aClass274_3515.getLocalized(ObjectDeserializer.languageId, 544) + DisplayModeManagerContainer332.aString5000 + " ->");
            else if (!Component262.shiftClick || !Component280.aClass346_2449.isKeyDown(81, -121) || DisplayModeManagerContainer306.menuEntryCount <= 2) {
                MenuEntry class348_sub42_sub12 = Component192.menuTip;
                if (class348_sub42_sub12 == null) return;
                string = Component192.formatMenuEntry((byte) -52, class348_sub42_sub12);
                int[] is = null;
                if (!Component3.method1197(-12081, class348_sub42_sub12.opcode)) {
                    if (class348_sub42_sub12.itemId != -1) is = Exception_Sub1.itemDefinitions.getItemDefinition(98, (class348_sub42_sub12.itemId)).anIntArray2772;
                    else if (WaterShaderSub8.method3549((class348_sub42_sub12.opcode), (byte) 107)) {
                        NpcNode class348_sub22 = ((NpcNode) (Component21.aClass356_3654.get((int) class348_sub42_sub12.identifier, -6008)));
                        if (class348_sub22 != null) {
                            Npc npc = (class348_sub22.npc);
                            NpcComposition class79 = (npc.definition);
                            if (class79.anIntArray1377 != null) class79 = (class79.method794((DisplayModeManagerContainer58.aClass170_10209), -1));
                            if (class79 != null) is = class79.anIntArray1342;
                        }
                    } else if (Component71.method1813(8806, (class348_sub42_sub12.opcode))) {
                        Object object = null;
                        ObjectDefinition class51;
                        if ((class348_sub42_sub12.opcode) != 1001) class51 = (GradientPreset.aClass263_9195.getObjectDefinition(0, (int) ((class348_sub42_sub12.identifier) >>> 32 & 0x7fffffffL)));
                        else class51 = (GradientPreset.aClass263_9195.getObjectDefinition(0, (int) (class348_sub42_sub12.identifier)));
                        if (class51.anIntArray945 != null) class51 = class51.getTransformedDefinition((DisplayModeManagerContainer58.aClass170_10209), (byte) 47);
                        if (class51 != null) is = class51.anIntArray917;
                    }
                } else is = (Exception_Sub1.itemDefinitions.getItemDefinition(-73, (int) (class348_sub42_sub12.identifier)).anIntArray2772);
                if (is != null) string += ImageTagText.method1273(is, true);
            } else string = Component192.formatMenuEntry((byte) 125, Component192.menuTip);
            if (DisplayModeManagerContainer306.menuEntryCount > 2) string += ("<col=ffffff> / " + (DisplayModeManagerContainer306.menuEntryCount - 2) + FriendsIgnoreList.aClass274_3508.getLocalized(ObjectDeserializer.languageId, 544));
            if (NodeSub36.aClass46_6990 != null) {
                BitmapFont class324 = NodeSub36.aClass46_6990.method426(var_ha, (byte) 68);
                if (class324 == null) class324 = NodeList.aClass324_3326;
                class324.method2585(Component143.anIntArray2330, NodeSub36.aClass46_6990.width, DisplayModeManagerContainer196.aClass105Array4234, NodeSub36.aClass46_6990.yTextAlign, NodeSub36.aClass46_6990.colour, NodeSub36.aClass46_6990.height, NodeSub36.aClass46_6990.shadowColour, OutputStream_Sub1.aRandom93, NodeSub36.aClass46_6990.xTextAlign, Component299.anInt451, LruCache.anInt4383, -33, Component9.anInt4141, string, Component195.anIntArray5007);
                Component354.method226(Component195.anIntArray5007[0], Component195.anIntArray5007[2], Component195.anIntArray5007[1], 0, Component195.anIntArray5007[3]);
            } else if (Component158.aClass46_323 != null && (PacketReader.currentGameType == RunescapeInfo.RUNESCAPE)) {
                int i_1_ = (NodeList.aClass324_3326.method2571(-1, LruCache.anInt4383, Component143.anIntArray2330, string, 16777215, 0, DisplayModeManagerContainer196.aClass105Array4234, 16 + TcpSocketStream.anInt5832, 4 + Component247.anInt4911, OutputStream_Sub1.aRandom93));
                Component354.method226(Component247.anInt4911 - -4, (Component27.aClass143_4962.stringWidth(true, string) + i_1_), TcpSocketStream.anInt5832, 0, 16);
            }
        }
    }

    public final int method13(byte i) {
        anInt4699++;
        if (i != -97) return -87;
        return anInt4697;
    }

    public final void method11(int i, int i_2_, byte[] is, int i_3_) {
        anInt4705++;
        this.method1076(is, i_2_);
        anInt4697 = i;
        if (i_3_ != -9894) method10(false);
    }

    public final int method10(boolean bool) {
        anInt4701++;
        if (bool != true) method11(126, 120, null, -73);
        return 0;
    }
}
