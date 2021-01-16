/* Class348_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class Class348_Sub33 extends Class348 {
    boolean[] aBooleanArray6954;
    static Class152 aClass152_6955 = new Class152();
    static int anInt6956;
    int[] anIntArray6957;
    int anInt6958;
    int[][] anIntArrayArray6959;
    int[] anIntArray6960;
    static int anInt6961;
    static byte[][][] aByteArrayArrayArray6962;
    static long aLong6963 = 0L;
    static int anInt6964;
    int anInt6965;
    static long aLong6966;
    static int anInt6967 = 0;

    public static void method3024(int i) {
        aClass152_6955 = null;
        if (i >= -74)
            anInt6967 = 12;
        aByteArrayArrayArray6962 = null;
    }

    static final void method3025(byte i,
                                 Class348_Sub49_Sub2 class348_sub49_sub2) {
        anInt6961++;
        Class348_Sub48 class348_sub48
                = (Class348_Sub48) Class348_Sub35.aClass262_6978.method1995(4);
        if (class348_sub48 != null) {
            boolean bool = false;
            for (int i_0_ = 0;
                 i_0_ < class348_sub48.anInt7126; i_0_++) {
                if (class348_sub48.aClass144Array7135[i_0_]
                        != null) {
                    if (((class348_sub48.aClass144Array7135
                            [i_0_].anInt1997)
                            ^ 0xffffffff)
                            == -3)
                        class348_sub48.anIntArray7131[i_0_]
                                = -5;
                    if (((class348_sub48.aClass144Array7135
                            [i_0_].anInt1997)
                            ^ 0xffffffff)
                            == -1)
                        bool = true;
                }
                if (class348_sub48.aClass144Array7127[i_0_]
                        != null) {
                    if (((class348_sub48.aClass144Array7127
                            [i_0_].anInt1997)
                            ^ 0xffffffff)
                            == -3)
                        class348_sub48.anIntArray7131[i_0_]
                                = -6;
                    if ((class348_sub48.aClass144Array7127
                            [i_0_].anInt1997)
                            == 0)
                        bool = true;
                }
            }
            if (i < 37)
                aLong6966 = -3L;
            if (!bool) {
                int i_1_ = class348_sub49_sub2.anInt7197;
                class348_sub49_sub2.method3391((byte) 94,
                        class348_sub48.anInt7130);
                for (int i_2_ = 0;
                     ((class348_sub48.anInt7126
                             ^ 0xffffffff)
                             < (i_2_ ^ 0xffffffff));
                     i_2_++) {
                    if (class348_sub48.anIntArray7131[i_2_]
                            != 0)
                        class348_sub49_sub2.method3378(false,
                                (class348_sub48
                                        .anIntArray7131
                                        [i_2_]));
                    else {
                        try {
                            int i_3_ = (class348_sub48
                                    .anIntArray7132[i_2_]);
                            if ((i_3_ ^ 0xffffffff) != -1) {
                                if ((i_3_ ^ 0xffffffff) == -2) {
                                    Field field
                                            = ((Field)
                                            (class348_sub48
                                                    .aClass144Array7135[i_2_]
                                                    .anObject1998));
                                    field.setInt(null,
                                            (class348_sub48
                                                    .anIntArray7136[i_2_]));
                                    class348_sub49_sub2.method3378(false, 0);
                                } else if (i_3_ == 2) {
                                    Field field
                                            = ((Field)
                                            (class348_sub48
                                                    .aClass144Array7135[i_2_]
                                                    .anObject1998));
                                    int i_4_ = field.getModifiers();
                                    class348_sub49_sub2.method3378(false, 0);
                                    class348_sub49_sub2.method3391((byte) 122,
                                            i_4_);
                                }
                            } else {
                                Field field
                                        = ((Field)
                                        (class348_sub48
                                                .aClass144Array7135[i_2_]
                                                .anObject1998));
                                int i_5_ = field.getInt(null);
                                class348_sub49_sub2.method3378(false, 0);
                                class348_sub49_sub2.method3391((byte) 108,
                                        i_5_);
                            }
                            if (i_3_ == 3) {
                                Method method
                                        = ((Method)
                                        (class348_sub48
                                                .aClass144Array7127[i_2_]
                                                .anObject1998));
                                byte[][] is
                                        = (class348_sub48
                                        .aByteArrayArrayArray7128[i_2_]);
                                Object[] objects = new Object[is.length];
                                for (int i_6_ = 0; is.length > i_6_; i_6_++) {
                                    ObjectInputStream objectinputstream
                                            = (new ObjectInputStream
                                            (new ByteArrayInputStream(is
                                                    [i_6_])));
                                    objects[i_6_]
                                            = objectinputstream.readObject();
                                }
                                Object object = method.invoke(null, objects);
                                if (object != null) {
                                    if (object instanceof Number) {
                                        class348_sub49_sub2.method3378(false,
                                                1);
                                        class348_sub49_sub2.method3392
                                                (((Number) object).longValue(),
                                                        (byte) -81);
                                    } else if (!(object instanceof String))
                                        class348_sub49_sub2.method3378(false,
                                                4);
                                    else {
                                        class348_sub49_sub2.method3378(false,
                                                2);
                                        class348_sub49_sub2.method3333
                                                ((byte) -5, (String) object);
                                    }
                                } else
                                    class348_sub49_sub2.method3378(false, 0);
                            } else if (i_3_ == 4) {
                                Method method
                                        = ((Method)
                                        (class348_sub48
                                                .aClass144Array7127[i_2_]
                                                .anObject1998));
                                int i_7_ = method.getModifiers();
                                class348_sub49_sub2.method3378(false, 0);
                                class348_sub49_sub2.method3391((byte) 95,
                                        i_7_);
                            }
                        } catch (ClassNotFoundException classnotfoundexception) {
                            class348_sub49_sub2.method3378(false, -10);
                        } catch (java.io.InvalidClassException invalidclassexception) {
                            class348_sub49_sub2.method3378(false, -11);
                        } catch (java.io.StreamCorruptedException streamcorruptedexception) {
                            class348_sub49_sub2.method3378(false, -12);
                        } catch (java.io.OptionalDataException optionaldataexception) {
                            class348_sub49_sub2.method3378(false, -13);
                        } catch (IllegalAccessException illegalaccessexception) {
                            class348_sub49_sub2.method3378(false, -14);
                        } catch (IllegalArgumentException illegalargumentexception) {
                            class348_sub49_sub2.method3378(false, -15);
                        } catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
                            class348_sub49_sub2.method3378(false, -16);
                        } catch (SecurityException securityexception) {
                            class348_sub49_sub2.method3378(false, -17);
                        } catch (java.io.IOException ioexception) {
                            class348_sub49_sub2.method3378(false, -18);
                        } catch (NullPointerException nullpointerexception) {
                            class348_sub49_sub2.method3378(false, -19);
                        } catch (Exception exception) {
                            class348_sub49_sub2.method3378(false, -20);
                        } catch (Throwable throwable) {
                            class348_sub49_sub2.method3378(false, -21);
                        }
                    }
                }
                class348_sub49_sub2.method3344(i_1_, false);
                class348_sub48.method2715((byte) 46);
            }
        }
    }

    Class348_Sub33(int i, byte[] is) {
        this.anInt6958 = i;
        Class348_Sub49 class348_sub49 = new Class348_Sub49(is);
        this.anInt6965 = class348_sub49.method3387(255);
        this.anIntArrayArray6959
                = new int[this.anInt6965][];
        this.anIntArray6957
                = new int[this.anInt6965];
        this.anIntArray6960
                = new int[this.anInt6965];
        this.aBooleanArray6954
                = new boolean[this.anInt6965];
        for (int i_8_ = 0; ((this.anInt6965 ^ 0xffffffff)
                < (i_8_ ^ 0xffffffff)); i_8_++) {
            this.anIntArray6957[i_8_]
                    = class348_sub49.method3387(255);
            if (this.anIntArray6957[i_8_] == 6)
                this.anIntArray6957[i_8_] = 2;
        }
        for (int i_9_ = 0; ((this.anInt6965 ^ 0xffffffff)
                < (i_9_ ^ 0xffffffff)); i_9_++)
            this.aBooleanArray6954[i_9_]
                    = (class348_sub49.method3387(255) ^ 0xffffffff) == -2;
        for (int i_10_ = 0; ((this.anInt6965 ^ 0xffffffff)
                < (i_10_ ^ 0xffffffff)); i_10_++)
            this.anIntArray6960[i_10_]
                    = class348_sub49.method3330(842397944);
        for (int i_11_ = 0;
             ((i_11_ ^ 0xffffffff)
                     > (this.anInt6965 ^ 0xffffffff));
             i_11_++)
            this.anIntArrayArray6959[i_11_]
                    = new int[class348_sub49.method3387(255)];
        for (int i_12_ = 0; i_12_ < this.anInt6965;
             i_12_++) {
            for (int i_13_ = 0;
                 (i_13_
                         < this.anIntArrayArray6959[i_12_].length);
                 i_13_++)
                this.anIntArrayArray6959[i_12_][i_13_]
                        = class348_sub49.method3387(255);
        }
    }

    static {
        aLong6966 = 0L;
    }
}
