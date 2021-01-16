/* Class201 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class Class201 {
    private static int anInt2641;
    private static final Hashtable aHashtable2642;
    private static String aString2643;
    private static boolean aBoolean2644 = false;
    private static String aString2645;

    public static File method1464(int i, int i_0_, String string,
                                  String string_1_) {
        if (!aBoolean2644)
            throw new RuntimeException("");
        File file = (File) aHashtable2642.get(string);
        if (file != null)
            return file;
        String[] strings = {"c:/rscache/", "/rscache/", "c:/windows/",
                "c:/winnt/", "c:/", aString2643, "/tmp/", ""};
        String[] strings_2_
                = {".jagex_cache_" + i_0_, ".file_store_" + i_0_};
        for (int i_3_ = i; i_3_ < 2; i_3_++) {
            for (int i_4_ = 0; strings_2_.length > i_4_; i_4_++) {
                for (int i_5_ = 0;
                     (i_5_ ^ 0xffffffff) > (strings.length ^ 0xffffffff);
                     i_5_++) {
                    String string_6_
                            = (strings[i_5_] + strings_2_[i_4_] + "/"
                            + (string_1_ == null ? "" : string_1_ + "/")
                            + string);
                    RandomAccessFile randomaccessfile = null;
                    try {
                        File file_7_ = new File(string_6_);
                        if (i_3_ != 0 || file_7_.exists()) {
                            String string_8_ = strings[i_5_];
                            if ((i_3_ ^ 0xffffffff) != -2
                                    || string_8_.length() <= 0
                                    || new File(string_8_).exists()) {
                                new File(strings[i_5_] + strings_2_[i_4_])
                                        .mkdir();
                                if (string_1_ != null)
                                    new File(strings[i_5_] + strings_2_[i_4_]
                                            + "/" + string_1_).mkdir();
                                randomaccessfile
                                        = new RandomAccessFile(file_7_, "rw");
                                int i_9_ = randomaccessfile.read();
                                randomaccessfile.seek(0L);
                                randomaccessfile.write(i_9_);
                                randomaccessfile.seek(0L);
                                randomaccessfile.close();
                                aHashtable2642.put(string, file_7_);
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

    public static void method1465(byte i, String string, int i_11_) {
        anInt2641 = i_11_;
        if (i != -121)
            aBoolean2644 = false;
        aString2645 = string;
        try {
            aString2643 = System.getProperty("user.home");
            if (aString2643 != null)
                aString2643 += "/";
        } catch (Exception exception) {
            /* empty */
        }
        aBoolean2644 = true;
        if (aString2643 == null)
            aString2643 = "~/";
    }

    public static File method1466(int i, String string) {
        if (i != -2)
            method1466(75, null);
        return method1464(0, anInt2641, string, aString2645);
    }

    static {
        aHashtable2642 = new Hashtable(16);
    }
}
