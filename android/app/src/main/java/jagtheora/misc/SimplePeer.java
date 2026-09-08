package jagtheora.misc;


public abstract class SimplePeer {

    public long peer;

    protected void init() {}

    protected abstract void clear();

    public final boolean b() {
        return this.peer == 0L;
    }

    public void setPeer(long arg0) {
        this.peer = arg0;
    }

    public final void cleanUp() {
        if (!this.b()) {
            this.clear();
        }
    }

    @Override
    public final void finalize() throws Throwable {
        if (!this.b()) {
            this.cleanUp();
        }
        super.finalize();
    }
    public final void a() { this.cleanUp(); }
}
