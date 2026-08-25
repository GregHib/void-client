package io

expect abstract class Reader protected constructor() : AutoCloseable {
    open fun read(): Int
    abstract fun read(cbuf: CharArray, off: Int, len: Int): Int
    open fun read(cbuf: CharArray): Int
    open fun skip(n: Long): Long
    open fun ready(): Boolean
}