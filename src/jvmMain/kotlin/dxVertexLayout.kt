import jagdx.IDirect3DVertexDeclaration
import jagdx.VertexElementCollection

class dxVertexLayout internal constructor(class378: Class378, class58s: Array<Class58>) : Class130() {
    @JvmField
    var anIDirect3DVertexDeclaration5803: IDirect3DVertexDeclaration?

    init {
        val vertexelementcollection = VertexElementCollection(class378.aHb9788)
        var i = 0
        for (i_0_ in class58s.indices) {
            var i_1_ = 0
            val class58 = class58s[i_0_]!!
            var i_2_ = 0
            while ((i_2_ < class58.method538((-126).toByte()))) {
                val class325 = class58.method537(i_2_, 126)!!
                if (Class325.aClass325_4073 == class325) vertexelementcollection.addElement(i_0_, 2, 0, 0, 0, i_1_)
                else if (class325 == Class325.aClass325_4075) vertexelementcollection.addElement(i_0_, 2, 0, 3, 0, i_1_)
                else if (Class325.aClass325_4076 != class325) {
                    if (class325 == Class325.aClass325_4077) vertexelementcollection.addElement(i_0_, 0, 0, 5, i++, i_1_)
                    else if (Class325.aClass325_4078 == class325) vertexelementcollection.addElement(i_0_, 1, 0, 5, i++, i_1_)
                    else if (Class325.aClass325_4079 != class325) {
                        if (Class325.aClass325_4080 == class325) vertexelementcollection.addElement(i_0_, 3, 0, 5, i++, i_1_)
                    } else vertexelementcollection.addElement(i_0_, 2, 0, 5, i++, i_1_)
                } else vertexelementcollection.addElement(i_0_, 4, 0, 10, 0, i_1_)
                i_1_ += class325.anInt4069
                i_2_++
            }
        }
        vertexelementcollection.finish()
        this.anIDirect3DVertexDeclaration5803 = class378.anIDirect3DDevice9810!!.a(vertexelementcollection, null)
    }
}
