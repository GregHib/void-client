package awt.datatransfer

expect class StringSelection(data: String) : Transferable {
    override fun getTransferDataFlavors(): Array<DataFlavor>
    override fun isDataFlavorSupported(flavor: DataFlavor): Boolean
    override fun getTransferData(flavor: DataFlavor): Any
}
