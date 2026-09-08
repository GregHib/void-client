/**
 * One right-click / left-click menu row (option + target + opcode + params).
 * <p>
 * Built by {@link DisplayModeManagerContainer368#addMenuEntry} while hovering NPCs / objects /
 * widgets; sorted into {@link DefinitionSub4#menuEntries}; the tip row
 * lives in {@link Component192#menuTip}. Left-click or menu pick runs
 * {@link ColoredTextBuilder#processMenuAction}, which turns the opcode into a game packet.
 * <p>
 * Custom Void opcodes in the 1900-range (DefaultClickSwapper, JoystickAlias,
 * Microbot toggle) are intercepted client-side and never sent.
 * <p>
 * Microbot plants synthetic rows with real game opcodes, then calls
 * {@link ColoredTextBuilder#processMenuAction} on the client thread.
 */
final class MenuEntry extends HashNode {

    /**
     * Left-side option text shown in the menu, e.g. {@code "Attack"},
     * {@code "Walk here"}, {@code "Wear"}. May include {@code <col=…>} tags.
     */
    String option;

    /** Unused / leftover deob field (kept for binary layout parity). */
    static int anInt9594;
    /**
     * Optional third tip fragment after {@link #option} / {@link #target}
     * (e.g. player name painted onto Walk-here when hovering a player).
     */
    String extraTarget;
    static int anInt9596;

    /** Construction flag from {@link DisplayModeManagerContainer368#addMenuEntry} (bool arg). */
    boolean aBoolean9597;
    static int anInt9598;

    /**
     * Item id on interface / inventory rows ({@link DisplayModeManagerContainer57#itemId}), or
     * {@code -1} for world entities.
     */
    int itemId;

    /**
     * Submenu / target grouping key (NPC index, object hash, …) used when
     * collapsing rows that share a target string.
     */
    long groupKey;

    /**
     * Right-side target text, e.g. {@code "<col=ffff00>Goblin"} or widget name.
     */
    String target;

    /**
     * First action param — local tile X for walk / object, component child for
     * interface ops ({@link DisplayModeManagerContainer57#childIndex}).
     */
    int param0;

    static LruCache aClass356_9603;
    /** Number of ignore-list entries (max 100). */
    static int ignoreCount = 0;

    /**
     * Entity / action identifier consumed by {@link ColoredTextBuilder#processMenuAction}:
     * NPC index, packed object id (high bits), walk flag, etc.
     */
    long identifier;

    static int anInt9606;

    /**
     * Second action param — local tile Y for walk / object, packed interface id
     * for CC_OP ({@link DisplayModeManagerContainer57#packedId}).
     */
    int param1;

    /**
     * Menu opcode. Stock game values (Attack=25/20/…, Walk=19, object 3/4/9/…).
     * Values {@code >= 2000} are shift-variants ({@code opcode - 2000} before send).
     * Void client-only ops live in 1900–1911 (DefaultClick, Microbot, JoystickAlias).
     */
    int opcode;

    /**
     * Cursor sprite definition id for the hover tip ({@link Component373#applyCustomCursor}
     * via {@link DisplayModeManagerContainer67#getTipCursorId}).
     * Stock Jagex also uses higher values as a soft left-click tip weight when
     * picking from the list — Void DefaultClick / Microbot must <b>not</b> overwrite
     * this with a sentinel, or the pointer sticks on the default left-click cursor.
     */
    int cursorId;

    boolean aBoolean9610;
    boolean aBoolean9611;
    static int[] anIntArray9612;

    public static void clearStatics(int i) {
        anIntArray9612 = null;
        int i_0_ = 29 / ((31 - i) / 43);
        aClass356_9603 = null;
    }

    /**
     * Current window mode id: {@code 3}=fullscreen Frame, {@code 2}=FS available,
     * {@code 1}=windowed / FS unavailable. Used by display-mode and error paths.
     */
    static final int getWindowMode(int i) {
        anInt9596++;
        if (Component225.aFrame476 != null) return 3;
        if (i >= -59) ignoreCount = 79;
        if (!Cp1252Decoder.fullscreenAvailable) return 1;
        return 2;
    }

    /** Install (or clear) the size-bucketed {@code byte[][][]} pools used by buffer allocators. */
    static final void initArrayPools(int[] is, int[] is_1_, int i) {
        try {
            anInt9606++;
            if (is == null || is_1_ == null) {
                DefinitionSub6.aByteArrayArrayArray9134 = null;
                DisplayModeManagerContainer56.anIntArray2552 = null;
                Component317.anIntArray8684 = null;
            } else {
                Component317.anIntArray8684 = is;
                DisplayModeManagerContainer56.anIntArray2552 = new int[is.length];
                DefinitionSub6.aByteArrayArrayArray9134 = new byte[is.length][][];
                for (int i_2_ = i; i_2_ < Component317.anIntArray8684.length; i_2_++)
                    DefinitionSub6.aByteArrayArrayArray9134[i_2_] = new byte[is_1_[i_2_]][];
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("db.D(" + (is != null ? "{...}" : "null") + ',' + (is_1_ != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    /**
     * Scripted/cutscene camera: aim at tile ({@code i_3_},{@code i}) with height offset,
     * set {@link DefinitionSub21#cameraMode}=2, and compute pitch/yaw toward the target.
     */
    static final void setCutsceneCamera(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
        if (i_7_ > -123) getWindowMode(14);
        Component205.anInt5973 = i_5_;
        Component221.anInt1797 = i_4_;
        Component48.anInt4336 = i_3_;
        OpenGlShader.anInt7403 = i_6_;
        anInt9598++;
        Component337.anInt3647 = i;
        if (Component205.anInt5973 >= 100) {
            int i_8_ = Component48.anInt4336 * 512 - -256;
            int i_9_ = Component337.anInt3647 * 512 - -256;
            int i_10_ = (Component300.method2064(i_8_, Component117.anInt4372, 11219, i_9_) + -Component221.anInt1797);
            int i_11_ = i_8_ - WaterSurfaceShader.anInt6246;
            int i_12_ = -DisplayModeManagerContainer50.anInt3855 + i_10_;
            int i_13_ = i_9_ - Component317.anInt8685;
            int i_14_ = (int) Math.sqrt(i_11_ * i_11_ + i_13_ * i_13_);
            HashNodeSub19.anInt9701 = (int) (Math.atan2(i_12_, i_14_) * 2607.5945876176133) & 0x3fff;
            Component298.anInt4638 = (int) (-2607.5945876176133 * Math.atan2(i_11_, i_13_)) & 0x3fff;
            if (HashNodeSub19.anInt9701 < 1024) HashNodeSub19.anInt9701 = 1024;
            Component103.anInt4186 = 0;
            if (HashNodeSub19.anInt9701 > 3072) HashNodeSub19.anInt9701 = 3072;
        }
        DefinitionSub21.cameraMode = 2;
        JaclibLoader.anInt167 = ShaderLinker.anInt10163 = -1;
    }

    /**
     * @param option   menu option label
     * @param target   coloured target name
     * @param cursorId cursor sprite definition id
     * @param opcode   menu opcode (see field docs)
     * @param itemId   item id or -1
     * @param identifier entity/action id (see field docs)
     * @param param0   first param (tile X / child)
     * @param param1   second param (tile Y / iface)
     */
    MenuEntry(String option, String target, int cursorId, int opcode, int itemId, long identifier, int param0, int param1, boolean bool, boolean bool_20_, long groupKey, boolean bool_22_) {
        try {
            this.param1 = param1;
            this.opcode = opcode;
            this.itemId = itemId;
            this.identifier = identifier;
            this.aBoolean9610 = bool;
            this.aBoolean9597 = bool_20_;
            this.target = target;
            this.aBoolean9611 = bool_22_;
            this.option = option;
            this.cursorId = cursorId;
            this.groupKey = groupKey;
            this.param0 = param0;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("db.<init>(" + (option != null ? "{...}" : "null") + ',' + (target != null ? "{...}" : "null") + ',' + cursorId + ',' + opcode + ',' + itemId + ',' + identifier + ',' + param0 + ',' + param1 + ',' + bool + ',' + bool_20_ + ',' + groupKey + ',' + bool_22_ + ')'));
        }
    }

    static {
        aClass356_9603 = new LruCache(16);
        anIntArray9612 = new int[8];
    }
}
