/*
 * Class82
 */
class ConfigArchiveLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aJs5Archive_1436: Js5Archive?

    var anInt1439: Int = 0

    init {
        LruByteCache(64)
        try {
            aJs5Archive_1436 = js5Archive
            this.anInt1439 = aJs5Archive_1436!!.method407(0, 15)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("lba.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }
}