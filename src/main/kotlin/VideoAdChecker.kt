import JavaScriptBridge.method1617

/* Class247 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object VideoAdChecker {
    var anInt3180: Int = 0
    @JvmField
    var aCameraRotationStub_3181: CameraRotationStub? = CameraRotationStub()
    var aDouble3182: Double = 0.0
    @JvmField
    var aJs5Archive_3183: Js5Archive? = null
    var anInt3184: Int = 0

    @JvmStatic
    fun method1889(i: Int) {
        if (i != 255) method1889(-18)
        aCameraRotationStub_3181 = null
        aJs5Archive_3183 = null
    }

    fun method1890(i: Int, i_0_: Byte, i_1_: Int, i_2_: Int): Int {
        var i_1_ = i_1_
        anInt3180++
        val i_3_ = 88 % (-i_0_ / 55)
        if (i > 243) i_1_ = i_1_ shr 4
        else if (i <= 217) {
            if (i > 192) i_1_ = i_1_ shr 2
            else if (i > 179) i_1_ = i_1_ shr 1
        } else i_1_ = i_1_ shr 3
        return ((i shr 1) + (i_1_ shr 5 shl 7) + ((0xff and i_2_) shr 2 shl 10))
    }

    fun method1891(i: Int): Boolean {
        if (i != 314376967) VideoAdChecker.method1890(-22, (-36).toByte(), 19, 113)
        anInt3184++
        if (RegionSceneLoader.aBoolean3697) {
            try {
                return !(method1617(125.toByte(), Class93.anApplet1530, "showingVideoAd") as Boolean)
            } catch (throwable: Throwable) {
                /* empty */
            }
        }
        return true
    }
}
