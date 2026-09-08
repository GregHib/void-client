package com.ms.directX;

import com.ms.com.IUnknown;

public interface IEnumModesCallback {
    /** Callback for {@link DirectDraw#enumDisplayModes}. */
    void onEnumDisplayMode(DDSurfaceDesc desc, IUnknown unk);
}
