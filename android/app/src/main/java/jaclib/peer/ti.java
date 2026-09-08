package jaclib.peer;


import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class ti {

    public PeerReference a;

    public PeerReference c;

    public final ReferenceQueue b = new ReferenceQueue();

    public void a(int arg0) {
        while (true) {
            Reference local3 = this.b.poll();
            if (local3 == null) {
                return;
            }
            PeerReference local9 = (PeerReference) local3;
            this.a(local9, arg0 ^ 0x35DD);
        }
    }

    public void a(PeerReference arg0, byte arg1) {
        arg0.b = this.a;
        arg0.a = null;
        if (this.c == null) {
            this.c = arg0;
        } else {
            this.a.a = arg0;
        }
        this.a = arg0;
    }

    public void a(PeerReference arg0, int arg1) {
        arg0.b(0);
        if (this.c == arg0) {
            this.c = arg0.a;
        }
        if (this.a == arg0) {
            this.a = arg0.b;
        }
        if (arg0.a != null) {
            arg0.a.b = arg0.b;
        }
        if (arg0.b != null) {
            arg0.b.a = arg0.a;
        }
    }

    public void b(int arg0) {
        this.a(26588);
        while (this.a != null) {
            this.a(this.a, 20993);
        }
        this.a(26588);
    }

    public void c(int arg0) {
        this.a(26588);
    }
}
