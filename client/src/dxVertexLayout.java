/* dxVertexLayout - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;

public class dxVertexLayout extends Class130 {
    IDirect3DVertexDeclaration anIDirect3DVertexDeclaration5803;

    dxVertexLayout(Class378 class378, Class58[] class58s) {
        VertexElementCollection vertexelementcollection
                = new VertexElementCollection(class378.aHb9788);
        int i = 0;
        for (int i_0_ = 0;
             i_0_ < class58s.length; i_0_++) {
            int i_1_ = 0;
            Class58 class58 = class58s[i_0_];
            for (int i_2_ = 0; (i_2_ < class58.method538((byte) -126)); i_2_++) {
                Class325 class325 = class58.method537(i_2_, 126);
                if (Class325.aClass325_4073 == class325)
                    vertexelementcollection.addElement(i_0_, 2, 0, 0, 0, i_1_);
                else if (class325 == Class325.aClass325_4075)
                    vertexelementcollection.addElement(i_0_, 2, 0, 3, 0, i_1_);
                else if (Class325.aClass325_4076 != class325) {
                    if (class325 == Class325.aClass325_4077)
                        vertexelementcollection.addElement(i_0_, 0, 0, 5, i++,
                                i_1_);
                    else if (Class325.aClass325_4078 == class325)
                        vertexelementcollection.addElement(i_0_, 1, 0, 5, i++,
                                i_1_);
                    else if (Class325.aClass325_4079 != class325) {
                        if (Class325.aClass325_4080 == class325)
                            vertexelementcollection.addElement(i_0_, 3, 0, 5,
                                    i++, i_1_);
                    } else
                        vertexelementcollection.addElement(i_0_, 2, 0, 5, i++,
                                i_1_);
                } else
                    vertexelementcollection.addElement(i_0_, 4, 0, 10, 0,
                            i_1_);
                i_1_ += class325.anInt4069;
            }
        }
        vertexelementcollection.finish();
        this.anIDirect3DVertexDeclaration5803
                = class378.anIDirect3DDevice9810
                .a(vertexelementcollection, null);
    }
}
