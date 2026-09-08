package voidsun.management;

public interface HotSpotDiagnosticMXBean {
    void dumpHeap(String outputFile, boolean live) throws java.io.IOException;
}
