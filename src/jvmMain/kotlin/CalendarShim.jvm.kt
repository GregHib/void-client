import java.util.Calendar
import java.util.Date
import java.util.TimeZone

/**
 * JVM actual for the [CalendarShim] seam: a thin wrapper over java.util.Calendar
 * so every field read/write behaves exactly as the original code did. The wrapped
 * instance is created GMT or default-zone by the [gmt]/[local] factories.
 */
actual class CalendarShim private constructor(private val cal: Calendar) {
    actual fun clear() = cal.clear()
    actual fun set(field: Int, value: Int) = cal.set(field, value)
    actual fun set(year: Int, month: Int, dayOfMonth: Int) = cal.set(year, month, dayOfMonth)
    actual fun setTimeMillis(millis: Long) = cal.setTime(Date(millis))
    actual fun get(field: Int): Int = cal.get(field)
    actual fun getTimeMillis(): Long = cal.getTime().getTime()

    actual companion object {
        actual val YEAR: Int = 1
        actual val MONTH: Int = 2
        actual val DAY_OF_MONTH: Int = 5
        actual val DAY_OF_WEEK: Int = 7
        actual val HOUR_OF_DAY: Int = 11
        actual val MINUTE: Int = 12
        actual val SECOND: Int = 13

        actual fun gmt(): CalendarShim =
            CalendarShim(Calendar.getInstance(TimeZone.getTimeZone("GMT")))

        // Class66 originally used Calendar.getInstance() (default zone, locale calendar);
        // Client originally used GregorianCalendar(). Both are default-zone and only differ
        // under a non-Gregorian default locale calendar (e.g. Buddhist), which would shift
        // get(YEAR). Class66 reads YEAR, so match its Calendar.getInstance() exactly here;
        // Client only reads hour/min/sec, which are unaffected by the calendar system.
        actual fun local(): CalendarShim =
            CalendarShim(Calendar.getInstance())
    }
}
