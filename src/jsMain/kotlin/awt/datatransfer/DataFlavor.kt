package awt.datatransfer

actual class DataFlavor actual constructor(private val mimeType: String) {
    actual fun getMimeType(): String = mimeType

    override fun equals(other: Any?): Boolean = other is DataFlavor && other.mimeType == mimeType
    override fun hashCode(): Int = mimeType.hashCode()
}

actual val STRING_FLAVOR: DataFlavor =
    DataFlavor("text/plain; charset=unicode; class=java.lang.String")
