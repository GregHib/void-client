/**
 * JS implementation of [Class373] (mouse input base).
 *
 * Mirrors [Class373_Sub1] (the AWT implementation) but driven by DOM MouseEvent /
 * WheelEvent on a canvas element.
 *
 * Queue design is identical to the JVM side:
 *  - [aClass262_raw] accumulates incoming DOM events as [Class348_Sub45_Sub1].
 *  - [method3589] swaps raw↔processed queues (called once per frame by the game loop,
 *    same as the JVM impl).
 *  - [method3596] returns the next processed event from [aClass262_out].
 *  - [method3588]/[method3590]/[method3595] query button/motion state.
 *  - [method3594]/[method3597] return the last-known cursor position.
 *
 * Button encoding matches the JVM side (Class373_Sub1.method3598 i_1_ values):
 *   0 = left press, 1 = middle press, 2 = right press,
 *   3 = left release, 4 = middle release, 5 = right release, 6 = wheel, -1 = move.
 */
class JsMouseInput(canvas: dynamic, trackMotionOnly: Boolean = false) : Class373() {

    private var aClass262_out: Class262 = Class262()
    private var aClass262_raw: Class262 = Class262()

    // mirrored snapshot fields (set by method3589, read by method3594/3597)
    private var lastX = 0
    private var lastY = 0
    private var currentX = 0
    private var currentY = 0
    private var buttonState = 0   // bitmask: bit0=left, bit1=middle, bit2=right
    private var rawButtonState = 0

    private val trackMotionOnly = trackMotionOnly
    private var attached: dynamic = null

    // ---- Class373 contract ----

    /** Swap raw ↔ out queues; update cursor snapshot. Called once per frame. */
    override fun method3589(i: Int) {
        lastX = currentX
        lastY = currentY
        buttonState = rawButtonState
        if (i == 0) {
            val tmp = aClass262_out
            aClass262_out = aClass262_raw
            aClass262_raw = tmp
            aClass262_raw.method1996(127)
        }
    }

    /** Pop next mouse event from the processed queue. */
    override fun method3596(i: Int): Class348_Sub45? {
        return aClass262_out.method1997(8) as Class348_Sub45?
    }

    /** true if right button held. */
    override fun method3588(i: Int): Boolean = (buttonState and 0x4) != 0

    /** true if middle button held. */
    override fun method3590(i: Byte): Boolean = (buttonState and 0x2) != 0

    /** true if left button held. */
    override fun method3595(i: Int): Boolean = (buttonState and 0x1) != 0

    /** Last-known cursor X. */
    override fun method3594(i: Byte): Int = lastX

    /** Last-known cursor Y. */
    override fun method3597(bool: Boolean): Int = lastY

    /** Detach listeners. */
    override fun method3592(i: Int) {
        if (i == 0) detach()
    }

    // ---- DOM wiring ----

    private val onMouseMove:  (Any?) -> Unit = { e -> handleMove(e.asDynamic()) }
    private val onMouseDown:  (Any?) -> Unit = { e -> handleDown(e.asDynamic()) }
    private val onMouseUp:    (Any?) -> Unit = { e -> handleUp(e.asDynamic()) }
    private val onWheel:      (Any?) -> Unit = { e -> handleWheel(e.asDynamic()) }
    private val onMouseEnter: (Any?) -> Unit = { e -> handleMove(e.asDynamic()) }
    private val onMouseLeave: (Any?) -> Unit = { e -> handleMove(e.asDynamic()) }

    private fun canvasXY(e: dynamic): Pair<Int, Int> {
        val rect = attached.getBoundingClientRect()
        val x = ((e.clientX as Double) - (rect.left as Double)).toInt()
        val y = ((e.clientY as Double) - (rect.top  as Double)).toInt()
        return x to y
    }

    private fun handleMove(e: dynamic) {
        val (x, y) = canvasXY(e)
        currentX = x; currentY = y
        enqueue(x, -1, 0, y)
    }

    private fun handleDown(e: dynamic) {
        if (trackMotionOnly) return
        val (x, y) = canvasXY(e)
        currentX = x; currentY = y
        val btn = domButton(e)
        rawButtonState = rawButtonState or btn
        val typeCode = when (btn) { 1 -> 0; 2 -> 1; 4 -> 2; else -> return }
        enqueue(x, typeCode, (e.detail as? Int) ?: 1, y)
        e.preventDefault()
    }

    private fun handleUp(e: dynamic) {
        if (trackMotionOnly) return
        val (x, y) = canvasXY(e)
        currentX = x; currentY = y
        val btn = domButton(e)
        rawButtonState = rawButtonState and btn.inv()
        val typeCode = when (btn) { 1 -> 3; 2 -> 4; 4 -> 5; else -> return }
        enqueue(x, typeCode, (e.detail as? Int) ?: 1, y)
        e.preventDefault()
    }

    private fun handleWheel(e: dynamic) {
        val (x, y) = canvasXY(e)
        val delta = if ((e.deltaY as Double) > 0.0) 1 else -1
        enqueue(x, 6, delta, y)
        e.preventDefault()
    }

    /** DOM button field → bitmask (1=left, 2=middle, 4=right). */
    private fun domButton(e: dynamic): Int = when (e.button as Int) {
        0 -> 1; 1 -> 2; 2 -> 4; else -> 0
    }

    private fun enqueue(x: Int, type: Int, clicks: Int, y: Int) {
        val ev = Class348_Sub45_Sub1()
        ev.anInt9729 = x
        ev.anInt9725 = y
        ev.anInt9728 = type
        ev.anInt9727 = clicks
        ev.aLong9726 = clockMillis()
        aClass262_raw.method1999(ev, -20180)
    }

    private fun attach(canvas: dynamic) {
        detach()
        attached = canvas
        canvas.addEventListener("mousemove",  onMouseMove)
        canvas.addEventListener("mouseenter", onMouseEnter)
        canvas.addEventListener("mouseleave", onMouseLeave)
        if (!trackMotionOnly) {
            canvas.addEventListener("mousedown",  onMouseDown)
            canvas.addEventListener("mouseup",    onMouseUp)
            canvas.addEventListener("wheel",      onWheel)
        }
    }

    private fun detach() {
        val c = attached ?: return
        c.removeEventListener("mousemove",  onMouseMove)
        c.removeEventListener("mouseenter", onMouseEnter)
        c.removeEventListener("mouseleave", onMouseLeave)
        c.removeEventListener("mousedown",  onMouseDown)
        c.removeEventListener("mouseup",    onMouseUp)
        c.removeEventListener("wheel",      onWheel)
        rawButtonState = 0
        attached = null
    }

    init {
        attach(canvas)
    }
}
