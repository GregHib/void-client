/* CacheFileStore - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class340` (JODE-obfuscated).
 * Manages an array of archive entries (Component219[]) with RSA BigInteger keys (modulus/exponent) and a Buffer; reload reloads/flushes archives. Cache/file store with signature verification.
 */

import java.math.BigInteger;

final class CacheFileStore {
    /** JS5 TCP client used to fetch the master reference table and archives. */
    private final Component253 js5Client;
    /** RSA public exponent for reference-table signature verify. */
    private final BigInteger rsaExponent;
    static int anInt4214;
    /** Parsed master reference table (index 255) after RSA/whirlpool verify. */
    private Buffer referenceTableBuffer;
    /** Lazily created per-index archive stores. */
    private Component219[] archives;
    private DisplayModeManagerContainer67 masterIndex;
    /** RSA modulus for reference-table signature verify. */
    private final BigInteger rsaModulus;
    static int anInt4219;
    /** In-flight request for the index-255 reference table. */
    private HashNodeSub16Sub1 referenceTableRequest;
    static int anInt4221;
    static int anInt4222;
    static StringCache aClass351_4223 = new StringCache(4, 0);
    static int anInt4224;
    static StringCache aClass351_4225 = new StringCache(43, -1);

    final void reload(int i) {
        anInt4222++;
        if (archives != null) {
            for (int i_0_ = 0; (i_0_ < archives.length); i_0_++) {
                if (archives[i_0_] != null) archives[i_0_].processRequestedGroups(0);
            }
            for (int i_1_ = i; i_1_ < archives.length; i_1_++) {
                if (archives[i_1_] != null) archives[i_1_].pulse(-1);
            }
        }
    }

    public static void clearStatics(int i) {
        aClass351_4225 = null;
        aClass351_4223 = null;
        if (i != 0) isReconnectState(92, 5);
    }

    /** True for client states 7/8/9 (js5 reconnect / login hop variants). */
    static final boolean isReconnectState(int i, int i_2_) {
        anInt4224++;
        if (i_2_ >= -89) return true;
        return i == 7 || i == 8 || i == 9;
    }

    /** Returns (or creates) the archive store for index {@code i}. */
    final Component219 getArchive(CacheIndexReader class137, int i, CacheIndexReader class137_3_, int i_4_) {
        try {
            anInt4219++;
            if (i_4_ != 255) clearStatics(-43);
            return createArchive((byte) -123, true, i, class137, class137_3_);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("eb.D(" + (class137 != null ? "{...}" : "null") + ',' + i + ',' + (class137_3_ != null ? "{...}" : "null") + ',' + i_4_ + ')'));
        }
    }

    final boolean isReady(int i) {
        anInt4214++;
        if (referenceTableBuffer != null) {
            return true;
        }
        if (referenceTableRequest == null) {
            if (js5Client.isPriorityQueueFull(-71)) {
                return false;
            }
            referenceTableRequest = js5Client.queueRequest((byte) -84, (byte) 0, true, 255, 255);
        }
        if (referenceTableRequest.incomplete) {
            return false;
        }
        Buffer class348_sub49 = new Buffer(referenceTableRequest.getData(i ^ 0x17));
        class348_sub49.offset = 5;
        int idxCount = class348_sub49.readUnsignedByte(i ^ 0xf8);
        class348_sub49.offset += idxCount * 72;
        byte[] is = new byte[(class348_sub49.payload.length - class348_sub49.offset)];
        class348_sub49.readBytes(2147483647, 0, is.length, is);
        byte[] is_6_;
        if (rsaExponent != null && rsaModulus != null) {
            BigInteger biginteger = new BigInteger(is);
            BigInteger biginteger_7_ = biginteger.modPow(rsaExponent, rsaModulus);
            is_6_ = biginteger_7_.toByteArray();
        } else {
            is_6_ = is;
        }
        if (is_6_.length != 65) {
            throw new RuntimeException();
        }
        byte[] is_8_ = NodeSub1Sub2.whirlpoolDigest(4567, 5, (class348_sub49.payload), (class348_sub49.offset) - (is.length + 5));
        for (int i_9_ = 0; i_9_ < 64; i_9_++) {
            if (is_8_[i_9_] != is_6_[i_9_ + 1]) {
                throw new RuntimeException();
            }
        }
        referenceTableBuffer = class348_sub49;
        archives = new Component219[idxCount];
        return true;
    }

    /** Instantiates {@link Component219} for index {@code i_10_} from the reference table. */
    private final Component219 createArchive(byte i, boolean bool, int i_10_, CacheIndexReader class137, CacheIndexReader class137_11_) {
        try {
            anInt4221++;
            if (referenceTableBuffer == null) throw new RuntimeException();
            if (i_10_ < 0 || i_10_ >= archives.length) throw new RuntimeException();
            if (archives[i_10_] != null) return archives[i_10_];
            referenceTableBuffer.offset = 6 + i_10_ * 72;
            int i_12_ = referenceTableBuffer.readInt((byte) -126);
            int i_13_ = referenceTableBuffer.readInt((byte) -126);
            byte[] is = new byte[64];
            referenceTableBuffer.readBytes(2147483647, 0, 64, is);
            if (i >= -18) clearStatics(103);
            Component219 class314_sub1 = new Component219(i_10_, class137, class137_11_, js5Client, masterIndex, i_12_, is, i_13_, bool);
            archives[i_10_] = class314_sub1;
            return class314_sub1;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("eb.E(" + i + ',' + bool + ',' + i_10_ + ',' + (class137 != null ? "{...}" : "null") + ',' + (class137_11_ != null ? "{...}" : "null") + ')'));
        }
    }

    CacheFileStore(Component253 class248, DisplayModeManagerContainer67 class112, BigInteger biginteger, BigInteger biginteger_14_) {
        do {
            try {
                masterIndex = class112;
                rsaModulus = biginteger_14_;
                rsaExponent = biginteger;
                js5Client = class248;
                if (js5Client.isPriorityQueueFull(-31)) break;
                referenceTableRequest = js5Client.queueRequest((byte) -80, (byte) 0, true, 255, 255);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("eb.<init>(" + (class248 != null ? "{...}" : "null") + ',' + (class112 != null ? "{...}" : "null") + ',' + (biginteger != null ? "{...}" : "null") + ',' + (biginteger_14_ != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
