package voidawt.image;

public interface ImageProducer {
    void addConsumer(ImageConsumer ic);

    boolean isConsumer(ImageConsumer ic);

    void removeConsumer(ImageConsumer ic);

    void startProduction(ImageConsumer ic);

    void requestTopDownLeftRightResend(ImageConsumer ic);
}
