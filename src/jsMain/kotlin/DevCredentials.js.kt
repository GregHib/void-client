// The identifiers below are replaced by webpack's DefinePlugin (webpack.config.d/dev-credentials.js)
// with string literals taken from the build environment; without the plugin they are undefined.
actual fun devCredential(name: String): String? {
    val value: dynamic = when (name) {
        "VOID_DEV_USERNAME" -> js("typeof __VOID_DEV_USERNAME__ !== 'undefined' ? __VOID_DEV_USERNAME__ : ''")
        "VOID_DEV_PASSWORD" -> js("typeof __VOID_DEV_PASSWORD__ !== 'undefined' ? __VOID_DEV_PASSWORD__ : ''")
        else -> ""
    }
    val s = value.unsafeCast<String?>() ?: return null
    return s.takeIf { it.isNotBlank() }
}
