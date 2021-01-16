/* Class366 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Source;

import jagdx.IDirect3DVertexBuffer;
import jagdx.ue;

final class Class366 implements Interface5_Impl1 {
    private int anInt8508;
    private boolean aBoolean8509;
    private boolean aBoolean8510 = false;
    IDirect3DVertexBuffer anIDirect3DVertexBuffer8511;
    private Class378 aClass378_8512;
    private byte aByte8513;
    private int anInt8514;

    public final int method16(boolean bool) {
        if (bool)
            method3519(-55);
        return anInt8508;
    }

    public final void method21(int i) {
        if (((Class366) this).anIDirect3DVertexBuffer8511 != null) {
            ((Class366) this).anIDirect3DVertexBuffer8511.a(9275);
            ((Class366) this).anIDirect3DVertexBuffer8511 = null;
        }
        if (i != 23315)
            method17(null, -80, -30, (byte) 72);
        anInt8514 = 0;
        anInt8508 = 0;
    }

    public final boolean method20(int i, byte i_0_, int i_1_) {
        aByte8513 = (byte) i_1_;
        if (i_0_ < 122)
            method20(-127, (byte) 52, -18);
        anInt8508 = i;
        if (anInt8508 > anInt8514) {
            int i_2_ = 8;
            int i_3_;
            if (aBoolean8509) {
                i_2_ |= 0x200;
                i_3_ = 0;
            } else
                i_3_ = 1;
            if (((Class366) this).anIDirect3DVertexBuffer8511 != null)
                ((Class366) this).anIDirect3DVertexBuffer8511.a(9275);
            ((Class366) this).anIDirect3DVertexBuffer8511
                    = (((Class378) aClass378_8512).anIDirect3DDevice9810.a
                    (anInt8508, i_2_, 0, i_3_,
                            ((Class366) this).anIDirect3DVertexBuffer8511));
            anInt8514 = anInt8508;
        }
        return null != ((Class366) this).anIDirect3DVertexBuffer8511;
    }

    public final Buffer method19(boolean bool, int i) {
        if (((Class366) this).anIDirect3DVertexBuffer8511 == null)
            return null;
        bool &= aBoolean8509;
        if (i != 26775)
            method21(93);
        if (!aBoolean8510
                && ue.a((((Class366) this).anIDirect3DVertexBuffer8511.Lock
                        (0, anInt8514, !bool ? 0 : 8192,
                                ((Class378) aClass378_8512).aGeometryBuffer9811)),
                false)) {
            aBoolean8510 = true;
            return ((Class378) aClass378_8512).aGeometryBuffer9811;
        }
        return null;
    }

    public final boolean method17(Source source, int i, int i_4_, byte i_5_) {
        if (method20(i_4_, (byte) 125, i))
            return ((Class366) this).anIDirect3DVertexBuffer8511
                    .a(source, 0, 0, anInt8508, !aBoolean8509 ? 0 : 8192);
        if (i_5_ >= -15)
            anInt8508 = 71;
        return false;
    }

    public final boolean method18(int i) {
        if (aBoolean8510
                && ue.a(((Class366) this).anIDirect3DVertexBuffer8511.Unlock(),
                false)) {
            aBoolean8510 = false;
            return true;
        }
        if (i != 6331)
            return false;
        return false;
    }

    final int method3519(int i) {
        if (i != 3545)
            method21(-87);
        return aByte8513;
    }

    Class366(Class378 class378, boolean bool) {
        aClass378_8512 = class378;
        aBoolean8509 = bool;
    }
}
