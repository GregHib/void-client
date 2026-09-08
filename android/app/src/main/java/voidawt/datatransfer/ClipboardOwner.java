package voidawt.datatransfer;

public interface ClipboardOwner {
    void lostOwnership(Clipboard clipboard, Transferable contents);
}
