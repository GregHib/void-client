/* DisplayModeManagerContainer57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer57
/**
 * Interface / HUD component (widget). Holds layout, scripts, and — for inventory
 * slots — {@link #itemId}, {@link #optionLabels}, and packed interface ids used
 * when building right-click menus via {@link Component66#buildComponentMenu}.
 * <p>
 * Prayer-book icons often share one parent {@link #packedId}; distinguish them with
 * {@link #childIndex} via {@link NpcNode#getChildComponent}. Minimap quick-prayer
 * orb (group 749 on current build) exposes {@code Turn quick prayers on} /
 * {@code Turn prayers off} + {@code Select quick prayers}.
 * <p>
 * RENAMED from {@code Class46} (JODE-obfuscated).
 */ {
    Object[] anObjectArray671;
    /** Type-5 item sprite outline thickness (passed to itemDefs.method1941). */
    int outline;
    /** Type-4 text vertical line spacing (pixels); also wraps via font metrics. */
    int lineHeight = 0;
    int anInt674;
    int anInt675;
    boolean aBoolean676;
    int[] anIntArray677;
    int anInt678 = 2;
    Object[] anObjectArray679;
    Object[] anObjectArray680;
    /**
     * Y position mode for {@link #relativeY} → {@link #absoluteY} (see {@link Component19}).
     * 0 absolute, 1 centre, 2 from-bottom, 3/4 proportional (14-bit).
     */
    byte yMode;
    boolean aBoolean682;
    Object[] anObjectArray683;
    static int anInt684;
    Object[] anObjectArray685;
    int[] anIntArray686;
    Object[] anObjectArray687;
    int anInt688 = 0;
    boolean aBoolean689;
    /** Type-9 line thickness in pixels. */
    int lineWidth;
    static int anInt691;
    Object[] anObjectArray692;
    int anInt693;
    static int anInt694;
    int anInt695;
    /**
     * Draw opacity 0..255 (0 = fully opaque). Combined into ARGB by
     * {@link ImageDefinition} as {@code (255 - opacity) << 24}.
     */
    int opacity = 0;
    /** Type-5: tile the sprite across the component bounds when true. */
    boolean spriteTiling;
    /**
     * Scrollable content width (type-0 layers). {@code 0} → use {@link #width}.
     * CS2 if_setscrollsize / scroll clamps use this.
     */
    int scrollWidth;
    int anInt699;
    /** Type-4 vertical text alignment passed to {@link BitmapFont#method2568}. */
    int yTextAlign;
    Object[] anObjectArray701;
    /** Type-4 bitmap font archive id ({@code 65535} → {@code -1}). */
    int fontId = -1;
    int anInt703;
    /** Child / slot index within the parent interface (menu {@code param0}). */
    int childIndex;
    int anInt705;
    /** Per-option tip priorities parallel to {@link #optionLabels} (higher = preferred left-click). */
    int[] optionPriorities;
    int[] anIntArray707;
    Object[] anObjectArray708;
    /** Layout width in pixels (decoded + CS2 if_setsize). */
    int width;
    int anInt710;
    private LruCache aClass356_711;
    static int anInt712;
    /** Tip priority for the Use / target option ({@link #useOption}). */
    int usePriority;
    Object[] anObjectArray714;
    int anInt715;
    int anInt716;
    int anInt717;
    static int anInt718;
    int anInt719;
    boolean aBoolean720;
    /**
     * Optional IF-archive debug name (decoded when type stream has bit 0x80).
     * Used by {@link JoystickAlias} label dumps alongside {@link #text}/{@link #textContent}.
     */
    String debugName;
    static int anInt722;
    int anInt723;
    /**
     * Height size mode for {@link #baseHeight} → {@link #height} (see {@link Component188}).
     * 0 absolute, 2 proportional (14-bit of parent), else parent-minus.
     */
    byte heightMode;
    int anInt725;
    int anInt726;
    Object[] anObjectArray727;
    /** Decoded height before mode/parent resolve (CS2 if_setsize writes here too). */
    int baseHeight;
    int anInt729;
    int anInt730;
    int[] anIntArray731;
    int anInt732;
    int anInt733;
    Object[] anObjectArray734;
    boolean aBoolean735;
    static int anInt736;
    boolean aBoolean737;
    int anInt738;
    /** Relative Y offset; combined with {@link #yMode} into {@link #absoluteY}. */
    int relativeY;
    RenderableSub10 aClass318_Sub10_740;
    /**
     * CS2 hooks for option clicks. When non-null,
     * {@link Component63#getComponentOption} still returns labels even if
     * {@link ComponentSettings#hasOption} is false (disabled-looking slots).
     */
    Object[] optionScripts;
    Object[] anObjectArray742;
    static int anInt743;
    boolean aBoolean744;
    boolean aBoolean745;
    byte[] aByteArray746;
    /** Horizontal scroll offset for type-0 layers (children drawn at {@code x - scrollX}). */
    int scrollX;
    /**
     * Default {@link ComponentSettings} from the IF archive entry.
     * Runtime overrides: {@code Component127.aClass356_2959} via
     * {@link client#getComponentSettings}.
     */
    ComponentSettings settings;
    /**
     * RGB (and sometimes ARGB) colour for rect fill, text, line, and graphic tint.
     * Drawn by {@link ImageDefinition} for types 3/4/5/9.
     */
    int colour;
    /** Absolute on-screen Y after {@link Component19} position resolve. */
    int absoluteY;
    Object[] anObjectArray751;
    /** Widget display / menu target text (item name, button label, …). */
    String text;
    int anInt753;
    boolean aBoolean754;
    /** Vertical scroll offset for type-0 layers (children drawn at {@code y - scrollY}). */
    int scrollY;
    /** Type-5 graphic / sprite archive id. */
    int spriteId;
    int anInt757;
    static int anInt758;
    int anInt759;
    int anInt760;
    Object[] anObjectArray761;
    /** Type-4 horizontal text alignment passed to {@link BitmapFont#method2568}. */
    int xTextAlign;
    Object[] anObjectArray763;
    Object[] anObjectArray764;
    /**
     * Special content type id — compared against constants for world-map, FPS overlay,
     * compass, etc. in {@link ImageDefinition} before the normal type switch.
     */
    int contentType;
    static int anInt766;
    static int anInt767;
    static int anInt768;
    /** Type-4: draw a drop shadow behind {@link #textContent}. */
    boolean textShadowed;
    int anInt770;
    int[] anIntArray771;
    int[] anIntArray772;
    int anInt773;
    /**
     * Interface component type (low 7 bits; bit 0x80 in the stream means an
     * optional debug name follows).
     * <ul>
     *   <li>0 — layer / scroll panel (has {@link #children})</li>
     *   <li>2 — inventory-style (full-clip draw path)</li>
     *   <li>3 — rectangle ({@link #filled} + {@link #colour})</li>
     *   <li>4 — text ({@link #textContent})</li>
     *   <li>5 — graphic / item sprite</li>
     *   <li>6 — 3D model</li>
     *   <li>9 — line</li>
     * </ul>
     * Used by {@link JoystickAlias} dumps and {@link ImageDefinition} draw switch.
     */
    int type;
    int anInt775;
    boolean aBoolean776;
    Object[] anObjectArray777;
    /**
     * Width size mode for {@link #baseWidth} → {@link #width} (see {@link Component188}).
     * 0 absolute, 2 proportional (14-bit of parent), 4 aspect-from-height, else parent-minus.
     */
    byte widthMode;
    int anInt779;
    /** "Use" / target-verb label (menu opcode 13). */
    String useOption;
    /** Stack size for {@link #itemId} (drawn as {@code xN} when &gt; 1). */
    int itemAmount;
    /** Parent widget in the interface tree ({@code null} for root components). */
    DisplayModeManagerContainer57 parent;
    static int anInt783;
    boolean aBoolean784;
    Object[] anObjectArray785;
    int anInt786;
    int anInt787;
    /** Relative X offset; combined with {@link #xMode} into {@link #absoluteX}. */
    int relativeX;
    /** Layout height in pixels (decoded + CS2 if_setsize). */
    int height;
    boolean aBoolean790;
    /**
     * Scrollable content height (type-0 layers). {@code 0} → use {@link #height}.
     */
    int scrollHeight;
    /**
     * Drawn string for type-4 text components (and item-name override when
     * {@link #itemId} is set). Distinct from {@link #text} (menu target / tip name).
     */
    String textContent;
    boolean aBoolean793;
    int anInt794;
    int anInt795;
    int anInt796;
    int anInt797;
    /**
     * Nested child components of this panel (layer / scroll / inventory grid).
     * Walked by layout, redraw, and helpers like {@link Rs2Widget#findByText}.
     */
    DisplayModeManagerContainer57[] children;
    int anInt799;
    /** Absolute on-screen X after {@link Component19} position resolve. */
    int absoluteX;
    int[] anIntArray801;
    static int anInt802;
    Object[] anObjectArray803;
    static int anInt804;
    Object[] anObjectArray805;
    int anInt806;
    Object[] anObjectArray807;
    int anInt808;
    /** Type-5 item sprite shadow / outline colour (OR'd with {@code ~0xffffff}). */
    int shadowColour;
    /** Type-3 rectangle: {@code true} = filled, {@code false} = outline. */
    boolean filled;
    Object[] anObjectArray811;
    /** Inventory / bank item def id held by this component ({@code -1} / {@code 0} = empty). */
    int itemId;
    /**
     * When {@code true}, the component is hidden (CS2 if_sethide / if_gethide bit 0x1).
     * {@link Rs2Widget#isVisible} returns false while this is set.
     */
    boolean hidden;
    int anInt814;
    Object[] anObjectArray815;
    /** Opcode-16 button label (Continue / custom); null → localized default. */
    String continueOption;
    /**
     * X position mode for {@link #relativeX} → {@link #absoluteX} (see {@link Component19}).
     * 0 absolute, 1 centre, 2 from-right, 3/4 proportional (14-bit).
     */
    byte xMode;
    int[] anIntArray818;
    static int anInt819;
    Object[] anObjectArray820;
    static byte[] aByteArray821 = new byte[32896];
    Object[] anObjectArray822;
    Object[] anObjectArray823;
    int anInt824;
    static int anInt825;
    int anInt826;
    static int anInt827;
    /** Type-5 sprite rotation angle (0 = upright; used by method981/method977). */
    int spriteAngle;
    static int anInt829;
    /** Packed interface id ({@code group << 16 | child}) — menu {@code param1}. */
    int packedId;
    int[] anIntArray831;
    byte[] aByteArray832;
    /** Right-click option labels (Wear, Drop, Eat, …) indexed 0..n. */
    String[] optionLabels;
    /**
     * Parent packed id from the IF stream ({@code 65535} → {@code -1}, else OR'd with
     * this component's high {@link #packedId} bits). Links {@link #parent} at load.
     */
    int parentId;
    int anInt835;
    Object[] anObjectArray836;
    static int anInt837;
    static Component169 aClass196_838;
    Object[] anObjectArray839;
    Object[] anObjectArray840;
    int anInt841;
    /** Decoded width before mode/parent resolve (CS2 if_setsize writes here too). */
    int baseWidth;

    static final void method424(int i, int i_0_, GraphicsToolkit var_ha, int i_1_, int i_2_, int i_3_, int i_4_, byte[][][] is, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
        try {
            anInt768++;
            if (i_7_ != i_1_ && i_3_ != 0) {
                if (i_7_ == 9) {
                    i_7_ = 1;
                    i_4_ = i_4_ - -1 & 0x3;
                }
                if (i_7_ == 10) {
                    i_4_ = 3 + i_4_ & 0x3;
                    i_7_ = 1;
                }
                if (i_7_ == 11) {
                    i_4_ = i_4_ + 3 & 0x3;
                    i_7_ = 8;
                }
                var_ha.Q(i_6_, i_9_, i_5_, i_8_, i_0_, i, is[i_7_ - 1][i_4_], i_3_, i_2_);
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("at.S(" + i + ',' + i_0_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (is != null ? "{...}" : "null") + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
        }
    }

    final Shader method425(GraphicsToolkit var_ha, byte i) {
        anInt767++;
        Shader var_aa = (Shader) ColoredText.aClass60_6096.get(this.packedId, 119);
        if (var_aa != null) return var_aa;
        Component170 class207 = Component170.method1521(Component327.aClass45_8755, this.spriteId, 0);
        if (class207 == null) return null;
        int i_10_ = (class207.anInt2703 + (class207.anInt2702 + class207.anInt2698));
        int i_11_ = (class207.anInt2700 + (class207.anInt2696 + class207.anInt2701));
        this.anIntArray772 = new int[i_11_];
        this.anIntArray677 = new int[i_11_];
        for (int i_12_ = 0; (i_12_ < class207.anInt2696); i_12_++) {
            int i_13_ = 0;
            for (int i_14_ = 0; (i_14_ < class207.anInt2702); i_14_++) {
                if ((class207.aByteArray2699[class207.anInt2702 * i_12_ + i_14_]) != 0) {
                    i_13_ = i_14_;
                    break;
                }
            }
            int i_15_ = i_10_;
            for (int i_16_ = i_13_; (i_16_ < class207.anInt2702); i_16_++) {
                if ((class207.aByteArray2699[class207.anInt2702 * i_12_ + i_16_]) == 0) {
                    i_15_ = i_16_;
                    break;
                }
            }
            this.anIntArray677[(class207.anInt2700 + i_12_)] = class207.anInt2703 + i_13_;
            this.anIntArray772[(i_12_ + class207.anInt2700)] = i_15_ + -i_13_;
        }
        if (i < 0) decode(null, false);
        var_aa = var_ha.method3661(i_10_, i_11_, this.anIntArray677, this.anIntArray772);
        ColoredText.aClass60_6096.putOne(var_aa, this.packedId, (byte) -104);
        return var_aa;
    }

    final BitmapFont method426(GraphicsToolkit var_ha, byte i) {
        anInt827++;
        BitmapFont class324 = DisplayModeManagerContainer194.method232(var_ha, (byte) -53, false, this.fontId);
        if (i != 68) method436(-71, -56, -125);
        HashNodeSub13.aBoolean9616 = class324 == null;
        return class324;
    }

    static final void method427(int i) {
        anInt837++;
        Component267.aClass268_2979.method2033((byte) 46);
        Component149.aClass183_4460.method1377(2);
        DefinitionSub25.aClass150_9342.method1204(0);
        GradientPreset.aClass263_9195.method2006(88);
        Component291.aClass278_2529.method2080(127);
        Exception_Sub1.itemDefinitions.method1938(126);
        RunescapeInfo.aClass87_191.method838(7);
        NsnDefinition.aClass319_9245.method2542(-101);
        Component267.aClass194_2981.method1443(83);
        Component209.aClass217_3453.method1590(0);
        DisplayModeManagerContainer282.aClass261_5558.removeSoft((byte) -91);
        Component245.aClass141_117.method1174((byte) -99);
        DisplayModeManagerContainer64.aClass153_9031.method1222(true);
        DisplayModeManagerContainer64.aClass187_9036.method1410(-27995);
        MatrixSub3.aClass326_5764.method2602(0);
        ComponentDownloader.aClass84_413.method816(false);
        Component132.aClass25_1813.method302(-797644856);
        NodeSub1.aClass185_6559.method1390(23);
        Component339.cursorDefinitions.method1283(1);
        Component257.aClass65_4787.method694(-1007);
        DisplayModeManagerContainer306.aClass219_4782.method1598(111);
        Component374.method2638(-4631);
        Component16.method1328(-26162);
        DefinitionSub20.method3102(22385);
        Component352.method386((byte) -106);
        ImageTagText.method1271(0);
        Component45.aClass60_4346.purgeSoftReferences(-108);
        ShaderCompilerSub2.aClass60_6517.purgeSoftReferences(-109);
        NodeSub1Sub1.aClass60_8807.purgeSoftReferences(-113);
        Component225.aClass60_463.purgeSoftReferences(-83);
        ClientScriptExecutor.aClass60_1174.purgeSoftReferences(-91);
        int i_17_ = 54 / ((26 - i) / 53);
    }

    final int method428(int i, int i_18_, int i_19_) {
        anInt736++;
        if (aClass356_711 == null) return i;
        if (i_19_ >= -124) this.yTextAlign = 46;
        NodeSub35 class348_sub35 = (NodeSub35) aClass356_711.get(i_18_, -6008);
        if (class348_sub35 == null) return i;
        return class348_sub35.intValue;
    }

    final String method429(int i, String string, int i_20_) {
        anInt783++;
        if (i_20_ != -1) method437(-123, null, null, -35, null);
        if (aClass356_711 == null) return string;
        NodeSub50 class348_sub50 = (NodeSub50) aClass356_711.get(i, -6008);
        if (class348_sub50 == null) return string;
        return class348_sub50.stringValue;
    }

    final DisplayModeManagerContainer370 method430(Component324 class150, Component344 class87, int i, GraphicsToolkit var_ha, int i_21_, int i_22_, ItemDefinitionProvider class255, Interface17 interface17, int i_23_, Component101 class154, DisplayModeManagerContainer167 class17, DisplayModeManagerContainer1 class261, DisplayModeManagerContainer347 class278, int i_24_) {
        try {
            anInt684++;
            HashNodeSub13.aBoolean9616 = false;
            if (this.anInt770 == 0) return null;
            if (this.anInt770 == 1 && this.anInt753 == -1) return null;
            if (this.anInt770 == 1) {
                int i_25_ = i;
                if (class17 != null) i |= class17.method263(i_24_, 106, i_21_, true);
                long l = this.anInt753 + ((this.anInt770 << 16) + (var_ha.anInt4567 << 29));
                DisplayModeManagerContainer370 class64 = (DisplayModeManagerContainer370) Component142.aClass60_4417.get(l, -90);
                if (class64 == null || var_ha.method3667(class64.ua(), i) != 0) {
                    if (class64 != null) i = var_ha.bitwiseOr(i, class64.ua());
                    DisplayModeManagerContainer77 class124 = Component189.loadFromCache(0, (DefinitionSub28.aClass45_9365), this.anInt753, -1);
                    if (class124 == null) {
                        HashNodeSub13.aBoolean9616 = true;
                        return null;
                    }
                    if (class124.anInt1830 < 13) class124.method1092(2, 114);
                    class64 = var_ha.method3625(class124, i, DisplayModeManagerContainer288.anInt8628, 64, 768);
                    Component142.aClass60_4417.putOne(class64, l, (byte) -125);
                }
                if (class17 != null) class64 = class17.method269(-101, class64, i_24_, i_22_, i, i_21_);
                class64.s(i_25_);
                return class64;
            }
            if (this.anInt770 == 2) {
                DisplayModeManagerContainer370 class64 = (class278.method2079(this.anInt753, -1).method803(interface17, var_ha, i_22_, i_24_, class17, class87, i_21_, 104, i));
                if (class64 == null) {
                    HashNodeSub13.aBoolean9616 = true;
                    return null;
                }
                return class64;
            }
            if (i_23_ != 255) method432(null, -50);
            if (this.anInt770 == 3) {
                if (class154 == null) return null;
                DisplayModeManagerContainer370 class64 = class154.method1230(class255, -402058072, class87, class150, interface17, class278, i_21_, i_24_, i, class17, i_22_, var_ha);
                if (class64 == null) {
                    HashNodeSub13.aBoolean9616 = true;
                    return null;
                }
                return class64;
            }
            if (this.anInt770 == 4) {
                ItemDefinition class213 = class255.getItemDefinition(i_23_ + -365, this.anInt753);
                DisplayModeManagerContainer370 class64 = class213.method1559(class154, class17, var_ha, i, i_22_, 10, i_21_, (byte) 88, i_24_);
                if (class64 == null) {
                    HashNodeSub13.aBoolean9616 = true;
                    return null;
                }
                return class64;
            }
            if (this.anInt770 == 6) {
                DisplayModeManagerContainer370 class64 = (class278.method2079(this.anInt753, -1).method800(0, null, class87, false, null, 0, class261, i_21_, class17, interface17, var_ha, 0, null, i_24_, 0, i, i_22_));
                if (class64 == null) {
                    HashNodeSub13.aBoolean9616 = true;
                    return null;
                }
                return class64;
            }
            if (this.anInt770 == 7) {
                if (class154 == null) return null;
                int i_26_ = this.anInt753 >>> 16;
                int i_27_ = 0xffff & this.anInt753;
                int i_28_ = this.anInt779;
                DisplayModeManagerContainer370 class64 = class154.method1232(i_24_, i, i_28_, i_27_, class87, class150, -15331, i_26_, i_22_, var_ha, i_21_, class17);
                if (class64 == null) {
                    HashNodeSub13.aBoolean9616 = true;
                    return null;
                }
                return class64;
            }
            return null;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("at.G(" + (class150 != null ? "{...}" : "null") + ',' + (class87 != null ? "{...}" : "null") + ',' + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_21_ + ',' + i_22_ + ',' + (class255 != null ? "{...}" : "null") + ',' + (interface17 != null ? "{...}" : "null") + ',' + i_23_ + ',' + (class154 != null ? "{...}" : "null") + ',' + (class17 != null ? "{...}" : "null") + ',' + (class261 != null ? "{...}" : "null") + ',' + (class278 != null ? "{...}" : "null") + ',' + i_24_ + ')'));
        }
    }

    final void method431(int i, int i_29_, byte i_30_) {
        anInt712++;
        if (this.optionPriorities == null || (i >= this.optionPriorities.length)) {
            int[] is = new int[1 + i];
            if (this.optionPriorities != null) {
                for (int i_31_ = 0; (i_31_ < this.optionPriorities.length); i_31_++)
                    is[i_31_] = this.optionPriorities[i_31_];
                for (int i_32_ = this.optionPriorities.length; i > i_32_; i_32_++)
                    is[i_32_] = -1;
            }
            this.optionPriorities = is;
        }
        this.optionPriorities[i] = i_29_;
        if (i_30_ > -18) this.anInt779 = 13;
    }

    private final Object[] method432(Buffer class348_sub49, int i) {
        if (i != -1) return null;
        anInt691++;
        int i_33_ = class348_sub49.readUnsignedByte(255);
        if (i_33_ == 0) return null;
        Object[] objects = new Object[i_33_];
        for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
            int i_35_ = class348_sub49.readUnsignedByte(255);
            if (i_35_ != 0) {
                if (i_35_ == 1) objects[i_34_] = class348_sub49.readString((byte) 124);
            } else objects[i_34_] = new Integer(class348_sub49.readInt((byte) -126));
        }
        this.aBoolean682 = true;
        return objects;
    }

    /**
     * Decode this widget from an IF archive buffer (type, layout, scripts, …).
     * Branch on {@link #type} for type-specific payload (text / graphic / model / …).
     */
    final void decode(Buffer class348_sub49, boolean bool) {
        anInt743++;
        int i = class348_sub49.readUnsignedByte(255);
        if (i == 255) i = -1;
        this.type = class348_sub49.readUnsignedByte(255);
        if ((0x80 & this.type) != 0) {
            this.type &= 0x7f;
            this.debugName = class348_sub49.readString((byte) -72);
        }
        this.contentType = class348_sub49.readUnsignedShort(842397944);
        this.relativeX = class348_sub49.readShort(13638);
        this.relativeY = class348_sub49.readShort(13638);
        this.baseWidth = class348_sub49.readUnsignedShort(842397944);
        this.baseHeight = class348_sub49.readUnsignedShort(842397944);
        this.widthMode = class348_sub49.readByte(-96);
        this.heightMode = class348_sub49.readByte(-87);
        this.xMode = class348_sub49.readByte(-86);
        this.yMode = class348_sub49.readByte(-108);
        this.parentId = class348_sub49.readUnsignedShort(842397944);
        if (this.parentId == 65535) this.parentId = -1;
        else this.parentId = ((~0xffff & this.packedId) + this.parentId);
        int i_36_ = class348_sub49.readUnsignedByte(255);
        if (i >= 0) this.aBoolean776 = (0x2 & i_36_) != 0;
        this.hidden = (0x1 & i_36_) != 0;
        if (this.type == 0) {
            this.scrollWidth = class348_sub49.readUnsignedShort(842397944);
            this.scrollHeight = class348_sub49.readUnsignedShort(842397944);
            if (i < 0) this.aBoolean776 = class348_sub49.readUnsignedByte(255) == 1;
        }
        if (this.type == 5) {
            this.spriteId = class348_sub49.readInt((byte) -126);
            this.spriteAngle = class348_sub49.readUnsignedShort(842397944);
            int i_37_ = class348_sub49.readUnsignedByte(255);
            this.spriteTiling = (i_37_ & 0x1) != 0;
            this.aBoolean745 = (0x2 & i_37_) != 0;
            this.opacity = class348_sub49.readUnsignedByte(255);
            this.outline = class348_sub49.readUnsignedByte(255);
            this.shadowColour = class348_sub49.readInt((byte) -126);
            this.aBoolean790 = class348_sub49.readUnsignedByte(255) == 1;
            this.aBoolean735 = class348_sub49.readUnsignedByte(255) == 1;
            this.colour = class348_sub49.readInt((byte) -126);
        }
        if (this.type == 6) {
            this.anInt770 = 1;
            this.anInt753 = class348_sub49.readUnsignedShort(842397944);
            if (this.anInt753 == 65535) this.anInt753 = -1;
            int i_38_ = class348_sub49.readUnsignedByte(255);
            this.aBoolean784 = (0x2 & i_38_) == 2;
            boolean bool_39_ = (i_38_ & 0x1) == 1;
            this.aBoolean689 = (i_38_ & 0x4) == 4;
            this.aBoolean754 = (i_38_ & 0x8) == 8;
            if (bool_39_) {
                this.anInt688 = class348_sub49.readShort(13638);
                this.anInt799 = class348_sub49.readShort(13638);
                this.anInt757 = class348_sub49.readUnsignedShort(842397944);
                this.anInt675 = class348_sub49.readUnsignedShort(842397944);
                this.anInt717 = class348_sub49.readUnsignedShort(842397944);
                this.anInt716 = class348_sub49.readUnsignedShort(842397944);
            } else if (this.aBoolean784) {
                this.anInt688 = class348_sub49.readShort(13638);
                this.anInt799 = class348_sub49.readShort(13638);
                this.anInt787 = class348_sub49.readShort(13638);
                this.anInt757 = class348_sub49.readUnsignedShort(842397944);
                this.anInt675 = class348_sub49.readUnsignedShort(842397944);
                this.anInt717 = class348_sub49.readUnsignedShort(842397944);
                this.anInt716 = class348_sub49.readShort(13638);
            }
            this.anInt699 = class348_sub49.readUnsignedShort(842397944);
            if (this.anInt699 == 65535) this.anInt699 = -1;
            if (this.widthMode != 0) this.anInt796 = class348_sub49.readUnsignedShort(842397944);
            if (this.heightMode != 0) this.anInt826 = class348_sub49.readUnsignedShort(842397944);
        }
        if (this.type == 4) {
            this.fontId = class348_sub49.readUnsignedShort(842397944);
            if (this.fontId == 65535) this.fontId = -1;
            this.textContent = class348_sub49.readString((byte) 111);
            this.lineHeight = class348_sub49.readUnsignedByte(255);
            this.xTextAlign = class348_sub49.readUnsignedByte(255);
            this.yTextAlign = class348_sub49.readUnsignedByte(255);
            this.textShadowed = class348_sub49.readUnsignedByte(255) == 1;
            this.colour = class348_sub49.readInt((byte) -126);
            this.opacity = class348_sub49.readUnsignedByte(255);
            if (i >= 0) this.anInt773 = class348_sub49.readUnsignedByte(255);
        }
        if (this.type == 3) {
            this.colour = class348_sub49.readInt((byte) -126);
            this.filled = class348_sub49.readUnsignedByte(255) == 1;
            this.opacity = class348_sub49.readUnsignedByte(255);
        }
        if (this.type == 9) {
            this.lineWidth = class348_sub49.readUnsignedByte(255);
            this.colour = class348_sub49.readInt((byte) -126);
            this.aBoolean744 = class348_sub49.readUnsignedByte(255) == 1;
        }
        int i_40_ = class348_sub49.readMedium(-1);
        int i_41_ = class348_sub49.readUnsignedByte(255);
        if (i_41_ != 0) {
            this.aByteArray832 = new byte[11];
            this.aByteArray746 = new byte[11];
            this.anIntArray707 = new int[11];
            for (/**/; i_41_ != 0; i_41_ = class348_sub49.readUnsignedByte(255)) {
                int i_42_ = -1 + (i_41_ >> 4);
                i_41_ = i_41_ << 8 | class348_sub49.readUnsignedByte(255);
                i_41_ &= 0xfff;
                if (i_41_ == 4095) i_41_ = -1;
                byte i_43_ = class348_sub49.readByte(-87);
                if (i_43_ != 0) this.aBoolean676 = true;
                byte i_44_ = class348_sub49.readByte(-102);
                this.anIntArray707[i_42_] = i_41_;
                this.aByteArray746[i_42_] = i_43_;
                this.aByteArray832[i_42_] = i_44_;
            }
        }
        this.text = class348_sub49.readString((byte) 82);
        int i_45_ = class348_sub49.readUnsignedByte(255);
        int i_46_ = 0xf & i_45_;
        if (i_46_ > 0) {
            this.optionLabels = new String[i_46_];
            for (int i_47_ = 0; i_47_ < i_46_; i_47_++)
                this.optionLabels[i_47_] = class348_sub49.readString((byte) -68);
        }
        int i_48_ = i_45_ >> 4;
        if (i_48_ > 0) {
            int i_49_ = class348_sub49.readUnsignedByte(255);
            this.optionPriorities = new int[1 + i_49_];
            for (int i_50_ = 0; i_50_ < this.optionPriorities.length; i_50_++)
                this.optionPriorities[i_50_] = -1;
            this.optionPriorities[i_49_] = class348_sub49.readUnsignedShort(842397944);
        }
        if (i_48_ > 1) {
            int i_51_ = class348_sub49.readUnsignedByte(255);
            this.optionPriorities[i_51_] = class348_sub49.readUnsignedShort(842397944);
        }
        this.continueOption = class348_sub49.readString((byte) 95);
        if (this.continueOption.equals("")) this.continueOption = null;
        this.anInt729 = class348_sub49.readUnsignedByte(255);
        this.anInt703 = class348_sub49.readUnsignedByte(255);
        this.anInt797 = class348_sub49.readUnsignedByte(255);
        this.useOption = class348_sub49.readString((byte) -87);
        int i_52_ = -1;
        if (DefinitionSub5.method3060(i_40_, bool) != 0) {
            i_52_ = class348_sub49.readUnsignedShort(842397944);
            this.anInt824 = class348_sub49.readUnsignedShort(842397944);
            if (i_52_ == 65535) i_52_ = -1;
            if (this.anInt824 == 65535) this.anInt824 = -1;
            this.anInt695 = class348_sub49.readUnsignedShort(842397944);
            if (this.anInt695 == 65535) this.anInt695 = -1;
        }
        if (i >= 0) {
            this.anInt719 = class348_sub49.readUnsignedShort(842397944);
            if (this.anInt719 == 65535) this.anInt719 = -1;
        }
        this.settings = new ComponentSettings(i_40_, i_52_);
        if (i >= 0) {
            int i_53_ = class348_sub49.readUnsignedByte(255);
            for (int i_54_ = 0; i_53_ > i_54_; i_54_++) {
                int i_55_ = class348_sub49.readMedium(-1);
                int i_56_ = class348_sub49.readInt((byte) -126);
                aClass356_711.put((byte) 120, i_55_, new NodeSub35(i_56_));
            }
            int i_57_ = class348_sub49.readUnsignedByte(255);
            for (int i_58_ = 0; i_58_ < i_57_; i_58_++) {
                int i_59_ = class348_sub49.readMedium(-1);
                String string = class348_sub49.readGjstr2(-13487);
                aClass356_711.put((byte) 119, i_59_, new NodeSub50(string));
            }
        }
        this.anObjectArray815 = method432(class348_sub49, -1);
        this.anObjectArray811 = method432(class348_sub49, -1);
        this.anObjectArray683 = method432(class348_sub49, -1);
        this.anObjectArray680 = method432(class348_sub49, -1);
        this.anObjectArray714 = method432(class348_sub49, -1);
        this.anObjectArray777 = method432(class348_sub49, -1);
        this.anObjectArray751 = method432(class348_sub49, -1);
        this.anObjectArray671 = method432(class348_sub49, -1);
        this.anObjectArray764 = method432(class348_sub49, -1);
        this.optionScripts = method432(class348_sub49, -1);
        if (i >= 0) this.anObjectArray679 = method432(class348_sub49, -1);
        this.anObjectArray839 = method432(class348_sub49, -1);
        this.anObjectArray763 = method432(class348_sub49, -1);
        this.anObjectArray785 = method432(class348_sub49, -1);
        this.anObjectArray742 = method432(class348_sub49, -1);
        this.anObjectArray805 = method432(class348_sub49, -1);
        this.anObjectArray823 = method432(class348_sub49, -1);
        this.anObjectArray692 = method432(class348_sub49, -1);
        this.anObjectArray803 = method432(class348_sub49, -1);
        this.anObjectArray685 = method432(class348_sub49, -1);
        this.anObjectArray708 = method432(class348_sub49, -1);
        this.anIntArray686 = method441(!bool, class348_sub49);
        this.anIntArray771 = method441(!bool, class348_sub49);
        this.anIntArray731 = method441(!bool, class348_sub49);
        this.anIntArray818 = method441(false, class348_sub49);
        this.anIntArray831 = method441(false, class348_sub49);
    }

    final void method434(boolean bool) {
        this.anIntArray771 = null;
        this.anIntArray731 = null;
        this.anObjectArray820 = null;
        this.anIntArray686 = null;
        this.anObjectArray839 = null;
        this.anObjectArray763 = null;
        this.anIntArray831 = null;
        this.optionScripts = null;
        this.anObjectArray764 = null;
        this.anObjectArray836 = null;
        this.anObjectArray701 = null;
        this.anObjectArray751 = null;
        this.anObjectArray822 = null;
        this.anObjectArray714 = null;
        this.anObjectArray671 = null;
        this.anObjectArray785 = null;
        this.anObjectArray727 = null;
        this.anObjectArray811 = null;
        this.anObjectArray683 = null;
        this.anIntArray818 = null;
        this.anObjectArray708 = null;
        this.anObjectArray687 = null;
        this.anObjectArray803 = null;
        this.anObjectArray823 = null;
        this.anObjectArray805 = null;
        anInt829++;
        this.anObjectArray685 = null;
        this.anObjectArray815 = null;
        this.anObjectArray692 = null;
        this.anObjectArray679 = null;
        if (bool != false) this.anInt799 = 96;
        this.anObjectArray742 = null;
        this.anObjectArray840 = null;
        this.anObjectArray777 = null;
        this.anObjectArray807 = null;
        this.anObjectArray761 = null;
        this.anObjectArray734 = null;
        this.anObjectArray680 = null;
    }

    final void method435(int i, int i_60_) {
        anInt802++;
        if (aClass356_711 != null) {
            Node class348 = aClass356_711.get(i, -6008);
            if (class348 != null) class348.unlink((byte) 63);
        }
        if (i_60_ != -3437) method425(null, (byte) 83);
    }

    final void method436(int i, int i_61_, int i_62_) {
        anInt694++;
        if (aClass356_711 == null) {
            aClass356_711 = new LruCache(16);
            aClass356_711.put((byte) 60, i_61_, new NodeSub35(i_62_));
        } else if (i < -38) {
            NodeSub35 class348_sub35 = ((NodeSub35) aClass356_711.get(i_61_, -6008));
            if (class348_sub35 == null) aClass356_711.put((byte) 67, i_61_, new NodeSub35(i_62_));
            else class348_sub35.intValue = i_62_;
        }
    }

    final void method437(int i, DisplayModeManagerContainer370 class64, GraphicsToolkit var_ha, int i_63_, DisplayModeManagerContainer204 class101) {
        do {
            try {
                if (i != -20154) method438(15, -50, null);
                anInt718++;
                class64.transformVertices(class101);
                Component30[] class129s = class64.method619();
                DisplayModeManagerContainer173[] class342s = class64.method604();
                if ((this.aClass318_Sub10_740 == null || this.aClass318_Sub10_740.aBoolean6470) && (class129s != null || class342s != null)) this.aClass318_Sub10_740 = RenderableSub10.method2526(i_63_, false);
                if (this.aClass318_Sub10_740 == null) break;
                this.aClass318_Sub10_740.method2536(var_ha, i_63_, class129s, class342s, false);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("at.J(" + i + ',' + (class64 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_63_ + ',' + (class101 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final void method438(int i, int i_64_, String string) {
        if (this.optionLabels == null || i >= this.optionLabels.length) {
            String[] strings = new String[i + 1];
            if (this.optionLabels != null) {
                for (int i_65_ = 0; (this.optionLabels.length > i_65_); i_65_++)
                    strings[i_65_] = this.optionLabels[i_65_];
            }
            this.optionLabels = strings;
        }
        if (i_64_ > 77) {
            anInt766++;
            this.optionLabels[i] = string;
        }
    }

    final void method439(int i, int i_66_, String string) {
        anInt758++;
        if (i != 0) this.spriteId = -106;
        if (aClass356_711 == null) {
            aClass356_711 = new LruCache(16);
            aClass356_711.put((byte) 86, i_66_, new NodeSub50(string));
        } else {
            NodeSub50 class348_sub50 = ((NodeSub50) aClass356_711.get(i_66_, -6008));
            if (class348_sub50 == null) aClass356_711.put((byte) 73, i_66_, new NodeSub50(string));
            else class348_sub50.stringValue = string;
        }
    }

    static final void method440(int i, byte i_67_) {
        DefinitionSub19.anIntArray9259 = new int[i];
        if (i_67_ == -61) {
            LoadingState.anIntArray1045 = new int[i];
            ClientErrorReporter.anIntArray2117 = new int[i];
            anInt825++;
            DisplayModeManagerContainer370.anIntArray1127 = new int[i];
            DisplayModeManagerContainer363.anIntArray4097 = new int[i];
        }
    }

    private final int[] method441(boolean bool, Buffer class348_sub49) {
        anInt722++;
        int i = class348_sub49.readUnsignedByte(255);
        if (bool != false) return null;
        if (i == 0) return null;
        int[] is = new int[i];
        for (int i_68_ = 0; i_68_ < i; i_68_++)
            is[i_68_] = class348_sub49.readInt((byte) -126);
        return is;
    }

    public static void method442(byte i) {
        if (i <= -8) {
            aClass196_838 = null;
            aByteArray821 = null;
        }
    }

    final Component24 method443(GraphicsToolkit var_ha, byte i) {
        anInt819++;
        HashNodeSub13.aBoolean9616 = false;
        long l = (((long) this.shadowColour << 40) + (((this.aBoolean790 ? 1L : 0L) << 38) + (((long) this.outline << 36) + ((this.aBoolean745 ? 1L : 0L) << 35))) + ((long) this.spriteId + ((!this.aBoolean735 ? 0L : 1L) << 39)));
        Component24 class105 = (Component24) StringCache.aClass60_4327.get(l, -71);
        if (i > -27) method434(true);
        if (class105 != null) return class105;
        Component170 class207 = Component170.method1521(Component327.aClass45_8755, this.spriteId, 0);
        if (class207 == null) {
            HashNodeSub13.aBoolean9616 = true;
            return null;
        }
        if (this.aBoolean790) class207.method1514();
        if (this.aBoolean735) class207.method1518();
        if (this.outline > 0) class207.method1513(this.outline);
        else if (this.shadowColour != 0) class207.method1513(1);
        if (this.outline >= 1) class207.method1515(1);
        if (this.outline >= 2) class207.method1515(16777215);
        if (this.shadowColour != 0) class207.method1511(~0xffffff | this.shadowColour);
        class105 = var_ha.method3691(class207, true);
        StringCache.aClass60_4327.put(31902, class105, l, (class105.method971() * class105.method969() * 4));
        return class105;
    }

    final DisplayModeManagerContainer50 method444(boolean bool, Component361 class25, DisplayModeManagerContainer26 class84) {
        try {
            if (bool != false) method424(122, -123, null, -111, 40, 28, -109, null, 76, 127, -66, 8, -45);
            anInt804++;
            if (this.anInt705 == -1) return null;
            long l = (((long) this.anInt693 << 16 & 65535L << 16) | (((long) this.anInt733 << 32 & 65535L << 32) | ((long) this.anInt674 << 48 & 65535L << 48)) | (long) this.anInt705 & 0xffffL);
            DisplayModeManagerContainer50 class305 = ((DisplayModeManagerContainer50) DefinitionSub9.aClass60_9171.get(l, 78));
            if (class305 == null) {
                class305 = class84.method823(this.anInt733, this.anInt693, this.anInt674, -43, class25, this.anInt705);
                DefinitionSub9.aClass60_9171.putOne(class305, l, (byte) -120);
            }
            return class305;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("at.N(" + bool + ',' + (class25 != null ? "{...}" : "null") + ',' + (class84 != null ? "{...}" : "null") + ')'));
        }
    }

    public DisplayModeManagerContainer57() {
        this.anInt695 = -1;
        this.yTextAlign = 0;
        this.aBoolean676 = false;
        this.anInt726 = -1;
        this.aBoolean682 = false;
        this.lineWidth = 1;
        this.anInt716 = 100;
        this.anInt757 = 0;
        this.childIndex = -1;
        this.absoluteY = 0;
        this.anInt675 = 0;
        this.colour = 0;
        this.spriteId = -1;
        this.anInt710 = 1;
        this.anInt738 = 0;
        this.outline = 0;
        this.anInt730 = 1;
        this.aBoolean754 = false;
        this.scrollX = 0;
        this.anInt723 = 0;
        this.aBoolean776 = false;
        this.relativeX = 0;
        this.anInt699 = -1;
        this.textShadowed = false;
        this.aBoolean720 = false;
        this.usePriority = -1;
        this.relativeY = 0;
        this.anInt729 = 0;
        this.baseHeight = 0;
        this.anInt797 = InputStream_Sub1.anInt78;
        this.anInt779 = -1;
        this.width = 0;
        this.anInt775 = 1;
        this.anInt719 = -1;
        this.aBoolean793 = false;
        this.scrollHeight = 0;
        this.anInt715 = 0;
        this.aBoolean689 = false;
        this.spriteTiling = false;
        this.anInt808 = 0;
        this.contentType = 0;
        this.scrollY = 0;
        this.settings = Component275.defaultSettings;
        this.anInt786 = 0;
        this.anInt760 = -1;
        this.absoluteX = 0;
        this.anInt770 = 1;
        this.widthMode = (byte) 0;
        this.filled = false;
        this.heightMode = (byte) 0;
        this.parent = null;
        this.anInt773 = 0;
        this.anInt794 = -1;
        this.anInt725 = 0;
        this.anInt799 = 0;
        this.aBoolean737 = false;
        this.anInt703 = 0;
        this.spriteAngle = 0;
        this.text = "";
        this.aBoolean745 = false;
        this.scrollWidth = 0;
        this.textContent = "";
        this.anInt814 = 0;
        this.itemAmount = 0;
        this.hidden = false;
        this.anInt824 = -1;
        this.packedId = -1;
        this.yMode = (byte) 0;
        this.shadowColour = 0;
        this.parentId = -1;
        this.xTextAlign = 0;
        this.height = 0;
        this.useOption = "";
        this.aBoolean744 = false;
        this.anInt826 = 0;
        this.anInt787 = 0;
        this.anInt705 = -1;
        this.anInt795 = 0;
        this.itemId = -1;
        this.anInt717 = 0;
        this.anInt806 = -1;
        this.baseWidth = 0;
        this.anInt796 = 0;
        this.anInt841 = 0;
        this.xMode = (byte) 0;
    }

    static {
        int i = 0;
        for (int i_69_ = 0; i_69_ < 256; i_69_++) {
            for (int i_70_ = 0; i_69_ >= i_70_; i_70_++)
                aByteArray821[i++] = (byte) (int) (255.0 / Math.sqrt((float) ((i_69_ * i_69_) + (i_70_ * i_70_) - -65535) / 65535.0F));
        }
        aClass196_838 = new Component169();
    }
}
