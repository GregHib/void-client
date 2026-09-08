package jaclib.memory.heap;


public final class NativeHeap {

    public long peer;

    public final int a;

    public boolean b;

    public NativeHeap(int arg0) {
        this.a = arg0;
        this.allocateHeap(this.a);
        this.b = true;
    }

    public void allocateHeap(int arg0) {}

    @Override
    public synchronized void finalize() throws Throwable {
        super.finalize();
        this.b();
    }

    public synchronized void deallocateBuffer(int arg0) {}

    public synchronized int allocateBuffer(int arg0, boolean arg1) { return 0; }

    public void deallocateHeap() {}

    public NativeHeapBuffer a(int arg0, boolean arg1) {
        if (!this.b) {
            throw new IllegalStateException();
        }
        return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
    }

    public synchronized void put(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {}

    public synchronized void get(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {}

    public synchronized boolean a() {
        return this.b;
    }

    public synchronized long getBufferAddress(int arg0) { return 0L; }

    public synchronized void b() {
        if (this.b) {
            this.deallocateHeap();
        }
        this.b = false;
    }
}
