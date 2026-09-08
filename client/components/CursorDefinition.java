/* CursorDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * One custom-cursor definition from cache archive 33.
 * <p>
 * Loaded by {@link CursorDefinitionCache#get}; applied by
 * {@link Component373#applyCustomCursor} → {@link CursorManager#setCustomCursor}
 * (ARGB pixels from {@link #getSprite}, hotspot {@link #hotspotX}/{@link #hotspotY}).
 * <p>
 * RENAMED from {@code Class222} / {@code Component303}. Evidence: archive-33
 * decode (sprite id + hotspot bytes) and sole consumer is the custom-cursor path.
 */
final class CursorDefinition {
    /** Hotspot X within the cursor sprite (pixels from left). */
    int hotspotX;
    static int anInt2884 = 0;
    static Component161 aClass138_2885 = new Component161(4, 1, 1, 1);
    /** Owning cache (sprite store + def soft-cache). */
    CursorDefinitionCache cache;
    static int anInt2887;
    static int anInt2888;
    static int anInt2889;
    /** Hotspot Y within the cursor sprite (pixels from top). */
    int hotspotY;
    /** Sprite file id in the cursor/sprites store ({@link CursorDefinitionCache#aClass45_2180}). */
    private int spriteId;
    static StringCache aClass351_2892 = new StringCache(39, 8);

    private final void decodeOpcode(int i, Buffer class348_sub49, byte i_0_) {
        anInt2887++;
        if (i == 1) spriteId = class348_sub49.readUnsignedShort(842397944);
        else if (i == 2) {
            this.hotspotX = class348_sub49.readUnsignedByte(255);
            this.hotspotY = class348_sub49.readUnsignedByte(255);
        }
        if (i_0_ != 4) decodeOpcode(-8, null, (byte) 81);
    }

    public static void clearStatics(byte i) {
        if (i <= -71) {
            aClass351_2892 = null;
            aClass138_2885 = null;
        }
    }

    /**
     * Resolve / soft-cache the {@link Component170} sprite for {@link #spriteId}.
     * Returns null when the sprite is not ready — caller clears the OS cursor.
     */
    final synchronized Component170 getSprite(byte i) {
        anInt2888++;
        Component170 class207 = (Component170) this.cache.aClass60_2190.get(spriteId, -70);
        if (class207 != null) return class207;
        class207 = Component170.method1521(this.cache.aClass45_2180, spriteId, 0);
        if (i < 49) clearStatics((byte) 93);
        if (class207 != null) this.cache.aClass60_2190.putOne(class207, spriteId, (byte) -120);
        return class207;
    }

    /** Decode archive-33 payload (opcodes 1=sprite, 2=hotspot, 0=end). */
    final void decode(Buffer class348_sub49, boolean bool) {
        for (; ; ) {
            int i = class348_sub49.readUnsignedByte(255);
            if (i == 0) break;
            decodeOpcode(i, class348_sub49, (byte) 4);
        }
        anInt2889++;
        if (bool != false) getSprite((byte) -86);
    }

    public CursorDefinition() {
        /* empty */
    }
}
