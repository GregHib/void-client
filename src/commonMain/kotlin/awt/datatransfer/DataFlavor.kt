package awt.datatransfer

expect class DataFlavor(mimeType: String) {
    fun getMimeType(): String
}

expect val STRING_FLAVOR: DataFlavor
