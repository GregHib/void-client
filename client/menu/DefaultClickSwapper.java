import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Left-click default swapper for NPCs, scenery, and interface items
 * (inventory backpack + bank slots).
 * <p>
 * Right-click → {@code Default: Wear} / {@code Default: Withdraw-All}. Persists
 * id → action name; menus promote that action to the left-click / tap tip.
 */
final class DefaultClickSwapper {

    static final int OPCODE_SET_NPC = 1900;
    static final int OPCODE_RESET_NPC = 1901;
    static final int OPCODE_SET_OBJECT = 1902;
    static final int OPCODE_RESET_OBJECT = 1903;
    static final int OPCODE_SET_ITEM = 1904;
    static final int OPCODE_RESET_ITEM = 1905;

    /** NPC action-slot opcodes (index 0..4). */
    private static final int[] NPC_OPCODES = {25, 20, 44, 46, 60};
    /** Object action-slot opcodes (index 0..4). */
    private static final int[] OBJECT_OPCODES = {3, 4, 9, 59, 1007};
    /**
     * Interface item / component ops used by inventory + bank.
     * 18 / 1011 = CC_OP slots; 13 = Use / target.
     */
    private static final int[] ITEM_OPCODES = {18, 1011, 13};

    /**
     * Legacy tip-sort sentinel — <b>do not write into {@link MenuEntry#cursorId}</b>.
     * That field is the Jagex cursor-sprite definition id (see {@link Component373#applyCustomCursor}).
     * Tip forcing uses {@link Component192#menuTip} assignment instead.
     */
    static final int PRIORITY_PREFERRED = 0x7ffffffe;

    private static final String FILE_NAME = "default-click.properties";
    /** Lilac — same vivid palette as NPC yellow / object cyan. */
    private static final String COL_ACCENT = "<col=ff80ff>";
    private static final String COL_END = "</col>";

    private static final Map<Integer, String> npcDefaults = new HashMap<Integer, String>();
    private static final Map<Integer, String> objectDefaults = new HashMap<Integer, String>();
    /** Item def id → preferred option name (Wear, Drop, Withdraw-All, …). */
    private static final Map<Integer, String> itemDefaults = new HashMap<Integer, String>();
    private static boolean loaded;

    private DefaultClickSwapper() {
    }

    static String getPreferredNpcAction(int compositionId) {
        ensureLoaded();
        return npcDefaults.get(Integer.valueOf(compositionId));
    }

    /** @deprecated use {@link #getPreferredNpcAction(int)} */
    static String getPreferredAction(int compositionId) {
        return getPreferredNpcAction(compositionId);
    }

    static String getPreferredObjectAction(int objectId) {
        ensureLoaded();
        return objectDefaults.get(Integer.valueOf(objectId));
    }

    static String getPreferredItemAction(int itemId) {
        ensureLoaded();
        if (itemId <= 0) {
            return null;
        }
        return itemDefaults.get(Integer.valueOf(itemId));
    }

    static void injectNpcMenu(Npc npc, NpcComposition composition) {
        if (npc == null || composition == null) {
            return;
        }
        ensureLoaded();
        String[] actions = composition.actions;
        if (actions == null) {
            return;
        }
        int compositionId = composition.id;
        String current = npcDefaults.get(Integer.valueOf(compositionId));
        injectActionRows(actions, current, OPCODE_SET_NPC, OPCODE_RESET_NPC, compositionId);
    }

    static void injectObjectMenu(ObjectDefinition object) {
        if (object == null) {
            return;
        }
        ensureLoaded();
        String[] actions = object.aStringArray913;
        if (actions == null) {
            return;
        }
        int objectId = object.anInt941;
        String current = objectDefaults.get(Integer.valueOf(objectId));
        injectActionRows(actions, current, OPCODE_SET_OBJECT, OPCODE_RESET_OBJECT, objectId);
    }

    /**
     * Inject Default rows for an inventory / bank item component.
     * Options come from the widget strings already used to build the menu
     * ({@link Component63#getComponentOption}) — covers Wear/Drop and bank Withdraw-*.
     */
    static void injectItemMenu(DisplayModeManagerContainer57 component) {
        if (component == null || component.itemId <= 0) {
            return;
        }
        ensureLoaded();
        int itemId = component.itemId;
        String current = itemDefaults.get(Integer.valueOf(itemId));
        // Collect unique option labels from the same slots the menu builder uses.
        java.util.LinkedHashSet unique = new java.util.LinkedHashSet();
        for (int i = 0; i <= 9; i++) {
            String opt = Component63.getComponentOption(i, component, true);
            if (opt == null || opt.length() == 0) {
                continue;
            }
            if (opt.startsWith("Hidden-")) {
                continue;
            }
            if (isSkippedItemOption(opt)) {
                continue;
            }
            unique.add(opt);
        }
        String use = DisplayModeManagerContainer295.getUseOption(0, component);
        if (use != null && use.length() > 0 && !isSkippedItemOption(use)) {
            unique.add(use);
        }
        // Nothing to choose when left-click already has only one real option.
        if (unique.size() <= 1) {
            return;
        }
        for (Object o : unique) {
            String action = (String) o;
            if (current != null && current.equalsIgnoreCase(action)) {
                continue;
            }
            DisplayModeManagerContainer368.addMenuEntry(
                    false, "", 0, (byte) -93, true, 0, -1, true,
                    OPCODE_SET_ITEM, 0L, COL_ACCENT + "Default: " + COL_END + action, (long) itemId, 0);
        }
        if (current != null) {
            DisplayModeManagerContainer368.addMenuEntry(
                    false, "", 0, (byte) -93, true, 0, -1, true,
                    OPCODE_RESET_ITEM, 0L, COL_ACCENT + "Default: " + COL_END + "Reset", (long) itemId, 0);
        }
    }

    private static boolean isSkippedItemOption(String action) {
        if (action.equalsIgnoreCase("Examine") || action.equalsIgnoreCase("Cancel")
                || action.equalsIgnoreCase("Walk here") || action.equalsIgnoreCase("Continue")) {
            return true;
        }
        return false;
    }

    private static void injectActionRows(String[] actions, String current, int setOp, int resetOp, int id) {
        int optionCount = 0;
        for (int i = 0; i < actions.length && i < 5; i++) {
            String action = actions[i];
            if (action != null && action.length() > 0) {
                optionCount++;
            }
        }
        // Nothing to choose when left-click already has only one real option.
        if (optionCount <= 1) {
            return;
        }
        for (int i = 0; i < actions.length && i < 5; i++) {
            String action = actions[i];
            if (action == null || action.length() == 0) {
                continue;
            }
            if (current != null && current.equalsIgnoreCase(action)) {
                continue;
            }
            // Include Attack / Chop / everything — only "Default: " is lilac.
            DisplayModeManagerContainer368.addMenuEntry(
                    false, "", 0, (byte) -93, true, 0, -1, true,
                    setOp, 0L, COL_ACCENT + "Default: " + COL_END + action, (long) id, 0);
        }
        if (current != null) {
            DisplayModeManagerContainer368.addMenuEntry(
                    false, "", 0, (byte) -93, true, 0, -1, true,
                    resetOp, 0L, COL_ACCENT + "Default: " + COL_END + "Reset", (long) id, 0);
        }
    }

    /**
     * @return entry that should be left-click tip, or null
     */
    static MenuEntry applySwaps() {
        ensureLoaded();
        if ((npcDefaults.isEmpty() && objectDefaults.isEmpty() && itemDefaults.isEmpty())
                || DisplayModeManagerContainer306.menuEntryCount <= 1) {
            return null;
        }
        MenuEntry preferred = null;
        for (MenuEntry entry = (MenuEntry) DefinitionSub4.menuEntries.first(4);
             entry != null;
             entry = (MenuEntry) DefinitionSub4.menuEntries.next((byte) 83)) {
            if (entry.option == null) {
                continue;
            }
            int opcode = entry.opcode;
            if (opcode >= 2000) {
                opcode -= 2000;
            }
            String wanted = null;
            if (isNpcOpcode(opcode)) {
                NpcComposition composition = compositionForNpcEntry(entry);
                if (composition != null) {
                    wanted = npcDefaults.get(Integer.valueOf(composition.id));
                }
            } else if (isObjectOpcode(opcode)) {
                int objectId = (int) (entry.identifier >>> 32);
                wanted = objectDefaults.get(Integer.valueOf(objectId));
            } else if (isItemOpcode(opcode)) {
                // itemId = item id (class46.itemId) for CC_OP / Use rows
                int itemId = entry.itemId;
                if (itemId > 0) {
                    wanted = itemDefaults.get(Integer.valueOf(itemId));
                }
            }
            if (wanted != null && entry.option.equalsIgnoreCase(wanted)) {
                preferred = entry;
            }
        }
        if (preferred == null) {
            return null;
        }
        // Keep preferred.cursorId intact — it is the cursor sprite id, not a sort key.
        // Tip is forced via Component192.menuTip in updateMenuTip.
        DefinitionSub4.menuEntries.addTail(preferred, -20180);
        int prefOp = preferred.opcode >= 2000 ? preferred.opcode - 2000 : preferred.opcode;
        // Opcode 1011 = high CC_OP: client treats tip-1011 as "open menu" on left-click
        // (Component203.method2485). Same packet path as 18 — rewrite so tap executes.
        if (prefOp == 1011) {
            preferred.opcode = preferred.opcode >= 2000 ? 2018 : 18;
            prefOp = 18;
        }
        if (isNpcOpcode(prefOp) && !preferred.option.equalsIgnoreCase(attackLabel())) {
            demoteAttackNear(preferred);
        }
        System.out.println("void-osrs default-click apply → '" + preferred.option
                + "' op=" + preferred.opcode);
        return preferred;
    }

    /** @deprecated use {@link #applySwaps()} */
    static MenuEntry applyNpcSwaps() {
        return applySwaps();
    }

    static boolean handleMenuAction(MenuEntry entry) {
        if (entry == null) {
            return false;
        }
        int opcode = entry.opcode;
        if (opcode >= 2000) {
            opcode -= 2000;
        }
        int id = (int) entry.identifier;
        String label = stripDefaultLabel(entry.option);
        if (opcode == OPCODE_SET_NPC) {
            setDefault(npcDefaults, "npc", id, label);
            return true;
        }
        if (opcode == OPCODE_RESET_NPC) {
            clearDefault(npcDefaults, "npc", id);
            return true;
        }
        if (opcode == OPCODE_SET_OBJECT) {
            setDefault(objectDefaults, "object", id, label);
            return true;
        }
        if (opcode == OPCODE_RESET_OBJECT) {
            clearDefault(objectDefaults, "object", id);
            return true;
        }
        if (opcode == OPCODE_SET_ITEM) {
            setDefault(itemDefaults, "item", id, label);
            return true;
        }
        if (opcode == OPCODE_RESET_ITEM) {
            clearDefault(itemDefaults, "item", id);
            return true;
        }
        return false;
    }

    private static String stripDefaultLabel(String label) {
        if (label == null) {
            return null;
        }
        label = label.replace(COL_ACCENT, "").replace("<col=0000ff>", "")
                .replace("<col=ffff00>", "").replace("<col=ffffff>", "")
                .replace(COL_END, "");
        if (label.startsWith("Default: ")) {
            label = label.substring(9);
        }
        return label.trim();
    }

    private static void setDefault(Map<Integer, String> map, String kind, int id, String actionName) {
        ensureLoaded();
        if (id <= 0 || actionName == null || actionName.length() == 0) {
            System.out.println("void-osrs default-click refuse " + kind + " id=" + id + " action=" + actionName);
            return;
        }
        map.put(Integer.valueOf(id), actionName);
        save();
        ShaderProgramSub2.addChatMessage("", 5, (byte) -100, 0,
                COL_ACCENT + "Default left-click set to '" + actionName + "'." + COL_END, "", "");
        System.out.println("void-osrs default-click " + kind + "=" + id + " → " + actionName);
    }

    private static void clearDefault(Map<Integer, String> map, String kind, int id) {
        ensureLoaded();
        map.remove(Integer.valueOf(id));
        save();
        ShaderProgramSub2.addChatMessage("", 5, (byte) -100, 0,
                COL_ACCENT + "Default left-click reset." + COL_END, "", "");
        System.out.println("void-osrs default-click " + kind + "=" + id + " reset");
    }

    private static void demoteAttackNear(MenuEntry preferred) {
        String attack = attackLabel();
        int npcIndex = (int) preferred.identifier;
        for (MenuEntry entry = (MenuEntry) DefinitionSub4.menuEntries.first(4);
             entry != null;
             entry = (MenuEntry) DefinitionSub4.menuEntries.next((byte) 83)) {
            if (!isNpcOpcode(entry.opcode >= 2000 ? entry.opcode - 2000 : entry.opcode)) {
                continue;
            }
            if ((int) entry.identifier != npcIndex) {
                continue;
            }
            if (entry.option == null || !entry.option.equalsIgnoreCase(attack)) {
                continue;
            }
            if (entry.opcode < 2000) {
                entry.opcode += 2000;
            }
            // Do not touch entry.cursorId — it is the cursor sprite id.
        }
    }

    private static boolean isNpcOpcode(int opcode) {
        for (int i = 0; i < NPC_OPCODES.length; i++) {
            if (NPC_OPCODES[i] == opcode) {
                return true;
            }
        }
        return false;
    }

    private static boolean isObjectOpcode(int opcode) {
        for (int i = 0; i < OBJECT_OPCODES.length; i++) {
            if (OBJECT_OPCODES[i] == opcode) {
                return true;
            }
        }
        return false;
    }

    private static boolean isItemOpcode(int opcode) {
        for (int i = 0; i < ITEM_OPCODES.length; i++) {
            if (ITEM_OPCODES[i] == opcode) {
                return true;
            }
        }
        return false;
    }

    private static NpcComposition compositionForNpcEntry(MenuEntry entry) {
        NpcNode node = (NpcNode) Component21.aClass356_3654.get((int) entry.identifier, -6008);
        if (node == null) {
            return null;
        }
        Npc npc = node.npc;
        if (npc == null) {
            return null;
        }
        NpcComposition composition = npc.definition;
        if (composition != null && composition.anIntArray1377 != null) {
            composition = composition.method794(DisplayModeManagerContainer58.aClass170_10209, -1);
        }
        return composition;
    }

    private static String attackLabel() {
        return FriendsIgnoreList.aClass274_3506.getLocalized(ObjectDeserializer.languageId, 544);
    }

    private static void ensureLoaded() {
        if (loaded) {
            return;
        }
        loaded = true;
        File file = storageFile();
        if (!file.isFile()) {
            return;
        }
        Properties props = new Properties();
        FileInputStream in = null;
        try {
            in = new FileInputStream(file);
            props.load(in);
            for (Map.Entry<Object, Object> e : props.entrySet()) {
                String key = String.valueOf(e.getKey());
                String value = String.valueOf(e.getValue()).trim();
                if (value.length() == 0 || value.matches("\\d+")) {
                    continue;
                }
                try {
                    if (key.startsWith("npc_")) {
                        int id = Integer.parseInt(key.substring(4));
                        if (id > 0) {
                            npcDefaults.put(Integer.valueOf(id), value);
                        }
                    } else if (key.startsWith("object_")) {
                        int id = Integer.parseInt(key.substring(7));
                        if (id > 0) {
                            objectDefaults.put(Integer.valueOf(id), value);
                        }
                    } else if (key.startsWith("item_")) {
                        int id = Integer.parseInt(key.substring(5));
                        if (id > 0) {
                            itemDefaults.put(Integer.valueOf(id), value);
                        }
                    }
                } catch (NumberFormatException ignored) {
                    // skip
                }
            }
            System.out.println("void-osrs default-click loaded npc=" + npcDefaults.size()
                    + " object=" + objectDefaults.size() + " item=" + itemDefaults.size());
        } catch (Exception e) {
            System.out.println("void-osrs default-click load failed: " + e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception ignored) {
                }
            }
        }
    }

    private static void save() {
        Properties props = new Properties();
        for (Map.Entry<Integer, String> e : npcDefaults.entrySet()) {
            props.setProperty("npc_" + e.getKey().intValue(), e.getValue());
        }
        for (Map.Entry<Integer, String> e : objectDefaults.entrySet()) {
            props.setProperty("object_" + e.getKey().intValue(), e.getValue());
        }
        for (Map.Entry<Integer, String> e : itemDefaults.entrySet()) {
            props.setProperty("item_" + e.getKey().intValue(), e.getValue());
        }
        File file = storageFile();
        FileOutputStream out = null;
        try {
            File parent = file.getParentFile();
            if (parent != null && !parent.exists()) {
                parent.mkdirs();
            }
            out = new FileOutputStream(file);
            props.store(out, "void-osrs default left-click (npc_/object_/item_=actionName)");
        } catch (Exception e) {
            System.out.println("void-osrs default-click save failed: " + e.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (Exception ignored) {
                }
            }
        }
    }

    private static File storageFile() {
        String home = System.getProperty("user.home", ".");
        return new File(new File(home, ".void-osrs"), FILE_NAME);
    }
}
