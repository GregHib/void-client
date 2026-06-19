import RefCountedHandleStatics.anInt2274

/* Class171 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class RefCountedHandle internal constructor(private val aHa_Sub2_2268: OpenGlRenderer, i: Int, var anInt2270: Int) {
    @Throws(Throwable::class)
    protected fun finalize() {
        aHa_Sub2_2268.method3765(65.toByte(), this.anInt2270)
        anInt2274++
//        super.finalize()
    }
}
