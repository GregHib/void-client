/**
 * Bank facade — open/close detection by widget text / item grid, deposit/withdraw
 * via menu-inject on bank item components.
 */
final class Rs2Bank {

    private Rs2Bank() {
    }

    static boolean isOpen() {
        DisplayModeManagerContainer57 title = Rs2Widget.findByText("Bank of");
        if (title != null && Rs2Widget.isVisible(title)) {
            return true;
        }
        // Many banks show "The Bank of" or just Withdraw options densely
        DisplayModeManagerContainer57[] bankSlots = bankSlots();
        return bankSlots.length >= 20;
    }

    static boolean close() {
        DisplayModeManagerContainer57 close = Rs2Widget.findByText("Close");
        if (close != null) {
            return Rs2Widget.click(close, "Close");
        }
        // Escape via keyboard
        Rs2Keyboard.keyPress(27);
        return true;
    }

    static boolean depositAll(int itemId) {
        DisplayModeManagerContainer57 slot = Rs2Inventory.findSlot(itemId);
        if (slot == null) {
            return false;
        }
        return Rs2Inventory.interact(itemId, "Deposit-All")
                || Rs2Inventory.interact(itemId, "Deposit All")
                || Rs2Widget.click(slot, "Deposit-All");
    }

    static boolean withdraw(int itemId, String action) {
        DisplayModeManagerContainer57[] slots = bankSlots();
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] != null && slots[i].itemId == itemId) {
                NewMenuEntry entry = new NewMenuEntry(action != null ? action : "Withdraw-1",
                        slots[i].text != null ? slots[i].text : "",
                        Rs2Widget.OPCODE_CC_OP, 1L, slots[i].childIndex, slots[i].packedId, itemId);
                Microbot.doInvoke(entry);
                return true;
            }
        }
        return false;
    }

    static boolean withdrawOne(int itemId) {
        return withdraw(itemId, "Withdraw-1") || withdraw(itemId, "Withdraw-X");
    }

    /**
     * Open nearest banker NPC or bank booth object by interacting "Bank".
     */
    static boolean open() {
        if (isOpen()) {
            return true;
        }
        Npc banker = Rs2Npc.getNearest("Banker");
        if (banker != null && Rs2Npc.interact(banker, "Bank")) {
            return true;
        }
        return Rs2GameObject.interactNearest("Bank booth", "Use")
                || Rs2GameObject.interactNearest("Bank booth", "Bank")
                || Rs2GameObject.interactNearest("Bank chest", "Use");
    }

    static DisplayModeManagerContainer57[] bankSlots() {
        java.util.ArrayList list = new java.util.ArrayList();
        if (DefinitionSub33.openInterfaces == null) {
            return new DisplayModeManagerContainer57[0];
        }
        // Prefer configured bank group, else largest item grid that isn't inventory-sized (28)
        collect(MicrobotWidgets.BANK_GROUP, list);
        if (list.size() < 20) {
            list.clear();
            DisplayModeManagerContainer57[][] roots = DefinitionSub33.openInterfaces;
            int best = 0;
            java.util.ArrayList bestList = new java.util.ArrayList();
            for (int g = 0; g < roots.length; g++) {
                java.util.ArrayList tmp = new java.util.ArrayList();
                collect(g, tmp);
                if (tmp.size() > best && tmp.size() > 28) {
                    best = tmp.size();
                    bestList = tmp;
                }
            }
            list = bestList;
        }
        return (DisplayModeManagerContainer57[]) list.toArray(new DisplayModeManagerContainer57[list.size()]);
    }

    private static void collect(int group, java.util.ArrayList list) {
        if (DefinitionSub33.openInterfaces == null) {
            return;
        }
        if (group < 0 || group >= DefinitionSub33.openInterfaces.length) {
            return;
        }
        DisplayModeManagerContainer57[] all = DefinitionSub33.openInterfaces[group];
        if (all == null) {
            return;
        }
        for (int i = 0; i < all.length; i++) {
            walk(all[i], list);
        }
    }

    private static void walk(DisplayModeManagerContainer57 c, java.util.ArrayList list) {
        if (c == null) {
            return;
        }
        if (c.itemId > 0) {
            list.add(c);
        }
        if (c.children != null) {
            for (int i = 0; i < c.children.length; i++) {
                walk(c.children[i], list);
            }
        }
    }
}
