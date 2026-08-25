package awt.datatransfer

actual class StringSelection actual constructor(private val data: String) : Transferable {
    private val flavors = arrayOf(STRING_FLAVOR)

    actual override fun getTransferDataFlavors(): Array<DataFlavor> = flavors
    actual override fun isDataFlavorSupported(flavor: DataFlavor): Boolean = flavor == STRING_FLAVOR
    actual override fun getTransferData(flavor: DataFlavor): Any {
        require(isDataFlavorSupported(flavor)) { "Unsupported flavor: ${flavor.getMimeType()}" }
        return data
    }
}
