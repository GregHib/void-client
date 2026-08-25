package util

actual class Locale actual constructor(
    language: String,
    country: String,
    variant: String,
) {
    private val language: String = language.lowercase()
    private val country: String = country.uppercase()
    private val variant: String = variant

    actual constructor(language: String) : this(language, "", "")

    actual constructor(language: String, country: String) : this(language, country, "")

    actual fun getLanguage(): String = language
    actual fun getCountry(): String = country
    actual fun getVariant(): String = variant

    actual fun toLanguageTag(): String {
        if (language.isEmpty() && country.isEmpty()) return "und"
        val tag = StringBuilder(language.ifEmpty { "und" })
        if (country.isNotEmpty()) tag.append('-').append(country)
        if (variant.isNotEmpty()) tag.append('-').append(variant)
        return tag.toString()
    }

    override fun toString(): String {
        if (language.isEmpty() && country.isEmpty()) return ""
        val text = StringBuilder(language)
        if (country.isNotEmpty() || variant.isNotEmpty()) text.append('_').append(country)
        if (variant.isNotEmpty()) text.append('_').append(variant)
        return text.toString()
    }

    override fun equals(other: Any?): Boolean =
        other is Locale &&
                language == other.language &&
                country == other.country &&
                variant == other.variant

    override fun hashCode(): Int =
        (language.hashCode() * 31 + country.hashCode()) * 31 + variant.hashCode()
}

actual val LOCALE_ROOT: Locale = Locale("", "", "")
actual val LOCALE_ENGLISH: Locale = Locale("en", "", "")
actual val LOCALE_US: Locale = Locale("en", "US")
actual val LOCALE_UK: Locale = Locale("en", "GB")

actual fun defaultLocale(): Locale = hostLocale()

actual fun localeOf(language: String, country: String, variant: String): Locale =
    Locale(language, country, variant)

private fun hostLocale(): Locale {
    val tag = runCatching { jsResolvedLocale() }.getOrNull()
    if (tag.isNullOrBlank()) return LOCALE_US
    val parts = tag.split('-', '_')
    return Locale(
        parts.getOrElse(0) { "" },
        parts.getOrElse(1) { "" },
        parts.drop(2).joinToString("_"),
    )
}

private fun jsResolvedLocale(): String =
    js("Intl.DateTimeFormat().resolvedOptions().locale") as String
