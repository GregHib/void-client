package voidawt.datatransfer;

import java.io.IOException;

public interface Transferable {
    DataFlavor[] getTransferDataFlavors();

    boolean isDataFlavorSupported(DataFlavor flavor);

    Object getTransferData(DataFlavor flavor) throws IOException;
}
