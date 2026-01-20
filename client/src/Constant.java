final class Constant {
    static final int ZOOM_OFFSET_DEFAULT = 0; // Linear zoom offset added to the computed FOV (0 = no offset).
    static final int ZOOM_OFFSET_STEP = 15; // Scroll step size for the linear zoom offset.

    static final int FOV_MIN_FACTOR_NUM = 1; // FOV minimum as a fraction of the base min (numerator).
    static final int FOV_MIN_FACTOR_DEN = 4; // FOV minimum as a fraction of the base min (denominator).
    static final int FOV_MAX_FACTOR_NUM = 4; // FOV maximum as a fraction of the base max (numerator).
    static final int FOV_MAX_FACTOR_DEN = 1; // FOV maximum as a fraction of the base max (denominator).
    static final int FOV_MIN_ABS = 50; // Absolute minimum FOV clamp regardless of base settings.

    private Constant() {
    }
}
