package voidawt.image;

import voidawt.Point;

public class Raster {
    SampleModel sampleModel;
    DataBuffer dataBuffer;
    int width;
    int height;

    public static WritableRaster createWritableRaster(SampleModel sm, DataBuffer db, Point location) {
        WritableRaster raster = new WritableRaster();
        raster.sampleModel = sm;
        raster.dataBuffer = db;
        raster.width = sm.width;
        raster.height = sm.height;
        return raster;
    }

    public DataBuffer getDataBuffer() {
        return dataBuffer;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
