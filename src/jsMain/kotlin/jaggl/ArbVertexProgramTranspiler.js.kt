package jaggl

import org.khronos.webgl.Float32Array

/**
 * Transpiles ARB_vertex_program (ARBvp1.0) assembly into GLSL ES 300 vertex shaders so
 * WebGL2 can execute the client's legacy water/fog/ground passes.
 *
 * The generated vertex shader mirrors the fixed-function pipeline's interfaces so it can be
 * paired with FixedFunctionShader's fragment stage unchanged:
 *  - attributes at locations 0-4 (aPosition, aColor, aTexCoord0, aNormal, aTexCoord1)
 *  - outputs vColor / vTexCoord0 / vTexCoord1 / vTexCoord2
 *  - uniforms uModelViewMatrix, uProjectionMatrix, uTextureMatrices[3]
 *
 * Anything the transpiler cannot represent throws [ArbTranspileException]; the shim turns
 * that into a nonzero GL_PROGRAM_ERROR_POSITION_ARB so ArbVertexProgram fails compilation
 * cleanly and the engine falls back to the fixed-function pass (same as a driver error).
 */
internal class ArbTranspileException(val line: Int, message: String) : Exception("ARBvp line $line: $message")

internal object ArbVertexProgramTranspiler {

    /** Transpiled program: GLSL ES 300 vertex source plus metadata needed at draw time. */
    internal class Result(
        val glslSource: String,
        val maxLocalIndex: Int,
        val maxEnvIndex: Int,
        val maxLightIndex: Int,
        val usesLightModelAmbient: Boolean,
        val usesLightState: Boolean,
    )

    private const val DROPPED = "\u0000dropped"

    // ---- operand model -----------------------------------------------------

    /** A parsed source operand. [base] is a GLSL expression prefix (register or uniform slot). */
    private class Operand(
        var base: String,
        var isNumber: Boolean,
        var swizzle: String?,   // normalized to 4 chars of xyzw, or null for full
        var negate: Boolean,
        var abs: Boolean,
    )

    private class Dest(var name: String, val mask: String, var dropped: Boolean = false)

    // ---- transpiler state --------------------------------------------------

    private class Ctx {
        val attribs = LinkedHashMap<String, String>()     // ATTRIB name -> attribute expression
        val outputs = LinkedHashMap<String, String>()     // OUTPUT name -> result-register name
        val params = LinkedHashMap<String, ParamBinding>()
        val temps = LinkedHashSet<String>()
        val addresses = LinkedHashSet<String>()
        val usedAttribs = LinkedHashSet<Int>()            // attribute locations referenced
        var positionWritten = false
        var positionReferenced = false
        var usesSecondary = false
        var usesLightModelAmbient = false
        var usesLightState = false
        var needsNormalRows = false
        var maxLocalIndex = -1
        var maxEnvIndex = -1
        var maxLightIndex = -1
    }

    private sealed class ParamBinding {
        /** A single program.local[i] / program.env[i] slot. */
        class Uniform(val kind: String, val index: Int) : ParamBinding()

        /** program.local[a.b] style range; supports ARL-relative indexing. **/
        class UniformArray(val kind: String, val base: Int, val count: Int) : ParamBinding()

        /** Materialized as a local variable (matrix rows, constants, lightprod products). */
        class Local(val decl: String) : ParamBinding()
    }

    private sealed class StateRef {
        class Single(val expr: String) : StateRef()
        class Rows(val exprs: List<String>) : StateRef()
        class ProgramRef(val kind: String, val index: Int) : StateRef()
    }

    private val numberRegex = Regex("^[+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)(?:[eE][+-]?\\d+)?$")

    // ---- entry point ---------------------------------------------------------

    fun transpile(source: String): Result {
        if (!source.contains("!!ARBvp1.0")) throw ArbTranspileException(1, "missing !!ARBvp1.0 header")
        val ctx = Ctx()
        // The header is not ';'-terminated, so terminate it explicitly before splitting,
        // otherwise it would merge with the first declaration.
        val normalized = source.replace(Regex("[\\r\\n\\t]+"), " ").trimStart()
            .replaceFirst(Regex("^!!ARBvp1\\.0\\s*"), "!!ARBvp1.0; ")
        val statements = normalized.split(';')
        val body = mutableListOf<String>()
        var ended = false

        for ((stmtIdx, raw) in statements.withIndex()) {
            val stmt = raw.trim()
            if (stmt.isEmpty()) continue
            if (ended) throw ArbTranspileException(stmtIdx + 1, "statement after END")
            val line = stmtIdx + 1
            val keyword = stmt.substringBefore(' ').uppercase()

            when (keyword) {
                "!!ARBVP1.0" -> {}
                "OPTION" -> {} // ARB_position_invariant: the generated shader always sets gl_Position
                "ATTRIB" -> handleAttrib(ctx, stmt.substringAfter("ATTRIB").trim(), line)
                "OUTPUT" -> handleOutput(ctx, stmt.substringAfter("OUTPUT").trim(), line)
                "PARAM" -> handleParam(ctx, stmt.substringAfter("PARAM").trim(), line)
                "TEMP" -> for (name in stmt.substringAfter("TEMP").trim().split(',')) {
                    declareName(ctx, name.trim(), line)
                    ctx.temps.add(name.trim())
                }
                "ADDRESS" -> for (name in stmt.substringAfter("ADDRESS").trim().split(',')) {
                    declareName(ctx, name.trim(), line)
                    ctx.addresses.add(name.trim())
                }
                "END" -> ended = true
                else -> body.add(emitInstruction(ctx, stmt, line))
            }
        }

        if (!ended && body.isEmpty()) throw ArbTranspileException(1, "program contains no instructions")
        return Result(
            buildGlsl(ctx, body),
            ctx.maxLocalIndex,
            ctx.maxEnvIndex,
            ctx.maxLightIndex,
            ctx.usesLightModelAmbient,
            ctx.usesLightState,
        )
    }

    private fun declareName(ctx: Ctx, name: String, line: Int) {
        if (!Regex("^[A-Za-z_]\\w*$").matches(name))
            throw ArbTranspileException(line, "invalid name '$name'")
        if (ctx.temps.contains(name) || ctx.addresses.contains(name) ||
            ctx.params.containsKey(name) || ctx.attribs.containsKey(name) || ctx.outputs.containsKey(name))
            throw ArbTranspileException(line, "duplicate declaration '$name'")
    }

    // ---- declarations --------------------------------------------------------

    private fun handleAttrib(ctx: Ctx, decl: String, line: Int) {
        val eq = decl.indexOf('=')
        if (eq < 0) throw ArbTranspileException(line, "ATTRIB missing '=': $decl")
        val name = decl.substring(0, eq).trim()
        val binding = decl.substring(eq + 1).trim()
        val expr = when (binding) {
            "vertex.position" -> { ctx.usedAttribs.add(ATTRIB_POSITION); "aPosition" }
            "vertex.normal" -> { ctx.usedAttribs.add(ATTRIB_NORMAL); "aNormal" }
            "vertex.color", "vertex.color.primary" -> { ctx.usedAttribs.add(ATTRIB_COLOR); "aColor" }
            "vertex.color.secondary", "vertex.fogcoord", "vertex.weight" -> "vec4(0.0)"
            else -> when (Regex("^vertex\\.texcoord\\[(\\d+)\\]$").matchEntire(binding)?.groupValues?.get(1)?.toIntOrNull()) {
                0 -> { ctx.usedAttribs.add(ATTRIB_TEXCOORD0); "aTexCoord0" }
                1 -> { ctx.usedAttribs.add(ATTRIB_TEXCOORD1); "aTexCoord1" }
                else -> when (Regex("^vertex\\.attrib\\[(\\d+)\\]$").matchEntire(binding)?.groupValues?.get(1)?.toIntOrNull()) {
                    0 -> { ctx.usedAttribs.add(ATTRIB_POSITION); "aPosition" }
                    2 -> { ctx.usedAttribs.add(ATTRIB_NORMAL); "aNormal" }
                    3 -> { ctx.usedAttribs.add(ATTRIB_COLOR); "aColor" }
                    5, 6, 7 -> "vec4(0.0)"
                    8 -> { ctx.usedAttribs.add(ATTRIB_TEXCOORD0); "aTexCoord0" }
                    9 -> { ctx.usedAttribs.add(ATTRIB_TEXCOORD1); "aTexCoord1" }
                    else -> throw ArbTranspileException(line, "unsupported ATTRIB binding: $binding")
                }
            }
        }
        declareName(ctx, name, line)
        ctx.attribs[name] = expr
    }

    private fun handleOutput(ctx: Ctx, decl: String, line: Int) {
        val eq = decl.indexOf('=')
        if (eq < 0) throw ArbTranspileException(line, "OUTPUT missing '=': $decl")
        val name = decl.substring(0, eq).trim()
        declareName(ctx, name, line)
        ctx.outputs[name] = outputRegisterFor(ctx, decl.substring(eq + 1).trim(), line)
    }

    /** Maps a result.* binding to the internal vec4 register it writes (or [DROPPED]). */
    private fun outputRegisterFor(ctx: Ctx, binding: String, line: Int): String = when (binding) {
        "result.position" -> { ctx.positionReferenced = true; "oPosition" }
        "result.color", "result.color.primary" -> "oColor"
        "result.color.secondary" -> { ctx.usesSecondary = true; "oColorSecondary" }
        "result.fogcoord", "result.pointsize" -> DROPPED // no fragment-stage consumer in the FF pipeline
        else -> {
            val n = Regex("^result\\.texcoord\\[(\\d+)\\]$").matchEntire(binding)
                ?.groupValues?.get(1)?.toIntOrNull()
                ?: throw ArbTranspileException(line, "unsupported OUTPUT binding: $binding")
            if (n > 3) throw ArbTranspileException(line, "unsupported texcoord output index $n")
            "oTexCoord$n"
        }
    }

    private fun handleParam(ctx: Ctx, decl: String, line: Int) {
        val eq = decl.indexOf('=')
        if (eq < 0) throw ArbTranspileException(line, "PARAM missing '=': $decl")
        val nameM = Regex("^([A-Za-z_]\\w*)(?:\\[(\\d+)\\])?$").matchEntire(decl.substring(0, eq).trim())
            ?: throw ArbTranspileException(line, "bad PARAM name: ${decl.substring(0, eq).trim()}")
        val name = nameM.groupValues[1]
        val value = decl.substring(eq + 1).trim()

        val binding: ParamBinding = if (value.startsWith("{")) {
            if (!value.endsWith("}")) throw ArbTranspileException(line, "unbalanced braces in PARAM: $value")
            val items = splitTopLevel(value.substring(1, value.length - 1), ',')
            if (items.size == 1) {
                val item = items[0].trim()
                val range = Regex("^program\\.(local|env)\\[(\\d+)\\.\\.(\\d+)\\]$").matchEntire(item)
                if (range != null) {
                    val a = range.groupValues[2].toInt()
                    val b = range.groupValues[3].toInt()
                    if (b < a) throw ArbTranspileException(line, "descending PARAM range: $item")
                    ParamBinding.UniformArray(range.groupValues[1], a, b - a + 1)
                } else when (val ref = resolveReference(item, ctx, line)) {
                    is StateRef.Rows -> ParamBinding.Local(declareLocal(name, ref.exprs))
                    is StateRef.Single -> ParamBinding.Local(declareLocal(name, listOf(ref.expr)))
                    is StateRef.ProgramRef -> ParamBinding.Uniform(ref.kind, ref.index)
                }
            } else if (items.all { it.trim().startsWith("{") }) {
                ParamBinding.Local(declareLocal(name, items.map { parseConstVec4(it.trim(), line) }))
            } else {
                val exprs = items.map { item ->
                    val t = item.trim()
                    if (numberRegex.matches(t)) "vec4(${canonicalNumber(t)})"
                    else when (val ref = resolveReference(t, ctx, line)) {
                        is StateRef.Single -> ref.expr
                        is StateRef.Rows -> throw ArbTranspileException(line, "whole-matrix binding inside a list: $t")
                        is StateRef.ProgramRef -> uniformExpr(ref.kind, ref.index)
                    }
                }
                ParamBinding.Local(declareLocal(name, exprs))
            }
        } else {
            val range = Regex("^program\\.(local|env)\\[(\\d+)\\.\\.(\\d+)\\]$").matchEntire(value)
            if (range != null) {
                val a = range.groupValues[2].toInt()
                val b = range.groupValues[3].toInt()
                if (b < a) throw ArbTranspileException(line, "descending PARAM range: $value")
                ParamBinding.UniformArray(range.groupValues[1], a, b - a + 1)
            } else when (val ref = resolveReference(value, ctx, line)) {
                is StateRef.Single -> ParamBinding.Local(declareLocal(name, listOf(ref.expr)))
                is StateRef.Rows -> ParamBinding.Local(declareLocal(name, ref.exprs))
                is StateRef.ProgramRef -> ParamBinding.Uniform(ref.kind, ref.index)
            }
        }

        when (binding) {
            is ParamBinding.Uniform -> trackUniform(ctx, binding.kind, binding.index, line)
            is ParamBinding.UniformArray -> trackUniform(ctx, binding.kind, binding.base + binding.count - 1, line)
            is ParamBinding.Local -> {}
        }
        declareName(ctx, name, line)
        ctx.params[name] = binding
    }

    private fun declareLocal(name: String, exprs: List<String>): String =
        if (exprs.size == 1) "vec4 $name = ${exprs[0]};"
        else {
            val sb = StringBuilder("vec4 $name[${exprs.size}];")
            for ((i, e) in exprs.withIndex()) sb.append(" $name[$i] = $e;")
            sb.toString()
        }

    private fun parseConstVec4(text: String, line: Int): String {
        if (!text.startsWith("{") || !text.endsWith("}"))
            throw ArbTranspileException(line, "bad constant row: $text")
        val parts = text.substring(1, text.length - 1).split(',')
        if (parts.size != 4) throw ArbTranspileException(line, "constant row must have 4 components: $text")
        return "vec4(${parts.joinToString(", ") { canonicalNumber(it.trim()) }})"
    }

    private fun trackUniform(ctx: Ctx, kind: String, maxIndex: Int, line: Int) {
        if (maxIndex >= ARB_MAX_LOCAL_PARAMETERS)
            throw ArbTranspileException(line, "program.$kind index $maxIndex exceeds supported range")
        if (kind == "local") ctx.maxLocalIndex = maxOf(ctx.maxLocalIndex, maxIndex)
        else ctx.maxEnvIndex = maxOf(ctx.maxEnvIndex, maxIndex)
    }

    /** Resolves a bare PARAM initializer: program.local/env reference or a state binding. */
    private fun resolveReference(text: String, ctx: Ctx, line: Int): StateRef {
        Regex("^program\\.(local|env)\\[(\\d+)\\]$").matchEntire(text)?.let { m ->
            val kind = m.groupValues[1]
            val index = m.groupValues[2].toInt()
            trackUniform(ctx, kind, index, line)
            return StateRef.ProgramRef(kind, index)
        }
        return stateExpr(text, ctx, line)
    }

    // ---- state.matrix / state.light bindings ---------------------------------

    private fun stateExpr(text: String, ctx: Ctx, line: Int): StateRef {
        if (!text.startsWith("state.")) throw ArbTranspileException(line, "unsupported PARAM source: $text")
        val rest = text.substring("state.".length)
        if (rest.startsWith("matrix.")) {
            val m = Regex("^(mvp|modelview|projection|texture|normal)(?:\\[(\\d+)\\])?(?:\\.row\\[(\\d+)\\])?$")
                .matchEntire(rest.substring("matrix.".length))
                ?: throw ArbTranspileException(line, "unsupported state matrix binding: $text")
            val matrix = m.groupValues[1]
            val sub = m.groupValues[2].toIntOrNull()
            val row = m.groupValues[3].toIntOrNull()
            val rows: List<String> = when (matrix) {
                "mvp" -> rowExprs("arbRow(arbMvp, %d)")
                "modelview" -> {
                    if (sub != null && sub != 0) throw ArbTranspileException(line, "only modelview[0] is supported")
                    rowExprs("arbRow(uModelViewMatrix, %d)")
                }
                "projection" -> rowExprs("arbRow(uProjectionMatrix, %d)")
                "texture" -> {
                    val n = sub ?: 0
                    if (n !in 0..2) throw ArbTranspileException(line, "texture matrix index $n out of range")
                    rowExprs("arbRow(uTextureMatrices[$n], %d)")
                }
                "normal" -> {
                    ctx.needsNormalRows = true
                    rowExprs("vec4(arbRow3(arbNormalMat, %d), 0.0)")
                }
                else -> throw ArbTranspileException(line, "unsupported matrix: $matrix")
            }
            return if (row != null) StateRef.Single(rows[row]) else StateRef.Rows(rows)
        }
        return when {
            rest == "lightmodel.ambient" -> {
                ctx.usesLightModelAmbient = true
                return StateRef.Single("uArbLightModelAmbient")
            }
            rest.startsWith("light[") -> {
                val m = Regex("^light\\[(\\d+)\\]\\.(position|ambient|diffuse)$").matchEntire(rest)
                    ?: throw ArbTranspileException(line, "unsupported state binding: $text")
                val n = m.groupValues[1].toInt()
                ctx.usesLightState = true
                ctx.maxLightIndex = maxOf(ctx.maxLightIndex, n)
                return StateRef.Single("uArbLight${m.groupValues[2].replaceFirstChar { it.uppercase() }}[$n]")
            }
            rest.startsWith("lightprod[") -> {
                val m = Regex("^lightprod\\[(\\d+)\\]\\.(ambient|diffuse)$").matchEntire(rest)
                    ?: throw ArbTranspileException(line, "unsupported state binding: $text")
                // Color material: the product uses the (interpolated) vertex colour.
                ctx.usesLightState = true
                ctx.usedAttribs.add(ATTRIB_COLOR)
                ctx.maxLightIndex = maxOf(ctx.maxLightIndex, m.groupValues[1].toInt())
                return StateRef.Single(
                    "(aColor * uArbLight${m.groupValues[2].replaceFirstChar { it.uppercase() }}[${m.groupValues[1]}])"
                )
            }
            rest.startsWith("material.") -> when (rest) {
                "material.ambient", "material.diffuse" -> { ctx.usedAttribs.add(ATTRIB_COLOR); StateRef.Single("aColor") }
                "material.emission" -> StateRef.Single("vec4(0.0)")
                else -> throw ArbTranspileException(line, "unsupported state binding: $text")
            }
            else -> throw ArbTranspileException(line, "unsupported state binding: $text")
        }
    }

    private fun rowExprs(template: String): List<String> = (0..3).map { template.replace("%d", it.toString()) }

    // ---- instructions --------------------------------------------------------

    private fun emitInstruction(ctx: Ctx, stmt: String, line: Int): String {
        // Layout: "<op>[.mods] <dest>, <src1>[, <src2>[, <src3>]]"
        val first = stmt.trim()
        val comma = first.indexOf(',')
        if (comma < 0) throw ArbTranspileException(line, "instruction missing destination: $stmt")
        val head = first.substring(0, comma).trim()
        val sp = head.indexOf(' ')
        if (sp < 0) throw ArbTranspileException(line, "malformed instruction: $stmt")
        val opToken = head.substring(0, sp).trim()
        val destToken = head.substring(sp + 1).trim()
        val sat = opToken.endsWith("_SAT")
        val op = (if (sat) opToken.removeSuffix("_SAT") else opToken).uppercase()
        if (destToken.isEmpty()) throw ArbTranspileException(line, "instruction missing destination: $stmt")
        val dest = parseDest(ctx, destToken, line, op == "ARL")
        if (dest.dropped) return ""
        val srcs = splitTopLevel(first.substring(comma + 1), ',').map { parseOperand(ctx, it, line) }
        val mask = dest.mask

        // Component i of an operand, with abs/negate modifiers applied.
        fun comp(o: Operand, i: Int): String {
            var e = if (o.isNumber) o.base else "${o.base}.${(o.swizzle ?: "xyzw")[i]}"
            if (o.abs) e = "abs($e)"
            if (o.negate) e = "(-$e)"
            return e
        }

        // xyz of an operand (for dot products).
        fun vec3(o: Operand): String {
            var e = if (o.isNumber) "vec3(${o.base})" else "${o.base}.${(o.swizzle ?: "xyzw").substring(0, 3)}"
            if (o.abs) e = "abs($e)"
            if (o.negate) e = "(-$e)"
            return e
        }

        fun assign(rhs: String): String {
            val e = if (sat) "clamp($rhs, 0.0, 1.0)" else rhs
            // Scalar results (dot products, RCP, RSQ, …) broadcast across the write mask,
            // so a multi-component mask needs a matching vec constructor; a full mask
            // writes the whole vec4 directly. Sized RHS (from vecAssign) re-wraps safely.
            return when (mask.length) {
                4 -> "${dest.name} = vec4($e);"
                3 -> "${dest.name}.$mask = vec3($e);"
                2 -> "${dest.name}.$mask = vec2($e);"
                else -> "${dest.name}.$mask = $e;"
            }
        }

        fun vecAssign(formulas: Map<Char, String>): String {
            val comps = mask.map { m -> formulas[m] ?: "0.0" }
            val rhs = if (comps.size == 1) comps[0] else "vec${comps.size}(${comps.joinToString(", ")})"
            return assign(rhs)
        }

        return when (op) {
            "ARL" -> {
                if (srcs.size != 1) throw ArbTranspileException(line, "ARL takes 1 source")
                if (!ctx.addresses.contains(dest.name))
                    throw ArbTranspileException(line, "ARL destination must be an ADDRESS register")
                "${dest.name} = int(floor(${comp(srcs[0], 0)}));"
            }

            "MOV" -> {
                if (srcs.size != 1) throw ArbTranspileException(line, "MOV takes 1 source")
                vecAssign(mapOf('x' to comp(srcs[0], 0), 'y' to comp(srcs[0], 1), 'z' to comp(srcs[0], 2), 'w' to comp(srcs[0], 3)))
            }

            "ADD", "SUB", "MUL", "MIN", "MAX", "SLT", "SGE" -> {
                if (srcs.size != 2) throw ArbTranspileException(line, "$op takes 2 sources")
                val formulas = charArrayOf('x', 'y', 'z', 'w').associate { c ->
                    val i = "xyzw".indexOf(c)
                    val a = comp(srcs[0], i)
                    val b = comp(srcs[1], i)
                    c to when (op) {
                        "ADD" -> "($a + $b)"
                        "SUB" -> "($a - $b)"
                        "MUL" -> "($a * $b)"
                        "MIN" -> "min($a, $b)"
                        "MAX" -> "max($a, $b)"
                        "SLT" -> "(($a < $b) ? 1.0 : 0.0)"
                        else -> "(($a >= $b) ? 1.0 : 0.0)"
                    }
                }
                vecAssign(formulas)
            }

            "MAD" -> {
                if (srcs.size != 3) throw ArbTranspileException(line, "MAD takes 3 sources")
                vecAssign(charArrayOf('x', 'y', 'z', 'w').associate { c ->
                    val i = "xyzw".indexOf(c)
                    c to "(${comp(srcs[0], i)} * ${comp(srcs[1], i)} + ${comp(srcs[2], i)})"
                })
            }

            "DP3", "DP4", "DPH" -> {
                if (srcs.size != 2) throw ArbTranspileException(line, "$op takes 2 sources")
                fun fullVec(o: Operand): String {
                    var e = if (o.isNumber) "vec4(${o.base})" else "${o.base}.${o.swizzle ?: "xyzw"}"
                    if (o.abs) e = "abs($e)"
                    if (o.negate) e = "(-$e)"
                    return e
                }
                val rhs = when (op) {
                    "DP3" -> "dot(${vec3(srcs[0])}, ${vec3(srcs[1])})"
                    "DP4" -> "dot(${fullVec(srcs[0])}, ${fullVec(srcs[1])})"
                    else -> "dot(${vec3(srcs[0])}, ${vec3(srcs[1])}) + ${comp(srcs[1], 3)}"
                }
                assign(rhs) // scalar broadcasts across the write mask
            }

            "DST" -> {
                if (srcs.size != 2) throw ArbTranspileException(line, "DST takes 2 sources")
                vecAssign(mapOf(
                    'x' to "1.0",
                    'y' to "(${comp(srcs[0], 1)} * ${comp(srcs[1], 1)})",
                    'z' to comp(srcs[0], 2),
                    'w' to comp(srcs[1], 3),
                ))
            }

            "XPD" -> {
                if (srcs.size != 2) throw ArbTranspileException(line, "XPD takes 2 sources")
                vecAssign(mapOf(
                    'x' to "(${comp(srcs[0], 1)} * ${comp(srcs[1], 2)} - ${comp(srcs[0], 2)} * ${comp(srcs[1], 1)})",
                    'y' to "(${comp(srcs[0], 2)} * ${comp(srcs[1], 0)} - ${comp(srcs[0], 0)} * ${comp(srcs[1], 2)})",
                    'z' to "(${comp(srcs[0], 0)} * ${comp(srcs[1], 1)} - ${comp(srcs[0], 1)} * ${comp(srcs[1], 0)})",
                ))
            }

            "RCP" -> {
                if (srcs.size != 1) throw ArbTranspileException(line, "RCP takes 1 source")
                assign("(1.0 / ${comp(srcs[0], 0)})")
            }

            "RSQ" -> {
                if (srcs.size != 1) throw ArbTranspileException(line, "RSQ takes 1 source")
                assign("inversesqrt(abs(${comp(srcs[0], 0)}))")
            }

            "EX2" -> {
                if (srcs.size != 1) throw ArbTranspileException(line, "EX2 takes 1 source")
                assign("exp2(${comp(srcs[0], 0)})")
            }

            "LG2" -> {
                if (srcs.size != 1) throw ArbTranspileException(line, "LG2 takes 1 source")
                assign("log2(abs(${comp(srcs[0], 0)}))")
            }

            "FLR", "FRC" -> {
                if (srcs.size != 1) throw ArbTranspileException(line, "$op takes 1 source")
                val fn = if (op == "FLR") "floor" else "fract"
                vecAssign(charArrayOf('x', 'y', 'z', 'w').associate { c ->
                    val i = "xyzw".indexOf(c)
                    c to "$fn(${comp(srcs[0], i)})"
                })
            }

            "POW" -> {
                if (srcs.size != 2) throw ArbTranspileException(line, "POW takes 2 sources")
                assign("pow(abs(${comp(srcs[0], 0)}), abs(${comp(srcs[1], 0)}))")
            }

            "EXP" -> {
                if (srcs.size != 1) throw ArbTranspileException(line, "EXP takes 1 source")
                val x = comp(srcs[0], 0)
                vecAssign(mapOf(
                    'x' to "exp2(floor($x))",
                    'y' to "($x - floor($x))",
                    'z' to "exp2($x)",
                    'w' to "1.0",
                ))
            }

            "LOG" -> {
                if (srcs.size != 1) throw ArbTranspileException(line, "LOG takes 1 source")
                val y = "log2(abs(${comp(srcs[0], 0)}))"
                vecAssign(mapOf(
                    'x' to "floor($y)",
                    'y' to "fract($y)",
                    'z' to y,
                    'w' to "1.0",
                ))
            }

            "LIT" -> {
                if (srcs.size != 1) throw ArbTranspileException(line, "LIT takes 1 source")
                val sx = comp(srcs[0], 0)
                val sy = comp(srcs[0], 1)
                val sw = comp(srcs[0], 3)
                vecAssign(mapOf(
                    'x' to "1.0",
                    'y' to "max($sx, 0.0)",
                    'z' to "((max($sx, 0.0) > 0.0) ? pow(max($sy, 0.0), clamp($sw, -127.996, 128.0)) : 0.0)",
                    'w' to "1.0",
                ))
            }

            "SWZ" -> {
                if (srcs.size != 1) throw ArbTranspileException(line, "SWZ takes 1 source")
                // SWZ's extended swizzle (.x-y-0w style with 0/1 constants) is parsed by
                // parseOperand's extended-swizzle branch and already normalized.
                vecAssign(mapOf('x' to comp(srcs[0], 0), 'y' to comp(srcs[0], 1), 'z' to comp(srcs[0], 2), 'w' to comp(srcs[0], 3)))
            }

            else -> throw ArbTranspileException(line, "unsupported instruction: $opToken")
        }
    }

    // ---- operand / destination parsing ----------------------------------------

    private fun parseDest(ctx: Ctx, text: String, line: Int, allowAddress: Boolean): Dest {
        val dot = text.indexOf('.')
        var name = text
        var mask = "xyzw"
        if (dot >= 0) {
            name = text.substring(0, dot).trim()
            mask = normalizeWriteMask(text.substring(dot + 1).trim(), line)
        }
        val dest = Dest(name, mask)
        when {
            name.startsWith("result.") -> {
                val reg = outputRegisterFor(ctx, name, line)
                if (reg == DROPPED) {
                    dest.dropped = true
                } else {
                    dest.name = reg
                    if (reg == "oPosition") ctx.positionWritten = true
                }
            }
            ctx.temps.contains(name) -> {}
            ctx.addresses.contains(name) -> if (!allowAddress)
                throw ArbTranspileException(line, "address register '$name' written outside ARL")
            ctx.outputs.containsKey(name) -> {
                val reg = ctx.outputs.getValue(name)
                if (reg == DROPPED) dest.dropped = true
                else {
                    dest.name = reg
                    if (reg == "oPosition") ctx.positionWritten = true
                }
            }
            else -> throw ArbTranspileException(line, "write to undeclared register '$name'")
        }
        return dest
    }

    private fun normalizeWriteMask(mask: String, line: Int): String {
        val mapped = mask.map { c ->
            when (c) {
                'r' -> 'x'; 'g' -> 'y'; 'b' -> 'z'; 'a' -> 'w'
                's' -> 'x'; 't' -> 'y'; 'p' -> 'z'; 'q' -> 'w'
                else -> c
            }
        }.joinToString("")
        if (!Regex("^[xyzw]{1,4}$").matches(mapped)) throw ArbTranspileException(line, "bad write mask '.$mask'")
        return mapped
    }

    private fun parseOperand(ctx: Ctx, text: String, line: Int): Operand {
        var t = text
        var negate = false
        var abs = false
        while (true) {
            t = t.trim()
            if (t.startsWith("-")) { negate = !negate; t = t.substring(1) }
            else if (t.startsWith("|") && t.endsWith("|") && t.length >= 2) { abs = !abs; t = t.substring(1, t.length - 1) }
            else break
        }
        t = t.trim()

        if (numberRegex.matches(t)) return Operand(canonicalNumber(t), isNumber = true, swizzle = null, negate = negate, abs = abs)

        // Declared registers (temps/outputs/attribs/params) never contain '.', so match the
        // name up to the first '.' or '[' and parse an explicit [index] and .swizzle tail.
        val nameEnd = t.indexOfFirst { it == '.' || it == '[' }
        val candidate = if (nameEnd < 0) t else t.substring(0, nameEnd)
        val isDeclared = ctx.temps.contains(candidate) || ctx.outputs.containsKey(candidate) ||
            ctx.attribs.containsKey(candidate) || ctx.params.containsKey(candidate) || ctx.addresses.contains(candidate)

        if (isDeclared) {
            var rest = if (nameEnd < 0) "" else t.substring(nameEnd)
            var indexText: String? = null
            if (rest.startsWith("[")) {
                val close = rest.indexOf(']')
                if (close < 0) throw ArbTranspileException(line, "unbalanced index in '$text'")
                indexText = rest.substring(1, close)
                rest = rest.substring(close + 1)
            }
            var swizzle: String? = null
            if (rest.startsWith(".")) {
                swizzle = normalizeSwizzle(rest.substring(1))
                rest = ""
            }
            if (rest.isNotEmpty()) throw ArbTranspileException(line, "unparseable operand '$text'")

            val baseExpr = when {
                ctx.temps.contains(candidate) -> {
                    if (indexText != null) throw ArbTranspileException(line, "TEMP registers cannot be indexed: $text")
                    candidate
                }
                ctx.outputs.containsKey(candidate) -> {
                    val reg = ctx.outputs.getValue(candidate)
                    if (reg == DROPPED) throw ArbTranspileException(line, "read of dropped output '$candidate'")
                    if (indexText != null) throw ArbTranspileException(line, "OUTPUT registers cannot be indexed: $text")
                    reg
                }
                ctx.attribs.containsKey(candidate) -> {
                    if (indexText != null) throw ArbTranspileException(line, "ATTRIB registers cannot be indexed: $text")
                    ctx.attribs.getValue(candidate)
                }
                ctx.params.containsKey(candidate) -> paramExpr(ctx, ctx.params.getValue(candidate), candidate, indexText, line)
                else -> throw ArbTranspileException(line, "address register '$candidate' used as a source")
            }
            return Operand(baseExpr, isNumber = false, swizzle = swizzle, negate = negate, abs = abs)
        }

        // Inline program.local[i] / program.env[i] sources.
        Regex("^program\\.(local|env)\\[(\\d+)\\]$").matchEntire(t)?.let { m ->
            val kind = m.groupValues[1]
            val index = m.groupValues[2].toInt()
            trackUniform(ctx, kind, index, line)
            return Operand(uniformExpr(kind, index), isNumber = false, swizzle = null, negate = negate, abs = abs)
        }

        // Inline state.* sources: state.light[0].position, state.matrix.texture[0].row[1], ...
        // An optional trailing component swizzle is stripped only when the token does not
        // already match the state grammar (state keywords like .mvp/.modelview end in
        // letters that overlap the swizzle alphabets).
        if (t.startsWith("state.")) {
            val direct = tryResolveState(t, ctx, line)
            if (direct != null) return direct
            val m = Regex("^(.+)\\.([xyzw]{1,4}|[rgba]{1,4}|[stpq]{1,4})$").matchEntire(t)
            if (m != null) {
                val stripped = tryResolveState(m.groupValues[1], ctx, line)
                if (stripped != null) {
                    return Operand(stripped.base, isNumber = false, swizzle = normalizeSwizzle(m.groupValues[2]), negate = negate, abs = abs)
                }
            }
            throw ArbTranspileException(line, "unsupported state source: $text")
        }

        throw ArbTranspileException(line, "reference to undeclared register '$text'")
    }

    /** Resolves a state.* token to an operand base expression, or null if it doesn't parse. */
    private fun tryResolveState(t: String, ctx: Ctx, line: Int): Operand? {
        val ref = try {
            stateExpr(t, ctx, line)
        } catch (e: ArbTranspileException) {
            return null
        }
        return when (ref) {
            is StateRef.Single -> Operand(ref.expr, isNumber = false, swizzle = null, negate = false, abs = false)
            is StateRef.Rows -> throw ArbTranspileException(line, "whole-matrix binding used as a source: $t")
            is StateRef.ProgramRef -> Operand(uniformExpr(ref.kind, ref.index), isNumber = false, swizzle = null, negate = false, abs = false)
        }
    }

    private fun paramExpr(ctx: Ctx, p: ParamBinding, name: String, indexText: String?, line: Int): String = when (p) {
        is ParamBinding.Uniform -> {
            if (indexText != null) throw ArbTranspileException(line, "scalar PARAM '$name' cannot be indexed")
            uniformExpr(p.kind, p.index)
        }
        is ParamBinding.UniformArray -> {
            val idx = indexText ?: throw ArbTranspileException(line, "array PARAM '$name' requires an index")
            val t = idx.trim()
            val k = t.toIntOrNull()
            if (k != null) {
                if (k < 0 || k >= p.count) throw ArbTranspileException(line, "PARAM index $k out of range for '$name'")
                uniformExpr(p.kind, p.base + k)
            } else {
                // Relative addressing: [addrReg.x] or [addrReg.x + offset]
                val rel = Regex("^([A-Za-z_]\\w*)\\.x(?:\\s*\\+\\s*(\\d+))?$").matchEntire(t)
                    ?: throw ArbTranspileException(line, "unsupported PARAM index expression '$idx' for '$name'")
                val addr = rel.groupValues[1]
                if (!ctx.addresses.contains(addr))
                    throw ArbTranspileException(line, "relative index uses undeclared ADDRESS '$addr'")
                val off = rel.groupValues[2].toIntOrNull() ?: 0
                val slot = if (p.base == 0 && off == 0) addr else "${p.base} + $addr" + if (off != 0) " + $off" else ""
                uniformExpr(p.kind, -1).substringBefore('[') + "[$slot]"
            }
        }
        is ParamBinding.Local -> {
            if (indexText == null) name
            else {
                val k = indexText.trim().toIntOrNull()
                    ?: throw ArbTranspileException(line, "materialized PARAM '$name' only supports constant indices")
                "$name[$k]"
            }
        }
    }

    private fun normalizeSwizzle(s: String): String {
        val mapped = s.map { c ->
            when (c) {
                'r' -> 'x'; 'g' -> 'y'; 'b' -> 'z'; 'a' -> 'w'
                's' -> 'x'; 't' -> 'y'; 'p' -> 'z'; 'q' -> 'w'
                else -> c
            }
        }.joinToString("")
        // ARB partial swizzles replicate cyclically to fill 4 components.
        return (mapped + mapped + mapped + mapped).substring(0, 4)
    }

    // ---- GLSL assembly ---------------------------------------------------------

    private fun buildGlsl(ctx: Ctx, body: List<String>): String {
        // Programs that never write result.position get the standard transform, which needs
        // the position attribute — decide before emitting the attribute declarations.
        if (!ctx.positionWritten) ctx.usedAttribs.add(ATTRIB_POSITION)
        val sb = StringBuilder()
        sb.append("#version 300 es\n")
        sb.append("precision highp float;\n")
        sb.append("// Transpiled from ARB_vertex_program (ARBvp1.0) for WebGL2.\n")
        sb.append("uniform mat4 uModelViewMatrix;\n")
        sb.append("uniform mat4 uProjectionMatrix;\n")
        sb.append("uniform mat4 uTextureMatrices[3];\n")
        if (ctx.maxLocalIndex >= 0) sb.append("uniform vec4 uProgramLocal[${ctx.maxLocalIndex + 1}];\n")
        if (ctx.maxEnvIndex >= 0) sb.append("uniform vec4 uProgramEnv[${ctx.maxEnvIndex + 1}];\n")
        if (ctx.usesLightModelAmbient) sb.append("uniform vec4 uArbLightModelAmbient;\n")
        if (ctx.usesLightState) {
            val n = ctx.maxLightIndex + 1
            sb.append("uniform vec4 uArbLightPosition[$n];\n")
            sb.append("uniform vec4 uArbLightAmbient[$n];\n")
            sb.append("uniform vec4 uArbLightDiffuse[$n];\n")
        }
        if (ATTRIB_POSITION in ctx.usedAttribs) sb.append("layout(location = 0) in vec4 aPosition;\n")
        if (ATTRIB_COLOR in ctx.usedAttribs) sb.append("layout(location = 1) in vec4 aColor;\n")
        if (ATTRIB_TEXCOORD0 in ctx.usedAttribs) sb.append("layout(location = 2) in vec4 aTexCoord0;\n")
        if (ATTRIB_NORMAL in ctx.usedAttribs) sb.append("layout(location = 3) in vec4 aNormal;\n")
        if (ATTRIB_TEXCOORD1 in ctx.usedAttribs) sb.append("layout(location = 4) in vec4 aTexCoord1;\n")
        sb.append("out vec4 vColor;\n")
        sb.append("out vec3 vTexCoord0;\n")
        sb.append("out vec3 vTexCoord1;\n")
        sb.append("out vec3 vTexCoord2;\n")
        if (ctx.usesSecondary) sb.append("out vec4 vColorSecondary;\n")
        // Must match FixedFunctionShader.VERTEX_SOURCE's own invariant gl_Position declaration -
        // see the comment on the fallback assignment below.
        sb.append("invariant gl_Position;\n")
        sb.append("vec4 arbRow(mat4 m, int r) { return vec4(m[0][r], m[1][r], m[2][r], m[3][r]); }\n")
        if (ctx.needsNormalRows) sb.append("vec3 arbRow3(mat3 m, int r) { return vec3(m[0][r], m[1][r], m[2][r]); }\n")

        sb.append("void main() {\n")
        sb.append("    mat4 arbMvp = uProjectionMatrix * uModelViewMatrix;\n")
        if (ctx.needsNormalRows) sb.append("    mat3 arbNormalMat = mat3(uModelViewMatrix);\n")

        // Result registers, defaulted per the fixed-function conventions.
        sb.append("    vec4 oColor = vec4(1.0);\n")
        sb.append("    vec4 oTexCoord0 = vec4(0.0, 0.0, 0.0, 1.0);\n")
        sb.append("    vec4 oTexCoord1 = vec4(0.0);\n")
        sb.append("    vec4 oTexCoord2 = vec4(0.0);\n")
        sb.append("    vec4 oTexCoord3 = vec4(0.0);\n")
        if (ctx.usesSecondary) sb.append("    vec4 oColorSecondary = vec4(0.0);\n")
        if (ctx.positionReferenced) sb.append("    vec4 oPosition = vec4(0.0);\n")

        for (p in ctx.params.values) {
            if (p is ParamBinding.Local) sb.append("    ${p.decl}\n")
        }
        for (t in ctx.temps) sb.append("    vec4 $t = vec4(0.0);\n")
        for (a in ctx.addresses) sb.append("    int $a = 0;\n")
        for (code in body) {
            if (code.isNotEmpty()) sb.append("    ").append(code).append('\n')
        }

        sb.append("    vColor = oColor;\n")
        sb.append("    vTexCoord0 = oTexCoord0.xyz;\n")
        sb.append("    vTexCoord1 = oTexCoord1.xyz;\n")
        sb.append("    vTexCoord2 = oTexCoord2.xyz;\n")
        if (ctx.usesSecondary) sb.append("    vColorSecondary = oColorSecondary;\n")
        if (ctx.positionWritten) {
            sb.append("    gl_Position = oPosition;\n")
        } else {
            // ARB_position_invariant requires gl_Position to match the fixed-function pipeline's
            // transform bit-for-bit (that's the whole point of the option: mixing
            // position-invariant vertex-program draws with fixed-function draws of coincident
            // geometry - e.g. water meeting terrain - must not z-fight). Floating point is not
            // associative, so this has to reproduce FixedFunctionShader's VERTEX_SOURCE operation
            // order (uProjection * (uModelView * aPosition), i.e. transform to view space first,
            // then project) rather than pre-multiplying the two matrices together first.
            sb.append("    gl_Position = uProjectionMatrix * (uModelViewMatrix * aPosition);\n")
        }
        sb.append("}\n")
        return sb.toString()
    }

    // ---- helpers ---------------------------------------------------------------

    private fun uniformExpr(kind: String, index: Int): String =
        if (index < 0) (if (kind == "local") "uProgramLocal" else "uProgramEnv")
        else if (kind == "local") "uProgramLocal[$index]" else "uProgramEnv[$index]"

    private fun canonicalNumber(raw: String): String {
        var s = raw.trim()
        if (s.startsWith("+")) s = s.substring(1)
        if (!s.contains('.') && !s.contains('e') && !s.contains('E')) s += ".0"
        return s
    }

    private fun splitTopLevel(text: String, sep: Char): List<String> {
        val out = mutableListOf<String>()
        var depth = 0
        val cur = StringBuilder()
        for (c in text) {
            when (c) {
                '{', '(' -> { depth++; cur.append(c) }
                '}', ')' -> { depth--; cur.append(c) }
                sep -> if (depth == 0) { out.add(cur.toString().trim()); cur.setLength(0) } else cur.append(c)
                else -> cur.append(c)
            }
        }
        if (cur.isNotBlank()) out.add(cur.toString().trim())
        return out
    }
}

/** Maximum number of program.local/program.env vector slots the shim will allocate. */
internal const val ARB_MAX_LOCAL_PARAMETERS = 128

/** Extra fragment texture units reserved for sampler3D bindings (logical units 0..2). */
internal const val FF_TEXTURE_3D_SAMPLER_UNIT = 3

/**
 * Runtime counterpart of one ARB vertex program handle: holds the transpiled GLSL, the
 * program.local parameter block, and the compiled WebGL program (transpiled vertex stage
 * paired with the fixed-function fragment stage).
 */
internal class ArbProgramRuntime {
    var status: Status = Status.EMPTY
        private set
    var errorLine: Int = 0
        private set
    var errorText: String? = null
        private set

    enum class Status { EMPTY, OK, FAILED }

    private var vertexSource: String? = null
    private var maxLocalIndex = -1
    private var maxLightIndex = -1
    private var usesLightModelAmbient = false
    private var usesLightState = false

    val localParams = FloatArray(ARB_MAX_LOCAL_PARAMETERS * 4)
    var localDirty = true
        private set

    private var built = false
    private var program: WebGLProgram? = null
    private var uModelViewMatrix: WebGLUniformLocation? = null
    private var uProjectionMatrix: WebGLUniformLocation? = null
    private var uTextureMatrices: Array<WebGLUniformLocation?> = arrayOfNulls(3)

    // Per-program (this instance is 1:1 with a linked WebGLProgram) dirty tracking for
    // useAndUpload(), mirroring GlState.prepareDraw()'s fixed-function/compat matrix caching.
    // matrixStack.version() is an idempotent counter, safe for multiple independent readers to
    // compare against their own last-seen value - unlike a single shared "dirty" boolean, which
    // is exactly the pattern that caused the cross-program stale-lighting bug documented on
    // GlState.ffpLightingDirty (one reader consuming the flag starved every other reader).
    private var lastModelViewVersion = -1
    private var lastProjectionVersion = -1
    private val lastTextureMatrixVersion = intArrayOf(-1, -1, -1)

    // Reused scratch buffers for the per-draw light-array uniform uploads, avoiding 3 fresh
    // FloatArray allocations (lightsArray()) every single draw when usesLightState is true.
    private val lightPositionScratch = FloatArray(MAX_LIGHTS * 4)
    private val lightAmbientScratch = FloatArray(MAX_LIGHTS * 4)
    private val lightDiffuseScratch = FloatArray(MAX_LIGHTS * 4)
    private var uProgramLocal: WebGLUniformLocation? = null
    private var uArbLightModelAmbient: WebGLUniformLocation? = null
    private var uArbLightAmbient: WebGLUniformLocation? = null
    private var uArbLightDiffuse: WebGLUniformLocation? = null
    private var uArbLightPosition: WebGLUniformLocation? = null
    private var frag: FfFragmentUniformLocations? = null

    /**
     * Loads (transpiles + compiles + links) an ARBvp source. [errorLine] is used when the
     * GLSL compile/link fails (the transpiler throws its own line for parse failures).
     */
    fun loadSource(gl: WebGL2RenderingContext, source: String, errorLine: Int): Boolean {
        val result: ArbVertexProgramTranspiler.Result = try {
            ArbVertexProgramTranspiler.transpile(source)
        } catch (e: ArbTranspileException) {
            status = Status.FAILED
            this.errorLine = e.line
            this.errorText = e.message
            println("ARBvp load FAILED at statement #$e.line: ${e.message}")
            return false
        } catch (t: Throwable) {
            // A transpiler bug must never surface as an uncaught JS error (e.g. a RegExp
            // SyntaxError from an engine quirk); treat it like any other program failure.
            status = Status.FAILED
            this.errorLine = errorLine
            this.errorText = "transpiler internal error: $t"
            println("ARBvp transpile: internal error: $t")
            return false
        }
        vertexSource = result.glslSource
        maxLocalIndex = result.maxLocalIndex
        maxLightIndex = result.maxLightIndex
        usesLightModelAmbient = result.usesLightModelAmbient
        usesLightState = result.usesLightState
        localDirty = true
        if (!build(gl)) {
            status = Status.FAILED
            this.errorLine = errorLine
            this.errorText = "transpiled shader compile/link failed"
            println("ARBvp load FAILED: transpiled shader did not compile/link")
            return false
        }
        status = Status.OK
        println(
            "ARBvp program loaded (locals[0..$maxLocalIndex], lights[0..$maxLightIndex]" +
                (if (usesLightState) ", lightState" else "") +
                (if (usesLightModelAmbient) ", lightModelAmbient" else "") +
                ")"
        )
        return true
    }

    private fun build(gl: WebGL2RenderingContext): Boolean {
        val vsSource = vertexSource ?: return false
        return try {
            val vs = gl.createShader(WebGL2RenderingContext.VERTEX_SHADER) ?: return false
            gl.shaderSource(vs, vsSource)
            gl.compileShader(vs)
            if (gl.getShaderParameter(vs, WebGL2RenderingContext.COMPILE_STATUS) == false) {
                println("ARBvp transpile: vertex shader compile failed: ${gl.getShaderInfoLog(vs)}")
                return false
            }
            val fs = gl.createShader(WebGL2RenderingContext.FRAGMENT_SHADER) ?: return false
            gl.shaderSource(fs, FF_FRAGMENT_SOURCE)
            gl.compileShader(fs)
            if (gl.getShaderParameter(fs, WebGL2RenderingContext.COMPILE_STATUS) == false) {
                println("ARBvp transpile: fragment shader compile failed: ${gl.getShaderInfoLog(fs)}")
                return false
            }
            val prog = gl.createProgram() ?: return false
            gl.attachShader(prog, vs)
            gl.attachShader(prog, fs)
            gl.linkProgram(prog)
            if (gl.getProgramParameter(prog, WebGL2RenderingContext.LINK_STATUS) == false) {
                println("ARBvp transpile: link failed: ${gl.getProgramInfoLog(prog)}")
                return false
            }
            program = prog
            uModelViewMatrix = gl.getUniformLocation(prog, "uModelViewMatrix")
            uProjectionMatrix = gl.getUniformLocation(prog, "uProjectionMatrix")
            for (u in 0..2) uTextureMatrices[u] = gl.getUniformLocation(prog, "uTextureMatrices[$u]")
            uProgramLocal = if (maxLocalIndex >= 0) gl.getUniformLocation(prog, "uProgramLocal[0]") else null
            uArbLightModelAmbient = if (usesLightModelAmbient) gl.getUniformLocation(prog, "uArbLightModelAmbient") else null
            uArbLightAmbient = if (usesLightState) gl.getUniformLocation(prog, "uArbLightAmbient[0]") else null
            uArbLightDiffuse = if (usesLightState) gl.getUniformLocation(prog, "uArbLightDiffuse[0]") else null
            uArbLightPosition = if (usesLightState) gl.getUniformLocation(prog, "uArbLightPosition[0]") else null
            frag = FfFragmentUniformLocations(gl, prog)
            // Sampler unit assignment identical to the fixed-function program.
            gl.useProgram(prog)
            for (unit in 0..2) {
                gl.uniform1i(gl.getUniformLocation(prog, "uTexture$unit"), unit)
                gl.uniform1i(gl.getUniformLocation(prog, "uTexture3D$unit"), FF_TEXTURE_3D_SAMPLER_UNIT + unit)
            }
            gl.uniform1i(gl.getUniformLocation(prog, "uTextureCube1"), CUBE_SAMPLER_UNIT + 1)
            gl.uniform1i(gl.getUniformLocation(prog, "uTextureCube2"), CUBE_SAMPLER_UNIT + 2)
            gl.useProgram(null)
            built = true
            true
        } catch (t: Throwable) {
            println("ARBvp transpile: unexpected error: $t")
            false
        }
    }

    fun setLocalParameter(index: Int, x: Float, y: Float, z: Float, w: Float) {
        if (index < 0 || index >= ARB_MAX_LOCAL_PARAMETERS) return
        localParams[index * 4] = x
        localParams[index * 4 + 1] = y
        localParams[index * 4 + 2] = z
        localParams[index * 4 + 3] = w
        localDirty = true
    }

    fun delete(gl: WebGL2RenderingContext) {
        program?.let { gl.deleteProgram(it) }
        program = null
        built = false
        status = Status.EMPTY
    }

    /**
     * Binds the transpiled program and uploads all per-draw state. Returns false when the
     * program is unusable so the caller can fall back to the fixed-function pipeline.
     */
    fun useAndUpload(gl: WebGL2RenderingContext, state: GlState): Boolean {
        val prog = program
        if (!built || prog == null) return false
        gl.useProgram(prog)

        val mvVersion = state.matrixStack.version(GL_MODELVIEW)
        if (mvVersion != lastModelViewVersion) {
            lastModelViewVersion = mvVersion
            gl.uniformMatrix4fv(uModelViewMatrix, false, state.matrixStack.modelview().asFloat32Array())
        }
        val projVersion = state.matrixStack.version(GL_PROJECTION)
        if (projVersion != lastProjectionVersion) {
            lastProjectionVersion = projVersion
            gl.uniformMatrix4fv(uProjectionMatrix, false, state.matrixStack.projection().asFloat32Array())
        }
        for (u in 0..2) {
            val loc = uTextureMatrices[u] ?: continue
            val texVersion = state.matrixStack.version(GL_TEXTURE_MATRIX, u)
            if (texVersion == lastTextureMatrixVersion[u]) continue
            lastTextureMatrixVersion[u] = texVersion
            gl.uniformMatrix4fv(loc, false, state.matrixStack.textureMatrix(u).asFloat32Array())
        }
        if (localDirty) {
            localDirty = false
            val loc = uProgramLocal
            if (loc != null && maxLocalIndex >= 0) {
                gl.uniform4fv(loc, localParams.asFloat32Array().subarray(0, (maxLocalIndex + 1) * 4))
            }
        }
        if (usesLightModelAmbient) {
            uArbLightModelAmbient?.let { gl.uniform4fv(it, state.globalAmbient.asFloat32Array()) }
        }
        if (usesLightState) {
            val n = maxLightIndex + 1
            uArbLightPosition?.let { loc -> gl.uniform4fv(loc, fillLightsArray(lightPositionScratch, state.lightPosition, n)) }
            uArbLightAmbient?.let { loc -> gl.uniform4fv(loc, fillLightsArray(lightAmbientScratch, state.lightAmbient, n)) }
            uArbLightDiffuse?.let { loc -> gl.uniform4fv(loc, fillLightsArray(lightDiffuseScratch, state.lightDiffuse, n)) }
        }
        val f = frag
        if (f != null) uploadFfFragmentUniforms(gl, state, f, prog, state.ffpStateDirty)
        return true
    }

    /** Fills [scratch] (reused across draws) with [count] light vec4s and returns the used-prefix view. */
    private fun fillLightsArray(scratch: FloatArray, lights: Array<FloatArray>, count: Int): Float32Array {
        for (i in 0 until count) lights[i].copyInto(scratch, i * 4, 0, 4)
        return scratch.asFloat32Array().subarray(0, count * 4)
    }
}
