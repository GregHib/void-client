// Marker interfaces used in ha's abstract method signatures so that ha can live in commonMain.
// The concrete JVM types (Class60, Class64, s, za, Class98, Class143, Class324) implement these
// interfaces in jvmMain and cannot themselves move to commonMain due to transitive JVM deps.

interface Class60Base {
    fun method578(i: Int, i_2_: Int)
    fun method579(i: Int): Any?
    fun method582(`object`: Any?, l: Long, i: Byte)
    fun method583(l: Long, i: Int): Any?
    fun method588(i: Int): Any?
    fun method590(i: Int)
}
interface Class64Base
interface SBase
interface ZaBase
interface Class98Base {
    /** Sentinel node for the scene entity linked list (Class88.aClass318_Sub9_1503). */
    val entityList: EntityListNode
}
interface Class124Base
interface Class143Base
interface Class324Base
