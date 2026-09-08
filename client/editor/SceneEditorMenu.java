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
    static final int OPCODE_DUPLICATE = 1914;

    private static final String COL = "<col=00e5ff>";
    private static final String COL_END = "</col>";
    private static final int[] OBJECT_OPCODES = {3, 4, 9, 59, 1007};

    private SceneEditorMenu() {
    }

    /**
     * Add Move / Duplicate / Remove / Rotate under the hovered scenery name.
     */
    static void inject(ObjectDefinition object, int objectId, int localX, int localY, int plane, long packedId) {
        if (!SceneEditorHost.isEditorMode() || objectId < 0) {
            return;
        }
        if (hasEditorEntry(objectId, localX, localY)) {
            return;
        }
        String name = object == null ? null : object.aString884;
        if (name == null || name.length() == 0 || "null".equalsIgnoreCase(name)) {
            name = "Unnamed object";
        }
        String target = "<col=00ffff>" + name + COL_END;
        long identifier = pack(objectId, decodeRotation(packedId), plane);


        // Menu rows are rendered in reverse insertion order; add Remove first
        // so it appears last in the visible context menu.
        addRow(target, localX, localY, OPCODE_REMOVE, identifier, COL + "Remove" + COL_END);
        addRow(target, localX, localY, OPCODE_ROTATE, identifier, COL + "Rotate" + COL_END);
        addRow(target, localX, localY, OPCODE_DUPLICATE, identifier, COL + "Duplicate" + COL_END);
        addRow(target, localX, localY, OPCODE_MOVE, identifier, COL + "Move" + COL_END);
    }

    /** Add editor rows from the walk tile when renderable hit-testing misses a local object. */
    static void injectFallbackAtWalkTile() {
        if (!SceneEditorHost.isEditorMode()) {
            return;
        }
        try {
            MenuEntry walk = null;
            for (Node node = DefinitionSub4.menuEntries.sentinel.previous;
                 node != null && node != DefinitionSub4.menuEntries.sentinel;
                 node = node.previous) {
                if (!(node instanceof MenuEntry)) {
                    continue;
                }
                MenuEntry entry = (MenuEntry) node;
                int op = entry.opcode >= 2000 ? entry.opcode - 2000 : entry.opcode;
                if (op == 19) {
                    walk = entry;
                    break;
                }
            }
            if (walk == null || !SceneObjectAdapter.inSceneBounds(walk.param0, walk.param1)) {
                return;
            }
            int plane = MicrobotWidgets.localPlane();
            int absX = walk.param0 + NodeBaseSub2.regionTileX;
            int absY = walk.param1 + Component330.regionTileY;
            SceneObject object = SceneEditorHost.findOwned(-1, absX, absY, plane);
            if (object == null || hasEditorEntry(object.objectId, walk.param0, walk.param1)) {
                return;
            }
            ObjectDefinition definition = null;
            try {
                definition = GradientPreset.aClass263_9195.getObjectDefinition(0, object.objectId);
                if (definition != null && definition.anIntArray945 != null) {
                    definition = definition.getTransformedDefinition(
                            DisplayModeManagerContainer58.aClass170_10209, (byte) 47);
                }
            } catch (Throwable ignored) {
                // The fallback still has the authoritative object ID from the editor model.
            }
            inject(definition, object.objectId, walk.param0, walk.param1, plane,
                    pack(object.objectId, object.rotation, plane));
        } catch (Throwable ignored) {
            // Menu construction must remain safe when the scene is changing regions.
        }
    }

    private static boolean hasEditorEntry(int objectId, int localX, int localY) {
        for (Node node = DefinitionSub4.menuEntries.sentinel.previous;
             node != null && node != DefinitionSub4.menuEntries.sentinel;
             node = node.previous) {
            if (!(node instanceof MenuEntry)) {
                continue;
            }
            MenuEntry entry = (MenuEntry) node;
            int op = entry.opcode >= 2000 ? entry.opcode - 2000 : entry.opcode;
            if (isEditorOpcode(op) && entry.param0 == localX && entry.param1 == localY
                    && unpackObjectId(entry.identifier) == objectId) {
                return true;
            }
        }
        return false;
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
        if (op != OPCODE_MOVE && op != OPCODE_REMOVE && op != OPCODE_ROTATE
                && op != OPCODE_DUPLICATE && op != OPCODE_NPC_REMOVE) {
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
            } else if (op == OPCODE_DUPLICATE) {
                SceneObject duplicate = SceneEditorHost.addAt(
                        objectId, SceneEditorHost.adjacentX(objectId, absX, rotation), absY, plane);
                SceneEditorHost.resync();
                SceneEditorHost.persistQuiet();
                SceneEditorUi.beginMove(duplicate.id);
                chat("Duplicated: " + label(duplicate) + " — Move: click a destination or use the arrow panel");
            } else if (op == OPCODE_REMOVE) {
                SceneObject owned = SceneEditorHost.findOwned(objectId, absX, absY, plane);
                if (owned != null) {
                    SceneObjectAdapter.remove(owned);
                    SceneEditorHost.editor().remove(owned.id);
                    SceneEditorUi.clearSelection();
                    SceneEditorHost.resync();
                    SceneEditorHost.persistQuiet();
                    chat("Removed: " + label(owned));
                } else {
                    // Claim then delete so autosave keeps it gone across apply.
                    SceneObject claimed = SceneEditorHost.claimAt(objectId, absX, absY, plane, rotation);
                    SceneObjectAdapter.remove(claimed);
                    SceneEditorHost.editor().remove(claimed.id);
                    SceneEditorUi.clearSelection();
                    SceneEditorHost.resync();
                    SceneEditorHost.persistQuiet();
                    chat("Removed: #" + objectId + " @ " + absX + "," + absY);
                }
                chat("Removed locally — click Save to publish.");
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
            for (Node node = DefinitionSub4.menuEntries.sentinel.previous;
                 node != null && node != DefinitionSub4.menuEntries.sentinel;
                 node = node.previous) {
                if (node instanceof MenuEntry && isObjectOpcode(((MenuEntry) node).opcode)) {
                    return (MenuEntry) node;
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
        // Location UIDs store type at bits 14..19 and orientation at 20..21.
        return (int) ((packedId >>> 20) & 3L);
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

    private static boolean isEditorOpcode(int opcode) {
        return opcode == OPCODE_MOVE || opcode == OPCODE_REMOVE || opcode == OPCODE_ROTATE
                || opcode == OPCODE_DUPLICATE || opcode == OPCODE_NPC_REMOVE;
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
