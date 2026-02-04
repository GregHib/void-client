#!/usr/bin/env python3
from __future__ import annotations

import argparse
import dataclasses
import keyword
import re
import sys
from collections import defaultdict
from pathlib import Path


JAVA_KEYWORDS = {
    # Java keywords + literals (not exhaustive for all versions, but enough)
    "abstract",
    "assert",
    "boolean",
    "break",
    "byte",
    "case",
    "catch",
    "char",
    "class",
    "const",
    "continue",
    "default",
    "do",
    "double",
    "else",
    "enum",
    "extends",
    "final",
    "finally",
    "float",
    "for",
    "goto",
    "if",
    "implements",
    "import",
    "instanceof",
    "int",
    "interface",
    "long",
    "native",
    "new",
    "package",
    "private",
    "protected",
    "public",
    "return",
    "short",
    "static",
    "strictfp",
    "super",
    "switch",
    "synchronized",
    "this",
    "throw",
    "throws",
    "transient",
    "try",
    "void",
    "volatile",
    "while",
    "true",
    "false",
    "null",
}


@dataclasses.dataclass(frozen=True)
class RenameCandidate:
    src_internal: str
    dst_internal: str
    score: float
    anchors: str

    @property
    def src_simple(self) -> str:
        return self.src_internal.split("/")[-1]

    @property
    def dst_simple(self) -> str:
        return self.dst_internal.split("/")[-1]


def _is_valid_java_ident(name: str) -> bool:
    if not name:
        return False
    if name in JAVA_KEYWORDS:
        return False
    if name[0].isdigit():
        return False
    if not re.fullmatch(r"[A-Za-z_$][A-Za-z0-9_$]*", name):
        return False
    return True


def _load_tsv(tsv: Path) -> list[RenameCandidate]:
    rows: list[RenameCandidate] = []
    with tsv.open("r", encoding="utf-8") as f:
        header = f.readline()
        if not header:
            raise RuntimeError(f"empty TSV: {tsv}")
        for line in f:
            line = line.rstrip("\n")
            if not line:
                continue
            parts = line.split("\t")
            if len(parts) < 3:
                continue
            src = parts[0].strip()
            dst = parts[1].strip()
            try:
                score = float(parts[2])
            except ValueError:
                continue
            anchors = parts[3].strip() if len(parts) > 3 else ""
            rows.append(RenameCandidate(src_internal=src, dst_internal=dst, score=score, anchors=anchors))
    return rows


def _collect_java_files(src_dir: Path) -> dict[str, Path]:
    out: dict[str, Path] = {}
    for p in src_dir.glob("*.java"):
        out[p.stem] = p
    return out


def _read_text(path: Path) -> str:
    return path.read_text(encoding="utf-8", errors="replace")


def _write_text(path: Path, text: str) -> None:
    path.write_text(text, encoding="utf-8")


def _replace_ident_in_text(text: str, old: str, new: str) -> str:
    # Best-effort identifier replacement. This will also affect comments/strings.
    # For this deob work that's acceptable; it's mechanical + reviewable.
    pat = re.compile(rf"\b{re.escape(old)}\b")
    return pat.sub(new, text)


@dataclasses.dataclass
class ApplyReport:
    renamed: list[tuple[str, str, float, str]]
    skipped: list[tuple[str, str, float, str]]

    def to_markdown(self) -> str:
        lines: list[str] = []
        lines.append("# Rename report\n")
        lines.append(f"Renamed: {len(self.renamed)}  \nSkipped: {len(self.skipped)}\n")
        if self.renamed:
            lines.append("## Renamed\n")
            lines.append("| src | dst | score | anchors |")
            lines.append("|---|---:|---:|---|")
            for src, dst, score, anchors in self.renamed:
                lines.append(f"| `{src}` | `{dst}` | {score:.6f} | {anchors.replace('|', '\\\\|')} |")
            lines.append("")
        if self.skipped:
            lines.append("## Skipped\n")
            lines.append("| src | dst | score | reason |")
            lines.append("|---|---:|---:|---|")
            for src, dst, score, reason in self.skipped:
                lines.append(f"| `{src}` | `{dst}` | {score:.6f} | {reason.replace('|', '\\\\|')} |")
            lines.append("")
        return "\n".join(lines)


def main(argv: list[str]) -> int:
    ap = argparse.ArgumentParser(description="Apply high-confidence class renames to flat client/src/*.java")
    ap.add_argument("--tsv", required=True, type=Path, help="TSV from rs_rename_mapper.py (best matches)")
    ap.add_argument("--src-dir", required=True, type=Path, help="Directory containing *.java (flat/default package)")
    ap.add_argument("--min-score", type=float, default=0.90, help="Minimum score for renames")
    ap.add_argument("--dry-run", action="store_true", help="Compute mapping and report, but don't modify files")
    ap.add_argument("--report", required=True, type=Path, help="Markdown report output path")
    args = ap.parse_args(argv)

    tsv = args.tsv
    src_dir = args.src_dir
    if not tsv.exists():
        ap.error(f"--tsv not found: {tsv}")
    if not src_dir.exists():
        ap.error(f"--src-dir not found: {src_dir}")

    rows = _load_tsv(tsv)
    java_files = _collect_java_files(src_dir)
    existing_names = set(java_files.keys())

    # Greedy one-to-one assignment by score
    candidates = [r for r in rows if r.score >= args.min_score]
    candidates.sort(key=lambda r: r.score, reverse=True)

    chosen: list[RenameCandidate] = []
    used_dst: set[str] = set()
    report = ApplyReport(renamed=[], skipped=[])

    for r in candidates:
        if "/" in r.src_internal:
            report.skipped.append((r.src_internal, r.dst_internal, r.score, "src is packaged (no matching flat .java file)"))
            continue
        src = r.src_simple
        dst = r.dst_simple

        if src not in existing_names:
            report.skipped.append((src, dst, r.score, "src .java not found"))
            continue
        if dst == src:
            report.skipped.append((src, dst, r.score, "dst equals src (no-op)"))
            continue
        if not _is_valid_java_ident(dst):
            report.skipped.append((src, dst, r.score, "dst is not a valid Java identifier"))
            continue
        if dst in used_dst:
            report.skipped.append((src, dst, r.score, "dst already used by a higher-score mapping"))
            continue
        if dst in existing_names and dst != src:
            report.skipped.append((src, dst, r.score, "dst name already exists in source tree"))
            continue
        used_dst.add(dst)
        chosen.append(r)

    # Apply replacements in a stable order: longest names first (reduces boundary surprises, though we use \\b)
    chosen.sort(key=lambda r: (len(r.src_simple), r.score), reverse=True)

    if args.dry_run:
        for r in chosen:
            report.renamed.append((r.src_simple, r.dst_simple, r.score, r.anchors))
        args.report.parent.mkdir(parents=True, exist_ok=True)
        args.report.write_text(report.to_markdown(), encoding="utf-8")
        print(f"Dry-run: would rename {len(chosen)} classes. Wrote {args.report}")
        return 0

    # Load all texts once
    texts: dict[Path, str] = {p: _read_text(p) for p in java_files.values()}

    # Replace identifiers globally
    for r in chosen:
        old = r.src_simple
        new = r.dst_simple
        for p in list(texts.keys()):
            texts[p] = _replace_ident_in_text(texts[p], old, new)

    # Write updates
    for p, txt in texts.items():
        _write_text(p, txt)

    # Rename files (after content updates)
    # Do in two phases to avoid name collisions on case-insensitive FS (paranoia).
    renames: list[tuple[Path, Path]] = []
    for r in chosen:
        src_name = r.src_simple
        dst_name = r.dst_simple
        if src_name == dst_name:
            report.skipped.append((src_name, dst_name, r.score, "same name (no-op)"))
            continue
        src_path = java_files[src_name]
        dst_path = src_path.with_name(dst_name + ".java")
        renames.append((src_path, dst_path))
        report.renamed.append((src_name, dst_name, r.score, r.anchors))

    # Perform file renames
    # Use temporary names if needed
    temp_map: dict[Path, Path] = {}
    for src_path, dst_path in renames:
        if dst_path.exists():
            # This should be prevented by earlier checks, but keep safe.
            report.skipped.append((src_path.stem, dst_path.stem, 0.0, "dst file already exists"))
            continue
        tmp = src_path.with_suffix(".java.__renametmp__")
        src_path.rename(tmp)
        temp_map[tmp] = dst_path

    for tmp, final in temp_map.items():
        tmp.rename(final)

    args.report.parent.mkdir(parents=True, exist_ok=True)
    args.report.write_text(report.to_markdown(), encoding="utf-8")
    print(f"Renamed {len(report.renamed)} classes. Wrote {args.report}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main(sys.argv[1:]))
