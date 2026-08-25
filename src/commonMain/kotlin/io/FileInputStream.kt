package io

expect open class FileInputStream(file: File?) : InputStream {
    constructor(name: String)
    override fun read(): Int
    override fun close()
}