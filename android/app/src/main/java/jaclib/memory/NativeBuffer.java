package jaclib.memory;


public class NativeBuffer implements Buffer, Source {

    public long b;

    public int a = -1;

    @Override
    public void a(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0 | arg0 == null | this.b == 0L | arg1 < 0 | arg0.length < arg1 + arg3 | arg2 + arg3 > this.a) {
            throw new RuntimeException();
        }
        this.put(this.b, arg0, arg1, arg2, arg3);
    }

    protected final void a(long arg0, int arg1) {
        this.b = arg0;
        this.a = arg1;
    }

    @Override
    public final long getAddress() {
        return this.b;
    }

    public void put(long arg0, byte[] arg1, int arg2, int arg3, int arg4) {}

    public void get(long arg0, byte[] arg1, int arg2, int arg3, int arg4) {}

    @Override
    public final int getSize() {
        return this.a;
    }
}
