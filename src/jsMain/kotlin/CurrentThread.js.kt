/**
 * JS actual for [currentThread]: JS is single-threaded; return a stable singleton
 * as the thread identity token (used only for identity comparison in Class60/Class45).
 */
private object JsMainThread

actual fun currentThread(): Any = JsMainThread
