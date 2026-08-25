package lang.reflect

import lang.Class

actual class Field {
    actual fun get(instance: Any?): Any? {
        TODO("Not yet implemented")
    }

    actual fun getBoolean(instance: Any?): Boolean {
        TODO("Not yet implemented")
    }

    actual fun getLong(instance: Any?): Long {
        TODO("Not yet implemented")
    }

    actual fun getInt(instance: Any?): Int {
        TODO("Not yet implemented")
    }

    actual fun setInt(instance: Any?, value: Int) {
        TODO("Not yet implemented")
    }

    actual fun setAccessible(flag: Boolean) {
    }

    actual fun getType(): Class<*> {
        TODO("Not yet implemented")
    }

    actual fun getModifiers(): Int {
        TODO("Not yet implemented")
    }

    actual fun set(instance: Any?, value: Any?) {
        TODO("Not yet implemented")
    }
}

actual var Field.isAccessible: Boolean
    get() = true
    set(_) { }
