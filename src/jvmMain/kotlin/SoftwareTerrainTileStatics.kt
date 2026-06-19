import kotlin.math.sqrt

object SoftwareTerrainTileStatics {
    fun method3991(i: Int, i_244_: Int): Int {
        var i_245_ = (i and 0xff0000) * i_244_ shr 23
        if (i_245_ < 2) i_245_ = 2
        else if (i_245_ > 253) i_245_ = 253
        var i_246_ = (i and 0xff00) * i_244_ shr 15
        if (i_246_ < 2) i_246_ = 2
        else if (i_246_ > 253) i_246_ = 253
        var i_247_ = (i and 0xff) * i_244_ shr 7
        if (i_247_ < 2) i_247_ = 2
        else if (i_247_ > 253) i_247_ = 253
        return i_245_ shl 16 or (i_246_ shl 8) or i_247_
    }
}
