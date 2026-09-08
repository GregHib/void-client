package jagdx;


import voidawt.Canvas;

public final class D3DPRESENT_PARAMETERS {

    public boolean Windowed;

    public int Flags;

    public int FullScreen_RefreshRateInHz;

    public boolean EnableAutoDepthStencil;

    public int BackBufferHeight = 0;

    public int BackBufferWidth = 0;

    public int PresentationInterval = 0;

    public final int BackBufferCount = 0;

    public int MultiSampleQuality = 0;

    public int BackBufferFormat = 0;

    public int MultiSampleType = 0;

    public final int SwapEffect = 1;

    public int AutoDepthStencilFormat = 0;

    public final Canvas DeviceWindow;

    public D3DPRESENT_PARAMETERS(Canvas arg0) {
        this.DeviceWindow = arg0;
    }
}
