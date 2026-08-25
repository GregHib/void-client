package util

actual typealias Locale = java.util.Locale

actual val LOCALE_ROOT: Locale = java.util.Locale.ROOT
actual val LOCALE_ENGLISH: Locale = java.util.Locale.ENGLISH
actual val LOCALE_US: Locale = java.util.Locale.US
actual val LOCALE_UK: Locale = java.util.Locale.UK

actual fun defaultLocale(): Locale = java.util.Locale.getDefault()

@Suppress("DEPRECATION") // Locale(String, String, String) is deprecated on JDK 19+
actual fun localeOf(language: String, country: String, variant: String): Locale =
    java.util.Locale(language, country, variant)