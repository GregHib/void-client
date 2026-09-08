/* NativeLibraryLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class228` (JODE-obfuscated).
 * Native-library / JNI loader utility. Reflectively reaches ClassLoader.nativeLibraries (unloadNativeLibraries), walks the Vector and forces finalize() via setAccessible; used to unload/reload native libs.
 */

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

final class NativeLibraryLoader {
    static int anInt2971;
    static Component183 aClass114_2972 = new Component183(49, 4);
    static int anInt2973;
    /** Cached result of {@link FriendLoginMessage#getFilteredDisplayModes}. */
    static DisplayModeInfo[] cachedDisplayModes;
    static int anInt2975;

    public static void clearStatics(byte i) {
        cachedDisplayModes = null;
        if (i <= 47) cachedDisplayModes = null;
        aClass114_2972 = null;
    }

    /**
     * Reflectively walks {@code ClassLoader.nativeLibraries}, finalizes matching
     * entries, and clears handles so natives can be reloaded. Returns true if the
     * tracked lib table is empty afterwards.
     */
    static final boolean unloadNativeLibraries(boolean bool) {
        anInt2973++;
        Hashtable hashtable = new Hashtable();
        Enumeration enumeration = Player.aHashtable10565.keys();
        while (enumeration.hasMoreElements()) {
            Object object = enumeration.nextElement();
            hashtable.put(object, Player.aHashtable10565.get(object));
        }
        try {
            Field field = ClassLoader.class.getDeclaredField("nativeLibraries");
            if (bool != true) return false;
            field.setAccessible(true);
            try {
                enumeration = Player.aHashtable10565.keys();
                while (enumeration.hasMoreElements()) {
                    String string = (String) enumeration.nextElement();
                    try {
                        File file = (File) Component300.aHashtable3548.get(string);
                        Class var_class_1_ = (Class) Player.aHashtable10565.get(string);
                        Vector vector = ((Vector) field.get(var_class_1_.getClassLoader()));
                        for (int i = 0; i < vector.size(); i++) {
                            try {
                                Object object = vector.elementAt(i);
                                Field field_2_ = object.getClass().getDeclaredField("name");
                                field_2_.setAccessible(true);
                                try {
                                    String string_3_ = (String) field_2_.get(object);
                                    if (string_3_ != null && (string_3_.equalsIgnoreCase(file.getCanonicalPath()))) {
                                        Field field_4_ = object.getClass().getDeclaredField("handle");
                                        Method method_5_ = (object.getClass().getDeclaredMethod("finalize"));
                                        field_4_.setAccessible(true);
                                        method_5_.setAccessible(true);
                                        try {
                                            method_5_.invoke(object);
                                            field_4_.set(object, new Integer(0));
                                            hashtable.remove(string);
                                        } catch (Throwable throwable) {
                                            if (Loader.trace) {
                                                throwable.printStackTrace();
                                            }
                                            /* empty */
                                        }
                                        method_5_.setAccessible(false);
                                        field_4_.setAccessible(false);
                                    }
                                } catch (Throwable throwable) {
                                    if (Loader.trace) {
                                        throwable.printStackTrace();
                                    }
                                    /* empty */
                                }
                                field_2_.setAccessible(false);
                            } catch (Throwable throwable) {
                                if (Loader.trace) {
                                    throwable.printStackTrace();
                                }
                                /* empty */
                            }
                        }
                    } catch (Throwable throwable) {
                        if (Loader.trace) {
                            throwable.printStackTrace();
                        }
                        /* empty */
                    }
                }
            } catch (Throwable throwable) {
                if (Loader.trace) {
                    throwable.printStackTrace();
                }
                /* empty */
            }
            field.setAccessible(false);
        } catch (Throwable throwable) {
            if (Loader.trace) {
                throwable.printStackTrace();
            }
            /* empty */
        }
        Player.aHashtable10565 = hashtable;
        return Player.aHashtable10565.isEmpty();
    }

    static final void method1630(int i, int i_6_, int i_7_) {
        if (DisplayModeManagerContainer229.aFloat1249 > DisplayModeManagerContainer229.aFloat1247) {
            DisplayModeManagerContainer229.aFloat1247 += (double) DisplayModeManagerContainer229.aFloat1247 / 30.0;
            if (DisplayModeManagerContainer229.aFloat1249 < DisplayModeManagerContainer229.aFloat1247) DisplayModeManagerContainer229.aFloat1247 = DisplayModeManagerContainer229.aFloat1249;
            ColorTagNode.method2811(false);
            DisplayModeManagerContainer229.anInt1255 = (int) DisplayModeManagerContainer229.aFloat1247 >> 1;
            DisplayModeManagerContainer229.aByteArrayArrayArray1251 = ColoredTextBuilder.method2596(DisplayModeManagerContainer229.anInt1255, 12871);
        } else if (DisplayModeManagerContainer229.aFloat1247 > DisplayModeManagerContainer229.aFloat1249) {
            DisplayModeManagerContainer229.aFloat1247 -= (double) DisplayModeManagerContainer229.aFloat1247 / 30.0;
            if (DisplayModeManagerContainer229.aFloat1249 > DisplayModeManagerContainer229.aFloat1247) DisplayModeManagerContainer229.aFloat1247 = DisplayModeManagerContainer229.aFloat1249;
            ColorTagNode.method2811(false);
            DisplayModeManagerContainer229.anInt1255 = (int) DisplayModeManagerContainer229.aFloat1247 >> 1;
            DisplayModeManagerContainer229.aByteArrayArrayArray1251 = ColoredTextBuilder.method2596(DisplayModeManagerContainer229.anInt1255, i + 12871);
        }
        anInt2971++;
        if (i != (~ModelStore.anInt4609) && Component377.anInt859 != -1) {
            int i_8_ = ModelStore.anInt4609 - NodeSub36.anInt6992;
            if (i_8_ < 2 || i_8_ > 2) i_8_ /= 8;
            int i_9_ = -DebugOverlay.anInt3170 + Component377.anInt859;
            NodeSub36.anInt6992 = i_8_ + NodeSub36.anInt6992;
            if (i_9_ < 2 || i_9_ > 2) i_9_ /= 8;
            DebugOverlay.anInt3170 -= -i_9_;
            if (i_8_ == 0 && i_9_ == 0) {
                ModelStore.anInt4609 = -1;
                Component377.anInt859 = -1;
            }
            ColorTagNode.method2811(false);
        }
        if (WaterShader.anInt7379 > 0) {
            LoadingManager.anInt2173--;
            if (LoadingManager.anInt2173 == 0) {
                WaterShader.anInt7379--;
                LoadingManager.anInt2173 = 100;
            }
        } else {
            Component225.anInt481 = -1;
            DefinitionSub30.anInt9399 = -1;
        }
        if (Component163.aBoolean3174 && Component156.aClass262_3705 != null) {
            for (NodeSub12 class348_sub12 = (NodeSub12) Component156.aClass262_3705.first(4); class348_sub12 != null; class348_sub12 = ((NodeSub12) Component156.aClass262_3705.next((byte) 116))) {
                Component274 class42 = (DisplayModeManagerContainer229.aClass153_1238.method1225(class348_sub12.aClass348_Sub21_6751.anInt6847, (byte) 125));
                if (class348_sub12.method2799(i_6_, i_7_, 95)) {
                    if (class42.aStringArray577 != null) {
                        if (class42.aStringArray577[4] != null) DisplayModeManagerContainer368.addMenuEntry(false, class42.aString565, 0, (byte) -100, false, class42.anInt596, -1, true, 1006, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.aStringArray577[4], class348_sub12.aClass348_Sub21_6751.anInt6847, -1);
                        if (class42.aStringArray577[3] != null) DisplayModeManagerContainer368.addMenuEntry(false, class42.aString565, 0, (byte) -127, false, class42.anInt596, -1, true, 1003, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.aStringArray577[3], class348_sub12.aClass348_Sub21_6751.anInt6847, -1);
                        if (class42.aStringArray577[2] != null) DisplayModeManagerContainer368.addMenuEntry(false, class42.aString565, 0, (byte) -108, false, class42.anInt596, -1, true, 1002, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.aStringArray577[2], class348_sub12.aClass348_Sub21_6751.anInt6847, -1);
                        if (class42.aStringArray577[1] != null) DisplayModeManagerContainer368.addMenuEntry(false, class42.aString565, 0, (byte) -69, false, class42.anInt596, -1, true, 1012, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.aStringArray577[1], class348_sub12.aClass348_Sub21_6751.anInt6847, -1);
                        if (class42.aStringArray577[0] != null) DisplayModeManagerContainer368.addMenuEntry(false, class42.aString565, 0, (byte) -92, false, class42.anInt596, -1, true, 1009, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.aStringArray577[0], class348_sub12.aClass348_Sub21_6751.anInt6847, -1);
                    }
                    WorldMapTeleport.inject(class348_sub12, class42);
                    if (!class348_sub12.aClass348_Sub21_6751.aBoolean6848) {
                        class348_sub12.aClass348_Sub21_6751.aBoolean6848 = true;
                        ClientScriptExecutor.runScript(Component330.aClass273_1512, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.anInt596);
                    }
                    if (class348_sub12.aClass348_Sub21_6751.aBoolean6848) ClientScriptExecutor.runScript(DisplayModeManagerContainer34.aClass273_8664, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.anInt596);
                } else if (class348_sub12.aClass348_Sub21_6751.aBoolean6848) {
                    class348_sub12.aClass348_Sub21_6751.aBoolean6848 = false;
                    ClientScriptExecutor.runScript(DisplayModeManagerContainer123.aClass273_1298, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.anInt596);
                }
            }
        }
    }
}
