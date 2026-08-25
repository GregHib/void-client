package lang.reflect

import lang.Class

expect class Field {
//    val name: String
    fun get(instance: Any?): Any?
    fun getBoolean(instance: Any?): Boolean
    fun getLong(instance: Any?): Long
    fun getInt(instance: Any?): Int
    fun setInt(instance: Any?, value: Int)
    fun setAccessible(flag: Boolean)
    fun getType(): Class<*>
    fun getModifiers(): Int
    fun set(instance: Any?, value: Any?)
}

expect var Field.isAccessible: Boolean