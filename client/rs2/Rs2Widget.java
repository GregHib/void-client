/**
 * Widget tree helpers — find by text / packed id, click via menu-inject.
 * Interface item ops: 18 / 1011 (CC_OP), 13 (Use) — see {@link Component66}.
 */
final class Rs2Widget {

    static final int OPCODE_CC_OP = 18;
    static final int OPCODE_CC_OP_HIGH = 1011;
    static final int OPCODE_USE = 13;

    private Rs2Widget() {
    }

    static DisplayModeManagerContainer57 get(int packedId) {
        return MicrobotWidgets.get(packedId);
    }

    static boolean isVisible(DisplayModeManagerContainer57 w) {
        return w != null && !w.hidden;
    }

    static DisplayModeManagerContainer57 findByText(String text) {
        if (text == null || DefinitionSub33.openInterfaces == null) {
            return null;
        }
        DisplayModeManagerContainer57[][] roots = DefinitionSub33.openInterfaces;
        for (int g = 0; g < roots.length; g++) {
            DisplayModeManagerContainer57[] all = roots[g];
            if (all == null) {
                continue;
            }
            for (int i = 0; i < all.length; i++) {
                DisplayModeManagerContainer57 c = all[i];
                if (c == null) {
                    continue;
                }
                if (c.text != null && c.text.toLowerCase().indexOf(text.toLowerCase()) >= 0) {
                    return c;
                }
                if (c.children != null) {
                    DisplayModeManagerContainer57 nested = findInChildren(c.children, text);
                    if (nested != null) {
                        return nested;
                    }
                }
            }
        }
        return null;
    }

    private static DisplayModeManagerContainer57 findInChildren(DisplayModeManagerContainer57[] kids, String text) {
        if (kids == null) {
            return null;
        }
        for (int i = 0; i < kids.length; i++) {
            DisplayModeManagerContainer57 c = kids[i];
            if (c == null) {
                continue;
            }
            if (c.text != null && c.text.toLowerCase().indexOf(text.toLowerCase()) >= 0) {
                return c;
            }
            if (c.children != null) {
                DisplayModeManagerContainer57 nested = findInChildren(c.children, text);
                if (nested != null) {
                    return nested;
                }
            }
        }
        return null;
    }

    /**
     * Left-click a component option (Wear / Withdraw-1 / …) via menu inject.
     */
    static boolean click(DisplayModeManagerContainer57 component, String option) {
        if (component == null || option == null) {
            return false;
        }
        int packed = (component.childIndex << 0) | component.packedId;
        NewMenuEntry entry = new NewMenuEntry(option, component.text != null ? component.text : "",
                OPCODE_CC_OP, 1L, component.childIndex, component.packedId, component.itemId);
        // identifier for item rows is often 1+slot — anInt9605 from method466 uses 1+i
        entry.setIdentifier(1L);
        entry.setParam0(component.childIndex);
        entry.setParam1(component.packedId);
        Microbot.doInvoke(entry);
        return true;
    }

    static boolean click(String text) {
        DisplayModeManagerContainer57 w = findByText(text);
        return w != null && click(w, text);
    }
}
