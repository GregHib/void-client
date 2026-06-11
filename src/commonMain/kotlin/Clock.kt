/**
 * Platform seam for time queries.
 *
 * Replaces two JVM-only calls that appear across the timing subsystem:
 *   - [System.currentTimeMillis]  → [clockMillis]  (wall-clock ms, used by Class62/Class241_Sub1)
 *   - [System.nanoTime] / [jagex3.jagmisc.jagmisc.nanoTime] → [clockNanos]  (monotonic ns, used by Class47_Sub2/Class241_Sub2/Class241_Sub3)
 *
 * Implemented as expect/actual leaf functions per the migration plan (§4 service interfaces table).
 * JVM actual delegates to System.*; web/native actuals will use their own monotonic sources.
 */
expect fun clockMillis(): Long

expect fun clockNanos(): Long
