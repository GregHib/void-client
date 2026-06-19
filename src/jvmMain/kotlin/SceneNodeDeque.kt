import Gl3dTextureStatics.method248
import SceneTilePlaneManager.method260
import LightDetailOptionStateStatics.method1802
import NoOpGraphicsOptionStateStatics.method1804
import ModelVertexColorBufferStatics.method2739
import ColourKeyTextureNodeStatics.method3120
import TileTextureNodeStatics.method3131
import FlipTextureNodeStatics.method3064
import FireParticleStreamStatics.method132
import OpenGlTerrainTileStatics.method4002
import NativeShaderProgramStatics.method3439
import java.io.IOException
import java.net.Socket
import java.net.URL
import SceneNodeDequeStatics.anInt1493
import SceneNodeDequeStatics.anInt1494
import SceneNodeDequeStatics.anInt1495
import SceneNodeDequeStatics.anInt1496
import SceneNodeDequeStatics.anInt1502

/*
 * Class88
 */
class SceneNodeDeque {
    @JvmField
    var aClass318_Sub9_1503: SceneListNode? = SceneListNode()
    private var aClass318_Sub9_1505: SceneListNode? = null

    fun method840(i: Int): Int {
        anInt1496++
        var i_0_ = i
        var class318_sub9 = (this.aClass318_Sub9_1503!!.aClass318_Sub9_6469)
        while (this.aClass318_Sub9_1503 !== class318_sub9) {
            class318_sub9 = class318_sub9!!.aClass318_Sub9_6469
            i_0_++
        }
        return i_0_
    }

    fun method844(class318_sub9: SceneListNode?, bool: Boolean) {
        try {
            anInt1495++
            if (class318_sub9!!.aClass318_Sub9_6468 != null) class318_sub9.method2514(93)
            class318_sub9.aClass318_Sub9_6469 = this.aClass318_Sub9_1503
            class318_sub9.aClass318_Sub9_6468 = (this.aClass318_Sub9_1503!!.aClass318_Sub9_6468)
            if (bool != true) this.aClass318_Sub9_1503 = null
            class318_sub9.aClass318_Sub9_6468!!.aClass318_Sub9_6469 = class318_sub9
            class318_sub9.aClass318_Sub9_6469!!.aClass318_Sub9_6468 = class318_sub9
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("lh.A(" + (if (class318_sub9 != null) "{...}" else "null") + ',' + bool + ')'))
        }
    }

    fun method845(i: Byte) {
        while (true) {
            val class318_sub9 = (this.aClass318_Sub9_1503!!.aClass318_Sub9_6469)
            if (class318_sub9 === this.aClass318_Sub9_1503) break
            class318_sub9!!.method2514(54)
        }
        if (i < 23) aClass318_Sub9_1505 = null
        anInt1493++
        aClass318_Sub9_1505 = null
    }

    fun method846(i: Byte): SceneListNode? {
        anInt1494++
        val class318_sub9 = aClass318_Sub9_1505
        if (class318_sub9 === this.aClass318_Sub9_1503) {
            aClass318_Sub9_1505 = null
            return null
        }
        if (i > -34) aClass318_Sub9_1505 = null
        aClass318_Sub9_1505 = class318_sub9!!.aClass318_Sub9_6469
        return class318_sub9
    }

    fun method848(i: Int): SceneListNode? {
        if (i != 8) return null
        anInt1502++
        val class318_sub9 = (this.aClass318_Sub9_1503!!.aClass318_Sub9_6469)
        if (class318_sub9 === this.aClass318_Sub9_1503) {
            aClass318_Sub9_1505 = null
            return null
        }
        aClass318_Sub9_1505 = class318_sub9!!.aClass318_Sub9_6469
        return class318_sub9
    }

    init {
        this.aClass318_Sub9_1503!!.aClass318_Sub9_6468 = this.aClass318_Sub9_1503
        this.aClass318_Sub9_1503!!.aClass318_Sub9_6469 = this.aClass318_Sub9_1503
    }
}
