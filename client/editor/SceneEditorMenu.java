/**
 * Right-click scene-editor actions on ground scenery while editor mode is on.
 * <p>
 * Injected after stock object rows in {@link ColoredText#method1823}. Handled
 * client-side in {@link ColoredTextBuilder#processMenuAction} — never sent.
 * Opcodes stay clear of DefaultClick (1900–05), WorldMapTeleport (1906),
 * Microbot (1907), JoystickAlias (1910–11).
 * <p>
 * Menu layout matches {@link WorldMapTeleport}: param0=localX, param1=localY,
 * identifier packs {@code objectId | rotation<<32 | plane<<40}.
 */
final class SceneEditorMenu {
    static final int OPCODE_MOVE = 1908;
    static final int OPCODE_REMOVE = 1909;
    static final int OPCODE_ROTATE = 1912;
    static final int OPCODE_NPC_REMOVE = 1913;

    private static final String COL = "<col=00e5ff>";
    private static final String COL_END = "</col>";
    private static final int[] OBJECT_OPCODES = {3, 4, 9, 59, 1007};

    private SceneEditorMenu() {
    }

    /**
     * Add Move / Remove / Rotate under the hovered scenery name.
     */
    static void inject(ObjectDefinition object, int localX, int localY, int plane, long packedId) {
        if (!SceneEditorHost.isEditorMode() || object == null) {
            return;
        }
        String name = object.aString884 != null ? object.aString884 : ("obj " + object.anInt941);
        String target = "<col=00ffff>" + name + COL_END;
        long identifier = pack(object.anInt941, decodeRotation(packedId), plane);
        // Menu rows are rendered in reverse insertion order; add Remove first
        // so it appears last in the visible context menu.
        addRow(target, localX, localY, OPCODE_REMOVE, identifier, COL + "Remove" + COL_END);
        addRow(target, localX, localY, OPCODE_ROTATE, identifier, COL + "Rotate" + COL_END);
        addRow(target, localX, localY, OPCODE_MOVE, identifier, COL + "Move" + COL_END);
    }

    /** Add Remove under a server-backed NPC while the scene editor is active. */
    static void injectNpc(Npc npc, int localX, int localY, int plane) {
        if (!SceneEditorHost.isEditorMode() || npc == null || npc.definition == null) {
            return;
        }
        NpcComposition composition = npc.definition;
        String name = composition.name != null ? composition.name : ("npc " + composition.id);
        String target = "<col=ff9040>" + name + COL_END;
        addRow(target, localX, localY, OPCODE_NPC_REMOVE, pack(composition.id, 0, plane),
                COL + "Remove" + COL_END);
    }

    private static void addRow(String target, int localX, int localY, int opcode, long identifier, String option) {
        DisplayModeManagerContainer368.addMenuEntry(
                false, target, localY, (byte) -93, false, localX, -1, true,
                opcode, 0L, option, identifier, -1);
    }

    /** @return true when the entry was a scene-editor op (do not send packet). */
    static boolean handleMenuAction(MenuEntry entry) {
        if (entry == null) {
            return false;
        }
        int op = entry.opcode >= 2000 ? entry.opcode - 2000 : entry.opcode;
        if (op != OPCODE_MOVE && op != OPCODE_REMOVE && op != OPCODE_ROTATE && op != OPCODE_NPC_REMOVE) {
            return false;
        }
        if (!SceneEditorHost.isEditorMode()) {
            SceneEditorHost.setEditorMode(true);
        }
        int objectId = unpackObjectId(entry.identifier);
        int rotation = unpackRotation(entry.identifier);
        int plane = unpackPlane(entry.identifier);
        int localX = entry.param0;
        int localY = entry.param1;
        int absX = localX + NodeBaseSub2.regionTileX;
        int absY = localY + Component330.regionTileY;
        System.out.println("scene-editor menu op=" + op
                + " obj=" + objectId + " @" + absX + "," + absY + "," + plane
                + " rot=" + rotation);
        try {
            if (op == OPCODE_NPC_REMOVE) {
                chat(SceneEditorHost.removeNpc(objectId, absX, absY, plane));
                return true;
            }
            if (op == OPCODE_MOVE) {
                SceneObject claimed = SceneEditorHost.claimAt(objectId, absX, absY, plane, rotation);
                SceneEditorUi.beginMove(claimed.id);
                chat("Move: click destinations repeatedly or use the arrow panel — Done to finish");
            } else if (op == OPCODE_REMOVE) {
                SceneObject owned = SceneEditorHost.findOwned(objectId, absX, absY, plane);
                if (owned != null) {
                    SceneEditorHost.editor().remove(owned.id);
                    SceneEditorUi.clearSelection();
                    SceneEditorHost.resync();
                    SceneEditorHost.persistQuiet();
                    chat("Removed: " + label(owned));
                } else {
                    // Claim then delete so autosave keeps it gone across apply.
                    SceneObject claimed = SceneEditorHost.claimAt(objectId, absX, absY, plane, rotation);
                    SceneEditorHost.editor().remove(claimed.id);
                    SceneEditorUi.clearSelection();
                    SceneEditorHost.resync();
                    SceneEditorHost.persistQuiet();
                    chat("Removed: #" + objectId + " @ " + absX + "," + absY);
                }
            } else {
                SceneObject claimed = SceneEditorHost.claimAt(objectId, absX, absY, plane, rotation);
                int next = (claimed.rotation + 1) & 3;
                SceneEditorHost.editor().rotate(claimed.id, next);
                SceneEditorUi.select(claimed.id);
                SceneEditorHost.resync();
                SceneEditorHost.persistQuiet();
                chat("Rotate: " + label(claimed) + " → " + next);
            }
        } catch (Throwable t) {
            System.out.println("scene-editor menu: " + t);
            t.printStackTrace();
            chat("Editor failed: " + t.getMessage());
        }
        return true;
    }

    /**
     * Object menu tip under cursor (opcodes 3/4/9/59/1007), or null.
     * Used by Ctrl+click claim without opening the right-click menu.
     */
    static MenuEntry findObjectTip() {
        MenuEntry tip = Component192.menuTip;
        if (tip != null && isObjectOpcode(tip.opcode)) {
            return tip;
        }
        try {
            for (MenuEntry e = (MenuEntry) DefinitionSub4.menuEntries.sentinel.previous;
                 e != null && e != DefinitionSub4.menuEntries.sentinel;
                 e = (MenuEntry) e.previous) {
                if (isObjectOpcode(e.opcode)) {
                    return e;
                }
            }
        } catch (Throwable ignored) {
            /* empty */
        }
        return null;
    }

    /** Decode LocType id from a stock object menu identifier. */
    static int objectIdOf(MenuEntry entry) {
        if (entry == null) {
            return -1;
        }
        int op = entry.opcode >= 2000 ? entry.opcode - 2000 : entry.opcode;
        if (op == 1001) {
            return (int) entry.identifier;
        }
        int high = (int) (entry.identifier >>> 32);
        return high != 0 ? high : (int) entry.identifier;
    }

    static int decodeRotation(long packedId) {
        return (int) ((packedId >>> 14) & 0x3f) & 3;
    }

    /** objectId in low 32, rotation in 32..33, plane in 40..41. */
    private static long pack(int objectId, int rotation, int plane) {
        return (objectId & 0xffffffffL)
                | (((long) (rotation & 3)) << 32)
                | (((long) (plane & 3)) << 40);
    }

    private static int unpackObjectId(long id) {
        return (int) id;
    }

    private static int unpackRotation(long id) {
        return (int) ((id >>> 32) & 3L);
    }

    private static int unpackPlane(long id) {
        return (int) ((id >>> 40) & 3L);
    }

    private static boolean isObjectOpcode(int opcode) {
        int op = opcode >= 2000 ? opcode - 2000 : opcode;
        for (int i = 0; i < OBJECT_OPCODES.length; i++) {
            if (OBJECT_OPCODES[i] == op) {
                return true;
            }
        }
        return false;
    }

    private static String label(SceneObject o) {
        String name = SceneObjectAdapter.nameOf(o.objectId);
        return (name != null ? name : ("#" + o.objectId)) + " id=" + o.id;
    }

    private static void chat(String msg) {
        try {
            ShaderProgramSub2.addChatMessage("", 5, (byte) -100, 0,
                    COL + "[Editor] " + msg + COL_END, "", "");
        } catch (Throwable ignored) {
            /* chat may be unavailable */
        }
    }
}
