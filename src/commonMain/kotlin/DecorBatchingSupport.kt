/**
 * Whether ground decor may be drawn from per-chunk batches (see DecorBatcher). Off on the JVM,
 * which keeps the original one-draw-per-model rendering.
 */
expect val decorBatchingSupported: Boolean
