/**
 * Draws static scene objects (ground decor, scenery such as trees and rocks, and walls) from
 * per-chunk batches instead of one model draw (plus the per-entity setup in
 * [SkyboxSphereType.method365]) for each entity.
 *
 * How it hooks in ([FloatBuffer.method3398], the scene pass):
 * - [beginPass] decides whether this pass can use batches at all.
 * - The traversal still runs every entity's own visibility tests. For a visible entity that
 *   belongs to a batch, [consume] marks it visible and the entity is not queued for
 *   [SkyboxSphereType.method365].
 * - [endPass], called where the opaque entities have just been drawn, draws each batch touched
 *   this pass. Per material, it draws the index ranges of the visible members, merging
 *   neighbouring ranges, so a fully visible chunk costs one draw per material and hidden members
 *   (roofs, occlusion, off-screen) stay hidden exactly as before.
 *
 * Eligible: [ModelGroundDecor], [GroundDecorSceneEntity], [NpcActorEntity] (static scenery,
 * despite the name) and [ModelWallEntity] in the static scene lists, which all draw one model
 * placed by a translation in their [SceneEntity.method2386], and whose model has no alpha-blended
 * faces, no billboards or emitters and no point lights. Anything else, and any entity the index
 * has not seen yet, takes the normal path, so the fallback is always the original rendering.
 *
 * Clickable entities (those [SceneEntity.method2386] hands to the deferred path) still need their
 * screen rectangle every frame for mouse-over and menus: [consume] computes it exactly as the
 * model draw would ([OpenGlModel.projectForBatch]) and queues it with
 * [SceneObjectSpawner.method774], as [SkyboxSphereType.method365] does, while the batch draws them.
 *
 * Geometry comes from copies kept of the model's packed streams ([OpenGlModel.markForBatchCapture]),
 * translated to world space the way each class's method2386 positions the model ([originX]).
 *
 * Keeping batches current:
 * - Decor that leaves the scene is never marked visible again, so its range is not drawn.
 * - Decor that joins the scene has no slot yet; [consume] marks its chunk dirty, and the next
 *   pass re-indexes and rebuilds that chunk. Many dirty chunks at once, a new scene (the entity
 *   lists are reallocated on a region load), a new renderer or a point-light setting change
 *   re-index everything and free every batch.
 * - A member whose model or position changed, or whose model has been marked for re-packing
 *   (colours, normals, retexturing...), is evicted: it draws the normal way, which re-packs it,
 *   and its chunk is rebuilt from the fresh copies. After [MAX_EVICTIONS] it stays on the normal
 *   path, so decor that keeps changing cannot trigger a rebuild every pass.
 * - Materials are looked up by texture id at draw time, so texture and material settings apply
 *   to batches as they do to models.
 */
object DecorBatcher {
    /** Decor models keep copies of their packed geometry. Must be decided before models are built. */
    private val captureEnabled: Boolean = decorBatchingSupported

    /** Draw eligible decor from batches. Toggled by the `batchdecor` console command. */
    var enabled: Boolean = captureEnabled

    /**
     * Log2 of the chunk size in tiles (16x16). Measured at the fully zoomed-out view: 8x8 needed
     * twice the material switches, and 32x32 or larger saved almost no draws, which by then are
     * mostly split by hidden members rather than by materials.
     */
    private const val CHUNK_SHIFT = 4
    private const val MAX_BUILDS_PER_PASS = 16
    private const val MAX_DIRTY_CHUNKS = 32 // more than this in one pass: re-index everything
    private const val MAX_EVICTIONS = 3

    private val INELIGIBLE = Any()

    private val chunks = HashMap<Int, Chunk>()
    private val dirtyChunks = HashSet<Int>()
    private var indexAll = true
    private var indexedLights = false
    private var indexedScene: Array<SceneEntity?>? = null
    private var renderer: OpenGlRenderer? = null
    private var pass = 0
    private var passActive = false
    private var buildsThisPass = 0
    private val passBatches = ArrayList<Batch>()
    private val lightScratch = arrayOfNulls<AbstractTileShape>(4)

    /** Called by decor entities for the model they will draw, before it is first packed. */
    fun onDecorModel(model: AbstractModel?) {
        if (captureEnabled && model is OpenGlModel) model.markForBatchCapture()
    }

    /**
     * Starts a scene pass over entity list [listIndex]. Returns whether [consume] and [endPass]
     * should be used for it. [picking] is the pass's `aBoolean6391` value, which asks every entity
     * to publish its screen rectangle, so batching is off for such passes.
     */
    fun beginPass(listIndex: Int, picking: Boolean): Boolean {
        passActive = false
        if (!enabled || !captureEnabled || picking || listIndex != 0) return false
        // Threaded scene drawing, the alternate model path and the underwater per-tile setup
        // (OpenGlRenderer.EA) are not reproduced by the batch draw.
        if (VoronoiNoiseTextureNode.aBoolean9121 || ParticleSystemRenderer.aBoolean3870) return false
        if (ActorEntity.aTerrainTileArray4142 === ActorEntity.aTerrainTileArray5191) return false
        val r = NativeLibraryState.aRenderer171 as? OpenGlRenderer ?: return false
        val scene = LinkedListNodeStatics.aClass318_Sub1Array4293 ?: return false
        if (r !== renderer || scene !== indexedScene || ProjectedGroundDecor.aBoolean10221 != indexedLights || dirtyChunks.size > MAX_DIRTY_CHUNKS) indexAll = true
        renderer = r
        pass++
        buildsThisPass = 0
        if (indexAll || dirtyChunks.isNotEmpty()) reindex()
        passActive = true
        return true
    }

    /**
     * Takes visible entity [e] if a batch draws it this pass. Returns false when [e] must be drawn
     * the normal way.
     */
    fun consume(e: SceneEntity): Boolean {
        var slot = e.decorBatchSlot
        if (slot is Pending && !slot.chunk.released) {
            val chunk = slot.chunk
            if (!chunk.built) {
                if (buildsThisPass >= MAX_BUILDS_PER_PASS) return false
                buildsThisPass++
                chunk.build(renderer!!)
            }
            slot = e.decorBatchSlot
        }
        if (slot is Member) {
            val batch = slot.batch
            if (!batch.released) {
                if (!slot.isCurrent(e)) {
                    e.decorBatchSlot = Evicted(slot.evictions + 1)
                    dirtyChunks.add(chunkKey(e))
                    return false
                }
                batch.visible[slot.index] = pass
                if (batch.pass != pass) {
                    batch.pass = pass
                    passBatches.add(batch)
                }
                if (slot.deferred) publishPickRect(e, slot)
                return true
            }
        } else if (slot === INELIGIBLE || slot is Evicted) return false
        // Not indexed, or indexed into a chunk that has since been rebuilt: new to the scene.
        if (isCandidate(e)) {
            val key = chunkKey(e)
            if (chunks[key]?.indexedPass == pass) e.decorBatchSlot = INELIGIBLE // not in the scanned lists
            else dirtyChunks.add(key)
        }
        return false
    }

    /** Draws the batches [consume] took entities for, with the same state a decor model draw uses. */
    fun endPass() {
        if (!passActive) return
        passActive = false
        if (passBatches.isEmpty()) return
        val r = renderer!!
        if (ProjectedGroundDecor.aBoolean10221) r.method3642(0, null)
        val transform = r.method3705() as ProjectionCameraTransform
        transform.method894(0, 0, 0)
        r.method3784((-62).toByte())
        r.method3758(false, transform)
        for (batch in passBatches) batch.draw(r, pass)
        r.method3734(true)
        passBatches.clear()
    }

    private fun chunkKey(e: SceneEntity): Int {
        val cx = (e.x shr ActorEntity.anInt4459) shr CHUNK_SHIFT
        val cy = (e.y shr ActorEntity.anInt4459) shr CHUNK_SHIFT
        return (cx shl 16) or (cy and 0xffff)
    }

    /** The deferred half of [SkyboxSphereType.method365] and method2386, without the draw. */
    private fun publishPickRect(e: SceneEntity, member: Member) {
        val transform = renderer!!.method3705()
        transform.method894(member.x, member.height, member.y)
        val sceneModel = ChatMessageStream.method136(1, true, false)
        member.model.projectForBatch(transform, sceneModel.aClass318_Sub3Array6414!![0]!!)
        sceneModel.aClass318_Sub1_6410 = e
        PlayerSequenceSelector.aSceneObjectSpawner_1208!!.method774(sceneModel, 18802)
    }

    private fun deferredOf(e: SceneEntity): Boolean = when (e) {
        is ModelGroundDecor -> e.batchDeferred
        is GroundDecorSceneEntity -> e.batchDeferred
        is NpcActorEntity -> e.batchDeferred
        is ModelWallEntity -> e.batchDeferred
        else -> false
    }

    private fun isCandidate(e: SceneEntity): Boolean =
        e is ModelGroundDecor || e is GroundDecorSceneEntity || e is NpcActorEntity || e is ModelWallEntity

    private fun modelOf(e: SceneEntity): OpenGlModel? = when (e) {
        is ModelGroundDecor -> e.aAbstractModel_10028 as? OpenGlModel
        is GroundDecorSceneEntity -> e.batchModel as? OpenGlModel
        is NpcActorEntity -> e.aAbstractModel_10071 as? OpenGlModel
        is ModelWallEntity -> e.batchModel as? OpenGlModel
        else -> null
    }

    /** The translation each class's method2386 gives its model: x and y (world z), plus the height. */
    private fun originX(e: SceneEntity): Int = if (e is ModelWallEntity) e.x + e.aShort8781 else e.x

    private fun originY(e: SceneEntity): Int = if (e is ModelWallEntity) e.y + e.aShort8769 else e.y

    private fun eligible(e: SceneEntity): Boolean {
        val model = modelOf(e) ?: return false
        if (!model.batchCapture || model.F()) return false
        return !ProjectedGroundDecor.aBoolean10221 || e.method2384(lightScratch, 49) == 0
    }

    /** Assigns the static scene lists' entities to chunks: all of them, or those in dirty chunks. */
    private fun reindex() {
        val all = indexAll
        if (all) {
            for (chunk in chunks.values) chunk.release()
            chunks.clear()
        } else {
            for (key in dirtyChunks) {
                chunks[key]?.release()
                chunks[key] = Chunk(pass)
            }
        }
        indexList(LinkedListNodeStatics.aClass318_Sub1Array4293?.get(0), all)
        indexList(OverlayColorTable.aClass318_Sub1Array1754?.get(0), all)
        dirtyChunks.clear()
        indexAll = false
        indexedLights = ProjectedGroundDecor.aBoolean10221
        indexedScene = LinkedListNodeStatics.aClass318_Sub1Array4293
    }

    private fun indexList(head: SceneEntity?, all: Boolean) {
        var e = head
        while (e != null) {
            if (isCandidate(e)) {
                val key = chunkKey(e)
                val chunk = if (all) chunks.getOrPut(key) { Chunk(pass) } else chunks[key]?.takeIf { it.indexedPass == pass }
                if (chunk != null) {
                    val evictions = evictionsOf(e.decorBatchSlot)
                    if (evictions >= MAX_EVICTIONS) e.decorBatchSlot = INELIGIBLE
                    else if (eligible(e)) {
                        chunk.pending.add(e)
                        e.decorBatchSlot = Pending(chunk, evictions)
                    } else e.decorBatchSlot = INELIGIBLE
                }
            }
            e = e.aClass318_Sub1_6379
        }
    }

    private fun evictionsOf(slot: Any?): Int = when (slot) {
        is Pending -> slot.evictions
        is Member -> slot.evictions
        is Evicted -> slot.evictions
        else -> 0
    }

    /** Indexed into [chunk], whose batches are built the first time one of its members is visible. */
    private class Pending(val chunk: Chunk, val evictions: Int)

    /** Removed from its batch because it changed; drawn the normal way until re-indexed. */
    private class Evicted(val evictions: Int)

    /** Entry [index] of [batch], built from [model] placed at ([x], [height], [y]). */
    private class Member(val batch: Batch, val index: Int, val model: OpenGlModel, val evictions: Int, val x: Int, val height: Int, val y: Int, val deferred: Boolean) {
        fun isCurrent(e: SceneEntity): Boolean =
            originX(e) == x && originY(e) == y && e.anInt6382 == height && modelOf(e) === model && model.batchStillCurrent()
    }

    /** The eligible decor of one chunk: entities until first drawn, then one batch per vertex format. */
    private class Chunk(val indexedPass: Int) {
        val pending = ArrayList<SceneEntity>()
        val batches = ArrayList<Batch>()
        var built = false
        var released = false

        fun build(r: OpenGlRenderer) {
            built = true
            // Row-major order keeps a partly visible chunk's visible members in few ranges.
            pending.sortWith(compareBy({ it.y }, { it.x }))
            val byFormat = HashMap<Int, ArrayList<SceneEntity>>()
            for (e in pending) {
                val model = modelOf(e)
                if (model == null || !model.prepareForBatch()) {
                    e.decorBatchSlot = INELIGIBLE
                    continue
                }
                val format = (if (model.batchHasColours) 1 else 0) or (if (model.batchHasNormals) 2 else 0) or (if (model.batchHasTexCoords) 4 else 0)
                byFormat.getOrPut(format) { ArrayList() }.add(e)
            }
            pending.clear()
            for ((format, members) in byFormat) batches.add(Batch(r, format, members))
        }

        fun release() {
            released = true
            for (batch in batches) batch.release()
            batches.clear()
        }
    }

    /** One vertex/index buffer pair holding members of one vertex format, grouped by material. */
    private class Batch(r: OpenGlRenderer, format: Int, members: List<SceneEntity>) {
        val hasNormals = (format and 2) != 0
        private val vertices: ByteBufferReader
        private val indices: ByteArrayCodec
        private val positions: HoverActionEntry
        private val colours: HoverActionEntry?
        private val normals: HoverActionEntry?
        private val texCoords: HoverActionEntry?

        // Per material: its texture and the end of its ranges in the run arrays. Per range: the
        // member it belongs to and its first index and index count.
        private val materialTextures: IntArray
        private val materialEnds: IntArray
        private val rangeMember: IntArray
        private val rangeStart: IntArray
        private val rangeCount: IntArray

        val visible = IntArray(members.size)
        var pass = 0
        var released = false

        init {
            val hasColours = (format and 1) != 0
            val hasTexCoords = (format and 4) != 0
            val colourOffset = 12
            val normalOffset = colourOffset + (if (hasColours) 4 else 0)
            val texCoordOffset = normalOffset + (if (hasNormals) 12 else 0)
            val stride = texCoordOffset + (if (hasTexCoords) 8 else 0)
            val bigEndian = r.aBoolean7775

            val models = Array(members.size) { modelOf(members[it])!! }
            var vertexCount = 0
            var indexCount = 0
            for (m in models) {
                vertexCount += m.batchVertexCount
                indexCount += m.capturedIndices!!.size / 2
            }

            val vertexBytes = ByteArray(vertexCount * stride)
            val memberBase = IntArray(members.size)
            var base = 0
            for (i in members.indices) {
                val e = members[i]
                val m = models[i]
                memberBase[i] = base
                val pos = m.capturedPositions!!
                val col = m.capturedColours
                val nrm = m.capturedNormals
                val uv = m.capturedTexCoords
                val tx = originX(e).toFloat()
                val ty = e.anInt6382.toFloat()
                val tz = originY(e).toFloat()
                for (v in 0..<m.batchVertexCount) {
                    val o = (base + v) * stride
                    val p = v * 12
                    putFloat(vertexBytes, o, getFloat(pos, p, bigEndian) + tx, bigEndian)
                    putFloat(vertexBytes, o + 4, getFloat(pos, p + 4, bigEndian) + ty, bigEndian)
                    putFloat(vertexBytes, o + 8, getFloat(pos, p + 8, bigEndian) + tz, bigEndian)
                    if (hasColours) copy(col!!, v * 4, vertexBytes, o + colourOffset, 4)
                    if (hasNormals) copy(nrm!!, v * 12, vertexBytes, o + normalOffset, 12)
                    if (hasTexCoords) copy(uv!!, v * 8, vertexBytes, o + texCoordOffset, 8)
                }
                base += m.batchVertexCount
            }

            // Materials in first-seen order; each member's faces for a material are contiguous.
            val textures = ArrayList<Int>()
            for (m in models) for (t in m.capturedGroupTextures!!) if (t !in textures) textures.add(t)
            val indexBytes = ByteArray(indexCount * 4)
            val ends = IntArray(textures.size)
            val rMember = ArrayList<Int>()
            val rStart = ArrayList<Int>()
            val rCount = ArrayList<Int>()
            var cursor = 0
            for (t in textures.indices) {
                val texture = textures[t]
                for (i in members.indices) {
                    val m = models[i]
                    val groups = m.capturedGroups!!
                    val groupTextures = m.capturedGroupTextures!!
                    val src = m.capturedIndices!!
                    val start = cursor
                    for (g in groupTextures.indices) {
                        if (groupTextures[g] != texture) continue
                        for (k in groups[g] * 3..<groups[g + 1] * 3) {
                            val index = getUnsignedShort(src, k * 2, bigEndian) + memberBase[i]
                            if (bigEndian) indexBytes.putIntBE(cursor * 4, index) else indexBytes.putIntLE(cursor * 4, index)
                            cursor++
                        }
                    }
                    if (cursor > start) {
                        rMember.add(i)
                        rStart.add(start)
                        rCount.add(cursor - start)
                    }
                }
                ends[t] = rMember.size
            }
            materialTextures = textures.toIntArray()
            materialEnds = ends
            rangeMember = rMember.toIntArray()
            rangeStart = rStart.toIntArray()
            rangeCount = rCount.toIntArray()

            vertices = r.method3731(2, false, stride, vertexBytes, vertexBytes.size)
            indices = r.method3733(5125, -39, cursor * 4, indexBytes, false)
            positions = HoverActionEntry(vertices, 5126, 3, 0)
            colours = if (hasColours) HoverActionEntry(vertices, 5121, 4, colourOffset) else null
            normals = if (hasNormals) HoverActionEntry(vertices, 5126, 3, normalOffset) else null
            texCoords = if (hasTexCoords) HoverActionEntry(vertices, 5126, 2, texCoordOffset) else null
            for (i in members.indices) {
                val e = members[i]
                e.decorBatchSlot = Member(this, i, models[i], evictionsOf(e.decorBatchSlot), originX(e), e.anInt6382, originY(e), deferredOf(e))
            }
        }

        /** The draw sequence of [OpenGlModel.method677], once per material over the visible ranges. */
        fun draw(r: OpenGlRenderer, currentPass: Int) {
            r.method3728(hasNormals, 118)
            r.method3794(positions, colours, -26411, texCoords, normals)
            var k = 0
            for (t in materialTextures.indices) {
                val end = materialEnds[t]
                var materialSet = false
                var runStart = -1
                var runCount = 0
                while (k < end) {
                    if (visible[rangeMember[k]] == currentPass) {
                        if (runStart < 0) runStart = rangeStart[k]
                        runCount += rangeCount[k]
                    } else if (runStart >= 0) {
                        if (!materialSet) {
                            r.method3801(hasNormals, materialTextures[t], 125)
                            materialSet = true
                        }
                        r.method3759(runCount, -128, 4, indices, runStart)
                        runStart = -1
                        runCount = 0
                    }
                    k++
                }
                if (runStart >= 0) {
                    if (!materialSet) r.method3801(hasNormals, materialTextures[t], 125)
                    r.method3759(runCount, -128, 4, indices, runStart)
                }
            }
        }

        fun release() {
            released = true
            (vertices as? GlVertexBufferBase)?.release()
            (indices as? GlVertexBufferBase)?.release()
        }
    }

    private fun getFloat(src: ByteArray, pos: Int, bigEndian: Boolean): Float {
        val b0 = src[pos].toInt() and 0xff
        val b1 = src[pos + 1].toInt() and 0xff
        val b2 = src[pos + 2].toInt() and 0xff
        val b3 = src[pos + 3].toInt() and 0xff
        val bits = if (bigEndian) (b0 shl 24) or (b1 shl 16) or (b2 shl 8) or b3 else (b3 shl 24) or (b2 shl 16) or (b1 shl 8) or b0
        return Float.fromBits(bits)
    }

    private fun putFloat(dst: ByteArray, pos: Int, value: Float, bigEndian: Boolean) {
        if (bigEndian) dst.putIntBE(pos, value.toRawBits()) else dst.putIntLE(pos, value.toRawBits())
    }

    private fun getUnsignedShort(src: ByteArray, pos: Int, bigEndian: Boolean): Int {
        val b0 = src[pos].toInt() and 0xff
        val b1 = src[pos + 1].toInt() and 0xff
        return if (bigEndian) (b0 shl 8) or b1 else (b1 shl 8) or b0
    }

    private fun copy(src: ByteArray, from: Int, dst: ByteArray, to: Int, length: Int) {
        for (b in 0..<length) dst[to + b] = src[from + b]
    }
}
