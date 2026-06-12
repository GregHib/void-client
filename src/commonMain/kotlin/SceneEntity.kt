/**
 * Seam for Class318_Sub9_Sub2: exposes the fields read by the renderer (ha_Sub1)
 * and the scene serialiser (oa) without importing any jvmMain types.
 *
 * Field names map 1-to-1 to the original decompiled names so diffs stay minimal.
 */
interface SceneEntity {
    /** X position (fixed-point, divide by 4096 for world units) */
    val anInt8791: Int
    /** Y position (fixed-point, divide by 4096 for world units) */
    val anInt8796: Int
    /** Z position (fixed-point, divide by 4096 for world units) */
    val anInt8789: Int
    /** Colour / lighting packed value */
    val anInt8790: Int
    /** Size / scale (fixed-point) */
    val anInt8793: Int
    /** Texture / sprite ID (-1 = colour-only) */
    val anInt8792: Int
    /** Sprite type byte */
    val aByte8795: Byte
    /** Next entity in the linked list (null when this is the sentinel/tail) */
    val nextEntity: SceneEntity?
}
