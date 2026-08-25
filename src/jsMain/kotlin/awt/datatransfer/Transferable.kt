package awt.datatransfer

actual interface Transferable {
    actual fun getTransferDataFlavors(): Array<DataFlavor>
    actual fun isDataFlavorSupported(flavor: DataFlavor): Boolean
    actual fun getTransferData(flavor: DataFlavor): Any
}
