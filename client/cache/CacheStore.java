/* CacheStore - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class45` (JODE-obfuscated).
 * JS5 archive store: resolve files by name or id via {@link #getFile}.
 * Lazy-loads {@link #referenceTable} from {@link #archive}; caches packed groups
 * and unpacked files. {@link #discardMode} controls post-read eviction.
 */

final class CacheStore {
    static int anInt626;
    static int anInt627;
    static int anInt628;
    private ReferenceTable referenceTable = null;
    static int anInt630;
    static int anInt631;
    static int anInt632;
    static int anInt633;
    /** Eviction: {@code 1} drop file after read, {@code 2} drop whole group. */
    int discardMode;
    static int anInt635;
    static int anInt636;
    static int anInt637;
    static int anInt638;
    static int anInt639;
    static int anInt640;
    static int anInt641;
    static int anInt642;
    static StringCache aClass351_643 = new StringCache(3, -1);
    static int anInt644;
    static int anInt645;
    static int anInt646;
    static int anInt647;
    static int anInt648;
    static int anInt649;
    static int anInt650;
    static int anInt651;
    static int anInt652;
    static int anInt653;
    static int anInt654;
    private final boolean discardPacked;
    private Object[] packedGroups;
    static int anInt657;
    static int anInt658;
    private Component112 archive;
    static int anInt660;
    static int anInt661;
    static int anInt662;
    static int anInt663;
    private Object[][] unpackedFiles;
    static int anInt665;
    static int anInt666;
    static long aLong667;
    static int anInt668;
    static int anInt669 = 0;
    static float aFloat670;

    final int getCrc(int i) {
        int i_0_ = -117 / ((-60 - i) / 33);
        anInt657++;
        if (!ensureReferenceTable(false)) throw new IllegalStateException("");
        return referenceTable.crc;
    }

    public static void clearStatics(byte i) {
        aClass351_643 = null;
        if (i != 10) clearStatics((byte) -3);
    }

    final byte[] getFile(String string, String string_1_, int i) {
        try {
            anInt647++;
            if (!ensureReferenceTable(false)) return null;
            string = string.toLowerCase();
            string_1_ = string_1_.toLowerCase();
            int i_2_ = referenceTable.groupNameTable.lookup(1, Component337.hashString(string, -29286));
            if (!isValidGroup(i_2_, (byte) -40)) return null;
            if (i != -29832) isValidGroup(22, (byte) 12);
            int i_3_ = (referenceTable.fileNameTables[i_2_].lookup(i ^ ~0x7486, Component337.hashString(string_1_, -29286)));
            return getFile(-1860, i_2_, i_3_);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("in.EA(" + (string != null ? "{...}" : "null") + ',' + (string_1_ != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    private final boolean isValidGroup(int i, byte i_4_) {
        anInt646++;
        if (!ensureReferenceTable(false)) return false;
        if (i < 0 || referenceTable.fileCounts.length <= i || (referenceTable.fileCounts[i] == 0)) {
            if (DebugPanic.aBoolean4741) throw new IllegalArgumentException(Integer.toString(i));
            return false;
        }
        return i_4_ == -40;
    }

    final byte[] getFile(int i, int i_5_, int i_6_, int[] is) {
        anInt639++;
        if (i_6_ != 2) anInt669 = 51;
        if (!isValidFile(i_5_, i_6_ + -2, i)) return null;
        if (unpackedFiles[i] == null || unpackedFiles[i][i_5_] == null) {
            boolean bool = unpackFile(i_5_, (byte) -78, is, i);
            if (!bool) {
                loadGroup(i, -117);
                bool = unpackFile(i_5_, (byte) -103, is, i);
                if (!bool) return null;
            }
        }
        byte[] is_7_ = Cp1252Decoder.unwrapBytes(false, unpackedFiles[i][i_5_], 53146732);
        if (this.discardMode == 1) {
            unpackedFiles[i][i_5_] = null;
            if (referenceTable.fileCounts[i] == 1) unpackedFiles[i] = null;
        } else if (this.discardMode == 2) unpackedFiles[i] = null;
        return is_7_;
    }

    private final boolean unpackFile(int i, byte i_8_, int[] is, int i_9_) {
        anInt628++;
        if (!isValidGroup(i_9_, (byte) -40)) return false;
        if (packedGroups[i_9_] == null) return false;
        int i_10_ = referenceTable.fileIdCounts[i_9_];
        int[] is_11_ = referenceTable.fileIds[i_9_];
        if (unpackedFiles[i_9_] == null) unpackedFiles[i_9_] = new Object[referenceTable.fileCounts[i_9_]];
        Object[] objects = unpackedFiles[i_9_];
        boolean bool = true;
        for (int i_12_ = 0; i_10_ > i_12_; i_12_++) {
            int i_13_;
            if (is_11_ == null) i_13_ = i_12_;
            else i_13_ = is_11_[i_12_];
            if (objects[i_13_] == null) {
                bool = false;
                break;
            }
        }
        if (bool) return true;
        byte[] is_14_;
        if (is == null || (is[0] == 0 && is[1] == 0 && is[2] == 0 && is[3] == 0)) is_14_ = Cp1252Decoder.unwrapBytes(false, packedGroups[i_9_], 53146732);
        else {
            is_14_ = Cp1252Decoder.unwrapBytes(true, packedGroups[i_9_], 53146732);
            Buffer class348_sub49 = new Buffer(is_14_);
            class348_sub49.xteaDecrypt(607818341, is, 5, (class348_sub49.payload).length);
        }
        byte[] is_15_;
        try {
            is_15_ = NodeSub41.decompressContainer(is_14_, -120);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("T3 - " + (is != null) + "," + i_9_ + "," + is_14_.length + "," + Component210.crc32(5126, is_14_.length, is_14_) + "," + Component210.crc32(5126, -2 + is_14_.length, is_14_) + "," + referenceTable.groupCrcs[i_9_] + "," + referenceTable.crc));
        }
        if (discardPacked) packedGroups[i_9_] = null;
        if (i_8_ >= -17) getSingletonFile((byte) 70, -7);
        if (i_10_ > 1) {
            if (this.discardMode == 2) {
                int i_30_ = is_15_.length;
                int i_31_ = 0xff & is_15_[--i_30_];
                i_30_ -= 4 * (i_31_ * i_10_);
                Buffer class348_sub49 = new Buffer(is_15_);
                int i_32_ = 0;
                int i_33_ = 0;
                class348_sub49.offset = i_30_;
                for (int i_34_ = 0; i_34_ < i_31_; i_34_++) {
                    int i_35_ = 0;
                    for (int i_36_ = 0; i_36_ < i_10_; i_36_++) {
                        i_35_ += class348_sub49.readInt((byte) -126);
                        int i_37_;
                        if (is_11_ == null) i_37_ = i_36_;
                        else i_37_ = is_11_[i_36_];
                        if (i == i_37_) {
                            i_33_ = i_37_;
                            i_32_ += i_35_;
                        }
                    }
                }
                if (i_32_ == 0) return true;
                byte[] is_38_ = new byte[i_32_];
                class348_sub49.offset = i_30_;
                i_32_ = 0;
                int i_39_ = 0;
                for (int i_40_ = 0; i_40_ < i_31_; i_40_++) {
                    int i_41_ = 0;
                    for (int i_42_ = 0; i_42_ < i_10_; i_42_++) {
                        i_41_ += class348_sub49.readInt((byte) -126);
                        int i_43_;
                        if (is_11_ != null) i_43_ = is_11_[i_42_];
                        else i_43_ = i_42_;
                        if (i_43_ == i) {
                            Component313.arraycopy(is_15_, i_39_, is_38_, i_32_, i_41_);
                            i_32_ += i_41_;
                        }
                        i_39_ += i_41_;
                    }
                }
                objects[i_33_] = is_38_;
            } else {
                int i_16_ = is_15_.length;
                int i_17_ = 0xff & is_15_[--i_16_];
                i_16_ -= 4 * (i_10_ * i_17_);
                Buffer class348_sub49 = new Buffer(is_15_);
                int[] is_18_ = new int[i_10_];
                class348_sub49.offset = i_16_;
                for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
                    int i_20_ = 0;
                    for (int i_21_ = 0; i_21_ < i_10_; i_21_++) {
                        i_20_ += class348_sub49.readInt((byte) -126);
                        is_18_[i_21_] += i_20_;
                    }
                }
                byte[][] is_22_ = new byte[i_10_][];
                for (int i_23_ = 0; i_10_ > i_23_; i_23_++) {
                    is_22_[i_23_] = new byte[is_18_[i_23_]];
                    is_18_[i_23_] = 0;
                }
                class348_sub49.offset = i_16_;
                int i_24_ = 0;
                for (int i_25_ = 0; i_25_ < i_17_; i_25_++) {
                    int i_26_ = 0;
                    for (int i_27_ = 0; i_10_ > i_27_; i_27_++) {
                        i_26_ += class348_sub49.readInt((byte) -126);
                        Component313.arraycopy(is_15_, i_24_, is_22_[i_27_], is_18_[i_27_], i_26_);
                        i_24_ += i_26_;
                        is_18_[i_27_] += i_26_;
                    }
                }
                for (int i_28_ = 0; i_10_ > i_28_; i_28_++) {
                    int i_29_;
                    if (is_11_ == null) i_29_ = i_28_;
                    else i_29_ = is_11_[i_28_];
                    if (this.discardMode != 0) objects[i_29_] = is_22_[i_28_];
                    else objects[i_29_] = BrowserDetector.wrapSoft(is_22_[i_28_], false, (byte) 126);
                }
            }
        } else {
            int i_44_;
            if (is_11_ != null) i_44_ = is_11_[0];
            else i_44_ = 0;
            if (this.discardMode != 0) objects[i_44_] = is_15_;
            else objects[i_44_] = BrowserDetector.wrapSoft(is_15_, false, (byte) 104);
        }
        return true;
    }

    static final void method395(int i) throws Exception_Sub1 {
        if (Buffer.anInt7207 == 1) Component158.aHa326.swapBuffers(NewsFetcher.anInt4211, DefinitionSub8.anInt9157);
        else Component158.aHa326.swapBuffers(0, 0);
        if (i >= 73) anInt642++;
    }

    final int[] getFileIds(int i, int i_45_) {
        anInt640++;
        if (i_45_ != 0) getCrc(-55);
        if (!isValidGroup(i, (byte) -40)) return null;
        int[] is = referenceTable.fileIds[i];
        if (is == null) {
            is = new int[referenceTable.fileIdCounts[i]];
            for (int i_46_ = 0; i_46_ < is.length; i_46_++)
                is[i_46_] = i_46_;
        }
        return is;
    }

    final int getNamedGroupLoadPercent(String string, int i) {
        anInt633++;
        if (!ensureReferenceTable(false)) return 0;
        string = string.toLowerCase();
        if (i != 0) archive = null;
        int i_47_ = referenceTable.groupNameTable.lookup(1, Component337.hashString(string, i ^ ~0x7265));
        return getGroupLoadPercent(i, i_47_);
    }

    final int getAverageLoadPercent(byte i) {
        anInt641++;
        if (!ensureReferenceTable(false)) return 0;
        int i_48_ = 0;
        int i_49_ = 0;
        int i_50_ = 0;
        if (i != -31) return 50;
        for (/**/; packedGroups.length > i_50_; i_50_++) {
            if (referenceTable.fileIdCounts[i_50_] > 0) {
                i_49_ += getGroupLoadPercent(0, i_50_);
                i_48_ += 100;
            }
        }
        if (i_48_ == 0) return 100;
        int i_51_ = i_49_ * 100 / i_48_;
        return i_51_;
    }

    private final boolean ensureReferenceTable(boolean bool) {
        anInt652++;
        if (referenceTable == null) {
            referenceTable = archive.getReferenceTable((byte) 56);
            if (referenceTable == null) return false;
            packedGroups = new Object[referenceTable.groupCapacity];
            unpackedFiles = new Object[referenceTable.groupCapacity][];
        }
        if (bool != false) archive = null;
        return true;
    }

    final boolean hasGroup(int i, String string) {
        anInt635++;
        if (!ensureReferenceTable(false)) return false;
        if (i != -18308) return false;
        string = string.toLowerCase();
        int i_52_ = referenceTable.groupNameTable.lookup(1, Component337.hashString(string, -29286));
        return i_52_ >= 0;
    }

    final boolean prefetchMandatory(int i) {
        anInt648++;
        if (!ensureReferenceTable(false)) return false;
        boolean bool = true;
        for (int i_53_ = 0; (i_53_ < referenceTable.groupIds.length); i_53_++) {
            int i_54_ = referenceTable.groupIds[i_53_];
            if (packedGroups[i_54_] == null) {
                loadGroup(i_54_, -128);
                if (packedGroups[i_54_] == null) bool = false;
            }
        }
        if (i < 33) getFileCount(100, -92);
        return bool;
    }

    private final void requestGroupLoad(byte i, int i_55_) {
        anInt658++;
        if (i < -70) archive.requestGroup((byte) -52, i_55_);
    }

    private final boolean containsFile(String string, int i, String string_56_) {
        try {
            anInt626++;
            if (!ensureReferenceTable(false)) return false;
            string = string.toLowerCase();
            string_56_ = string_56_.toLowerCase();
            int i_57_ = (referenceTable.groupNameTable.lookup(i ^ 0x1c1a, Component337.hashString(string, -29286)));
            if (i != 7195) containsFile(null, -20, null);
            if (!isValidGroup(i_57_, (byte) -40)) return false;
            int i_58_ = referenceTable.fileNameTables[i_57_].lookup(1, Component337.hashString(string_56_, -29286));
            return isFileReady(i + -17694, i_57_, i_58_);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("in.Q(" + (string != null ? "{...}" : "null") + ',' + i + ',' + (string_56_ != null ? "{...}" : "null") + ')'));
        }
    }

    final void clearNameTables(int i, boolean bool, boolean bool_59_) {
        anInt644++;
        if (i != 0) getFile(null, null, -3);
        if (ensureReferenceTable(false)) {
            if (bool_59_) {
                referenceTable.groupNameHashes = null;
                referenceTable.groupNameTable = null;
            }
            if (bool) {
                referenceTable.fileNameHashes = null;
                referenceTable.fileNameTables = null;
            }
        }
    }

    final void clearPacked(int i) {
        anInt650++;
        if (i != 0) contains((byte) -45, null);
        if (packedGroups != null) {
            for (int i_60_ = 0; i_60_ < packedGroups.length; i_60_++)
                packedGroups[i_60_] = null;
        }
    }

    private final void loadGroup(int i, int i_61_) {
        if (i_61_ > -105) unpackedFiles = null;
        if (!discardPacked) packedGroups[i] = BrowserDetector.wrapSoft(archive.getGroupData(i, (byte) 73), false, (byte) 123);
        else packedGroups[i] = archive.getGroupData(i, (byte) 12);
        anInt665++;
    }

    final int getFileCount(int i, int i_62_) {
        if (i != 0) getCrc(-61);
        anInt645++;
        if (!isValidGroup(i_62_, (byte) -40)) return 0;
        return referenceTable.fileCounts[i_62_];
    }

    final boolean isGroupReady(byte i, int i_63_) {
        anInt632++;
        if (!isValidGroup(i_63_, (byte) -40)) return false;
        if (packedGroups[i_63_] != null) return true;
        loadGroup(i_63_, -124);
        if (packedGroups[i_63_] != null) return true;
        if (i > -112) this.discardMode = -26;
        return false;
    }

    final void requestGroupByName(String string, boolean bool) {
        anInt663++;
        if (bool == true && ensureReferenceTable(false)) {
            string = string.toLowerCase();
            int i = referenceTable.groupNameTable.lookup(1, Component337.hashString(string, -29286));
            requestGroupLoad((byte) -86, i);
        }
    }

    final byte[] getFile(int i, int i_64_, int i_65_) {
        if (i != -1860) unpackedFiles = null;
        anInt651++;
        return getFile(i_64_, i_65_, i ^ ~0x741, null);
    }

    final void clearUnpackedGroup(int i, int i_66_) {
        anInt627++;
        if (i_66_ > -9) unpackFile(-111, (byte) -98, null, -71);
        if (isValidGroup(i, (byte) -40)) {
            if (unpackedFiles != null) unpackedFiles[i] = null;
        }
    }

    final void clearUnpacked(byte i) {
        if (unpackedFiles != null) {
            for (int i_67_ = 0; unpackedFiles.length > i_67_; i_67_++)
                unpackedFiles[i_67_] = null;
        }
        int i_68_ = 52 % ((-46 - i) / 62);
        anInt660++;
    }

    final boolean isGroupReadyByName(int i, String string) {
        anInt636++;
        if (!ensureReferenceTable(false)) return false;
        string = string.toLowerCase();
        int i_69_ = referenceTable.groupNameTable.lookup(i + -99, Component337.hashString(string, -29286));
        if (i != 100) aFloat670 = 0.37849286F;
        return isGroupReady((byte) -120, i_69_);
    }

    final int getGroupCapacity(int i) {
        anInt637++;
        if (i != -1) return 49;
        if (!ensureReferenceTable(false)) return -1;
        return referenceTable.fileCounts.length;
    }

    final byte[] getSingletonFile(byte i, int i_70_) {
        anInt630++;
        if (!ensureReferenceTable(false)) return null;
        if (referenceTable.fileCounts.length == 1) return getFile(i ^ ~0x70a, 0, i_70_);
        if (!isValidGroup(i_70_, (byte) -40)) return null;
        if (i != 73) unpackedFiles = null;
        if (referenceTable.fileCounts[i_70_] == 1) return getFile(i ^ ~0x70a, i_70_, 0);
        throw new RuntimeException();
    }

    final boolean contains(byte i, String string) {
        anInt631++;
        int i_71_ = getGroupId("", i + 74);
        if (i_71_ != -1) return containsFile("", 7195, string);
        if (i != -74) return false;
        return containsFile(string, 7195, "");
    }

    final int getGroupId(String string, int i) {
        if (i != 0) return 113;
        anInt654++;
        if (!ensureReferenceTable(false)) return -1;
        string = string.toLowerCase();
        int i_72_ = referenceTable.groupNameTable.lookup(1, Component337.hashString(string, -29286));
        if (!isValidGroup(i_72_, (byte) -40)) return -1;
        return i_72_;
    }

    private final boolean isValidFile(int i, int i_73_, int i_74_) {
        anInt662++;
        if (!ensureReferenceTable(false)) return false;
        if (i_74_ < i_73_ || i < 0 || (referenceTable.fileCounts.length <= i_74_) || (referenceTable.fileCounts[i_74_] <= i)) {
            if (DebugPanic.aBoolean4741) throw new IllegalArgumentException(i_74_ + "," + i);
            return false;
        }
        return true;
    }

    private final int getGroupLoadPercent(int i, int i_75_) {
        if (i != 0) return -117;
        anInt653++;
        if (!isValidGroup(i_75_, (byte) -40)) return 0;
        if (packedGroups[i_75_] != null) return 100;
        return archive.getGroupLoadPercent(i_75_, i + -22197);
    }

    final boolean isFileReady(int i, int i_76_, int i_77_) {
        anInt638++;
        if (!isValidFile(i_77_, 0, i_76_)) return false;
        if (unpackedFiles[i_76_] != null && unpackedFiles[i_76_][i_77_] != null) return true;
        if (i != -10499) return true;
        if (packedGroups[i_76_] != null) return true;
        loadGroup(i_76_, -125);
        return packedGroups[i_76_] != null;
    }

    final boolean isSingletonFileReady(boolean bool, int i) {
        anInt661++;
        if (!ensureReferenceTable(bool)) return false;
        if (referenceTable.fileCounts.length == 1) return isFileReady(-10499, 0, i);
        if (!isValidGroup(i, (byte) -40)) return false;
        if (referenceTable.fileCounts[i] == 1) return isFileReady(-10499, i, 0);
        if (bool != false) return false;
        throw new RuntimeException();
    }

    final boolean containsNamed(String string, String string_78_, int i) {
        try {
            anInt668++;
            if (!ensureReferenceTable(false)) return false;
            string_78_ = string_78_.toLowerCase();
            if (i > -18) anInt669 = 40;
            string = string.toLowerCase();
            int i_79_ = referenceTable.groupNameTable.lookup(1, Component337.hashString(string_78_, -29286));
            if (i_79_ < 0) return false;
            int i_80_ = referenceTable.fileNameTables[i_79_].lookup(1, Component337.hashString(string, -29286));
            return i_80_ >= 0;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("in.M(" + (string != null ? "{...}" : "null") + ',' + (string_78_ != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    final int getGroupIdByHash(int i, byte i_81_) {
        anInt649++;
        if (!ensureReferenceTable(false)) return -1;
        int i_82_ = referenceTable.groupNameTable.lookup(1, i);
        if (!isValidGroup(i_82_, (byte) -40)) return -1;
        int i_83_ = -60 / ((i_81_ - -4) / 56);
        return i_82_;
    }

    CacheStore(Component112 class314, boolean bool, int i) {
        if (i < 0 || i > 2) throw new IllegalArgumentException("js5: Invalid value " + i + " supplied for discardunpacked");
        archive = class314;
        discardPacked = bool;
        this.discardMode = i;
    }

    static {
        anInt666 = 100;
    }
}
