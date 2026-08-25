package io

actual open class InvalidClassException : ObjectStreamException {
    internal val cname: String?

    actual constructor(reason: String?) : super(reason) {
        cname = null
    }
    actual constructor(cname: String?, reason: String?) :
            super(if (cname == null) reason else "$cname; $reason") {
        this.cname = cname
    }

    override val message: String?
        get() = if (classname == null) super.message else "$classname; ${super.message}"
}

actual val InvalidClassException.classname: String? get() = cname