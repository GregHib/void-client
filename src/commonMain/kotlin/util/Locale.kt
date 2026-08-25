package util

expect class Locale {
    constructor(language: String)
    constructor(language: String, country: String)
    constructor(language: String, country: String, variant: String)

    fun getLanguage(): String
    fun getCountry(): String
    fun getVariant(): String
    fun toLanguageTag(): String
}

expect val LOCALE_ROOT: Locale
expect val LOCALE_ENGLISH: Locale
expect val LOCALE_US: Locale
expect val LOCALE_UK: Locale

expect fun defaultLocale(): Locale

expect fun localeOf(language: String, country: String = "", variant: String = ""): Locale