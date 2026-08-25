package net

import io.InputStream

expect class URL(spec: String) {
    constructor(protocol: String, host: String, file: String)
    constructor(context: URL?, spec: String?)
    fun openStream(): InputStream
    override fun toString(): String
}

