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
    val aClass88_1569: Class88Base
}
interface Class124Base
interface Class143Base
interface Class324Base {
    fun method2569(string: String?, i: Int, i_41_: Int, i_42_: Int, i_43_: Int, i_44_: Int)
    fun method2576(string: String?, i: Int, i_69_: Int, i_70_: Int, i_71_: Int, i_72_: Int)
    fun method2584(`is`: IntArray?, i: Int, i_115_: Int, class105s: Array<Class105?>?, i_116_: Int, i_117_: Int, i_118_: Int, var_aa: aa?, i_119_: Int, i_120_: Int, i_121_: Int, i_122_: Int, i_123_: Int, bool: Boolean, i_124_: Int, string: String?): Int
}
