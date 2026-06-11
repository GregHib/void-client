/**
 * Platform seam for system property access.
 *
 * Replaces [System.getProperty] / [System.setProperty] calls scattered across the client so that
 * those files can eventually move to commonMain.
 *
 * JVM actual: delegates to java.lang.System.
 * Web/native actuals: can expose a pre-populated map or environment variables as appropriate.
 *
 * Properties used by the client:
 *   - "java.vendor"              – JVM vendor string
 *   - "java.version"             – JVM version string
 *   - "os.name"                  – operating system name
 *   - "os.arch"                  – OS CPU architecture
 *   - "os.version"               – OS version string
 *   - "user.home"                – user home directory path
 *   - "java.net.useSystemProxies" – proxy configuration flag
 */
expect fun systemGetProperty(key: String): String?

expect fun systemSetProperty(key: String, value: String)
