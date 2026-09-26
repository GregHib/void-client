/*
 * 32-bit stores into a ByteArray. Hot vertex-packing code writes millions of these per second;
 * on JS each is one DataView call instead of four separate byte stores.
 */

expect fun ByteArray.putIntLE(pos: Int, value: Int)

expect fun ByteArray.putIntBE(pos: Int, value: Int)

/** Stores the raw IEEE-754 bits of [value], little-endian. */
expect fun ByteArray.putFloatLE(pos: Int, value: Float)
