package voidawt.image;

public class DataBufferInt extends DataBuffer {
    private final int[] data;

    public DataBufferInt(int[] data, int size) {
        this.data = data;
        this.size = size;
    }

    public DataBufferInt(int size) {
        this.data = new int[size];
        this.size = size;
    }

    public int[] getData() {
        return data;
    }
}
