object AbstractRenderPassStatics {
    @JvmField
            var anInt4478: Int = 0
            @JvmField
            var anInt4480: Int = 0
            @JvmField
            var anInt4481: Int = 0
            @JvmField
            var anInt4482: Int = 0
            @JvmField
            var anInt4483: Int = 0
            @JvmField
            var anInt4484: Int = 0
            @JvmField
            var anInt4485: Int = 0
    
            @JvmStatic
            fun method3529(i: Int): SceneEffectMarker {
                anInt4478++
                val class318_sub6 = GameClock.aDoublyLinkedNodeList_1114!!.method1875(60) as SceneEffectMarker?
                if (i != 32564) method3529(-38)
                if (class318_sub6 != null) {
                    FriendChatMemberStatics.anInt4474--
                    return class318_sub6
                }
                return SceneEffectMarker()
            }
}
