/**
 * In-world scene editor component: searchable City Assets picker, selection, and Done-to-close.
 * Right-click Move / Remove / Rotate live in {@link SceneEditorMenu}.
 * <p>
 * Tile under cursor is read from the existing Walk-here menu tip (opcode 19)
 * built each frame by {@link ColoredText#method1823} — no custom raycast.
 * <p>
 * While the game right-click menu is open ({@link Component364#aBoolean8335}),
 * world clicks are <b>not</b> eaten so Move/Remove/Rotate can fire.
 */
final class SceneEditorUi {

    private static final int PANEL_W = 266;
    private static final int PANEL_PAD = 8;
    private static final int HEADER_H = 30;
    private static final int CLOSE_W = 28;
    private static final int CLOSE_H = 24;
    private static final int PREVIEW_H = 78;
    private static final int ROW_H = 24;
    private static final int SEARCH_H = 24;
    private static final int LIST_TOP = 150;
    private static final int LIST_ROWS = 8;
    private static final int LIST_CONTROL_W = 24;
    private static final int LIST_CONTROL_H = 28;
    private static final int LIST_CONTROL_GAP = 4;
    private static final int PALETTE_FOOTER_H = 108;
    private static final int ACTION_H = 26;
    private static final int ACTION_GAP = 4;

    private static final int MOVE_PANEL_H = 300;
    private static final int MOVE_BUTTON = 30;
    private static final int MOVE_GAP = 4;
    private static final int MOVE_DONE_H = 28;
    private static final int DONE_H = 28;
    private static final int BG = 0xD01A1028;
    private static final int HEADER_BG = 0xE023172E;
    private static final int FIELD_BG = 0xC01A1224;
    private static final int ROW_BG = 0xB01B1326;
    private static final int PREVIEW_BG = 0xB0140E1D;
    private static final int BORDER = 0xFF644B70;
    private static final int ACCENT = 0xFF00FFFF;
    private static final int SELECT = 0xFFFF00AA;
    private static final int SHADOW = 0xFF000000;
    private static final int GHOST = 0x88AAAAAA;
    private static final int DRAG_LINE = 0xFFFF8800;


    private static final Asset selectedAsset = new Asset("Tree", 1276);
    private static int previewObjectId = -1;
    private static Component44 previewDefinition;
    private static int resultOffset;
    private static long selectedId = -1L;
    private static boolean searchFocused;
    private static String searchText = "";
    private static boolean dragging;
    private static boolean moveArmed;
    private static int dragHoverAbsX = -1;
    private static int dragHoverAbsY = -1;
    private static int hoverAbsX = -1;
    private static int hoverAbsY = -1;
    private static boolean mouseOverUi;
    private static boolean announced;

    private SceneEditorUi() {
    }

    static boolean isMouseOver() {
        return mouseOverUi && SceneEditorHost.isEditorMode();
    }

    static Asset currentAsset() {
        return selectedAsset;
    }

    private static int filteredCount() {
        return SceneAssetCatalog.search(searchText);
    }

    private static SceneAssetCatalog.Entry filteredEntryAt(int row) {
        return SceneAssetCatalog.resultAt(resultOffset + row);
    }

    /** Wheel input is left available for normal camera controls; the list uses arrows. */
    static boolean isScrollOverUi() {
        return false;
    }
    private static boolean cursorOverUi() {
        if (!SceneEditorHost.isEditorMode() || AbstractGlTextureSub4.mouseHandler == null) {
            return false;
        }
        int x = AbstractGlTextureSub4.mouseHandler.getCursorX(true);
        int y = AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 100);
        return hitPalette(x, y);
    }

    private static void clearHoverTile() {
        hoverAbsX = -1;
        hoverAbsY = -1;
    }

    private static void normalizeSelection() {
        int count = filteredCount();
        int maxOffset = Math.max(0, count - LIST_ROWS);
        if (resultOffset > maxOffset) {
            resultOffset = maxOffset;
        }
        if (count == 0 || SceneAssetCatalog.containsResult(selectedAsset.objectId)) {
            return;
        }
        SceneAssetCatalog.Entry first = SceneAssetCatalog.resultAt(0);
        if (first != null) {
            selectAsset(first);
        }
    }

    private static void selectAsset(SceneAssetCatalog.Entry entry) {
        selectedAsset.objectId = entry.objectId;
        selectedAsset.label = entry.name;
        previewObjectId = -1;
        previewDefinition = null;
    }
    static void onEditorEnabled() {
        SceneAssetCatalog.start();
        if (!announced) {
            announced = true;
            try {
                ShaderProgramSub2.addChatMessage("", 5, (byte) -100, 0,
                        "[System] Scene editor ON. Right-click → Move / Remove / Rotate. "
                                + "Ctrl+click = claim+drag. Objects stay when editor turns OFF.",
                        "", "");
            } catch (Throwable ignored) {
                /* chat may be unavailable mid-login */
            }
        }
    }

    static void onEditorDisabled() {
        selectedId = -1L;
        dragging = false;
        moveArmed = false;
        searchFocused = false;
        announced = false;
    }

    /** Right-click Move / Ctrl+click — select and arm destination click. */
    static void beginMove(long id) {
        selectedId = id;
        moveArmed = true;
        dragging = false;
    }

    static void select(long id) {
        selectedId = id;
        moveArmed = false;
        dragging = false;
    }

    static void clearSelection() {
        selectedId = -1L;
        moveArmed = false;
        dragging = false;
    }

    /** Called from the draw loop after Microbot HUD. */
    static void draw(GraphicsToolkit toolkit) {
        if (!SceneEditorHost.isEditorMode() || toolkit == null || !Microbot.isLoggedIn()) {
            return;
        }
        onEditorEnabled();
        try {
            BitmapFont font = Applet_Sub1.aClass324_20;
            if (font == null) {
                font = Component49.aClass324_4684;
            }
            if (font == null) {
                return;
            }
            mouseOverUi = cursorOverUi();
            if (mouseOverUi) {
                clearHoverTile();
            } else {
                refreshHoverTile();
            }
            if (moveArmed) {
                drawMovePanel(toolkit, font);
            } else {
                drawPalette(toolkit, font);
            }
            drawWorldOverlay(toolkit, font);
            drawToolBanner(toolkit, font);
        } catch (Throwable t) {
            System.out.println("scene-editor ui draw: " + t.getMessage());
        }
    }

    /**
     * Eat palette / world clicks while editor mode is on — except when the
     * right-click menu is open, so Move/Remove/Rotate receive the click.
     */
    static void pollInput() {
        mouseOverUi = false;
        if (!SceneEditorHost.isEditorMode() || AbstractGlTextureSub4.mouseHandler == null) {
            return;
        }
        if (!Microbot.isLoggedIn()) {
            return;
        }
        try {
            pollSearchInput();
            mouseOverUi = cursorOverUi();
            if (mouseOverUi) {
                clearHoverTile();
            } else {
                refreshHoverTile();
            }

            // Let the open context menu consume left-clicks (Move/Remove/Rotate).
            if (Component364.aBoolean8335) {
                return;
            }

            Node node = Component327.aClass262_8744.first(4);
            while (node != null) {
                Node next = Component327.aClass262_8744.next((byte) 79);
                if (node instanceof NodeSub45) {
                    NodeSub45 click = (NodeSub45) node;
                    int type = click.getEventType(86);
                    int cx = click.getX((byte) -128);
                    int cy = click.getY(33);
                    if (type == 0) {
                        if (hitPalette(cx, cy)) {
                            click.unlink((byte) 97);
                            onPaletteClick(cx, cy);
                            if (!SceneEditorHost.isEditorMode()) {
                                return;
                            }
                        } else if (!BuildInfo.isMouseOverConsole() && !MicrobotPanel.contains(cx, cy)) {
                            onWorldPress(cx, cy);
                            click.unlink((byte) 97);
                        }
                    } else if (type == 3) {
                        if (dragging) {
                            onWorldRelease();
                            click.unlink((byte) 97);
                        }
                    }
                }
                node = next;
            }

            if (dragging && hoverAbsX >= 0) {
                dragHoverAbsX = hoverAbsX;
                dragHoverAbsY = hoverAbsY;
            }
        } catch (Throwable t) {
            System.out.println("scene-editor ui input: " + t.getMessage());
        }
    }

    private static void pollSearchInput() {
        if (!searchFocused) {
            return;
        }
        for (int i = 0; i < HashNodeSub19.anInt9699; i++) {
            Interface6 event = DefinitionGroup.anInterface6Array9534[i];
            int key = event.getKeyCode(false);
            int type = event.getEventType(26276);
            if (key == 84 && type == 0) {
                spawnSelected();
                continue;
            }
            if ((type == 0 || type == 2) && key == 85) {
                if (searchText.length() > 0) {
                    searchText = searchText.substring(0, searchText.length() - 1);
                    resultOffset = 0;
                    normalizeSelection();
                }
                continue;
            }
            if (type != 3) {
                continue;
            }
            char c = event.getKeyChar((byte) 96);
            if (Character.isLetterOrDigit(c) || c == ' ' || c == '-' || c == '_') {
                searchText += Character.toLowerCase(c);
                resultOffset = 0;
                normalizeSelection();
            }
        }
    }

    private static void onWorldPress(int cx, int cy) {
        boolean ctrl = isCtrlDown();
        if (ctrl) {
            MenuEntry obj = SceneEditorMenu.findObjectTip();
            if (obj != null) {
                int objectId = SceneEditorMenu.objectIdOf(obj);
                int localX = obj.param0;
                int localY = obj.param1;
                int absX = localX + NodeBaseSub2.regionTileX;
                int absY = localY + Component330.regionTileY;
                int plane = MicrobotWidgets.localPlane();
                int rot = SceneEditorMenu.decodeRotation(obj.identifier);
                try {
                    SceneObject claimed = SceneEditorHost.claimAt(objectId, absX, absY, plane, rot);
                    selectedId = claimed.id;
                    dragging = true;
                    moveArmed = false;
                    dragHoverAbsX = absX;
                    dragHoverAbsY = absY;
                } catch (Throwable t) {
                    System.out.println("scene-editor claim: " + t.getMessage());
                }
                return;
            }
        }

        int[] tile = tipTileAbs();
        if (tile == null) {
            return;
        }
        // Move mode stays armed so each world click picks another destination.
        if (moveArmed && selectedId >= 0) {
            moveSelectedTo(tile[0], tile[1]);
            chat("Moved to " + tile[0] + "," + tile[1]);
            return;
        }
        SceneObject hit = findAt(tile[0], tile[1], tile[2]);
        if (hit != null) {
            selectedId = hit.id;
            dragging = true;
            moveArmed = false;
            dragHoverAbsX = tile[0];
            dragHoverAbsY = tile[1];
            return;
        }
        placeAt(tile[0], tile[1], tile[2]);
    }

    private static boolean isCtrlDown() {
        try {
            return Component280.aClass346_2449 != null
                    && Component280.aClass346_2449.isKeyDown(82, -125);
        } catch (Throwable t) {
            return false;
        }
    }

    private static void onWorldRelease() {
        if (!dragging || selectedId < 0) {
            dragging = false;
            return;
        }
        if (dragHoverAbsX >= 0 && dragHoverAbsY >= 0) {
            try {
                SceneObject o = SceneEditorHost.editor().scene().get(selectedId);
                if (o != null && (o.x != dragHoverAbsX || o.y != dragHoverAbsY)) {
                    SceneEditorHost.editor().move(selectedId, dragHoverAbsX, dragHoverAbsY, o.z);
                    SceneEditorHost.resync();
                    SceneEditorHost.persistQuiet();
                }
            } catch (Throwable t) {
                System.out.println("scene-editor move: " + t.getMessage());
            }
        }
        dragging = false;
    }

    private static void placeAt(int absX, int absY, int plane) {
        try {
            Asset asset = currentAsset();
            SceneObject added = SceneEditorHost.editor().add(asset.objectId, absX, absY, 0, plane);
            selectedId = added.id;
            SceneEditorHost.resync();
            SceneEditorHost.persistQuiet();
        } catch (Throwable t) {
            System.out.println("scene-editor place: " + t.getMessage());
        }
    }

    private static SceneObject findAt(int absX, int absY, int plane) {
        SceneObject best = null;
        int bestDist = 2;
        for (SceneObject o : SceneEditorHost.editor().scene().objects()) {
            if (o.plane != plane) {
                continue;
            }
            int d = Math.max(Math.abs(o.x - absX), Math.abs(o.y - absY));
            if (d < bestDist) {
                bestDist = d;
                best = o;
            }
        }
        return best;
    }

    private static int[] tipTileAbs() {
        MenuEntry walk = findWalkTip();
        if (walk == null) {
            return null;
        }
        int localX = walk.param0;
        int localY = walk.param1;
        if (!SceneObjectAdapter.inSceneBounds(localX, localY)) {
            return null;
        }
        int plane = MicrobotWidgets.localPlane();
        return new int[]{
                localX + NodeBaseSub2.regionTileX,
                localY + Component330.regionTileY,
                plane
        };
    }

    private static MenuEntry findWalkTip() {
        MenuEntry tip = Component192.menuTip;
        if (tip != null) {
            int op = tip.opcode >= 2000 ? tip.opcode - 2000 : tip.opcode;
            if (op == 19) {
                return tip;
            }
        }
        try {
            for (MenuEntry e = (MenuEntry) DefinitionSub4.menuEntries.sentinel.previous;
                 e != null && e != DefinitionSub4.menuEntries.sentinel;
                 e = (MenuEntry) e.previous) {
                int op = e.opcode >= 2000 ? e.opcode - 2000 : e.opcode;
                if (op == 19) {
                    return e;
                }
            }
        } catch (Throwable ignored) {
            /* empty */
        }
        return null;
    }

    private static void refreshHoverTile() {
        int[] tile = tipTileAbs();
        if (tile == null) {
            hoverAbsX = hoverAbsY = -1;
            return;
        }
        hoverAbsX = tile[0];
        hoverAbsY = tile[1];
    }

    private static int paletteX() {
        return Math.max(8, SocketConnector.canvasWidth - PANEL_W - 8);
    }

    private static int paletteY() {
        return 48;
    }
    private static int closeX() {
        return paletteX() + PANEL_W - PANEL_PAD - CLOSE_W;
    }

    private static int closeY() {
        return paletteY() + 3;
    }

    private static boolean hitEditorClose(int x, int y) {
        return x >= closeX() && x < closeX() + CLOSE_W
                && y >= closeY() && y < closeY() + CLOSE_H;
    }

    private static int paletteHeight() {
        return LIST_TOP + LIST_ROWS * ROW_H + PALETTE_FOOTER_H;
    }

    private static int searchX() {
        return paletteX() + PANEL_PAD;
    }

    private static int previewY() {
        return paletteY() + HEADER_H + 6;
    }

    private static int searchY() {
        return paletteY() + HEADER_H + PREVIEW_H + 10;
    }

    private static int doneY() {
        return paletteY() + paletteHeight() - PANEL_PAD - DONE_H;
    }
    private static int actionY() {
        return doneY() - 34;
    }

    private static int actionWidth() {
        return (PANEL_W - PANEL_PAD * 2 - ACTION_GAP * 2) / 3;
    }

    private static int actionX(int column) {
        return searchX() + column * (actionWidth() + ACTION_GAP);
    }
    private static int listRowWidth() {
        return PANEL_W - PANEL_PAD * 2 - LIST_CONTROL_W - LIST_CONTROL_GAP;
    }

    private static int listControlsX() {
        return searchX() + PANEL_W - PANEL_PAD * 2 - LIST_CONTROL_W;
    }

    private static int listY() {
        return paletteY() + LIST_TOP;
    }

    private static int listUpY() {
        return listY();
    }

    private static int listDownY() {
        return listY() + LIST_ROWS * ROW_H - LIST_CONTROL_H;
    }

    private static boolean hitListArrow(int x, int y, boolean up) {
        int arrowY = up ? listUpY() : listDownY();
        return x >= listControlsX() && x < listControlsX() + LIST_CONTROL_W
                && y >= arrowY && y < arrowY + LIST_CONTROL_H;
    }

    private static void moveResultOffset(int delta) {
        resultOffset = Math.max(0, resultOffset + delta);
        normalizeSelection();
    }

    private static int moveControlsY() {
        return paletteY() + 132;
    }

    private static int moveRotateY() {
        return paletteY() + 220;
    }

    private static int moveDoneY() {
        return paletteY() + MOVE_PANEL_H - PANEL_PAD - MOVE_DONE_H;
    }

    private static int moveCenterX() {
        return searchX() + (PANEL_W - PANEL_PAD * 2 - MOVE_BUTTON) / 2;
    }

    private static boolean hitMoveButton(int x, int y, int buttonX, int buttonY, int width, int height) {
        return x >= buttonX && x < buttonX + width && y >= buttonY && y < buttonY + height;
    }



    private static boolean hitPalette(int x, int y) {
        int height = moveArmed ? MOVE_PANEL_H : paletteHeight();
        return x >= paletteX() && x < paletteX() + PANEL_W
                && y >= paletteY() && y < paletteY() + height;
    }

    private static boolean hitSearch(int x, int y) {
        return x >= searchX() && x < searchX() + PANEL_W - PANEL_PAD * 2
                && y >= searchY() && y < searchY() + SEARCH_H;
    }

    private static boolean hitDone(int x, int y) {
        return x >= searchX() && x < searchX() + PANEL_W - PANEL_PAD * 2
                && y >= doneY() && y < doneY() + DONE_H;
    }
    private static boolean hitAction(int x, int y, int column) {
        return x >= actionX(column) && x < actionX(column) + actionWidth()
                && y >= actionY() && y < actionY() + ACTION_H;
    }

    private static boolean hitAssetList(int x, int y) {
        int listY = listY();
        return x >= searchX() && x < listControlsX() - LIST_CONTROL_GAP
                && y >= listY && y < listY + LIST_ROWS * ROW_H;
    }


    private static void closeEditor(String reason) {
        searchFocused = false;
        MobileKeyboard.requestHide(reason);
        SceneEditorHost.setEditorMode(false);
    }

    private static void onPaletteClick(int x, int y) {
        if (hitEditorClose(x, y)) {
            closeEditor("scene-editor-close");
            return;
        }
        if (moveArmed) {
            onMovePanelClick(x, y);
            return;
        }

        if (hitSearch(x, y)) {
            searchFocused = true;
            MobileKeyboard.requestShow("scene-editor-assets-search");
            return;
        }
        if (hitAction(x, y, 0)) {
            runEditorCommand("save demo", "Saved demo");
            return;
        }
        if (hitAction(x, y, 1)) {
            runEditorCommand("undo", "Undo");
            return;
        }
        if (hitAction(x, y, 2)) {
            runEditorCommand("redo", "Redo");
            return;
        }
        if (hitListArrow(x, y, true)) {
            moveResultOffset(-LIST_ROWS);
            return;
        }
        if (hitListArrow(x, y, false)) {
            moveResultOffset(LIST_ROWS);
            return;
        }
        if (hitDone(x, y)) {
            closeEditor("scene-editor-assets-done");
            return;
        }
        if (hitAssetList(x, y)) {
            int listY = listY();
            SceneAssetCatalog.Entry entry = filteredEntryAt((y - listY) / ROW_H);
            if (entry != null) {
                selectAsset(entry);
                searchFocused = false;
                MobileKeyboard.requestHide("scene-editor-assets-select");
            }
        }
    }

    private static void onMovePanelClick(int x, int y) {
        int centerX = moveCenterX();
        int controlsY = moveControlsY();
        if (hitMoveButton(x, y, centerX, controlsY, MOVE_BUTTON, MOVE_BUTTON)) {
            moveSelectedBy(0, 1);
        } else if (hitMoveButton(x, y, centerX - MOVE_BUTTON - MOVE_GAP, controlsY + MOVE_BUTTON + MOVE_GAP,
                MOVE_BUTTON, MOVE_BUTTON)) {
            moveSelectedBy(-1, 0);
        } else if (hitMoveButton(x, y, centerX, controlsY + MOVE_BUTTON + MOVE_GAP,
                MOVE_BUTTON, MOVE_BUTTON)) {
            moveSelectedBy(0, -1);
        } else if (hitMoveButton(x, y, centerX + MOVE_BUTTON + MOVE_GAP, controlsY + MOVE_BUTTON + MOVE_GAP,
                MOVE_BUTTON, MOVE_BUTTON)) {
            moveSelectedBy(1, 0);
        } else if (hitMoveButton(x, y, searchX(), moveRotateY(), PANEL_W - PANEL_PAD * 2, MOVE_BUTTON)) {
            rotateSelected();
        } else if (hitMoveButton(x, y, searchX(), moveDoneY(), PANEL_W - PANEL_PAD * 2, MOVE_DONE_H)) {
            moveArmed = false;
            dragging = false;
            chat("Move finished");
        }
    }

    private static SceneObject selectedObject() {
        return selectedId >= 0 ? SceneEditorHost.editor().scene().get(selectedId) : null;
    }

    private static void moveSelectedBy(int dx, int dy) {
        SceneObject object = selectedObject();
        if (object == null) {
            return;
        }
        moveSelectedTo(object.x + dx, object.y + dy);
    }

    private static void moveSelectedTo(int x, int y) {
        try {
            SceneObject object = selectedObject();

            if (object == null) {
                return;
            }
            SceneEditorHost.editor().move(selectedId, x, y, object.z);
            SceneEditorHost.resync();
            SceneEditorHost.persistQuiet();
        } catch (Throwable t) {
            System.out.println("scene-editor move-to: " + t.getMessage());
        }
    }
    private static void runEditorCommand(String command, String label) {
        boolean keepEditorMode = SceneEditorHost.isEditorMode();
        try {
            String result = SceneEditorHost.command(command);
            chat(label + ": " + result);
        } catch (Throwable t) {
            chat(label + " failed: " + t.getMessage());
        } finally {
            if (keepEditorMode && !SceneEditorHost.isEditorMode()) {
                SceneEditorHost.setEditorMode(true);
            }
        }
    }

    private static void rotateSelected() {
        try {
            SceneObject object = selectedObject();
            if (object == null) {
                return;
            }
            int next = (object.rotation + 1) & 3;
            SceneEditorHost.editor().rotate(selectedId, next);
            SceneEditorHost.resync();
            SceneEditorHost.persistQuiet();
            chat("Rotation " + next);
        } catch (Throwable t) {
            System.out.println("scene-editor rotate: " + t.getMessage());
        }
    }

    private static void finishMove() {
        moveArmed = false;
        dragging = false;
        chat("Move finished");
    }

    private static void spawnSelected() {
        if (filteredCount() == 0) {
            chat("No City Assets match '" + searchText + "'.");
            return;
        }
        boolean keepEditorMode = SceneEditorHost.isEditorMode();
        try {
            Asset asset = currentAsset();
            SceneEditorHost.spawnAtPlayer(asset.objectId);
            SceneEditorHost.persistQuiet();
            chat("Spawned " + asset.label + " (#" + asset.objectId + ")");
        } catch (Throwable t) {
            chat("Spawn failed: " + t.getMessage());
        } finally {
            if (keepEditorMode && !SceneEditorHost.isEditorMode()) {
                SceneEditorHost.setEditorMode(true);
            }
        }
    }

    private static Component44 previewDefinition(int objectId) {
        if (previewObjectId == objectId) {
            return previewDefinition;
        }
        previewObjectId = objectId;
        previewDefinition = null;
        try {
            if (GradientPreset.aClass263_9195 != null) {
                previewDefinition = GradientPreset.aClass263_9195.method2005(0, objectId);
            }
        } catch (Throwable ignored) {
            /* A missing model must not break the editor panel. */
        }
        return previewDefinition;
    }

    private static void drawPreview(GraphicsToolkit toolkit, BitmapFont font, int x, int y, int width, int objectId) {
        Component44 definition = previewDefinition(objectId);
        if (definition != null && drawObjectModelPreview(toolkit, definition, x, y, width)) {
            return;
        }
        font.drawText("Preview unavailable", 0xFF999999, y + PREVIEW_H / 2 + 5,
                x + 6, SHADOW, -110);
    }

    /**
     * Object definitions are location models, not map-scene sprites. The old
     * preview passed them through Component119, which only understands the
     * map-scene id stored in anInt875. Build the location model directly and
     * use the same projection setup as type-6 interface model widgets.
     */
    private static boolean drawObjectModelPreview(GraphicsToolkit toolkit, Component44 definition,
                                                  int x, int y, int width) {
        Component245 model = null;
        int[] modelTypes = {10, 22, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int modelType : modelTypes) {
            try {
                model = definition.method476(toolkit, null, modelType, 2048, 0, false,
                        null, 0, 0, 0, 128);
                if (model != null && model.aClass64_119 != null) {
                    break;
                }
            } catch (Throwable ignored) {
                model = null;
            }
        }
        if (model == null || model.aClass64_119 == null) {
            return false;
        }

        int centerX = x + width / 2;
        int centerY = y + PREVIEW_H / 2 + 30;
        int modelWidth = model.aClass64_119.RA() - model.aClass64_119.V();
        int modelHeight = model.aClass64_119.EA() - model.aClass64_119.fa();
        int modelDepth = model.aClass64_119.G() - model.aClass64_119.HA();
        int modelSize = Math.max(modelWidth, Math.max(modelHeight, modelDepth));
        int targetSize = Math.max(24, PREVIEW_H - 16);
        int previewDepth = Math.max(512, modelSize * 512 / targetSize);
        DisplayModeManagerContainer204 projection = Component270.aClass101_2123;
        DisplayModeManagerContainer204 matrix = Cp1252Decoder.aClass101_5209;
        try {
            projection.method910();
            toolkit.method3638(projection);
            toolkit.DA(centerX, centerY, 512, 512);
            toolkit.NativeHandle();
            matrix.method902(-124);
            matrix.method896(2048);
            matrix.method891(0, 0, previewDepth);
            matrix.method900(0);
            model.aClass64_119.render(matrix, null, 1);
            return true;
        } catch (Throwable ignored) {
            return false;
        }
    }


    private static void drawMovePanel(GraphicsToolkit toolkit, BitmapFont font) {
        int px = paletteX();
        int py = paletteY();
        int innerW = PANEL_W - PANEL_PAD * 2;
        int sx = searchX();
        int previewY = previewY();
        SceneObject object = selectedObject();

        toolkit.fillRect3D(px, py, PANEL_W, MOVE_PANEL_H, BORDER, 0);
        toolkit.fillRect2D(px + 1, py + 1, PANEL_W - 2, MOVE_PANEL_H - 2, BG, 1);
        toolkit.fillRect2D(px + 1, py + 1, PANEL_W - 2, HEADER_H, HEADER_BG, 1);
        toolkit.fillRect2D(px + 1, py + HEADER_H, PANEL_W - 2, 1, BORDER, 1);
        toolkit.fillRect2D(px, py, PANEL_W, 2, ACCENT, 1);
        font.drawText("Move object", ACCENT, py + 20, px + PANEL_PAD, SHADOW, -110);
        font.drawText("[X]", 0xFFFF6688, closeY() + 17, closeX() + 4, SHADOW, -110);

        toolkit.fillRect2D(sx, previewY, innerW, PREVIEW_H, PREVIEW_BG, 1);
        toolkit.fillRect3D(sx, previewY, innerW, PREVIEW_H, BORDER, 0);
        font.drawText("PREVIEW", 0xFFAAAAAA, previewY + 15, sx + 6, SHADOW, -110);
        if (object != null) {
            drawPreview(toolkit, font, sx, previewY, innerW, object.objectId);
            font.drawText("#" + object.objectId + " @ " + object.x + "," + object.y,
                    0xFFCCCCCC, previewY + PREVIEW_H - 7, sx + 6, SHADOW, -110);
        }

        int controlsY = moveControlsY();
        font.drawText("Move one tile per click", 0xFFAAAAAA, controlsY - 10, sx, SHADOW, -110);
        int centerX = moveCenterX();
        drawMoveButton(toolkit, font, centerX, controlsY, MOVE_BUTTON, "up");
        drawMoveButton(toolkit, font, centerX - MOVE_BUTTON - MOVE_GAP, controlsY + MOVE_BUTTON + MOVE_GAP,
                MOVE_BUTTON, "left");
        drawMoveButton(toolkit, font, centerX, controlsY + MOVE_BUTTON + MOVE_GAP, MOVE_BUTTON, "down");
        drawMoveButton(toolkit, font, centerX + MOVE_BUTTON + MOVE_GAP, controlsY + MOVE_BUTTON + MOVE_GAP,
                MOVE_BUTTON, "right");
        drawMoveButton(toolkit, font, sx, moveRotateY(), innerW, MOVE_BUTTON, "Rotate");
        drawMoveButton(toolkit, font, sx, moveDoneY(), innerW, MOVE_DONE_H, "Done");
    }

    private static void drawMoveButton(GraphicsToolkit toolkit, BitmapFont font, int x, int y, int size, String label) {
        drawMoveButton(toolkit, font, x, y, size, size, label);
    }

    private static void drawMoveButton(GraphicsToolkit toolkit, BitmapFont font, int x, int y,
                                       int width, int height, String label) {
        toolkit.fillRect2D(x, y, width, height, 0xB02A1A37, 1);
        toolkit.fillRect3D(x, y, width, height, BORDER, 0);
        if ("up".equals(label) || "left".equals(label) || "down".equals(label) || "right".equals(label)) {
            drawArrow(toolkit, x, y, width, height, label);
            return;
        }
        int textX = x + Math.max(6, (width - label.length() * 7) / 2);
        font.drawText(label, 0xFFFFFFFF, y + height / 2 + 6, textX, SHADOW, -110);
    }

    private static void drawArrow(GraphicsToolkit toolkit, int x, int y, int width, int height, String direction) {
        drawArrow(toolkit, x, y, width, height, direction, 0xFFFFFFFF);
    }

    private static void drawArrow(GraphicsToolkit toolkit, int x, int y, int width, int height,
                                  String direction, int color) {
        int cx = x + width / 2;
        int cy = y + height / 2;
        if ("left".equals(direction)) {
            toolkit.fillRect2D(cx - 7, cy - 2, 4, 4, color, 1);
            toolkit.fillRect2D(cx - 4, cy - 5, 4, 4, color, 1);
            toolkit.fillRect2D(cx - 4, cy + 3, 4, 4, color, 1);
            toolkit.fillRect2D(cx - 1, cy - 2, 4, 4, color, 1);
        } else if ("right".equals(direction)) {
            toolkit.fillRect2D(cx + 3, cy - 2, 4, 4, color, 1);
            toolkit.fillRect2D(cx, cy - 5, 4, 4, color, 1);
            toolkit.fillRect2D(cx, cy + 3, 4, 4, color, 1);
            toolkit.fillRect2D(cx - 3, cy - 2, 4, 4, color, 1);
        } else if ("up".equals(direction)) {
            toolkit.fillRect2D(cx - 2, cy - 7, 4, 4, color, 1);
            toolkit.fillRect2D(cx - 5, cy - 4, 4, 4, color, 1);
            toolkit.fillRect2D(cx + 3, cy - 4, 4, 4, color, 1);
            toolkit.fillRect2D(cx - 2, cy - 1, 4, 4, color, 1);
        } else {
            toolkit.fillRect2D(cx - 2, cy + 3, 4, 4, color, 1);
            toolkit.fillRect2D(cx - 5, cy, 4, 4, color, 1);
            toolkit.fillRect2D(cx + 3, cy, 4, 4, color, 1);
            toolkit.fillRect2D(cx - 2, cy - 3, 4, 4, color, 1);
        }
    }

    private static void drawPalette(GraphicsToolkit toolkit, BitmapFont font) {
        int px = paletteX();
        int py = paletteY();
        int ph = paletteHeight();
        int innerW = PANEL_W - PANEL_PAD * 2;
        int count = filteredCount();
        int sx = searchX();
        int sy = searchY();
        int previewY = previewY();
        int listY = listY();
        int rowW = listRowWidth();

        toolkit.fillRect3D(px, py, PANEL_W, ph, BORDER, 0);
        toolkit.fillRect2D(px + 1, py + 1, PANEL_W - 2, ph - 2, BG, 1);
        toolkit.fillRect2D(px + 1, py + 1, PANEL_W - 2, HEADER_H, HEADER_BG, 1);
        toolkit.fillRect2D(px + 1, py + HEADER_H, PANEL_W - 2, 1, BORDER, 1);
        toolkit.fillRect2D(px, py, PANEL_W, 2, ACCENT, 1);
        font.drawText("City Assets", ACCENT, py + 20, px + PANEL_PAD, SHADOW, -110);
        font.drawText("[X]", 0xFFFF6688, closeY() + 17, closeX() + 4, SHADOW, -110);

        toolkit.fillRect2D(sx, previewY, innerW, PREVIEW_H, PREVIEW_BG, 1);
        toolkit.fillRect3D(sx, previewY, innerW, PREVIEW_H, BORDER, 0);
        font.drawText("PREVIEW", 0xFFAAAAAA, previewY + 15, sx + 6, SHADOW, -110);
        drawPreview(toolkit, font, sx, previewY, innerW, selectedAsset.objectId);

        toolkit.fillRect2D(sx, sy, innerW, SEARCH_H, FIELD_BG, 1);
        toolkit.fillRect3D(sx, sy, innerW, SEARCH_H, searchFocused ? ACCENT : BORDER, 0);
        String query = searchText.length() == 0 ? "Search all objects..." : searchText;
        font.drawText(query, searchText.length() == 0 ? 0xFF999999 : 0xFFFFFFFF,
                sy + 17, sx + 6, SHADOW, -110);

        for (int row = 0; row < LIST_ROWS; row++) {
            SceneAssetCatalog.Entry entry = filteredEntryAt(row);
            int cy = listY + row * ROW_H;
            boolean selected = entry != null && entry.objectId == selectedAsset.objectId;
            toolkit.fillRect2D(sx, cy, rowW, ROW_H - 2, selected ? 0xC0332255 : ROW_BG, 1);
            if (entry != null) {
                toolkit.fillRect3D(sx, cy, rowW, ROW_H - 2,
                        selected ? SELECT : BORDER, 0);
                String label = entry.name + " (#" + entry.objectId + ")";
                font.drawText(label, 0xFFFFFFFF, cy + 16, sx + 6, SHADOW, -110);
            }
        }
        if (count == 0) {
            String status = SceneAssetCatalog.isLoading()
                    ? "Loading objects " + SceneAssetCatalog.scanned() + "/" + SceneAssetCatalog.total()
                    : "No objects match this search";
            font.drawText(status, 0xFFAAAAAA, listY + 16, sx + 6, SHADOW, -110);
        }
        drawListControls(toolkit, count);

        Asset selected = currentAsset();
        String page = count > 0
                ? "Results " + (resultOffset + 1) + "-" + Math.min(resultOffset + LIST_ROWS, count) + "/" + count
                : "Results 0/0";
        font.drawText(page, 0xFF999999, doneY() - 62, sx, SHADOW, -110);
        font.drawText("Selected: " + selected.label + " (#" + selected.objectId + ")",
                0xFFCCCCCC, doneY() - 46, sx, SHADOW, -110);
        drawMoveButton(toolkit, font, actionX(0), actionY(), actionWidth(), ACTION_H, "Save");
        drawMoveButton(toolkit, font, actionX(1), actionY(), actionWidth(), ACTION_H, "Undo");
        drawMoveButton(toolkit, font, actionX(2), actionY(), actionWidth(), ACTION_H, "Redo");
        int buttonFill = count == 0 ? 0xFF444444 : 0xFF006C78;
        toolkit.fillRect2D(sx, doneY(), innerW, DONE_H, buttonFill, 1);
        toolkit.fillRect3D(sx, doneY(), innerW, DONE_H, count == 0 ? 0xFF666666 : ACCENT, 0);
        font.drawText("Done", 0xFFFFFFFF, doneY() + 19, sx + innerW / 2 - 14, SHADOW, -110);
    }
    private static void drawListControls(GraphicsToolkit toolkit, int count) {
        int maxOffset = Math.max(0, count - LIST_ROWS);
        drawListArrowButton(toolkit, listControlsX(), listUpY(), "up", resultOffset > 0);
        drawListArrowButton(toolkit, listControlsX(), listDownY(), "down", resultOffset < maxOffset);
    }

    private static void drawListArrowButton(GraphicsToolkit toolkit, int x, int y, String direction, boolean enabled) {
        int fill = enabled ? 0xFF3A2546 : 0xFF211823;
        int border = enabled ? ACCENT : BORDER;
        toolkit.fillRect2D(x, y, LIST_CONTROL_W, LIST_CONTROL_H, fill, 1);
        toolkit.fillRect3D(x, y, LIST_CONTROL_W, LIST_CONTROL_H, border, 0);
        drawArrow(toolkit, x, y, LIST_CONTROL_W, LIST_CONTROL_H, direction,
                enabled ? ACCENT : 0xFF806E80);
    }

    private static void drawToolBanner(GraphicsToolkit toolkit, BitmapFont font) {
        Asset a = currentAsset();
        String text = moveArmed
                ? "Move: click a tile or use the arrows — Done to finish"
                : (a.label + " Tool Active");
        font.drawText(text, SELECT, 18, 160, SHADOW, -110);
    }

    private static void drawWorldOverlay(GraphicsToolkit toolkit, BitmapFont font) {
        SceneObject selected = selectedId >= 0 ? SceneEditorHost.editor().scene().get(selectedId) : null;
        if (selected != null) {
            projectAndBox(toolkit, selected.x, selected.y, selected.plane, SELECT, 24);
        }
        if (dragging && dragHoverAbsX >= 0 && selected != null) {
            projectAndBox(toolkit, dragHoverAbsX, dragHoverAbsY, selected.plane, GHOST, 20);
            drawDragLine(toolkit, selected.x, selected.y, selected.plane, dragHoverAbsX, dragHoverAbsY);
        } else if (!mouseOverUi && hoverAbsX >= 0 && selectedId < 0 && !moveArmed) {
            projectAndBox(toolkit, hoverAbsX, hoverAbsY, MicrobotWidgets.localPlane(), 0x6600E5FF, 16);
        }
    }

    private static void projectAndBox(GraphicsToolkit toolkit, int absX, int absY, int plane, int argb, int half) {
        int lx = SceneObjectAdapter.toLocalX(absX);
        int ly = SceneObjectAdapter.toLocalY(absY);
        int fineX = (lx << 9) + 256;
        int fineY = (ly << 9) + 256;
        try {
            ShaderSub2.method165(plane, 0, 0, 0, fineX, 0, fineY, (byte) 61, 0, 0);
            int sx = Component71.anIntArray6062[0];
            int sy = Component71.anIntArray6062[1];
            if (sx < 0 || sy < 0) {
                return;
            }
            toolkit.fillRect3D(sx - half, sy - half, half * 2, half * 2, argb, 0);
        } catch (Throwable ignored) {
            /* projection can fail off-screen */
        }
    }

    private static void drawDragLine(GraphicsToolkit toolkit, int ax, int ay, int plane, int bx, int by) {
        int lx0 = SceneObjectAdapter.toLocalX(ax);
        int ly0 = SceneObjectAdapter.toLocalY(ay);
        int lx1 = SceneObjectAdapter.toLocalX(bx);
        int ly1 = SceneObjectAdapter.toLocalY(by);
        try {
            ShaderSub2.method165(plane, 0, 0, 0, (lx0 << 9) + 256, 0, (ly0 << 9) + 256, (byte) 61, 0, 0);
            int sx0 = Component71.anIntArray6062[0];
            int sy0 = Component71.anIntArray6062[1];
            ShaderSub2.method165(plane, 0, 0, 0, (lx1 << 9) + 256, 0, (ly1 << 9) + 256, (byte) 61, 0, 0);
            int sx1 = Component71.anIntArray6062[0];
            int sy1 = Component71.anIntArray6062[1];
            if (sx0 < 0 || sy0 < 0 || sx1 < 0 || sy1 < 0) {
                return;
            }
            int steps = Math.max(Math.abs(sx1 - sx0), Math.abs(sy1 - sy0)) / 4;
            if (steps < 1) {
                steps = 1;
            }
            for (int i = 0; i <= steps; i++) {
                int sx = sx0 + (sx1 - sx0) * i / steps;
                int sy = sy0 + (sy1 - sy0) * i / steps;
                toolkit.fillRect2D(sx - 1, sy - 1, 3, 3, DRAG_LINE, 1);
            }
        } catch (Throwable ignored) {
            /* empty */
        }
    }

    private static void chat(String msg) {
        try {
            ShaderProgramSub2.addChatMessage("", 5, (byte) -100, 0,
                    "<col=00e5ff>[Editor] " + msg + "</col>", "", "");
        } catch (Throwable ignored) {
            /* empty */
        }
    }

    static final class Asset {
        String label;
        int objectId;

        Asset(String label, int objectId) {
            this.label = label;
            this.objectId = objectId;
        }
    }
}
