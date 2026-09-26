/** The back buffer keeps the last frame on the JVM, so the loading box already draws over it. */
actual fun captureLoadingBackdrop(drawFrame: () -> Unit) {
}

actual fun drawLoadingBackdrop() {
}

actual fun releaseLoadingBackdrop() {
}
