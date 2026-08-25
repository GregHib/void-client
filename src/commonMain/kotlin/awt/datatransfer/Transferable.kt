package awt.datatransfer

expect interface Transferable {
    fun getTransferDataFlavors(): Array<DataFlavor>
    fun isDataFlavorSupported(flavor: DataFlavor): Boolean
    fun getTransferData(flavor: DataFlavor): Any
}
