import GameAppletFrame.Companion.method94
import GlCubeMapTexture.Companion.method243
import WaterDetailOptionState.Companion.method1781
import ParticleDetailOptionState.Companion.method1795
import CameraDistanceOptionState.Companion.method1725
import SceneryDetailOptionState.Companion.method1821
import SimpleToggleOptionState.Companion.method1742
import SocketFactory.Companion.method2049
import WaterMaterialPass.Companion.method2148
import CubemapTextureImplSource.Companion.method2271
import SceneObjectEntity.Companion.method2405
import ArchiveResourceProvider.Companion.method2348
import VorbisOggDecoder.Companion.method2972
import TurbulenceTextureNode.Companion.method3113
import GlTexture2DRegion.Companion.method3553
import GlCubemapLightPass.Companion.method3544
import MinimapTriangleDrawer.Companion.method464
import GameClock.method599
import ChatCommandProcessor.method706
import ChatCommandProcessor.method715
import NoiseTextureNode.Companion.method3102
import jagex3.jagmisc.jagmisc.availablePhysicalMemory
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream

/*
 * Class82
 */
class ConfigArchiveLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aJs5Archive_1436: Js5Archive?

    var anInt1439: Int = 0

    init {
        LruByteCache(64)
        try {
            aJs5Archive_1436 = js5Archive
            this.anInt1439 = aJs5Archive_1436!!.method407(0, 15)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("lba.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }

    companion object {

        var aJs5Archive_1434: Js5Archive? = null

        var anInt1435: Int = 0

        var anInt1437: Int = 0

        var anInt1438: Int = 0
        @JvmStatic
        fun method811(i: Byte) {
            if (i > -109) anInt1435 = 69
            aJs5Archive_1434 = null
        }

        @JvmStatic
        fun method812(string: String?, bool: Boolean, bool_0_: Boolean, i: Byte) {
            try {
                if (i.toInt() != -79) Companion.method814((-79).toByte(), 126L)
                anInt1437++
                try {
                    if (WorldMapRenderer.anInt4674 != 10 && (string.equals("commands", ignoreCase = true) || string.equals("help", ignoreCase = true))) {
                        method94("commands - This command", i.toInt() xor 0x1)
                        method94("cls - Clear console", -54)
                        method94("displayfps - Toggle FPS and other information", -89)
                        method94("renderer - Print graphics renderer information", 122)
                        method94("heap - Print java memory information", -88)
                        return
                    }
                    if (string.equals("cls", ignoreCase = true)) {
                        ViewportTransform.anInt3676 = 0
                        WorldMapTextLabel.anInt8587 = 0
                        return
                    }
                    if (string.equals("displayfps", ignoreCase = true)) {
                        PixelBlender.aBoolean3811 = !PixelBlender.aBoolean3811
                        if (PixelBlender.aBoolean3811) method94("FPS on", 83)
                        else {
                            method94("FPS off", -69)
                            return
                        }
                        return
                    }
                    if (string == "renderer") {
                        val class365 = FacingDirectionNode.aRenderer6654!!.c()
                        method94("Vendor: " + class365.anInt4476, 89)
                        method94("Name: " + (class365.aString4470), 71)
                        method94(("Version: " + (class365.anInt4475)), -110)
                        method94(("Device: " + (class365.aString4472)), i + 146)
                        method94(("Driver Version: " + (class365.aLong4471)), i + -32)
                        return
                    }
                    if (string == "heap") {
                        method94(("Heap: " + TextureDefinitionCache.anInt2964 + "MB"), 69)
                        return
                    }
                } catch (exception: Exception) {
                    method94((LocalizedText.aLocalizedText_3485!!.method2063(ChatCommandProcessor.anInt6967, 544)!!), -99)
                    return
                }
                if (NpcAnimationResolver.aNamedIdRecord_165 != OggCacheStream.aNamedIdRecord_5271 || AsyncTaskHandle.anInt2581 >= 2) {
                    if (string.equals("errortest", ignoreCase = true)) throw RuntimeException()
                    if (string == "nativememerror") throw OutOfMemoryError("native(MPR")
                    try {
                        if (string.equals("printfps", ignoreCase = true)) {
                            method94(("FPS: " + SimpleToggleOptionState.anInt5891), -58)
                            return
                        }
                        if (string.equals("occlude", ignoreCase = true)) {
                            ActorEntity.aBoolean9307 = !ActorEntity.aBoolean9307
                            if (ActorEntity.aBoolean9307) {
                                method94("Occlsion now on!", -102)
                                return
                            } else method94("Occlsion now off!", -106)
                            return
                        }
                        if (string.equals("fpson", ignoreCase = true)) {
                            PixelBlender.aBoolean3811 = true
                            method94("fps debug enabled", -115)
                            return
                        }
                        if (string.equals("fpsoff", ignoreCase = true)) {
                            PixelBlender.aBoolean3811 = false
                            method94("fps debug disabled", 125)
                            return
                        }
                        if (string == "systemmem") {
                            try {
                                method94(("System memory: " + (availablePhysicalMemory / 1048576L) + "/" + NoiseTextureNode.aClass348_Sub4_9264!!.anInt6609 + "Mb"), i + 26)
                            } catch (throwable: Throwable) {
                                /* empty */
                            }
                            return
                        }
                        if (string.equals("cleartext", ignoreCase = true)) {
                            NpcDefinition.aDoublyLinkedNodeList_2957!!.method1876((-45).toByte())
                            method94("Text coords cleared", i + 21)
                            return
                        }
                        if (string.equals("gc", ignoreCase = true)) {
                            method427(i + 180)
                            for (i_1_ in 0..9) System.gc()
                            val runtime = Runtime.getRuntime()
                            val i_2_ = ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L).toInt()
                            method94("mem=" + i_2_ + "k", 110)
                            return
                        }
                        if (string.equals("compact", ignoreCase = true)) {
                            method427(-41)
                            for (i_3_ in 0..9) System.gc()
                            val runtime = Runtime.getRuntime()
                            var i_4_ = ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L).toInt()
                            method94(("Memory before cleanup=" + i_4_ + "k"), 115)
                            method2271(31268)
                            method427(96)
                            for (i_5_ in 0..9) System.gc()
                            i_4_ = ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L).toInt()
                            method94(("Memory after cleanup=" + i_4_ + "k"), -110)
                            return
                        }
                        if (string.equals("unloadnatives", ignoreCase = true)) {
                            method94((if (NativeLibraryUnloader.method1629(true)) "Libraries unloaded" else "Library unloading failed!"), 63)
                            return
                        }
                        if (string.equals("clientdrop", ignoreCase = true)) {
                            method94("Dropped client connection", -119)
                            if (WorldMapRenderer.anInt4674 == 10) method2049(105)
                            else {
                                if (WorldMapRenderer.anInt4674 == 11) AbstractMenuEntryStatics.aBoolean1712 = true
                                return
                            }
                            return
                        }
                        if (string.equals("rotateconnectmethods", ignoreCase = true)) {
                            CacheStateResetter.aServerConnectionInfo_125!!.method1259(0)
                            method94("Rotated connection methods", i.toInt() xor 0x13.inv())
                            return
                        }
                        if (string.equals("clientjs5drop", ignoreCase = true)) {
                            ClientMachineInfo.aMediaStreamClient_6601!!.method1901(-83)
                            method94("Dropped client js5 net queue", -116)
                            return
                        }
                        if (string.equals("serverjs5drop", ignoreCase = true)) {
                            ClientMachineInfo.aMediaStreamClient_6601!!.method1905(0)
                            method94("Dropped server js5 net queue", -100)
                            return
                        }
                        if (string.equals("breakcon", ignoreCase = true)) {
                            VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.method2239(-95)
                            Client.aAbstractGameSocket_9165!!.method1702(i + 123)
                            ClientMachineInfo.aMediaStreamClient_6601!!.method1898(true)
                            method94("Breaking new connections for 5 seconds", i + -4)
                            return
                        }
                        if (string.equals("rebuild", ignoreCase = true)) {
                            TextureTileRenderer.method2953((-117).toByte())
                            method464(-1)
                            method94("Rebuilding map", -113)
                            return
                        }
                        if (string.equals("rebuildprofile", ignoreCase = true)) {
                            RegionMapDecoder.aLong1516 = method599(-75)
                            GlTexture1D.aBoolean8558 = true
                            TextureTileRenderer.method2953((-114).toByte())
                            method464(-1)
                            method94("Rebuilding map (with profiling)", -117)
                            return
                        }
                        if (string.equals("wm1", ignoreCase = true)) {
                            ChatCommandProcessor.method830(1, -1, 102.toByte(), false, -1)
                            if (ContactEntry.method3229(-61) == 1) {
                                method94("wm1 succeeded", -65)
                                return
                            } else method94("wm1 failed", i.toInt() xor 0x17.inv())
                            return
                        }
                        if (string.equals("wm2", ignoreCase = true)) {
                            ChatCommandProcessor.method830(2, -1, 102.toByte(), false, -1)
                            if (ContactEntry.method3229(-119) == 2) method94("wm2 succeeded", -109)
                            else {
                                method94("wm2 failed", i + 154)
                                return
                            }
                            return
                        }
                        if (string.equals("wm3", ignoreCase = true)) {
                            ChatCommandProcessor.method830(3, 1024, 102.toByte(), false, 768)
                            if (ContactEntry.method3229(i.toInt() xor 0x3d) == 3) method94("wm3 succeeded", 111)
                            else {
                                method94("wm3 failed", 83)
                                return
                            }
                            return
                        }
                        if (string.equals("tk0", ignoreCase = true)) {
                            method3553(false, 104.toByte(), 0)
                            if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 0) {
                                method94("Entered tk0", 101)
                                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 0)
                                method243(37)
                                RenderNodeStatics.aBoolean9719 = false
                                return
                            } else method94("Failed to enter tk0", 69)
                            return
                        }
                        if (string.equals("tk1", ignoreCase = true)) {
                            method3553(false, 109.toByte(), 1)
                            if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 1) {
                                method94("Entered tk1", -65)
                                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 1)
                                method243(i.toInt() xor 0x6b.inv())
                                RenderNodeStatics.aBoolean9719 = false
                                return
                            } else method94("Failed to enter tk1", -56)
                            return
                        }
                        if (string.equals("tk2", ignoreCase = true)) {
                            method3553(false, 115.toByte(), 2)
                            if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 2) {
                                method94("Entered tk2", i + 151)
                                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 2)
                                method243(37)
                                RenderNodeStatics.aBoolean9719 = false
                            } else {
                                method94("Failed to enter tk2", i.toInt() xor 0x22)
                                return
                            }
                            return
                        }
                        if (string.equals("tk3", ignoreCase = true)) {
                            method3553(false, 107.toByte(), 3)
                            if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 3) {
                                method94("Entered tk3", 78)
                                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 3)
                                method243(37)
                                RenderNodeStatics.aBoolean9719 = false
                                return
                            } else method94("Failed to enter tk3", 54)
                            return
                        }
                        if (string.equals("tk5", ignoreCase = true)) {
                            method3553(false, 113.toByte(), 5)
                            if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(i.toInt() xor 0x7e13) == 5) {
                                method94("Entered tk5", -108)
                                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 5)
                                method243(37)
                                RenderNodeStatics.aBoolean9719 = false
                            } else {
                                method94("Failed to enter tk5", 63)
                                return
                            }
                            return
                        }
                        if (string!!.startsWith("setba")) {
                            if (string.length < 6) method94("Invalid buildarea value", i + -36)
                            else {
                                val i_6_ = (RegionSceneShifter.method3156(true, string.substring(6)))
                                if (i_6_ < 0 || (LinkedListNodeStatics.method2710(-126, TextureDefinitionCache.anInt2964) < i_6_)) method94("Invalid buildarea value", 53)
                                else {
                                    IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub6_7226), i_6_)
                                    method243(37)
                                    RenderNodeStatics.aBoolean9719 = false
                                    method94(("maxbuildarea=" + IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub6_7226!!.method1743(-32350)), 98)
                                    return
                                }
                                return
                            }
                            return
                        }
                        if (string.startsWith("rect_debug")) {
                            if (string.length < 10) method94("Invalid rect_debug value", -94)
                            else {
                                NativeRenderer.anInt8045 = RegionSceneShifter.method3156(true, string.substring(10).trim { it <= ' ' })
                                method94(("rect_debug=" + NativeRenderer.anInt8045), -124)
                                return
                            }
                            return
                        }
                        if (string.equals("qa_op_test", ignoreCase = true)) {
                            TextureCubeProvider.aBoolean6327 = true
                            method94(("qa_op_test=" + (TextureCubeProvider.aBoolean6327)), -114)
                            return
                        }
                        if (string.equals("clipcomponents", ignoreCase = true)) {
                            SequencedGroundDecor.aBoolean10046 = !SequencedGroundDecor.aBoolean10046
                            method94(("clipcomponents=" + (SequencedGroundDecor.aBoolean10046)), 88)
                            return
                        }
                        if (string.startsWith("bloom")) {
                            val bool_7_ = FacingDirectionNode.aRenderer6654!!.method3666()
                            if (WarpTextureNode.method3137(!bool_7_, (-24).toByte())) {
                                if (bool_7_) {
                                    method94("Bloom disabled", i + -49)
                                    return
                                } else method94("Bloom enabled", 71)
                                return
                            } else method94("Failed to enable bloom", 52)
                            return
                        }
                        if (string.equals("tween", ignoreCase = true)) {
                            if (ItemNameResolver.aBoolean5002) {
                                ItemNameResolver.aBoolean5002 = false
                                method94("Forced tweening disabled.", i.toInt() xor 0x71.inv())
                                return
                            } else {
                                ItemNameResolver.aBoolean5002 = true
                                method94("Forced tweening ENABLED!", -89)
                            }
                            return
                        }
                        if (string.equals("shiftclick", ignoreCase = true)) {
                            if (InputSettingsState.shiftClick) {
                                method94("Shift-click disabled.", i.toInt() xor 0x24.inv())
                                InputSettingsState.shiftClick = false
                            } else {
                                method94("Shift-click ENABLED!", 106)
                                InputSettingsState.shiftClick = true
                                return
                            }
                            return
                        }
                        if (string.equals("getcgcoord", ignoreCase = true)) {
                            method94(("x:" + ((LocalPlayerState.aPlayer_1907!!.x) shr 9) + " z:" + ((LocalPlayerState.aPlayer_1907!!.y) shr 9)), -117)
                            return
                        }
                        if (string.equals("getheight", ignoreCase = true)) {
                            method94(("Height: " + (ActorEntity.aTerrainTileArray5191!![(LocalPlayerState.aPlayer_1907!!.plane).toInt()]!!.method3982((-86).toByte(), (LocalPlayerState.aPlayer_1907!!.y) shr 9, (LocalPlayerState.aPlayer_1907!!.x) shr 9))), i.toInt() xor 0x1)
                            return
                        }
                        if (string.equals("resetminimap", ignoreCase = true)) {
                            CameraRotationStub.aJs5Archive_322!!.method405(i.toInt() xor 0x4e.inv())
                            CameraRotationStub.aJs5Archive_322!!.method412(127.toByte())
                            ModelOrSpriteHolder.aTextureDefinitionLoader_117!!.method1175(125.toByte())
                            TheoraVideoStream.aConfigDefinitionLoader_9031!!.method1219(7851)
                            method464(-1)
                            method94("Minimap reset", 70)
                            return
                        }
                        if (string.startsWith("mc")) {
                            if (FacingDirectionNode.aRenderer6654!!.method3708()) {
                                var i_8_ = string.substring(3).toInt()
                                if (i_8_ >= 1) {
                                    if (i_8_ > 4) i_8_ = 4
                                } else i_8_ = 1
                                ShadowQualityOptionState.anInt6012 = i_8_
                                TextureTileRenderer.method2953((-128).toByte())
                                method94(("Render cores now: " + (ShadowQualityOptionState.anInt6012)), -77)
                            } else {
                                method94("Current toolkit doesn't support multiple cores", i + 138)
                                return
                            }
                            return
                        }
                        if (string.startsWith("cachespace")) {
                            method94(("I(s): " + FontMetaRef.aLruByteCache_4327!!.method581(-18529) + "/" + FontMetaRef.aLruByteCache_4327!!.method577(-4)), -101)
                            method94(("I(m): " + ParticleGeometry.aLruByteCache_4417!!.method581(-18529) + "/" + ParticleGeometry.aLruByteCache_4417!!.method577(i.toInt() xor 0x4d)), 127)
                            method94(("O(s): " + ClientExceptionStatics.aModelHeaderCache_112!!.aSizeBoundedSoftCache_3288.method1350(126.toByte()) + "/" + ClientExceptionStatics.aModelHeaderCache_112!!.aSizeBoundedSoftCache_3288.method1339(100)), i + 203)
                            return
                        }
                        if (string.equals("getcamerapos", ignoreCase = true)) {
                            method94(
                                ("Pos: " + (LocalPlayerState.aPlayer_1907!!.plane) + "," + (((GlslMaterialPass.anInt6246 shr 9) - -ArbVertexProgram.regionTileX) shr 6) + "," + ((CompositeRgbNoiseTexture.anInt8685 shr 9) + RegionMapDecoder.regionTileY shr 6) + "," + (((GlslMaterialPass.anInt6246 shr 9) - -ArbVertexProgram.regionTileX) and 0x3f) + "," + ((CompositeRgbNoiseTexture.anInt8685 shr 9) - -RegionMapDecoder.regionTileY and 0x3f) + " Height: " + ((CollisionMapAccessor.method2064(
                                    GlslMaterialPass.anInt6246,
                                    (LocalPlayerState.aPlayer_1907!!.plane).toInt(),
                                    11219,
                                    CompositeRgbNoiseTexture.anInt8685
                                )) - ParticleSystemRenderer.anInt3855)), 126
                            )
                            method94(
                                ("Look: " + (LocalPlayerState.aPlayer_1907!!.plane) + "," + (RenderableEntry.anInt4336 - -ArbVertexProgram.regionTileX shr 6) + "," + (RegionMapDecoder.regionTileY + ClanChatRequestSender.anInt3647 shr 6) + "," + (0x3f and RenderableEntry.anInt4336 - -ArbVertexProgram.regionTileX) + "," + (0x3f and ClanChatRequestSender.anInt3647 - -RegionMapDecoder.regionTileY) + " Height: " + ((CollisionMapAccessor.method2064(
                                    RenderableEntry.anInt4336,
                                    (LocalPlayerState.aPlayer_1907!!.plane).toInt(),
                                    11219,
                                    ClanChatRequestSender.anInt3647
                                )) - MinimapFlagRenderer.anInt1797)), -90
                            )
                            return
                        }
                        if (string == "renderprofile" || string == "rp") {
                            GlowPostProcessor.aBoolean2514 = !GlowPostProcessor.aBoolean2514
                            FacingDirectionNode.aRenderer6654!!.method3647(GlowPostProcessor.aBoolean2514)
                            MapLabelMenuEntry.method1042(23.toByte())
                            method94(("showprofiling=" + GlowPostProcessor.aBoolean2514), 106)
                            return
                        }
                        if (string.startsWith("performancetest")) {
                            var i_9_ = -1
                            var i_10_ = 1000
                            if (string.length > 15) {
                                val strings = TurbulenceTextureNode.method3113(' ', true, string)
                                try {
                                    if (strings.size > 1) i_10_ = strings[1]!!.toInt()
                                } catch (throwable: Throwable) {
                                    /* empty */
                                }
                                try {
                                    if (strings.size > 2) i_9_ = strings[2]!!.toInt()
                                } catch (throwable: Throwable) {
                                    /* empty */
                                }
                            }
                            if (i_9_ == -1) {
                                method94(("Java toolkit: " + method1781(0, -85, i_10_)), i + -32)
                                method94(("SSE toolkit:  " + method1781(2, -73, i_10_)), 60)
                                method94(("D3D toolkit:  " + method1781(3, i + -24, i_10_)), i.toInt() xor 0x11.inv())
                                method94(("GL toolkit:   " + method1781(1, -84, i_10_)), -121)
                                method94(("GLX toolkit:  " + method1781(5, -77, i_10_)), -101)
                                return
                            } else method94(("Performance: " + method1781(i_9_, -69, i_10_)), -84)
                            return
                        }
                        if (string == "nonpcs") {
                            MouseInputTracker.aBoolean7444 = !MouseInputTracker.aBoolean7444
                            method94("nonpcs=" + (MouseInputTracker.aBoolean7444), -120)
                            return
                        }
                        if (string == "autoworld") {
                            SpriteRenderEntry.method3283(127)
                            method94("auto world selected", -59)
                            return
                        }
                        if (string.startsWith("switchworld")) {
                            val i_11_ = string.substring(12).toInt()
                            method2972((method1742(false, i_11_)!!.aString5794), i_11_, -93)
                            method94("switched", 70)
                            return
                        }
                        if (string == "getworld") {
                            method94(("w: " + (CacheStateResetter.aServerConnectionInfo_125!!.anInt2143)), -120)
                            return
                        }
                        if (string.startsWith("pc")) {
                            val class348_sub47 = (method2148(CellNoiseTextureNode.aFontMetaRef_9304, TheoraVideoStream.aIsaacCipher_9029, -97))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                            val i_12_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                            val i_13_ = string.indexOf(" ", 4)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string.substring(3, i_13_))
                            method3544((class348_sub47.aClass348_Sub49_Sub2_7116!!), i + -12, string.substring(i_13_))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(114, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197 + -i_12_))
                            InterfaceComponentGroup.method3243(i.toInt() xor 0x49.inv(), class348_sub47)
                            return
                        }
                        if (string == "savevarcs") {
                            method2405(119)
                            method94("perm varcs saved", -103)
                            return
                        }
                        if (string == "scramblevarcs") {
                            var i_14_ = 0
                            while ((i_14_ < IsaacCipher.Companion.anIntArray1303!!.size)) {
                                if (GlslEnvMaterialPass.aBooleanArray6270!![i_14_]) {
                                    IsaacCipher.Companion.anIntArray1303!![i_14_] = (Math.random() * 99999.0).toInt()
                                    if (Math.random() > 0.5) IsaacCipher.Companion.anIntArray1303!![i_14_] *= -1
                                }
                                i_14_++
                            }
                            method2405(-61)
                            method94("perm varcs scrambled", -74)
                            return
                        }
                        if (string == "showcolmap") {
                            PlayerAppearanceUpdateDecoder.aBoolean4542 = true
                            method464(-1)
                            method94("colmap is shown", 53)
                            return
                        }
                        if (string == "hidecolmap") {
                            PlayerAppearanceUpdateDecoder.aBoolean4542 = false
                            method464(i.toInt() xor 0x4e)
                            method94("colmap is hidden", 61)
                            return
                        }
                        if (string == "resetcache") {
                            InterfaceBounds.method2938(122.toByte())
                            method94("Caches reset", -113)
                            return
                        }
                        if (string == "profilecpu") {
                            method94((ViewportTransform.method2116(-26584).toString() + "ms"), 87)
                            return
                        }
                        if (string.startsWith("getclientvarpbit")) {
                            val i_15_ = string.substring(17).toInt()
                            method94("varpbit=" + ProjectedGroundDecor.aVarpStore_10209!!.method62(i_15_, i.toInt() xor 0xffb1), i + 198)
                            return
                        }
                        if (string.startsWith("getclientvarp")) {
                            val i_16_ = string.substring(14).toInt()
                            method94("varp=" + ProjectedGroundDecor.aVarpStore_10209!!.method61(i_16_, (-16).toByte()), -68)
                            return
                        }
                        if (string.startsWith("directlogin")) {
                            val strings = (method3113(' ', true, string.substring(12)))
                            if (strings.size >= 2) {
                                val i_17_ = (if (strings.size > 2) strings[2]!!.toInt() else 0)
                                CameraConfigDefinition.method1922(strings[1], i_17_, strings[0], true)
                                return
                            }
                        }
                        if (string.startsWith("csprofileclear")) {
                            method706()
                            return
                        }
                        if (string.startsWith("csprofileoutputc")) {
                            method715(100, false)
                            return
                        }
                        if (string.startsWith("csprofileoutputt")) {
                            method715(10, true)
                            return
                        }
                        if (string.startsWith("texsize")) {
                            val i_18_ = string.substring(8).toInt()
                            FacingDirectionNode.aRenderer6654!!.method3696(i_18_)
                            return
                        }
                        if (string == "soundstreamcount") {
                            method94(("Active streams: " + SpriteDefinition.aClass348_Sub16_Sub4_7065!!.method2887()), 84)
                            return
                        }
                        if (string == "autosetup") {
                            method2478(1000)
                            method94(("Complete. Toolkit now: " + IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(i + -32271)), -97)
                            return
                        }
                        if (string == "errormessage") {
                            method94(NpcType.Companion.aClient1367!!.method81(102.toByte())!!, 102)
                            return
                        }
                        if (string == "heapdump") {
                            if (!PrivilegedOperationWorker.aString3803.startsWith("win")) HeapInfoRecord.method1247(File("/tmp/heap.dump"), false, false)
                            else HeapInfoRecord.method1247(File("C:\\Temp\\heap.dump"), false, false)
                            method94("Done", 74)
                            return
                        }
                        if (string == "os") {
                            method94("Name: " + PrivilegedOperationWorker.aString3803, 59)
                            method94(("Arch: " + PrivilegedOperationWorker.aString3780), i.toInt() xor 0x1.inv())
                            method94("Ver: " + PrivilegedOperationWorker.aString3778, 79)
                            return
                        }
                        if (string.startsWith("w2debug")) {
                            val i_19_ = string.substring(8, 9).toInt()
                            SequencedActorEntity.anInt10096 = i_19_
                            TextureTileRenderer.method2953((-103).toByte())
                            method94("Toggled!", -99)
                            return
                        }
                        if (string.startsWith("ortho ")) {
                            val i_20_ = string.indexOf(' ')
                            if (i_20_ < 0) method94("Syntax: ortho <n>", 66)
                            else {
                                val i_21_ = (RegionSceneShifter.method3156(true, string.substring(1 + i_20_)))
                                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub3_7222), i_21_)
                                method243(37)
                                RenderNodeStatics.aBoolean9719 = false
                                LoadingScreenImageNode.method3179(i + 79)
                                if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1727(-32350) == i_21_) {
                                    method94("Successfully changed ortho mode", -82)
                                    return
                                } else method94("Failed to change ortho mode", -112)
                                return
                            }
                            return
                        }
                        if (string.startsWith("orthozoom ")) {
                            if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1727(i + -32271) == 0) method94("enable ortho mode first (use 'ortho <n>')", i + 182)
                            else {
                                val i_22_ = (RegionSceneShifter.method3156(true, string.substring(string.indexOf(' ') - -1)))
                                LocalPlayerState.anInt1911 = i_22_
                                method94(("orthozoom=" + LocalPlayerState.anInt1911), 68)
                                return
                            }
                            return
                        }
                        if (string.startsWith("orthotilesize ")) {
                            val i_23_ = (RegionSceneShifter.method3156(true, string.substring(1 + string.indexOf(' '))))
                            Js5Archive.anInt666 = i_23_
                            PerlinTextureProvider.anInt5812 = Js5Archive.anInt666
                            method94("ortho tile size=" + i_23_, -70)
                            LoadingScreenImageNode.method3179(0)
                            return
                        }
                        if (string == "orthocamlock") {
                            FloatBuffer.aBoolean9746 = !FloatBuffer.aBoolean9746
                            method94(("ortho camera lock is " + (if (!(FloatBuffer.aBoolean9746)) "off" else "on")), -92)
                            return
                        }
                        if (string.startsWith("setoutput ")) {
                            var file = File(string.substring(10))
                            if (file.exists()) {
                                file = File(string.substring(10) + "." + method599(-76) + ".log")
                                if (file.exists()) {
                                    method94("file already exists!", 80)
                                    return
                                }
                            }
                            if (Texture2DProvider.aFileOutputStream6323 != null) {
                                Texture2DProvider.aFileOutputStream6323!!.close()
                                Texture2DProvider.aFileOutputStream6323 = null
                            }
                            try {
                                Texture2DProvider.aFileOutputStream6323 = FileOutputStream(file)
                            } catch (filenotfoundexception: FileNotFoundException) {
                                method94(("Could not create " + file.getName()), 81)
                            } catch (securityexception: SecurityException) {
                                method94(("Cannot write to " + file.getName()), i.toInt() xor 0x22.inv())
                            }
                            return
                        }
                        if (string == "closeoutput") {
                            if (Texture2DProvider.aFileOutputStream6323 != null) Texture2DProvider.aFileOutputStream6323!!.close()
                            Texture2DProvider.aFileOutputStream6323 = null
                            return
                        }
                        if (string.startsWith("runscript ")) {
                            val file = File(string.substring(10))
                            if (!file.exists()) {
                                method94("No such file", 120)
                                return
                            }
                            val `is` = method1821(i.toInt() xor 0x41, file)
                            if (`is` == null) {
                                method94("Failed to read file", 119)
                                return
                            }
                            val strings = (method3113('\n', true, (NpcDefinitionCache.method1981(method1795(`is`, true), (-89).toByte(), '\r', ""))!!))
                            ChatScriptListNode.method3189(0, strings)
                        }
                        if (string.startsWith("zoom ")) {
                            val i_24_ = (RegionSceneShifter.method3156(true, string.substring(5))).toShort()
                            if (i_24_ > 0) TextureLoaderUtil.aShort3992 = i_24_
                            return
                        }
                        if (string.startsWith("fps ") && (NpcAnimationResolver.aNamedIdRecord_165 != OggCacheStream.aNamedIdRecord_5271)) {
                            LocalizedTextTriple.method2222((RegionSceneShifter.method3156(true, string.substring(4))), (-124).toByte())
                            return
                        }
                    } catch (exception: Exception) {
                        method94(LocalizedText.aLocalizedText_3485!!.method2063(ChatCommandProcessor.anInt6967, 544)!!, -92)
                        return
                    }
                }
                if (WorldMapRenderer.anInt4674 == 10) {
                    MapArchiveSource.anInt4799++
                    val class348_sub47 = method2148((FloatCameraTransform.aFontMetaRef_5699), (TheoraVideoStream.aIsaacCipher_9029), i.toInt() xor 0x24)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, string!!.length + 3)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, if (bool) 1 else 0)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, if (bool_0_) 1 else 0)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                    InterfaceComponentGroup.method3243(120, class348_sub47)
                }
                if (WorldMapRenderer.anInt4674 == 10) {
                    return
                }
                method94(LocalizedText.aLocalizedText_3486!!.method2063(ChatCommandProcessor.anInt6967, 544) + string, 57)
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("lba.B(" + (if (string != null) "{...}" else "null") + ',' + bool + ',' + bool_0_ + ',' + i + ')'))
            }
        }
        
        var anInt8763: Int = 0
        fun method2478(i: Int): Int {
            if (i != 1000) return -103
            anInt8763++
            var bool = false
            var bool_5_ = false
            var bool_6_ = false
            if (VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aBoolean3777 && !VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aBoolean3794) {
                bool = (NoiseTextureNode.aClass348_Sub4_9264!!.anInt6609) >= 512 || (NoiseTextureNode.aClass348_Sub4_9264!!.anInt6609) == 0
                if (PrivilegedOperationWorker.aString3803.startsWith("win")) {
                    bool_6_ = true
                    bool_5_ = true
                } else bool_5_ = true
            }
            if (ScreenAnchorAlignment.aBoolean2881) bool = false
            if (VideoStreamDecoder.aBoolean4117) bool_5_ = false
            if (AbstractTileShapeStatics.aBoolean6558) bool_6_ = false
            if (!bool && !bool_5_ && !bool_6_) return method2348(-8454)
            var i_7_ = -1
            var i_8_ = -1
            var i_9_ = -1
            if (bool) {
                try {
                    i_7_ = method1781(2, -126, 1000)
                } catch (exception: Exception) {
                    /* empty */
                }
            }
            do {
                if (bool_6_) {
                    try {
                        i_9_ = method1781(3, -70, 1000)
                        if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(i + -33350) == 3) {
                            val class365 = FacingDirectionNode.aRenderer6654!!.c()
                            val l = (0xffffffffffffL and class365.aLong4471)
                            val i_10_ = class365.anInt4476
                            if (i_10_ == 4318) {
                                bool_5_ = bool_5_ and (l >= 64425238954L)
                                break
                            } else if (i_10_ != 4098) break
                            bool_5_ = bool_5_ and (l >= 60129613779L)
                        }
                    } catch (exception: Exception) {
                        /* empty */
                    }
                }
            } while (false)
            if (bool_5_) {
                try {
                    i_8_ = method1781(1, i xor 0x3ab.inv(), 1000)
                } catch (exception: Exception) {
                    /* empty */
                }
            }
            if (i_7_ == -1 && i_8_ == -1 && i_9_ == -1) return method2348(i + -9454)
            i_9_ = (i_9_ * 1.1f).toInt()
            i_8_ = (i_8_ * 1.1f).toInt()
            if (i_7_ > i_9_ && i_8_ < i_7_) return SpriteRenderable.method454(i_7_, (-116).toByte())
            if (i_9_ <= i_8_) return GameClock.method600((-59).toByte(), 1, i_8_)
            return GameClock.method600((-80).toByte(), 3, i_9_)
        }

        fun method813(i: Int, i_25_: Int, i_26_: Int): ActorEntity? {
            val class357 = HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_25_]!![i_26_]
            if (class357 == null) return null
            return class357.aClass318_Sub1_Sub4_4403
        }

        @JvmStatic
        fun method814(i: Byte, l: Long) {
            try {
                anInt1438++
                val i_27_ = OpenGlRenderer.anInt6633
                if (i > 106) {
                    if (FrameStatsReset.anInt5799 != i_27_) {
                        val i_28_ = i_27_ - FrameStatsReset.anInt5799
                        var i_29_ = (i_28_.toLong() * l / 320L).toInt()
                        if (i_28_ <= 0) {
                            if (i_29_ != 0) {
                                if (i_29_ < i_28_) i_29_ = i_28_
                            } else i_29_ = -1
                        } else if (i_29_ == 0) i_29_ = 1
                        else if (i_28_ < i_29_) i_29_ = i_28_
                        FrameStatsReset.anInt5799 += i_29_
                    }
                    val i_30_ = RegionTileNode.anInt6652
                    SceneObjectSpawner.Companion.aFloat1287 += MultiFieldRecord.aFloat6898 * l.toFloat() / 40.0f * 8.0f
                    CameraDistanceOptionState.aFloat3938 += CircleDrawer.aFloat2687 * l.toFloat() / 40.0f * 8.0f
                    if (AsyncTaskHandle.anInt2578 != i_30_) {
                        val i_31_ = -AsyncTaskHandle.anInt2578 + i_30_
                        var i_32_ = (l * i_31_.toLong() / 320L).toInt()
                        if (i_31_ <= 0) {
                            if (i_32_ == 0) i_32_ = -1
                            else if (i_32_ < i_31_) i_32_ = i_31_
                        } else if (i_32_ != 0) {
                            if (i_31_ < i_32_) i_32_ = i_31_
                        } else i_32_ = 1
                        AsyncTaskHandle.anInt2578 += i_32_
                    }
                    method1725(262144)
                }
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, "lba.A(" + i + ',' + l + ')')
            }
        }

        var anInt6873: Int = 0
        fun method2992(string: String?, i: Byte): ByteArray {
            try {
                anInt6873++
                val i_34_ = string!!.length
                val `is` = ByteArray(i_34_)
                for (i_35_ in 0..<i_34_) {
                    val i_36_ = string.get(i_35_).code
                    if (i_36_ > 0 && i_36_ < 128 || i_36_ >= 160 && i_36_ <= 255) `is`[i_35_] = i_36_.toByte()
                    else if (i_36_ != 8364) {
                        if (i_36_ != 8218) {
                            if (i_36_ != 402) {
                                if (i_36_ == 8222) `is`[i_35_] = (-124).toByte()
                                else if (i_36_ == 8230) `is`[i_35_] = (-123).toByte()
                                else if (i_36_ != 8224) {
                                    if (i_36_ != 8225) {
                                        if (i_36_ == 710) `is`[i_35_] = (-120).toByte()
                                        else if (i_36_ == 8240) `is`[i_35_] = (-119).toByte()
                                        else if (i_36_ == 352) `is`[i_35_] = (-118).toByte()
                                        else if (i_36_ != 8249) {
                                            if (i_36_ != 338) {
                                                if (i_36_ != 381) {
                                                    if (i_36_ == 8216) `is`[i_35_] = (-111).toByte()
                                                    else if (i_36_ == 8217) `is`[i_35_] = (-110).toByte()
                                                    else if (i_36_ != 8220) {
                                                        if (i_36_ != 8221) {
                                                            if (i_36_ == 8226) `is`[i_35_] = (-107).toByte()
                                                            else if (i_36_ == 8211) `is`[i_35_] = (-106).toByte()
                                                            else if (i_36_ != 8212) {
                                                                if (i_36_ != 732) {
                                                                    if (i_36_ != 8482) {
                                                                        if (i_36_ == 353) `is`[i_35_] = (-102).toByte()
                                                                        else if (i_36_ == 8250) `is`[i_35_] = (-101).toByte()
                                                                        else if (i_36_ != 339) {
                                                                            if (i_36_ == 382) `is`[i_35_] = (-98).toByte()
                                                                            else if (i_36_ != 376) `is`[i_35_] = 63.toByte()
                                                                            else `is`[i_35_] = (-97).toByte()
                                                                        } else `is`[i_35_] = (-100).toByte()
                                                                    } else `is`[i_35_] = (-103).toByte()
                                                                } else `is`[i_35_] = (-104).toByte()
                                                            } else `is`[i_35_] = (-105).toByte()
                                                        } else `is`[i_35_] = (-108).toByte()
                                                    } else `is`[i_35_] = (-109).toByte()
                                                } else `is`[i_35_] = (-114).toByte()
                                            } else `is`[i_35_] = (-116).toByte()
                                        } else `is`[i_35_] = (-117).toByte()
                                    } else `is`[i_35_] = (-121).toByte()
                                } else `is`[i_35_] = (-122).toByte()
                            } else `is`[i_35_] = (-125).toByte()
                        } else `is`[i_35_] = (-126).toByte()
                    } else `is`[i_35_] = (-128).toByte()
                }
                return `is`
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("ls.B(" + (if (string != null) "{...}" else "null") + ',' + i + ')'))
            }
        }



        var anInt837: Int = 0
        @JvmStatic
        fun method427(i: Int) {
            anInt837++
            RenderConfigFactoryStatics.aLocDefinitionCache_2979!!.method2033(46.toByte())
            Tooltip.aParticleDefLoader_4460!!.method1377(2)
            RadialTextureNode.aModelDefinitionLoader_9342!!.method1204(0)
            GradientLookupEffect.aSeqDefinitionCache_9195!!.method2006(88)
            MapAreaDefinition.aBufferedMessageQueue_2529!!.method2080(127)
            ClientExceptionStatics.aModelHeaderCache_112!!.method1938(126)
            ParticleEmitterNode.aWidgetCache_191!!.method838(7)
            ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2542(-101)
            RenderConfigFactoryStatics.aVarbitDefLoader_2981!!.method1443(83)
            NormalMapGenerator.aParticleAmountCache_3453!!.method1590(0)
            OpenGlModel.aNpcDefinitionCache_5558!!.method1986((-91).toByte())
            ModelOrSpriteHolder.aTextureDefinitionLoader_117!!.method1174((-99).toByte())
            TheoraVideoStream.aConfigDefinitionLoader_9031!!.method1222(true)
            TheoraVideoStream.aLocTypeDefLoader_9036!!.method1410(-27995)
            ProjectionCameraTransform.aEmoteDefCache_5764!!.method2602(0)
            Client.aMapSceneCache_413!!.method816(false)
            HoverActionEntry.aSpriteStore_1813!!.method302(-797644856)
            AbstractTileShapeStatics.aMapSceneDefLoader_6559!!.method1390(23)
            CacheArchiveIndexLoader.aItemDefinitionLoader_3147!!.method1283(1)
            SpriteLoadValidator.aWorldMapImageBuilder_4787!!.method694(-1007)
            FileExistsCondition.aModelDefinitionCache_4782!!.method1598(111)
            CalendarUtil.method2638(-4631)
            NpcCountAccessor.method1328(-26162)
            method3102(22385)
            MapSceneRenderer.method386((-106).toByte())
            AudioResampler.method1271(0)
            TextureMipDescriptor.aLruByteCache_4346!!.method587(-108)
            MaterialTypeMarker.aLruByteCache_6517!!.method587(-109)
            TerrainTileShape.aLruByteCache_8807!!.method587(-113)
            SkeletalAnimFrameLoader.aLruByteCache_463!!.method587(-83)
            ChatCommandProcessor.aLruByteCache_1174!!.method587(-91)
            val i_17_ = 54 / ((26 - i) / 53)
        }
    }
}
