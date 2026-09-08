package jaggl;

import jaclib.memory.NativeBuffer;

public final class MapBuffer extends NativeBuffer {

    public int c;

    public boolean a(int arg0, int arg1, int arg2) {
        if (this.c != 0) {
            return false;
        }
        long local9 = OpenGL.glMapBufferARB(arg0, arg2);
        if (local9 == 0L) {
            return false;
        } else {
            this.a(local9, arg1);
            this.c = arg0;
            return true;
        }
    }

    public boolean a() {
        return this.c != 0;
    }

    @Override
    public void a(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.c == 0) {
            throw new RuntimeException();
        }
        super.a(arg0, arg1, arg2, arg3);
    }

    public boolean b() {
        boolean local1 = true;
        if (this.c != 0) {
            local1 = OpenGL.glUnmapBufferARB(this.c);
            this.a(0L, 0);
            this.c = 0;
        }
        return local1;
    }
}
