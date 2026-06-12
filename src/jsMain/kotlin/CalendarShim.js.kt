/**
 * JS actual for [CalendarShim]: backed by the JS Date API via dynamic.
 * Field constants match java.util.Calendar exactly (see commonMain doc).
 * MONTH is 0-based (Jan=0), DAY_OF_WEEK is 1-based (Sun=1) — same as Java.
 */
actual class CalendarShim private constructor(private val utc: Boolean) {
    private var epochMs: Double = 0.0

    actual fun clear() { epochMs = 0.0 }

    actual fun setTimeMillis(millis: Long) { epochMs = millis.toDouble() }

    actual fun getTimeMillis(): Long = epochMs.toLong()

    actual fun set(field: Int, value: Int) {
        val d: dynamic = newDate(epochMs)
        if (utc) {
            when (field) {
                YEAR         -> d.setUTCFullYear(value)
                MONTH        -> d.setUTCMonth(value)
                DAY_OF_MONTH -> d.setUTCDate(value)
                HOUR_OF_DAY  -> d.setUTCHours(value)
                MINUTE       -> d.setUTCMinutes(value)
                SECOND       -> d.setUTCSeconds(value)
            }
        } else {
            when (field) {
                YEAR         -> d.setFullYear(value)
                MONTH        -> d.setMonth(value)
                DAY_OF_MONTH -> d.setDate(value)
                HOUR_OF_DAY  -> d.setHours(value)
                MINUTE       -> d.setMinutes(value)
                SECOND       -> d.setSeconds(value)
            }
        }
        epochMs = d.getTime() as Double
    }

    actual fun set(year: Int, month: Int, dayOfMonth: Int) {
        val d: dynamic = newDate(epochMs)
        if (utc) {
            d.setUTCFullYear(year)
            d.setUTCMonth(month)
            d.setUTCDate(dayOfMonth)
        } else {
            d.setFullYear(year)
            d.setMonth(month)
            d.setDate(dayOfMonth)
        }
        epochMs = d.getTime() as Double
    }

    actual fun get(field: Int): Int {
        val d: dynamic = newDate(epochMs)
        return if (utc) {
            when (field) {
                YEAR         -> d.getUTCFullYear() as Int
                MONTH        -> d.getUTCMonth()    as Int
                DAY_OF_MONTH -> d.getUTCDate()     as Int
                DAY_OF_WEEK  -> (d.getUTCDay()     as Int) + 1
                HOUR_OF_DAY  -> d.getUTCHours()    as Int
                MINUTE       -> d.getUTCMinutes()  as Int
                SECOND       -> d.getUTCSeconds()  as Int
                else         -> 0
            }
        } else {
            when (field) {
                YEAR         -> d.getFullYear() as Int
                MONTH        -> d.getMonth()    as Int
                DAY_OF_MONTH -> d.getDate()     as Int
                DAY_OF_WEEK  -> (d.getDay()     as Int) + 1
                HOUR_OF_DAY  -> d.getHours()    as Int
                MINUTE       -> d.getMinutes()  as Int
                SECOND       -> d.getSeconds()  as Int
                else         -> 0
            }
        }
    }

    actual companion object {
        actual val YEAR: Int         = 1
        actual val MONTH: Int        = 2
        actual val DAY_OF_MONTH: Int = 5
        actual val DAY_OF_WEEK: Int  = 7
        actual val HOUR_OF_DAY: Int  = 11
        actual val MINUTE: Int       = 12
        actual val SECOND: Int       = 13

        actual fun gmt(): CalendarShim   = CalendarShim(utc = true)
        actual fun local(): CalendarShim = CalendarShim(utc = false)
    }
}

private fun newDate(ms: Double): dynamic {
    val d: dynamic = js("new Date(0)")
    d.setTime(ms)
    return d
}
