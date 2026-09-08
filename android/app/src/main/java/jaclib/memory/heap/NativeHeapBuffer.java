package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {

    public boolean d = true;

    public final int b;

    public final NativeHeap a;

    public final int c;

    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.b = arg2;
        this.a = arg0;
        this.c = arg1;
    }

    @Override
    public int getSize() {
        return this.b;
    }

    @Override
    public synchronized void a(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0 | arg0 == null | !this.a() | arg1 < 0 | arg1 + arg3 > arg0.length | this.b < arg2 + arg3) {
            throw new RuntimeException();
        }
        this.a.put(this.c, arg0, arg1, arg2, arg3);
    }

    @Override
    public long getAddress() {
        return this.a.getBufferAddress(this.c);
    }

    public synchronized boolean a() {
        return this.a.a() && this.d;
    }

    public synchronized void b() {
        if (this.a()) {
            this.a.deallocateBuffer(this.c);
        }
        this.d = false;
    }

    @Override
    public synchronized void finalize() throws Throwable {
        super.finalize();
        this.b();
    }
}
