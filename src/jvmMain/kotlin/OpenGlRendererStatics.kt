import TextureLoadExceptionStatics.method4009
import jaclib.memory.Buffer
import jaclib.memory.Stream
import jaclib.memory.heap.NativeHeap
import jaggl.OpenGL
import jaggl.OpenGLStatics.glActiveTexture
import jaggl.OpenGLStatics.glAlphaFunc
import jaggl.OpenGLStatics.glBegin
import jaggl.OpenGLStatics.glBindBufferARB
import jaggl.OpenGLStatics.glBindTexture
import jaggl.OpenGLStatics.glBlendFunc
import jaggl.OpenGLStatics.glClear
import jaggl.OpenGLStatics.glClearColor
import jaggl.OpenGLStatics.glClearDepth
import jaggl.OpenGLStatics.glColor4ub
import jaggl.OpenGLStatics.glColorMask
import jaggl.OpenGLStatics.glColorMaterial
import jaggl.OpenGLStatics.glColorPointer
import jaggl.OpenGLStatics.glCopyPixels
import jaggl.OpenGLStatics.glCullFace
import jaggl.OpenGLStatics.glDeleteBuffersARB
import jaggl.OpenGLStatics.glDeleteFramebuffersEXT
import jaggl.OpenGLStatics.glDeleteLists
import jaggl.OpenGLStatics.glDeleteObjectARB
import jaggl.OpenGLStatics.glDeleteProgramARB
import jaggl.OpenGLStatics.glDeleteRenderbuffersEXT
import jaggl.OpenGLStatics.glDeleteTextures
import jaggl.OpenGLStatics.glDepthFunc
import jaggl.OpenGLStatics.glDepthMask
import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glDisableClientState
import jaggl.OpenGLStatics.glDrawArrays
import jaggl.OpenGLStatics.glDrawBuffer
import jaggl.OpenGLStatics.glDrawElements
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glEnableClientState
import jaggl.OpenGLStatics.glEnd
import jaggl.OpenGLStatics.glFinish
import jaggl.OpenGLStatics.glFlush
import jaggl.OpenGLStatics.glFogf
import jaggl.OpenGLStatics.glFogfv
import jaggl.OpenGLStatics.glFogi
import jaggl.OpenGLStatics.glGenBuffersARB
import jaggl.OpenGLStatics.glGetFloatv
import jaggl.OpenGLStatics.glGetIntegerv
import jaggl.OpenGLStatics.glGetString
import jaggl.OpenGLStatics.glHint
import jaggl.OpenGLStatics.glLightModelfv
import jaggl.OpenGLStatics.glLightf
import jaggl.OpenGLStatics.glLightfv
import jaggl.OpenGLStatics.glLineWidth
import jaggl.OpenGLStatics.glLoadIdentity
import jaggl.OpenGLStatics.glLoadMatrixf
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glMultMatrixf
import jaggl.OpenGLStatics.glNormalPointer
import jaggl.OpenGLStatics.glOrtho
import jaggl.OpenGLStatics.glPointSize
import jaggl.OpenGLStatics.glPolygonMode
import jaggl.OpenGLStatics.glPopMatrix
import jaggl.OpenGLStatics.glPushMatrix
import jaggl.OpenGLStatics.glRasterPos2i
import jaggl.OpenGLStatics.glReadBuffer
import jaggl.OpenGLStatics.glReadPixelsi
import jaggl.OpenGLStatics.glScissor
import jaggl.OpenGLStatics.glShadeModel
import jaggl.OpenGLStatics.glTexCoord2f
import jaggl.OpenGLStatics.glTexCoordPointer
import jaggl.OpenGLStatics.glTexEnvfv
import jaggl.OpenGLStatics.glTexEnvi
import jaggl.OpenGLStatics.glTranslatef
import jaggl.OpenGLStatics.glVertex2f
import jaggl.OpenGLStatics.glVertex2i
import jaggl.OpenGLStatics.glVertex3f
import jaggl.OpenGLStatics.glVertexPointer
import jaggl.OpenGLStatics.glViewport
import java.awt.Canvas
import java.awt.Rectangle
import java.util.Hashtable
import java.util.Locale
import kotlin.math.max
import kotlin.math.sqrt

object OpenGlRendererStatics {
    @JvmField
            var anInt7514: Int = 0
            @JvmField
            var anInt7515: Int = 0
            @JvmField
            var anInt7516: Int = 0
            @JvmField
            var anInt7517: Int = 0
            @JvmField
            var anInt7518: Int = 0
            @JvmField
            var anInt7519: Int = 0
            @JvmField
            var anInt7520: Int = 0
            @JvmField
            var anInt7521: Int = 0
            @JvmField
            var anInt7522: Int = 0
            @JvmField
            var anInt7524: Int = 0
            @JvmField
            var anInt7525: Int = 0
            @JvmField
            var anInt7526: Int = 0
            @JvmField
            var anInt7527: Int = 0
            @JvmField
            var anInt7528: Int = 0
            @JvmField
            var anInt7529: Int = 0
            @JvmField
            var anInt7530: Int = 0
            @JvmField
            var anInt7531: Int = 0
            @JvmField
            var anInt7532: Int = 0
            @JvmField
            var anInt7533: Int = 0
            @JvmField
            var anInt7534: Int = 0
            @JvmField
            var anInt7535: Int = 0
            @JvmField
            var anInt7536: Int = 0
            @JvmField
            var anInt7537: Int = 0
            @JvmField
            var anInt7538: Int = 0
            @JvmField
            var anInt7539: Int = 0
            @JvmField
            var anInt7540: Int = 0
            @JvmField
            var anInt7541: Int = 0
            @JvmField
            var anInt7542: Int = 0
            @JvmField
            var anInt7543: Int = 0
            @JvmField
            var anInt7544: Int = 0
            @JvmField
            var anInt7545: Int = 0
            @JvmField
            var anInt7546: Int = 0
            @JvmField
            var anInt7547: Int = 0
            @JvmField
            var anInt7548: Int = 0
            @JvmField
            var anInt7549: Int = 0
            @JvmField
            var anInt7550: Int = 0
            @JvmField
            var anInt7551: Int = 0
            @JvmField
            var anInt7552: Int = 0
            @JvmField
            var aFontMetaRef_7554: FontMetaRef? = FontMetaRef(52, 4)
            @JvmField
            var anInt7555: Int = 0
            @JvmField
            var anInt7556: Int = 0
            @JvmField
            var anInt7557: Int = 0
            @JvmField
            var anInt7558: Int = 0
            @JvmField
            var anInt7559: Int = 0
            @JvmField
            var anInt7560: Int = 0
            @JvmField
            var anInt7561: Int = 0
            @JvmField
            var anInt7562: Int = 0
            @JvmField
            var anInt7563: Int = 0
            @JvmField
            var anInt7564: Int = 0
            @JvmField
            var anInt7565: Int = 0
            @JvmField
            var anInt7566: Int = 0
            @JvmField
            var anInt7567: Int = 0
            @JvmField
            var anInt7568: Int = 0
            @JvmField
            var anInt7569: Int = 0
            @JvmField
            var anInt7570: Int = 0
            @JvmField
            var anInt7571: Int = 0
            @JvmField
            var anInt7572: Int = 0
            @JvmField
            var anInt7573: Int = 0
            @JvmField
            var anInt7574: Int = 0
            @JvmField
            var anInt7576: Int = 0
            @JvmField
            var anInt7578: Int = 0
            @JvmField
            var anInt7579: Int = 0
            @JvmField
            var anInt7580: Int = 0
            @JvmField
            var anInt7581: Int = 0
            @JvmField
            var anInt7582: Int = 0
            @JvmField
            var anInt7583: Int = 0
            @JvmField
            var anInt7584: Int = 0
            @JvmField
            var anInt7585: Int = 0
            @JvmField
            var anInt7586: Int = 0
            @JvmField
            var anInt7587: Int = 0
            @JvmField
            var anInt7588: Int = 0
            @JvmField
            var anInt7589: Int = 0
            @JvmField
            var anInt7590: Int = 0
            @JvmField
            var anInt7591: Int = 0
            @JvmField
            var anInt7592: Int = 0
            @JvmField
            var anInt7593: Int = 0
            @JvmField
            var anInt7594: Int = 0
            @JvmField
            var anInt7595: Int = 0
            @JvmField
            var anInt7596: Int = 0
            @JvmField
            var anInt7597: Int = 0
            @JvmField
            var anInt7598: Int = 0
            @JvmField
            var anInt7599: Int = 0
            @JvmField
            var anInt7600: Int = 0
            @JvmField
            var anInt7601: Int = 0
            @JvmField
            var anInt7602: Int = 0
            @JvmField
            var anInt7603: Int = 0
            @JvmField
            var anInt7604: Int = 0
            @JvmField
            var anInt7605: Int = 0
            @JvmField
            var anInt7606: Int = 0
            @JvmField
            var anInt7607: Int = 0
            @JvmField
            var anInt7608: Int = 0
            @JvmField
            var anInt7609: Int = 0
            @JvmField
            var anInt7610: Int = 0
            @JvmField
            var anInt7611: Int = 0
            @JvmField
            var anInt7612: Int = 0
            @JvmField
            var anInt7613: Int = 0
            @JvmField
            var anInt7614: Int = 0
            @JvmField
            var anInt7615: Int = 0
            @JvmField
            var anInt7616: Int = 0
            @JvmField
            var anInt7617: Int = 0
            @JvmField
            var anInt7618: Int = 0
            @JvmField
            var anInt7619: Int = 0
            @JvmField
            var anInt7620: Int = 0
            @JvmField
            var anInt7621: Int = 0
            @JvmField
            var anInt7622: Int = 0
            @JvmField
            var anInt7623: Int = 0
            @JvmField
            var anInt7624: Int = 0
            @JvmField
            var anInt7625: Int = 0
            @JvmField
            var anInt7627: Int = 0
            @JvmField
            var anInt7628: Int = 0
            @JvmField
            var anInt7629: Int = 0
            @JvmField
            var anInt7630: Int = 0
            @JvmField
            var anInt7631: Int = 0
            @JvmField
            var anInt7632: Int = 0
            @JvmField
            var anInt7633: Int = 0
            @JvmField
            var anInt7634: Int = 0
            @JvmField
            var anInt7635: Int = 0
            @JvmField
            var anInt7637: Int = 0
            @JvmField
            var anInt7638: Int = 0
            @JvmField
            var anInt7639: Int = 0
            @JvmField
            var anInt7640: Int = 0
            @JvmField
            var anInt7642: Int = 0
            @JvmField
            var anInt7643: Int = 0
            @JvmField
            var anInt7644: Int = 0
            @JvmField
            var anInt7646: Int = 0
            @JvmField
            var anInt7647: Int = 0
            @JvmField
            var anInt7648: Int = 0
            @JvmField
            var anInt7649: Int = 0
            @JvmField
            var anInt7650: Int = 0
            @JvmField
            var anInt7651: Int = 0
            @JvmField
            var anInt7652: Int = 0
            @JvmField
            var anInt7653: Int = 0
            @JvmField
            var anInt7654: Int = 0
            @JvmField
            var anInt7655: Int = 0
            @JvmField
            var anInt7656: Int = 0
            @JvmField
            var anInt7657: Int = 0
            @JvmField
            var anInt7658: Int = 0
            @JvmField
            var anInt7659: Int = 0
            @JvmField
            var anInt7660: Int = 0
            @JvmField
            var anInt7661: Int = 0
            @JvmField
            var anInt7662: Int = 0
            @JvmField
            var anInt7663: Int = 0
            @JvmField
            var anInt7665: Int = 0
            @JvmField
            var anInt7666: Int = 503
            @JvmField
            var anInt7667: Int = 0
            @JvmField
            var anInt7668: Int = 0
            @JvmField
            var anInt7669: Int = 0
            @JvmField
            var anInt7670: Int = 0
            @JvmField
            var anInt7671: Int = 0
            @JvmField
            var anInt7672: Int = 0
            @JvmField
            var anInt7673: Int = 0
            @JvmField
            var anInt7674: Int = 0
            @JvmField
            var anInt7675: Int = 0
            @JvmField
            var anInt7676: Int = 0
            @JvmField
            var anInt7677: Int = 0
            @JvmField
            var anInt7678: Int = 0
            @JvmField
            var anInt7679: Int = 0
            @JvmField
            var anInt7680: Int = 0
            @JvmField
            var anInt7681: Int = 0
            @JvmField
            var anInt7682: Int = 0
            @JvmField
            var anInt7683: Int = 0
            @JvmField
            var anInt7684: Int = 0
            @JvmField
            var anInt7685: Int = 0
            @JvmField
            var anInt7686: Int = 0
            @JvmField
            var anInt7687: Int = 0
            @JvmField
            var anInt7689: Int = 0
            @JvmField
            var anInt7690: Int = 0
            @JvmField
            var anInt7691: Int = 0
            @JvmField
            var anInt7692: Int = 0
            @JvmField
            var anInt7693: Int = 0
            @JvmField
            var anInt7694: Int = 0
            @JvmField
            var anInt7695: Int = 0
            @JvmField
            var anInt7696: Int = 0
            @JvmField
            var anInt7697: Int = 0
            @JvmField
            var anInt7698: Int = 0
            @JvmField
            var anInt7699: Int = 0
            @JvmField
            var anInt7700: Int = 0
            @JvmField
            var anInt7701: Int = 0
            @JvmField
            var anInt7702: Int = 0
            @JvmField
            var anInt7703: Int = 0
            @JvmField
            var anInt7704: Int = 0
            @JvmField
            var anInt7705: Int = 0
            @JvmField
            var anInt7706: Int = 0
            @JvmField
            var anInt7708: Int = 0
            @JvmField
            var anInt7709: Int = 0
            @JvmField
            var anInt7710: Int = 0
            @JvmField
            var anInt7714: Int = 0
            @JvmField
            var aFontMetaRef_7715: FontMetaRef? = FontMetaRef(58, 4)
            @JvmField
            var anInt7716: Int = 0
            @JvmField
            var anInt7717: Int = 0
            @JvmField
            var anInt7718: Int = 0
            @JvmField
            var anInt7719: Int = 0
            @JvmField
            var anInt7722: Int = 0
            @JvmField
            var anInt7724: Int = 0
            @JvmField
            var anInt7726: Int = 0
            @JvmField
            var anInt7727: Int = 0
            @JvmField
            var anInt7728: Int = 0
            @JvmStatic
            fun method3736(i: Byte) {
                aFontMetaRef_7554 = null
                aFontMetaRef_7715 = null
                if (i < 27) aFontMetaRef_7715 = null
            }
    
            @JvmStatic
            fun method3743(i: Byte, class348_sub42_sub12: ContactEntry?) {
                do {
                    try {
                        anInt7686++
                        if (i.toInt() != 6) aFontMetaRef_7715 = null
                        if (class348_sub42_sub12 != null) {
                            SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1999(class348_sub42_sub12, -20180)
                            FileExistsConditionStatics.anInt4776++
                            val `object`: Any? = null
                            var class348_sub42_sub13: ContactList?
                            if ((class348_sub42_sub12.aBoolean9611) || "" == class348_sub42_sub12.aString9601) {
                                class348_sub42_sub13 = ContactList(class348_sub42_sub12.aString9601)
                                NpcAnimationResolverStatics.anInt166++
                            } else {
                                val l = (class348_sub42_sub12.aLong9600)
                                class348_sub42_sub13 = (ContactEntryStatics.aHashtable_9603!!.method3480(l, -6008) as? ContactList?)
                                while (class348_sub42_sub13 != null) {
                                    if (class348_sub42_sub13.aString9617 == class348_sub42_sub12.aString9601) break
                                    class348_sub42_sub13 = (ContactEntryStatics.aHashtable_9603!!.method3476(true) as? ContactList?)
                                }
                                if (class348_sub42_sub13 == null) {
                                    class348_sub42_sub13 = (KeyboardLayoutCacheStatics.aLruByteCache_3301!!.method583(l, i.toInt() xor 0x3a) as? ContactList?)
                                    if (class348_sub42_sub13 != null && !(class348_sub42_sub13.aString9617 == class348_sub42_sub12.aString9601)) class348_sub42_sub13 = null
                                    if (class348_sub42_sub13 == null) class348_sub42_sub13 = (ContactList(class348_sub42_sub12.aString9601))
                                    ContactEntryStatics.aHashtable_9603!!.method3483(71.toByte(), l, class348_sub42_sub13)
                                    NpcAnimationResolverStatics.anInt166++
                                }
                            }
                            if (!class348_sub42_sub13.method3233(class348_sub42_sub12, -21)) break
                            ManagedGlResourceStatics.method1868((-39).toByte(), class348_sub42_sub13)
                        }
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(runtimeexception, ("qo.VC(" + i + ',' + (if (class348_sub42_sub12 != null) "{...}" else "null") + ')'))
                    }
                    break
                } while (false)
            }
    
            @JvmStatic
            fun method3802(i: Int, i_315_: Int, i_316_: Int, i_317_: Int, i_318_: Int, i_319_: Int, i_320_: Int) {
                anInt7572++
                val i_321_ = ShaderStateStatics.anInt6513
                SceneNodeDequeStatics.anInt1497 = 0
                val `is` = ScrollTexMaterialPassStatics.anIntArray6290!!
                var i_322_ = 0
                while ((i_322_ < ModelDefinitionLoaderStatics.anInt2057 + i_321_)) {
                    var npcType: NpcType? = null
                    val class318_sub1_sub3_sub3: ProjectedGroundDecor
                    if (i_321_ > i_322_) class318_sub1_sub3_sub3 = (LoadingBarRendererStatics.aPlayerArray5058!![`is`[i_322_]]!!)
                    else {
                        class318_sub1_sub3_sub3 = ((NpcEntityUpdater.aHashtable_3654!!.method3480(RgbColorPaletteStatics.anIntArray1233!![i_322_ + -i_321_].toLong(), i_316_ xor 0x1775.inv()) as NpcReference).aNpc_6859!!)
                        npcType = class318_sub1_sub3_sub3.aNpcType_10505!!
                        if (npcType.anIntArray1377 != null) {
                            npcType = npcType.method794((ProjectedGroundDecorStatics.aVarpStore_10209!!), i_316_ + -3)
                            if (npcType == null) {
                                i_322_++
                                continue
                            }
                        }
                    }
                    if ((class318_sub1_sub3_sub3.anInt10285 >= 0) && (((class318_sub1_sub3_sub3.anInt10301) == TextureQualityOptionStateStatics.anInt6006) || ((LocalPlayerState.aPlayer_1907!!.plane) == class318_sub1_sub3_sub3.plane))) {
                        ModelKeyBuilderStatics.method2801(class318_sub1_sub3_sub3.method2426(200), i_318_ shr 1, i_320_, i_319_, i_315_ shr 1, class318_sub1_sub3_sub3, 100.toByte())
                        if (RemoveRoofsOptionStateStatics.anIntArray6062!![0] >= 0) {
                            if ((class318_sub1_sub3_sub3.aString10292) != null && (i_321_ <= i_322_ || ShaderProgramStatics.anInt7276 == 0 || ShaderProgramStatics.anInt7276 == 3 || (ShaderProgramStatics.anInt7276 == 1 && (KeyEventNodeStatics.method2797((class318_sub1_sub3_sub3 as Player).aString10544, (-63).toByte())))) && SceneNodeDequeStatics.anInt1497 < ConfigVarProgressStatics.anInt4814) {
                                ConfigVarProgressStatics.anIntArray4819!![SceneNodeDequeStatics.anInt1497] = ((WorldMapLabelStatics.aFontDefinition_4962!!.method1183(true, class318_sub1_sub3_sub3.aString10292)) / 2)
                                ConfigVarProgressStatics.anIntArray4822!![SceneNodeDequeStatics.anInt1497] = RemoveRoofsOptionStateStatics.anIntArray6062!![0]
                                ConfigVarProgressStatics.anIntArray4813!![SceneNodeDequeStatics.anInt1497] = RemoveRoofsOptionStateStatics.anIntArray6062!![1]
                                ConfigVarProgressStatics.anIntArray4817!![SceneNodeDequeStatics.anInt1497] = class318_sub1_sub3_sub3.anInt10201
                                ConfigVarProgressStatics.anIntArray4806!![SceneNodeDequeStatics.anInt1497] = class318_sub1_sub3_sub3.anInt10234
                                ConfigVarProgressStatics.anIntArray4812!![SceneNodeDequeStatics.anInt1497] = class318_sub1_sub3_sub3.anInt10264
                                ConfigVarProgressStatics.aStringArray4818!![SceneNodeDequeStatics.anInt1497] = class318_sub1_sub3_sub3.aString10292
                                SceneNodeDequeStatics.anInt1497++
                            }
                            var i_323_ = RemoveRoofsOptionStateStatics.anIntArray6062!![1] + i
                            if (!(class318_sub1_sub3_sub3.aBoolean10309) && (GlGroundShaderPassStatics.anInt7396 < class318_sub1_sub3_sub3.anInt10223)) {
                                var i_324_ = -1
                                var i_325_ = 1
                                if (i_321_ <= i_322_) {
                                    i_324_ = npcType!!.anInt1373
                                    if (i_324_ == -1) i_324_ = (class318_sub1_sub3_sub3.method2422(72.toByte()).anInt2909)
                                } else {
                                    val player = (LoadingBarRendererStatics.aPlayerArray5058!![`is`[i_322_]]!!)
                                    i_324_ = (class318_sub1_sub3_sub3.method2422(72.toByte()).anInt2909)
                                    if (player.aBoolean10554) i_325_ = 2
                                }
                                var class105s = TimedRecordAccessorStatics.aAbstractModelRendererArray7107
                                if (i_324_ != -1) {
                                    var abstractModelRendererS_326_ = ((TextureMipDescriptorStatics.aLruByteCache_4346!!.method583(i_324_.toLong(), i_316_ xor 0x79.inv())) as? Array<AbstractModelRenderer?>?)
                                    if (abstractModelRendererS_326_ == null) {
                                        val spriteImages = SpriteImageStatics.method1519(CameraRotationStubStatics.aJs5Archive_322!!, i_324_, 0)
                                        if (spriteImages != null) {
                                            abstractModelRendererS_326_ = arrayOfNulls<AbstractModelRenderer>(spriteImages.size)
                                            var i_327_ = 0
                                            while (spriteImages.size > i_327_) {
                                                abstractModelRendererS_326_[i_327_] = (FacingDirectionNodeStatics.aRenderer6654!!.method3691(spriteImages[i_327_], true))
                                                i_327_++
                                            }
                                            TextureMipDescriptorStatics.aLruByteCache_4346!!.method582(abstractModelRendererS_326_, i_324_.toLong(), (-94).toByte())
                                        }
                                    }
                                    if (abstractModelRendererS_326_ != null && abstractModelRendererS_326_.size >= 2) class105s = abstractModelRendererS_326_
                                }
                                if (class105s!!.size <= i_325_) i_325_ = 1
                                val class105 = class105s[0]!!
                                val class105_328_ = class105s[i_325_]!!
                                i_323_ -= max((WorldMapLabelStatics.aFontDefinition_4962!!.anInt1988), class105.method969())
                                val i_329_ = (RemoveRoofsOptionStateStatics.anIntArray6062!![0] + (i_317_ + -(class105.method971() shr 1)))
                                var i_330_ = (class105.method971() * class318_sub1_sub3_sub3.anInt10295 / 255)
                                val i_331_ = class105.method969()
                                if (class318_sub1_sub3_sub3.anInt10295 > 0 && i_330_ < 2) i_330_ = 2
                                class105.method974(i_329_, i_323_)
                                FacingDirectionNodeStatics.aRenderer6654!!.T(i_329_, i_323_, i_330_ + i_329_, i_331_ + i_323_)
                                class105_328_.method974(i_329_, i_323_)
                                FacingDirectionNodeStatics.aRenderer6654!!.KA(i_317_, i, i_317_ - -i_318_, i_315_ + i)
                                MapTileShapeStatics.method2663(-5590, i_329_, i_329_ + class105.method966(), i_323_, i_323_ + i_331_)
                            } else i_323_ -= max((WorldMapLabelStatics.aFontDefinition_4962!!.anInt1988), TimedRecordAccessorStatics.aAbstractModelRendererArray7107!![0]!!.method969())
                            i_323_ -= 2
                            if (!class318_sub1_sub3_sub3.aBoolean10309) {
                                if (class318_sub1_sub3_sub3.anInt10287 > GlGroundShaderPassStatics.anInt7396) {
                                    var class105 = (CameraDistanceOptionStateStatics.aAbstractModelRendererArray5857!![(if (class318_sub1_sub3_sub3.aBoolean10226) 2 else 0)]!!)
                                    var class105_332_ = (CameraDistanceOptionStateStatics.aAbstractModelRendererArray5857!![(if (!class318_sub1_sub3_sub3.aBoolean10226) 1 else 3)]!!)
                                    var i_333_ = -1
                                    if (class318_sub1_sub3_sub3 is Npc) {
                                        i_333_ = npcType!!.anInt1382
                                        if (i_333_ == -1) i_333_ = (class318_sub1_sub3_sub3.method2422(72.toByte()).anInt2923)
                                    } else i_333_ = (class318_sub1_sub3_sub3.method2422(72.toByte()).anInt2923)
                                    if (i_333_ != -1) {
                                        var abstractModelRenderers = (MaterialTypeMarkerStatics.aLruByteCache_6517!!.method583(i_333_.toLong(), -45) as? Array<AbstractModelRenderer?>)
                                        if (abstractModelRenderers == null) {
                                            val spriteImages = SpriteImageStatics.method1519((CameraRotationStubStatics.aJs5Archive_322!!), i_333_, 0)
                                            if (spriteImages != null) {
                                                abstractModelRenderers = arrayOfNulls<AbstractModelRenderer>(spriteImages.size)
                                                var i_334_ = 0
                                                while ((spriteImages.size > i_334_)) {
                                                    abstractModelRenderers[i_334_] = (FacingDirectionNodeStatics.aRenderer6654!!.method3691(spriteImages[i_334_], true))
                                                    i_334_++
                                                }
                                                MaterialTypeMarkerStatics.aLruByteCache_6517!!.method582(abstractModelRenderers, i_333_.toLong(), (-101).toByte())
                                            }
                                        }
                                        if (abstractModelRenderers != null && abstractModelRenderers.size == 4) {
                                            class105_332_ = (abstractModelRenderers[if (!(class318_sub1_sub3_sub3.aBoolean10226)) 1 else 3]!!)
                                            class105 = (abstractModelRenderers[if (!(class318_sub1_sub3_sub3.aBoolean10226)) 0 else 2]!!)
                                        }
                                    }
                                    var i_335_ = (-GlGroundShaderPassStatics.anInt7396 + class318_sub1_sub3_sub3.anInt10287)
                                    val i_336_: Int
                                    if (i_335_ > class318_sub1_sub3_sub3.anInt10227) {
                                        i_335_ -= class318_sub1_sub3_sub3.anInt10227
                                        val i_337_ = (if (class318_sub1_sub3_sub3.anInt10271 != 0) (class318_sub1_sub3_sub3.anInt10271 * (((class318_sub1_sub3_sub3.anInt10210) - i_335_) / (class318_sub1_sub3_sub3.anInt10271))) else 0)
                                        i_336_ = (class105.method971() * i_337_ / class318_sub1_sub3_sub3.anInt10210)
                                    } else i_336_ = class105.method971()
                                    val i_338_ = class105.method969()
                                    i_323_ -= i_338_
                                    val i_339_ = (RemoveRoofsOptionStateStatics.anIntArray6062!![0] + (i_317_ + -(class105.method971() shr 1)))
                                    class105.method974(i_339_, i_323_)
                                    FacingDirectionNodeStatics.aRenderer6654!!.T(i_339_, i_323_, i_339_ - -i_336_, i_323_ - -i_338_)
                                    class105_332_.method974(i_339_, i_323_)
                                    FacingDirectionNodeStatics.aRenderer6654!!.KA(i_317_, i, i_318_ + i_317_, i - -i_315_)
                                    MapTileShapeStatics.method2663(-5590, i_339_, class105.method966() + i_339_, i_323_, i_338_ + i_323_)
                                    i_323_ -= 2
                                }
                                if (i_322_ < i_321_) {
                                    val player = (class318_sub1_sub3_sub3 as Player)
                                    if (player.anInt10540 != -1) {
                                        i_323_ -= 25
                                        val class105 = (WallSceneEntityStatics.aAbstractModelRendererArray9959!![(player.anInt10540)])!!
                                        class105.method974((-12 + i_317_ + (RemoveRoofsOptionStateStatics.anIntArray6062!![0])), i_323_)
                                        MapTileShapeStatics.method2663(-5590, i_317_ + (RemoveRoofsOptionStateStatics.anIntArray6062!![0] + -12), (i_317_ - -RemoveRoofsOptionStateStatics.anIntArray6062!![0] + (-12 + class105.method966())), i_323_, i_323_ + class105.method980())
                                        i_323_ -= 2
                                    }
                                    if (player.anInt10522 != -1) {
                                        i_323_ -= 25
                                        val class105 = (CompassSmootherStatics.aAbstractModelRendererArray3378!![(player.anInt10522)])!!
                                        class105.method974((-12 + i_317_ + (RemoveRoofsOptionStateStatics.anIntArray6062!![0])), i_323_)
                                        MapTileShapeStatics.method2663(-5590, (-12 + RemoveRoofsOptionStateStatics.anIntArray6062!![0] + i_317_), (RemoveRoofsOptionStateStatics.anIntArray6062!![0] + i_317_ - (12 + -class105.method966())), i_323_, i_323_ - -class105.method980())
                                        i_323_ -= 2
                                    }
                                } else if (npcType!!.anInt1375 >= 0 && (npcType.anInt1375 < CompassSmootherStatics.aAbstractModelRendererArray3378!!.size)) {
                                    val class105 = (CompassSmootherStatics.aAbstractModelRendererArray3378!![npcType.anInt1375])!!
                                    i_323_ -= 25
                                    class105.method974((i_317_ + (RemoveRoofsOptionStateStatics.anIntArray6062!![0]) + -(class105.method971() shr 1)), i_323_)
                                    MapTileShapeStatics.method2663(-5590, (RemoveRoofsOptionStateStatics.anIntArray6062!![0] + (i_317_ - (class105.method971() shr 1))), (RemoveRoofsOptionStateStatics.anIntArray6062!![0] + (i_317_ - (class105.method971() shr 1)) + class105.method966()), i_323_, class105.method980() + i_323_)
                                    i_323_ -= 2
                                }
                            }
                            if (class318_sub1_sub3_sub3 is Player) {
                                if (i_322_ >= 0) {
                                    var i_340_ = 0
                                    val class302s = MultiFieldRecordStatics.aMinimapPositionStateArray6897s!!
                                    var i_341_ = 0
                                    while ((i_341_ < class302s.size)) {
                                        val class302 = class302s[i_341_]
                                        if (class302 != null && class302.anInt3840 == 10 && (`is`[i_322_] == class302.anInt3833)) {
                                            val class105 = (CustomCursorsOptionStateStatics.aAbstractModelRendererArray5933!![class302.anInt3831])!!
                                            if (i_340_ < class105.method969()) i_340_ = class105.method969()
                                            class105.method974(-12 + ((RemoveRoofsOptionStateStatics.anIntArray6062!![0]) + i_317_), (i_323_ + -class105.method969()))
                                            MapTileShapeStatics.method2663(-5590, -12 + (i_317_ - -(RemoveRoofsOptionStateStatics.anIntArray6062!![0])), (i_317_ + (RemoveRoofsOptionStateStatics.anIntArray6062!![0] + -12 - -class105.method966())), -class105.method969() + i_323_, (i_323_ + -class105.method969() - -class105.method980()))
                                        }
                                        i_341_++
                                    }
                                    if (i_340_ > 0) i_323_ -= 2 + i_340_
                                }
                            } else {
                                var i_342_ = 0
                                val class302s = MultiFieldRecordStatics.aMinimapPositionStateArray6897s!!
                                var i_343_ = 0
                                while (class302s.size > i_343_) {
                                    val class302 = class302s[i_343_]
                                    if (class302 != null && class302.anInt3840 == 1 && (class302.anInt3833 == RgbColorPaletteStatics.anIntArray1233!![i_322_ - i_321_])) {
                                        val class105 = (CustomCursorsOptionStateStatics.aAbstractModelRendererArray5933!![class302.anInt3831])!!
                                        if (class105.method969() > i_342_) i_342_ = class105.method969()
                                        if (GlGroundShaderPassStatics.anInt7396 % 20 < 10) {
                                            class105.method974((-12 + i_317_ + RemoveRoofsOptionStateStatics.anIntArray6062!![0]), i_323_ + -class105.method969())
                                            MapTileShapeStatics.method2663(-5590, (-12 + i_317_ - -RemoveRoofsOptionStateStatics.anIntArray6062!![0]), (RemoveRoofsOptionStateStatics.anIntArray6062!![0] + (i_317_ + -12) - -class105.method966()), -class105.method969() + i_323_, (-class105.method969() + (i_323_ - -class105.method980())))
                                        }
                                    }
                                    i_343_++
                                }
                                if (i_342_ > 0) i_323_ -= 2 + i_342_
                            }
                            var i_344_ = 0
                            while ( /**/i_344_ < LocalPlayerState.anInt1905) {
                                val i_345_ = (class318_sub1_sub3_sub3.anIntArray10219[i_344_])
                                val i_346_ = (class318_sub1_sub3_sub3.anIntArray10259[i_344_])
                                var itemModelDefinition: ItemModelDefinition? = null
                                var i_347_ = 0
                                if (i_346_ >= 0) {
                                    if (i_345_ <= GlGroundShaderPassStatics.anInt7396) {
                                        i_344_++
                                        continue
                                    }
                                    itemModelDefinition = (FileExistsConditionStatics.aModelDefinitionCache_4782!!.method1601(46, (class318_sub1_sub3_sub3.anIntArray10259[i_344_])))
                                    i_347_ = itemModelDefinition.anInt434
                                } else if (i_345_ < 0) {
                                    i_344_++
                                    continue
                                }
                                val i_348_ = (class318_sub1_sub3_sub3.anIntArray10304[i_344_])
                                var itemModelDefinition_349_: ItemModelDefinition? = null
                                if (i_348_ >= 0) itemModelDefinition_349_ = FileExistsConditionStatics.aModelDefinitionCache_4782!!.method1601(46, i_348_)
                                if (-i_347_ + i_345_ <= GlGroundShaderPassStatics.anInt7396) {
                                    val i_350_ = (class318_sub1_sub3_sub3.anIntArray10303[i_344_])
                                    if (i_350_ >= 0) {
                                        class318_sub1_sub3_sub3.anInt10223 = 300 + GlGroundShaderPassStatics.anInt7396
                                        class318_sub1_sub3_sub3.anInt10295 = i_350_
                                        class318_sub1_sub3_sub3.anIntArray10303[i_344_] = -1
                                    }
                                    if (itemModelDefinition == null) class318_sub1_sub3_sub3.anIntArray10219[i_344_] = -1
                                    else {
                                        val i_351_ = (class318_sub1_sub3_sub3.method2426(200) / 2)
                                        ModelKeyBuilderStatics.method2801(i_351_, i_318_ shr 1, i_320_, i_319_, i_315_ shr 1, class318_sub1_sub3_sub3, (-107).toByte())
                                        if (RemoveRoofsOptionStateStatics.anIntArray6062!![0] > -1) {
                                            RemoveRoofsOptionStateStatics.anIntArray6062!![0] += MapSceneTileDefinitionStatics.anIntArray1786!![i_344_]
                                            RemoveRoofsOptionStateStatics.anIntArray6062!![1] += DualMaterialContainerStatics.anIntArray1636!![i_344_]
                                            val `object`: Any? = null
                                            val object_352_: Any? = null
                                            val object_353_: Any? = null
                                            val object_354_: Any? = null
                                            var i_355_ = 0
                                            var i_356_ = 0
                                            var i_357_ = 0
                                            var i_358_ = 0
                                            var i_359_ = 0
                                            var i_360_ = 0
                                            var i_361_ = 0
                                            var i_362_ = 0
                                            var abstractModelRenderer: AbstractModelRenderer? = null
                                            var abstractModelRenderer_363_: AbstractModelRenderer? = null
                                            var abstractModelRenderer_364_: AbstractModelRenderer? = null
                                            var abstractModelRenderer_365_: AbstractModelRenderer? = null
                                            var i_366_ = 0
                                            var i_367_ = 0
                                            var i_368_ = 0
                                            var i_369_ = 0
                                            var i_370_ = 0
                                            var i_371_ = 0
                                            var i_372_ = 0
                                            var i_373_ = 0
                                            var i_374_ = 0
                                            val class105_375_ = itemModelDefinition.method327((FacingDirectionNodeStatics.aRenderer6654!!), (-96).toByte())
                                            if (class105_375_ != null) {
                                                i_355_ = class105_375_.method971()
                                                val i_376_ = class105_375_.method969()
                                                class105_375_.method984(HeadIconRendererStatics.anIntArray2062)
                                                if (i_374_ < i_376_) i_374_ = i_376_
                                                i_359_ = HeadIconRendererStatics.anIntArray2062!![0]
                                            }
                                            val class105_377_ = itemModelDefinition.method331((FacingDirectionNodeStatics.aRenderer6654!!), (-75).toByte())
                                            if (class105_377_ != null) {
                                                i_356_ = class105_377_.method971()
                                                val i_378_ = class105_377_.method969()
                                                class105_377_.method984(HeadIconRendererStatics.anIntArray2062)
                                                if (i_378_ > i_374_) i_374_ = i_378_
                                                i_360_ = HeadIconRendererStatics.anIntArray2062!![0]
                                            }
                                            val class105_379_ = itemModelDefinition.method324((FacingDirectionNodeStatics.aRenderer6654!!), true)
                                            if (class105_379_ != null) {
                                                i_357_ = class105_379_.method971()
                                                val i_380_ = class105_379_.method969()
                                                if (i_374_ < i_380_) i_374_ = i_380_
                                                class105_379_.method984(HeadIconRendererStatics.anIntArray2062)
                                                i_361_ = HeadIconRendererStatics.anIntArray2062!![0]
                                            }
                                            val class105_381_ = itemModelDefinition.method325((FacingDirectionNodeStatics.aRenderer6654!!), 105)
                                            if (class105_381_ != null) {
                                                i_358_ = class105_381_.method971()
                                                val i_382_ = class105_381_.method969()
                                                class105_381_.method984(HeadIconRendererStatics.anIntArray2062)
                                                if (i_374_ < i_382_) i_374_ = i_382_
                                                i_362_ = HeadIconRendererStatics.anIntArray2062!![0]
                                            }
                                            if (itemModelDefinition_349_ != null) {
                                                abstractModelRenderer = (itemModelDefinition_349_.method327(FacingDirectionNodeStatics.aRenderer6654!!, 110.toByte()))
                                                if (abstractModelRenderer != null) {
                                                    i_366_ = abstractModelRenderer.method971()
                                                    val i_383_ = abstractModelRenderer.method969()
                                                    if (i_383_ > i_374_) i_374_ = i_383_
                                                    abstractModelRenderer.method984(HeadIconRendererStatics.anIntArray2062)
                                                    i_370_ = HeadIconRendererStatics.anIntArray2062!![0]
                                                }
                                                abstractModelRenderer_363_ = (itemModelDefinition_349_.method331(FacingDirectionNodeStatics.aRenderer6654!!, (-80).toByte()))
                                                if (abstractModelRenderer_363_ != null) {
                                                    i_367_ = abstractModelRenderer_363_.method971()
                                                    val i_384_ = abstractModelRenderer_363_.method969()
                                                    if (i_384_ > i_374_) i_374_ = i_384_
                                                    abstractModelRenderer_363_.method984(HeadIconRendererStatics.anIntArray2062)
                                                    i_371_ = HeadIconRendererStatics.anIntArray2062!![0]
                                                }
                                                abstractModelRenderer_364_ = (itemModelDefinition_349_.method324(FacingDirectionNodeStatics.aRenderer6654!!, true))
                                                if (abstractModelRenderer_364_ != null) {
                                                    i_368_ = abstractModelRenderer_364_.method971()
                                                    val i_385_ = abstractModelRenderer_364_.method969()
                                                    abstractModelRenderer_364_.method984(HeadIconRendererStatics.anIntArray2062)
                                                    if (i_385_ > i_374_) i_374_ = i_385_
                                                    i_372_ = HeadIconRendererStatics.anIntArray2062!![0]
                                                }
                                                abstractModelRenderer_365_ = (itemModelDefinition_349_.method325(FacingDirectionNodeStatics.aRenderer6654!!, i_316_ xor 0x35))
                                                if (abstractModelRenderer_365_ != null) {
                                                    i_369_ = abstractModelRenderer_365_.method971()
                                                    val i_386_ = abstractModelRenderer_365_.method969()
                                                    if (i_386_ > i_374_) i_374_ = i_386_
                                                    abstractModelRenderer_365_.method984(HeadIconRendererStatics.anIntArray2062)
                                                    i_373_ = HeadIconRendererStatics.anIntArray2062!![0]
                                                }
                                            }
                                            var class324 = WorldMapRendererStatics.aFont_4684
                                            var class324_387_ = WorldMapRendererStatics.aFont_4684
                                            var class143 = GlTexture3DStatics.aFontDefinition_8527
                                            var i_388_ = itemModelDefinition.anInt435
                                            var class143_389_ = GlTexture3DStatics.aFontDefinition_8527
                                            if (i_388_ >= 0) {
                                                val class324_390_ = GlTextureBaseStatics.method232((FacingDirectionNodeStatics.aRenderer6654), (-53).toByte(), true, i_388_)
                                                val class143_391_ = (GlVertexBufferBaseStatics.method1151(-25411, FacingDirectionNodeStatics.aRenderer6654, i_388_))
                                                if (class324_390_ != null && class143_391_ != null) {
                                                    class324 = class324_390_
                                                    class143 = class143_391_
                                                }
                                            }
                                            if (itemModelDefinition_349_ != null) {
                                                i_388_ = (itemModelDefinition_349_.anInt435)
                                                if (i_388_ >= 0) {
                                                    val class324_392_ = (GlTextureBaseStatics.method232(FacingDirectionNodeStatics.aRenderer6654, (-53).toByte(), true, i_388_))
                                                    val class143_393_ = (GlVertexBufferBaseStatics.method1151(-25411, FacingDirectionNodeStatics.aRenderer6654, i_388_))
                                                    if (class324_392_ != null && class143_393_ != null) {
                                                        class143_389_ = class143_393_
                                                        class324_387_ = class324_392_
                                                    }
                                                }
                                            }
                                            val object_394_: Any? = null
                                            var string: String? = null
                                            val bool = false
                                            var i_395_ = 0
                                            val string_396_ = (itemModelDefinition.method333((class318_sub1_sub3_sub3.anIntArray10229[i_344_]), 0))
                                            val i_397_ = class143!!.method1183(true, string_396_)
                                            if (itemModelDefinition_349_ != null) {
                                                string = (itemModelDefinition_349_.method333((class318_sub1_sub3_sub3.anIntArray10284[i_344_]), 0))
                                                i_395_ = class143_389_!!.method1183(true, string)
                                            }
                                            var i_398_ = 0
                                            if (i_356_ > 0) i_398_ = i_397_ / i_356_ + 1
                                            var i_399_ = 0
                                            if (itemModelDefinition_349_ != null && i_367_ > 0) i_399_ = i_395_ / i_367_ - -1
                                            var i_400_ = 0
                                            val i_401_ = i_400_
                                            if (i_355_ > 0) i_400_ += i_355_
                                            i_400_ += 2
                                            val i_402_ = i_400_
                                            if (i_357_ > 0) i_400_ += i_357_
                                            val i_403_ = i_400_
                                            var i_404_ = i_400_
                                            if (i_356_ <= 0) i_400_ += i_397_
                                            else {
                                                val i_405_ = i_356_ * i_398_
                                                i_404_ += (i_405_ + -i_397_) / 2
                                                i_400_ += i_405_
                                            }
                                            val i_406_ = i_400_
                                            if (i_358_ > 0) i_400_ += i_358_
                                            var i_407_ = 0
                                            var i_408_ = 0
                                            var i_409_ = 0
                                            var i_410_ = 0
                                            var i_411_ = 0
                                            if (itemModelDefinition_349_ != null) {
                                                i_400_ += 2
                                                i_407_ = i_400_
                                                if (i_366_ > 0) i_400_ += i_366_
                                                i_400_ += 2
                                                i_408_ = i_400_
                                                if (i_368_ > 0) i_400_ += i_368_
                                                i_411_ = i_400_
                                                i_409_ = i_400_
                                                if (i_367_ > 0) {
                                                    val i_412_ = i_399_ * i_367_
                                                    i_411_ += (i_412_ - i_395_) / 2
                                                    i_400_ += i_412_
                                                } else i_400_ += i_395_
                                                i_410_ = i_400_
                                                if (i_369_ > 0) i_400_ += i_369_
                                            }
                                            val i_413_ = (-GlGroundShaderPassStatics.anInt7396 + (class318_sub1_sub3_sub3.anIntArray10219[i_344_]))
                                            val i_414_ = (-(itemModelDefinition.anInt424 * i_413_ / itemModelDefinition.anInt434) + itemModelDefinition.anInt424)
                                            val i_415_ = (-itemModelDefinition.anInt422 + (itemModelDefinition.anInt422 * i_413_ / itemModelDefinition.anInt434))
                                            val i_416_ = (i_317_ + RemoveRoofsOptionStateStatics.anIntArray6062!![0] + -(i_400_ shr 1) - -i_414_)
                                            val i_417_ = -12 + (i + ((RemoveRoofsOptionStateStatics.anIntArray6062!![1]) - -i_415_))
                                            var i_418_ = i_417_
                                            var i_419_ = i_417_ + i_374_
                                            val i_420_ = 15 + (i_417_ - -(itemModelDefinition.anInt420))
                                            val i_421_ = (i_420_ + -class143.anInt1988)
                                            val i_422_ = (i_420_ - -class143.anInt1993)
                                            if (i_418_ > i_421_) i_418_ = i_421_
                                            if (i_419_ < i_422_) i_419_ = i_422_
                                            var i_423_ = 0
                                            if (itemModelDefinition_349_ != null) {
                                                i_423_ = 15 + (i_417_ - -(itemModelDefinition_349_.anInt420))
                                                val i_424_ = (-(class143_389_!!.anInt1988) + i_423_)
                                                if (i_424_ < i_418_) i_418_ = i_424_
                                                val i_425_ = ((class143_389_.anInt1993) + i_423_)
                                                if (i_419_ < i_425_) i_419_ = i_425_
                                            }
                                            var i_426_ = 255
                                            if (itemModelDefinition.anInt426 >= 0) i_426_ = ((i_413_ shl 8) / (-itemModelDefinition.anInt426 + (itemModelDefinition.anInt434)))
                                            if (i_426_ >= 0 && i_426_ < 255) {
                                                val i_427_ = i_426_ shl 24
                                                val i_428_ = 0xffffff or i_427_
                                                if (class105_375_ != null) class105_375_.method964((-i_359_ + i_401_ + i_416_), i_417_, 0, i_428_, 1)
                                                if (class105_379_ != null) class105_379_.method964((-i_361_ + i_402_ + i_416_), i_417_, 0, i_428_, 1)
                                                if (class105_377_ != null) {
                                                    var i_429_ = 0
                                                    while ((i_398_ > i_429_)) {
                                                        class105_377_.method964((i_403_ + (i_416_ + (-i_360_ - -(i_356_ * i_429_)))), i_417_, 0, i_428_, 1)
                                                        i_429_++
                                                    }
                                                }
                                                if (class105_381_ != null) class105_381_.method964(i_406_ + i_416_ + -i_362_, i_417_, 0, i_428_, 1)
                                                class324!!.method2576(string_396_, (itemModelDefinition.anInt444 or i_427_), i_420_, i_404_ + i_416_, 0, -124)
                                                if (itemModelDefinition_349_ != null) {
                                                    if (abstractModelRenderer != null) abstractModelRenderer.method964((i_416_ + i_407_ - i_370_), i_417_, 0, i_428_, 1)
                                                    if (abstractModelRenderer_364_ != null) abstractModelRenderer_364_.method964(-i_372_ + (i_408_ + i_416_), i_417_, 0, i_428_, 1)
                                                    if (abstractModelRenderer_363_ != null) {
                                                        for (i_430_ in 0..<i_399_) abstractModelRenderer_363_.method964((i_430_ * i_367_ + i_416_ + (i_409_ + -i_371_)), i_417_, 0, i_428_, 1)
                                                    }
                                                    if (abstractModelRenderer_365_ != null) abstractModelRenderer_365_.method964((i_416_ - -i_410_ + -i_373_), i_417_, 0, i_428_, 1)
                                                    class324_387_!!.method2576(string, (i_427_ or (itemModelDefinition_349_.anInt444)), i_423_, i_416_ + i_411_, 0, -125)
                                                }
                                            } else {
                                                if (class105_375_ != null) class105_375_.method974(i_416_ - (-i_401_ + i_359_), i_417_)
                                                if (class105_379_ != null) class105_379_.method974(i_416_ - (-i_402_ - -i_361_), i_417_)
                                                if (class105_377_ != null) {
                                                    for (i_431_ in 0..<i_398_) class105_377_.method974((i_403_ + i_416_ - (i_360_ - i_431_ * i_356_)), i_417_)
                                                }
                                                if (class105_381_ != null) class105_381_.method974(i_406_ + (i_416_ + -i_362_), i_417_)
                                                class324!!.method2576(string_396_, (itemModelDefinition.anInt444 or 0xffffff.inv()), i_420_, i_416_ + i_404_, 0, i_316_ xor 0x74.inv())
                                                if (itemModelDefinition_349_ != null) {
                                                    if (abstractModelRenderer != null) abstractModelRenderer.method974((-i_370_ + i_416_ + i_407_), i_417_)
                                                    if (abstractModelRenderer_364_ != null) abstractModelRenderer_364_.method974(i_408_ + (i_416_ + -i_372_), i_417_)
                                                    if (abstractModelRenderer_363_ != null) {
                                                        var i_432_ = 0
                                                        while (i_399_ > i_432_) {
                                                            abstractModelRenderer_363_.method974((i_432_ * i_367_ + (-i_371_ + i_416_ + i_409_)), i_417_)
                                                            i_432_++
                                                        }
                                                    }
                                                    if (abstractModelRenderer_365_ != null) abstractModelRenderer_365_.method974(i_410_ + i_416_ - i_373_, i_417_)
                                                    class324_387_!!.method2576(string, (itemModelDefinition_349_.anInt444) or 0xffffff.inv(), i_423_, i_411_ + i_416_, 0, -119)
                                                }
                                            }
                                            MapTileShapeStatics.method2663(-5590, i_416_, i_416_ + i_400_, i_418_, 1 + i_419_)
                                        }
                                    }
                                }
                                i_344_++
                            }
                        }
                    }
                    i_322_++
                }
                for (i_433_ in 0..<Js5ArchiveStatics.anInt669) {
                    val i_434_ = GlTexture1DStatics.anIntArray8557!![i_433_]
                    val class318_sub1_sub3_sub3: ProjectedGroundDecor?
                    if (i_434_ >= 2048) class318_sub1_sub3_sub3 = ((NpcEntityUpdater.aHashtable_3654!!.method3480((-2048 + i_434_).toLong(), -6008) as? NpcReference)?.aNpc_6859)
                    else class318_sub1_sub3_sub3 = LoadingBarRendererStatics.aPlayerArray5058!![i_434_]
                    val i_435_ = LocDefinitionCacheStatics.anIntArray3432!![i_433_]
                    val class318_sub1_sub3_sub3_436_: ProjectedGroundDecor?
                    if (i_435_ >= 2048) class318_sub1_sub3_sub3_436_ = ((NpcEntityUpdater.aHashtable_3654!!.method3480((-2048 + i_435_).toLong(), -6008) as? NpcReference)?.aNpc_6859)
                    else class318_sub1_sub3_sub3_436_ = LoadingBarRendererStatics.aPlayerArray5058!![i_435_]
                    SpriteSheetCacheStatics.method1430(--class318_sub1_sub3_sub3!!.anInt10261, 119.toByte(), i_320_, i_315_, i, i_319_, i_318_, i_317_, class318_sub1_sub3_sub3_436_, class318_sub1_sub3_sub3)
                }
                val i_437_ = i_316_ + (WorldMapLabelStatics.aFontDefinition_4962!!.anInt1993 + WorldMapLabelStatics.aFontDefinition_4962!!.anInt1988)
                for (i_438_ in 0..<SceneNodeDequeStatics.anInt1497) {
                    val i_439_ = ConfigVarProgressStatics.anIntArray4822!![i_438_]
                    var i_440_ = ConfigVarProgressStatics.anIntArray4813!![i_438_]
                    val i_441_ = ConfigVarProgressStatics.anIntArray4819!![i_438_]
                    var bool = true
                    while (bool) {
                        bool = false
                        var i_442_ = 0
                        while (i_438_ > i_442_) {
                            if (i_440_ - -2 > ConfigVarProgressStatics.anIntArray4813!![i_442_] + -i_437_ && (-i_437_ + i_440_ < 2 + ConfigVarProgressStatics.anIntArray4813!![i_442_]) && ((ConfigVarProgressStatics.anIntArray4822!![i_442_] - -ConfigVarProgressStatics.anIntArray4819!![i_442_]) > i_439_ + -i_441_) && ((-ConfigVarProgressStatics.anIntArray4819!![i_442_] + ConfigVarProgressStatics.anIntArray4822!![i_442_]) < i_439_ + i_441_) && (-i_437_ + ConfigVarProgressStatics.anIntArray4813!![i_442_] < i_440_)) {
                                i_440_ = -i_437_ + ConfigVarProgressStatics.anIntArray4813!![i_442_]
                                bool = true
                            }
                            i_442_++
                        }
                    }
                    ConfigVarProgressStatics.anIntArray4813!![i_438_] = i_440_
                    val string = ConfigVarProgressStatics.aStringArray4818!![i_438_]
                    val i_443_ = WorldMapLabelStatics.aFontDefinition_4962!!.method1183(true, string)
                    var i_444_ = i_439_ + i_317_
                    var i_445_ = -WorldMapLabelStatics.aFontDefinition_4962!!.anInt1988 + i_440_ + i
                    var i_446_ = i_444_ - -i_443_
                    var i_447_ = i_440_ + i - -WorldMapLabelStatics.aFontDefinition_4962!!.anInt1993
                    if (TileTextureNodeStatics.anInt9408 == 0) {
                        var i_448_ = 16776960
                        if (ConfigVarProgressStatics.anIntArray4817!![i_438_] < 6) i_448_ = (OverlayColorTable.anIntArray1757!![ConfigVarProgressStatics.anIntArray4817!![i_438_]])
                        if (ConfigVarProgressStatics.anIntArray4817!![i_438_] == 6) i_448_ = (if (TextureQualityOptionStateStatics.anInt6006 % 20 >= 10) 16776960 else 16711680)
                        if (ConfigVarProgressStatics.anIntArray4817!![i_438_] == 7) i_448_ = if (TextureQualityOptionStateStatics.anInt6006 % 20 < 10) 255 else 65535
                        if (ConfigVarProgressStatics.anIntArray4817!![i_438_] == 8) i_448_ = (if (TextureQualityOptionStateStatics.anInt6006 % 20 >= 10) 8454016 else 45056)
                        if (ConfigVarProgressStatics.anIntArray4817!![i_438_] == 9) {
                            val i_449_ = -ConfigVarProgressStatics.anIntArray4812!![i_438_] + 150
                            if (i_449_ < 50) i_448_ = 1280 * i_449_ + 16711680
                            else if (i_449_ < 100) i_448_ = -(327680 * i_449_) + 16384000 + 16776960
                            else if (i_449_ < 150) i_448_ = 5 * (-100 + i_449_) + 65280
                        }
                        if (ConfigVarProgressStatics.anIntArray4817!![i_438_] == 10) {
                            val i_450_ = 150 - ConfigVarProgressStatics.anIntArray4812!![i_438_]
                            if (i_450_ >= 50) {
                                if (i_450_ >= 100) {
                                    if (i_450_ < 150) i_448_ = (-(5 * i_450_) - -500 + 327680 * i_450_ - 32767745)
                                } else i_448_ = 33095935 + -(327680 * i_450_)
                            } else i_448_ = 16711680 + 5 * i_450_
                        }
                        if (ConfigVarProgressStatics.anIntArray4817!![i_438_] == 11) {
                            val i_451_ = 150 - ConfigVarProgressStatics.anIntArray4812!![i_438_]
                            if (i_451_ >= 50) {
                                if (i_451_ < 100) i_448_ = 327685 * (-50 + i_451_) + 65280
                                else if (i_451_ < 150) i_448_ = 16777215 + -(327680 * (i_451_ - 100))
                            } else i_448_ = 16777215 + -(i_451_ * 327685)
                        }
                        val i_452_ = 0xffffff.inv() or i_448_
                        if (ConfigVarProgressStatics.anIntArray4806!![i_438_] == 0) {
                            NodeDequeStatics.aFont_3326!!.method2575(115.toByte(), i_439_ + i_317_, i_452_, string, -16777216, i_440_ + i)
                            i_444_ -= i_443_ shr 1
                            i_446_ -= i_443_ shr 1
                        }
                        if (ConfigVarProgressStatics.anIntArray4806!![i_438_] == 1) {
                            i_446_ -= i_443_ shr 1
                            i_444_ -= i_443_ shr 1
                            NodeDequeStatics.aFont_3326!!.method2574(i_452_, i_440_ + i, string, i_317_ - -i_439_, -16777216, TextureQualityOptionStateStatics.anInt6006, false)
                            i_447_ += 5
                            i_445_ -= 5
                        }
                        if (ConfigVarProgressStatics.anIntArray4806!![i_438_] == 2) {
                            i_447_ += 5
                            i_446_ -= -5 + (i_443_ shr 1)
                            NodeDequeStatics.aFont_3326!!.method2581(string, i_452_, (TextureQualityOptionStateStatics.anInt6006), i_440_ + i, (-112).toByte(), -16777216, i_317_ - -i_439_)
                            i_445_ -= 5
                            i_444_ -= (i_443_ shr 1) - -5
                        }
                        if (ConfigVarProgressStatics.anIntArray4806!![i_438_] == 3) {
                            i_446_ -= i_443_ shr 1
                            i_444_ -= i_443_ shr 1
                            i_447_ += 7
                            NodeDequeStatics.aFont_3326!!.method2577(TextureQualityOptionStateStatics.anInt6006, i + i_440_, string, i_452_, -16777216, 150 + -ConfigVarProgressStatics.anIntArray4812!![i_438_], i_439_ + i_317_, -20509)
                            i_445_ -= 7
                        }
                        if (ConfigVarProgressStatics.anIntArray4806!![i_438_] == 4) {
                            val i_453_ = ((150 + -ConfigVarProgressStatics.anIntArray4812!![i_438_]) * (WorldMapLabelStatics.aFontDefinition_4962!!.method1183(true, string) + 100) / 150)
                            FacingDirectionNodeStatics.aRenderer6654!!.T(i_317_ - (-i_439_ - -50), i, 50 + (i_439_ + i_317_), i - -i_315_)
                            i_444_ += 50 - i_453_
                            i_446_ += -i_453_ + 50
                            NodeDequeStatics.aFont_3326!!.method2576(string, i_452_, i + i_440_, (i_317_ - (-i_439_ - 50) - i_453_), -16777216, i_316_ + -125)
                            FacingDirectionNodeStatics.aRenderer6654!!.KA(i_317_, i, i_318_ + i_317_, i + i_315_)
                        }
                        if (ConfigVarProgressStatics.anIntArray4806!![i_438_] == 5) {
                            val i_454_ = 150 + -ConfigVarProgressStatics.anIntArray4812!![i_438_]
                            var i_455_ = 0
                            if (i_454_ >= 25) {
                                if (i_454_ > 125) i_455_ = i_454_ + -125
                            } else i_455_ = i_454_ - 25
                            val i_456_ = (WorldMapLabelStatics.aFontDefinition_4962!!.anInt1993 + WorldMapLabelStatics.aFontDefinition_4962!!.anInt1988)
                            FacingDirectionNodeStatics.aRenderer6654!!.T(i_317_, i_440_ + i - (i_456_ - -1), i_318_ + i_317_, 5 + i_440_ + i)
                            i_444_ -= i_443_ shr 1
                            i_447_ += i_455_
                            NodeDequeStatics.aFont_3326!!.method2575((-105).toByte(), i_439_ + i_317_, i_452_, string, -16777216, i_455_ + (i + i_440_))
                            i_445_ += i_455_
                            i_446_ -= i_443_ shr 1
                            FacingDirectionNodeStatics.aRenderer6654!!.KA(i_317_, i, i_318_ + i_317_, i_315_ + i)
                        }
                    } else {
                        i_444_ -= i_443_ shr 1
                        i_446_ -= i_443_ shr 1
                        NodeDequeStatics.aFont_3326!!.method2575(118.toByte(), i_439_ + i_317_, -256, string, -16777216, i_440_ + i)
                    }
                    MapTileShapeStatics.method2663(i_316_ + -5592, i_444_, 1 + i_446_, i_445_, 1 + i_447_)
                }
            }
}
