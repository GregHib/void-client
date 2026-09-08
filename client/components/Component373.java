/* Component373 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Component373
/**
 * RENAMED from `Class33` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt456;
    static int anInt457;
    private final CacheStore aClass45_458;
    static int anInt459;
    private final NodeCache aClass60_460 = new NodeCache(128);
    static int anInt461;

    final Component208 method337(boolean bool, int i) {
        anInt457++;
        Component208 class117;
        synchronized (aClass60_460) {
            class117 = (Component208) aClass60_460.get(i, 111);
        }
        if (class117 != null) return class117;
        byte[] is = aClass45_458.getFile(-1860, DisplayModeManagerContainer89.method200(-107, i), Sprite.method3013(i, bool));
        class117 = new Component208();
        if (is != null) class117.decode(0, new Buffer(is));
        synchronized (aClass60_460) {
            aClass60_460.putOne(class117, i, (byte) -102);
        }
        return class117;
    }

    /**
     * Install / clear the OS custom cursor for the current tip.
     * <p>
     * {@code i_0_} is a {@link CursorDefinition} id from
     * {@link DisplayModeManagerContainer67#getTipCursorId} →
     * {@link Component149#widgetCursorId} → {@link HashNodeSub16Sub1#defaultCursorId}.
     * When {@link NodeSub51#customCursorSetting} is {@code 0} (or {@code i_0_} is a
     * Void tip-sort sentinel ≥ {@code 0x7ffffffe}), clears to the system pointer.
     * Tracks the live id in {@link Component244#currentCursorId}.
     */
    static final void applyCustomCursor(int i, int i_0_) {
        if (i == Component192.preferences.customCursorSetting.getValue(-32350)) i_0_ = -1;
        anInt456++;
        // Sentinel tip-sort values (DefaultClick / Microbot) are not valid cursor defs —
        // fall back so the pointer does not stick on the default left-click sprite.
        if (i_0_ >= 0x7ffffffe) i_0_ = -1;
        if (i_0_ != Component244.currentCursorId) {
            if (i_0_ != -1) {
                CursorDefinition class222 = Component339.cursorDefinitions.get((byte) -104, i_0_);
                Component170 class207 = class222.getSprite((byte) 71);
                if (class207 == null) i_0_ = -1;
                else {
                    OggUrlStream.aClass297_8992.setCustomCursor(class207.method1522(), class207.method1516(), 17, new Point(class222.hotspotX, class222.hotspotY), DisplayModeManagerContainer50.gameCanvas, class207.method1510());
                    Component244.currentCursorId = i_0_;
                }
            }
            if (i_0_ == -1 && Component244.currentCursorId != -1) {
                OggUrlStream.aClass297_8992.setCustomCursor(-1, null, i + 17, new Point(), (DisplayModeManagerContainer50.gameCanvas), -1);
                Component244.currentCursorId = -1;
            }
        }
    }

    static final void method339(int i, int i_1_, byte[] is, int i_2_, int i_3_, int i_4_) {
        anInt461++;
        if (i_4_ > i_1_) {
            i += i_1_;
            i_2_ = -i_1_ + i_4_ >> 2;
            while (--i_2_ >= 0) {
                is[i++] = (byte) 1;
                is[i++] = (byte) 1;
                is[i++] = (byte) 1;
                is[i++] = (byte) 1;
            }
            if (i_3_ == 1354705384) {
                i_2_ = 0x3 & i_4_ - i_1_;
                while (--i_2_ >= 0) is[i++] = (byte) 1;
            }
        }
    }

    /** Smallest power of two {@code > i-1} (bit-smear idiom). */
    static final int nextPowerOfTwo(int i, byte i_5_) {
        anInt459++;
        i = --i | i >>> 1;
        i |= i >>> 2;
        i |= i >>> 4;
        if (i_5_ != 108) return 34;
        i |= i >>> 8;
        i |= i >>> 16;
        return 1 + i;
    }

    Component373(GameType class230, int i, CacheStore class45) {
        do {
            try {
                aClass45_458 = class45;
                if (aClass45_458 == null) break;
                int i_6_ = -1 + aClass45_458.getGroupCapacity(-1);
                aClass45_458.getFileCount(0, i_6_);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("iba.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
