package voidawt.datatransfer;

import java.io.IOException;

public class StringSelection implements Transferable {
    private final String data;

    public StringSelection(String data) {
        this.data = data;
    }

    public DataFlavor[] getTransferDataFlavors() {
        return new DataFlavor[]{DataFlavor.stringFlavor};
    }

    public boolean isDataFlavorSupported(DataFlavor flavor) {
        return flavor == DataFlavor.stringFlavor;
    }

    public Object getTransferData(DataFlavor flavor) throws IOException {
        return data;
    }
}
