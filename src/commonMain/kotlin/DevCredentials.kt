/**
 * Developer credential lookup for [DevAutoLogin]. Values live in the environment, never in
 * source: `VOID_DEV_USERNAME` / `VOID_DEV_PASSWORD`. JVM reads the process environment at
 * startup; the browser bundle gets them inlined at webpack time from the environment of the
 * process that ran the build (see webpack.config.d/dev-credentials.js). Blank means unset.
 */
expect fun devCredential(name: String): String?
