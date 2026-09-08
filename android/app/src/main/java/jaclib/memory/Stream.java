package jaclib.memory;


public final class Stream {

    public Buffer a;

    public int b;

    public int e;

    public int d;

    public final byte[] c;

    public static byte getLSB(int arg0) { return 0; }

    public static int floatToRawIntBits(float arg0) { return 0; }

    public int b() {
        return this.b + this.d;
    }

    public Stream(Buffer arg0) {
        this(arg0, 0, arg0.getSize());
    }

    public Stream(Buffer arg0, int arg1, int arg2) {
        this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
        this.a(arg0, arg1, arg2);
    }

    public Stream() {
        this(4096);
    }

    public Stream(int arg0) {
        this.c = new byte[arg0];
    }

    public void a(float arg0) {
        if (this.b + 3 >= this.c.length) {
            this.flush();
        }
        int local14 = floatToRawIntBits(arg0);
        this.c[this.b++] = (byte) (local14 >> 24);
        this.c[this.b++] = (byte) (local14 >> 16);
        this.c[this.b++] = (byte) (local14 >> 8);
        this.c[this.b++] = (byte) local14;
    }

    public int a() {
        return this.b + this.d;
    }

    public void f(int arg0) {
        this.flush();
        this.d = arg0;
    }

    public void b(int arg0) {
        if (this.c.length <= this.b + 1) {
            this.flush();
        }
        this.c[this.b++] = (byte) (arg0 >> 8);
        this.c[this.b++] = (byte) arg0;
    }

    public void c(int arg0) {
        if (this.c.length <= this.b + 1) {
            this.flush();
        }
        this.c[this.b++] = (byte) arg0;
        this.c[this.b++] = (byte) (arg0 >> 8);
    }

    public void a(Buffer arg0) {
        this.a(arg0, 0, arg0.getSize());
    }

    public void a(int arg0, int arg1, int arg2, int arg3) {
        if (this.b + 3 >= this.c.length) {
            this.flush();
        }
        this.c[this.b++] = (byte) arg2;
        this.c[this.b++] = (byte) arg1;
        this.c[this.b++] = (byte) arg0;
        this.c[this.b++] = (byte) arg3;
    }

    public void a(int arg0) {
        if (this.c.length <= this.b + 3) {
            this.flush();
        }
        this.c[this.b++] = (byte) arg0;
        this.c[this.b++] = (byte) (arg0 >> 8);
        this.c[this.b++] = (byte) (arg0 >> 16);
        this.c[this.b++] = (byte) (arg0 >> 24);
    }

    public void a(Buffer arg0, int arg1, int arg2) {
        this.flush();
        this.a = arg0;
        this.e = arg2 + arg1;
        this.d = arg1;
        if (this.e > arg0.getSize()) {
            throw new RuntimeException();
        }
    }

    public void e(int arg0) {
        if (this.b + 3 >= this.c.length) {
            this.flush();
        }
        this.c[this.b++] = (byte) (arg0 >> 16);
        this.c[this.b++] = (byte) (arg0 >> 8);
        this.c[this.b++] = (byte) arg0;
        this.c[this.b++] = (byte) (arg0 >> 24);
    }

    public void d(int arg0) {
        if (this.b >= this.c.length) {
            this.flush();
        }
        this.c[this.b++] = (byte) arg0;
    }

    public void b(int arg0, int arg1, int arg2, int arg3) {
        if (this.c.length <= this.b + 3) {
            this.flush();
        }
        this.c[this.b++] = (byte) arg0;
        this.c[this.b++] = (byte) arg1;
        this.c[this.b++] = (byte) arg2;
        this.c[this.b++] = (byte) arg3;
    }

    public void b(float arg0) {
        if (this.b + 3 >= this.c.length) {
            this.flush();
        }
        int local18 = floatToRawIntBits(arg0);
        this.c[this.b++] = (byte) local18;
        this.c[this.b++] = (byte) (local18 >> 8);
        this.c[this.b++] = (byte) (local18 >> 16);
        this.c[this.b++] = (byte) (local18 >> 24);
    }

    public void flush() {
        if (this.b <= 0) {
            return;
        }
        if (this.d + this.b > this.e) {
            throw new RuntimeException();
        }
        this.a.a(this.c, 0, this.d, this.b);
        this.d += this.b;
        this.b = 0;
    }
    public static boolean c() { return true; }
}
