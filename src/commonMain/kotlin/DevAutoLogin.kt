/**
 * Unattended login for local testing. Fires once per page/JVM lifetime when
 * [Config.devUsername] and [Config.devPassword] are both set, replaying what the
 * login button's script opcode 5615 does (see ChatCommandProcessor).
 */
object DevAutoLogin {
    private var attempted = false

    fun tick() {
        if (attempted) return
        val user = Config.devUsername
        val pass = Config.devPassword
        if (user.isEmpty() || pass.isEmpty()) return
        // Same guard as opcode 5615: title screen shown, no login already in flight.
        if (WorldMapRenderer.anInt4674 != 3 || NpcDefinition.anInt2955 != 0 || GlWaterRenderPass.anInt7297 != 0) return
        attempted = true
        if (Client.aAbstractGameSocket_9165 != null) {
            Client.aAbstractGameSocket_9165!!.method1700(36.toByte())
            Client.aAbstractGameSocket_9165 = null
        }
        OpenGlModel.aString5600 = user
        TextureGenerator.aString2496 = pass
        ByteBufferStatics.method3379(2, 5)
    }
}
