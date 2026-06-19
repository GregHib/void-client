import NormalMapTextureNodeStatics.method3140

object LocTypeConfigStatics {
    var anInt3565: Int = 0
            var anInt3567: Int = 0
            @JvmField
            var aIndexedFileCache_3568: IndexedFileCache? = null
            var anInt3571: Int = 0
            var aCameraRotationStub_3572: CameraRotationStub? = CameraRotationStub()
            fun method2068(l: Long, l_0_: Long): Long {
                try {
                    return l or l_0_
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, "vd.D(" + l + ',' + l_0_ + ')')
                }
            }
    
            @JvmStatic
            fun method2071(i: Int) {
                aCameraRotationStub_3572 = null
                aIndexedFileCache_3568 = null
                if (i > -126) aCameraRotationStub_3572 = null
            }
}
