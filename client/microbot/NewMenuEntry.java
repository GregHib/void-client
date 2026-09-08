/**
 * Desired menu action for Microbot menu-inject.
 * <p>
 * Mirrors Microbot's {@code NewMenuEntry}: scripts build one of these, then
 * {@link Microbot#doInvoke} sets {@link Microbot#targetMenu} and clicks; the
 * client tip is forced to this entry so {@link ColoredTextBuilder#method2599} runs the
 * real game opcode (not a Void 1900-range client-only op).
 * <p>
 * Field mapping onto {@link MenuEntry}:
 * <ul>
 *   <li>option → {@code option}</li>
 *   <li>target → {@code target}</li>
 *   <li>opcode → {@code opcode}</li>
 *   <li>identifier → {@code identifier} (NPC index, object packed id, …)</li>
 *   <li>param0 → {@code param0} (local tile X / slot)</li>
 *   <li>param1 → {@code param1} (local tile Y / iface packed)</li>
 *   <li>itemId → {@code itemId}</li>
 * </ul>
 */
final class NewMenuEntry {

    private String option = "";
    private String target = "";
    private int opcode;
    private long identifier;
    private int param0;
    private int param1;
    private int itemId = -1;

    NewMenuEntry() {
    }

    NewMenuEntry(String option, String target, int opcode, long identifier, int param0, int param1, int itemId) {
        this.option = option != null ? option : "";
        this.target = target != null ? target : "";
        this.opcode = opcode;
        this.identifier = identifier;
        this.param0 = param0;
        this.param1 = param1;
        this.itemId = itemId;
    }

    String getOption() {
        return option;
    }

    NewMenuEntry setOption(String option) {
        this.option = option != null ? option : "";
        return this;
    }

    String getTarget() {
        return target;
    }

    NewMenuEntry setTarget(String target) {
        this.target = target != null ? target : "";
        return this;
    }

    int getOpcode() {
        return opcode;
    }

    NewMenuEntry setOpcode(int opcode) {
        this.opcode = opcode;
        return this;
    }

    long getIdentifier() {
        return identifier;
    }

    NewMenuEntry setIdentifier(long identifier) {
        this.identifier = identifier;
        return this;
    }

    int getParam0() {
        return param0;
    }

    NewMenuEntry setParam0(int param0) {
        this.param0 = param0;
        return this;
    }

    int getParam1() {
        return param1;
    }

    NewMenuEntry setParam1(int param1) {
        this.param1 = param1;
        return this;
    }

    int getItemId() {
        return itemId;
    }

    NewMenuEntry setItemId(int itemId) {
        this.itemId = itemId;
        return this;
    }

    public String toString() {
        return "NewMenuEntry{op=" + option + " target=" + target + " opcode=" + opcode
                + " id=" + identifier + " p0=" + param0 + " p1=" + param1 + " item=" + itemId + "}";
    }
}
