package lang.reflect

import lang.Class

actual class Field {
    actual fun get(instance: Any?): Any? {
        TODO("Not yet implemented")
    }

    actual fun setAccessible(flag: Boolean) {
    }

    actual fun getType(): Class<*> {
        TODO("Not yet implemented")
    }
}