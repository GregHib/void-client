import LocalizedText.Companion.aLocalizedText_3483
import LocalizedText.Companion.aLocalizedText_3485
import LocalizedText.Companion.aLocalizedText_3486
import LocalizedText.Companion.aLocalizedText_3487
import LocalizedText.Companion.aLocalizedText_3488
import LocalizedText.Companion.aLocalizedText_3489
import LocalizedText.Companion.aLocalizedText_3490
import LocalizedText.Companion.aLocalizedText_3491
import LocalizedText.Companion.aLocalizedText_3492
import LocalizedText.Companion.aLocalizedText_3493
import LocalizedText.Companion.aLocalizedText_3494
import LocalizedText.Companion.aLocalizedText_3495
import LocalizedText.Companion.aLocalizedText_3496
import LocalizedText.Companion.aLocalizedText_3497
import LocalizedText.Companion.aLocalizedText_3498
import LocalizedText.Companion.aLocalizedText_3499
import LocalizedText.Companion.aLocalizedText_3500
import LocalizedText.Companion.aLocalizedText_3501
import LocalizedText.Companion.aLocalizedText_3502
import LocalizedText.Companion.aLocalizedText_3503
import LocalizedText.Companion.aLocalizedText_3504
import LocalizedText.Companion.aLocalizedText_3505
import LocalizedText.Companion.aLocalizedText_3506
import LocalizedText.Companion.aLocalizedText_3507
import LocalizedText.Companion.aLocalizedText_3508
import LocalizedText.Companion.aLocalizedText_3509
import LocalizedText.Companion.aLocalizedText_3510
import LocalizedText.Companion.aLocalizedText_3511
import LocalizedText.Companion.aLocalizedText_3512
import LocalizedText.Companion.aLocalizedText_3513
import LocalizedText.Companion.aLocalizedText_3514
import LocalizedText.Companion.aLocalizedText_3515
import LocalizedText.Companion.aLocalizedText_3516
import LocalizedText.Companion.aLocalizedText_3517
import LocalizedText.Companion.aLocalizedText_3518
import LocalizedText.Companion.aLocalizedText_3519
import LocalizedText.Companion.aLocalizedText_3520
import LocalizedText.Companion.aLocalizedText_3521
import LocalizedText.Companion.aLocalizedText_3522
import LocalizedText.Companion.aLocalizedText_3523
import LocalizedText.Companion.aLocalizedText_3524
import LocalizedText.Companion.aLocalizedText_3525
import LocalizedText.Companion.aLocalizedText_3526
import LocalizedText.Companion.aLocalizedText_3527
import LocalizedText.Companion.aLocalizedText_3528
import LocalizedText.Companion.aLocalizedText_3529
import LocalizedText.Companion.aLocalizedText_3530
import LocalizedText.Companion.aLocalizedText_3531
import LocalizedText.Companion.aLocalizedText_3532
import LocalizedText.Companion.aLocalizedText_3533
import LocalizedText.Companion.aLocalizedText_3534
import LocalizedText.Companion.aLocalizedText_3535
import LocalizedText.Companion.aLocalizedText_3536
import LocalizedText.Companion.aLocalizedText_3537
import LocalizedText.Companion.aLocalizedText_3538
import LocalizedText.Companion.aLocalizedText_3539
import LocalizedText.Companion.aLocalizedText_3540
import LocalizedText.Companion.aLocalizedText_3541
import LocalizedText.Companion.aLocalizedText_3542
import LocalizedText.Companion.aLocalizedText_3543
import LocalizedText.Companion.aLocalizedText_3544
import LocalizedText.Companion.aLocalizedText_3545
import LocalizedText.Companion.aLocalizedText_3546
import LocalizedText.Companion.anInt3478
import ScrollingWidgetComponentNode.Companion.method1118
import WaterMaterialPass.Companion.method2148

object LocalizedTextStatics {
    var anInt3480: Int = 0
    var anInt3477: Int = 0
    var anInt3484: Int = 0
    var aModelLightingConfig_3547: ModelLightingConfig? = null

    fun method2058(i: Int, i_0_: Int, i_1_: Int): Boolean {
        anInt3478++
        return ((0x18 and i) != 0) or ((i and 0x220) == 544)
    }

    fun method2060(i: Byte, bool: Boolean) {
        anInt3484++
        SpriteComponent.anInt8374++
        val class348_sub47 = method2148(IntPair.aOutgoingPacketHeader_6970, TheoraVideoStream.aIsaacCipher_9029, -109)
        InterfaceComponentGroup.method3243(37, class348_sub47)
        var class348_sub41 = MinimapSpriteRenderer.aHashtable_4915!!.method3484(0) as RegionSceneShifter?
        while (class348_sub41 != null) {
            if (!class348_sub41.method2712(4.toByte())) {
                class348_sub41 = MinimapSpriteRenderer.aHashtable_4915!!.method3484(0) as RegionSceneShifter?
                if (class348_sub41 == null) break
            }
            if (class348_sub41.anInt7053 == 0) method1118(true, bool, class348_sub41, 2533)
            class348_sub41 = MinimapSpriteRenderer.aHashtable_4915!!.method3482(0) as RegionSceneShifter?
        }
        if (SpriteRenderable.aWidgetComponent_4730 != null) {
            ConfigFlagUtilStatics.method1916(-9343, SpriteRenderable.aWidgetComponent_4730!!)
            SpriteRenderable.aWidgetComponent_4730 = null
        }
    }

    @JvmStatic
    fun method2061(i: Int) {
        TimedTileQueueEntry.aAbstractModelRenderer_9658 = null
        TimedTileQueueEntry.aAbstractModelRenderer_9659 = null
        MapSceneCache.aAbstractModelRenderer_2309 = null
        TileRenderState.aAbstractModelRendererArray4234 = null
        MinimapFlagRenderer.aAbstractModelRenderer_1800 = null
        anInt3477++
        val i_2_ = 89 / ((-74 - i) / 42)
        AbstractBloomEffect.aAbstractModelRenderer_6627 = null
        ChatMessageStream.aAbstractModelRenderer_106 = null
        ConfigVarProgress.aAbstractModelRenderer_4808 = null
        AbstractMenuEntryStatics.aAbstractModelRenderer_1706 = null
    }

    fun method2062(i: Byte) {
        if (HintArrowOrMessage.aMapTileShapeArray2034 != null) {
            for (i_3_ in 0..<DetailLevelOptionState.anInt6115) HintArrowOrMessage.aMapTileShapeArray2034!![i_3_] = null
            HintArrowOrMessage.aMapTileShapeArray2034 = null
        }
        anInt3480++
        if (MapElementDecor.aMapTileShapeArray10330 != null) {
            for (i_4_ in 0..<CollisionFlagQuery.anInt1200) MapElementDecor.aMapTileShapeArray10330!![i_4_] = null
            MapElementDecor.aMapTileShapeArray10330 = null
        }
        if (LoadingBarRenderer.aMapTileShapeArray5060 != null) {
            for (i_5_ in 0..<PackedFlagsAccessor.anInt7101) LoadingBarRenderer.aMapTileShapeArray5060!![i_5_] = null
            LoadingBarRenderer.aMapTileShapeArray5060 = null
        }
        ActorEntity.anIntArrayArrayArray4356 = null
        val i_6_ = 36 % ((-81 - i) / 38)
        ActorEntity.anIntArray5091 = null
        MinimapAreaMarkerNode.aMapTileShapeArray9700 = null
        DrawListState.anInt1480 = -1
        ActorEntity.anInt3872 = DrawListState.anInt1480
    }


    @JvmStatic
    fun method2059(i: Int) {
        aLocalizedText_3523 = null
        aLocalizedText_3530 = null
        aLocalizedText_3533 = null
        aLocalizedText_3509 = null
        aLocalizedText_3503 = null
        aLocalizedText_3500 = null
        aLocalizedText_3537 = null
        aLocalizedText_3504 = null
        aLocalizedText_3505 = null
        aLocalizedText_3540 = null
        aLocalizedText_3514 = null
        aLocalizedText_3515 = null
        aLocalizedText_3531 = null
        aLocalizedText_3543 = null
        aLocalizedText_3542 = null
        aLocalizedText_3501 = null
        aLocalizedText_3519 = null
        aLocalizedText_3522 = null
        aLocalizedText_3485 = null
        aLocalizedText_3483 = null
        aLocalizedText_3488 = null
        aLocalizedText_3496 = null
        aLocalizedText_3497 = null
        aLocalizedText_3526 = null
        aLocalizedText_3538 = null
        aLocalizedText_3487 = null
        aLocalizedText_3507 = null
        aLocalizedText_3493 = null
        aLocalizedText_3520 = null
        aLocalizedText_3511 = null
        aLocalizedText_3490 = null
        aLocalizedText_3532 = null
        aLocalizedText_3508 = null
        aLocalizedText_3541 = null
        aLocalizedText_3492 = null
        aLocalizedText_3517 = null
        aLocalizedText_3499 = null
        aLocalizedText_3498 = null
        aLocalizedText_3529 = null
        aLocalizedText_3516 = null
        aLocalizedText_3502 = null
        aLocalizedText_3544 = null
        aLocalizedText_3518 = null
        aLocalizedText_3528 = null
        aLocalizedText_3510 = null
        aLocalizedText_3513 = null
        aLocalizedText_3489 = null
        aLocalizedText_3491 = null
        aLocalizedText_3494 = null
        aLocalizedText_3524 = null
        aLocalizedText_3486 = null
        aLocalizedText_3525 = null
        aLocalizedText_3521 = null
        aLocalizedText_3512 = null
        aLocalizedText_3534 = null
        aLocalizedText_3536 = null
        aLocalizedText_3539 = null
        aModelLightingConfig_3547 = null
        aLocalizedText_3545 = null
        aLocalizedText_3535 = null
        aLocalizedText_3506 = null
        aLocalizedText_3527 = null
        aLocalizedText_3495 = null
        aLocalizedText_3546 = null
    }


}