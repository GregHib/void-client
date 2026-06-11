/**
 * Multiplatform calendar seam.
 *
 * Replaces the few java.util.Calendar / GregorianCalendar / TimeZone / Date uses
 * that survived Phase 2. On JVM the actual (see jvmMain) is a thin wrapper over
 * java.util.Calendar, so all field semantics stay byte-identical:
 *
 *  - field constants follow java.util.Calendar exactly:
 *      YEAR=1, MONTH=2 (0-based: Jan=0), DAY_OF_MONTH=5, DAY_OF_WEEK=7 (1-based: Sun=1),
 *      HOUR_OF_DAY=11 (24h), MINUTE=12, SECOND=13.
 *  - [get]/[set] take those constants; call sites pass the raw ints (1,2,5,7,11,12,13)
 *    as they did against java.util.Calendar, so behaviour is unchanged.
 *  - the GMT instance ([gmt]) mirrors Calendar.getInstance(TimeZone.getTimeZone("GMT")).
 *  - the local instance ([local]) mirrors GregorianCalendar() in the default zone.
 *
 * Only the methods/fields actually used by the client are exposed. An off-JVM
 * actual must reproduce java.util.Calendar's proleptic-Gregorian field math for
 * the date ranges in play (used for date/time display strings and an RNG seed).
 */
expect class CalendarShim {
    /** Reset all fields to zero/epoch, like java.util.Calendar.clear(). */
    fun clear()

    /** Set a single field by its java.util.Calendar constant. */
    fun set(field: Int, value: Int)

    /** Set year, 0-based month and day-of-month at once (Calendar.set(y, mo, d)). */
    fun set(year: Int, month: Int, dayOfMonth: Int)

    /** Set the instant from epoch milliseconds (replaces setTime(Date(millis))). */
    fun setTimeMillis(millis: Long)

    /** Read a field by its java.util.Calendar constant. */
    fun get(field: Int): Int

    /** Epoch milliseconds of the current instant (replaces getTime().getTime()). */
    fun getTimeMillis(): Long

    companion object {
        val YEAR: Int
        val MONTH: Int
        val DAY_OF_MONTH: Int
        val DAY_OF_WEEK: Int
        val HOUR_OF_DAY: Int
        val MINUTE: Int
        val SECOND: Int

        /** A calendar fixed to GMT (mirrors Calendar.getInstance(TimeZone.getTimeZone("GMT"))). */
        fun gmt(): CalendarShim

        /** A calendar in the platform's default zone (mirrors Calendar.getInstance()). */
        fun local(): CalendarShim
    }
}
