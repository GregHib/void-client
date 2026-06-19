import CollisionMapRegionStatics.method1045
import NativeVertexBufferStatics.method1079
import NpcSummaryDefinitionStatics.method1166
import OrientationRotator.method1201
import SceneTilePlaneManager.method258
import ClickFeedbackTaskStatics.method1353
import ProjectileFactoryStatics.method1614
import HudTabPanelStatics.method1639
import RemoveRoofsOptionStateStatics.method1810
import GlTexture2DStatics.method1966
import ScrollTexMaterialPassStatics.method2168
import ResourceProviderStatics.method2336
import MidiSequencePlayerStatics.method2878
import MidiSequencePlayerStatics.method2879
import KaraokeSubtitleStreamStatics.method2987
import InvertTextureNodeStatics.method3135
import SourceRowTextureNodeStatics.method3058
import AsyncResourceRequestStatics.method3254
import MapSceneRenderer.method388
import DirectionPathStatics.method536
import SolidFillComponentStatics.method192
import ActiveMapRegion.method770
import WidgetCacheStatics.method837
import NativeBufferHandleStatics.method850
import OpenGlRenderNodeStatics.method3297

object WorldMapSceneSoftwareStatics {
    var anInt5815: Int = 0
            var anInt5816: Int = 0
            var anInt5817: Int = 0
            var anInt5818: Int = 0
            @JvmField
            var anInt5819: Int = 0
            var anInt5820: Int = 0
            @JvmField
            var aTileRenderState_5821: TileRenderState? = TileRenderState()
            var anInt5822: Int = 0
            var anInt5823: Int = 0
            var anInt5825: Int = 0
            var anInt5826: Int = 0
    
            /*synthetic*/
            var aClass5827: Class<*>? = null
    
            fun method1693(c: Char, i: Int): Boolean {
                anInt5815++
                if (i > -100) method1693('\uffa3', 97)
                if (c.code >= 32 && c.code <= 126) return true
                if (c.code >= 160 && c.code <= 255) return true
                return c.code == 8364 || c.code == 338 || c.code == 8212 || c.code == 339 || c.code == 376
            }
    
            @JvmStatic
            fun method1698(i: Int) {
                aTileRenderState_5821 = null
                if (i != 1) method1698(-10)
            }
}
