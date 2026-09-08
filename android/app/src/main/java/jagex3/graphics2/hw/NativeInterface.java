package jagex3.graphics2.hw;


public final class NativeInterface {

    public long peer;

    public NativeInterface(int arg0, int arg1) {
        this.init(arg0, arg1);
    }

    public void copyNormals(short[] arg0, short[] arg1, short[] arg2, byte[] arg3, float arg4, float arg5, int arg6, int arg7, int arg8, long arg9) {}

    public void release() {}

    public void copyLighting(short[] arg0, byte[] arg1, short[] arg2, short[] arg3, short[] arg4, short[] arg5, byte[] arg6, int arg7, int arg8, short[] arg9, int arg10, int arg11, int arg12, long arg13) {}

    public void init(int arg0, int arg1) {}

    public void initTextureMetrics(int arg0, byte arg1, byte arg2) {}

    public void setSunColour(float arg0, float arg1, float arg2, float arg3, float arg4) {}

    public void setSunDirection(float arg0, float arg1, float arg2) {}

    public void copyPositions(int[] arg0, int[] arg1, int[] arg2, short[] arg3, int arg4, int arg5, int arg6, long arg7) {}

    public void copyTexCoords(float[] arg0, float[] arg1, int arg2, int arg3, int arg4, long arg5) {}

    public void setAmbient(float arg0) {}

    public void copyColours(short[] arg0, byte[] arg1, short[] arg2, int arg3, short[] arg4, int arg5, int arg6, int arg7, long arg8) {}
}
