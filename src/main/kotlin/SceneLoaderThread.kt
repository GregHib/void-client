import GlslMaterialPass.Companion.method2154
import Class38.Companion.method365
import kotlin.concurrent.Volatile

/* Class293 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SceneLoaderThread internal constructor(private val anInt3749: Int, private val aRenderer3746: Renderer) : Runnable {
    private var aLong3742: Long = 0
    private var aCacheIndexManager_3743: CacheIndexManager? = null

    @Volatile
    private var aBoolean3744 = false

    @Volatile
    private var aBoolean3745 = true
    private val anIntArray3747: IntArray
    private val aClass348_Sub1Array3748 = arrayOfNulls<Class348_Sub1>(8)

    @Volatile
    private var aBoolean3750 = true

    fun method2204(): Long {
        return aLong3742
    }

    override fun run() {
        while (aBoolean3745) method2207()
    }

    fun method2205() {
        aBoolean3750 = false
        aBoolean3745 = false
        synchronized(this) {
            (this as Object).notify()
        }
    }

    fun method2206(cacheIndexManager: CacheIndexManager?) {
        if (aCacheIndexManager_3743 != null) aCacheIndexManager_3743!!.method2356(null, (-108).toByte())
        aCacheIndexManager_3743 = cacheIndexManager
        if (aCacheIndexManager_3743 != null) aCacheIndexManager_3743!!.method2356(this, (-108).toByte())
    }

    private fun method2207() {
        aRenderer3746.method3659(anInt3749)
        while (!aBoolean3750 && aBoolean3745) {
            if (aCacheIndexManager_3743 == null || aCacheIndexManager_3743!!.method2360(-112)) {
                aBoolean3744 = false
                aLong3742 = Class50_Sub4.aClass47_5262!!.method446(1)
                synchronized(this) {
                    try {
                        (this as Object).wait()
                    } catch (interruptedexception: InterruptedException) {
                        /* empty */
                    }
                }
            } else {
                aBoolean3744 = true
                val class318 = aCacheIndexManager_3743!!.method2362(25061)
                if (class318 is SceneEntity) {
                    val class318_sub1 = class318
                    if (class318_sub1.aBoolean6387) class318_sub1.method2387(Class9.aRenderer171, -127)
                    else {
                        method365(class318_sub1, aClass348_Sub1Array3748)
                        if (Class362.aFont_4456 != null) Class362.aFont_4456!!.method2576(aCacheIndexManager_3743!!.aString3953, -256, class318_sub1.anInt6380, class318_sub1.anInt6386, -16777216, -114)
                    }
                } else {
                    val i = (class318 as SceneModelBuilder).anInt6394
                    if (i >= 1 && i <= 4) {
                        val var_s = NativeSprite.aTerrainTileArray5191!![i - 1]
                        for (i_0_ in 0..<(NpcActorEntity.anInt10084 + NpcActorEntity.anInt10084)) {
                            for (i_1_ in 0..<(NpcActorEntity.anInt10084 + NpcActorEntity.anInt10084)) {
                                if (OverlayColorTable.aBooleanArrayArrayArray1751!![i - 1]!![i_0_]!![i_1_]) {
                                    val i_2_ = (DisplayModeOptionState.anInt6111 - NpcActorEntity.anInt10084 + i_0_)
                                    val i_3_ = (GlIndexBufferArb.anInt8502 - NpcActorEntity.anInt10084 + i_1_)
                                    if (i_2_ >= 0 && i_2_ < var_s!!.anInt4587 && i_3_ >= 0 && i_3_ < var_s.anInt4590) {
                                        Class9.aRenderer171!!.H(i_2_ shl Class362.anInt4459, var_s.method3982((-86).toByte(), i_3_, i_2_), i_3_ shl Class362.anInt4459, anIntArray3747)
                                        if (method2154(anIntArray3747[0]) == anInt3749 - 1) var_s.method3979(i_2_, i_3_)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        aRenderer3746.method3678(anInt3749)
        while (aBoolean3750 && aBoolean3745) {
            synchronized(this) {
                try {
                    (this as Object).wait()
                } catch (interruptedexception: InterruptedException) {
                    /* empty */
                }
            }
        }
    }

    fun method2208() {
        aBoolean3750 = true
        synchronized(this) {
            (this as Object).notify()
        }
    }

    fun method2209() {
        aBoolean3750 = false
        synchronized(this) {
            (this as Object).notify()
        }
    }

    fun method2210(): Boolean {
        return aCacheIndexManager_3743 == null || (!aBoolean3744 && aCacheIndexManager_3743!!.method2360(70))
    }

    init {
        anIntArray3747 = IntArray(3)
    }
}
