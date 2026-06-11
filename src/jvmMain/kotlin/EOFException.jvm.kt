/**
 * JVM actual for the [EOFException] seam: the real java.io.EOFException, so all
 * existing throw/catch sites behave exactly as before. Because java.io.EOFException
 * already extends java.io.IOException (the JVM actual of the IOException seam), the
 * common `EOFException : IOException` relationship holds with no extra wiring.
 */
actual typealias EOFException = java.io.EOFException
