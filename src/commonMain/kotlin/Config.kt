object Config {
    var loadRunescape: Boolean = false
    var showCoordinates: Boolean = true
    var skipLobby: Boolean = true
    var splitPorts: Boolean = false
    var debug: Boolean = true
    var trace: Boolean = true
    var address: String? = "127.0.0.1"
    var port: Int = 43594
    val LOGIN_SERVER_RSA_MODULUS: BigInt = BigInt("ea3680fdebf2621da7a33601ba39925ee203b3fc80775cd3727bf27fd8c0791c803e0bdb42b8b5257567177f8569024569da9147cef59009ed016af6007e57a556f1754f09ca84dd39a03287f7e41e8626fd78ab3b53262bd63f2e37403a549980bf3077bd402b82ef5fac269eb3c04d2a9b7712a67a018321ceba6c3bfb8f7f", 16)
    val FILE_SERVER_RSA_MODULUS: BigInt = BigInt("d6808be939bbfd2ec4e96b1581ce3e1144b526e7643a72e3c64fbb902724fbfcf14ab601da6d6f8dbb57d1c369d080d9fc392abeb7886e0076d07f2aea5810e540d2817fd1967e35b39cc95cf7c9170b5fb55f5bf95524b60e938f0d64614bc365b87d66963a8cc8664e32875366099ef297180d01c7c3842162865e11d92299", 16)

    // Camera zoom constants
    const val ZOOM_OFFSET_DEFAULT: Int = 0 // Linear zoom offset added to the computed FOV (0 = no offset).
    const val ZOOM_OFFSET_STEP: Int = 15 // Scroll step size for the linear zoom offset.

    const val FOV_MIN_FACTOR_NUM: Int = 1 // FOV minimum as a fraction of the base min (numerator).
    const val FOV_MIN_FACTOR_DEN: Int = 4 // FOV minimum as a fraction of the base min (denominator).
    const val FOV_MAX_FACTOR_NUM: Int = 4 // FOV maximum as a fraction of the base max (numerator).
    const val FOV_MAX_FACTOR_DEN: Int = 1 // FOV maximum as a fraction of the base max (denominator).
    const val FOV_MIN_ABS: Int = 100 // Absolute minimum FOV clamp regardless of base settings.

    const val RENDER_DISTANCE_MULTIPLIER: Double = 2.0 // Adjust how many tiles off in the distance are rendered
    const val CULLING_DISTANCE_MULTIPLIER: Double = 2.0 // Adjust distance before objects go into fog

    fun getDebug(id: Int): String {
        return if (Config.debug) " <col=00ff00>(</col>" + id + "<col=00ff00>)</col>" else ""
    }

    fun getDebug(id: Int, component: Int): String {
        return if (Config.debug) " <col=00ff00>(</col>" + id + " - " + component + "<col=00ff00>)</col>" else ""
    }

    fun getDebug(id: Int, x: Int, y: Int, plane: Int): String {
        return if (Config.debug) " <col=00ff00>(</col>" + id + " - " + x + ", " + y + ", " + plane + "<col=00ff00>)</col>" else ""
    }
}