/* ClientScriptExecutor - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class66` (JODE-obfuscated).
 * CS2 (client script) interpreter. Executes clientscripts (runScript builds a
 * script via Component62.method1223); reports 'Clientscript error in:',
 * 'Command:', 'bad command', 'null char' diagnostics.
 *
 * <p>Stack machine state (reset at the start of {@link #execute}):
 * <ul>
 *   <li>{@link #intStack} / {@link #intStackPointer} — integer operands</li>
 *   <li>{@link #stringStack} / {@link #stringStackPointer} — string operands</li>
 *   <li>{@link #callFrames} / {@link #callFramePointer} — nested script call frames</li>
 * </ul>
 * Push/pop is textbook: {@code intStack[intStackPointer++] = x} /
 * {@code intStackPointer -= n}.
 */

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;

final class ClientScriptExecutor {
    /** CS2 int operand stack (capacity 1000). */
    private static int[] intStack = new int[1000];
    private static DisplayModeManagerContainer57 aClass46_1150;
    private static CookieBuilder aClass43_1151;
    /** CS2 string operand stack (capacity 1000). */
    private static String[] stringStack = new String[1000];
    static int anInt1153;
    /** Next free slot in {@link #callFrames}; 0 means no nested call. */
    private static int callFramePointer = 0;
    private static String[] aStringArray1155;
    static int anInt1156;
    static int anInt1157;
    static int anInt1158;
    static int anInt1159;
    private static Calendar aCalendar1160;
    private static int[][] anIntArrayArray1161 = new int[5][5000];
    static int anInt1162;
    static int anInt1163;
    private static int[] anIntArray1164;
    static int anInt1165;
    static int anInt1166;
    static int anInt1167;
    /** Nested CS2 call frames (gosub / return). */
    private static Component357[] callFrames;
    private static DisplayModeManagerContainer57 aClass46_1169;
    /** Next free slot in {@link #stringStack}. */
    private static int stringStackPointer = 0;
    static int anInt1171;
    private static int[] anIntArray1172 = new int[5];
    /** Next free slot in {@link #intStack}. */
    private static int intStackPointer = 0;
    static NodeCache aClass60_1174;
    private static int[] anIntArray1175;
    private static String[] aStringArray1176;
    private static int anInt1177;

    /** Load script for trigger {@code class273} and run with a 200000-instruction budget. */
    static final void runScript(Component224 class273, int i, int i_0_) {
        HashNodeSub19 class348_sub42_sub19 = Component62.method1223(i, i_0_, 96837648, class273);
        if (class348_sub42_sub19 != null) {
            anIntArray1164 = (new int
                    [class348_sub42_sub19.anInt9688]);
            aStringArray1155 = (new String
                    [class348_sub42_sub19.anInt9689]);
            if ((class348_sub42_sub19.aClass273_9691 == Component330.aClass273_1512) || (class348_sub42_sub19.aClass273_9691) == DisplayModeManagerContainer34.aClass273_8664 || (class348_sub42_sub19.aClass273_9691) == DisplayModeManagerContainer123.aClass273_1298) {
                int i_1_ = 0;
                int i_2_ = 0;
                if (Component39.aClass46_2249 != null) {
                    i_1_ = Component39.aClass46_2249.absoluteX;
                    i_2_ = Component39.aClass46_2249.absoluteY;
                }
                anIntArray1164[0] = AbstractGlTextureSub4.mouseHandler.getCursorX(true) - i_1_;
                anIntArray1164[1] = (AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 80) - i_2_);
            }
            execute(class348_sub42_sub19, 200000);
        }
    }

    private static final void bringInterfaceToFront(int i) {
        DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, i);
        if (class46 != null) {
            int i_3_ = i >>> 16;
            DisplayModeManagerContainer57[] class46s = Component14.aClass46ArrayArray8584[i_3_];
            if (class46s == null) {
                DisplayModeManagerContainer57[] class46s_4_ = DefinitionSub33.openInterfaces[i_3_];
                int i_5_ = class46s_4_.length;
                class46s = Component14.aClass46ArrayArray8584[i_3_] = new DisplayModeManagerContainer57[i_5_];
                Component313.arraycopyObjects(class46s_4_, 0, class46s, 0, class46s_4_.length);
            }
            int i_6_;
            for (i_6_ = 0; i_6_ < class46s.length; i_6_++) {
                if (class46s[i_6_] == class46) break;
            }
            if (i_6_ < class46s.length) {
                Component313.arraycopyObjects(class46s, 0, class46s, 1, i_6_);
                class46s[0] = class46;
            }
        }
    }

    /** Run on-load scripts for interface {@code i}. */
    static final void runInterfaceScripts(int i) {
        if (i != -1 && Component233.method2547(i, (byte) 84)) {
            DisplayModeManagerContainer57[] class46s = DefinitionSub33.openInterfaces[i];
            for (int i_7_ = 0; i_7_ < class46s.length; i_7_++) {
                DisplayModeManagerContainer57 class46 = class46s[i_7_];
                if (class46.anObjectArray815 != null) {
                    NodeSub36 class348_sub36 = new NodeSub36();
                    class348_sub36.aClass46_6989 = class46;
                    class348_sub36.anObjectArray6987 = class46.anObjectArray815;
                    executeHook(class348_sub36, 2000000);
                }
            }
        }
    }

    private static final void executeCommand(int i, boolean bool) {
        if (i < 5100) {
            if (i == 5000) {
                intStack[intStackPointer++] = NodeBase.anInt7276;
                return;
            }
            if (i == 5001) {
                intStackPointer -= 3;
                NodeBase.anInt7276 = intStack[intStackPointer];
                DisplayModeInfo.aClass227_1055 = PauseTimer.method360((byte) -57, intStack[intStackPointer + 1]);
                if (DisplayModeInfo.aClass227_1055 == null) DisplayModeInfo.aClass227_1055 = Component265.aClass227_1591;
                Component200.anInt3713 = intStack[intStackPointer + 2];
                anInt1156++;
                ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(NodeSub14.aClass351_6766, (DisplayModeManagerContainer64.aClass77_9029), -111);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, NodeBase.anInt7276);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, DisplayModeInfo.aClass227_1055.anInt2970);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, Component200.anInt3713);
                HashNodeSub14.enqueueOutboundPacket(-77, class348_sub47);
                return;
            }
            if (i == 5002) {
                stringStackPointer -= 2;
                String string = stringStack[stringStackPointer];
                String string_8_ = stringStack[stringStackPointer + 1];
                intStackPointer -= 2;
                int i_9_ = intStack[intStackPointer];
                int i_10_ = intStack[intStackPointer + 1];
                if (string_8_ == null) string_8_ = "";
                if (string_8_.length() > 80) string_8_ = string_8_.substring(0, 80);
                anInt1157++;
                ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(Component184.aClass351_1987, (DisplayModeManagerContainer64.aClass77_9029), -117);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, (Component31.method1745(string, -65) + 2 + Component31.method1745(string_8_, -65)));
                class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, i_9_ - 1);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, i_10_);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string_8_);
                HashNodeSub14.enqueueOutboundPacket(-85, class348_sub47);
                return;
            }
            if (i == 5003) {
                int i_11_ = intStack[--intStackPointer];
                Component335 class147 = s.method3985(-101, i_11_);
                String string = "";
                if (class147 != null && class147.aString2028 != null) string = class147.aString2028;
                stringStack[stringStackPointer++] = string;
                return;
            }
            if (i == 5004) {
                int i_12_ = intStack[--intStackPointer];
                Component335 class147 = s.method3985(-101, i_12_);
                int i_13_ = -1;
                if (class147 != null) i_13_ = class147.anInt2032;
                intStack[intStackPointer++] = i_13_;
                return;
            }
            if (i == 5005) {
                if (DisplayModeInfo.aClass227_1055 == null) intStack[intStackPointer++] = -1;
                else {
                    intStack[intStackPointer++] = DisplayModeInfo.aClass227_1055.anInt2970;
                    return;
                }
                return;
            }
            if (i == 5006) {
                int i_14_ = intStack[--intStackPointer];
                ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(Sprite.aClass351_6925, (DisplayModeManagerContainer64.aClass77_9029), -100);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, i_14_);
                HashNodeSub14.enqueueOutboundPacket(-70, class348_sub47);
                return;
            }
            if (i == 5008) {
                String string = stringStack[--stringStackPointer];
                parseCommand(string, i);
                return;
            }
            if (i == 5009) {
                stringStackPointer -= 2;
                String string = stringStack[stringStackPointer];
                String string_15_ = stringStack[stringStackPointer + 1];
                if (Component353.anInt2581 != 0 || ((!ParametricDefinition.aBoolean9103 || HeapDumper.aBoolean1915) && !Component308.aBoolean5233)) {
                    anInt1159++;
                    ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((DefinitionSub22.aClass351_9304), (DisplayModeManagerContainer64.aClass77_9029), -116);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                    int i_16_ = (class348_sub47.aClass348_Sub49_Sub2_7116.offset);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string);
                    AbstractShaderSub4.writeHuffmanString((class348_sub47.aClass348_Sub49_Sub2_7116), -70, string_15_);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeLengthByte(109, (class348_sub47.aClass348_Sub49_Sub2_7116.offset) - i_16_);
                    HashNodeSub14.enqueueOutboundPacket(2, class348_sub47);
                    return;
                }
                return;
            }
            if (i == 5010) {
                int i_17_ = intStack[--intStackPointer];
                Component335 class147 = s.method3985(-101, i_17_);
                String string = "";
                if (class147 != null && class147.aString2024 != null) string = class147.aString2024;
                stringStack[stringStackPointer++] = string;
                return;
            }
            if (i == 5011) {
                int i_18_ = intStack[--intStackPointer];
                Component335 class147 = s.method3985(-101, i_18_);
                String string = "";
                if (class147 != null && class147.aString2022 != null) string = class147.aString2022;
                stringStack[stringStackPointer++] = string;
                return;
            }
            if (i == 5012) {
                int i_19_ = intStack[--intStackPointer];
                Component335 class147 = s.method3985(-101, i_19_);
                int i_20_ = -1;
                if (class147 != null) i_20_ = class147.anInt2026;
                intStack[intStackPointer++] = i_20_;
                return;
            }
            if (i == 5015) {
                String string;
                if (Component72.localPlayer != null && (Component72.localPlayer.displayName) != null) string = Component72.localPlayer.method2456(true, 255);
                else string = "";
                stringStack[stringStackPointer++] = string;
                return;
            }
            if (i == 5016) {
                intStack[intStackPointer++] = Component200.anInt3713;
                return;
            }
            if (i == 5017) {
                intStack[intStackPointer++] = HardwareProbe.method2749(-1);
                return;
            }
            if (i == 5018) {
                int i_21_ = intStack[--intStackPointer];
                Component335 class147 = s.method3985(-101, i_21_);
                int i_22_ = 0;
                if (class147 != null) i_22_ = class147.anInt2027;
                intStack[intStackPointer++] = i_22_;
                return;
            }
            if (i == 5019) {
                int i_23_ = intStack[--intStackPointer];
                Component335 class147 = s.method3985(-101, i_23_);
                String string = "";
                if (class147 != null && class147.aString2033 != null) string = class147.aString2033;
                stringStack[stringStackPointer++] = string;
                return;
            }
            if (i == 5020) {
                String string;
                if (Component72.localPlayer != null && (Component72.localPlayer.displayName) != null) string = Component72.localPlayer.getName(false, -78);
                else string = "";
                stringStack[stringStackPointer++] = string;
                return;
            }
            if (i == 5023) {
                int i_24_ = intStack[--intStackPointer];
                Component335 class147 = s.method3985(-101, i_24_);
                int i_25_ = -1;
                if (class147 != null) i_25_ = class147.anInt2031;
                intStack[intStackPointer++] = i_25_;
                return;
            }
            if (i == 5024) {
                int i_26_ = intStack[--intStackPointer];
                Component335 class147 = s.method3985(-101, i_26_);
                int i_27_ = -1;
                if (class147 != null) i_27_ = class147.anInt2030;
                intStack[intStackPointer++] = i_27_;
                return;
            }
            if (i == 5025) {
                int i_28_ = intStack[--intStackPointer];
                Component335 class147 = s.method3985(-101, i_28_);
                String string = "";
                if (class147 != null && class147.aString2025 != null) string = class147.aString2025;
                stringStack[stringStackPointer++] = string;
                return;
            }
            if (i == 5050) {
                int i_29_ = intStack[--intStackPointer];
                stringStack[stringStackPointer++] = (Component33.aClass226_2639.method1625(0, i_29_).aString9587);
                return;
            }
            if (i == 5051) {
                int i_30_ = intStack[--intStackPointer];
                StringDefinition class348_sub42_sub11 = Component33.aClass226_2639.method1625(0, i_30_);
                if ((class348_sub42_sub11.anIntArray9592) == null) intStack[intStackPointer++] = 0;
                else {
                    intStack[intStackPointer++] = (class348_sub42_sub11.anIntArray9592).length;
                    return;
                }
                return;
            }
            if (i == 5052) {
                intStackPointer -= 2;
                int i_31_ = intStack[intStackPointer];
                int i_32_ = intStack[intStackPointer + 1];
                StringDefinition class348_sub42_sub11 = Component33.aClass226_2639.method1625(0, i_31_);
                int i_33_ = (class348_sub42_sub11.anIntArray9592[i_32_]);
                intStack[intStackPointer++] = i_33_;
                return;
            }
            if (i == 5053) {
                int i_34_ = intStack[--intStackPointer];
                StringDefinition class348_sub42_sub11 = Component33.aClass226_2639.method1625(0, i_34_);
                if ((class348_sub42_sub11.anIntArray9580) == null) intStack[intStackPointer++] = 0;
                else {
                    intStack[intStackPointer++] = (class348_sub42_sub11.anIntArray9580).length;
                    return;
                }
                return;
            }
            if (i == 5054) {
                intStackPointer -= 2;
                int i_35_ = intStack[intStackPointer];
                int i_36_ = intStack[intStackPointer + 1];
                intStack[intStackPointer++] = (Component33.aClass226_2639.method1625(0, i_35_).anIntArray9580[i_36_]);
                return;
            }
            if (i == 5055) {
                int i_37_ = intStack[--intStackPointer];
                stringStack[stringStackPointer++] = Component31.aClass355_5900.method3471(i_37_, (byte) -112).method3219(127);
                return;
            }
            if (i == 5056) {
                int i_38_ = intStack[--intStackPointer];
                HashNodeSub10 class348_sub42_sub10 = Component31.aClass355_5900.method3471(i_38_, (byte) -125);
                if ((class348_sub42_sub10.anIntArray9566) == null) intStack[intStackPointer++] = 0;
                else {
                    intStack[intStackPointer++] = (class348_sub42_sub10.anIntArray9566).length;
                    return;
                }
                return;
            }
            if (i == 5057) {
                intStackPointer -= 2;
                int i_39_ = intStack[intStackPointer];
                int i_40_ = intStack[intStackPointer + 1];
                intStack[intStackPointer++] = (Component31.aClass355_5900.method3471(i_39_, (byte) -126).anIntArray9566[i_40_]);
                return;
            }
            if (i == 5058) {
                aClass43_1151 = new CookieBuilder();
                aClass43_1151.anInt615 = intStack[--intStackPointer];
                aClass43_1151.aClass348_Sub42_Sub10_614 = Component31.aClass355_5900.method3471((aClass43_1151.anInt615), (byte) -87);
                aClass43_1151.anIntArray617 = new int[aClass43_1151.aClass348_Sub42_Sub10_614.method3215((byte) -48)];
                return;
            }
            if (i == 5059) {
                anInt1165++;
                ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(CacheStore.aClass351_643, (DisplayModeManagerContainer64.aClass77_9029), -93);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                int i_41_ = (class348_sub47.aClass348_Sub49_Sub2_7116.offset);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, aClass43_1151.anInt615);
                aClass43_1151.aClass348_Sub42_Sub10_614.method3210((byte) 12, aClass43_1151.anIntArray617, (class348_sub47.aClass348_Sub49_Sub2_7116));
                class348_sub47.aClass348_Sub49_Sub2_7116.writeLengthByte(115, (class348_sub47.aClass348_Sub49_Sub2_7116.offset) - i_41_);
                HashNodeSub14.enqueueOutboundPacket(127, class348_sub47);
                return;
            }
            if (i == 5060) {
                String string = stringStack[--stringStackPointer];
                anInt1166++;
                ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(Component177.aClass351_2109, (DisplayModeManagerContainer64.aClass77_9029), -89);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                int i_42_ = (class348_sub47.aClass348_Sub49_Sub2_7116.offset);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, aClass43_1151.anInt615);
                aClass43_1151.aClass348_Sub42_Sub10_614.method3210((byte) -125, aClass43_1151.anIntArray617, (class348_sub47.aClass348_Sub49_Sub2_7116));
                class348_sub47.aClass348_Sub49_Sub2_7116.writeLengthByte(102, (class348_sub47.aClass348_Sub49_Sub2_7116.offset) - i_42_);
                HashNodeSub14.enqueueOutboundPacket(127, class348_sub47);
                return;
            }
            if (i == 5061) {
                anInt1165++;
                ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(CacheStore.aClass351_643, (DisplayModeManagerContainer64.aClass77_9029), -104);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                int i_43_ = (class348_sub47.aClass348_Sub49_Sub2_7116.offset);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 1);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, aClass43_1151.anInt615);
                aClass43_1151.aClass348_Sub42_Sub10_614.method3210((byte) -126, aClass43_1151.anIntArray617, (class348_sub47.aClass348_Sub49_Sub2_7116));
                class348_sub47.aClass348_Sub49_Sub2_7116.writeLengthByte(92, (class348_sub47.aClass348_Sub49_Sub2_7116.offset) - i_43_);
                HashNodeSub14.enqueueOutboundPacket(-111, class348_sub47);
                return;
            }
            if (i == 5062) {
                intStackPointer -= 2;
                int i_44_ = intStack[intStackPointer];
                int i_45_ = intStack[intStackPointer + 1];
                intStack[intStackPointer++] = (Component33.aClass226_2639.method1625(0, i_44_).aCharArray9588[i_45_]);
                return;
            }
            if (i == 5063) {
                intStackPointer -= 2;
                int i_46_ = intStack[intStackPointer];
                int i_47_ = intStack[intStackPointer + 1];
                intStack[intStackPointer++] = (Component33.aClass226_2639.method1625(0, i_46_).aCharArray9582[i_47_]);
                return;
            }
            if (i == 5064) {
                intStackPointer -= 2;
                int i_48_ = intStack[intStackPointer];
                int i_49_ = intStack[intStackPointer + 1];
                if (i_49_ == -1) intStack[intStackPointer++] = -1;
                else {
                    intStack[intStackPointer++] = Component33.aClass226_2639.method1625(0, i_48_).method3226((char) i_49_, 57249897);
                    return;
                }
                return;
            }
            if (i == 5065) {
                intStackPointer -= 2;
                int i_50_ = intStack[intStackPointer];
                int i_51_ = intStack[intStackPointer + 1];
                if (i_51_ == -1) intStack[intStackPointer++] = -1;
                else {
                    intStack[intStackPointer++] = Component33.aClass226_2639.method1625(0, i_50_).method3222((byte) -122, (char) i_51_);
                    return;
                }
                return;
            }
            if (i == 5066) {
                int i_52_ = intStack[--intStackPointer];
                intStack[intStackPointer++] = Component31.aClass355_5900.method3471(i_52_, (byte) -123).method3215((byte) -127);
                return;
            }
            if (i == 5067) {
                intStackPointer -= 2;
                int i_53_ = intStack[intStackPointer];
                int i_54_ = intStack[intStackPointer + 1];
                int i_55_ = Component31.aClass355_5900.method3471(i_53_, (byte) -127).method3212(0, i_54_).anInt1941;
                intStack[intStackPointer++] = i_55_;
                return;
            }
            if (i == 5068) {
                intStackPointer -= 2;
                int i_56_ = intStack[intStackPointer];
                int i_57_ = intStack[intStackPointer + 1];
                aClass43_1151.anIntArray617[i_56_] = i_57_;
                return;
            }
            if (i == 5069) {
                intStackPointer -= 2;
                int i_58_ = intStack[intStackPointer];
                int i_59_ = intStack[intStackPointer + 1];
                aClass43_1151.anIntArray617[i_58_] = i_59_;
                return;
            }
            if (i == 5070) {
                intStackPointer -= 3;
                int i_60_ = intStack[intStackPointer];
                int i_61_ = intStack[intStackPointer + 1];
                int i_62_ = intStack[intStackPointer + 2];
                HashNodeSub10 class348_sub42_sub10 = Component31.aClass355_5900.method3471(i_60_, (byte) -127);
                if ((class348_sub42_sub10.method3212(0, i_61_).anInt1941) != 0) throw new RuntimeException("bad command");
                intStack[intStackPointer++] = class348_sub42_sub10.method3213(i_62_, i_61_, true);
                return;
            }
            if (i == 5071) {
                String string = stringStack[--stringStackPointer];
                boolean bool_63_ = intStack[--intStackPointer] == 1;
                DisplayModeManagerContainer370.method606(0, bool_63_, string);
                intStack[intStackPointer++] = DisplayModeManagerContainer154.anInt1285;
                return;
            }
            if (i == 5072) {
                if (Component353.aShortArray2579 == null || Component3.anInt2037 >= DisplayModeManagerContainer154.anInt1285) intStack[intStackPointer++] = -1;
                else {
                    intStack[intStackPointer++] = (Component353.aShortArray2579[Component3.anInt2037++] & 0xffff);
                    return;
                }
                return;
            }
            if (i == 5073) {
                Component3.anInt2037 = 0;
                return;
            }
        } else if (i < 5200) {
            if (i == 5100) {
                if (Component280.aClass346_2449.isKeyDown(86, -121)) intStack[intStackPointer++] = 1;
                else {
                    intStack[intStackPointer++] = 0;
                    return;
                }
                return;
            }
            if (i == 5101) {
                if (Component280.aClass346_2449.isKeyDown(82, -126)) intStack[intStackPointer++] = 1;
                else {
                    intStack[intStackPointer++] = 0;
                    return;
                }
                return;
            }
            if (i == 5102) {
                if (Component280.aClass346_2449.isKeyDown(81, -128)) intStack[intStackPointer++] = 1;
                else {
                    intStack[intStackPointer++] = 0;
                    return;
                }
                return;
            }
        } else if (i < 5300) {
            if (i == 5200) {
                DisplayModeManagerContainer91.method312(intStack[--intStackPointer], (byte) 56);
                return;
            }
            if (i == 5201) {
                intStack[intStackPointer++] = DisplayModeManagerContainer389.method244(37);
                return;
            }
            if (i == 5205) {
                DisplayModeManagerContainer310.method298(false, -1, -1, intStack[--intStackPointer], -53);
                return;
            }
            if (i == 5206) {
                int i_64_ = intStack[--intStackPointer];
                HashNodeSub14 class348_sub42_sub14 = DisplayModeManagerContainer229.findAreaAt(i_64_ >> 14 & 0x3fff, i_64_ & 0x3fff);
                if (class348_sub42_sub14 == null) intStack[intStackPointer++] = -1;
                else {
                    intStack[intStackPointer++] = (class348_sub42_sub14.anInt9628);
                    return;
                }
                return;
            }
            if (i == 5207) {
                HashNodeSub14 class348_sub42_sub14 = DisplayModeManagerContainer229.getArea(intStack[--intStackPointer]);
                if (class348_sub42_sub14 == null || (class348_sub42_sub14.aString9632) == null) stringStack[stringStackPointer++] = "";
                else {
                    stringStack[stringStackPointer++] = (class348_sub42_sub14.aString9632);
                    return;
                }
                return;
            }
            if (i == 5208) {
                intStack[intStackPointer++] = Component361.anInt370;
                intStack[intStackPointer++] = Component280.anInt2446;
                return;
            }
            if (i == 5209) {
                intStack[intStackPointer++] = NodeSub36.anInt6992 + DisplayModeManagerContainer229.anInt1266;
                intStack[intStackPointer++] = DebugOverlay.anInt3170 + DisplayModeManagerContainer229.anInt1263;
                return;
            }
            if (i == 5210) {
                int i_65_ = intStack[--intStackPointer];
                HashNodeSub14 class348_sub42_sub14 = DisplayModeManagerContainer229.getArea(i_65_);
                if (class348_sub42_sub14 == null) {
                    intStack[intStackPointer++] = 0;
                    intStack[intStackPointer++] = 0;
                } else {
                    intStack[intStackPointer++] = (class348_sub42_sub14.anInt9640) >> 14 & 0x3fff;
                    intStack[intStackPointer++] = (class348_sub42_sub14.anInt9640) & 0x3fff;
                    return;
                }
                return;
            }
            if (i == 5211) {
                int i_66_ = intStack[--intStackPointer];
                HashNodeSub14 class348_sub42_sub14 = DisplayModeManagerContainer229.getArea(i_66_);
                if (class348_sub42_sub14 == null) {
                    intStack[intStackPointer++] = 0;
                    intStack[intStackPointer++] = 0;
                } else {
                    intStack[intStackPointer++] = ((class348_sub42_sub14.anInt9635) - (class348_sub42_sub14.anInt9644));
                    intStack[intStackPointer++] = ((class348_sub42_sub14.anInt9627) - (class348_sub42_sub14.anInt9643));
                    return;
                }
                return;
            }
            if (i == 5212) {
                NodeSub21 class348_sub21 = DisplayModeManagerContainer89.method199(1);
                if (class348_sub21 == null) {
                    intStack[intStackPointer++] = -1;
                    intStack[intStackPointer++] = -1;
                } else {
                    intStack[intStackPointer++] = class348_sub21.anInt6847;
                    int i_67_ = (class348_sub21.anInt6850 << 28 | (class348_sub21.anInt6852 + DisplayModeManagerContainer229.anInt1266) << 14 | (class348_sub21.anInt6851 + DisplayModeManagerContainer229.anInt1263));
                    intStack[intStackPointer++] = i_67_;
                    return;
                }
                return;
            }
            if (i == 5213) {
                NodeSub21 class348_sub21 = LruCache.method3479(-1);
                if (class348_sub21 == null) {
                    intStack[intStackPointer++] = -1;
                    intStack[intStackPointer++] = -1;
                } else {
                    intStack[intStackPointer++] = class348_sub21.anInt6847;
                    int i_68_ = (class348_sub21.anInt6850 << 28 | (class348_sub21.anInt6852 + DisplayModeManagerContainer229.anInt1266) << 14 | (class348_sub21.anInt6851 + DisplayModeManagerContainer229.anInt1263));
                    intStack[intStackPointer++] = i_68_;
                    return;
                }
                return;
            }
            if (i == 5214) {
                int i_69_ = intStack[--intStackPointer];
                HashNodeSub14 class348_sub42_sub14 = ImageTagText.method1269(-17096);
                if (class348_sub42_sub14 != null) {
                    boolean bool_70_ = class348_sub42_sub14.method3236(anIntArray1175, i_69_ >> 14 & 0x3fff, i_69_ & 0x3fff, i_69_ >> 28 & 0x3, (byte) -28);
                    if (bool_70_) BrowserUrlOpener.setMixerOffsets(anIntArray1175[1], -17, anIntArray1175[2]);
                }
                return;
            }
            if (i == 5215) {
                intStackPointer -= 2;
                int i_71_ = intStack[intStackPointer];
                int i_72_ = intStack[intStackPointer + 1];
                HashTable class107 = DisplayModeManagerContainer229.findAreasInRange(i_71_ >> 14 & 0x3fff, i_71_ & 0x3fff);
                boolean bool_73_ = false;
                for (HashNodeSub14 class348_sub42_sub14 = (HashNodeSub14) class107.first(-48); class348_sub42_sub14 != null; class348_sub42_sub14 = ((HashNodeSub14) class107.next((byte) 113))) {
                    if (class348_sub42_sub14.anInt9628 == i_72_) {
                        bool_73_ = true;
                        break;
                    }
                }
                if (bool_73_) intStack[intStackPointer++] = 1;
                else {
                    intStack[intStackPointer++] = 0;
                    return;
                }
                return;
            }
            if (i == 5218) {
                int i_74_ = intStack[--intStackPointer];
                HashNodeSub14 class348_sub42_sub14 = DisplayModeManagerContainer229.getArea(i_74_);
                if (class348_sub42_sub14 == null) intStack[intStackPointer++] = -1;
                else {
                    intStack[intStackPointer++] = (class348_sub42_sub14.anInt9631);
                    return;
                }
                return;
            }
            if (i == 5220) {
                intStack[intStackPointer++] = Node.anInt4290 == 100 ? 1 : 0;
                return;
            }
            if (i == 5221) {
                int i_75_ = intStack[--intStackPointer];
                BrowserUrlOpener.setMixerOffsets(i_75_ >> 14 & 0x3fff, -17, i_75_ & 0x3fff);
                return;
            }
            if (i == 5222) {
                HashNodeSub14 class348_sub42_sub14 = ImageTagText.method1269(-17096);
                if (class348_sub42_sub14 == null) {
                    intStack[intStackPointer++] = -1;
                    intStack[intStackPointer++] = -1;
                    return;
                } else {
                    boolean bool_76_ = (class348_sub42_sub14.method3239(true, DebugOverlay.anInt3170 + DisplayModeManagerContainer229.anInt1263, NodeSub36.anInt6992 + DisplayModeManagerContainer229.anInt1266, anIntArray1175));
                    if (bool_76_) {
                        intStack[intStackPointer++] = anIntArray1175[1];
                        intStack[intStackPointer++] = anIntArray1175[2];
                    } else {
                        intStack[intStackPointer++] = -1;
                        intStack[intStackPointer++] = -1;
                    }
                }
                return;
            }
            if (i == 5223) {
                intStackPointer -= 2;
                int i_77_ = intStack[intStackPointer];
                int i_78_ = intStack[intStackPointer + 1];
                DisplayModeManagerContainer310.method298(false, i_78_ & 0x3fff, i_78_ >> 14 & 0x3fff, i_77_, -53);
                return;
            }
            if (i == 5224) {
                int i_79_ = intStack[--intStackPointer];
                HashNodeSub14 class348_sub42_sub14 = ImageTagText.method1269(-17096);
                if (class348_sub42_sub14 == null) {
                    intStack[intStackPointer++] = -1;
                    intStack[intStackPointer++] = -1;
                    return;
                } else {
                    boolean bool_80_ = class348_sub42_sub14.method3236(anIntArray1175, i_79_ >> 14 & 0x3fff, i_79_ & 0x3fff, i_79_ >> 28 & 0x3, (byte) -28);
                    if (bool_80_) {
                        intStack[intStackPointer++] = anIntArray1175[1];
                        intStack[intStackPointer++] = anIntArray1175[2];
                    } else {
                        intStack[intStackPointer++] = -1;
                        intStack[intStackPointer++] = -1;
                    }
                }
                return;
            }
            if (i == 5225) {
                int i_81_ = intStack[--intStackPointer];
                HashNodeSub14 class348_sub42_sub14 = ImageTagText.method1269(-17096);
                if (class348_sub42_sub14 == null) {
                    intStack[intStackPointer++] = -1;
                    intStack[intStackPointer++] = -1;
                    return;
                } else {
                    boolean bool_82_ = class348_sub42_sub14.method3239(true, i_81_ & 0x3fff, i_81_ >> 14 & 0x3fff, anIntArray1175);
                    if (bool_82_) {
                        intStack[intStackPointer++] = anIntArray1175[1];
                        intStack[intStackPointer++] = anIntArray1175[2];
                    } else {
                        intStack[intStackPointer++] = -1;
                        intStack[intStackPointer++] = -1;
                    }
                }
                return;
            }
            if (i == 5226) {
                Component387.method1129(intStack[--intStackPointer], 100);
                return;
            }
            if (i == 5227) {
                intStackPointer -= 2;
                int i_83_ = intStack[intStackPointer];
                int i_84_ = intStack[intStackPointer + 1];
                DisplayModeManagerContainer310.method298(true, i_84_ & 0x3fff, i_84_ >> 14 & 0x3fff, i_83_, -62);
                return;
            }
            if (i == 5228) {
                NodeSub1Sub1.aBoolean8805 = intStack[--intStackPointer] == 1;
                return;
            }
            if (i == 5229) {
                intStack[intStackPointer++] = NodeSub1Sub1.aBoolean8805 ? 1 : 0;
                return;
            }
            if (i == 5230) {
                int i_85_ = intStack[--intStackPointer];
                DisplayModeManagerContainer91.method314((byte) -74, i_85_);
                return;
            }
            if (i == 5231) {
                intStackPointer -= 2;
                int i_86_ = intStack[intStackPointer];
                boolean bool_87_ = intStack[intStackPointer + 1] == 1;
                if (Component140.aClass356_10442 != null) {
                    Node class348 = Component140.aClass356_10442.get(i_86_, -6008);
                    if (class348 != null && !bool_87_) class348.unlink((byte) 48);
                    else if (class348 == null && bool_87_) {
                        class348 = new Node();
                        Component140.aClass356_10442.put((byte) 29, i_86_, class348);
                    }
                }
                return;
            }
            if (i == 5232) {
                int i_88_ = intStack[--intStackPointer];
                if (Component140.aClass356_10442 == null) {
                    intStack[intStackPointer++] = 0;
                    return;
                } else {
                    Node class348 = Component140.aClass356_10442.get(i_88_, -6008);
                    intStack[intStackPointer++] = class348 != null ? 1 : 0;
                }
                return;
            }
            if (i == 5233) {
                intStackPointer -= 2;
                int i_89_ = intStack[intStackPointer];
                boolean bool_90_ = intStack[intStackPointer + 1] == 1;
                if (HeapDumpHelper.aClass356_4934 != null) {
                    Node class348 = HeapDumpHelper.aClass356_4934.get(i_89_, -6008);
                    if (class348 != null && !bool_90_) class348.unlink((byte) 83);
                    else if (class348 == null && bool_90_) {
                        class348 = new Node();
                        HeapDumpHelper.aClass356_4934.put((byte) 112, i_89_, class348);
                    }
                }
                return;
            }
            if (i == 5234) {
                int i_91_ = intStack[--intStackPointer];
                if (HeapDumpHelper.aClass356_4934 == null) {
                    intStack[intStackPointer++] = 0;
                    return;
                } else {
                    Node class348 = HeapDumpHelper.aClass356_4934.get(i_91_, -6008);
                    intStack[intStackPointer++] = class348 != null ? 1 : 0;
                }
                return;
            }
            if (i == 5235) {
                intStack[intStackPointer++] = (DisplayModeManagerContainer229.aClass348_Sub42_Sub14_1243 != null ? DisplayModeManagerContainer229.aClass348_Sub42_Sub14_1243.anInt9628 : -1);
                return;
            }
            if (i == 5236) {
                intStackPointer -= 2;
                int i_92_ = intStack[intStackPointer];
                int i_93_ = intStack[intStackPointer + 1];
                int i_94_ = i_93_ >> 14 & 0x3fff;
                int i_95_ = i_93_ & 0x3fff;
                int i_96_ = DisplayModeManagerContainer295.method1754(true, i_92_, i_94_, i_95_);
                if (i_96_ < 0) intStack[intStackPointer++] = -1;
                else {
                    intStack[intStackPointer++] = i_96_;
                    return;
                }
                return;
            }
            if (i == 5237) {
                DisplayModeManagerContainer273.method1134(86);
                return;
            }
        } else if (i < 5400) {
            if (i == 5300) {
                intStackPointer -= 2;
                int i_97_ = intStack[intStackPointer];
                int i_98_ = intStack[intStackPointer + 1];
                LogicError.method830(3, i_97_, (byte) 102, false, i_98_);
                intStack[intStackPointer++] = Component225.aFrame476 != null ? 1 : 0;
                return;
            }
            if (i == 5301) {
                if (Component225.aFrame476 != null) LogicError.method830(Component192.aClass348_Sub51_3959.aClass239_Sub8_7227.method1751(-32350), -1, (byte) 102, false, -1);
                return;
            }
            if (i == 5302) {
                DisplayModeInfo[] class57s = FriendLoginMessage.getFilteredDisplayModes(1494);
                intStack[intStackPointer++] = class57s.length;
                return;
            }
            if (i == 5303) {
                int i_99_ = intStack[--intStackPointer];
                DisplayModeInfo[] class57s = FriendLoginMessage.getFilteredDisplayModes(1494);
                intStack[intStackPointer++] = class57s[i_99_].width;
                intStack[intStackPointer++] = class57s[i_99_].height;
                return;
            }
            if (i == 5305) {
                int i_100_ = InputHandler.canvasWidth;
                int i_101_ = DisplayModeManagerContainer295.canvasWidth;
                int i_102_ = -1;
                DisplayModeInfo[] class57s = FriendLoginMessage.getFilteredDisplayModes(1494);
                for (int i_103_ = 0; i_103_ < class57s.length; i_103_++) {
                    DisplayModeInfo class57 = class57s[i_103_];
                    if (class57.width == i_100_ && class57.height == i_101_) {
                        i_102_ = i_103_;
                        break;
                    }
                }
                intStack[intStackPointer++] = i_102_;
                return;
            }
            if (i == 5306) {
                intStack[intStackPointer++] = MenuEntry.getWindowMode(-126);
                return;
            }
            if (i == 5307) {
                int i_104_ = intStack[--intStackPointer];
                if (i_104_ >= 1 && i_104_ <= 2) {
                    LogicError.method830(i_104_, -1, (byte) 102, false, -1);
                    return;
                }
                return;
            }
            if (i == 5308) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub8_7227.method1751(-32350);
                return;
            }
            if (i == 5309) {
                int i_105_ = intStack[--intStackPointer];
                if (i_105_ >= 1 && i_105_ <= 2) {
                    Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub8_7227), i_105_);
                    Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub8_7254), i_105_);
                    DisplayModeManagerContainer389.method243(37);
                    return;
                }
                return;
            }
        } else if (i < 5500) {
            if (i == 5400) {
                stringStackPointer -= 2;
                String string = stringStack[stringStackPointer];
                String string_106_ = stringStack[stringStackPointer + 1];
                int i_107_ = intStack[--intStackPointer];
                anInt1171++;
                ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((DefinitionSub17.aClass351_9234), (DisplayModeManagerContainer64.aClass77_9029), -101);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, (Component31.method1745(string, -65) + Component31.method1745(string_106_, -65) + 1));
                class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string_106_);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, i_107_);
                HashNodeSub14.enqueueOutboundPacket(-66, class348_sub47);
                return;
            }
            if (i == 5401) {
                intStackPointer -= 2;
                RenderableSub6.aShortArray6428[intStack[intStackPointer]] = (short) Shader.method160(27076, intStack[intStackPointer + 1]);
                Exception_Sub1.itemDefinitions.method1930(-21804);
                Exception_Sub1.itemDefinitions.method1936(-71);
                Component291.aClass278_2529.method2074(-118);
                Component160.method3466(125);
                return;
            }
            if (i == 5405) {
                intStackPointer -= 2;
                int i_108_ = intStack[intStackPointer];
                int i_109_ = intStack[intStackPointer + 1];
                if (i_108_ >= 0 && i_108_ < 2) PlayerState.anIntArrayArrayArray7079[i_108_] = new int[i_109_ << 1][4];
                return;
            }
            if (i == 5406) {
                intStackPointer -= 7;
                int i_110_ = intStack[intStackPointer];
                int i_111_ = intStack[intStackPointer + 1] << 1;
                int i_112_ = intStack[intStackPointer + 2];
                int i_113_ = intStack[intStackPointer + 3];
                int i_114_ = intStack[intStackPointer + 4];
                int i_115_ = intStack[intStackPointer + 5];
                int i_116_ = intStack[intStackPointer + 6];
                if (i_110_ >= 0 && i_110_ < 2 && PlayerState.anIntArrayArrayArray7079[i_110_] != null && i_111_ >= 0 && i_111_ < (PlayerState.anIntArrayArrayArray7079[i_110_]).length) {
                    PlayerState.anIntArrayArrayArray7079[i_110_][i_111_] = new int[]{(i_112_ >> 14 & 0x3fff) << 9, i_113_ << 2, (i_112_ & 0x3fff) << 9, i_116_};
                    PlayerState.anIntArrayArrayArray7079[i_110_][i_111_ + 1] = new int[]{(i_114_ >> 14 & 0x3fff) << 9, i_115_ << 2, (i_114_ & 0x3fff) << 9};
                }
                return;
            }
            if (i == 5407) {
                int i_117_ = ((PlayerState.anIntArrayArrayArray7079[intStack[--intStackPointer]]).length >> 1);
                intStack[intStackPointer++] = i_117_;
                return;
            }
            if (i == 5411) {
                if (Component225.aFrame476 != null) LogicError.method830(Component192.aClass348_Sub51_3959.aClass239_Sub8_7227.method1751(-32350), -1, (byte) 102, false, -1);
                if (RSACipher.aFrame4904 == null) {
                    String string = (Component262.quitUrl != null ? Component262.quitUrl : WaterShaderProgram.method2162(false));
                    BrowserDetector.openBrowserUrl(string, OggUrlStream.aClass297_8992, Component192.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) == 1, false, -47);
                    return;
                } else {
                    DisplayModeManagerContainer343.saveClientPreferences(97);
                    System.exit(0);
                }
                return;
            }
            if (i == 5419) {
                String string = "";
                if (PauseHandler.aClass144_9536 != null) {
                    if (PauseHandler.aClass144_9536.result != null) string = (String) (PauseHandler.aClass144_9536.result);
                    else string = Component366.method1669(-19918, (PauseHandler.aClass144_9536.intArg1));
                }
                stringStack[stringStackPointer++] = string;
                return;
            }
            if (i == 5420) {
                intStack[intStackPointer++] = OggUrlStream.aClass297_8992.signed ? 0 : 1;
                return;
            }
            if (i == 5421) {
                if (Component225.aFrame476 != null) LogicError.method830(Component192.aClass348_Sub51_3959.aClass239_Sub8_7227.method1751(-32350), -1, (byte) 102, false, -1);
                String string = stringStack[--stringStackPointer];
                boolean bool_118_ = intStack[--intStackPointer] == 1;
                String string_119_ = WaterShaderProgram.method2162(false) + string;
                BrowserDetector.openBrowserUrl(string_119_, OggUrlStream.aClass297_8992, Component192.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) == 1, bool_118_, 104);
                return;
            }
            if (i == 5422) {
                stringStackPointer -= 2;
                String string = stringStack[stringStackPointer];
                String string_120_ = stringStack[stringStackPointer + 1];
                int i_121_ = intStack[--intStackPointer];
                if (string.length() > 0) {
                    if (WaterShader.aStringArray7378 == null) WaterShader.aStringArray7378 = new String[(SocketConnector.anIntArray3475[PacketReader.currentGameType.id])];
                    WaterShader.aStringArray7378[i_121_] = string;
                }
                if (string_120_.length() > 0) {
                    if (Component285.aStringArray974 == null) Component285.aStringArray974 = new String[(SocketConnector.anIntArray3475[PacketReader.currentGameType.id])];
                    Component285.aStringArray974[i_121_] = string_120_;
                }
                return;
            }
            if (i == 5423) {
                System.out.println(stringStack[--stringStackPointer]);
                return;
            }
            if (i == 5424) {
                intStackPointer -= 11;
                Component235.anInt3376 = intStack[intStackPointer];
                ObjectDefinition.anInt948 = intStack[intStackPointer + 1];
                Component235.anInt3374 = intStack[intStackPointer + 2];
                HashNodeSub4.anInt9511 = intStack[intStackPointer + 3];
                BuildType.anInt2996 = intStack[intStackPointer + 4];
                ToolbarRefreshDefinition.anInt9231 = intStack[intStackPointer + 5];
                DisplayModeManagerContainer58.anInt10257 = intStack[intStackPointer + 6];
                Component55.anInt3937 = intStack[intStackPointer + 7];
                NpcComposition.anInt1387 = intStack[intStackPointer + 8];
                StringDefinition.anInt9586 = intStack[intStackPointer + 9];
                Component2.anInt8363 = intStack[intStackPointer + 10];
                Component158.aClass45_322.isSingletonFileReady(false, BuildType.anInt2996);
                Component158.aClass45_322.isSingletonFileReady(false, ToolbarRefreshDefinition.anInt9231);
                Component158.aClass45_322.isSingletonFileReady(false, DisplayModeManagerContainer58.anInt10257);
                Component158.aClass45_322.isSingletonFileReady(false, Component55.anInt3937);
                Component158.aClass45_322.isSingletonFileReady(false, NpcComposition.anInt1387);
                RSARequest.aClass105_9659 = Component338.aClass105_1706 = RadixParser.aClass105_2309 = null;
                OutputStream_Sub2.aClass105_106 = Component221.aClass105_1800 = NodeSub5.aClass105_6627 = null;
                RSARequest.aClass105_9658 = DisplayModeManagerContainer74.aClass105_4808 = null;
                DisplayModeManagerContainer5.aBoolean1211 = true;
                return;
            }
            if (i == 5425) {
                FriendsIgnoreList.clearHudSprites(12);
                DisplayModeManagerContainer5.aBoolean1211 = false;
                return;
            }
            if (i == 5426) {
                intStackPointer -= 2;
                HashNodeSub16Sub1.defaultCursorId = intStack[intStackPointer];
                PauseTimer.anInt506 = intStack[intStackPointer + 1];
                return;
            }
            if (i == 5427) {
                intStackPointer -= 2;
                CookieManager.anInt6299 = intStack[intStackPointer + 1];
                return;
            }
            if (i == 5428) {
                intStackPointer -= 2;
                int i_122_ = intStack[intStackPointer];
                int i_123_ = intStack[intStackPointer + 1];
                intStack[intStackPointer++] = Component327.method2410((byte) -49, i_123_, i_122_) ? 1 : 0;
                return;
            }
            if (i == 5429) {
                CommandHandler.handleCommand(stringStack[--stringStackPointer], false, false, (byte) -79);
                return;
            }
            if (i == 5430) {
                try {
                    AppletInvoker.callAppletNoArgs((byte) 125, ToolkitFactory.anApplet1530, "accountcreated");
                } catch (Throwable throwable) {
                    /* empty */
                }
                return;
            }
            if (i == 5431) {
                try {
                    AppletInvoker.callAppletNoArgs((byte) 125, ToolkitFactory.anApplet1530, "accountcreatestarted");
                } catch (Throwable throwable) {
                    /* empty */
                }
                return;
            }
            if (i == 5432) {
                String string = "";
                if (DefinitionSub27.aClipboard9357 != null) {
                    Transferable transferable = DefinitionSub27.aClipboard9357.getContents(null);
                    if (transferable != null) {
                        try {
                            string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
                            if (string == null) string = "";
                        } catch (Exception exception) {
                            /* empty */
                        }
                    }
                }
                stringStack[stringStackPointer++] = string;
                return;
            }
            if (i == 5433) {
                Component9.anInt4143 = intStack[--intStackPointer];
                return;
            }
        } else if (i < 5600) {
            if (i == 5500) {
                intStackPointer -= 4;
                int i_124_ = intStack[intStackPointer];
                int i_125_ = intStack[intStackPointer + 1];
                int i_126_ = intStack[intStackPointer + 2];
                int i_127_ = intStack[intStackPointer + 3];
                Component188.method1844(i_126_, ((i_124_ >> 14 & 0x3fff) - NodeBaseSub2.regionTileX), false, i_125_ << 2, false, i_127_, ((i_124_ & 0x3fff) - Component330.regionTileY));
                return;
            }
            if (i == 5501) {
                intStackPointer -= 4;
                int i_128_ = intStack[intStackPointer];
                int i_129_ = intStack[intStackPointer + 1];
                int i_130_ = intStack[intStackPointer + 2];
                int i_131_ = intStack[intStackPointer + 3];
                MenuEntry.setCutsceneCamera(((i_128_ & 0x3fff) - Component330.regionTileY), ((i_128_ >> 14 & 0x3fff) - NodeBaseSub2.regionTileX), i_129_ << 2, i_131_, i_130_, -128);
                return;
            }
            if (i == 5502) {
                intStackPointer -= 6;
                int i_132_ = intStack[intStackPointer];
                if (i_132_ >= 2) throw new RuntimeException();
                NodeBaseSub1.anInt9775 = i_132_;
                int i_133_ = intStack[intStackPointer + 1];
                if (i_133_ + 1 >= (PlayerState.anIntArrayArrayArray7079[NodeBaseSub1.anInt9775]).length >> 1) throw new RuntimeException();
                ItemDefinition.anInt2798 = i_133_;
                Component208.anInt1780 = 0;
                Component195.anInt5019 = intStack[intStackPointer + 2];
                Component374.anInt4133 = intStack[intStackPointer + 3];
                int i_134_ = intStack[intStackPointer + 4];
                if (i_134_ >= 2) throw new RuntimeException();
                Component102.anInt4803 = i_134_;
                int i_135_ = intStack[intStackPointer + 5];
                if (i_135_ + 1 >= (PlayerState.anIntArrayArrayArray7079[Component102.anInt4803]).length >> 1) throw new RuntimeException();
                Component235.anInt3373 = i_135_;
                DefinitionSub21.cameraMode = 3;
                JaclibLoader.anInt167 = ShaderLinker.anInt10163 = -1;
                return;
            }
            if (i == 5503) {
                Component59.method1122(0);
                return;
            }
            if (i == 5504) {
                intStackPointer -= 2;
                DisplayModeManagerContainer28.method2396(intStack[intStackPointer], intStack[intStackPointer + 1], 0, 3);
                return;
            }
            if (i == 5505) {
                intStack[intStackPointer++] = (int) DisplayModeManagerContainer154.cameraPitch >> 3;
                return;
            }
            if (i == 5506) {
                intStack[intStackPointer++] = (int) Component112.cameraYaw >> 3;
                return;
            }
            if (i == 5507) {
                Component82.method326((byte) 68);
                return;
            }
            if (i == 5508) {
                Component117.method3470(1);
                return;
            }
            if (i == 5509) {
                ParticleShader.method2153(-77);
                return;
            }
            if (i == 5510) {
                Component110.method262(0);
                return;
            }
            if (i == 5511) {
                int i_136_ = intStack[--intStackPointer];
                int i_137_ = i_136_ >> 14 & 0x3fff;
                int i_138_ = i_136_ & 0x3fff;
                i_137_ -= NodeBaseSub2.regionTileX;
                if (i_137_ < 0) i_137_ = 0;
                else if (i_137_ >= AbstractShaderSub4.anInt7319) i_137_ = AbstractShaderSub4.anInt7319;
                i_138_ -= Component330.regionTileY;
                if (i_138_ < 0) i_138_ = 0;
                else if (i_138_ >= ParametricDefinition.anInt9109) i_138_ = ParametricDefinition.anInt9109;
                NodederUtil.anInt6633 = (i_137_ << 9) + 256;
                NodeSub7.anInt6652 = (i_138_ << 9) + 256;
                DefinitionSub21.cameraMode = 4;
                JaclibLoader.anInt167 = ShaderLinker.anInt10163 = -1;
                return;
            }
            if (i == 5512) {
                Component284.method1851((byte) 121);
                return;
            }
            if (i == 5514) {
                Component72.anInt1911 = intStack[--intStackPointer];
                return;
            }
            if (i == 5516) {
                intStack[intStackPointer++] = Component72.anInt1911;
                return;
            }
            if (i == 5517) {
                int i_139_ = intStack[--intStackPointer];
                if (i_139_ == -1) {
                    int i_140_ = i_139_ >> 14 & 0x3fff;
                    int i_141_ = i_139_ & 0x3fff;
                    i_140_ -= NodeBaseSub2.regionTileX;
                    if (i_140_ < 0) i_140_ = 0;
                    else if (i_140_ >= AbstractShaderSub4.anInt7319) i_140_ = AbstractShaderSub4.anInt7319;
                    i_141_ -= Component330.regionTileY;
                    if (i_141_ < 0) i_141_ = 0;
                    else if (i_141_ >= ParametricDefinition.anInt9109) i_141_ = ParametricDefinition.anInt9109;
                    JaclibLoader.anInt167 = (i_140_ << 9) + 256;
                    ShaderLinker.anInt10163 = (i_141_ << 9) + 256;
                } else {
                    JaclibLoader.anInt167 = -1;
                    ShaderLinker.anInt10163 = -1;
                    return;
                }
                return;
            }
            if (i == 5547) {
                intStack[intStackPointer++] = DefinitionSub21.cameraMode == 1 ? 1 : 0;
                return;
            }
        } else if (i < 5700) {
            if (i == 5600) {
                stringStackPointer -= 2;
                String string = stringStack[stringStackPointer];
                String string_142_ = stringStack[stringStackPointer + 1];
                int i_143_ = intStack[--intStackPointer];
                if (string.length() <= 320 && Component49.clientState == 3 && (Component241.anInt2955 == 0 && AbstractShaderSub2.anInt7297 == 0)) {
                    DisplayModeManagerContainer282.username = string;
                    DisplayModeManagerContainer51.password = string_142_;
                    RuntimeException_Sub1.anInt4596 = i_143_;
                    Buffer.setClientState(2, 6);
                    return;
                }
                return;
            }
            if (i == 5601) {
                Component330.method854((byte) -76);
                return;
            }
            if (i == 5602) {
                if (Component241.anInt2955 == 0) {
                    HashTable.anInt1645 = -2;
                    NodederUtil.anInt6634 = -2;
                }
                return;
            }
            if (i == 5604) {
                stringStackPointer--;
                if (Component49.clientState == 3 && (Component241.anInt2955 == 0 && AbstractShaderSub2.anInt7297 == 0)) {
                    Component337.method2106(stringStack[stringStackPointer], 101);
                    return;
                }
                return;
            }
            if (i == 5605) {
                stringStackPointer -= 2;
                intStackPointer -= 2;
                if (Component49.clientState == 3 && (Component241.anInt2955 == 0 && AbstractShaderSub2.anInt7297 == 0)) {
                    Component377.method449(stringStack[stringStackPointer + 1], stringStack[stringStackPointer], false, intStack[intStackPointer], intStack[intStackPointer + 1] == 1);
                    return;
                }
                return;
            }
            if (i == 5606) {
                if (AbstractShaderSub2.anInt7297 == 0) Component48.anInt4337 = -2;
                return;
            }
            if (i == 5607) {
                intStack[intStackPointer++] = NodederUtil.anInt6634;
                return;
            }
            if (i == 5608) {
                intStack[intStackPointer++] = Component227.anInt1121;
                return;
            }
            if (i == 5609) {
                intStack[intStackPointer++] = Component48.anInt4337;
                return;
            }
            if (i == 5611) {
                intStack[intStackPointer++] = HashNodeSub7.anInt9541;
                return;
            }
            if (i == 5612) {
                int i_144_ = intStack[--intStackPointer];
                if (Component49.clientState == 7 && (Component241.anInt2955 == 0 && AbstractShaderSub2.anInt7297 == 0)) {
                    if (DefinitionSub8.aClass238_9165 != null) {
                        DefinitionSub8.aClass238_9165.close((byte) 36);
                        DefinitionSub8.aClass238_9165 = null;
                    }
                    RuntimeException_Sub1.anInt4596 = i_144_;
                    Buffer.setClientState(2, 9);
                    return;
                }
                return;
            }
            if (i == 5613) {
                intStack[intStackPointer++] = NodederUtil.anInt6634;
                return;
            }
            if (i == 5615) {
                stringStackPointer -= 2;
                String string = stringStack[stringStackPointer];
                String string_145_ = stringStack[stringStackPointer + 1];
                if (string.length() <= 320 && Component49.clientState == 3 && (Component241.anInt2955 == 0 && AbstractShaderSub2.anInt7297 == 0)) {
                    if (DefinitionSub8.aClass238_9165 != null) {
                        DefinitionSub8.aClass238_9165.close((byte) 36);
                        DefinitionSub8.aClass238_9165 = null;
                    }
                    DisplayModeManagerContainer282.username = string;
                    DisplayModeManagerContainer51.password = string_145_;
                    Buffer.setClientState(2, 5);
                    return;
                }
                return;
            }
            if (i == 5616) {
                LoggedOutDefinition.disconnectAndReset(false, (byte) 11);
                return;
            }
            if (i == 5617) {
                intStack[intStackPointer++] = HashTable.anInt1645;
                return;
            }
            if (i == 5618) {
                intStackPointer--;
                return;
            }
            if (i == 5619) {
                intStackPointer--;
                return;
            }
            if (i == 5620) {
                intStack[intStackPointer++] = 0;
                return;
            }
            if (i == 5621) {
                stringStackPointer -= 2;
                intStackPointer -= 2;
                return;
            }
            if (i == 5622) return;
            if (i == 5623) {
                if (OggStreamReader.aString9043 == null) {
                    intStack[intStackPointer++] = 0;
                    return;
                } else intStack[intStackPointer++] = 1;
                return;
            }
            if (i == 5624) {
                intStack[intStackPointer++] = (int) (ModelStore.aLong4615 >> 32);
                intStack[intStackPointer++] = (int) (ModelStore.aLong4615 & 0xffffL);
                return;
            }
            if (i == 5625) {
                intStack[intStackPointer++] = Component301.aBoolean4127 ? 1 : 0;
                return;
            }
            if (i == 5626) {
                Component301.aBoolean4127 = true;
                CookieManager.method2172(84);
                return;
            }
        } else if (i < 6100) {
            if (i == 6001) {
                int i_146_ = intStack[--intStackPointer];
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub10_7232), i_146_);
                NodeSub20.method2953((byte) -126);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6002) {
                boolean bool_147_ = intStack[--intStackPointer] == 1;
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub27_7255), bool_147_ ? 1 : 0);
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub27_7261), bool_147_ ? 1 : 0);
                NodeSub20.method2953((byte) -122);
                DefinitionSub9.method3072((byte) 32);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6003) {
                boolean bool_148_ = intStack[--intStackPointer] == 1;
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub14_7250), bool_148_ ? 2 : 1);
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub14_7264), bool_148_ ? 2 : 1);
                DefinitionSub9.method3072((byte) -106);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6005) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub4_7220), intStack[--intStackPointer] == 1 ? 1 : 0);
                NodeSub20.method2953((byte) -111);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6007) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub13_7236), intStack[--intStackPointer]);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6008) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub1_7246), intStack[--intStackPointer] == 1 ? 1 : 0);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6010) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub21_7270), intStack[--intStackPointer] == 1 ? 1 : 0);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6011) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub7_7238), intStack[--intStackPointer]);
                NodeSub20.method2953((byte) -116);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6012) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub28_7230), intStack[--intStackPointer] == 1 ? 1 : 0);
                Definition.method3038(-1);
                DisplayModeManagerContainer154.method773(true);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6014) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub18_7259), intStack[--intStackPointer] == 1 ? 2 : 0);
                NodeSub20.method2953((byte) -112);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6015) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub16_7247), intStack[--intStackPointer] == 1 ? 1 : 0);
                NodeSub20.method2953((byte) -127);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6016) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub20_7248), intStack[--intStackPointer]);
                SoftwareFallbackShader.method3553(false, (byte) 112, Component192.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350));
                DisplayModeManagerContainer389.method243(37);
                return;
            }
            if (i == 6017) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub5_7240), intStack[--intStackPointer] == 1 ? 1 : 0);
                Component243.method352(1);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6018) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub26_7272), intStack[--intStackPointer]);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6019) {
                int i_149_ = intStack[--intStackPointer];
                int i_150_ = Component192.aClass348_Sub51_3959.aClass239_Sub26_7260.method1838(-32350);
                if (i_149_ != i_150_) {
                    if (NativeLibLoader.isPostLoginState(true, Component49.clientState)) {
                        if (i_150_ == 0 && Component119.anInt3428 != -1) {
                            NodeSub1Sub3.method2732(0, Component119.anInt3428, false, 94, (Component54.aClass45_8667), i_149_);
                            DefinitionSub17Sub1.method3093(87);
                            DisplayModeManagerContainer238.aBoolean1236 = false;
                        } else if (i_149_ == 0) {
                            Component65.method960(1);
                            DisplayModeManagerContainer238.aBoolean1236 = false;
                        } else Component225.method345(i_149_, (byte) -49);
                    }
                    Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub26_7260), i_149_);
                    DisplayModeManagerContainer389.method243(37);
                    r.aBoolean9719 = false;
                }
                return;
            }
            if (i == 6020) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub26_7234), intStack[--intStackPointer]);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6021) {
                int i_151_ = Component192.aClass348_Sub51_3959.aClass239_Sub14_7250.method1778(-32350);
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub14_7264), intStack[--intStackPointer] == 1 ? 0 : i_151_);
                DefinitionSub9.method3072((byte) -118);
                return;
            }
            if (i == 6023) {
                int i_152_ = intStack[--intStackPointer];
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub15_7224), i_152_);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6024) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub20_7216), intStack[--intStackPointer]);
                DisplayModeManagerContainer389.method243(37);
                return;
            }
            if (i == 6025) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub6_7226), intStack[--intStackPointer]);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6027) {
                int i_153_ = intStack[--intStackPointer];
                if (i_153_ < 0 || i_153_ > 1) i_153_ = 0;
                DefinitionSub33.method3137(i_153_ == 1, (byte) -24);
                return;
            }
            if (i == 6028) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.customCursorSetting), intStack[--intStackPointer] != 0 ? 1 : 0);
                DisplayModeManagerContainer389.method243(37);
                return;
            }
            if (i == 6029) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub13_7236), intStack[--intStackPointer]);
                DisplayModeManagerContainer389.method243(37);
                return;
            }
            if (i == 6030) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub9_7256), intStack[--intStackPointer] != 0 ? 1 : 0);
                DisplayModeManagerContainer389.method243(37);
                NodeSub20.method2953((byte) -116);
                return;
            }
            if (i == 6031) {
                int i_154_ = intStack[--intStackPointer];
                if (i_154_ < 0 || i_154_ > 5) i_154_ = 2;
                SoftwareFallbackShader.method3553(false, (byte) 101, i_154_);
                return;
            }
            if (i == 6032) {
                intStackPointer -= 2;
                int i_155_ = intStack[intStackPointer];
                boolean bool_156_ = intStack[intStackPointer + 1] == 1;
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub25_7251), i_155_);
                if (!bool_156_) Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub29_7229), 0);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6033) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub17_7263), intStack[--intStackPointer]);
                DisplayModeManagerContainer389.method243(37);
                return;
            }
            if (i == 6034) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub24_7235), intStack[--intStackPointer] == 1 ? 1 : 0);
                DisplayModeManagerContainer389.method243(37);
                Definition.method3038(-1);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6035) {
                int i_157_ = Component192.aClass348_Sub51_3959.aClass239_Sub27_7255.method1840(-32350);
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub27_7261), intStack[--intStackPointer] == 1 ? 1 : i_157_);
                NodeSub20.method2953((byte) -110);
                DefinitionSub9.method3072((byte) 125);
                return;
            }
            if (i == 6036) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub23_7231), intStack[--intStackPointer]);
                DisplayModeManagerContainer389.method243(37);
                RuntimeException_Sub1.aBoolean4604 = true;
                return;
            }
            if (i == 6037) {
                Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub26_7215), intStack[--intStackPointer]);
                DisplayModeManagerContainer389.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6038) {
                int i_158_ = intStack[--intStackPointer];
                int i_159_ = Component192.aClass348_Sub51_3959.aClass239_Sub26_7245.method1838(-32350);
                if (i_158_ != i_159_ && Component119.anInt3428 == Component35.anInt4270) {
                    if (!NativeLibLoader.isPostLoginState(true, Component49.clientState)) {
                        if (i_159_ == 0) {
                            NodeSub1Sub3.method2732(0, Component119.anInt3428, false, 127, (Component54.aClass45_8667), i_158_);
                            DefinitionSub17Sub1.method3093(118);
                            DisplayModeManagerContainer238.aBoolean1236 = false;
                        } else if (i_158_ == 0) {
                            Component65.method960(1);
                            DisplayModeManagerContainer238.aBoolean1236 = false;
                        } else Component225.method345(i_158_, (byte) -52);
                    }
                    Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub26_7245), i_158_);
                    DisplayModeManagerContainer389.method243(37);
                    r.aBoolean9719 = false;
                }
                return;
            }
            if (i == 6039) {
                int i_160_ = intStack[--intStackPointer];
                if (i_160_ > 255 || i_160_ < 0) i_160_ = 0;
                if (i_160_ != Component192.aClass348_Sub51_3959.aClass239_Sub19_7257.method1805(-32350)) {
                    Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub19_7257), i_160_);
                    DisplayModeManagerContainer389.method243(37);
                    r.aBoolean9719 = false;
                }
                return;
            }
            if (i == 6040) {
                int i_161_ = intStack[--intStackPointer];
                if (i_161_ != Component192.aClass348_Sub51_3959.aClass239_Sub3_7222.method1727(-32350)) {
                    Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub3_7222), i_161_);
                    DisplayModeManagerContainer389.method243(37);
                    r.aBoolean9719 = false;
                    HashNodeSub3.method3179(0);
                }
                return;
            }
        } else if (i < 6200) {
            if (i == 6101) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub10_7232.method1764(-32350);
                return;
            }
            if (i == 6102) {
                intStack[intStackPointer++] = (Component192.aClass348_Sub51_3959.aClass239_Sub27_7255.method1840(-32350) == 1 ? 1 : 0);
                return;
            }
            if (i == 6103) {
                intStack[intStackPointer++] = (Component192.aClass348_Sub51_3959.aClass239_Sub14_7250.method1778(-32350) == 2 ? 1 : 0);
                return;
            }
            if (i == 6105) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub4_7220.method1737(-32350) == 1 ? 1 : 0;
                return;
            }
            if (i == 6107) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub13_7236.method1776(-32350);
                return;
            }
            if (i == 6108) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub1_7246.method1720(-32350) == 1 ? 1 : 0;
                return;
            }
            if (i == 6110) {
                intStack[intStackPointer++] = (Component192.aClass348_Sub51_3959.aClass239_Sub21_7270.method1812(-32350) == 1 ? 1 : 0);
                return;
            }
            if (i == 6111) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub7_7238.method1748(-32350);
                return;
            }
            if (i == 6112) {
                intStack[intStackPointer++] = (Component192.aClass348_Sub51_3959.aClass239_Sub28_7230.method1845(-32350) == 1 ? 1 : 0);
                return;
            }
            if (i == 6114) {
                intStack[intStackPointer++] = (Component192.aClass348_Sub51_3959.aClass239_Sub18_7259.method1800(-32350) == 2 ? 1 : 0);
                return;
            }
            if (i == 6115) {
                intStack[intStackPointer++] = (Component192.aClass348_Sub51_3959.aClass239_Sub16_7247.method1789(-32350) == 1 ? 1 : 0);
                return;
            }
            if (i == 6116) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub20_7248.method1808(-32350);
                return;
            }
            if (i == 6117) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub5_7240.method1739(-32350) == 1 ? 1 : 0;
                return;
            }
            if (i == 6118) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub26_7272.method1838(-32350);
                return;
            }
            if (i == 6119) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub26_7260.method1838(-32350);
                return;
            }
            if (i == 6120) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub26_7234.method1838(-32350);
                return;
            }
            if (i == 6123) {
                intStack[intStackPointer++] = Component2.method197(false);
                return;
            }
            if (i == 6124) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub20_7216.method1808(-32350);
                return;
            }
            if (i == 6125) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub6_7226.method1743(-32350);
                return;
            }
            if (i == 6127) {
                intStack[intStackPointer++] = (Component192.aClass348_Sub51_3959.aClass239_Sub12_7243.method1771(-32350) == 1 ? 1 : 0);
                return;
            }
            if (i == 6128) {
                intStack[intStackPointer++] = (Component192.aClass348_Sub51_3959.customCursorSetting.getValue(-32350) == 1 ? 1 : 0);
                return;
            }
            if (i == 6129) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub13_7236.method1776(-32350);
                return;
            }
            if (i == 6130) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub9_7256.method1759(-32350) == 1 ? 1 : 0;
                return;
            }
            if (i == 6131) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350);
                return;
            }
            if (i == 6132) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub25_7251.method1829(-32350);
                return;
            }
            if (i == 6133) {
                intStack[intStackPointer++] = ((OggUrlStream.aClass297_8992.signed) && !(OggUrlStream.aClass297_8992.useDirectDraw)) ? 1 : 0;
                return;
            }
            if (i == 6135) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub17_7263.method1798(-32350);
                return;
            }
            if (i == 6136) {
                intStack[intStackPointer++] = (Component192.aClass348_Sub51_3959.aClass239_Sub24_7235.method1820(-32350) == 1 ? 1 : 0);
                return;
            }
            if (i == 6138) {
                intStack[intStackPointer++] = Component329.method1781(Component192.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350), -84, 200);
                return;
            }
            if (i == 6139) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub23_7231.method1818(-32350);
                return;
            }
            if (i == 6142) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub26_7215.method1838(-32350);
                return;
            }
            if (i == 6143) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub26_7245.method1838(-32350);
                return;
            }
            if (i == 6144) {
                intStack[intStackPointer++] = DisplayModeManagerContainer64.aBoolean9038 ? 1 : 0;
                return;
            }
            if (i == 6145) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub19_7257.method1805(-32350);
                return;
            }
            if (i == 6146) {
                intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub3_7222.method1727(-32350);
                return;
            }
            if (i == 6147) {
                intStack[intStackPointer++] = (DefinitionSub20.aClass348_Sub4_9264.anInt6609 < 512 || DisplayModeManagerContainer64.aBoolean9038 || GpsOverlay.aBoolean1952) ? 1 : 0;
                return;
            }
            if (i == 6148) {
                intStack[intStackPointer++] = DisplayModeManagerContainer42.aBoolean3847 ? 1 : 0;
                return;
            }
        } else if (i < 6300) {
            if (i == 6200) {
                intStackPointer -= 2;
                Component338.aShort1700 = (short) intStack[intStackPointer];
                if (Component338.aShort1700 <= 0) Component338.aShort1700 = (short) 256;
                Component39.aShort2250 = (short) intStack[intStackPointer + 1];
                if (Component39.aShort2250 <= 0) Component39.aShort2250 = (short) 205;
                return;
            }
            if (i == 6201) {
                intStackPointer -= 2;
                OggStreamReader.aShort9044 = (short) intStack[intStackPointer];
                if (OggStreamReader.aShort9044 <= 0) OggStreamReader.aShort9044 = (short) 256;
                Component233.aShort3992 = (short) intStack[intStackPointer + 1];
                if (Component233.aShort3992 <= 0) Component233.aShort3992 = (short) 320;
                return;
            }
            if (i == 6202) {
                intStackPointer -= 4;
                CacheNode.aShort9555 = (short) intStack[intStackPointer];
                if (CacheNode.aShort9555 <= 0) CacheNode.aShort9555 = (short) 1;
                Component377.aShort851 = (short) intStack[intStackPointer + 1];
                if (Component377.aShort851 <= 0) Component377.aShort851 = (short) 32767;
                else if (Component377.aShort851 < CacheNode.aShort9555) Component377.aShort851 = CacheNode.aShort9555;
                WaterShaderSub8.aShort7355 = (short) intStack[intStackPointer + 2];
                if (WaterShaderSub8.aShort7355 <= 0) WaterShaderSub8.aShort7355 = (short) 1;
                Component382.aShort2269 = (short) intStack[intStackPointer + 3];
                if (Component382.aShort2269 <= 0) Component382.aShort2269 = (short) 32767;
                else {
                    if (Component382.aShort2269 < WaterShaderSub8.aShort7355) Component382.aShort2269 = WaterShaderSub8.aShort7355;
                    return;
                }
                return;
            }
            if (i == 6203) {
                HashNodeSub3.method3174(0, 0, NodeSub1.aClass46_6561.width, false, (byte) 74, NodeSub1.aClass46_6561.height);
                intStack[intStackPointer++] = Component296.anInt4656;
                intStack[intStackPointer++] = Component333.anInt3643;
                return;
            }
            if (i == 6204) {
                intStack[intStackPointer++] = OggStreamReader.aShort9044;
                intStack[intStackPointer++] = Component233.aShort3992;
                return;
            }
            if (i == 6205) {
                intStack[intStackPointer++] = Component338.aShort1700;
                intStack[intStackPointer++] = Component39.aShort2250;
                return;
            }
        } else if (i < 6400) {
            if (i == 6300) {
                intStack[intStackPointer++] = (int) (Component240.currentTimeMillis(-76) / 60000L);
                return;
            }
            if (i == 6301) {
                intStack[intStackPointer++] = (int) (Component240.currentTimeMillis(-77) / 86400000L) - 11745;
                return;
            }
            if (i == 6302) {
                intStackPointer -= 3;
                int i_162_ = intStack[intStackPointer];
                int i_163_ = intStack[intStackPointer + 1];
                int i_164_ = intStack[intStackPointer + 2];
                aCalendar1160.clear();
                aCalendar1160.set(11, 12);
                aCalendar1160.set(i_164_, i_163_, i_162_);
                int i_165_ = ((int) (aCalendar1160.getTime().getTime() / 86400000L) - 11745);
                if (i_164_ < 1970) i_165_--;
                intStack[intStackPointer++] = i_165_;
                return;
            }
            if (i == 6303) {
                aCalendar1160.clear();
                aCalendar1160.setTime(new Date(Component240.currentTimeMillis(-59)));
                intStack[intStackPointer++] = aCalendar1160.get(1);
                return;
            }
            if (i == 6304) {
                int i_166_ = intStack[--intStackPointer];
                boolean bool_167_ = true;
                if (i_166_ < 0) bool_167_ = (i_166_ + 1) % 4 == 0;
                else if (i_166_ < 1582) bool_167_ = i_166_ % 4 == 0;
                else if (i_166_ % 4 != 0) bool_167_ = false;
                else if (i_166_ % 100 != 0) bool_167_ = true;
                else if (i_166_ % 400 != 0) bool_167_ = false;
                intStack[intStackPointer++] = bool_167_ ? 1 : 0;
                return;
            }
        } else if (i < 6500) {
            if (i == 6405) {
                intStack[intStackPointer++] = VideoAdPlayer.method717(-2511) ? 1 : 0;
                return;
            }
            if (i == 6406) {
                intStack[intStackPointer++] = VideoAdDisplay.method1891(314376967) ? 1 : 0;
                return;
            }
        } else if (i < 6600) {
            if (i == 6500) {
                if (Component49.clientState != 7 || Component241.anInt2955 != 0 || AbstractShaderSub2.anInt7297 != 0) intStack[intStackPointer++] = 1;
                else {
                    if (Component387.aBoolean1899) intStack[intStackPointer++] = 0;
                    else {
                        if (Component49.aLong4683 > Component240.currentTimeMillis(-126) - 1000L) intStack[intStackPointer++] = 1;
                        else {
                            Component387.aBoolean1899 = true;
                            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((DisplayModeManagerContainer64.aClass351_9034), (DisplayModeManagerContainer64.aClass77_9029), -115);
                            class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 101, Component364.anInt8349);
                            HashNodeSub14.enqueueOutboundPacket(118, class348_sub47);
                            intStack[intStackPointer++] = 0;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 6501) {
                Component362 class110_sub1 = Component203.method2487(-97);
                if (class110_sub1 == null) {
                    intStack[intStackPointer++] = -1;
                    intStack[intStackPointer++] = 0;
                    stringStack[stringStackPointer++] = "";
                    intStack[intStackPointer++] = 0;
                    stringStack[stringStackPointer++] = "";
                    intStack[intStackPointer++] = 0;
                    intStack[intStackPointer++] = 0;
                    stringStack[stringStackPointer++] = "";
                    return;
                } else {
                    intStack[intStackPointer++] = class110_sub1.anInt5786;
                    intStack[intStackPointer++] = class110_sub1.anInt1708;
                    stringStack[stringStackPointer++] = class110_sub1.aString5787;
                    Component69 class283 = class110_sub1.method1038(false);
                    intStack[intStackPointer++] = class283.anInt3657;
                    stringStack[stringStackPointer++] = class283.aString3663;
                    intStack[intStackPointer++] = class110_sub1.anInt1704;
                    intStack[intStackPointer++] = class110_sub1.anInt5788;
                    stringStack[stringStackPointer++] = class110_sub1.aString5794;
                }
                return;
            }
            if (i == 6502) {
                Component362 class110_sub1 = Component245.method170(true);
                if (class110_sub1 == null) {
                    intStack[intStackPointer++] = -1;
                    intStack[intStackPointer++] = 0;
                    stringStack[stringStackPointer++] = "";
                    intStack[intStackPointer++] = 0;
                    stringStack[stringStackPointer++] = "";
                    intStack[intStackPointer++] = 0;
                    intStack[intStackPointer++] = 0;
                    stringStack[stringStackPointer++] = "";
                    return;
                } else {
                    intStack[intStackPointer++] = class110_sub1.anInt5786;
                    intStack[intStackPointer++] = class110_sub1.anInt1708;
                    stringStack[stringStackPointer++] = class110_sub1.aString5787;
                    Component69 class283 = class110_sub1.method1038(false);
                    intStack[intStackPointer++] = class283.anInt3657;
                    stringStack[stringStackPointer++] = class283.aString3663;
                    intStack[intStackPointer++] = class110_sub1.anInt1704;
                    intStack[intStackPointer++] = class110_sub1.anInt5788;
                    stringStack[stringStackPointer++] = class110_sub1.aString5794;
                }
                return;
            }
            if (i == 6503) {
                int i_168_ = intStack[--intStackPointer];
                String string = stringStack[--stringStackPointer];
                if (Component49.clientState != 7 || Component241.anInt2955 != 0 || AbstractShaderSub2.anInt7297 != 0) intStack[intStackPointer++] = 0;
                else {
                    intStack[intStackPointer++] = (OggUrlStream.method2972(string, i_168_, -42) ? 1 : 0);
                    return;
                }
                return;
            }
            if (i == 6506) {
                int i_169_ = intStack[--intStackPointer];
                Component362 class110_sub1 = DisplayModeManagerContainer348.method1742(false, i_169_);
                if (class110_sub1 == null) {
                    intStack[intStackPointer++] = -1;
                    stringStack[stringStackPointer++] = "";
                    intStack[intStackPointer++] = 0;
                    stringStack[stringStackPointer++] = "";
                    intStack[intStackPointer++] = 0;
                    intStack[intStackPointer++] = 0;
                    stringStack[stringStackPointer++] = "";
                    return;
                } else {
                    intStack[intStackPointer++] = class110_sub1.anInt1708;
                    stringStack[stringStackPointer++] = class110_sub1.aString5787;
                    Component69 class283 = class110_sub1.method1038(false);
                    intStack[intStackPointer++] = class283.anInt3657;
                    stringStack[stringStackPointer++] = class283.aString3663;
                    intStack[intStackPointer++] = class110_sub1.anInt1704;
                    intStack[intStackPointer++] = class110_sub1.anInt5788;
                    stringStack[stringStackPointer++] = class110_sub1.aString5794;
                }
                return;
            }
            if (i == 6507) {
                intStackPointer -= 4;
                int i_170_ = intStack[intStackPointer];
                boolean bool_171_ = intStack[intStackPointer + 1] == 1;
                int i_172_ = intStack[intStackPointer + 2];
                boolean bool_173_ = intStack[intStackPointer + 3] == 1;
                Component114.selectWorldListEntry(bool_173_, 0, i_172_, i_170_, bool_171_);
                return;
            }
            if (i == 6508) {
                HashNodeSub20.method3283(-47);
                return;
            }
            if (i == 6509) {
                if (Component49.clientState == 7) {
                    DefinitionSub30.aBoolean9403 = intStack[--intStackPointer] == 1;
                    return;
                }
                return;
            }
            if (i == 6510) {
                intStack[intStackPointer++] = Component111.anInt3234;
                return;
            }
        } else if (i >= 6700) {
            if (i < 6800 && Component53.currentBuildType == Component118.WIP) {
                if (i == 6700) {
                    int i_174_ = Component15.aClass356_4915.size(1);
                    if (r.anInt9721 != -1) i_174_++;
                    intStack[intStackPointer++] = i_174_;
                    return;
                }
                if (i == 6701) {
                    int i_175_ = intStack[--intStackPointer];
                    if (r.anInt9721 != -1) {
                        if (i_175_ == 0) {
                            intStack[intStackPointer++] = r.anInt9721;
                            return;
                        }
                        i_175_--;
                    }
                    NodeSub41 class348_sub41 = ((NodeSub41) Component15.aClass356_4915.first(0));
                    while (i_175_-- > 0) class348_sub41 = ((NodeSub41) Component15.aClass356_4915.next(0));
                    intStack[intStackPointer++] = class348_sub41.anInt7050;
                    return;
                }
                if (i == 6702) {
                    int i_176_ = intStack[--intStackPointer];
                    if (DefinitionSub33.openInterfaces[i_176_] == null) stringStack[stringStackPointer++] = "";
                    else {
                        String string = (DefinitionSub33.openInterfaces[i_176_][0].debugName);
                        if (string == null) stringStack[stringStackPointer++] = "";
                        else {
                            stringStack[stringStackPointer++] = string.substring(0, string.indexOf(':'));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 6703) {
                    int i_177_ = intStack[--intStackPointer];
                    if (DefinitionSub33.openInterfaces[i_177_] == null) intStack[intStackPointer++] = 0;
                    else {
                        intStack[intStackPointer++] = (DefinitionSub33.openInterfaces[i_177_]).length;
                        return;
                    }
                    return;
                }
                if (i == 6704) {
                    intStackPointer -= 2;
                    int i_178_ = intStack[intStackPointer];
                    int i_179_ = intStack[intStackPointer + 1];
                    if (DefinitionSub33.openInterfaces[i_178_] == null) stringStack[stringStackPointer++] = "";
                    else {
                        String string = (DefinitionSub33.openInterfaces[i_178_][i_179_].debugName);
                        if (string == null) stringStack[stringStackPointer++] = "";
                        else {
                            stringStack[stringStackPointer++] = string;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 6705) {
                    intStackPointer -= 2;
                    int i_180_ = intStack[intStackPointer];
                    int i_181_ = intStack[intStackPointer + 1];
                    if (DefinitionSub33.openInterfaces[i_180_] == null) intStack[intStackPointer++] = 0;
                    else {
                        intStack[intStackPointer++] = DefinitionSub33.openInterfaces[i_180_][i_181_].anInt732;
                        return;
                    }
                    return;
                }
                if (i == 6706) return;
                if (i == 6707) {
                    intStackPointer -= 3;
                    int i_182_ = intStack[intStackPointer];
                    int i_183_ = intStack[intStackPointer + 1];
                    int i_184_ = intStack[intStackPointer + 2];
                    SceneNode.method2780(i_184_, "", (byte) 111, 1, i_182_ << 16 | i_183_);
                    return;
                }
                if (i == 6708) {
                    intStackPointer -= 3;
                    int i_185_ = intStack[intStackPointer];
                    int i_186_ = intStack[intStackPointer + 1];
                    int i_187_ = intStack[intStackPointer + 2];
                    SceneNode.method2780(i_187_, "", (byte) 127, 2, i_185_ << 16 | i_186_);
                    return;
                }
                if (i == 6709) {
                    intStackPointer -= 3;
                    int i_188_ = intStack[intStackPointer];
                    int i_189_ = intStack[intStackPointer + 1];
                    int i_190_ = intStack[intStackPointer + 2];
                    SceneNode.method2780(i_190_, "", (byte) 118, 3, i_188_ << 16 | i_189_);
                    return;
                }
                if (i == 6710) {
                    intStackPointer -= 3;
                    int i_191_ = intStack[intStackPointer];
                    int i_192_ = intStack[intStackPointer + 1];
                    int i_193_ = intStack[intStackPointer + 2];
                    SceneNode.method2780(i_193_, "", (byte) 8, 4, i_191_ << 16 | i_192_);
                    return;
                }
                if (i == 6711) {
                    intStackPointer -= 3;
                    int i_194_ = intStack[intStackPointer];
                    int i_195_ = intStack[intStackPointer + 1];
                    int i_196_ = intStack[intStackPointer + 2];
                    SceneNode.method2780(i_196_, "", (byte) 125, 5, i_194_ << 16 | i_195_);
                    return;
                }
                if (i == 6712) {
                    intStackPointer -= 3;
                    int i_197_ = intStack[intStackPointer];
                    int i_198_ = intStack[intStackPointer + 1];
                    int i_199_ = intStack[intStackPointer + 2];
                    SceneNode.method2780(i_199_, "", (byte) 108, 6, i_197_ << 16 | i_198_);
                    return;
                }
                if (i == 6713) {
                    intStackPointer -= 3;
                    int i_200_ = intStack[intStackPointer];
                    int i_201_ = intStack[intStackPointer + 1];
                    int i_202_ = intStack[intStackPointer + 2];
                    SceneNode.method2780(i_202_, "", (byte) -106, 7, i_200_ << 16 | i_201_);
                    return;
                }
                if (i == 6714) {
                    intStackPointer -= 3;
                    int i_203_ = intStack[intStackPointer];
                    int i_204_ = intStack[intStackPointer + 1];
                    int i_205_ = intStack[intStackPointer + 2];
                    SceneNode.method2780(i_205_, "", (byte) 117, 8, i_203_ << 16 | i_204_);
                    return;
                }
                if (i == 6715) {
                    intStackPointer -= 3;
                    int i_206_ = intStack[intStackPointer];
                    int i_207_ = intStack[intStackPointer + 1];
                    int i_208_ = intStack[intStackPointer + 2];
                    SceneNode.method2780(i_208_, "", (byte) -35, 9, i_206_ << 16 | i_207_);
                    return;
                }
                if (i == 6716) {
                    intStackPointer -= 3;
                    int i_209_ = intStack[intStackPointer];
                    int i_210_ = intStack[intStackPointer + 1];
                    int i_211_ = intStack[intStackPointer + 2];
                    SceneNode.method2780(i_211_, "", (byte) 107, 10, i_209_ << 16 | i_210_);
                    return;
                }
                if (i == 6717) {
                    intStackPointer -= 3;
                    int i_212_ = intStack[intStackPointer];
                    int i_213_ = intStack[intStackPointer + 1];
                    int i_214_ = intStack[intStackPointer + 2];
                    DisplayModeManagerContainer57 class46 = NpcNode.getChildComponent(i_214_, (byte) -54, i_212_ << 16 | i_213_);
                    DisplayModeManagerContainer196.method2678(-2049);
                    ComponentSettings class348_sub44 = client.getComponentSettings(class46);
                    NewsFetcher.method2666((class348_sub44.anInt7093), class348_sub44.getClickMask(100), class46, (byte) 21);
                    return;
                }
            } else if (i < 6900) {
                if (i == 6800) {
                    int i_215_ = intStack[--intStackPointer];
                    Component274 class42 = DisplayModeManagerContainer64.aClass153_9031.method1225(i_215_, (byte) 96);
                    if (class42.aString597 == null) stringStack[stringStackPointer++] = "";
                    else {
                        stringStack[stringStackPointer++] = class42.aString597;
                        return;
                    }
                    return;
                }
                if (i == 6801) {
                    int i_216_ = intStack[--intStackPointer];
                    Component274 class42 = DisplayModeManagerContainer64.aClass153_9031.method1225(i_216_, (byte) 111);
                    intStack[intStackPointer++] = class42.anInt578;
                    return;
                }
                if (i == 6802) {
                    int i_217_ = intStack[--intStackPointer];
                    Component274 class42 = DisplayModeManagerContainer64.aClass153_9031.method1225(i_217_, (byte) 91);
                    intStack[intStackPointer++] = class42.anInt576;
                    return;
                }
                if (i == 6803) {
                    int i_218_ = intStack[--intStackPointer];
                    Component274 class42 = DisplayModeManagerContainer64.aClass153_9031.method1225(i_218_, (byte) 44);
                    intStack[intStackPointer++] = class42.anInt596;
                    return;
                }
                if (i == 6804) {
                    intStackPointer -= 2;
                    int i_219_ = intStack[intStackPointer];
                    int i_220_ = intStack[intStackPointer + 1];
                    Component355 class254 = MatrixSub3.aClass326_5764.method2600(i_220_, 28364);
                    if (class254.method1925(false)) stringStack[stringStackPointer++] = (DisplayModeManagerContainer64.aClass153_9031.method1225(i_219_, (byte) 79).method376(class254.aString3258, i_220_, (byte) 126));
                    else {
                        intStack[intStackPointer++] = (DisplayModeManagerContainer64.aClass153_9031.method1225(i_219_, (byte) 50).method378(class254.anInt3256, i_220_, false));
                        return;
                    }
                    return;
                }
            } else if (i < 7000) {
                if (i == 6900) {
                    intStack[intStackPointer++] = (ParametricDefinition.aBoolean9103 && !HeapDumper.aBoolean1915) ? 1 : 0;
                    return;
                }
                if (i == 6901) {
                    intStack[intStackPointer++] = Component262.anInt1758;
                    return;
                }
                if (i == 6902) {
                    intStack[intStackPointer++] = DisplayModeManagerContainer136.anInt4716;
                    return;
                }
                if (i == 6903) {
                    intStack[intStackPointer++] = ImageCacheStore.anInt4026;
                    return;
                }
                if (i == 6904) {
                    intStack[intStackPointer++] = DisplayModeManagerContainer105.anInt4870;
                    return;
                }
                if (i == 6905) {
                    String string = "";
                    if (PauseHandler.aClass144_9536 != null) {
                        if (PauseHandler.aClass144_9536.result != null) string = (String) (PauseHandler.aClass144_9536.result);
                        else string = Component366.method1669(-19918, (PauseHandler.aClass144_9536.intArg1));
                    }
                    stringStack[stringStackPointer++] = string;
                    return;
                }
                if (i == 6906) {
                    intStack[intStackPointer++] = Component43.anInt4976;
                    return;
                }
                if (i == 6907) {
                    intStack[intStackPointer++] = DisplayModeManagerContainer273.anInt5797;
                    return;
                }
                if (i == 6908) {
                    intStack[intStackPointer++] = NodederUtil.anInt6632;
                    return;
                }
                if (i == 6909) {
                    intStack[intStackPointer++] = Component200.aBoolean3706 ? 1 : 0;
                    return;
                }
                if (i == 6910) {
                    intStack[intStackPointer++] = DisplayModeManagerContainer310.anInt359;
                    return;
                }
                if (i == 6911) {
                    intStack[intStackPointer++] = Applet_Sub1.anInt37;
                    return;
                }
                if (i == 6912) {
                    intStack[intStackPointer++] = NodeSub1.anInt6551;
                    return;
                }
            } else if (i < 7100) {
                if (i == 7000) {
                    int i_221_ = Component269.method2478(1000);
                    intStack[intStackPointer++] = DisplayModeManagerContainer282.anInt5584 = Component192.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350);
                    intStack[intStackPointer++] = i_221_;
                    NodeSub20.method2953((byte) -113);
                    DisplayModeManagerContainer389.method243(37);
                    r.aBoolean9719 = false;
                    return;
                }
                if (i == 7001) {
                    HeapDumper.resetGraphicsPreferences(47);
                    NodeSub20.method2953((byte) -126);
                    DisplayModeManagerContainer389.method243(37);
                    r.aBoolean9719 = false;
                    return;
                }
                if (i == 7002) {
                    DisplayModeManagerContainer32.method447((byte) -59);
                    NodeSub20.method2953((byte) -124);
                    DisplayModeManagerContainer389.method243(37);
                    r.aBoolean9719 = false;
                    return;
                }
                if (i == 7003) {
                    DisplayModeManagerContainer254.method1263(true);
                    NodeSub20.method2953((byte) -106);
                    DisplayModeManagerContainer389.method243(37);
                    r.aBoolean9719 = false;
                    return;
                }
                if (i == 7004) {
                    GradientPreset.method3076(0, true);
                    NodeSub20.method2953((byte) -107);
                    DisplayModeManagerContainer389.method243(37);
                    r.aBoolean9719 = false;
                    return;
                }
                if (i == 7005) {
                    Component192.aClass348_Sub51_3959.applyPreference((byte) 74, (Component192.aClass348_Sub51_3959.aClass239_Sub29_7229), 0);
                    DisplayModeManagerContainer389.method243(37);
                    r.aBoolean9719 = false;
                    return;
                }
                if (i == 7006) {
                    if (DisplayModeManagerContainer282.anInt5584 == 2) Component85.aBoolean2881 = true;
                    else {
                        if (DisplayModeManagerContainer282.anInt5584 == 1) Component301.aBoolean4117 = true;
                        else {
                            if (DisplayModeManagerContainer282.anInt5584 == 3) NodeSub1.aBoolean6558 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 7007) {
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub29_7229.method1848(-32350);
                    return;
                }
            } else if (i < 7200) {
                if (i == 7100) {
                    intStackPointer -= 2;
                    int i_222_ = intStack[intStackPointer];
                    int i_223_ = intStack[intStackPointer + 1];
                    if (i_222_ != -1) {
                        if (i_223_ > 255) i_223_ = 255;
                        else if (i_223_ < 0) i_223_ = 0;
                        Component326.method524(i_223_, false, i_222_, -122);
                    }
                    return;
                }
                if (i == 7101) {
                    int i_224_ = intStack[--intStackPointer];
                    if (i_224_ != -1) DisplayModeManagerContainer282.getColorTag((byte) 17, i_224_);
                    return;
                }
                if (i == 7102) {
                    int i_225_ = intStack[--intStackPointer];
                    if (i_225_ != -1) Component184.method1189(-1, i_225_);
                    return;
                }
                if (i == 7103) {
                    intStack[intStackPointer++] = DefinitionSub31.method3131((byte) 50, "jagtheora") ? 1 : 0;
                    return;
                }
            } else if (i < 7300) {
                if (i == 7201) {
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub4_7220.method1736(123) ? 1 : 0;
                    return;
                }
                if (i == 7202) {
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub21_7270.method1809(117) ? 1 : 0;
                    return;
                }
                if (i == 7203) {
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub7_7238.method1747(111) ? 1 : 0;
                    return;
                }
                if (i == 7204) {
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub18_7259.method1801(125) ? 1 : 0;
                    return;
                }
                if (i == 7205) {
                    intStack[intStackPointer++] = (Component192.aClass348_Sub51_3959.aClass239_Sub20_7216.method1806(108) && NodeSub8.toolkit.method3699()) ? 1 : 0;
                    return;
                }
                if (i == 7206) {
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub15_7224.method1786(93) ? 1 : 0;
                    return;
                }
                if (i == 7207) {
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub6_7226.method1744(103) ? 1 : 0;
                    return;
                }
                if (i == 7208) {
                    intStack[intStackPointer++] = (Component192.aClass348_Sub51_3959.aClass239_Sub12_7243.method1774(120) && NodeSub8.toolkit.method3627()) ? 1 : 0;
                    return;
                }
                if (i == 7209) {
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub9_7256.method1757(115) ? 1 : 0;
                    return;
                }
                if (i == 7210) {
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub24_7235.method1824(124) ? 1 : 0;
                    return;
                }
                if (i == 7211) {
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub23_7231.method1817(108) ? 1 : 0;
                    return;
                }
                if (i == 7212) {
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub16_7247.method1790(94) ? 1 : 0;
                    return;
                }
                if (i == 7213) {
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub3_7222.method1729(91) ? 1 : 0;
                    return;
                }
                if (i == 7214) {
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub25_7251.method1831(95) ? 1 : 0;
                    return;
                }
            } else if (i < 7400) {
                if (i == 7301) {
                    int i_226_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub4_7220.method1714(3, i_226_);
                    return;
                }
                if (i == 7302) {
                    int i_227_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub21_7270.method1714(3, i_227_);
                    return;
                }
                if (i == 7303) {
                    int i_228_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub7_7238.method1714(3, i_228_);
                    return;
                }
                if (i == 7304) {
                    int i_229_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub18_7259.method1714(3, i_229_);
                    return;
                }
                if (i == 7305) {
                    int i_230_ = intStack[--intStackPointer];
                    if (NodeSub8.toolkit.method3699()) {
                        intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub20_7216.method1714(3, i_230_);
                        return;
                    } else intStack[intStackPointer++] = 3;
                    return;
                }
                if (i == 7306) {
                    int i_231_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub15_7224.method1714(3, i_231_);
                    return;
                }
                if (i == 7307) {
                    int i_232_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub6_7226.method1714(3, i_232_);
                    return;
                }
                if (i == 7308) {
                    int i_233_ = intStack[--intStackPointer];
                    if (NodeSub8.toolkit.method3627()) {
                        intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub12_7243.method1714(3, i_233_);
                        return;
                    } else intStack[intStackPointer++] = 3;
                    return;
                }
                if (i == 7309) {
                    int i_234_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub9_7256.method1714(3, i_234_);
                    return;
                }
                if (i == 7310) {
                    int i_235_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub24_7235.method1714(3, i_235_);
                    return;
                }
                if (i == 7311) {
                    int i_236_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub23_7231.method1714(3, i_236_);
                    return;
                }
                if (i == 7312) {
                    int i_237_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub16_7247.method1714(3, i_237_);
                    return;
                }
                if (i == 7313) {
                    int i_238_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub3_7222.method1714(3, i_238_);
                    return;
                }
                if (i == 7314) {
                    int i_239_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Component192.aClass348_Sub51_3959.aClass239_Sub25_7251.method1714(3, i_239_);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(i));
    }

    static final void runHook(NodeSub36 class348_sub36) {
        executeHook(class348_sub36, 200000);
    }

    static final void onReset() {
        /* empty */
    }

    private static final void parseCommand(String string, int i) {
        if (Component353.anInt2581 != 0 || ((!ParametricDefinition.aBoolean9103 || HeapDumper.aBoolean1915) && !Component308.aBoolean5233)) {
            String string_240_ = string.toLowerCase();
            int i_241_ = 0;
            if (string_240_.startsWith(FriendsIgnoreList.aClass274_3530.getLocalized(0, 544))) {
                i_241_ = 0;
                string = string.substring(FriendsIgnoreList.aClass274_3530.getLocalized(0, 544).length());
            } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3531.getLocalized(0, 544))) {
                i_241_ = 1;
                string = string.substring(FriendsIgnoreList.aClass274_3531.getLocalized(0, 544).length());
            } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3532.getLocalized(0, 544))) {
                i_241_ = 2;
                string = string.substring(FriendsIgnoreList.aClass274_3532.getLocalized(0, 544).length());
            } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3533.getLocalized(0, 544))) {
                i_241_ = 3;
                string = string.substring(FriendsIgnoreList.aClass274_3533.getLocalized(0, 544).length());
            } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3534.getLocalized(0, 544))) {
                i_241_ = 4;
                string = string.substring(FriendsIgnoreList.aClass274_3534.getLocalized(0, 544).length());
            } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3535.getLocalized(0, 544))) {
                i_241_ = 5;
                string = string.substring(FriendsIgnoreList.aClass274_3535.getLocalized(0, 544).length());
            } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3536.getLocalized(0, 544))) {
                i_241_ = 6;
                string = string.substring(FriendsIgnoreList.aClass274_3536.getLocalized(0, 544).length());
            } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3537.getLocalized(0, 544))) {
                i_241_ = 7;
                string = string.substring(FriendsIgnoreList.aClass274_3537.getLocalized(0, 544).length());
            } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3538.getLocalized(0, 544))) {
                i_241_ = 8;
                string = string.substring(FriendsIgnoreList.aClass274_3538.getLocalized(0, 544).length());
            } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3539.getLocalized(0, 544))) {
                i_241_ = 9;
                string = string.substring(FriendsIgnoreList.aClass274_3539.getLocalized(0, 544).length());
            } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3540.getLocalized(0, 544))) {
                i_241_ = 10;
                string = string.substring(FriendsIgnoreList.aClass274_3540.getLocalized(0, 544).length());
            } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3541.getLocalized(0, 544))) {
                i_241_ = 11;
                string = string.substring(FriendsIgnoreList.aClass274_3541.getLocalized(0, 544).length());
            } else if (ObjectDeserializer.languageId != 0) {
                if (string_240_.startsWith(FriendsIgnoreList.aClass274_3530.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_241_ = 0;
                    string = string.substring(FriendsIgnoreList.aClass274_3530.getLocalized(ObjectDeserializer.languageId, 544).length());
                } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3531.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_241_ = 1;
                    string = string.substring(FriendsIgnoreList.aClass274_3531.getLocalized(ObjectDeserializer.languageId, 544).length());
                } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3532.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_241_ = 2;
                    string = string.substring(FriendsIgnoreList.aClass274_3532.getLocalized(ObjectDeserializer.languageId, 544).length());
                } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3533.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_241_ = 3;
                    string = string.substring(FriendsIgnoreList.aClass274_3533.getLocalized(ObjectDeserializer.languageId, 544).length());
                } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3534.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_241_ = 4;
                    string = string.substring(FriendsIgnoreList.aClass274_3534.getLocalized(ObjectDeserializer.languageId, 544).length());
                } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3535.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_241_ = 5;
                    string = string.substring(FriendsIgnoreList.aClass274_3535.getLocalized(ObjectDeserializer.languageId, 544).length());
                } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3536.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_241_ = 6;
                    string = string.substring(FriendsIgnoreList.aClass274_3536.getLocalized(ObjectDeserializer.languageId, 544).length());
                } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3537.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_241_ = 7;
                    string = string.substring(FriendsIgnoreList.aClass274_3537.getLocalized(ObjectDeserializer.languageId, 544).length());
                } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3538.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_241_ = 8;
                    string = string.substring(FriendsIgnoreList.aClass274_3538.getLocalized(ObjectDeserializer.languageId, 544).length());
                } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3539.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_241_ = 9;
                    string = string.substring(FriendsIgnoreList.aClass274_3539.getLocalized(ObjectDeserializer.languageId, 544).length());
                } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3540.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_241_ = 10;
                    string = string.substring(FriendsIgnoreList.aClass274_3540.getLocalized(ObjectDeserializer.languageId, 544).length());
                } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3541.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_241_ = 11;
                    string = string.substring(FriendsIgnoreList.aClass274_3541.getLocalized(ObjectDeserializer.languageId, 544).length());
                }
            }
            string_240_ = string.toLowerCase();
            int i_242_ = 0;
            if (string_240_.startsWith(FriendsIgnoreList.aClass274_3542.getLocalized(0, 544))) {
                i_242_ = 1;
                string = string.substring(FriendsIgnoreList.aClass274_3542.getLocalized(0, 544).length());
            } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3543.getLocalized(0, 544))) {
                i_242_ = 2;
                string = string.substring(FriendsIgnoreList.aClass274_3543.getLocalized(0, 544).length());
            } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3544.getLocalized(0, 544))) {
                i_242_ = 3;
                string = string.substring(FriendsIgnoreList.aClass274_3544.getLocalized(0, 544).length());
            } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3545.getLocalized(0, 544))) {
                i_242_ = 4;
                string = string.substring(FriendsIgnoreList.aClass274_3545.getLocalized(0, 544).length());
            } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3546.getLocalized(0, 544))) {
                i_242_ = 5;
                string = string.substring(FriendsIgnoreList.aClass274_3546.getLocalized(0, 544).length());
            } else if (ObjectDeserializer.languageId != 0) {
                if (string_240_.startsWith(FriendsIgnoreList.aClass274_3542.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_242_ = 1;
                    string = string.substring(FriendsIgnoreList.aClass274_3542.getLocalized(ObjectDeserializer.languageId, 544).length());
                } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3543.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_242_ = 2;
                    string = string.substring(FriendsIgnoreList.aClass274_3543.getLocalized(ObjectDeserializer.languageId, 544).length());
                } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3544.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_242_ = 3;
                    string = string.substring(FriendsIgnoreList.aClass274_3544.getLocalized(ObjectDeserializer.languageId, 544).length());
                } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3545.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_242_ = 4;
                    string = string.substring(FriendsIgnoreList.aClass274_3545.getLocalized(ObjectDeserializer.languageId, 544).length());
                } else if (string_240_.startsWith(FriendsIgnoreList.aClass274_3546.getLocalized(ObjectDeserializer.languageId, 544))) {
                    i_242_ = 5;
                    string = string.substring(FriendsIgnoreList.aClass274_3546.getLocalized(ObjectDeserializer.languageId, 544).length());
                }
            }
            anInt1158++;
            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(Component275.aClass351_2686, DisplayModeManagerContainer64.aClass77_9029, -88);
            class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
            int i_243_ = (class348_sub47.aClass348_Sub49_Sub2_7116.offset);
            class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, i_241_);
            class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, i_242_);
            AbstractShaderSub4.writeHuffmanString((class348_sub47.aClass348_Sub49_Sub2_7116), -101, string);
            class348_sub47.aClass348_Sub49_Sub2_7116.writeLengthByte(119, (class348_sub47.aClass348_Sub49_Sub2_7116.offset) - i_243_);
            HashNodeSub14.enqueueOutboundPacket(124, class348_sub47);
        }
    }

    private static final int isValidChar(char c) {
        if (Component251.method1693(c, -114)) return 1;
        return 0;
    }

    private static final String formatDate(int i) {
        long l = ((long) i + 11745L) * 86400000L;
        aCalendar1160.setTime(new Date(l));
        int i_244_ = aCalendar1160.get(5);
        int i_245_ = aCalendar1160.get(2);
        int i_246_ = aCalendar1160.get(1);
        return (i_244_ + "-" + aStringArray1176[i_245_] + "-" + i_246_);
    }

    private static final void executeInterfaceCommand(int i, boolean bool) {
        if (i < 300) {
            if (i == 100) {
                intStackPointer -= 3;
                int i_247_ = intStack[intStackPointer];
                int i_248_ = intStack[intStackPointer + 1];
                int i_249_ = intStack[intStackPointer + 2];
                if (i_248_ == 0) throw new RuntimeException();
                DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, i_247_);
                if (class46.children == null) class46.children = new DisplayModeManagerContainer57[i_249_ + 1];
                if (class46.children.length <= i_249_) {
                    DisplayModeManagerContainer57[] class46s = new DisplayModeManagerContainer57[i_249_ + 1];
                    for (int i_250_ = 0; i_250_ < class46.children.length; i_250_++)
                        class46s[i_250_] = class46.children[i_250_];
                    class46.children = class46s;
                }
                if (i_249_ > 0 && (class46.children[i_249_ - 1] == null)) throw new RuntimeException("Gap at:" + (i_249_ - 1));
                DisplayModeManagerContainer57 class46_251_ = new DisplayModeManagerContainer57();
                class46_251_.type = i_248_;
                class46_251_.parentId = class46_251_.packedId = class46.packedId;
                class46_251_.childIndex = i_249_;
                class46.children[i_249_] = class46_251_;
                if (bool) aClass46_1169 = class46_251_;
                else aClass46_1150 = class46_251_;
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 101) {
                DisplayModeManagerContainer57 class46 = bool ? aClass46_1169 : aClass46_1150;
                if (class46.childIndex == -1) {
                    if (bool) throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                DisplayModeManagerContainer57 class46_252_ = BitmapFont.getComponent(1512932720, class46.packedId);
                class46_252_.children[(class46.childIndex)] = null;
                Component111.markInterfaceDirty(-9343, class46_252_);
                return;
            }
            if (i == 102) {
                DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, intStack[--intStackPointer]);
                class46.children = null;
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 200) {
                intStackPointer -= 2;
                int i_253_ = intStack[intStackPointer];
                int i_254_ = intStack[intStackPointer + 1];
                DisplayModeManagerContainer57 class46 = NpcNode.getChildComponent(i_254_, (byte) -54, i_253_);
                if (class46 == null || i_254_ == -1) {
                    intStack[intStackPointer++] = 0;
                    return;
                } else {
                    intStack[intStackPointer++] = 1;
                    if (bool) aClass46_1169 = class46;
                    else aClass46_1150 = class46;
                }
                return;
            }
            if (i == 201) {
                int i_255_ = intStack[--intStackPointer];
                DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, i_255_);
                if (class46 == null) {
                    intStack[intStackPointer++] = 0;
                    return;
                } else {
                    intStack[intStackPointer++] = 1;
                    if (bool) aClass46_1169 = class46;
                    else aClass46_1150 = class46;
                }
                return;
            }
            if (i == 202) {
                int i_256_ = intStack[--intStackPointer];
                sendInterfaceToBack(i_256_);
                return;
            }
            if (i == 203) {
                int i_257_ = intStack[--intStackPointer];
                bringInterfaceToFront(i_257_);
                return;
            }
        } else if (i < 500) {
            if (i == 403) {
                intStackPointer -= 2;
                int i_258_ = intStack[intStackPointer];
                int i_259_ = intStack[intStackPointer + 1];
                if ((Component72.localPlayer.appearance) != null) {
                    for (int i_260_ = 0; i_260_ < Component258.anIntArray1973.length; i_260_++) {
                        if (Component258.anIntArray1973[i_260_] == i_258_) {
                            Component72.localPlayer.appearance.method1233(DefinitionSub25.aClass150_9342, i_259_, -1, i_260_);
                            return;
                        }
                    }
                    for (int i_261_ = 0; i_261_ < GnpPositionLogger.anIntArray1521.length; i_261_++) {
                        if (GnpPositionLogger.anIntArray1521[i_261_] == i_258_) {
                            Component72.localPlayer.appearance.method1233(DefinitionSub25.aClass150_9342, i_259_, -1, i_261_);
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            if (i == 404) {
                intStackPointer -= 2;
                int i_262_ = intStack[intStackPointer];
                int i_263_ = intStack[intStackPointer + 1];
                if ((Component72.localPlayer.appearance) != null) {
                    Component72.localPlayer.appearance.method1231(i_262_, 0, i_263_);
                    return;
                }
                return;
            }
            if (i == 410) {
                boolean bool_264_ = intStack[--intStackPointer] != 0;
                if ((Component72.localPlayer.appearance) != null) {
                    Component72.localPlayer.appearance.method1229((byte) -17, bool_264_);
                    return;
                }
                return;
            }
            if (i == 411) {
                intStackPointer -= 2;
                int i_265_ = intStack[intStackPointer];
                int i_266_ = intStack[intStackPointer + 1];
                if ((Component72.localPlayer.appearance) != null) {
                    Component72.localPlayer.appearance.method1227((byte) 42, i_265_, i_266_, Exception_Sub1.itemDefinitions);
                    return;
                }
                return;
            }
        } else if (i >= 1000 && i < 1100 || i >= 2000 && i < 2100) {
            DisplayModeManagerContainer57 class46;
            if (i >= 2000) {
                i -= 1000;
                class46 = BitmapFont.getComponent(1512932720, intStack[--intStackPointer]);
            } else class46 = bool ? aClass46_1169 : aClass46_1150;
            if (i == 1000) {
                intStackPointer -= 4;
                class46.relativeX = intStack[intStackPointer];
                class46.relativeY = intStack[intStackPointer + 1];
                int i_267_ = intStack[intStackPointer + 2];
                if (i_267_ < 0) i_267_ = 0;
                else if (i_267_ > 5) i_267_ = 5;
                int i_268_ = intStack[intStackPointer + 3];
                if (i_268_ < 0) i_268_ = 0;
                else if (i_268_ > 5) i_268_ = 5;
                class46.xMode = (byte) i_267_;
                class46.yMode = (byte) i_268_;
                Component111.markInterfaceDirty(-9343, class46);
                Component331.method1048(class46, 50);
                if (class46.childIndex == -1) Component272.method1733((byte) -78, class46.packedId);
                return;
            }
            if (i == 1001) {
                intStackPointer -= 4;
                class46.baseWidth = intStack[intStackPointer];
                class46.baseHeight = intStack[intStackPointer + 1];
                class46.anInt796 = 0;
                class46.anInt826 = 0;
                int i_269_ = intStack[intStackPointer + 2];
                if (i_269_ < 0) i_269_ = 0;
                else if (i_269_ > 4) i_269_ = 4;
                int i_270_ = intStack[intStackPointer + 3];
                if (i_270_ < 0) i_270_ = 0;
                else if (i_270_ > 4) i_270_ = 4;
                class46.widthMode = (byte) i_269_;
                class46.heightMode = (byte) i_270_;
                Component111.markInterfaceDirty(-9343, class46);
                Component331.method1048(class46, 62);
                if (class46.type == 0) Component111.layoutInterfaceTree(false, 36, class46);
                return;
            }
            if (i == 1003) {
                boolean bool_271_ = intStack[--intStackPointer] == 1;
                if (class46.hidden != bool_271_) {
                    class46.hidden = bool_271_;
                    Component111.markInterfaceDirty(-9343, class46);
                }
                if (class46.childIndex == -1) Request.method2999((byte) 90, class46.packedId);
                return;
            }
            if (i == 1004) {
                intStackPointer -= 2;
                class46.anInt710 = intStack[intStackPointer];
                class46.anInt775 = intStack[intStackPointer + 1];
                Component111.markInterfaceDirty(-9343, class46);
                Component331.method1048(class46, 59);
                if (class46.type == 0) Component111.layoutInterfaceTree(false, 49, class46);
                return;
            }
            if (i == 1005) {
                class46.aBoolean776 = intStack[--intStackPointer] == 1;
                return;
            }
        } else if (i >= 1100 && i < 1200 || i >= 2100 && i < 2200) {
            DisplayModeManagerContainer57 class46;
            if (i >= 2000) {
                i -= 1000;
                class46 = BitmapFont.getComponent(1512932720, intStack[--intStackPointer]);
            } else class46 = bool ? aClass46_1169 : aClass46_1150;
            if (i == 1100) {
                intStackPointer -= 2;
                class46.scrollX = intStack[intStackPointer];
                if (class46.scrollX > (class46.scrollWidth - class46.width)) class46.scrollX = (class46.scrollWidth - class46.width);
                if (class46.scrollX < 0) class46.scrollX = 0;
                class46.scrollY = intStack[intStackPointer + 1];
                if (class46.scrollY > (class46.scrollHeight - class46.height)) class46.scrollY = (class46.scrollHeight - class46.height);
                if (class46.scrollY < 0) class46.scrollY = 0;
                Component111.markInterfaceDirty(-9343, class46);
                if (class46.childIndex == -1) ShaderCompilerSub3.method2615(-91, class46.packedId);
                return;
            }
            if (i == 1101) {
                class46.colour = intStack[--intStackPointer];
                Component111.markInterfaceDirty(-9343, class46);
                if (class46.childIndex == -1) Component137.method1148(class46.packedId, 6);
                return;
            }
            if (i == 1102) {
                class46.filled = intStack[--intStackPointer] == 1;
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1103) {
                class46.opacity = intStack[--intStackPointer];
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1104) {
                class46.lineWidth = intStack[--intStackPointer];
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1105) {
                int i_272_ = intStack[--intStackPointer];
                if (class46.spriteId != i_272_) {
                    class46.spriteId = i_272_;
                    Component111.markInterfaceDirty(-9343, class46);
                }
                if (class46.childIndex == -1) DisplayModeManagerContainer351.method1477(class46.packedId, 14);
                return;
            }
            if (i == 1106) {
                class46.spriteAngle = intStack[--intStackPointer];
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1107) {
                class46.spriteTiling = intStack[--intStackPointer] == 1;
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1108) {
                class46.anInt770 = 1;
                class46.anInt753 = intStack[--intStackPointer];
                Component111.markInterfaceDirty(-9343, class46);
                if (class46.childIndex == -1) Component27.method3569(class46.packedId, -125);
                return;
            }
            if (i == 1109) {
                intStackPointer -= 6;
                class46.anInt808 = intStack[intStackPointer];
                class46.anInt786 = intStack[intStackPointer + 1];
                class46.anInt757 = intStack[intStackPointer + 2];
                class46.anInt675 = intStack[intStackPointer + 3];
                class46.anInt717 = intStack[intStackPointer + 4];
                class46.anInt716 = intStack[intStackPointer + 5];
                Component111.markInterfaceDirty(-9343, class46);
                if (class46.childIndex == -1) {
                    DisplayModeManagerContainer341.method1787(class46.packedId, 8);
                    HelveticaFont.method1459(class46.packedId, 2);
                }
                return;
            }
            if (i == 1110) {
                int i_273_ = intStack[--intStackPointer];
                if (class46.anInt699 != i_273_) {
                    class46.anInt699 = i_273_;
                    class46.anInt795 = 0;
                    class46.anInt730 = 1;
                    class46.anInt841 = 0;
                    DisplayModeManagerContainer167 class17 = (class46.anInt699 == -1 ? null : RunescapeInfo.aClass87_191.getSequence(class46.anInt699, 7));
                    if (class17 != null) Component235.method2017(class46.anInt795, class17, 46);
                    Component111.markInterfaceDirty(-9343, class46);
                }
                if (class46.childIndex == -1) DisplayModeManagerContainer282.sendRsaRequest((byte) -117, class46.packedId);
                return;
            }
            if (i == 1111) {
                class46.aBoolean689 = intStack[--intStackPointer] == 1;
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1112) {
                String string = stringStack[--stringStackPointer];
                if (!string.equals(class46.textContent)) {
                    class46.textContent = string;
                    Component111.markInterfaceDirty(-9343, class46);
                }
                if (class46.childIndex == -1) NodeSub45Sub2.method3316(121, class46.packedId);
                return;
            }
            if (i == 1113) {
                class46.fontId = intStack[--intStackPointer];
                Component111.markInterfaceDirty(-9343, class46);
                if (class46.childIndex == -1) DisplayModeManagerContainer74.method2311((byte) -109, class46.packedId);
                return;
            }
            if (i == 1114) {
                intStackPointer -= 3;
                class46.xTextAlign = intStack[intStackPointer];
                class46.yTextAlign = intStack[intStackPointer + 1];
                class46.lineHeight = intStack[intStackPointer + 2];
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1115) {
                class46.textShadowed = intStack[--intStackPointer] == 1;
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1116) {
                class46.outline = intStack[--intStackPointer];
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1117) {
                class46.shadowColour = intStack[--intStackPointer];
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1118) {
                class46.aBoolean790 = intStack[--intStackPointer] == 1;
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1119) {
                class46.aBoolean735 = intStack[--intStackPointer] == 1;
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1120) {
                intStackPointer -= 2;
                class46.scrollWidth = intStack[intStackPointer];
                class46.scrollHeight = intStack[intStackPointer + 1];
                Component111.markInterfaceDirty(-9343, class46);
                if (class46.type == 0) Component111.layoutInterfaceTree(false, 62, class46);
                return;
            }
            if (i == 1122) {
                class46.aBoolean745 = intStack[--intStackPointer] == 1;
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1123) {
                class46.anInt716 = intStack[--intStackPointer];
                Component111.markInterfaceDirty(-9343, class46);
                if (class46.childIndex == -1) DisplayModeManagerContainer341.method1787(class46.packedId, 8);
                return;
            }
            if (i == 1124) {
                int i_274_ = intStack[--intStackPointer];
                class46.aBoolean744 = i_274_ == 1;
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1125) {
                intStackPointer -= 2;
                class46.anInt688 = intStack[intStackPointer];
                class46.anInt799 = intStack[intStackPointer + 1];
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1126) {
                class46.anInt773 = intStack[--intStackPointer];
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1127) {
                intStackPointer -= 2;
                int i_275_ = intStack[intStackPointer];
                int i_276_ = intStack[intStackPointer + 1];
                Component355 class254 = MatrixSub3.aClass326_5764.method2600(i_275_, 28364);
                if (i_276_ == class254.anInt3256) {
                    class46.method435(i_275_, -3437);
                    return;
                } else class46.method436(-70, i_275_, i_276_);
                return;
            }
            if (i == 1128) {
                int i_277_ = intStack[--intStackPointer];
                String string = stringStack[--stringStackPointer];
                Component355 class254 = MatrixSub3.aClass326_5764.method2600(i_277_, 28364);
                if (class254.aString3258.equals(string)) {
                    class46.method435(i_277_, -3437);
                    return;
                } else class46.method439(0, i_277_, string);
                return;
            }
            if (i == 1129 || i == 1130) {
                int i_278_ = intStack[--intStackPointer];
                if ((class46.type == 5 || i != 1129) && (class46.type == 4 || i != 1130)) {
                    if (class46.anInt806 != i_278_) {
                        class46.anInt806 = i_278_;
                        Component111.markInterfaceDirty(-9343, class46);
                    }
                    if (class46.childIndex == -1) ReliefShader.method1415(class46.packedId, 117);
                    return;
                }
                return;
            }
        } else if (i >= 1200 && i < 1300 || i >= 2200 && i < 2300) {
            DisplayModeManagerContainer57 class46;
            if (i >= 2000) {
                i -= 1000;
                class46 = BitmapFont.getComponent(1512932720, intStack[--intStackPointer]);
            } else class46 = bool ? aClass46_1169 : aClass46_1150;
            Component111.markInterfaceDirty(-9343, class46);
            if (i == 1200 || i == 1205 || i == 1208 || i == 1209 || i == 1212 || i == 1213) {
                intStackPointer -= 2;
                int i_279_ = intStack[intStackPointer];
                int i_280_ = intStack[intStackPointer + 1];
                if (class46.childIndex == -1) {
                    DisplayModeManagerContainer306.method743(9, class46.packedId);
                    DisplayModeManagerContainer341.method1787(class46.packedId, 8);
                    HelveticaFont.method1459(class46.packedId, 2);
                }
                if (i_279_ == -1) {
                    class46.anInt770 = 1;
                    class46.anInt753 = -1;
                    class46.itemId = -1;
                } else {
                    class46.itemId = i_279_;
                    class46.itemAmount = i_280_;
                    class46.aBoolean720 = i == 1208 || i == 1209;
                    ItemDefinition class213 = Exception_Sub1.itemDefinitions.getItemDefinition(74, i_279_);
                    class46.anInt757 = class213.anInt2787;
                    class46.anInt675 = class213.anInt2781;
                    class46.anInt717 = class213.anInt2810;
                    class46.anInt808 = class213.anInt2779;
                    class46.anInt786 = class213.anInt2826;
                    class46.anInt716 = class213.anInt2825;
                    if (i == 1205 || i == 1209) class46.anInt678 = 0;
                    else if (i == 1212 || i == 1213) class46.anInt678 = 1;
                    else class46.anInt678 = 2;
                    if (class46.anInt796 > 0) class46.anInt716 = (class46.anInt716 * 32 / class46.anInt796);
                    else {
                        if (class46.baseWidth > 0) class46.anInt716 = (class46.anInt716 * 32 / class46.baseWidth);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 1201) {
                class46.anInt770 = 2;
                class46.anInt753 = intStack[--intStackPointer];
                if (class46.childIndex == -1) Component27.method3569(class46.packedId, -124);
                return;
            }
            if (i == 1202) {
                class46.anInt770 = 3;
                class46.anInt753 = -1;
                if (class46.childIndex == -1) Component27.method3569(class46.packedId, 94);
                return;
            }
            if (i == 1203) {
                class46.anInt770 = 6;
                class46.anInt753 = intStack[--intStackPointer];
                if (class46.childIndex == -1) Component27.method3569(class46.packedId, -26);
                return;
            }
            if (i == 1204) {
                class46.anInt770 = 5;
                class46.anInt753 = intStack[--intStackPointer];
                if (class46.childIndex == -1) Component27.method3569(class46.packedId, -127);
                return;
            }
            if (i == 1206) {
                intStackPointer -= 4;
                class46.anInt705 = intStack[intStackPointer];
                class46.anInt674 = intStack[intStackPointer + 1];
                class46.anInt733 = intStack[intStackPointer + 2];
                class46.anInt693 = intStack[intStackPointer + 3];
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1207) {
                intStackPointer -= 2;
                class46.anInt759 = intStack[intStackPointer];
                class46.anInt835 = intStack[intStackPointer + 1];
                Component111.markInterfaceDirty(-9343, class46);
                return;
            }
            if (i == 1210) {
                intStackPointer -= 4;
                class46.anInt753 = intStack[intStackPointer];
                class46.anInt779 = intStack[intStackPointer + 1];
                if (intStack[intStackPointer + 2] == 1) class46.anInt770 = 9;
                else class46.anInt770 = 8;
                class46.aBoolean720 = intStack[intStackPointer + 3] == 1;
                if (class46.childIndex == -1) Component27.method3569(class46.packedId, 8);
                return;
            }
            if (i == 1211) {
                class46.anInt770 = 5;
                class46.anInt753 = StringDefinition.anInt9591;
                class46.anInt779 = 0;
                if (class46.childIndex == -1) Component27.method3569(class46.packedId, 66);
                return;
            }
        } else if (i >= 1300 && i < 1400 || i >= 2300 && i < 2400) {
            DisplayModeManagerContainer57 class46;
            if (i >= 2000) {
                i -= 1000;
                class46 = BitmapFont.getComponent(1512932720, intStack[--intStackPointer]);
            } else class46 = bool ? aClass46_1169 : aClass46_1150;
            if (i == 1300) {
                int i_281_ = intStack[--intStackPointer] - 1;
                if (i_281_ >= 0 && i_281_ <= 9) {
                    class46.method438(i_281_, 124, stringStack[--stringStackPointer]);
                    return;
                } else stringStackPointer--;
                return;
            }
            if (i == 1301) {
                intStackPointer -= 2;
                int i_282_ = intStack[intStackPointer];
                int i_283_ = intStack[intStackPointer + 1];
                if (i_282_ == -1 && i_283_ == -1) class46.parent = null;
                else {
                    class46.parent = NpcNode.getChildComponent(i_283_, (byte) -54, i_282_);
                    return;
                }
                return;
            }
            if (i == 1302) {
                int i_284_ = intStack[--intStackPointer];
                if (i_284_ == InputStream_Sub1.anInt78 || i_284_ == BrowserDetector.anInt2361 || i_284_ == Component37.anInt3930) {
                    class46.anInt797 = i_284_;
                    return;
                }
                return;
            }
            if (i == 1303) {
                class46.anInt729 = intStack[--intStackPointer];
                return;
            }
            if (i == 1304) {
                class46.anInt703 = intStack[--intStackPointer];
                return;
            }
            if (i == 1305) {
                class46.text = stringStack[--stringStackPointer];
                return;
            }
            if (i == 1306) {
                class46.useOption = stringStack[--stringStackPointer];
                return;
            }
            if (i == 1307) {
                class46.optionLabels = null;
                return;
            }
            if (i == 1308) {
                class46.anInt695 = intStack[--intStackPointer];
                class46.anInt824 = intStack[--intStackPointer];
                return;
            }
            if (i == 1309) {
                int i_285_ = intStack[--intStackPointer];
                int i_286_ = intStack[--intStackPointer];
                if (i_286_ >= 1 && i_286_ <= 10) class46.method431(i_286_ - 1, i_285_, (byte) -119);
                return;
            }
            if (i == 1310) {
                class46.continueOption = stringStack[--stringStackPointer];
                return;
            }
            if (i == 1311) {
                class46.usePriority = intStack[--intStackPointer];
                return;
            }
            if (i == 1312 || i == 1313) {
                int i_287_;
                int i_288_;
                int i_289_;
                if (i == 1312) {
                    intStackPointer -= 3;
                    i_287_ = intStack[intStackPointer] - 1;
                    i_288_ = intStack[intStackPointer + 1];
                    i_289_ = intStack[intStackPointer + 2];
                    if (i_287_ < 0 || i_287_ > 9) throw new RuntimeException("IOR13121313");
                } else {
                    intStackPointer -= 2;
                    i_287_ = 10;
                    i_288_ = intStack[intStackPointer];
                    i_289_ = intStack[intStackPointer + 1];
                }
                if (class46.aByteArray746 == null) {
                    if (i_288_ != 0) {
                        class46.aByteArray746 = new byte[11];
                        class46.aByteArray832 = new byte[11];
                        class46.anIntArray707 = new int[11];
                    } else return;
                }
                class46.aByteArray746[i_287_] = (byte) i_288_;
                if (i_288_ == 0) {
                    class46.aBoolean676 = false;
                    for (int i_290_ = 0; i_290_ < class46.aByteArray746.length; i_290_++) {
                        if (class46.aByteArray746[i_290_] != 0) {
                            class46.aBoolean676 = true;
                            break;
                        }
                    }
                } else class46.aBoolean676 = true;
                class46.aByteArray832[i_287_] = (byte) i_289_;
                return;
            }
            if (i == 1314) {
                class46.anInt719 = intStack[--intStackPointer];
                return;
            }
        } else {
            if (i >= 1400 && i < 1500 || i >= 2400 && i < 2500) {
                DisplayModeManagerContainer57 class46;
                if (i >= 2000) {
                    i -= 1000;
                    class46 = BitmapFont.getComponent(1512932720, intStack[--intStackPointer]);
                } else class46 = bool ? aClass46_1169 : aClass46_1150;
                if (i == 1499) class46.method434(false);
                else {
                    String string = stringStack[--stringStackPointer];
                    int[] is = null;
                    if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
                        int i_291_ = intStack[--intStackPointer];
                        if (i_291_ > 0) {
                            is = new int[i_291_];
                            while (i_291_-- > 0) is[i_291_] = intStack[--intStackPointer];
                        }
                        string = string.substring(0, string.length() - 1);
                    }
                    Object[] objects = new Object[string.length() + 1];
                    for (int i_292_ = objects.length - 1; i_292_ >= 1; i_292_--) {
                        if (string.charAt(i_292_ - 1) == 's') objects[i_292_] = stringStack[--stringStackPointer];
                        else objects[i_292_] = new Integer(intStack[--intStackPointer]);
                    }
                    int i_293_ = intStack[--intStackPointer];
                    if (i_293_ != -1) objects[0] = new Integer(i_293_);
                    else objects = null;
                    if (i == 1400) class46.anObjectArray763 = objects;
                    else if (i == 1401) class46.anObjectArray805 = objects;
                    else if (i == 1402) class46.anObjectArray742 = objects;
                    else if (i == 1403) class46.anObjectArray811 = objects;
                    else if (i == 1404) class46.anObjectArray683 = objects;
                    else if (i == 1405) class46.anObjectArray823 = objects;
                    else if (i == 1406) class46.anObjectArray680 = objects;
                    else if (i == 1407) {
                        class46.anObjectArray777 = objects;
                        class46.anIntArray686 = is;
                    } else if (i == 1408) class46.anObjectArray764 = objects;
                    else if (i == 1409) class46.optionScripts = objects;
                    else if (i == 1410) class46.anObjectArray692 = objects;
                    else if (i == 1411) class46.anObjectArray785 = objects;
                    else if (i == 1412) class46.anObjectArray839 = objects;
                    else if (i == 1414) {
                        class46.anObjectArray751 = objects;
                        class46.anIntArray771 = is;
                    } else if (i == 1415) {
                        class46.anObjectArray671 = objects;
                        class46.anIntArray731 = is;
                    } else if (i == 1416) class46.anObjectArray714 = objects;
                    else if (i == 1417) class46.anObjectArray803 = objects;
                    else if (i == 1418) class46.anObjectArray820 = objects;
                    else if (i == 1419) class46.anObjectArray822 = objects;
                    else if (i == 1420) class46.anObjectArray734 = objects;
                    else if (i == 1421) class46.anObjectArray761 = objects;
                    else if (i == 1422) class46.anObjectArray836 = objects;
                    else if (i == 1423) class46.anObjectArray840 = objects;
                    else if (i == 1424) class46.anObjectArray701 = objects;
                    else if (i == 1425) class46.anObjectArray807 = objects;
                    else if (i == 1426) class46.anObjectArray687 = objects;
                    else if (i == 1427) class46.anObjectArray727 = objects;
                    else if (i == 1428) {
                        class46.anObjectArray685 = objects;
                        class46.anIntArray818 = is;
                    } else if (i == 1429) {
                        class46.anObjectArray708 = objects;
                        class46.anIntArray831 = is;
                    } else if (i == 1430) class46.anObjectArray679 = objects;
                    class46.aBoolean682 = true;
                    return;
                }
                return;
            }
            if (i < 1600) {
                DisplayModeManagerContainer57 class46 = bool ? aClass46_1169 : aClass46_1150;
                if (i == 1500) {
                    intStack[intStackPointer++] = class46.absoluteX;
                    return;
                }
                if (i == 1501) {
                    intStack[intStackPointer++] = class46.absoluteY;
                    return;
                }
                if (i == 1502) {
                    intStack[intStackPointer++] = class46.width;
                    return;
                }
                if (i == 1503) {
                    intStack[intStackPointer++] = class46.height;
                    return;
                }
                if (i == 1504) {
                    intStack[intStackPointer++] = class46.hidden ? 1 : 0;
                    return;
                }
                if (i == 1505) {
                    intStack[intStackPointer++] = class46.parentId;
                    return;
                }
                if (i == 1506) {
                    DisplayModeManagerContainer57 class46_294_ = DisplayModeManagerContainer87.method1687(class46, 3);
                    intStack[intStackPointer++] = (class46_294_ == null ? -1 : class46_294_.packedId);
                    return;
                }
            } else if (i < 1700) {
                DisplayModeManagerContainer57 class46 = bool ? aClass46_1169 : aClass46_1150;
                if (i == 1600) {
                    intStack[intStackPointer++] = class46.scrollX;
                    return;
                }
                if (i == 1601) {
                    intStack[intStackPointer++] = class46.scrollY;
                    return;
                }
                if (i == 1602) {
                    stringStack[stringStackPointer++] = class46.textContent;
                    return;
                }
                if (i == 1603) {
                    intStack[intStackPointer++] = class46.scrollWidth;
                    return;
                }
                if (i == 1604) {
                    intStack[intStackPointer++] = class46.scrollHeight;
                    return;
                }
                if (i == 1605) {
                    intStack[intStackPointer++] = class46.anInt716;
                    return;
                }
                if (i == 1606) {
                    intStack[intStackPointer++] = class46.anInt757;
                    return;
                }
                if (i == 1607) {
                    intStack[intStackPointer++] = class46.anInt717;
                    return;
                }
                if (i == 1608) {
                    intStack[intStackPointer++] = class46.anInt675;
                    return;
                }
                if (i == 1609) {
                    intStack[intStackPointer++] = class46.opacity;
                    return;
                }
                if (i == 1610) {
                    intStack[intStackPointer++] = class46.anInt808;
                    return;
                }
                if (i == 1611) {
                    intStack[intStackPointer++] = class46.anInt786;
                    return;
                }
                if (i == 1612) {
                    intStack[intStackPointer++] = class46.spriteId;
                    return;
                }
                if (i == 1613) {
                    int i_295_ = intStack[--intStackPointer];
                    Component355 class254 = MatrixSub3.aClass326_5764.method2600(i_295_, 28364);
                    if (class254.method1925(false)) stringStack[stringStackPointer++] = class46.method429(i_295_, (class254.aString3258), -1);
                    else {
                        intStack[intStackPointer++] = class46.method428((class254.anInt3256), i_295_, -126);
                        return;
                    }
                    return;
                }
                if (i == 1614) {
                    intStack[intStackPointer++] = class46.spriteAngle;
                    return;
                }
                if (i == 2614) {
                    intStack[intStackPointer++] = (class46.anInt770 == 1 ? class46.anInt753 : -1);
                    return;
                }
            } else if (i < 1800) {
                DisplayModeManagerContainer57 class46 = bool ? aClass46_1169 : aClass46_1150;
                if (i == 1700) {
                    intStack[intStackPointer++] = class46.itemId;
                    return;
                }
                if (i == 1701) {
                    if (class46.itemId == -1) {
                        intStack[intStackPointer++] = 0;
                        return;
                    } else intStack[intStackPointer++] = class46.itemAmount;
                    return;
                }
                if (i == 1702) {
                    intStack[intStackPointer++] = class46.childIndex;
                    return;
                }
            } else if (i < 1900) {
                DisplayModeManagerContainer57 class46 = bool ? aClass46_1169 : aClass46_1150;
                if (i == 1800) {
                    intStack[intStackPointer++] = client.getComponentSettings(class46).getClickMask(83);
                    return;
                }
                if (i == 1801) {
                    int i_296_ = intStack[--intStackPointer];
                    i_296_--;
                    if (class46.optionLabels == null || i_296_ >= class46.optionLabels.length || class46.optionLabels[i_296_] == null) stringStack[stringStackPointer++] = "";
                    else {
                        stringStack[stringStackPointer++] = class46.optionLabels[i_296_];
                        return;
                    }
                    return;
                }
                if (i == 1802) {
                    if (class46.text == null) stringStack[stringStackPointer++] = "";
                    else {
                        stringStack[stringStackPointer++] = class46.text;
                        return;
                    }
                    return;
                }
            } else if (i < 2000 || i >= 2900 && i < 3000) {
                DisplayModeManagerContainer57 class46;
                if (i >= 2000) {
                    class46 = BitmapFont.getComponent(1512932720, intStack[--intStackPointer]);
                    i -= 1000;
                } else class46 = bool ? aClass46_1169 : aClass46_1150;
                if (anInt1177 >= 10) throw new RuntimeException("C29xx-1");
                if (i == 1927) {
                    if (class46.anObjectArray727 != null) {
                        NodeSub36 class348_sub36 = new NodeSub36();
                        class348_sub36.aClass46_6989 = class46;
                        class348_sub36.anObjectArray6987 = class46.anObjectArray727;
                        class348_sub36.anInt6988 = anInt1177 + 1;
                        NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
                        return;
                    }
                    return;
                }
            } else if (i < 2600) {
                DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, intStack[--intStackPointer]);
                if (i == 2500) {
                    intStack[intStackPointer++] = class46.absoluteX;
                    return;
                }
                if (i == 2501) {
                    intStack[intStackPointer++] = class46.absoluteY;
                    return;
                }
                if (i == 2502) {
                    intStack[intStackPointer++] = class46.width;
                    return;
                }
                if (i == 2503) {
                    intStack[intStackPointer++] = class46.height;
                    return;
                }
                if (i == 2504) {
                    intStack[intStackPointer++] = class46.hidden ? 1 : 0;
                    return;
                }
                if (i == 2505) {
                    intStack[intStackPointer++] = class46.parentId;
                    return;
                }
                if (i == 1506) {
                    DisplayModeManagerContainer57 class46_297_ = DisplayModeManagerContainer87.method1687(class46, 3);
                    intStack[intStackPointer++] = (class46_297_ == null ? -1 : class46_297_.packedId);
                    return;
                }
            } else if (i < 2700) {
                DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, intStack[--intStackPointer]);
                if (i == 2600) {
                    intStack[intStackPointer++] = class46.scrollX;
                    return;
                }
                if (i == 2601) {
                    intStack[intStackPointer++] = class46.scrollY;
                    return;
                }
                if (i == 2602) {
                    stringStack[stringStackPointer++] = class46.textContent;
                    return;
                }
                if (i == 2603) {
                    intStack[intStackPointer++] = class46.scrollWidth;
                    return;
                }
                if (i == 2604) {
                    intStack[intStackPointer++] = class46.scrollHeight;
                    return;
                }
                if (i == 2605) {
                    intStack[intStackPointer++] = class46.anInt716;
                    return;
                }
                if (i == 2606) {
                    intStack[intStackPointer++] = class46.anInt757;
                    return;
                }
                if (i == 2607) {
                    intStack[intStackPointer++] = class46.anInt717;
                    return;
                }
                if (i == 2608) {
                    intStack[intStackPointer++] = class46.anInt675;
                    return;
                }
                if (i == 2609) {
                    intStack[intStackPointer++] = class46.opacity;
                    return;
                }
                if (i == 2610) {
                    intStack[intStackPointer++] = class46.anInt808;
                    return;
                }
                if (i == 2611) {
                    intStack[intStackPointer++] = class46.anInt786;
                    return;
                }
                if (i == 2612) {
                    intStack[intStackPointer++] = class46.spriteId;
                    return;
                }
                if (i == 2613) {
                    intStack[intStackPointer++] = class46.spriteAngle;
                    return;
                }
                if (i == 2614) {
                    intStack[intStackPointer++] = (class46.anInt770 == 1 ? class46.anInt753 : -1);
                    return;
                }
            } else if (i < 2800) {
                if (i == 2700) {
                    DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, intStack[--intStackPointer]);
                    intStack[intStackPointer++] = class46.itemId;
                    return;
                }
                if (i == 2701) {
                    DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, intStack[--intStackPointer]);
                    if (class46.itemId == -1) {
                        intStack[intStackPointer++] = 0;
                        return;
                    } else intStack[intStackPointer++] = class46.itemAmount;
                    return;
                }
                if (i == 2702) {
                    int i_298_ = intStack[--intStackPointer];
                    NodeSub41 class348_sub41 = ((NodeSub41) Component15.aClass356_4915.get(i_298_, -6008));
                    if (class348_sub41 == null) {
                        intStack[intStackPointer++] = 0;
                        return;
                    } else intStack[intStackPointer++] = 1;
                    return;
                }
                if (i == 2703) {
                    DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, intStack[--intStackPointer]);
                    if (class46.children == null) intStack[intStackPointer++] = 0;
                    else {
                        int i_299_ = class46.children.length;
                        for (int i_300_ = 0; (i_300_ < class46.children.length); i_300_++) {
                            if (class46.children[i_300_] == null) {
                                i_299_ = i_300_;
                                break;
                            }
                        }
                        intStack[intStackPointer++] = i_299_;
                        return;
                    }
                    return;
                }
                if (i == 2704 || i == 2705) {
                    intStackPointer -= 2;
                    int i_301_ = intStack[intStackPointer];
                    int i_302_ = intStack[intStackPointer + 1];
                    NodeSub41 class348_sub41 = ((NodeSub41) Component15.aClass356_4915.get(i_301_, -6008));
                    if (class348_sub41 != null && (class348_sub41.anInt7050 == i_302_)) intStack[intStackPointer++] = 1;
                    else {
                        intStack[intStackPointer++] = 0;
                        return;
                    }
                    return;
                }
            } else if (i < 2900) {
                DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, intStack[--intStackPointer]);
                if (i == 2800) {
                    intStack[intStackPointer++] = client.getComponentSettings(class46).getClickMask(11);
                    return;
                }
                if (i == 2801) {
                    int i_303_ = intStack[--intStackPointer];
                    i_303_--;
                    if (class46.optionLabels == null || i_303_ >= class46.optionLabels.length || class46.optionLabels[i_303_] == null) stringStack[stringStackPointer++] = "";
                    else {
                        stringStack[stringStackPointer++] = class46.optionLabels[i_303_];
                        return;
                    }
                    return;
                }
                if (i == 2802) {
                    if (class46.text == null) stringStack[stringStackPointer++] = "";
                    else {
                        stringStack[stringStackPointer++] = class46.text;
                        return;
                    }
                    return;
                }
            } else if (i < 3200) {
                if (i == 3100) {
                    String string = stringStack[--stringStackPointer];
                    ImageCache.method1429(string, 0);
                    return;
                }
                if (i == 3101) {
                    intStackPointer -= 2;
                    Component53.method222((Component72.localPlayer), intStack[intStackPointer], (byte) 4, intStack[intStackPointer + 1]);
                    return;
                }
                if (i == 3103) {
                    FriendsIgnoreList.closeInterfaces((byte) -101, true);
                    return;
                }
                if (i == 3104) {
                    String string = stringStack[--stringStackPointer];
                    int i_304_ = 0;
                    if (DisplayModeManagerContainer368.isDecimal(string, 73)) i_304_ = NodeSub41.parseInt(true, string);
                    anInt1163++;
                    ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((NodeSub14.aClass351_6764), (DisplayModeManagerContainer64.aClass77_9029), -112);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 102, i_304_);
                    HashNodeSub14.enqueueOutboundPacket(116, class348_sub47);
                    return;
                }
                if (i == 3105) {
                    String string = stringStack[--stringStackPointer];
                    anInt1162++;
                    ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(CacheFileStore.aClass351_4225, (DisplayModeManagerContainer64.aClass77_9029), -96);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, string.length() + 1);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string);
                    HashNodeSub14.enqueueOutboundPacket(-81, class348_sub47);
                    return;
                }
                if (i == 3106) {
                    String string = stringStack[--stringStackPointer];
                    anInt1153++;
                    ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((DefinitionSub5.aClass351_9130), (DisplayModeManagerContainer64.aClass77_9029), -93);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, string.length() + 1);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string);
                    HashNodeSub14.enqueueOutboundPacket(35, class348_sub47);
                    return;
                }
                if (i == 3107) {
                    int i_305_ = intStack[--intStackPointer];
                    String string = stringStack[--stringStackPointer];
                    DisplayModeManagerContainer89.method201(i_305_, -7257, string);
                    return;
                }
                if (i == 3108) {
                    intStackPointer -= 3;
                    int i_306_ = intStack[intStackPointer];
                    int i_307_ = intStack[intStackPointer + 1];
                    int i_308_ = intStack[intStackPointer + 2];
                    DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, i_308_);
                    Component265.method887(class46, i_306_, i_307_, 2147483647);
                    return;
                }
                if (i == 3109) {
                    intStackPointer -= 2;
                    int i_309_ = intStack[intStackPointer];
                    int i_310_ = intStack[intStackPointer + 1];
                    DisplayModeManagerContainer57 class46 = bool ? aClass46_1169 : aClass46_1150;
                    Component265.method887(class46, i_309_, i_310_, 2147483647);
                    return;
                }
                if (i == 3110) {
                    int i_311_ = intStack[--intStackPointer];
                    anInt1167++;
                    ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((GradientPreset.aClass351_9189), (DisplayModeManagerContainer64.aClass77_9029), -121);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, i_311_);
                    HashNodeSub14.enqueueOutboundPacket(122, class348_sub47);
                    return;
                }
                if (i == 3111) {
                    intStackPointer -= 2;
                    int i_312_ = intStack[intStackPointer];
                    int i_313_ = intStack[intStackPointer + 1];
                    NodeSub41 class348_sub41 = ((NodeSub41) Component15.aClass356_4915.get(i_312_, -6008));
                    if (class348_sub41 != null) Component162.method1118((class348_sub41.anInt7050 != i_313_), true, class348_sub41, 2533);
                    Component103.method2661(i_313_, i_312_, 3, true, 2);
                    return;
                }
                if (i == 3112) {
                    intStackPointer--;
                    int i_314_ = intStack[intStackPointer];
                    NodeSub41 class348_sub41 = ((NodeSub41) Component15.aClass356_4915.get(i_314_, -6008));
                    if (class348_sub41 != null && class348_sub41.anInt7053 == 3) Component162.method1118(true, true, class348_sub41, 2533);
                    return;
                }
                if (i == 3113) {
                    Component175.method1721(stringStack[--stringStackPointer], (byte) -70);
                    return;
                }
                if (i == 3114) {
                    intStackPointer -= 2;
                    int i_315_ = intStack[intStackPointer];
                    int i_316_ = intStack[intStackPointer + 1];
                    String string = stringStack[--stringStackPointer];
                    ShaderProgramSub2.addChatMessage("", i_315_, (byte) -87, i_316_, string, "", "");
                    return;
                }
                if (i == 3115) {
                    intStackPointer -= 11;
                    Component85[] class221s = HeapDumpHelper.method1248(20);
                    DisplayModeManagerContainer196[] class341s = Component240.method596(20000);
                    SocketConnector.openWorldMap(intStack[intStackPointer + 9], intStack[intStackPointer + 5], class221s[intStack[intStackPointer]], (class341s[intStack[intStackPointer + 1]]), intStack[intStackPointer + 7], intStack[intStackPointer + 6], intStack[intStackPointer + 4], (byte) 111, intStack[intStackPointer + 10], intStack[intStackPointer + 2], intStack[intStackPointer + 3], intStack[intStackPointer + 8]);
                    return;
                }
            } else if (i < 3300) {
                if (i == 3200) {
                    intStackPointer -= 3;
                    NodeSub20.method2947(true, 255, intStack[intStackPointer], intStack[intStackPointer + 1], intStack[intStackPointer + 2], 256);
                    return;
                }
                if (i == 3201) {
                    DisplayModeManagerContainer346.method1212(255, intStack[--intStackPointer], -1, 50);
                    return;
                }
                if (i == 3202) {
                    intStackPointer -= 2;
                    DisplayModeManagerContainer249.method1352(intStack[intStackPointer], 255, intStack[intStackPointer + 1], (byte) -98);
                    return;
                }
                if (i == 3203) {
                    intStackPointer -= 4;
                    NodeSub20.method2947(true, intStack[intStackPointer + 3], intStack[intStackPointer], intStack[intStackPointer + 1], intStack[intStackPointer + 2], 256);
                    return;
                }
                if (i == 3204) {
                    intStackPointer -= 3;
                    DisplayModeManagerContainer346.method1212(intStack[intStackPointer + 1], intStack[intStackPointer], -1, intStack[intStackPointer + 2]);
                    return;
                }
                if (i == 3205) {
                    intStackPointer -= 3;
                    DisplayModeManagerContainer249.method1352(intStack[intStackPointer], intStack[intStackPointer + 2], intStack[intStackPointer + 1], (byte) -98);
                    return;
                }
                if (i == 3206) {
                    intStackPointer -= 4;
                    AudioLine.method2090(intStack[intStackPointer + 1], 256, false, (byte) -35, intStack[intStackPointer + 3], intStack[intStackPointer + 2], intStack[intStackPointer]);
                    return;
                }
                if (i == 3207) {
                    intStackPointer -= 4;
                    AudioLine.method2090(intStack[intStackPointer + 1], 256, true, (byte) -35, intStack[intStackPointer + 3], intStack[intStackPointer + 2], intStack[intStackPointer]);
                    return;
                }
                if (i == 3208) {
                    intStackPointer -= 5;
                    NodeSub20.method2947(true, intStack[intStackPointer + 3], intStack[intStackPointer], intStack[intStackPointer + 1], intStack[intStackPointer + 2], intStack[intStackPointer + 4]);
                    return;
                }
                if (i == 3209) {
                    intStackPointer -= 5;
                    AudioLine.method2090(intStack[intStackPointer + 1], intStack[intStackPointer + 4], false, (byte) -35, intStack[intStackPointer + 3], intStack[intStackPointer + 2], intStack[intStackPointer]);
                    return;
                }
            } else if (i < 3400) {
                if (i == 3300) {
                    intStack[intStackPointer++] = OpenGlShader.clientCycle;
                    return;
                }
                if (i == 3301) {
                    intStackPointer -= 2;
                    int i_317_ = intStack[intStackPointer];
                    int i_318_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = ImageCacheStore.method2552(false, i_317_, i_318_, -24667);
                    return;
                }
                if (i == 3302) {
                    intStackPointer -= 2;
                    int i_319_ = intStack[intStackPointer];
                    int i_320_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = Component49.method1854(71, i_319_, false, i_320_);
                    return;
                }
                if (i == 3303) {
                    intStackPointer -= 2;
                    int i_321_ = intStack[intStackPointer];
                    int i_322_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = Component255.method532(i_322_, i_321_, false, -126);
                    return;
                }
                if (i == 3304) {
                    int i_323_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = (Component162.aClass271_8378.method2044(106, i_323_).anInt9542);
                    return;
                }
                if (i == 3305) {
                    int i_324_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = DisplayModeManagerContainer254.anIntArray2145[i_324_];
                    return;
                }
                if (i == 3306) {
                    int i_325_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Component52.anIntArray3295[i_325_];
                    return;
                }
                if (i == 3307) {
                    int i_326_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = DisplayModeManagerContainer51.anIntArray2497[i_326_];
                    return;
                }
                if (i == 3308) {
                    int i_327_ = (Component72.localPlayer.plane);
                    int i_328_ = (((Component72.localPlayer.x) >> 9) + NodeBaseSub2.regionTileX);
                    int i_329_ = (((Component72.localPlayer.y) >> 9) + Component330.regionTileY);
                    intStack[intStackPointer++] = (i_327_ << 28) + (i_328_ << 14) + i_329_;
                    return;
                }
                if (i == 3309) {
                    int i_330_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = i_330_ >> 14 & 0x3fff;
                    return;
                }
                if (i == 3310) {
                    int i_331_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = i_331_ >> 28;
                    return;
                }
                if (i == 3311) {
                    int i_332_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = i_332_ & 0x3fff;
                    return;
                }
                if (i == 3312) {
                    intStack[intStackPointer++] = Component387.aBoolean1900 ? 1 : 0;
                    return;
                }
                if (i == 3313) {
                    intStackPointer -= 2;
                    int i_333_ = intStack[intStackPointer];
                    int i_334_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = ImageCacheStore.method2552(true, i_333_, i_334_, -24667);
                    return;
                }
                if (i == 3314) {
                    intStackPointer -= 2;
                    int i_335_ = intStack[intStackPointer];
                    int i_336_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = Component49.method1854(103, i_335_, true, i_336_);
                    return;
                }
                if (i == 3315) {
                    intStackPointer -= 2;
                    int i_337_ = intStack[intStackPointer];
                    int i_338_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = Component255.method532(i_338_, i_337_, true, 126);
                    return;
                }
                if (i == 3316) {
                    if (Component353.anInt2581 >= 2) intStack[intStackPointer++] = Component353.anInt2581;
                    else {
                        intStack[intStackPointer++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3317) {
                    intStack[intStackPointer++] = Component156.anInt3699;
                    return;
                }
                if (i == 3318) {
                    intStack[intStackPointer++] = Component223.aClass161_125.anInt2143;
                    return;
                }
                if (i == 3321) {
                    intStack[intStackPointer++] = DisplayModeManagerContainer74.anInt4816;
                    return;
                }
                if (i == 3322) {
                    intStack[intStackPointer++] = Component59.anInt1872;
                    return;
                }
                if (i == 3323) {
                    if (Component15.anInt4919 >= 5 && Component15.anInt4919 <= 9) intStack[intStackPointer++] = 1;
                    else {
                        intStack[intStackPointer++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3324) {
                    if (Component15.anInt4919 >= 5 && Component15.anInt4919 <= 9) intStack[intStackPointer++] = Component15.anInt4919;
                    else {
                        intStack[intStackPointer++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3325) {
                    intStack[intStackPointer++] = DisplayModeManagerContainer105.aBoolean4888 ? 1 : 0;
                    return;
                }
                if (i == 3326) {
                    intStack[intStackPointer++] = (Component72.localPlayer.combatLevel);
                    return;
                }
                if (i == 3327) {
                    intStack[intStackPointer++] = ((Component72.localPlayer.appearance) != null && Component72.localPlayer.appearance.aBoolean2100) ? 1 : 0;
                    return;
                }
                if (i == 3329) {
                    intStack[intStackPointer++] = Component308.aBoolean5233 ? 1 : 0;
                    return;
                }
                if (i == 3330) {
                    int i_339_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Component358.countEmptyInvSlots((byte) 35, i_339_, false);
                    return;
                }
                if (i == 3331) {
                    intStackPointer -= 2;
                    int i_340_ = intStack[intStackPointer];
                    int i_341_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = Component128.method592(false, (byte) -128, false, i_340_, i_341_);
                    return;
                }
                if (i == 3332) {
                    intStackPointer -= 2;
                    int i_342_ = intStack[intStackPointer];
                    int i_343_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = Component128.method592(true, (byte) -128, false, i_342_, i_343_);
                    return;
                }
                if (i == 3333) {
                    intStack[intStackPointer++] = RuntimeException_Sub1.anInt4596;
                    return;
                }
                if (i == 3335) {
                    intStack[intStackPointer++] = ObjectDeserializer.languageId;
                    return;
                }
                if (i == 3336) {
                    intStackPointer -= 4;
                    int i_344_ = intStack[intStackPointer];
                    int i_345_ = intStack[intStackPointer + 1];
                    int i_346_ = intStack[intStackPointer + 2];
                    int i_347_ = intStack[intStackPointer + 3];
                    i_344_ += i_345_ << 14;
                    i_344_ += i_346_ << 28;
                    i_344_ += i_347_;
                    intStack[intStackPointer++] = i_344_;
                    return;
                }
                if (i == 3337) {
                    intStack[intStackPointer++] = Connection.affiliateId;
                    return;
                }
                if (i == 3338) {
                    intStack[intStackPointer++] = Component94.benchmarkToolkitMs(-26584);
                    return;
                }
                if (i == 3339) {
                    intStack[intStackPointer++] = 0;
                    return;
                }
                if (i == 3340) {
                    intStack[intStackPointer++] = Component143.aBoolean2329 ? 1 : 0;
                    return;
                }
                if (i == 3341) {
                    intStack[intStackPointer++] = Component121.aBoolean4540 ? 1 : 0;
                    return;
                }
                if (i == 3342) {
                    intStack[intStackPointer++] = AbstractGlTextureSub4.mouseHandler.getCursorX(true);
                    return;
                }
                if (i == 3343) {
                    intStack[intStackPointer++] = AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 127);
                    return;
                }
                if (i == 3344) {
                    stringStack[stringStackPointer++] = Component219.getMenuTarget((byte) -119);
                    return;
                }
                if (i == 3345) {
                    stringStack[stringStackPointer++] = RunescapeInfo.getMenuTipOption((byte) 112);
                    return;
                }
                if (i == 3346) {
                    intStack[intStackPointer++] = Component289.method2489((byte) -106);
                    return;
                }
                if (i == 3347) {
                    intStack[intStackPointer++] = Component244.currentCursorId;
                    return;
                }
                if (i == 3349) {
                    intStack[intStackPointer++] = Component72.localPlayer.aClass264_10217.method2019((byte) -31) >> 3;
                    return;
                }
                if (i == 3351) {
                    intStack[intStackPointer++] = AbstractGlTextureSub4.mouseHandler.isLeftButtonDown(-83) ? 1 : 0;
                    intStack[intStackPointer++] = AbstractGlTextureSub4.mouseHandler.isMiddleButtonDown(-121) ? 1 : 0;
                    intStack[intStackPointer++] = AbstractGlTextureSub4.mouseHandler.isRightButtonDown((byte) 125) ? 1 : 0;
                    return;
                }
            } else if (i < 3500) {
                if (i == 3400) {
                    intStackPointer -= 2;
                    int i_348_ = intStack[intStackPointer];
                    int i_349_ = intStack[intStackPointer + 1];
                    Component208 class117 = NodeSub7.aClass33_6653.method337(true, i_348_);
                    stringStack[stringStackPointer++] = class117.getString(i_349_, 124);
                    return;
                }
                if (i == 3408) {
                    intStackPointer -= 4;
                    int i_350_ = intStack[intStackPointer];
                    int i_351_ = intStack[intStackPointer + 1];
                    int i_352_ = intStack[intStackPointer + 2];
                    int i_353_ = intStack[intStackPointer + 3];
                    Component208 class117 = NodeSub7.aClass33_6653.method337(true, i_352_);
                    if (class117.keyType != i_350_ || class117.valueType != i_351_) throw new RuntimeException("C3408-1 " + i_352_ + "-" + i_353_);
                    if (i_351_ == 115) stringStack[stringStackPointer++] = class117.getString(i_353_, 119);
                    else {
                        intStack[intStackPointer++] = class117.getInt(false, i_353_);
                        return;
                    }
                    return;
                }
                if (i == 3409) {
                    intStackPointer -= 3;
                    int i_354_ = intStack[intStackPointer];
                    int i_355_ = intStack[intStackPointer + 1];
                    int i_356_ = intStack[intStackPointer + 2];
                    if (i_355_ == -1) throw new RuntimeException("C3409-2");
                    Component208 class117 = NodeSub7.aClass33_6653.method337(true, i_355_);
                    if (class117.valueType != i_354_) throw new RuntimeException("C3409-1");
                    intStack[intStackPointer++] = class117.containsIntValue(true, i_356_) ? 1 : 0;
                    return;
                }
                if (i == 3410) {
                    int i_357_ = intStack[--intStackPointer];
                    String string = stringStack[--stringStackPointer];
                    if (i_357_ == -1) throw new RuntimeException("C3410-2");
                    Component208 class117 = NodeSub7.aClass33_6653.method337(true, i_357_);
                    if (class117.valueType != 's') throw new RuntimeException("C3410-1");
                    intStack[intStackPointer++] = class117.containsStringValue(false, string) ? 1 : 0;
                    return;
                }
                if (i == 3411) {
                    int i_358_ = intStack[--intStackPointer];
                    Component208 class117 = NodeSub7.aClass33_6653.method337(true, i_358_);
                    intStack[intStackPointer++] = class117.values.size(1);
                    return;
                }
            } else if (i < 3700) {
                if (i == 3600) {
                    if (Component15.anInt4930 == 0) intStack[intStackPointer++] = -2;
                    else {
                        if (Component15.anInt4930 == 1) intStack[intStackPointer++] = -1;
                        else {
                            intStack[intStackPointer++] = DefinitionSub30.friendCount;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 3601) {
                    int i_359_ = intStack[--intStackPointer];
                    if (Component15.anInt4930 == 2 && i_359_ < DefinitionSub30.friendCount) {
                        stringStack[stringStackPointer++] = Component178.friendNames[i_359_];
                        if (ShaderProgramSub2.friendFormerNames[i_359_] != null) stringStack[stringStackPointer++] = ShaderProgramSub2.friendFormerNames[i_359_];
                        else stringStack[stringStackPointer++] = "";
                    } else {
                        stringStack[stringStackPointer++] = "";
                        stringStack[stringStackPointer++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3602) {
                    int i_360_ = intStack[--intStackPointer];
                    if (Component15.anInt4930 == 2 && i_360_ < DefinitionSub30.friendCount) intStack[intStackPointer++] = GraphicsToolkit.friendWorldIds[i_360_];
                    else {
                        intStack[intStackPointer++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3603) {
                    int i_361_ = intStack[--intStackPointer];
                    if (Component15.anInt4930 == 2 && i_361_ < DefinitionSub30.friendCount) intStack[intStackPointer++] = Component16.friendRanks[i_361_];
                    else {
                        intStack[intStackPointer++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3604) {
                    String string = stringStack[--stringStackPointer];
                    int i_362_ = intStack[--intStackPointer];
                    DisplayModeManagerContainer1.sendStringPacket(16, i_362_, string);
                    return;
                }
                if (i == 3605) {
                    String string = stringStack[--stringStackPointer];
                    DefinitionSub30.method3128(-81, string);
                    return;
                }
                if (i == 3606) {
                    String string = stringStack[--stringStackPointer];
                    ShaderProgramSub7.method2165(true, string);
                    return;
                }
                if (i == 3607) {
                    String string = stringStack[--stringStackPointer];
                    DisplayModeManagerContainer91.method317(string, 117, false);
                    return;
                }
                if (i == 3608) {
                    String string = stringStack[--stringStackPointer];
                    AbstractShaderSub2.removeIgnore(true, string);
                    return;
                }
                if (i == 3609) {
                    String string = stringStack[--stringStackPointer];
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) string = string.substring(7);
                    intStack[intStackPointer++] = (NodeSub11.method2797(string, (byte) -63) ? 1 : 0);
                    return;
                }
                if (i == 3610) {
                    int i_363_ = intStack[--intStackPointer];
                    if (Component15.anInt4930 == 2 && i_363_ < DefinitionSub30.friendCount) stringStack[stringStackPointer++] = DebugPanic.friendWorldNames[i_363_];
                    else {
                        stringStack[stringStackPointer++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3611) {
                    if (Component47.aString863 == null) {
                        stringStack[stringStackPointer++] = "";
                        return;
                    } else stringStack[stringStackPointer++] = Component270.method1245(Component47.aString863, false);
                    return;
                }
                if (i == 3612) {
                    if (Component47.aString863 == null) {
                        intStack[intStackPointer++] = 0;
                        return;
                    } else intStack[intStackPointer++] = NameFormatter.anInt496;
                    return;
                }
                if (i == 3613) {
                    int i_364_ = intStack[--intStackPointer];
                    if (Component47.aString863 != null && i_364_ < NameFormatter.anInt496) stringStack[stringStackPointer++] = (RequestProcessor.aClass19Array2261[i_364_].aString314);
                    else {
                        stringStack[stringStackPointer++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3614) {
                    int i_365_ = intStack[--intStackPointer];
                    if (Component47.aString863 != null && i_365_ < NameFormatter.anInt496) intStack[intStackPointer++] = (RequestProcessor.aClass19Array2261[i_365_].anInt308);
                    else {
                        intStack[intStackPointer++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3615) {
                    int i_366_ = intStack[--intStackPointer];
                    if (Component47.aString863 != null && i_366_ < NameFormatter.anInt496) intStack[intStackPointer++] = (RequestProcessor.aClass19Array2261[i_366_].aByte310);
                    else {
                        intStack[intStackPointer++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3616) {
                    intStack[intStackPointer++] = Component386.aByte2871;
                    return;
                }
                if (i == 3617) {
                    String string = stringStack[--stringStackPointer];
                    Component314.method2298((byte) -117, string);
                    return;
                }
                if (i == 3618) {
                    intStack[intStackPointer++] = DisplayModeManagerContainer96.aByte4702;
                    return;
                }
                if (i == 3619) {
                    String string = stringStack[--stringStackPointer];
                    Component141.method2399(string, -117);
                    return;
                }
                if (i == 3620) {
                    Component359.method1867(77);
                    return;
                }
                if (i == 3621) {
                    if (Component15.anInt4930 == 0) intStack[intStackPointer++] = -1;
                    else {
                        intStack[intStackPointer++] = MenuEntry.ignoreCount;
                        return;
                    }
                    return;
                }
                if (i == 3622) {
                    int i_367_ = intStack[--intStackPointer];
                    if (Component15.anInt4930 != 0 && i_367_ < MenuEntry.ignoreCount) {
                        stringStack[stringStackPointer++] = ObjectDefinition.ignoreNames[i_367_];
                        if (DefinitionSub21.ignoreLastNames[i_367_] != null) stringStack[stringStackPointer++] = (DefinitionSub21.ignoreLastNames[i_367_]);
                        else stringStack[stringStackPointer++] = "";
                    } else {
                        stringStack[stringStackPointer++] = "";
                        stringStack[stringStackPointer++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3623) {
                    String string = stringStack[--stringStackPointer];
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) string = string.substring(7);
                    intStack[intStackPointer++] = StringCache.isOnIgnoreList(string, 28280) ? 1 : 0;
                    return;
                }
                if (i == 3624) {
                    int i_368_ = intStack[--intStackPointer];
                    if (RequestProcessor.aClass19Array2261 != null && i_368_ < NameFormatter.anInt496 && (RequestProcessor.aClass19Array2261[i_368_].aString306.equalsIgnoreCase(Component72.localPlayer.username))) intStack[intStackPointer++] = 1;
                    else {
                        intStack[intStackPointer++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3625) {
                    if (NodeSub21.aString6854 == null) {
                        stringStack[stringStackPointer++] = "";
                        return;
                    } else stringStack[stringStackPointer++] = NodeSub21.aString6854;
                    return;
                }
                if (i == 3626) {
                    int i_369_ = intStack[--intStackPointer];
                    if (Component47.aString863 != null && i_369_ < NameFormatter.anInt496) stringStack[stringStackPointer++] = (RequestProcessor.aClass19Array2261[i_369_].aString313);
                    else {
                        stringStack[stringStackPointer++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3627) {
                    int i_370_ = intStack[--intStackPointer];
                    if (Component15.anInt4930 == 2 && i_370_ >= 0 && i_370_ < DefinitionSub30.friendCount) intStack[intStackPointer++] = DisplayModeManagerContainer145.friendReferred[i_370_] ? 1 : 0;
                    else {
                        intStack[intStackPointer++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3628) {
                    String string = stringStack[--stringStackPointer];
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) string = string.substring(7);
                    intStack[intStackPointer++] = Component189.findFriendIndex(string, -91);
                    return;
                }
                if (i == 3629) {
                    intStack[intStackPointer++] = GraphicsToolkit.anInt4583;
                    return;
                }
                if (i == 3630) {
                    String string = stringStack[--stringStackPointer];
                    DisplayModeManagerContainer91.method317(string, 119, true);
                    return;
                }
                if (i == 3631) {
                    int i_371_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = AbstractShaderSub3.ignoreTemporary[i_371_] ? 1 : 0;
                    return;
                }
                if (i == 3632) {
                    int i_372_ = intStack[--intStackPointer];
                    if (Component47.aString863 != null && i_372_ < NameFormatter.anInt496) stringStack[stringStackPointer++] = (RequestProcessor.aClass19Array2261[i_372_].aString306);
                    else {
                        stringStack[stringStackPointer++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3633) {
                    int i_373_ = intStack[--intStackPointer];
                    if (Component15.anInt4930 != 0 && i_373_ < MenuEntry.ignoreCount) stringStack[stringStackPointer++] = DisplayModeManagerContainer145.ignoreDisplayNames[i_373_];
                    else {
                        stringStack[stringStackPointer++] = "";
                        return;
                    }
                    return;
                }
            } else if (i < 4000) {
                if (i == 3903) {
                    int i_374_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = RadixText.aClass54Array6114[i_374_].method499(21110);
                    return;
                }
                if (i == 3904) {
                    int i_375_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = (RadixText.aClass54Array6114[i_375_].anInt969);
                    return;
                }
                if (i == 3905) {
                    int i_376_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = (RadixText.aClass54Array6114[i_376_].anInt976);
                    return;
                }
                if (i == 3906) {
                    int i_377_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = (RadixText.aClass54Array6114[i_377_].anInt967);
                    return;
                }
                if (i == 3907) {
                    int i_378_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = (RadixText.aClass54Array6114[i_378_].anInt977);
                    return;
                }
                if (i == 3908) {
                    int i_379_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = (RadixText.aClass54Array6114[i_379_].anInt973);
                    return;
                }
                if (i == 3910) {
                    int i_380_ = intStack[--intStackPointer];
                    int i_381_ = RadixText.aClass54Array6114[i_380_].method502((byte) 100);
                    intStack[intStackPointer++] = i_381_ == 0 ? 1 : 0;
                    return;
                }
                if (i == 3911) {
                    int i_382_ = intStack[--intStackPointer];
                    int i_383_ = RadixText.aClass54Array6114[i_382_].method502((byte) 118);
                    intStack[intStackPointer++] = i_383_ == 2 ? 1 : 0;
                    return;
                }
                if (i == 3912) {
                    int i_384_ = intStack[--intStackPointer];
                    int i_385_ = RadixText.aClass54Array6114[i_384_].method502((byte) -100);
                    intStack[intStackPointer++] = i_385_ == 5 ? 1 : 0;
                    return;
                }
                if (i == 3913) {
                    int i_386_ = intStack[--intStackPointer];
                    int i_387_ = RadixText.aClass54Array6114[i_386_].method502((byte) 55);
                    intStack[intStackPointer++] = i_387_ == 1 ? 1 : 0;
                    return;
                }
            } else if (i < 4100) {
                if (i == 4000) {
                    intStackPointer -= 2;
                    int i_388_ = intStack[intStackPointer];
                    int i_389_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = i_388_ + i_389_;
                    return;
                }
                if (i == 4001) {
                    intStackPointer -= 2;
                    int i_390_ = intStack[intStackPointer];
                    int i_391_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = i_390_ - i_391_;
                    return;
                }
                if (i == 4002) {
                    intStackPointer -= 2;
                    int i_392_ = intStack[intStackPointer];
                    int i_393_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = i_392_ * i_393_;
                    return;
                }
                if (i == 4003) {
                    intStackPointer -= 2;
                    int i_394_ = intStack[intStackPointer];
                    int i_395_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = i_394_ / i_395_;
                    return;
                }
                if (i == 4004) {
                    int i_396_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = (int) (Math.random() * (double) i_396_);
                    return;
                }
                if (i == 4005) {
                    int i_397_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = (int) (Math.random() * (double) (i_397_ + 1));
                    return;
                }
                if (i == 4006) {
                    intStackPointer -= 5;
                    int i_398_ = intStack[intStackPointer];
                    int i_399_ = intStack[intStackPointer + 1];
                    int i_400_ = intStack[intStackPointer + 2];
                    int i_401_ = intStack[intStackPointer + 3];
                    int i_402_ = intStack[intStackPointer + 4];
                    intStack[intStackPointer++] = i_398_ + ((i_399_ - i_398_) * (i_402_ - i_400_) / (i_401_ - i_400_));
                    return;
                }
                if (i == 4007) {
                    intStackPointer -= 2;
                    long l = intStack[intStackPointer];
                    long l_403_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = (int) (l + l * l_403_ / 100L);
                    return;
                }
                if (i == 4008) {
                    intStackPointer -= 2;
                    int i_404_ = intStack[intStackPointer];
                    int i_405_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = i_404_ | 1 << i_405_;
                    return;
                }
                if (i == 4009) {
                    intStackPointer -= 2;
                    int i_406_ = intStack[intStackPointer];
                    int i_407_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = i_406_ & -1 - (1 << i_407_);
                    return;
                }
                if (i == 4010) {
                    intStackPointer -= 2;
                    int i_408_ = intStack[intStackPointer];
                    int i_409_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = (i_408_ & 1 << i_409_) != 0 ? 1 : 0;
                    return;
                }
                if (i == 4011) {
                    intStackPointer -= 2;
                    int i_410_ = intStack[intStackPointer];
                    int i_411_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = i_410_ % i_411_;
                    return;
                }
                if (i == 4012) {
                    intStackPointer -= 2;
                    int i_412_ = intStack[intStackPointer];
                    int i_413_ = intStack[intStackPointer + 1];
                    if (i_412_ == 0) intStack[intStackPointer++] = 0;
                    else {
                        intStack[intStackPointer++] = (int) Math.pow(i_412_, i_413_);
                        return;
                    }
                    return;
                }
                if (i == 4013) {
                    intStackPointer -= 2;
                    int i_414_ = intStack[intStackPointer];
                    int i_415_ = intStack[intStackPointer + 1];
                    if (i_414_ == 0) intStack[intStackPointer++] = 0;
                    else {
                        if (i_415_ == 0) intStack[intStackPointer++] = 2147483647;
                        else {
                            intStack[intStackPointer++] = (int) Math.pow(i_414_, 1.0 / (double) i_415_);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 4014) {
                    intStackPointer -= 2;
                    int i_416_ = intStack[intStackPointer];
                    int i_417_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = i_416_ & i_417_;
                    return;
                }
                if (i == 4015) {
                    intStackPointer -= 2;
                    int i_418_ = intStack[intStackPointer];
                    int i_419_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = i_418_ | i_419_;
                    return;
                }
                if (i == 4016) {
                    intStackPointer -= 2;
                    int i_420_ = intStack[intStackPointer];
                    int i_421_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = Math.min(i_420_, i_421_);
                    return;
                }
                if (i == 4017) {
                    intStackPointer -= 2;
                    int i_422_ = intStack[intStackPointer];
                    int i_423_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = Math.max(i_422_, i_423_);
                    return;
                }
                if (i == 4018) {
                    intStackPointer -= 3;
                    long l = intStack[intStackPointer];
                    long l_424_ = intStack[intStackPointer + 1];
                    long l_425_ = intStack[intStackPointer + 2];
                    intStack[intStackPointer++] = (int) (l * l_425_ / l_424_);
                    return;
                }
                if (i == 4019) {
                    intStackPointer -= 2;
                    int i_426_ = intStack[intStackPointer];
                    int i_427_ = intStack[intStackPointer + 1];
                    if (i_426_ > 700 || i_427_ > 700) intStack[intStackPointer++] = 256;
                    double d = ((Math.random() * (double) (i_427_ + i_426_) - (double) i_426_ + 800.0) / 100.0);
                    intStack[intStackPointer++] = (int) (Math.pow(2.0, d) + 0.5);
                    return;
                }
            } else if (i < 4200) {
                if (i == 4100) {
                    String string = stringStack[--stringStackPointer];
                    int i_428_ = intStack[--intStackPointer];
                    stringStack[stringStackPointer++] = string + i_428_;
                    return;
                }
                if (i == 4101) {
                    stringStackPointer -= 2;
                    String string = stringStack[stringStackPointer];
                    String string_429_ = stringStack[stringStackPointer + 1];
                    stringStack[stringStackPointer++] = string + string_429_;
                    return;
                }
                if (i == 4102) {
                    String string = stringStack[--stringStackPointer];
                    int i_430_ = intStack[--intStackPointer];
                    stringStack[stringStackPointer++] = string + Component211.method1171(i_430_, 76, true);
                    return;
                }
                if (i == 4103) {
                    String string = stringStack[--stringStackPointer];
                    stringStack[stringStackPointer++] = string.toLowerCase();
                    return;
                }
                if (i == 4104) {
                    stringStack[stringStackPointer++] = formatDate(intStack[--intStackPointer]);
                    return;
                }
                if (i == 4105) {
                    stringStackPointer -= 2;
                    String string = stringStack[stringStackPointer];
                    String string_431_ = stringStack[stringStackPointer + 1];
                    if ((Component72.localPlayer.appearance) != null && Component72.localPlayer.appearance.aBoolean2100) stringStack[stringStackPointer++] = string_431_;
                    else {
                        stringStack[stringStackPointer++] = string;
                        return;
                    }
                    return;
                }
                if (i == 4106) {
                    int i_432_ = intStack[--intStackPointer];
                    stringStack[stringStackPointer++] = Integer.toString(i_432_);
                    return;
                }
                if (i == 4107) {
                    stringStackPointer -= 2;
                    intStack[intStackPointer++] = Component71.method1811(9152, (stringStack[stringStackPointer + 1]), ObjectDeserializer.languageId, (stringStack[stringStackPointer]));
                    return;
                }
                if (i == 4108) {
                    String string = stringStack[--stringStackPointer];
                    intStackPointer -= 2;
                    int i_433_ = intStack[intStackPointer];
                    int i_434_ = intStack[intStackPointer + 1];
                    Component184 class143 = Component388.method1819(i_434_, 0, -123, Component65.aClass45_1627);
                    intStack[intStackPointer++] = class143.method1190(Component22.aClass105Array1744, 1, string, i_433_);
                    return;
                }
                if (i == 4109) {
                    String string = stringStack[--stringStackPointer];
                    intStackPointer -= 2;
                    int i_435_ = intStack[intStackPointer];
                    int i_436_ = intStack[intStackPointer + 1];
                    Component184 class143 = Component388.method1819(i_436_, 0, -79, Component65.aClass45_1627);
                    intStack[intStackPointer++] = class143.method1187(string, false, i_435_, Component22.aClass105Array1744);
                    return;
                }
                if (i == 4110) {
                    stringStackPointer -= 2;
                    String string = stringStack[stringStackPointer];
                    String string_437_ = stringStack[stringStackPointer + 1];
                    if (intStack[--intStackPointer] == 1) stringStack[stringStackPointer++] = string;
                    else {
                        stringStack[stringStackPointer++] = string_437_;
                        return;
                    }
                    return;
                }
                if (i == 4111) {
                    String string = stringStack[--stringStackPointer];
                    stringStack[stringStackPointer++] = Component317.escapeAngleBrackets(string, 23034);
                    return;
                }
                if (i == 4112) {
                    String string = stringStack[--stringStackPointer];
                    int i_438_ = intStack[--intStackPointer];
                    if (i_438_ == -1) throw new RuntimeException("null char");
                    stringStack[stringStackPointer++] = string + (char) i_438_;
                    return;
                }
                if (i == 4113) {
                    int i_439_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = isValidChar((char) i_439_);
                    return;
                }
                if (i == 4114) {
                    int i_440_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Npc.method2446((char) i_440_, (byte) 105) ? 1 : 0;
                    return;
                }
                if (i == 4115) {
                    int i_441_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = ScreenModeManager.method1581(-93, (char) i_441_) ? 1 : 0;
                    return;
                }
                if (i == 4116) {
                    int i_442_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = NativeLibLoader.isDigit(true, (char) i_442_) ? 1 : 0;
                    return;
                }
                if (i == 4117) {
                    String string = stringStack[--stringStackPointer];
                    if (string == null) {
                        intStack[intStackPointer++] = 0;
                        return;
                    } else intStack[intStackPointer++] = string.length();
                    return;
                }
                if (i == 4118) {
                    String string = stringStack[--stringStackPointer];
                    intStackPointer -= 2;
                    int i_443_ = intStack[intStackPointer];
                    int i_444_ = intStack[intStackPointer + 1];
                    stringStack[stringStackPointer++] = string.substring(i_443_, i_444_);
                    return;
                }
                if (i == 4119) {
                    String string = stringStack[--stringStackPointer];
                    StringBuffer stringbuffer = new StringBuffer(string.length());
                    boolean bool_445_ = false;
                    for (int i_446_ = 0; i_446_ < string.length(); i_446_++) {
                        char c = string.charAt(i_446_);
                        if (c == '<') bool_445_ = true;
                        else if (c == '>') bool_445_ = false;
                        else if (!bool_445_) stringbuffer.append(c);
                    }
                    stringStack[stringStackPointer++] = stringbuffer.toString();
                    return;
                }
                if (i == 4120) {
                    String string = stringStack[--stringStackPointer];
                    intStackPointer -= 2;
                    int i_447_ = intStack[intStackPointer];
                    int i_448_ = intStack[intStackPointer + 1];
                    intStack[intStackPointer++] = string.indexOf(i_447_, i_448_);
                    return;
                }
                if (i == 4121) {
                    stringStackPointer -= 2;
                    String string = stringStack[stringStackPointer];
                    String string_449_ = stringStack[stringStackPointer + 1];
                    int i_450_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = string.indexOf(string_449_, i_450_);
                    return;
                }
                if (i == 4122) {
                    int i_451_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Character.toLowerCase((char) i_451_);
                    return;
                }
                if (i == 4123) {
                    int i_452_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Character.toUpperCase((char) i_452_);
                    return;
                }
                if (i == 4124) {
                    boolean bool_453_ = intStack[--intStackPointer] != 0;
                    int i_454_ = intStack[--intStackPointer];
                    stringStack[stringStackPointer++] = Component186.method3486(0, bool_453_, ObjectDeserializer.languageId, i_454_, 16980);
                    return;
                }
                if (i == 4125) {
                    String string = stringStack[--stringStackPointer];
                    int i_455_ = intStack[--intStackPointer];
                    Component184 class143 = Component388.method1819(i_455_, 0, -114, Component65.aClass45_1627);
                    intStack[intStackPointer++] = class143.method1186(string, Component22.aClass105Array1744, false);
                    return;
                }
            } else if (i < 4300) {
                if (i == 4200) {
                    int i_456_ = intStack[--intStackPointer];
                    stringStack[stringStackPointer++] = (Exception_Sub1.itemDefinitions.getItemDefinition(-52, i_456_).itemName) + Loader.getDebug(i_456_);
                    return;
                }
                if (i == 4201) {
                    intStackPointer -= 2;
                    int i_457_ = intStack[intStackPointer];
                    int i_458_ = intStack[intStackPointer + 1];
                    ItemDefinition class213 = Exception_Sub1.itemDefinitions.getItemDefinition(-79, i_457_);
                    if (i_458_ >= 1 && i_458_ <= 5 && (class213.aStringArray2811[i_458_ - 1] != null)) stringStack[stringStackPointer++] = (class213.aStringArray2811[i_458_ - 1]);
                    else {
                        stringStack[stringStackPointer++] = "";
                        return;
                    }
                    return;
                }
                if (i == 4202) {
                    intStackPointer -= 2;
                    int i_459_ = intStack[intStackPointer];
                    int i_460_ = intStack[intStackPointer + 1];
                    ItemDefinition class213 = Exception_Sub1.itemDefinitions.getItemDefinition(112, i_459_);
                    if (i_460_ >= 1 && i_460_ <= 5 && (class213.aStringArray2763[i_460_ - 1] != null)) stringStack[stringStackPointer++] = (class213.aStringArray2763[i_460_ - 1]);
                    else {
                        stringStack[stringStackPointer++] = "";
                        return;
                    }
                    return;
                }
                if (i == 4203) {
                    int i_461_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Exception_Sub1.itemDefinitions.getItemDefinition(-52, i_461_).anInt2819;
                    return;
                }
                if (i == 4204) {
                    int i_462_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = (Exception_Sub1.itemDefinitions.getItemDefinition(82, i_462_).anInt2820 == 1) ? 1 : 0;
                    return;
                }
                if (i == 4205) {
                    int i_463_ = intStack[--intStackPointer];
                    ItemDefinition class213 = Exception_Sub1.itemDefinitions.getItemDefinition(80, i_463_);
                    if (class213.anInt2833 == -1 && class213.anInt2758 >= 0) intStack[intStackPointer++] = class213.anInt2758;
                    else {
                        intStack[intStackPointer++] = i_463_;
                        return;
                    }
                    return;
                }
                if (i == 4206) {
                    int i_464_ = intStack[--intStackPointer];
                    ItemDefinition class213 = Exception_Sub1.itemDefinitions.getItemDefinition(-56, i_464_);
                    if (class213.anInt2833 >= 0 && class213.anInt2758 >= 0) intStack[intStackPointer++] = class213.anInt2758;
                    else {
                        intStack[intStackPointer++] = i_464_;
                        return;
                    }
                    return;
                }
                if (i == 4207) {
                    int i_465_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = (Exception_Sub1.itemDefinitions.getItemDefinition(87, i_465_).aBoolean2783) ? 1 : 0;
                    return;
                }
                if (i == 4208) {
                    intStackPointer -= 2;
                    int i_466_ = intStack[intStackPointer];
                    int i_467_ = intStack[intStackPointer + 1];
                    Component355 class254 = MatrixSub3.aClass326_5764.method2600(i_467_, 28364);
                    if (class254.method1925(false)) stringStack[stringStackPointer++] = (Exception_Sub1.itemDefinitions.getItemDefinition(-96, i_466_).method1561(class254.aString3258, i_467_, -1511086397));
                    else {
                        intStack[intStackPointer++] = (Exception_Sub1.itemDefinitions.getItemDefinition(-82, i_466_).method1567(class254.anInt3256, -106, i_467_));
                        return;
                    }
                    return;
                }
                if (i == 4209) {
                    intStackPointer -= 2;
                    int i_468_ = intStack[intStackPointer];
                    int i_469_ = intStack[intStackPointer + 1] - 1;
                    ItemDefinition class213 = Exception_Sub1.itemDefinitions.getItemDefinition(108, i_468_);
                    if (class213.anInt2766 == i_469_) intStack[intStackPointer++] = class213.anInt2818;
                    else {
                        if (class213.anInt2774 == i_469_) intStack[intStackPointer++] = class213.anInt2817;
                        else {
                            intStack[intStackPointer++] = -1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 4210) {
                    String string = stringStack[--stringStackPointer];
                    int i_470_ = intStack[--intStackPointer];
                    Component46.method1586(i_470_ == 1, (byte) -108, string);
                    intStack[intStackPointer++] = DisplayModeManagerContainer154.anInt1285;
                    return;
                }
                if (i == 4211) {
                    if (Component353.aShortArray2579 == null || Component3.anInt2037 >= DisplayModeManagerContainer154.anInt1285) intStack[intStackPointer++] = -1;
                    else {
                        intStack[intStackPointer++] = (Component353.aShortArray2579[Component3.anInt2037++] & 0xffff);
                        return;
                    }
                    return;
                }
                if (i == 4212) {
                    Component3.anInt2037 = 0;
                    return;
                }
                if (i == 4213) {
                    int i_471_ = intStack[--intStackPointer];
                    intStack[intStackPointer++] = Exception_Sub1.itemDefinitions.getItemDefinition(-115, i_471_).anInt2802;
                    return;
                }
                if (i == 4214) {
                    String string = stringStack[--stringStackPointer];
                    intStackPointer -= 3;
                    int i_472_ = intStack[intStackPointer];
                    int i_473_ = intStack[intStackPointer + 1];
                    int i_474_ = intStack[intStackPointer + 2];
                    Component110.method259(i_474_, -125, i_472_ == 1, string, i_473_);
                    intStack[intStackPointer++] = DisplayModeManagerContainer154.anInt1285;
                    return;
                }
                if (i == 4215) {
                    stringStackPointer -= 2;
                    intStackPointer -= 2;
                    String string = stringStack[stringStackPointer];
                    int i_475_ = intStack[intStackPointer];
                    int i_476_ = intStack[intStackPointer + 1];
                    String string_477_ = stringStack[stringStackPointer + 1];
                    Component175.method1719(i_475_ == 1, string, string_477_, i_476_, -1);
                    intStack[intStackPointer++] = DisplayModeManagerContainer154.anInt1285;
                    return;
                }
            } else if (i < 4400) {
                if (i == 4300) {
                    intStackPointer -= 2;
                    int i_478_ = intStack[intStackPointer];
                    int i_479_ = intStack[intStackPointer + 1];
                    Component355 class254 = MatrixSub3.aClass326_5764.method2600(i_479_, 28364);
                    if (class254.method1925(false)) stringStack[stringStackPointer++] = (Component291.aClass278_2529.method2079(i_478_, -1).method801((byte) 17, i_479_, class254.aString3258));
                    else {
                        intStack[intStackPointer++] = (Component291.aClass278_2529.method2079(i_478_, -1).method805(class254.anInt3256, i_479_, 48));
                        return;
                    }
                    return;
                }
            } else if (i < 4500) {
                if (i == 4400) {
                    intStackPointer -= 2;
                    int i_480_ = intStack[intStackPointer];
                    int i_481_ = intStack[intStackPointer + 1];
                    Component355 class254 = MatrixSub3.aClass326_5764.method2600(i_481_, 28364);
                    if (class254.method1925(false)) stringStack[stringStackPointer++] = (GradientPreset.aClass263_9195.getObjectDefinition(0, i_480_).method475(class254.aString3258, i_481_, -16));
                    else {
                        intStack[intStackPointer++] = (GradientPreset.aClass263_9195.getObjectDefinition(0, i_480_).method487(i_481_, class254.anInt3256, 81));
                        return;
                    }
                    return;
                }
            } else if (i < 4600) {
                if (i == 4500) {
                    intStackPointer -= 2;
                    int i_482_ = intStack[intStackPointer];
                    int i_483_ = intStack[intStackPointer + 1];
                    Component355 class254 = MatrixSub3.aClass326_5764.method2600(i_483_, 28364);
                    if (class254.method1925(false)) stringStack[stringStackPointer++] = (Component257.aClass65_4787.method700(i_482_, -121).method3170(-250, class254.aString3258, i_483_));
                    else {
                        intStack[intStackPointer++] = (Component257.aClass65_4787.method700(i_482_, 81).method3166(i_483_, class254.anInt3256, (byte) 124));
                        return;
                    }
                    return;
                }
            } else if (i < 4700 && i == 4600) {
                int i_484_ = intStack[--intStackPointer];
                Component241 class225 = DisplayModeManagerContainer282.aClass261_5558.get(i_484_, 32);
                if (class225.anIntArray2915 != null && class225.anIntArray2915.length > 0) {
                    int i_485_ = 0;
                    int i_486_ = class225.anIntArray2929[0];
                    for (int i_487_ = 1; i_487_ < class225.anIntArray2915.length; i_487_++) {
                        if (class225.anIntArray2929[i_487_] > i_486_) {
                            i_485_ = i_487_;
                            i_486_ = class225.anIntArray2929[i_487_];
                        }
                    }
                    intStack[intStackPointer++] = class225.anIntArray2915[i_485_];
                } else {
                    intStack[intStackPointer++] = class225.anInt2918;
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(i));
    }

    /** Interpret {@code class348_sub42_sub19}; throw "slow" if more than {@code i} ops. */
    private static final void execute(HashNodeSub19 class348_sub42_sub19, int i) {
        intStackPointer = 0;
        stringStackPointer = 0;
        int i_488_ = -1;
        int[] is = class348_sub42_sub19.anIntArray9696;
        int[] is_489_ = class348_sub42_sub19.anIntArray9694;
        int i_490_ = -1;
        callFramePointer = 0;
        try {
            int i_491_ = 0;
            for (; ; ) {
                if (++i_491_ > i) throw new RuntimeException("slow");
                i_490_ = is[++i_488_];
                if (i_490_ < 100) {
                    if (i_490_ == 0) intStack[intStackPointer++] = is_489_[i_488_];
                    else if (i_490_ == 1) {
                        int i_492_ = is_489_[i_488_];
                        intStack[intStackPointer++] = (DisplayModeManagerContainer58.aClass170_10209.anIntArray5063[i_492_]);
                    } else if (i_490_ == 2) {
                        int i_493_ = is_489_[i_488_];
                        DisplayModeManagerContainer58.aClass170_10209.method1306((byte) -78, intStack[--intStackPointer], i_493_);
                    } else if (i_490_ == 3) stringStack[stringStackPointer++] = (class348_sub42_sub19.aStringArray9692[i_488_]);
                    else if (i_490_ == 6) i_488_ += is_489_[i_488_];
                    else if (i_490_ == 7) {
                        intStackPointer -= 2;
                        if (intStack[intStackPointer] != intStack[intStackPointer + 1]) i_488_ += is_489_[i_488_];
                    } else if (i_490_ == 8) {
                        intStackPointer -= 2;
                        if (intStack[intStackPointer] == intStack[intStackPointer + 1]) i_488_ += is_489_[i_488_];
                    } else if (i_490_ == 9) {
                        intStackPointer -= 2;
                        if (intStack[intStackPointer] < intStack[intStackPointer + 1]) i_488_ += is_489_[i_488_];
                    } else if (i_490_ == 10) {
                        intStackPointer -= 2;
                        if (intStack[intStackPointer] > intStack[intStackPointer + 1]) i_488_ += is_489_[i_488_];
                    } else if (i_490_ == 21) {
                        if (callFramePointer == 0) return;
                        Component357 class184 = callFrames[--callFramePointer];
                        class348_sub42_sub19 = class184.aClass348_Sub42_Sub19_2474;
                        is = (class348_sub42_sub19.anIntArray9696);
                        is_489_ = (class348_sub42_sub19.anIntArray9694);
                        i_488_ = class184.anInt2477;
                        anIntArray1164 = class184.anIntArray2468;
                        aStringArray1155 = class184.aStringArray2473;
                    } else if (i_490_ == 25) {
                        int i_494_ = is_489_[i_488_];
                        intStack[intStackPointer++] = DisplayModeManagerContainer58.aClass170_10209.method62(i_494_, -65536);
                    } else if (i_490_ == 27) {
                        int i_495_ = is_489_[i_488_];
                        DisplayModeManagerContainer58.aClass170_10209.method1307(i_495_, -1, intStack[--intStackPointer]);
                    } else if (i_490_ == 31) {
                        intStackPointer -= 2;
                        if (intStack[intStackPointer] <= intStack[intStackPointer + 1]) i_488_ += is_489_[i_488_];
                    } else if (i_490_ == 32) {
                        intStackPointer -= 2;
                        if (intStack[intStackPointer] >= intStack[intStackPointer + 1]) i_488_ += is_489_[i_488_];
                    } else if (i_490_ == 33) intStack[intStackPointer++] = anIntArray1164[is_489_[i_488_]];
                    else if (i_490_ == 34) anIntArray1164[is_489_[i_488_]] = intStack[--intStackPointer];
                    else if (i_490_ == 35) stringStack[stringStackPointer++] = aStringArray1155[is_489_[i_488_]];
                    else if (i_490_ == 36) aStringArray1155[is_489_[i_488_]] = stringStack[--stringStackPointer];
                    else if (i_490_ == 37) {
                        int i_496_ = is_489_[i_488_];
                        stringStackPointer -= i_496_;
                        String string = LoadingManager.concatStrings(true, i_496_, stringStack, stringStackPointer);
                        stringStack[stringStackPointer++] = string;
                    } else if (i_490_ == 38) intStackPointer--;
                    else if (i_490_ == 39) stringStackPointer--;
                    else if (i_490_ == 40) {
                        int i_497_ = is_489_[i_488_];
                        HashNodeSub19 class348_sub42_sub19_498_ = ShaderCompiler.method2609(-114, i_497_);
                        if (class348_sub42_sub19_498_ == null) throw new RuntimeException();
                        int[] is_499_ = new int[class348_sub42_sub19_498_.anInt9688];
                        String[] strings = (new String
                                [class348_sub42_sub19_498_.anInt9689]);
                        for (int i_500_ = 0; i_500_ < class348_sub42_sub19_498_.anInt9697; i_500_++)
                            is_499_[i_500_] = (intStack[intStackPointer - (class348_sub42_sub19_498_.anInt9697) + i_500_]);
                        for (int i_501_ = 0; i_501_ < class348_sub42_sub19_498_.anInt9695; i_501_++)
                            strings[i_501_] = (stringStack[stringStackPointer - (class348_sub42_sub19_498_.anInt9695) + i_501_]);
                        intStackPointer -= class348_sub42_sub19_498_.anInt9697;
                        stringStackPointer -= class348_sub42_sub19_498_.anInt9695;
                        Component357 class184 = new Component357();
                        class184.aClass348_Sub42_Sub19_2474 = class348_sub42_sub19;
                        class184.anInt2477 = i_488_;
                        class184.anIntArray2468 = anIntArray1164;
                        class184.aStringArray2473 = aStringArray1155;
                        if (callFramePointer >= callFrames.length) throw new RuntimeException();
                        callFrames[callFramePointer++] = class184;
                        class348_sub42_sub19 = class348_sub42_sub19_498_;
                        is = (class348_sub42_sub19.anIntArray9696);
                        is_489_ = (class348_sub42_sub19.anIntArray9694);
                        i_488_ = -1;
                        anIntArray1164 = is_499_;
                        aStringArray1155 = strings;
                    } else if (i_490_ == 42) intStack[intStackPointer++] = DisplayModeManagerContainer123.anIntArray1303[is_489_[i_488_]];
                    else if (i_490_ == 43) {
                        int i_502_ = is_489_[i_488_];
                        DisplayModeManagerContainer123.anIntArray1303[i_502_] = intStack[--intStackPointer];
                        Component228.method1647(-128, i_502_);
                        Component357.aBoolean2469 |= WaterShaderProgram.aBooleanArray6270[i_502_];
                    } else if (i_490_ == 44) {
                        int i_503_ = is_489_[i_488_] >> 16;
                        int i_504_ = is_489_[i_488_] & 0xffff;
                        int i_505_ = intStack[--intStackPointer];
                        if (i_505_ < 0 || i_505_ > 5000) throw new RuntimeException();
                        anIntArray1172[i_503_] = i_505_;
                        int i_506_ = -1;
                        if (i_504_ == 105) i_506_ = 0;
                        for (int i_507_ = 0; i_507_ < i_505_; i_507_++)
                            anIntArrayArray1161[i_503_][i_507_] = i_506_;
                    } else if (i_490_ == 45) {
                        int i_508_ = is_489_[i_488_];
                        int i_509_ = intStack[--intStackPointer];
                        if (i_509_ < 0 || i_509_ >= anIntArray1172[i_508_]) throw new RuntimeException();
                        intStack[intStackPointer++] = anIntArrayArray1161[i_508_][i_509_];
                    } else if (i_490_ == 46) {
                        int i_510_ = is_489_[i_488_];
                        intStackPointer -= 2;
                        int i_511_ = intStack[intStackPointer];
                        if (i_511_ < 0 || i_511_ >= anIntArray1172[i_510_]) throw new RuntimeException();
                        anIntArrayArray1161[i_510_][i_511_] = intStack[intStackPointer + 1];
                    } else if (i_490_ == 47) {
                        String string = GlFramebufferTexture.aStringArray8532[is_489_[i_488_]];
                        if (string == null) string = "null";
                        stringStack[stringStackPointer++] = string;
                    } else if (i_490_ == 48) {
                        int i_512_ = is_489_[i_488_];
                        GlFramebufferTexture.aStringArray8532[i_512_] = stringStack[--stringStackPointer];
                        DisplayModeInfo.method529(i_512_, true);
                    } else if (i_490_ == 51) {
                        LruCache class356 = (class348_sub42_sub19.aClass356Array9693[is_489_[i_488_]]);
                        NodeSub35 class348_sub35 = ((NodeSub35) class356.get(intStack[--intStackPointer], -6008));
                        if (class348_sub35 != null) i_488_ += class348_sub35.intValue;
                    } else if (i_490_ == 86) {
                        if (intStack[--intStackPointer] == 1) {
                            i_488_ += is_489_[i_488_];
                        }
                    }
                } else {
                    boolean bool;
                    bool = is_489_[i_488_] == 1;
                    if (i_490_ >= 100 && i_490_ < 5000) executeInterfaceCommand(i_490_, bool);
                    else {
                        if (i_490_ < 5000 || i_490_ >= 10000) break;
                        executeCommand(i_490_, bool);
                    }
                }
            }
            throw new IllegalStateException("Command: " + i_490_);
        } catch (Exception exception) {
            if (class348_sub42_sub19.aString9690 == null) {
                StringBuffer stringbuffer = new StringBuffer(30);
                stringbuffer.append("CS2: ").append(class348_sub42_sub19.key).append(" ");
                for (int i_514_ = callFramePointer - 1; i_514_ >= 0; i_514_--)
                    stringbuffer.append("v: ").append(callFrames[i_514_].aClass348_Sub42_Sub19_2474.key).append(" ");
                stringbuffer.append("op: ").append(i_490_);
                ClientErrorReporter.reportError(stringbuffer.toString(), exception, 15004);
            } else {
                DisplayModeManagerContainer213.method544(("Clientscript error in: " + class348_sub42_sub19.aString9690), false, 4);
                StringBuffer stringbuffer = new StringBuffer(30);
                stringbuffer.append("Clientscript error in: ").append(class348_sub42_sub19.aString9690).append("\n");
                for (int i_513_ = callFramePointer - 1; i_513_ >= 0; i_513_--)
                    stringbuffer.append("via: ").append(callFrames[i_513_].aClass348_Sub42_Sub19_2474.aString9690).append("\n");
                stringbuffer.append("Op: ").append(i_490_).append("\n");
                String string = exception.getMessage();
                if (string != null && string.length() > 0) stringbuffer.append("Message: ").append(string).append("\n");
                ClientErrorReporter.reportError(stringbuffer.toString(), exception, 15004);
                Applet_Sub1.printConsole(stringbuffer.toString(), 90);
            }
        }
    }

    /** Bind hook args from {@code class348_sub36} then {@link #execute}. */
    private static final void executeHook(NodeSub36 class348_sub36, int i) {
        Object[] objects = class348_sub36.anObjectArray6987;
        int i_515_ = ((Integer) objects[0]).intValue();
        HashNodeSub19 class348_sub42_sub19 = ShaderCompiler.method2609(-122, i_515_);
        if (class348_sub42_sub19 != null) {
            anIntArray1164 = (new int
                    [class348_sub42_sub19.anInt9688]);
            int i_516_ = 0;
            aStringArray1155 = (new String
                    [class348_sub42_sub19.anInt9689]);
            int i_517_ = 0;
            for (int i_518_ = 1; i_518_ < objects.length; i_518_++) {
                if (objects[i_518_] instanceof Integer) {
                    int i_519_ = ((Integer) objects[i_518_]).intValue();
                    if (i_519_ == -2147483647) i_519_ = class348_sub36.anInt6984;
                    if (i_519_ == -2147483646) i_519_ = class348_sub36.anInt6995;
                    if (i_519_ == -2147483645) i_519_ = ((class348_sub36.aClass46_6989 != null) ? class348_sub36.aClass46_6989.packedId : -1);
                    if (i_519_ == -2147483644) i_519_ = class348_sub36.anInt6986;
                    if (i_519_ == -2147483643) i_519_ = ((class348_sub36.aClass46_6989 != null) ? class348_sub36.aClass46_6989.childIndex : -1);
                    if (i_519_ == -2147483642) i_519_ = ((class348_sub36.aClass46_6983 != null) ? class348_sub36.aClass46_6983.packedId : -1);
                    if (i_519_ == -2147483641) i_519_ = ((class348_sub36.aClass46_6983 != null) ? class348_sub36.aClass46_6983.childIndex : -1);
                    if (i_519_ == -2147483640) i_519_ = class348_sub36.anInt6991;
                    if (i_519_ == -2147483639) i_519_ = class348_sub36.anInt6982;
                    anIntArray1164[i_516_++] = i_519_;
                } else if (objects[i_518_] instanceof String) {
                    String string = (String) objects[i_518_];
                    if (string.equals("event_opbase")) string = class348_sub36.aString6994;
                    aStringArray1155[i_517_++] = string;
                }
            }
            anInt1177 = class348_sub36.anInt6988;
            execute(class348_sub42_sub19, i);
        }
    }

    public static void shutdown() {
        anIntArray1164 = null;
        aStringArray1155 = null;
        anIntArray1172 = null;
        anIntArrayArray1161 = null;
        intStack = null;
        stringStack = null;
        callFrames = null;
        aClass46_1150 = null;
        aClass46_1169 = null;
        aClass43_1151 = null;
        aCalendar1160 = null;
        aStringArray1176 = null;
        anIntArray1175 = null;
        aClass60_1174 = null;
    }

    private static final void sendInterfaceToBack(int i) {
        DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, i);
        if (class46 != null) {
            int i_520_ = i >>> 16;
            DisplayModeManagerContainer57[] class46s = Component14.aClass46ArrayArray8584[i_520_];
            if (class46s == null) {
                DisplayModeManagerContainer57[] class46s_521_ = DefinitionSub33.openInterfaces[i_520_];
                int i_522_ = class46s_521_.length;
                class46s = Component14.aClass46ArrayArray8584[i_520_] = new DisplayModeManagerContainer57[i_522_];
                Component313.arraycopyObjects(class46s_521_, 0, class46s, 0, class46s_521_.length);
            }
            int i_523_;
            for (i_523_ = 0; i_523_ < class46s.length; i_523_++) {
                if (class46s[i_523_] == class46) break;
            }
            if (i_523_ < class46s.length) {
                Component313.arraycopyObjects(class46s, i_523_ + 1, class46s, i_523_, class46s.length - i_523_ - 1);
                class46s[class46s.length - 1] = class46;
            }
        }
    }

    static final void onAfterReset(int i, boolean bool) {
        /* empty */
    }

    static {
        callFrames = new Component357[50];
        aCalendar1160 = Calendar.getInstance();
        anIntArray1175 = new int[3];
        aStringArray1176 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        aClass60_1174 = new NodeCache(4);
        anInt1177 = 0;
    }
}
