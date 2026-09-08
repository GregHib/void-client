/* CacheDirectory - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class201` (JODE-obfuscated).
 * Cache/file-store directory locator. Searches filesystem paths (c:/rscache/, /rscache/, .jagex_cache_<id>, .file_store_<id>) via RandomAccessFile/File to locate the on-disk cache store.
 */

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class CacheDirectory {
    /** Cache store id ("jagex_cache_<id>" / "file_store_<id>"). */
    private static int cacheId;
    /** Logical name → resolved {@link File} cache. */
    private static final Hashtable resolvedFiles;
    /** {@code user.home}/ with trailing slash (or "~/"). */
    private static String userHome;
    /** True after {@link #init}; {@link #resolveCacheFile} requires it. */
    private static boolean initialized = false;
    /** Optional game subdirectory under the cache root. */
    private static String gameSubdir;

    /** Locate/create {@code string} under rscache / jagex_cache paths; memoized. */
    public static File resolveCacheFile(int i, int i_0_, String string, String string_1_) {
        if (!initialized) throw new RuntimeException("");
        File file = (File) resolvedFiles.get(string);
        if (file != null) return file;
        String[] strings = {"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", userHome, "/tmp/", ""};
        String[] strings_2_ = {".jagex_cache_" + i_0_, ".file_store_" + i_0_};
        for (int i_3_ = i; i_3_ < 2; i_3_++) {
            for (int i_4_ = 0; strings_2_.length > i_4_; i_4_++) {
                for (int i_5_ = 0; strings.length > i_5_; i_5_++) {
                    String string_6_ = (strings[i_5_] + strings_2_[i_4_] + "/" + (string_1_ == null ? "" : string_1_ + "/") + string);
                    RandomAccessFile randomaccessfile = null;
                    try {
                        File file_7_ = new File(string_6_);
                        if (i_3_ != 0 || file_7_.exists()) {
                            String string_8_ = strings[i_5_];
                            if (i_3_ != 1 || string_8_.length() <= 0 || new File(string_8_).exists()) {
                                new File(strings[i_5_] + strings_2_[i_4_]).mkdir();
                                if (string_1_ != null) new File(strings[i_5_] + strings_2_[i_4_] + "/" + string_1_).mkdir();
                                randomaccessfile = new RandomAccessFile(file_7_, "rw");
                                int i_9_ = randomaccessfile.read();
                                randomaccessfile.seek(0L);
                                randomaccessfile.write(i_9_);
                                randomaccessfile.seek(0L);
                                randomaccessfile.close();
                                resolvedFiles.put(string, file_7_);
                                return file_7_;
                            }
                        }
                    } catch (Exception exception) {
                        try {
                            if (randomaccessfile != null) {
                                randomaccessfile.close();
                                Object object = null;
                            }
                        } catch (Exception exception_10_) {
                            /* empty */
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    /** Set {@link #cacheId}/{@link #gameSubdir} and resolve {@link #userHome}. */
    public static void init(byte i, String string, int i_11_) {
        cacheId = i_11_;
        if (i != -121) initialized = false;
        gameSubdir = string;
        try {
            userHome = System.getProperty("user.home");
            if (userHome != null) userHome += "/";
        } catch (Exception exception) {
            /* empty */
        }
        initialized = true;
        if (userHome == null) userHome = "~/";
    }

    /** {@link #resolveCacheFile} using {@link #cacheId} and {@link #gameSubdir}. */
    public static File getCacheFile(int i, String string) {
        if (i != -2) getCacheFile(75, null);
        return resolveCacheFile(0, cacheId, string, gameSubdir);
    }

    static {
        resolvedFiles = new Hashtable(16);
    }
}
