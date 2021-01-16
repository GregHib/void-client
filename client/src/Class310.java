/* Class310 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DBaseTexture;

abstract class Class310 {
    boolean aBoolean3892;
    Class378 aClass378_3893;
    Class209 aClass209_3894 = Class71.aClass209_1212;
    Class68 aClass68_3895;
    Class304 aClass304_3896;

    void method64(Class209 class209, int i) {
        ((Class310) this).aClass209_3894 = class209;
        if (i != -22095)
            method64(null, -80);
    }

    abstract IDirect3DBaseTexture method2314(int i);

    Class310(Class378 class378, Class304 class304, Class68 class68,
             boolean bool, int i) {
        ((Class310) this).aClass68_3895 = class68;
        ((Class310) this).aClass378_3893 = class378;
        ((Class310) this).aBoolean3892 = bool;
        ((Class310) this).aClass304_3896 = class304;
    }
}
