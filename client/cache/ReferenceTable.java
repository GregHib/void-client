/* ReferenceTable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class291` (JODE-obfuscated).
 * Archive reference table. Holds child index entries (Component192 groupNameTable / fileNameTables) plus crc/version/whirlpool arrays (fileCounts, fileIdCounts, byte[][] whirlpools). Backing data for CacheStore.
 */

final class ReferenceTable {
    /** CRC32 of the index payload. */
    int crc;
    static int anInt3720 = 0;
    int[][] fileIds;
    /** Per-group version (written into last two bytes of packed group data). */
    int[] groupVersions;
    Component192 groupNameTable;
    int[] fileCounts;
    int[] fileIdCounts;
    static int[] anIntArray3726;
    int namedGroupCount;
    Component192[] fileNameTables;
    int[] groupCrcs;
    byte[][] whirlpools;
    static int anInt3731;
    /** Index revision (protocol v6+). */
    int revision;
    int[] groupNameHashes;
    int groupCapacity;
    int[][] fileNameHashes;
    /** JS5 group id for bitmap font archive {@code b12_full}. */
    static int b12FullGroupId;
    static RenderableObject[] aClass318_Sub1Array3737;
    int[] groupIds;
    static int anInt3739;
    /** Whirlpool of the raw (pre-decode) payload; verified against expected digest. */
    private byte[] payloadWhirlpool;
    static int anInt3741;

    /** Clamp HSL lightness channel to 2..126 while keeping hue/sat bits. */
    static final int clampHslLightness(int i, int i_0_, int i_1_) {
        i_0_ = i_0_ * (i_1_ & 0x7f) >> 7;
        if (i != 0) clampHslLightness(52, -11, 108);
        anInt3741++;
        if (i_0_ >= 2) {
            if (i_0_ > 126) i_0_ = 126;
        } else i_0_ = 2;
        return (0xff80 & i_1_) - -i_0_;
    }

    public static void clearStatics(byte i) {
        anIntArray3726 = null;
        if (i < 55) aClass318_Sub1Array3737 = null;
        aClass318_Sub1Array3737 = null;
    }

    /** Parse compressed reference-table bytes into group/file tables. */
    private final void decode(byte i, byte[] is) {
        anInt3731++;
        Buffer class348_sub49 = new Buffer(NodeSub41.decompressContainer(is, -105));
        int i_2_ = class348_sub49.readUnsignedByte(255);
        if (i_2_ < 5 || i_2_ > 6) throw new RuntimeException();
        if (i_2_ < 6) this.revision = 0;
        else this.revision = class348_sub49.readInt((byte) -126);
        int i_3_ = class348_sub49.readUnsignedByte(255);
        boolean bool = (i_3_ & 0x1) != 0;
        boolean bool_4_ = (i_3_ & 0x2) != 0;
        this.namedGroupCount = class348_sub49.readUnsignedShort(842397944);
        int i_5_ = 0;
        this.groupIds = new int[this.namedGroupCount];
        int i_6_ = -1;
        for (int i_7_ = 0; i_7_ < this.namedGroupCount; i_7_++) {
            this.groupIds[i_7_] = i_5_ += class348_sub49.readUnsignedShort(842397944);
            if (i_6_ < this.groupIds[i_7_]) i_6_ = this.groupIds[i_7_];
        }
        this.groupCapacity = i_6_ - -1;
        if (bool_4_) this.whirlpools = new byte[this.groupCapacity][];
        this.groupCrcs = new int[this.groupCapacity];
        this.fileCounts = new int[this.groupCapacity];
        this.fileIdCounts = new int[this.groupCapacity];
        this.groupVersions = new int[this.groupCapacity];
        this.fileIds = new int[this.groupCapacity][];
        if (bool) {
            this.groupNameHashes = new int[this.groupCapacity];
            for (int i_8_ = 0; i_8_ < this.groupCapacity; i_8_++)
                this.groupNameHashes[i_8_] = -1;
            for (int i_9_ = 0; (this.namedGroupCount > i_9_); i_9_++)
                this.groupNameHashes[(this.groupIds[i_9_])] = class348_sub49.readInt((byte) -126);
            this.groupNameTable = new Component192(this.groupNameHashes);
        }
        if (i >= -83) decode((byte) 42, null);
        for (int i_10_ = 0; i_10_ < this.namedGroupCount; i_10_++)
            this.groupCrcs[(this.groupIds[i_10_])] = class348_sub49.readInt((byte) -126);
        if (bool_4_) {
            for (int i_11_ = 0; i_11_ < this.namedGroupCount; i_11_++) {
                byte[] is_12_ = new byte[64];
                class348_sub49.readBytes(2147483647, 0, 64, is_12_);
                this.whirlpools[(this.groupIds[i_11_])] = is_12_;
            }
        }
        for (int i_13_ = 0; i_13_ < this.namedGroupCount; i_13_++)
            this.groupVersions[(this.groupIds[i_13_])] = class348_sub49.readInt((byte) -126);
        for (int i_14_ = 0; this.namedGroupCount > i_14_; i_14_++)
            this.fileIdCounts[(this.groupIds[i_14_])] = class348_sub49.readUnsignedShort(842397944);
        for (int i_15_ = 0; this.namedGroupCount > i_15_; i_15_++) {
            int i_16_ = this.groupIds[i_15_];
            i_5_ = 0;
            int i_17_ = this.fileIdCounts[i_16_];
            int i_18_ = -1;
            this.fileIds[i_16_] = new int[i_17_];
            for (int i_19_ = 0; i_17_ > i_19_; i_19_++) {
                int i_20_ = (this.fileIds[i_16_][i_19_] = i_5_ += class348_sub49.readUnsignedShort(842397944));
                if (i_18_ < i_20_) i_18_ = i_20_;
            }
            this.fileCounts[i_16_] = i_18_ + 1;
            if (1 + i_18_ == i_17_) this.fileIds[i_16_] = null;
        }
        if (bool) {
            this.fileNameHashes = new int[i_6_ + 1][];
            this.fileNameTables = new Component192[1 + i_6_];
            for (int i_21_ = 0; i_21_ < this.namedGroupCount; i_21_++) {
                int i_22_ = this.groupIds[i_21_];
                int i_23_ = this.fileIdCounts[i_22_];
                this.fileNameHashes[i_22_] = new int[this.fileCounts[i_22_]];
                for (int i_24_ = 0; this.fileCounts[i_22_] > i_24_; i_24_++)
                    this.fileNameHashes[i_22_][i_24_] = -1;
                for (int i_25_ = 0; i_23_ > i_25_; i_25_++) {
                    int i_26_;
                    if (this.fileIds[i_22_] != null) i_26_ = (this.fileIds[i_22_][i_25_]);
                    else i_26_ = i_25_;
                    this.fileNameHashes[i_22_][i_26_] = class348_sub49.readInt((byte) -126);
                }
                this.fileNameTables[i_22_] = new Component192(this.fileNameHashes[i_22_]);
            }
        }
    }

    ReferenceTable(byte[] is, int i, byte[] is_27_) {
        try {
            this.crc = Component210.crc32(5126, is.length, is);
            if (i != this.crc) throw new RuntimeException();
            if (is_27_ != null) {
                if (is_27_.length != 64) throw new RuntimeException();
                payloadWhirlpool = NodeSub1Sub2.whirlpoolDigest(4567, 0, is, is.length);
                for (int i_28_ = 0; i_28_ < 64; i_28_++) {
                    if (payloadWhirlpool[i_28_] != is_27_[i_28_]) throw new RuntimeException();
                }
            }
            decode((byte) -120, is);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("vw.<init>(" + (is != null ? "{...}" : "null") + ',' + i + ',' + (is_27_ != null ? "{...}" : "null") + ')'));
        }
    }
}
