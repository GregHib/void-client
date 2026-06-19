import jagex3.jagmisc.jagmisc.quit
import java.awt.Color
import java.awt.Container
import java.awt.Frame
import java.awt.Graphics
import java.awt.Panel
import java.awt.event.FocusEvent
import java.awt.event.FocusListener
import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import java.io.IOException
import java.net.URL
import java.util.*

object GameAppletFrameStatics {
    @JvmField
            var anInt1: Int = 0
            @JvmField
            var anInt2: Int = 0
            @JvmField
            var anInt3: Int = 0
            @JvmField
            var anInt4: Int = 0
            @JvmField
            var anInt5: Int = 0
            @JvmField
            var anInt6: Int = 0
            @JvmField
            var anInt7: Int = 0
            @JvmField
            var anInt8: Int = 0
            @JvmField
            var anInt9: Int = 0
            @JvmField
            var anInt10: Int = 0
            @JvmField
            var anInt11: Int = 0
            @JvmField
            var anInt12: Int = 0
            @JvmField
            var anInt13: Int = 0
            @JvmField
            var anInt14: Int = 0
            @JvmField
            var anInt15: Int = 0
            @JvmField
            var anInt16: Int = 0
            @JvmField
            var anInt18: Int = 0
            @JvmField
            var anInt19: Int = 0
            @JvmField
            var aFont_20: Font? = null
            @JvmField
            var anInt21: Int = 0
            @JvmField
            var anInt22: Int = 0
            @JvmField
            var anInt23: Int = 0
            @JvmField
            var anInt24: Int = 0
            @JvmField
            var anInt25: Int = 0
            @JvmField
            var anInt26: Int = 0
            @JvmField
            var anInt28: Int = 0
            @JvmField
            var anInt29: Int = 0
            @JvmField
            var anInt30: Int = 0
            @JvmField
            var anInt31: Int = 0
            @JvmField
            var anInt32: Int = 0
            @JvmField
            var anInt33: Int = 0
            @JvmField
            var anInt34: Int = 0
            @JvmField
            var anInt35: Int = 0
            @JvmField
            var anInt36: Int = 0
            @JvmField
            var anInt37: Int = 0
            @JvmField
            var anIntArray38: IntArray? = null
            @JvmField
            var anInt39: Int = 0
            @JvmField
            var anInt40: Int = 0
            @JvmField
            var aBoolean41: Boolean = false
    
            @JvmStatic
            fun method85(i: Int, js5Archive: Js5Archive?) {
                anInt32++
                WorldMapIconLabelStatics.aJs5Archive_8601 = js5Archive
                if (i != 0) anInt37 = 101
            }
    
            @JvmStatic
            fun method86(string: String?, i: Int): Boolean {
                anInt13++
                if (i != 0) return true
                return CollisionMapAccessor.aHashtable3548!!.containsKey(string)
            }
    
            @JvmStatic
            fun provideLoaderApplet(applet: GameApplet) {
                anInt11++
                JagGlToolkitFactory.anApplet1530 = applet
            }
    
            @JvmStatic
            fun set(string: String) {
                MapElementManager.aString4461 = string
                TerrainShadowBuilderGl3Statics.anInt7006 = string.length
            }
    
            @JvmStatic
            fun method94(string: String, i: Int) {
                anInt6++
                if (ArbFogMaterialPassStatics.aStringArray6200 == null) Gl3dTextureStatics.method249(2)
                WaterMaterialPassStatics.aCalendar6221!!.setTime(Date(GameClock.method599(-102)))
                val i_8_ = WaterMaterialPassStatics.aCalendar6221!!.get(11)
                val i_9_ = WaterMaterialPassStatics.aCalendar6221!!.get(12)
                val i_10_ = WaterMaterialPassStatics.aCalendar6221!!.get(13)
                val string_11_ = ((i_8_ / 10).toString() + i_8_ % 10 + ":" + i_9_ / 10 + i_9_ % 10 + ":" + i_10_ / 10 + i_10_ % 10)
                val strings = TurbulenceTextureNodeStatics.method3113('\n', true, string)
                for (i_12_ in strings.indices) {
                    for (i_13_ in WorldMapTextLabelStatics.anInt8587 downTo 1) ArbFogMaterialPassStatics.aStringArray6200!![i_13_] = ArbFogMaterialPassStatics.aStringArray6200!![-1 + i_13_]
                    ArbFogMaterialPassStatics.aStringArray6200!![0] = string_11_ + ": " + strings[i_12_]
                    if (Texture2DProviderStatics.aFileOutputStream6323 != null) {
                        try {
                            Texture2DProviderStatics.aFileOutputStream6323!!.write(ClientGameLoopNodeStatics.method2992(((ArbFogMaterialPassStatics.aStringArray6200!![0]) + "\n"), (-20).toByte()))
                        } catch (ioexception: IOException) {
                            /* empty */
                        }
                    }
                    if (-1 + ArbFogMaterialPassStatics.aStringArray6200!!.size > WorldMapTextLabelStatics.anInt8587) {
                        WorldMapTextLabelStatics.anInt8587++
                        if (ViewportTransformStatics.anInt3676 > 0) ViewportTransformStatics.anInt3676++
                    }
                }
            }
    
            @JvmStatic
            fun method98(i: Int) {
                anIntArray38 = null
                aFont_20 = null
                if (i != 32717) method86(null, 65)
            }
}
