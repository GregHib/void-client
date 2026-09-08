/* PauseTimer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class38` (JODE-obfuscated).
 * Pause timer. Standalone helper that performs the 'Pausing for N seconds...' sleep/retry delay for operations that must back off before continuing.
 */

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

final class PauseTimer {
    static int anInt497;
    int anInt498;
    int anInt499;
    static int anInt500;
    int anInt501 = 8;
    int anInt502;
    int anInt503 = 16777215;
    int anInt504;
    static int anInt505;
    static int anInt506 = -1;
    boolean aBoolean507;
    int anInt508;
    static int anInt509;
    static boolean aBoolean510 = false;
    static int anInt511;
    static int anInt512;
    static int anInt513 = 100;

    static final Component150 method360(byte i, int i_0_) {
        anInt505++;
        if (i != -57) processDevConsoleInput(97);
        Component150[] class227s = TheoraVideoPlayer.method841(i + -70);
        for (int i_1_ = 0; class227s.length > i_1_; i_1_++) {
            Component150 class227 = class227s[i_1_];
            if (class227.anInt2970 == i_0_) return class227;
        }
        return null;
    }

    private final void method361(int i, Buffer class348_sub49, int i_2_) {
        if (i != -6617) processDevConsoleInput(95);
        anInt497++;
        if (i_2_ == 1) this.anInt501 = class348_sub49.readUnsignedShort(842397944);
        else if (i_2_ == 2) this.aBoolean507 = true;
        else if (i_2_ == 3) {
            this.anInt499 = class348_sub49.readShort(13638);
            this.anInt502 = class348_sub49.readShort(13638);
            this.anInt508 = class348_sub49.readShort(13638);
        } else if (i_2_ == 4) this.anInt498 = class348_sub49.readUnsignedByte(255);
        else if (i_2_ == 5) this.anInt504 = class348_sub49.readUnsignedShort(842397944);
        else if (i_2_ == 6) this.anInt503 = class348_sub49.readMedium(-1);
    }

    static final void method362(int i) {
        anInt509++;
        NodeSub27 class348_sub27 = ((NodeSub27) HashNodeSub20.aClass262_9711.first(4));
        int i_3_ = -45 % ((i - -34) / 47);
        for (/**/; class348_sub27 != null; class348_sub27 = (NodeSub27) HashNodeSub20.aClass262_9711.next((byte) 81)) {
            if (class348_sub27.anInt6893 > 0) class348_sub27.anInt6893--;
            if (class348_sub27.anInt6893 != 0) {
                if (class348_sub27.anInt6894 > 0) class348_sub27.anInt6894--;
                if (class348_sub27.anInt6894 == 0 && class348_sub27.anInt6905 >= 1 && class348_sub27.anInt6896 >= 1 && (class348_sub27.anInt6905 <= -2 + AbstractShaderSub4.anInt7319) && (class348_sub27.anInt6896 <= -2 + ParametricDefinition.anInt9109) && (class348_sub27.anInt6907 < 0 || (Component2.method195(class348_sub27.anInt6895, false, class348_sub27.anInt6907)))) {
                    SceneManager.method1591(class348_sub27.anInt6905, 70, class348_sub27.anInt6904, -1, class348_sub27.anInt6907, class348_sub27.anInt6895, class348_sub27.anInt6896, class348_sub27.anInt6900, class348_sub27.anInt6899);
                    class348_sub27.anInt6894 = -1;
                    if ((class348_sub27.anInt6907 != class348_sub27.anInt6902) || class348_sub27.anInt6902 != -1) {
                        if ((class348_sub27.anInt6907 == class348_sub27.anInt6902) && (class348_sub27.anInt6892 == class348_sub27.anInt6900) && (class348_sub27.anInt6895 == (class348_sub27.anInt6903))) class348_sub27.unlink((byte) 75);
                    } else class348_sub27.unlink((byte) 86);
                }
            } else if (class348_sub27.anInt6902 < 0 || (Component2.method195(class348_sub27.anInt6903, false, class348_sub27.anInt6902))) {
                SceneManager.method1591(class348_sub27.anInt6905, 112, class348_sub27.anInt6904, -1, class348_sub27.anInt6902, class348_sub27.anInt6903, class348_sub27.anInt6896, class348_sub27.anInt6892, class348_sub27.anInt6899);
                class348_sub27.unlink((byte) 49);
            }
        }
    }

    private static int HISTORY_INDEX = -1;

    /**
     * Keyboard / wheel input while the developer console is open.
     * Handles history recall (up/down), Enter submit, caret edits, clipboard,
     * and mouse-wheel scroll of {@link Component94#consoleScroll}.
     * Called from the game loop only when {@link StringCache#devConsoleOpen}.
     */
    static final void processDevConsoleInput(int i) {
        if (Component39.consoleFadeAlpha < 102) Component39.consoleFadeAlpha += 6;
        anInt512++;
        if (Component221.anInt1794 != -1 && (Component100.aLong8694 < Component240.currentTimeMillis(-127))) {
            for (int i_4_ = Component221.anInt1794; i_4_ < Cp1252Decoder.aStringArray5223.length; i_4_++) {
                if (Cp1252Decoder.aStringArray5223[i_4_].startsWith("pause")) {
                    int i_5_ = 5;
                    try {
                        i_5_ = Integer.parseInt(Cp1252Decoder.aStringArray5223[i_4_].substring(6));
                    } catch (Exception exception) {
                        /* empty */
                    }
                    Applet_Sub1.printConsole("Pausing for " + i_5_ + " seconds...", 58);
                    Component221.anInt1794 = 1 + i_4_;
                    Component100.aLong8694 = (long) (1000 * i_5_) + Component240.currentTimeMillis(-97);
                    return;
                } else {
                    Component126.consoleInput = Cp1252Decoder.aStringArray5223[i_4_];
                    Component210.submitConsoleLine(false, 0);
                }
            }
            Component221.anInt1794 = -1;
        }
        // Wheel toward user (positive) → newer lines (lower consoleScroll); away → older.
        if (Component122.mouseWheelDelta != 0) {
            Component94.consoleScroll -= Component122.mouseWheelDelta * 5;
            if (Component94.consoleScroll >= Component14.consoleLineCount) Component94.consoleScroll = -1 + Component14.consoleLineCount;
            Component122.mouseWheelDelta = 0;
            if (Component94.consoleScroll < 0) Component94.consoleScroll = 0;
        }
        if (i >= 124) {
            for (int i_6_ = 0; (HashNodeSub19.anInt9699 > i_6_); i_6_++) {
                Interface6 interface6 = DefinitionGroup.anInterface6Array9534[i_6_];
                int i_7_ = interface6.getKeyCode(false);
                char c = interface6.getKeyChar((byte) 46);
                int i_8_ = interface6.getModifiers(-7616);
                if (i_7_ == 98) {
                    for (int index = HISTORY_INDEX; index < ArbShaderProgram.consoleLines.length; index++) {
                        if (index == -1) {
                            continue;
                        }
                        String line = ArbShaderProgram.consoleLines[index];
                        if (line.isEmpty()) {
                            continue;
                        }
                        String[] parts = line.split(": ");
                        if (parts.length == 2 && parts[1].startsWith("-->")) {
                            if (index > HISTORY_INDEX) {
                                HISTORY_INDEX = index;
                                // Strip item "(name)" decoration so the prompt stays editable/sendable.
                                Component126.consoleInput = Component210.stripItemConsoleEcho(parts[1].substring(4));
                                NodeSub38.consoleCursor = Component126.consoleInput.length();
                                break;
                            }
                        }
                    }
                } else if (i_7_ == 99) {
                    boolean found = false;
                    for (int index = HISTORY_INDEX - 1; index >= 0; index--) {
                        String line = ArbShaderProgram.consoleLines[index];
                        if (line.isEmpty()) {
                            continue;
                        }
                        String[] parts = line.split(": ");
                        if (parts.length == 2 && parts[1].startsWith("-->")) {
                            HISTORY_INDEX = index;
                            // Strip item "(name)" decoration so the prompt stays editable/sendable.
                            Component126.consoleInput = Component210.stripItemConsoleEcho(parts[1].substring(4));
                            NodeSub38.consoleCursor = Component126.consoleInput.length();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        Component126.consoleInput = "";
                        NodeSub38.consoleCursor = 0;
                    }
                } else if (i_7_ == 84) {
                    Component210.submitConsoleLine(false, 0);
                    HISTORY_INDEX = -1;
                } else if (i_7_ != 80) {
                    if (i_7_ == 66 && (0x4 & i_8_) != 0) {
                        if (DefinitionSub27.aClipboard9357 != null) {
                            String string = "";
                            for (int i_9_ = -1 + (ArbShaderProgram.consoleLines).length; i_9_ >= 0; i_9_--) {
                                if ((ArbShaderProgram.consoleLines[i_9_] != null) && ArbShaderProgram.consoleLines[i_9_].length() > 0) string += (ArbShaderProgram.consoleLines[i_9_]) + '\n';
                            }
                            DefinitionSub27.aClipboard9357.setContents(new StringSelection(string), null);
                        }
                    } else if (i_7_ != 67 || (0x4 & i_8_) == 0) {
                        if (i_7_ != 85 || NodeSub38.consoleCursor <= 0) {
                            if (i_7_ == 101 && (NodeSub38.consoleCursor < Component126.consoleInput.length())){
                                if ((0x4 & i_8_) == 0) {
                                    Component126.consoleInput = ((Component126.consoleInput.substring(0, NodeSub38.consoleCursor)) + (Component126.consoleInput.substring(NodeSub38.consoleCursor - -1)));
                                } else {
                                    int index = Component126.consoleInput.indexOf(' ', NodeSub38.consoleCursor + 1);
                                    if (index == -1) {
                                        index = Component126.consoleInput.length();
                                    }
                                    Component126.consoleInput = Component126.consoleInput.substring(0, NodeSub38.consoleCursor) + Component126.consoleInput.substring(index);
                                }
                            }
                            else if (i_7_ != 96 || NodeSub38.consoleCursor <= 0) {
                                if (i_7_ == 97 && (Component126.consoleInput.length() > NodeSub38.consoleCursor)){
                                    if ((0x4 & i_8_) == 0) {
                                        NodeSub38.consoleCursor++;
                                    } else {
                                        int result = Component126.consoleInput.indexOf(' ', Math.min(NodeSub38.consoleCursor + 1, Component126.consoleInput.length() - 1));
                                        NodeSub38.consoleCursor = result == -1 ? Component126.consoleInput.length() : result + 1;
                                    }
                                }
                                else if (i_7_ == 102) NodeSub38.consoleCursor = 0;
                                else if (i_7_ == 103) NodeSub38.consoleCursor = Component126.consoleInput.length();
                                else if (i_7_ != 104 || (Component92.consoleHistoryDepth >= (ArbShaderProgram.consoleLines).length)) {
                                    if (i_7_ == 105 && Component92.consoleHistoryDepth > 0) {
                                        Component92.consoleHistoryDepth--;
                                        Shader.method159(-615751774);
                                        NodeSub38.consoleCursor = Component126.consoleInput.length();
                                    } else if (Npc.method2446(c, (byte) 105) || c == 92 || c == 47 || c == 46 || c == 58 || c == 44 || c == 32 || c == 95 || c == 45 || c == 43 || c == 91 || c == 93) {
                                        Component126.consoleInput = ((Component126.consoleInput.substring(0, NodeSub38.consoleCursor)) + DefinitionGroup.anInterface6Array9534[i_6_].getKeyChar((byte) 23) + (Component126.consoleInput.substring(NodeSub38.consoleCursor)));
                                        NodeSub38.consoleCursor++;
                                    }
                                } else {
                                    Component92.consoleHistoryDepth++;
                                    Shader.method159(-615751774);
                                    NodeSub38.consoleCursor = Component126.consoleInput.length();
                                }
                            } else {
                                if ((0x4 & i_8_) == 0) {
                                    NodeSub38.consoleCursor--;
                                } else {
                                    NodeSub38.consoleCursor = Math.max(Component126.consoleInput.lastIndexOf(' ', NodeSub38.consoleCursor - 2) + 1, 0);
                                }
                            }
                        } else {
                            if ((0x4 & i_8_) == 0) {
                                Component126.consoleInput = ((Component126.consoleInput.substring(0, NodeSub38.consoleCursor - 1)) + Component126.consoleInput.substring(NodeSub38.consoleCursor));
                                NodeSub38.consoleCursor--;
                            } else {
                                int index = Component126.consoleInput.trim().lastIndexOf(' ', NodeSub38.consoleCursor);
                                index++;
                                Component126.consoleInput = Component126.consoleInput.substring(0, index);
                                NodeSub38.consoleCursor = index;
                            }
                        }
                    } else if (DefinitionSub27.aClipboard9357 != null) {
                        Transferable transferable = DefinitionSub27.aClipboard9357.getContents(null);
                        if (transferable != null) {
                            try {
                                String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
                                if (string != null) {
                                    String[] strings = DefinitionSub23.splitByChar('\n', true, string);
                                    PauseHandler.runConsoleCommands(0, strings);
                                }
                            } catch (Exception exception) {
                                /* empty */
                            }
                        }
                    }
                } else Component210.submitConsoleLine(true, 0);
            }
            HashNodeSub19.anInt9699 = 0;
            Component193.anInt3246 = 0;
            Component160.method3466(89);
        }
    }

    final void method364(Buffer class348_sub49, byte i) {
        anInt511++;
        if (i >= 22) {
            for (; ; ) {
                int i_10_ = class348_sub49.readUnsignedByte(255);
                if (i_10_ == 0) break;
                method361(-6617, class348_sub49, i_10_);
            }
        }
    }

    static final void method365(RenderableObject class318_sub1, NodeSub1[] class348_sub1s) {
        if (DisplayModeManagerContainer58.aBoolean10221) {
            int i = class318_sub1.method2384(class348_sub1s, 49);
            JaclibLoader.toolkit.method3642(i, class348_sub1s);
        }
        if (Component9.aSArray4142 == ShaderSub1.aSArray5191) {
            boolean bool = false;
            boolean bool_11_ = false;
            int i;
            int i_12_;
            if (class318_sub1 instanceof Component327) {
                i = (((Component327) class318_sub1).aShort8743);
                i_12_ = ((Component327) class318_sub1).aShort8750;
            } else {
                i = (class318_sub1.x >> Component149.anInt4459);
                i_12_ = (class318_sub1.y >> Component149.anInt4459);
            }
            JaclibLoader.toolkit.EA((NodeSub1Sub1.aSArray8801[0].getInterpolatedHeight(class318_sub1.x, class318_sub1.y, (byte) -118)), WaterShaderSub8.method3547(i, i_12_), Component203.method2483(i, i_12_), HelveticaFont.method1457(i, i_12_));
        }
        RenderableSub4 class318_sub4 = class318_sub1.method2386(1, JaclibLoader.toolkit);
        if (class318_sub4 != null) {
            if (class318_sub1.aBoolean6391) {
                RenderableSub3[] class318_sub3s = class318_sub4.aClass318_Sub3Array6414;
                for (int i = 0; i < class318_sub3s.length; i++) {
                    RenderableSub3 class318_sub3 = class318_sub3s[i];
                    if (class318_sub3.aBoolean6401) Component103.method2663(-5590, (class318_sub3.anInt6405 - class318_sub3.anInt6403), (class318_sub3.anInt6406 + class318_sub3.anInt6403), (class318_sub3.anInt6402 - class318_sub3.anInt6403), (class318_sub3.anInt6404 + class318_sub3.anInt6403));
                }
            }
            if (class318_sub4.aBoolean6409) {
                class318_sub4.aClass318_Sub1_6410 = class318_sub1;
                if (DefinitionSub5.aBoolean9121) {
                    synchronized (DisplayModeManagerContainer5.aClass76_1208) {
                        DisplayModeManagerContainer5.aClass76_1208.method774(class318_sub4, 18802);
                    }
                } else DisplayModeManagerContainer5.aClass76_1208.method774(class318_sub4, 18802);
            } else Component350.method560(class318_sub4, 18);
        }
    }

    public PauseTimer() {
        /* empty */
    }
}
