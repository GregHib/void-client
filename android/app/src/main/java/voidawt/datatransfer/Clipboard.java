package voidawt.datatransfer;

public class Clipboard {
    private Transferable contents;

    public synchronized Transferable getContents(Object requestor) {
        return contents;
    }

    public synchronized void setContents(Transferable contents, ClipboardOwner owner) {
        this.contents = contents;
    }
}
