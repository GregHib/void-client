#!/usr/bin/env python3
from __future__ import annotations

import argparse
import dataclasses
import json
import math
import re
import sys
import zipfile
from collections import Counter, defaultdict
from pathlib import Path
from typing import DefaultDict, Iterable, Iterator


class ClassFileFormatError(RuntimeError):
    pass


def _u1(buf: bytes, off: int) -> tuple[int, int]:
    return buf[off], off + 1


def _u2(buf: bytes, off: int) -> tuple[int, int]:
    return int.from_bytes(buf[off : off + 2], "big"), off + 2


def _u4(buf: bytes, off: int) -> tuple[int, int]:
    return int.from_bytes(buf[off : off + 4], "big"), off + 4


def _bytes(buf: bytes, off: int, n: int) -> tuple[bytes, int]:
    return buf[off : off + n], off + n


@dataclasses.dataclass(frozen=True)
class ParsedMethod:
    name: str
    desc: str
    code_op_hist: Counter[int]
    code_insn_count: int


@dataclasses.dataclass(frozen=True)
class ParsedClass:
    internal_name: str
    super_internal_name: str | None
    interfaces: tuple[str, ...]
    fields_desc_norm: tuple[str, ...]
    methods_desc_norm: tuple[str, ...]
    strings: frozenset[str]
    opcode_hist: Counter[int]


_DESCRIPTOR_OBJ_RE = re.compile(r"L[^;]+;")


def _normalize_descriptor(desc: str) -> str:
    """
    Normalize descriptors so cross-revision comparisons aren't dominated by renamed types.
    Keep java.* / javax.* / sun.* object types, and collapse the rest to 'Lx;'.
    """

    def repl(match: re.Match[str]) -> str:
        t = match.group(0)  # like 'Lcom/foo/Bar;'
        if t.startswith("Ljava/") or t.startswith("Ljavax/") or t.startswith("Lsun/"):
            return t
        return "Lx;"

    return _DESCRIPTOR_OBJ_RE.sub(repl, desc)


_OP_LEN: dict[int, int | None] = {}


def _init_op_lens() -> dict[int, int | None]:
    # Base lengths from JVMS (None => variable length)
    fixed = {
        # constants
        0x00: 1,  # nop
        0x01: 1,  # aconst_null
        0x02: 1,
        0x03: 1,
        0x04: 1,
        0x05: 1,
        0x06: 1,
        0x07: 1,
        0x08: 1,
        0x09: 1,
        0x0A: 1,
        0x0B: 1,
        0x0C: 1,
        0x0D: 1,
        0x0E: 1,
        0x0F: 1,
        0x10: 2,  # bipush
        0x11: 3,  # sipush
        0x12: 2,  # ldc
        0x13: 3,  # ldc_w
        0x14: 3,  # ldc2_w
        # loads
        0x15: 2,
        0x16: 2,
        0x17: 2,
        0x18: 2,
        0x19: 2,
        0x1A: 1,
        0x1B: 1,
        0x1C: 1,
        0x1D: 1,
        0x1E: 1,
        0x1F: 1,
        0x20: 1,
        0x21: 1,
        0x22: 1,
        0x23: 1,
        0x24: 1,
        0x25: 1,
        0x26: 1,
        0x27: 1,
        0x28: 1,
        0x29: 1,
        0x2A: 1,
        0x2B: 1,
        0x2C: 1,
        0x2D: 1,
        0x2E: 1,
        0x2F: 1,
        0x30: 1,
        0x31: 1,
        0x32: 1,
        0x33: 1,
        0x34: 1,
        0x35: 1,
        # stores
        0x36: 2,
        0x37: 2,
        0x38: 2,
        0x39: 2,
        0x3A: 2,
        0x3B: 1,
        0x3C: 1,
        0x3D: 1,
        0x3E: 1,
        0x3F: 1,
        0x40: 1,
        0x41: 1,
        0x42: 1,
        0x43: 1,
        0x44: 1,
        0x45: 1,
        0x46: 1,
        0x47: 1,
        0x48: 1,
        0x49: 1,
        0x4A: 1,
        0x4B: 1,
        0x4C: 1,
        0x4D: 1,
        0x4E: 1,
        0x4F: 1,
        0x50: 1,
        0x51: 1,
        0x52: 1,
        0x53: 1,
        0x54: 1,
        0x55: 1,
        0x56: 1,
        0x57: 1,
        0x58: 1,
        0x59: 1,
        0x5A: 1,
        0x5B: 1,
        0x5C: 1,
        0x5D: 1,
        0x5E: 1,
        0x5F: 1,
        # math
        0x60: 1,
        0x61: 1,
        0x62: 1,
        0x63: 1,
        0x64: 1,
        0x65: 1,
        0x66: 1,
        0x67: 1,
        0x68: 1,
        0x69: 1,
        0x6A: 1,
        0x6B: 1,
        0x6C: 1,
        0x6D: 1,
        0x6E: 1,
        0x6F: 1,
        0x70: 1,
        0x71: 1,
        0x72: 1,
        0x73: 1,
        0x74: 1,
        0x75: 1,
        0x76: 1,
        0x77: 1,
        0x78: 1,
        0x79: 1,
        0x7A: 1,
        0x7B: 1,
        0x7C: 1,
        0x7D: 1,
        0x7E: 1,
        0x7F: 1,
        0x80: 1,
        0x81: 1,
        0x82: 1,
        0x83: 1,
        0x84: 3,  # iinc
        0x85: 1,
        0x86: 1,
        0x87: 1,
        0x88: 1,
        0x89: 1,
        0x8A: 1,
        0x8B: 1,
        0x8C: 1,
        0x8D: 1,
        0x8E: 1,
        0x8F: 1,
        0x90: 1,
        0x91: 1,
        0x92: 1,
        0x93: 1,
        0x94: 1,
        0x95: 1,
        0x96: 1,
        0x97: 1,
        0x98: 1,
        # comparisons
        0x99: 3,
        0x9A: 3,
        0x9B: 3,
        0x9C: 3,
        0x9D: 3,
        0x9E: 3,
        0x9F: 3,
        0xA0: 3,
        0xA1: 3,
        0xA2: 3,
        0xA3: 3,
        0xA4: 3,
        0xA5: 3,
        0xA6: 3,
        0xA7: 3,  # goto
        0xA8: 3,  # jsr
        0xA9: 2,  # ret
        0xAA: None,  # tableswitch
        0xAB: None,  # lookupswitch
        0xAC: 1,
        0xAD: 1,
        0xAE: 1,
        0xAF: 1,
        0xB0: 1,
        0xB1: 1,
        0xB2: 3,
        0xB3: 3,
        0xB4: 3,
        0xB5: 3,
        0xB6: 3,
        0xB7: 3,
        0xB8: 3,
        0xB9: 5,  # invokeinterface
        0xBA: 5,  # invokedynamic
        0xBB: 3,
        0xBC: 2,
        0xBD: 3,
        0xBE: 1,
        0xBF: 1,
        0xC0: 3,
        0xC1: 3,
        0xC2: 1,
        0xC3: 1,
        0xC4: None,  # wide
        0xC5: 4,
        0xC6: 3,
        0xC7: 3,
        0xC8: 5,  # goto_w
        0xC9: 5,  # jsr_w
        0xCA: 1,  # breakpoint
    }
    # Fill in 0xCB..0xFF as 1 byte (reserved) to avoid KeyErrors, but don't trust them.
    for i in range(0x00, 0x100):
        _OP_LEN[i] = fixed.get(i, 1)
    return _OP_LEN


_init_op_lens()


def _parse_code_op_hist(code: bytes) -> tuple[Counter[int], int]:
    """
    Return (opcode histogram, instruction count) for a Code attribute's bytecode.
    Best-effort: aims to be robust, not perfect, for similarity matching.
    """
    hist: Counter[int] = Counter()
    i = 0
    insn = 0
    n = len(code)
    while i < n:
        op = code[i]
        hist[op] += 1
        insn += 1
        i += 1

        oplen = _OP_LEN.get(op, 1)
        if oplen is None:
            if op in (0xAA, 0xAB):  # tableswitch/lookupswitch
                # padding to 4-byte boundary from opcode start+1
                pad = (4 - (i % 4)) % 4
                i += pad
                # default
                i += 4
                if op == 0xAA:
                    # low, high, then jump offsets
                    low = int.from_bytes(code[i : i + 4], "big", signed=True)
                    high = int.from_bytes(code[i + 4 : i + 8], "big", signed=True)
                    i += 8
                    count = max(0, high - low + 1)
                    i += 4 * count
                else:
                    npairs = int.from_bytes(code[i : i + 4], "big", signed=True)
                    i += 4
                    i += 8 * max(0, npairs)
            elif op == 0xC4:  # wide
                if i >= n:
                    break
                widened = code[i]
                i += 1
                if widened == 0x84:  # iinc
                    i += 4
                else:
                    i += 2
            else:
                # Unknown variable-length opcode; bail out safely.
                break
        else:
            # already consumed 1 byte opcode; skip remaining operands
            i += (oplen - 1)

    return hist, insn


class _Cp:
    def __init__(self, cp: list[tuple[int, object] | None]):
        self.cp = cp

    def utf8(self, idx: int) -> str:
        tag, val = self.cp[idx] or (None, None)
        if tag != 1:
            raise ClassFileFormatError(f"cp[{idx}] is not UTF8 (tag={tag})")
        assert isinstance(val, str)
        return val

    def class_name(self, idx: int) -> str:
        tag, val = self.cp[idx] or (None, None)
        if tag != 7:
            raise ClassFileFormatError(f"cp[{idx}] is not Class (tag={tag})")
        assert isinstance(val, int)
        return self.utf8(val)

    def string_const(self, idx: int) -> str:
        tag, val = self.cp[idx] or (None, None)
        if tag != 8:
            raise ClassFileFormatError(f"cp[{idx}] is not String (tag={tag})")
        assert isinstance(val, int)
        return self.utf8(val)


def _parse_classfile(buf: bytes) -> ParsedClass:
    off = 0
    magic, off = _u4(buf, off)
    if magic != 0xCAFEBABE:
        raise ClassFileFormatError("bad magic")
    _minor, off = _u2(buf, off)
    _major, off = _u2(buf, off)

    cp_count, off = _u2(buf, off)
    cp: list[tuple[int, object] | None] = [None] * cp_count
    idx = 1
    while idx < cp_count:
        tag, off = _u1(buf, off)
        if tag == 1:  # Utf8
            ln, off = _u2(buf, off)
            raw, off = _bytes(buf, off, ln)
            cp[idx] = (tag, raw.decode("utf-8", errors="replace"))
        elif tag in (3, 4):  # Integer, Float
            raw, off = _bytes(buf, off, 4)
            cp[idx] = (tag, raw)
        elif tag in (5, 6):  # Long, Double (take 2 slots)
            raw, off = _bytes(buf, off, 8)
            cp[idx] = (tag, raw)
            idx += 1
            if idx < cp_count:
                cp[idx] = None
        elif tag in (7, 8, 16, 19, 20):  # Class, String, MethodType, Module, Package
            v, off = _u2(buf, off)
            cp[idx] = (tag, v)
        elif tag in (9, 10, 11, 12, 17, 18):  # Fieldref, Methodref, InterfaceMethodref, NameAndType, Dynamic, InvokeDynamic
            a, off = _u2(buf, off)
            b, off = _u2(buf, off)
            cp[idx] = (tag, (a, b))
        elif tag == 15:  # MethodHandle
            kind, off = _u1(buf, off)
            ref, off = _u2(buf, off)
            cp[idx] = (tag, (kind, ref))
        else:
            raise ClassFileFormatError(f"unknown cp tag {tag}")
        idx += 1

    cpool = _Cp(cp)

    _access, off = _u2(buf, off)
    this_class, off = _u2(buf, off)
    super_class, off = _u2(buf, off)
    internal_name = cpool.class_name(this_class)
    super_name = None if super_class == 0 else cpool.class_name(super_class)

    interfaces_count, off = _u2(buf, off)
    interfaces = []
    for _ in range(interfaces_count):
        itf, off = _u2(buf, off)
        interfaces.append(cpool.class_name(itf))

    fields_count, off = _u2(buf, off)
    fields_desc_norm: list[str] = []
    for _ in range(fields_count):
        _facc, off = _u2(buf, off)
        _fname, off = _u2(buf, off)
        fdesc, off = _u2(buf, off)
        fields_desc_norm.append(_normalize_descriptor(cpool.utf8(fdesc)))
        attrs, off = _u2(buf, off)
        for _ in range(attrs):
            _aname, off = _u2(buf, off)
            alen, off = _u4(buf, off)
            off += alen

    methods_count, off = _u2(buf, off)
    methods_desc_norm: list[str] = []
    opcode_hist: Counter[int] = Counter()
    for _ in range(methods_count):
        _macc, off = _u2(buf, off)
        mname_idx, off = _u2(buf, off)
        mdesc_idx, off = _u2(buf, off)
        mname = cpool.utf8(mname_idx)
        mdesc = cpool.utf8(mdesc_idx)
        methods_desc_norm.append(_normalize_descriptor(mdesc))

        attrs, off = _u2(buf, off)
        for _ in range(attrs):
            aname_idx, off = _u2(buf, off)
            alen, off = _u4(buf, off)
            aname = cpool.utf8(aname_idx)
            if aname == "Code":
                code_off = off
                _max_stack, code_off = _u2(buf, code_off)
                _max_locals, code_off = _u2(buf, code_off)
                code_len, code_off = _u4(buf, code_off)
                code_bytes = buf[code_off : code_off + code_len]
                h, _insn = _parse_code_op_hist(code_bytes)
                opcode_hist.update(h)
            # skip
            off += alen

    # attributes (class-level) — skip
    attrs_count, off = _u2(buf, off)
    for _ in range(attrs_count):
        _aname, off = _u2(buf, off)
        alen, off = _u4(buf, off)
        off += alen

    # string constants: iterate indices for CONSTANT_String -> CONSTANT_Utf8
    strings: set[str] = set()
    for i, entry in enumerate(cp):
        if not entry:
            continue
        tag, val = entry
        if tag == 8 and isinstance(val, int):
            try:
                strings.add(cpool.utf8(val))
            except Exception:
                continue

    return ParsedClass(
        internal_name=internal_name,
        super_internal_name=super_name,
        interfaces=tuple(interfaces),
        fields_desc_norm=tuple(sorted(fields_desc_norm)),
        methods_desc_norm=tuple(sorted(methods_desc_norm)),
        strings=frozenset(strings),
        opcode_hist=opcode_hist,
    )


def _iter_jar_classes(jar_path: Path) -> Iterator[ParsedClass]:
    with zipfile.ZipFile(jar_path, "r") as zf:
        for name in zf.namelist():
            if not name.endswith(".class"):
                continue
            if name.startswith("META-INF/"):
                continue
            buf = zf.read(name)
            try:
                yield _parse_classfile(buf)
            except ClassFileFormatError:
                continue


def _cosine_sim(a: Counter[int], b: Counter[int]) -> float:
    if not a or not b:
        return 0.0
    dot = 0.0
    for k, va in a.items():
        vb = b.get(k)
        if vb:
            dot += va * vb
    na = math.sqrt(sum(v * v for v in a.values()))
    nb = math.sqrt(sum(v * v for v in b.values()))
    if na == 0.0 or nb == 0.0:
        return 0.0
    return float(dot / (na * nb))


def _weighted_overlap(
    a: frozenset[str],
    b: frozenset[str],
    idf: dict[str, float],
    max_terms: int,
) -> tuple[float, list[str]]:
    if not a or not b:
        return 0.0, []
    inter = a.intersection(b)
    if not inter:
        return 0.0, []
    scored = sorted(((idf.get(s, 0.0), s) for s in inter), reverse=True)
    top = [s for _w, s in scored[:max_terms]]
    return sum(w for w, _s in scored), top


def _build_idf(sets: Iterable[frozenset[str]]) -> dict[str, float]:
    df: Counter[str] = Counter()
    total = 0
    for s in sets:
        total += 1
        for x in s:
            df[x] += 1
    idf: dict[str, float] = {}
    for k, v in df.items():
        # classic-ish IDF with smoothing
        idf[k] = math.log((total + 1.0) / (v + 1.0)) + 1.0
    return idf


def _bag_jaccard(a: tuple[str, ...], b: tuple[str, ...]) -> float:
    if not a or not b:
        return 0.0
    ca = Counter(a)
    cb = Counter(b)
    inter = 0
    union = 0
    keys = set(ca) | set(cb)
    for k in keys:
        va = ca.get(k, 0)
        vb = cb.get(k, 0)
        inter += min(va, vb)
        union += max(va, vb)
    return 0.0 if union == 0 else float(inter / union)


def _score_pair(
    src: ParsedClass,
    dst: ParsedClass,
    idf_strings: dict[str, float],
    idf_methods: dict[str, float],
) -> tuple[float, dict]:
    s_overlap, s_top = _weighted_overlap(src.strings, dst.strings, idf_strings, max_terms=6)
    m_overlap, _m_top = _weighted_overlap(
        frozenset(src.methods_desc_norm),
        frozenset(dst.methods_desc_norm),
        idf_methods,
        max_terms=0,
    )
    # normalize overlaps into [0,1]-ish
    s_norm = 0.0
    if src.strings:
        s_norm = s_overlap / max(1.0, sum(idf_strings.get(x, 0.0) for x in src.strings))
    m_norm = 0.0
    if src.methods_desc_norm:
        m_norm = m_overlap / max(1.0, sum(idf_methods.get(x, 0.0) for x in set(src.methods_desc_norm)))

    f_j = _bag_jaccard(src.fields_desc_norm, dst.fields_desc_norm)
    md_j = _bag_jaccard(src.methods_desc_norm, dst.methods_desc_norm)
    op_cos = _cosine_sim(src.opcode_hist, dst.opcode_hist)

    def count_sim(a: int, b: int) -> float:
        if a == 0 and b == 0:
            return 1.0
        denom = max(a, b, 1)
        return 1.0 - min(1.0, abs(a - b) / denom)

    methods_cnt_sim = count_sim(len(src.methods_desc_norm), len(dst.methods_desc_norm))
    fields_cnt_sim = count_sim(len(src.fields_desc_norm), len(dst.fields_desc_norm))

    def is_java_type(t: str | None) -> bool:
        return bool(t) and (t.startswith("java/") or t.startswith("javax/") or t.startswith("sun/"))

    super_sim = 0.0
    if is_java_type(src.super_internal_name) and src.super_internal_name == dst.super_internal_name:
        super_sim = 1.0

    java_itf_src = {x for x in src.interfaces if is_java_type(x)}
    java_itf_dst = {x for x in dst.interfaces if is_java_type(x)}
    itf_sim = 0.0
    if java_itf_src or java_itf_dst:
        itf_sim = len(java_itf_src & java_itf_dst) / max(1, len(java_itf_src | java_itf_dst))

    # weights: strings are strongest anchors; opcode shape is decent; methods/fields/counts help disambiguate
    score = (
        0.50 * s_norm
        + 0.20 * op_cos
        + 0.10 * md_j
        + 0.05 * m_norm
        + 0.05 * f_j
        + 0.04 * methods_cnt_sim
        + 0.04 * fields_cnt_sim
        + 0.01 * super_sim
        + 0.01 * itf_sim
    )

    evidence = {
        "string_overlap_weighted": round(s_overlap, 4),
        "string_overlap_top": s_top,
        "strings_src": len(src.strings),
        "strings_dst": len(dst.strings),
        "methods_src": len(src.methods_desc_norm),
        "methods_dst": len(dst.methods_desc_norm),
        "fields_src": len(src.fields_desc_norm),
        "fields_dst": len(dst.fields_desc_norm),
        "opcode_cosine": round(op_cos, 4),
        "fields_jaccard": round(f_j, 4),
        "methods_jaccard": round(md_j, 4),
        "methods_overlap_norm": round(m_norm, 4),
        "strings_overlap_norm": round(s_norm, 4),
        "methods_count_sim": round(methods_cnt_sim, 4),
        "fields_count_sim": round(fields_cnt_sim, 4),
        "java_super_match": int(super_sim),
        "java_interfaces_jaccard": round(itf_sim, 4),
    }
    return float(score), evidence


def _build_inverted_index(
    dst_classes: list[ParsedClass],
) -> tuple[DefaultDict[str, list[int]], DefaultDict[str, list[int]]]:
    strings_to_dst: DefaultDict[str, list[int]] = defaultdict(list)
    methods_to_dst: DefaultDict[str, list[int]] = defaultdict(list)
    for i, c in enumerate(dst_classes):
        for s in c.strings:
            strings_to_dst[s].append(i)
        for m in set(c.methods_desc_norm):
            methods_to_dst[m].append(i)
    return strings_to_dst, methods_to_dst


def main(argv: list[str]) -> int:
    ap = argparse.ArgumentParser(description="Prototype jar-to-jar rename mapping via strings + bytecode fingerprints")
    ap.add_argument("--src-jar", required=True, type=Path, help="Obfuscated/decompiled client jar (e.g. 634)")
    ap.add_argument("--dst-jar", required=True, type=Path, help="Named/refactored client jar (e.g. 2011Scape 667)")
    ap.add_argument("--out", required=True, type=Path, help="Output JSON path")
    ap.add_argument("--out-tsv", type=Path, help="Optional TSV output path")
    ap.add_argument("--top", type=int, default=3, help="Top matches to keep per src class")
    ap.add_argument("--min-score", type=float, default=0.25, help="Minimum score to include in TSV output")
    ap.add_argument("--max-candidates", type=int, default=2500, help="Max destination candidates per src class")
    args = ap.parse_args(argv)

    if not args.src_jar.exists():
        ap.error(f"--src-jar not found: {args.src_jar}")
    if not args.dst_jar.exists():
        ap.error(f"--dst-jar not found: {args.dst_jar}")

    src_classes = list(_iter_jar_classes(args.src_jar))
    dst_classes = list(_iter_jar_classes(args.dst_jar))

    idf_strings = _build_idf([c.strings for c in dst_classes])
    idf_methods = _build_idf([frozenset(c.methods_desc_norm) for c in dst_classes])
    strings_to_dst, methods_to_dst = _build_inverted_index(dst_classes)

    results = {
        "src_jar": str(args.src_jar),
        "dst_jar": str(args.dst_jar),
        "src_class_count": len(src_classes),
        "dst_class_count": len(dst_classes),
        "mappings": [],
    }

    tsv_rows: list[tuple[str, str, float, str]] = []

    for src in src_classes:
        candidate_idxs: set[int] = set()

        # Candidate generation: rare strings first (best anchors)
        if src.strings:
            ranked = sorted(
                ((idf_strings.get(s, 0.0), s) for s in src.strings if s in strings_to_dst),
                reverse=True,
            )
            for _w, s in ranked[:50]:
                candidate_idxs.update(strings_to_dst[s])

        # Backstop with method descriptor overlap
        if len(candidate_idxs) < 50 and src.methods_desc_norm:
            for m in set(src.methods_desc_norm):
                candidate_idxs.update(methods_to_dst.get(m, []))

        if not candidate_idxs:
            # Worst-case: fall back to all, but cap for runtime.
            candidate_idxs = set(range(min(len(dst_classes), args.max_candidates)))

        if len(candidate_idxs) > args.max_candidates:
            # deterministically trim: prefer candidates hit by rare strings
            trimmed: list[tuple[float, int]] = []
            for idx in candidate_idxs:
                dst = dst_classes[idx]
                w, _top = _weighted_overlap(src.strings, dst.strings, idf_strings, max_terms=0)
                trimmed.append((w, idx))
            trimmed.sort(reverse=True)
            candidate_idxs = set(i for _w, i in trimmed[: args.max_candidates])

        scored: list[tuple[float, ParsedClass, dict]] = []
        for idx in candidate_idxs:
            dst = dst_classes[idx]
            score, evidence = _score_pair(src, dst, idf_strings, idf_methods)
            scored.append((score, dst, evidence))

        scored.sort(key=lambda x: x[0], reverse=True)
        top = scored[: max(1, args.top)]

        mapping_entry = {
            "src": src.internal_name,
            "best": {
                "dst": top[0][1].internal_name,
                "score": round(top[0][0], 6),
                "evidence": top[0][2],
            },
            "top": [
                {
                    "dst": dst.internal_name,
                    "score": round(score, 6),
                    "evidence": ev,
                }
                for score, dst, ev in top
            ],
        }
        results["mappings"].append(mapping_entry)

        best_score = top[0][0]
        if args.out_tsv and best_score >= args.min_score:
            top_strings = ",".join(top[0][2].get("string_overlap_top", [])[:6])
            tsv_rows.append((src.internal_name, top[0][1].internal_name, best_score, top_strings))

    args.out.parent.mkdir(parents=True, exist_ok=True)
    args.out.write_text(json.dumps(results, indent=2, sort_keys=False) + "\n", encoding="utf-8")

    if args.out_tsv:
        args.out_tsv.parent.mkdir(parents=True, exist_ok=True)
        with args.out_tsv.open("w", encoding="utf-8") as f:
            f.write("src\tdst\tscore\tanchor_strings\n")
            for src, dst, score, anchors in sorted(tsv_rows, key=lambda r: r[2], reverse=True):
                f.write(f"{src}\t{dst}\t{score:.6f}\t{anchors}\n")

    print(f"Wrote {args.out}")
    if args.out_tsv:
        print(f"Wrote {args.out_tsv}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main(sys.argv[1:]))
