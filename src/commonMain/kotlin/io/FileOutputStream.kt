package io

expect open class FileOutputStream : OutputStream {
    constructor(name: String)
    constructor(name: String, append: Boolean)

    override fun write(b: Int)
    override fun close()
    override fun flush()
}
