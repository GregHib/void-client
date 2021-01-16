/* Class297 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

final class Class297 implements Runnable {
    private Callback_Sub1 aCallback_Sub1_3776;
    boolean aBoolean3777;
    static String aString3778;
    Class234 aClass234_3779 = null;
    static String aString3780;
    private static volatile long aLong3781 = 0L;
    static String aString3782;
    static Method aMethod3783;
    private static String aString3784;
    Class234 aClass234_3785 = null;
    static Method aMethod3786;
    private Object anObject3787;
    Class234 aClass234_3788;
    private static String aString3789;
    private Thread aThread3790;
    private Object anObject3791;
    private static int anInt3792;
    private Object anObject3793;
    boolean aBoolean3794;
    Class234[] aClass234Array3795;
    static String aString3796;
    private Class144 aClass144_3797;
    private Class144 aClass144_3798;
    EventQueue anEventQueue3799;
    private static String aString3800;
    private boolean aBoolean3801;
    private Class134 aClass134_3802;
    static String aString3803;
    /*synthetic*/ static Class aClass3804;
    /*synthetic*/ static Class aClass3805;
    /*synthetic*/ static Class aClass3806;
    /*synthetic*/ static Class aClass3807;

    final Class144 method2229(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
        if (i_3_ != -11)
            aLong3781 = 34L;
        return method2246(8, (i_1_ << -1229135248) - -i, 6,
                i_0_ + (i_2_ << -1182263728), null);
    }

    final Class144 method2230(Class[] var_classes, int i, Class var_class,
                              String string) {
        if (i < 49)
            return null;
        return method2246(8, 0, 8, 0,
                new Object[]{var_class, string, var_classes});
    }

    static final Class234 method2231(String string, int i) {
        if (i != -1141472112)
            return null;
        return method2241(string, 12606, aString3789, anInt3792);
    }

    final Class144 method2232(int i, int i_4_) {
        if (i <= 20)
            method2236(null, -123, -128);
        return method2246(8, 0, 3, i_4_, null);
    }

    final Class144 method2233(byte i, String string, boolean bool) {
        if (i != -46)
            return null;
        if (!bool)
            return method2246(8, 0, 13, 0, string);
        return method2246(8, 0, 12, 0, string);
    }

    public final void run() {
        for (; ; ) {
            Class144 class144;
            synchronized (this) {
                for (; ; ) {
                    if (aBoolean3801)
                        return;
                    if (aClass144_3797 != null) {
                        class144 = aClass144_3797;
                        aClass144_3797
                                = ((Class144) aClass144_3797).aClass144_1995;
                        if (aClass144_3797 == null)
                            aClass144_3798 = null;
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            try {
                int i = ((Class144) class144).anInt1994;
                if (i != 1) {
                    if ((i ^ 0xffffffff) != -23) {
                        if (i == 2) {
                            Thread thread
                                    = new Thread((Runnable) (((Class144) class144)
                                    .anObject1996));
                            thread.setDaemon(true);
                            thread.start();
                            thread.setPriority(class144.anInt2000);
                            class144.anObject1998 = thread;
                        } else if ((i ^ 0xffffffff) == -5) {
                            if ((aLong3781 ^ 0xffffffffffffffffL)
                                    < (Class62.method599(-73)
                                    ^ 0xffffffffffffffffL))
                                throw new IOException();
                            class144.anObject1998
                                    = new DataInputStream(((URL)
                                    (((Class144) class144)
                                            .anObject1996))
                                    .openStream());
                        } else if (i != 8) {
                            if ((i ^ 0xffffffff) != -10) {
                                if (i != 18) {
                                    if (i == 19) {
                                        Transferable transferable
                                                = ((Transferable)
                                                (((Class144) class144)
                                                        .anObject1996));
                                        Clipboard clipboard
                                                = Toolkit.getDefaultToolkit()
                                                .getSystemClipboard();
                                        clipboard.setContents(transferable,
                                                null);
                                    } else if (((Class297) this)
                                            .aBoolean3777) {
                                        if ((i ^ 0xffffffff) == -4) {
                                            if (aLong3781
                                                    > Class62.method599(-123))
                                                throw new IOException();
                                            String string
                                                    = ((String.valueOf
                                                    (0xff & (class144.anInt2000
                                                            >> 1726433208)))
                                                    + "."
                                                    + (0xff
                                                    & (class144.anInt2000
                                                    >> -1141472112))
                                                    + "."
                                                    + ((class144.anInt2000
                                                    >> 1095645000)
                                                    & 0xff)
                                                    + "."
                                                    + (0xff
                                                    & class144.anInt2000));
                                            class144.anObject1998
                                                    = InetAddress.getByName
                                                    (string).getHostName();
                                        } else if (i == 21) {
                                            if (Class62.method599(-82)
                                                    < aLong3781)
                                                throw new IOException();
                                            class144.anObject1998
                                                    = InetAddress.getByName
                                                    ((String)
                                                            (((Class144) class144)
                                                                    .anObject1996))
                                                    .getAddress();
                                        } else if ((i ^ 0xffffffff) != -6) {
                                            if (i != 6) {
                                                if ((i ^ 0xffffffff) == -8) {
                                                    if (((Class297) this)
                                                            .aBoolean3794)
                                                        aClass134_3802
                                                                .method1147
                                                                        (((Frame)
                                                                                        (((Class144)
                                                                                                class144)
                                                                                                .anObject1996)),
                                                                                8);
                                                    else
                                                        Class.forName
                                                                ("Class7")
                                                                .getMethod
                                                                        ("method211",
                                                                                new Class[0])
                                                                .invoke
                                                                        (anObject3793,
                                                                                new Object[0]);
                                                } else if (i == 12) {
                                                    Class234 class234
                                                            = (method2241
                                                            (((String)
                                                                            (((Class144)
                                                                                    class144)
                                                                                    .anObject1996)),
                                                                    12606, aString3789,
                                                                    anInt3792));
                                                    class144.anObject1998
                                                            = class234;
                                                } else if ((i ^ 0xffffffff)
                                                        != -14) {
                                                    if ((((Class297) this)
                                                            .aBoolean3777)
                                                            && i == 14) {
                                                        int i_5_
                                                                = (class144
                                                                .anInt2000);
                                                        int i_6_
                                                                = (((Class144)
                                                                class144)
                                                                .anInt1999);
                                                        if (((Class297) this)
                                                                .aBoolean3794)
                                                            aCallback_Sub1_3776
                                                                    .method3621
                                                                            (i_5_,
                                                                                    (byte) 115,
                                                                                    i_6_);
                                                        else
                                                            Class.forName
                                                                    ("Class165")
                                                                    .getDeclaredMethod
                                                                            ("method1280",
                                                                                    (new Class[]
                                                                                            {(Integer
                                                                                                    .TYPE),
                                                                                                    (Integer
                                                                                                            .TYPE)}))
                                                                    .invoke
                                                                            (anObject3791,
                                                                                    (new Object[]
                                                                                            {(new Integer
                                                                                                    (i_5_)),
                                                                                                    (new Integer
                                                                                                            (i_6_))}));
                                                    } else if ((((Class297)
                                                            this)
                                                            .aBoolean3777)
                                                            && ((i
                                                            ^ 0xffffffff)
                                                            == -16)) {
                                                        boolean bool
                                                                = (((class144
                                                                .anInt2000)
                                                                ^ 0xffffffff)
                                                                != -1);
                                                        Component component
                                                                = ((Component)
                                                                (((Class144)
                                                                        class144)
                                                                        .anObject1996));
                                                        if (((Class297) this)
                                                                .aBoolean3794)
                                                            aCallback_Sub1_3776
                                                                    .method3622
                                                                            (bool, 13259,
                                                                                    component);
                                                        else
                                                            Class.forName
                                                                    ("Class165")
                                                                    .getDeclaredMethod
                                                                            ("method1281",
                                                                                    (new Class[]
                                                                                            {((aClass3804
                                                                                                    != null)
                                                                                                    ? aClass3804
                                                                                                    : (aClass3804
                                                                                                    = (method2249
                                                                                                    ("java.awt.Component")))),
                                                                                                    (Boolean
                                                                                                            .TYPE)}))
                                                                    .invoke
                                                                            (anObject3791,
                                                                                    (new Object[]
                                                                                            {component,
                                                                                                    (new Boolean
                                                                                                            (bool))}));
                                                    } else if (!(((Class297)
                                                            this)
                                                            .aBoolean3794)
                                                            && ((i
                                                            ^ 0xffffffff)
                                                            == -18)) {
                                                        Object[] objects
                                                                = ((Object[])
                                                                (((Class144)
                                                                        class144)
                                                                        .anObject1996));
                                                        Class.forName
                                                                ("Class165")
                                                                .getDeclaredMethod
                                                                        ("method1282",
                                                                                (new Class[]
                                                                                        {((aClass3804
                                                                                                != null)
                                                                                                ? aClass3804
                                                                                                : (aClass3804
                                                                                                = (method2249
                                                                                                ("java.awt.Component")))),
                                                                                                ((aClass3805
                                                                                                        != null)
                                                                                                        ? aClass3805
                                                                                                        : (aClass3805
                                                                                                        = (method2249
                                                                                                        ("[I")))),
                                                                                                Integer.TYPE,
                                                                                                Integer.TYPE,
                                                                                                ((aClass3806
                                                                                                        != null)
                                                                                                        ? aClass3806
                                                                                                        : (aClass3806
                                                                                                        = (method2249
                                                                                                        ("java.awt.Point"))))}))
                                                                .invoke
                                                                        (anObject3791,
                                                                                (new Object[]
                                                                                        {((Component)
                                                                                                objects[0]),
                                                                                                ((int[])
                                                                                                        objects[1]),
                                                                                                (new Integer
                                                                                                        (class144
                                                                                                                .anInt2000)),
                                                                                                (new Integer
                                                                                                        (((Class144)
                                                                                                                class144)
                                                                                                                .anInt1999)),
                                                                                                ((Point)
                                                                                                        (objects
                                                                                                                [2]))}));
                                                    } else if ((i ^ 0xffffffff)
                                                            == -17) {
                                                        try {
                                                            if (!aString3803
                                                                    .startsWith
                                                                            ("win"))
                                                                throw new Exception
                                                                        ();
                                                            String string
                                                                    = ((String)
                                                                    (((Class144)
                                                                            class144)
                                                                            .anObject1996));
                                                            if (!(string
                                                                    .startsWith
                                                                            ("http://"))
                                                                    && !(string
                                                                    .startsWith
                                                                            ("https://")))
                                                                throw new Exception
                                                                        ();
                                                            String string_7_
                                                                    = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                            for (int i_8_ = 0;
                                                                 (((string
                                                                         .length
                                                                                 ())
                                                                         ^ 0xffffffff)
                                                                         < (i_8_
                                                                         ^ 0xffffffff));
                                                                 i_8_++) {
                                                                if (((string_7_
                                                                        .indexOf
                                                                                (string
                                                                                        .charAt
                                                                                                (i_8_)))
                                                                        ^ 0xffffffff)
                                                                        == 0)
                                                                    throw new Exception
                                                                            ();
                                                            }
                                                            Runtime.getRuntime
                                                                    ().exec
                                                                    ("cmd /c start \"j\" \""
                                                                            + string
                                                                            + "\"");
                                                            class144
                                                                    .anObject1998
                                                                    = null;
                                                        } catch (Exception exception) {
                                                            class144
                                                                    .anObject1998
                                                                    = exception;
                                                            throw exception;
                                                        }
                                                    } else
                                                        throw new Exception
                                                                ("");
                                                } else {
                                                    Class234 class234
                                                            = (method2241
                                                            (((String)
                                                                            (((Class144)
                                                                                    class144)
                                                                                    .anObject1996)),
                                                                    12606, "",
                                                                    anInt3792));
                                                    class144.anObject1998
                                                            = class234;
                                                }
                                            } else {
                                                Frame frame
                                                        = (new Frame
                                                        ("Jagex Full Screen"));
                                                class144.anObject1998 = frame;
                                                frame.setResizable(false);
                                                if (((Class297) this)
                                                        .aBoolean3794)
                                                    aClass134_3802.method1146
                                                            ((class144.anInt2000
                                                                            & 0xffff),
                                                                    (((Class144)
                                                                            class144).anInt1999
                                                                            >> 1209541904),
                                                                    (class144.anInt2000
                                                                            >>> 1536588080),
                                                                    -43,
                                                                    0xffff & (((Class144)
                                                                            class144)
                                                                            .anInt1999),
                                                                    frame);
                                                else
                                                    Class.forName("Class7")
                                                            .getMethod
                                                                    ("method209",
                                                                            (new Class[]
                                                                                    {(aClass3807 != null
                                                                                            ? aClass3807
                                                                                            : (aClass3807
                                                                                            = (method2249
                                                                                            ("java.awt.Frame")))),
                                                                                            Integer.TYPE,
                                                                                            Integer.TYPE,
                                                                                            Integer.TYPE,
                                                                                            Integer.TYPE}))
                                                            .invoke
                                                                    (anObject3793,
                                                                            (new Object[]
                                                                                    {frame,
                                                                                            (new Integer
                                                                                                    ((class144
                                                                                                            .anInt2000)
                                                                                                            >>> 35629040)),
                                                                                            (new Integer
                                                                                                    (0xffff
                                                                                                            & (class144
                                                                                                            .anInt2000))),
                                                                                            (new Integer
                                                                                                    ((((Class144)
                                                                                                            class144)
                                                                                                            .anInt1999)
                                                                                                            >> 972476528)),
                                                                                            (new Integer
                                                                                                    ((((Class144)
                                                                                                            class144)
                                                                                                            .anInt1999)
                                                                                                            & 0xffff))}));
                                            }
                                        } else if (!((Class297) this)
                                                .aBoolean3794)
                                            class144.anObject1998
                                                    = (Class.forName("Class7")
                                                    .getMethod
                                                            ("method210",
                                                                    new Class[0])
                                                    .invoke
                                                            (anObject3793,
                                                                    new Object[0]));
                                        else
                                            class144.anObject1998
                                                    = aClass134_3802
                                                    .method1145(true);
                                    } else
                                        throw new Exception("");
                                } else {
                                    Clipboard clipboard
                                            = Toolkit.getDefaultToolkit()
                                            .getSystemClipboard();
                                    class144.anObject1998
                                            = clipboard.getContents(null);
                                }
                            } else {
                                Object[] objects
                                        = ((Object[])
                                        ((Class144) class144).anObject1996);
                                if (((Class297) this).aBoolean3777
                                        && (((Class) objects[0]).getClassLoader()
                                        == null))
                                    throw new SecurityException();
                                class144.anObject1998
                                        = (((Class) objects[0]).getDeclaredField
                                        ((String) objects[1]));
                            }
                        } else {
                            Object[] objects
                                    = ((Object[])
                                    ((Class144) class144).anObject1996);
                            if (((Class297) this).aBoolean3777
                                    && (((Class) objects[0]).getClassLoader()
                                    == null))
                                throw new SecurityException();
                            class144.anObject1998
                                    = (((Class) objects[0]).getDeclaredMethod
                                    ((String) objects[1],
                                            (Class[]) objects[2]));
                        }
                    } else {
                        if ((Class62.method599(-92) ^ 0xffffffffffffffffL)
                                > (aLong3781 ^ 0xffffffffffffffffL))
                            throw new IOException();
                        try {
                            class144.anObject1998
                                    = Class61.method593
                                    (class144.anInt2000, (byte) -90,
                                            ((String)
                                                    ((Class144) class144).anObject1996))
                                    .method2050(-112);
                        } catch (IOException_Sub1 ioexception_sub1) {
                            class144.anObject1998
                                    = ioexception_sub1.getMessage();
                            throw ioexception_sub1;
                        }
                    }
                } else {
                    if ((Class62.method599(-53) ^ 0xffffffffffffffffL)
                            > (aLong3781 ^ 0xffffffffffffffffL))
                        throw new IOException();
                    class144.anObject1998
                            = new Socket(InetAddress.getByName((String)
                            (((Class144)
                                    class144)
                                    .anObject1996)),
                            class144.anInt2000);
                }
                class144.anInt1997 = 1;
            } catch (Throwable throwable) {
                class144.anInt1997 = 2;
            }
            synchronized (class144) {
                class144.notify();
            }
        }
    }

    final void method2234(byte i) {
        synchronized (this) {
            aBoolean3801 = true;
            this.notifyAll();
        }
        try {
            aThread3790.join();
            if (i != 103)
                ((Class297) this).aClass234_3788 = null;
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
        if (((Class297) this).aClass234_3785 != null) {
            try {
                ((Class297) this).aClass234_3785.method1657(false);
            } catch (IOException ioexception) {
                /* empty */
            }
        }
        if (((Class297) this).aClass234_3779 != null) {
            try {
                ((Class297) this).aClass234_3779.method1657(false);
            } catch (IOException ioexception) {
                /* empty */
            }
        }
        if (((Class297) this).aClass234Array3795 != null) {
            for (int i_9_ = 0;
                 i_9_ < ((Class297) this).aClass234Array3795.length; i_9_++) {
                if (((Class297) this).aClass234Array3795[i_9_] != null) {
                    try {
                        ((Class297) this).aClass234Array3795[i_9_]
                                .method1657(false);
                    } catch (IOException ioexception) {
                        /* empty */
                    }
                }
            }
        }
        do {
            if (((Class297) this).aClass234_3788 != null) {
                try {
                    ((Class297) this).aClass234_3788.method1657(false);
                } catch (IOException ioexception) {
                    break;
                }
                break;
            }
        } while (false);
    }

    final Class144 method2235(boolean bool, int i, String string, int i_10_) {
        if (i_10_ != 28225)
            return null;
        return method2246(i_10_ ^ 0x6e49, 0, bool ? 22 : 1, i, string);
    }

    final Class144 method2236(Runnable runnable, int i, int i_11_) {
        if (i != -10240)
            method2242(null, (byte) 57, null);
        return method2246(8, 0, 2, i_11_, runnable);
    }

    final Class144 method2237(URL url, int i) {
        if (i != 8362)
            return null;
        return method2246(8, 0, 4, 0, url);
    }

    final Class144 method2238(int i, int[] is, int i_12_, Point point,
                              Component component, int i_13_) {
        if (i_12_ != 17)
            method2240(-75);
        return method2246(i_12_ + -9, i, 17, i_13_,
                new Object[]{component, is, point});
    }

    final void method2239(int i) {
        if (i > -90)
            ((Class297) this).aClass234_3779 = null;
        aLong3781 = 5000L + Class62.method599(-107);
    }

    final Class144 method2240(int i) {
        if (i != 972476528)
            return null;
        return method2246(8, 0, 5, 0, null);
    }

    private static final Class234 method2241(String string, int i,
                                             String string_14_, int i_15_) {
        String string_16_;
        if ((i_15_ ^ 0xffffffff) == -34)
            string_16_
                    = "jagex_" + string_14_ + "_preferences" + string + "_rc.dat";
        else if (i_15_ != 34)
            string_16_
                    = "jagex_" + string_14_ + "_preferences" + string + ".dat";
        else
            string_16_
                    = "jagex_" + string_14_ + "_preferences" + string + "_wip.dat";
        if (i != 12606)
            return null;
        String[] strings = {"c:/rscache/", "/rscache/", aString3800,
                "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
        for (int i_17_ = 0; strings.length > i_17_; i_17_++) {
            String string_18_ = strings[i_17_];
            if ((string_18_.length() ^ 0xffffffff) >= -1
                    || new File(string_18_).exists()) {
                try {
                    Class234 class234
                            = new Class234(new File(string_18_, string_16_), "rw",
                            10000L);
                    return class234;
                } catch (Exception exception) {
                    /* empty */
                }
            }
        }
        return null;
    }

    final boolean method2242(byte[] is, byte i, File file) {
        try {
            FileOutputStream fileoutputstream = new FileOutputStream(file);
            fileoutputstream.write(is, 0, is.length);
            if (i != -104)
                return false;
            fileoutputstream.close();
            return true;
        } catch (IOException ioexception) {
            throw new RuntimeException();
        }
    }

    final Class144 method2243(int i, String string, Class var_class) {
        if (i != 0)
            method2239(-13);
        return method2246(8, 0, 9, 0, new Object[]{var_class, string});
    }

    final Object method2244(int i) {
        if (i != 21)
            method2237(null, 23);
        return anObject3787;
    }

    final Class144 method2245(String string, int i) {
        if (i != 16)
            return null;
        return method2246(i + -8, 0, 16, 0, string);
    }

    private final Class144 method2246(int i, int i_19_, int i_20_, int i_21_,
                                      Object object) {
        Class144 class144 = new Class144();
        ((Class144) class144).anObject1996 = object;
        ((Class144) class144).anInt1999 = i_19_;
        ((Class144) class144).anInt1994 = i_20_;
        class144.anInt2000 = i_21_;
        synchronized (this) {
            if (aClass144_3798 == null)
                aClass144_3798 = aClass144_3797 = class144;
            else {
                ((Class144) aClass144_3798).aClass144_1995 = class144;
                aClass144_3798 = class144;
            }
            this.notify();
            if (i != 8)
                method2235(false, 76, null, 37);
        }
        return class144;
    }

    final boolean method2247(int i) {
        if (i != -4)
            method2245(null, 50);
        if (!((Class297) this).aBoolean3777)
            return false;
        if (((Class297) this).aBoolean3794) {
            if (aClass134_3802 == null)
                return false;
            return true;
        }
        if (anObject3793 == null)
            return false;
        return true;
    }

    final Class144 method2248(byte i, Frame frame) {
        if (i != 89)
            return null;
        return method2246(i ^ 0x51, 0, 7, 0, frame);
    }

    Class297(int i, String string, int i_22_, boolean bool) throws Exception {
        ((Class297) this).aBoolean3777 = false;
        aClass144_3798 = null;
        aBoolean3801 = false;
        ((Class297) this).aClass234_3788 = null;
        ((Class297) this).aBoolean3794 = false;
        aClass144_3797 = null;
        aString3789 = string;
        ((Class297) this).aBoolean3777 = bool;
        aString3796 = "1.1";
        aString3782 = "Unknown";
        anInt3792 = i;
        try {
            aString3782 = System.getProperty("java.vendor");
            aString3796 = System.getProperty("java.version");
        } catch (Exception exception) {
            /* empty */
        }
        if ((aString3782.toLowerCase().indexOf("microsoft") ^ 0xffffffff) != 0)
            ((Class297) this).aBoolean3794 = true;
        try {
            aString3784 = System.getProperty("os.name");
        } catch (Exception exception) {
            aString3784 = "Unknown";
        }
        aString3803 = aString3784.toLowerCase();
        try {
            aString3780 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
            aString3780 = "";
        }
        try {
            aString3778 = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
            aString3778 = "";
        }
        try {
            aString3800 = System.getProperty("user.home");
            if (aString3800 != null)
                aString3800 += "/";
        } catch (Exception exception) {
            /* empty */
        }
        if (aString3800 == null)
            aString3800 = "~/";
        try {
            ((Class297) this).anEventQueue3799
                    = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable throwable) {
            /* empty */
        }
        if (!((Class297) this).aBoolean3794) {
            try {
                aMethod3783
                        = (Class.forName("java.awt.Component").getDeclaredMethod
                        ("setFocusTraversalKeysEnabled",
                                new Class[]{Boolean.TYPE}));
            } catch (Exception exception) {
                /* empty */
            }
            try {
                aMethod3786
                        = (Class.forName("java.awt.Container").getDeclaredMethod
                        ("setFocusCycleRoot", new Class[]{Boolean.TYPE}));
            } catch (Exception exception) {
                /* empty */
            }
        }
        Class201.method1465((byte) -121, aString3789, anInt3792);
        if (((Class297) this).aBoolean3777) {
            ((Class297) this).aClass234_3788
                    = new Class234(Class201.method1464(0, anInt3792, "random.dat",
                    null),
                    "rw", 25L);
            ((Class297) this).aClass234_3785
                    = new Class234(Class201.method1466(-2, "main_file_cache.dat2"),
                    "rw", 209715200L);
            ((Class297) this).aClass234_3779
                    = new Class234(Class201.method1466(-2,
                    "main_file_cache.idx255"),
                    "rw", 1048576L);
            ((Class297) this).aClass234Array3795 = new Class234[i_22_];
            for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff);
                 i_23_++)
                ((Class297) this).aClass234Array3795[i_23_]
                        = new Class234(Class201.method1466(-2,
                        ("main_file_cache.idx"
                                + i_23_)),
                        "rw", 1048576L);
            if (((Class297) this).aBoolean3794) {
                try {
                    anObject3787 = Class.forName("Class1").newInstance();
                } catch (Throwable throwable) {
                    /* empty */
                }
            }
            try {
                if (!((Class297) this).aBoolean3794)
                    anObject3793 = Class.forName("Class7").newInstance();
                else
                    aClass134_3802 = new Class134();
            } catch (Throwable throwable) {
                /* empty */
            }
            try {
                if (!((Class297) this).aBoolean3794)
                    anObject3791 = Class.forName("Class165").newInstance();
                else
                    aCallback_Sub1_3776 = new Callback_Sub1();
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        if (((Class297) this).aBoolean3777
                && !((Class297) this).aBoolean3794) {
            ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
            for (ThreadGroup threadgroup_24_ = threadgroup.getParent();
                 threadgroup_24_ != null;
                 threadgroup_24_ = threadgroup.getParent())
                threadgroup = threadgroup_24_;
            Thread[] threads = new Thread[1000];
            threadgroup.enumerate(threads);
            for (int i_25_ = 0;
                 (i_25_ ^ 0xffffffff) > (threads.length ^ 0xffffffff);
                 i_25_++) {
                if (threads[i_25_] != null
                        && threads[i_25_].getName().startsWith("AWT"))
                    threads[i_25_].setPriority(1);
            }
        }
        aBoolean3801 = false;
        aThread3790 = new Thread(this);
        aThread3790.setPriority(10);
        aThread3790.setDaemon(true);
        aThread3790.start();
    }

    /*synthetic*/
    static Class method2249(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception
                    .getMessage());
        }
    }
}
