import java.io.IOException;

/**
 * Process-wide scene editor host: model ({@link SceneEditor}) + live adapter.
 * <p>
 * Console / Microbot call this — never talk to {@link SceneManager} directly.
 * All mutations that should appear in-world call {@link #resync()} afterward.
 * <p>
 * Placed objects stay in the live scene when editor mode is turned <b>off</b>;
 * only {@code ed clear} removes them. {@link #tick()} re-applies after region
 * loads and restores {@code ~/void-scenes/autosave.json} on login.
 */
final class SceneEditorHost {
    private static SceneEditor editor;
    private static boolean bootstrapped;
    private static int lastRegionX = Integer.MIN_VALUE;
    private static int lastRegionY = Integer.MIN_VALUE;

    private SceneEditorHost() {
    }

    static SceneEditor editor() {
        if (editor == null) {
            editor = new SceneEditor(new SceneStore());
        }
        return editor;
    }

    static boolean isEditorMode() {
        return editor().mode() == SceneEditor.Mode.EDITOR;
    }

    static void setEditorMode(boolean on) {
        editor().setMode(on ? SceneEditor.Mode.EDITOR : SceneEditor.Mode.GAME);
        if (!on) {
            // Keep live placements — editor UI is only a tool, not a visibility gate.
            persistQuiet();
            SceneEditorUi.onEditorDisabled();
        } else {
            resync();
            SceneEditorUi.onEditorEnabled();
        }
    }

    /**
     * Called every frame while logged in (from the client draw/input loop).
     * Restores autosave once per login and re-places objects after region shifts.
     */
    static void tick() {
        if (!Microbot.isLoggedIn()) {
            bootstrapped = false;
            lastRegionX = Integer.MIN_VALUE;
            lastRegionY = Integer.MIN_VALUE;
            return;
        }
        if (!bootstrapped) {
            bootstrapped = true;
            tryRestoreAutosave();
            if (!editor().scene().objects().isEmpty()) {
                resync();
            }
        }
        int rx = NodeBaseSub2.regionTileX;
        int ry = Component330.regionTileY;
        if (rx == lastRegionX && ry == lastRegionY) {
            return;
        }
        boolean first = lastRegionX == Integer.MIN_VALUE;
        lastRegionX = rx;
        lastRegionY = ry;
        if (first || editor().scene().objects().isEmpty()) {
            return;
        }
        try {
            int live = resync();
            System.out.println("scene-editor region apply live=" + live);
        } catch (Throwable t) {
            System.out.println("scene-editor region apply: " + t.getMessage());
        }
    }

    /** Re-place every object from the current model into the live scene. */
    static int resync() {
        return LiveSceneBridge.resync(editor().scene());
    }

    /** Best-effort write of {@code autosave} so logout / editor-off keeps work. */
    static void persistQuiet() {
        try {
            editor().autosave();
        } catch (Throwable t) {
            System.out.println("scene-editor autosave: " + t.getMessage());
        }
    }

    private static void tryRestoreAutosave() {
        try {
            SceneStore store = new SceneStore();
            if (!store.file("autosave").isFile()) {
                return;
            }
            // Only restore when the in-memory scene is still empty (fresh process).
            if (!editor().scene().objects().isEmpty()) {
                return;
            }
            editor().load("autosave");
            System.out.println("scene-editor restored autosave objects="
                    + editor().scene().objects().size());
        } catch (Throwable t) {
            System.out.println("scene-editor restore: " + t.getMessage());
        }
    }

    /**
     * Take ownership of a world (or already-edited) scenery tile so the local
     * editor can move / rotate / remove it. If nothing in the model matches,
     * removes the stock scenery at that tile and adds a new {@link SceneObject}.
     */
    static SceneObject claimAt(int objectId, int absX, int absY, int plane, int rotation) {
        SceneObject existing = findOwned(objectId, absX, absY, plane);
        if (existing != null) {
            return existing;
        }
        // Drop the stock instance from the live tile graph first so we don't
        // end up with two copies after resync places the claimed one.
        SceneObject probe = new SceneObject(0, objectId, absX, absY, 0, plane);
        probe.rotation = rotation & 3;
        SceneObjectAdapter.remove(probe);
        SceneObject added = editor().claimStock(objectId, absX, absY, 0, plane, rotation,
                SceneObjectAdapter.TYPE_SCENERY);
        resync();
        persistQuiet();
        return added;
    }

    /** First owned object at tile matching LocType, or any owned object on that tile. */
    static SceneObject findOwned(int objectId, int absX, int absY, int plane) {
        SceneObject any = null;
        for (SceneObject o : editor().scene().objects()) {
            if (o.plane != plane || o.x != absX || o.y != absY) {
                continue;
            }
            if (o.objectId == objectId) {
                return o;
            }
            if (any == null) {
                any = o;
            }
        }
        return any;
    }

    /**
     * Fractional x/y offsets are applied after the stock placement.
     */
    static String spawnAtPlayer(int objectId) throws IOException {
        if (Component72.localPlayer == null) {
            throw new IllegalStateException("not logged in");
        }
        int x = MicrobotWidgets.localAbsX();
        int y = MicrobotWidgets.localAbsY();
        int plane = MicrobotWidgets.localPlane();
        SceneObject added = editor().add(objectId, x, y, 0, plane);
        int placed = resync();
        String name = SceneObjectAdapter.nameOf(objectId);
        return "added " + added.id + (name != null ? " (" + name + ")" : "")
                + " @ " + x + "," + y + "," + plane
                + " live=" + placed;
    }

    /**
     * Run a model command then resync the live scene.
     * Extra host commands: {@code spawn <objectId>}, {@code apply}, {@code clear},
     * {@code load <name>}, {@code mode [editor|game]}, {@code status}.
     */
    static String command(String input) throws IOException {
        if (input == null) {
            throw new IllegalArgumentException("empty command");
        }
        String trimmed = input.trim();
        if (trimmed.length() == 0) {
            throw new IllegalArgumentException("empty command");
        }
        String[] p = trimmed.split("\\s+");
        String op = p[0].toLowerCase();

        if ("status".equals(op) && p.length == 1) {
            Scene s = editor().scene();
            return "mode=" + editor().mode()
                    + " objects=" + s.objects().size()
                    + " live=" + LiveSceneBridge.liveCount()
                    + " dirty=" + editor().isDirty()
                    + " name=" + s.name;
        }
        if ("mode".equals(op)) {
            if (p.length == 1) {
                return "mode=" + editor().mode();
            }
            if ("editor".equalsIgnoreCase(p[1]) || "on".equalsIgnoreCase(p[1])) {
                setEditorMode(true);
                return "mode=EDITOR live=" + LiveSceneBridge.liveCount();
            }
            if ("game".equalsIgnoreCase(p[1]) || "off".equalsIgnoreCase(p[1])) {
                setEditorMode(false);
                return "mode=GAME";
            }
            throw new IllegalArgumentException("mode editor|game");
        }
        if ("spawn".equals(op) && p.length == 2) {
            if (!isEditorMode()) {
                setEditorMode(true);
            }
            return spawnAtPlayer(Integer.parseInt(p[1]));
        }
        if ("apply".equals(op) && p.length == 1) {
            int live = resync();
            persistQuiet();
            return "applied live=" + live;
        }
        if ("clear".equals(op) && p.length == 1) {
            editor().clearObjects();
            LiveSceneBridge.clearLive();
            persistQuiet();
            return "cleared";
        }
        if ("load".equals(op) && p.length == 2) {
            editor().load(p[1]);
            int live = resync();
            persistQuiet();
            return "loaded " + p[1] + " live=" + live;
        }

        // Delegate to model commands; resync after mutations.
        String result = editor().command(trimmed);
        if ("save".equals(op)) {
            persistQuiet();
            String server = pushToServerIfAdmin();
            return result + (server != null ? " " + server : "");
        }
        int live = resync();
        persistQuiet();
        return result + " live=" + live;
    }

    /**
     * If staff rights are active, push stock removals + placements to the void
     * server ({@code scene_remove}/{@code scene_place} + {@code scene_flush}) so
     * GameObjects collision, {@code editor.obj-spawns.toml}, and JS5 {@code lX_Y}
     * stay in sync.
     */
    private static String pushToServerIfAdmin() {
        if (Component353.anInt2581 <= 0) {
            return "(local only — not admin)";
        }
        if (Component49.clientState != 10) {
            return "(local only — not logged in)";
        }
        int removed = 0;
        for (SceneRemoval r : editor().scene().removals()) {
            sendServerCommand("scene_remove " + r.objectId + " " + r.x + " " + r.y
                    + " " + r.plane + " " + (r.rotation & 3) + " " + r.shape);
            removed++;
        }
        int n = 0;
        for (SceneObject o : editor().scene().objects()) {
            if (!o.visible) {
                continue;
            }
            sendServerCommand("scene_place " + o.objectId + " " + o.x + " " + o.y
                    + " " + o.plane + " " + (o.rotation & 3) + " 10");
            n++;
        }
        sendServerCommand("scene_flush");
        return "server=+" + n + "/-" + removed + " (place+remove+flush)";
    }

    /** Fire a console command packet to the game server (same path as `::`). */
    private static void sendServerCommand(String command) {
        try {
            // Opaque dummy must be < -80 — createOutboundPacket nulls aCalendar6221
            // when i >= -80, which then NPEs Applet_Sub1.printConsole.
            ParticleSystem packet = ParticleShader.createOutboundPacket(
                    MatrixSub2.aClass351_5699,
                    DisplayModeManagerContainer64.aClass77_9029,
                    -106);
            packet.aClass348_Sub49_Sub2_7116.writeByte(false, command.length() + 3);
            packet.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
            packet.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
            packet.aClass348_Sub49_Sub2_7116.writeString((byte) -5, command);
            HashNodeSub14.enqueueOutboundPacket(120, packet);
        } catch (Throwable t) {
            System.out.println("scene-editor server cmd: " + t.getMessage());
        }
    }

    static void printHelp() {
        Applet_Sub1.printConsole("ed mode [editor|game] — toggle local scene editor", 80);
        Applet_Sub1.printConsole("ed spawn <objectId> — place LocType at your tile", 80);
        Applet_Sub1.printConsole("ed add <objectId> <x> <y> <z> <plane>", 80);
        Applet_Sub1.printConsole("ed move <id> <x> <y> <z> | rotate <id> <0-3>", 80);
        Applet_Sub1.printConsole("ed remove <id> | undo | redo | clear | apply", 80);
        Applet_Sub1.printConsole("ed save <name> | load <name> | status", 80);
        Applet_Sub1.printConsole("ed save (admin) pushes scene_remove+place+flush (collision/JS5)", 80);
        Applet_Sub1.printConsole("(x/y offsets use 0.1-tile Micro Adjust controls)", 80);
    }
}
