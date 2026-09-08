#!/usr/bin/env python3
"""Copy Jagex JNI wrappers from 2011scape and stub native methods."""
import re
from pathlib import Path

SRC = Path(__file__).resolve().parents[3] / "refs/2011scape-client/runescape/src/main/java"
DST = Path(__file__).resolve().parents[1] / "app/src/main/java"

PACKAGES = ["jaggl", "jagdx", "jagtheora", "jagex3", "jaclib"]

ANN_IMPORT = re.compile(r"^import org\.openrs2\.deob\.annotation\..*\n", re.M)
NATIVE_FN = re.compile(
    r"(?P<mods>(?:(?:public|protected|private|static|final|synchronized|native)\s+)+)"
    r"(?P<ret>[\w.<>,\[\]\s]+?)\s+(?P<name>\w+)\s*\((?P<args>[^)]*)\)\s*"
    r"(?P<throws>throws\s+[\w\s,.]+)?\s*;"
)


def stub_body(ret: str) -> str:
    r = " ".join(ret.split())
    if r == "void":
        return "{}"
    if r == "boolean":
        return "{ return false; }"
    if r in ("byte", "short", "int", "char"):
        return "{ return 0; }"
    if r == "long":
        return "{ return 0L; }"
    if r == "float":
        return "{ return 0f; }"
    if r == "double":
        return "{ return 0d; }"
    return "{ return null; }"


def strip_annotations(text: str) -> str:
    out = []
    for line in text.splitlines(True):
        stripped = line.lstrip()
        if stripped.startswith("@OriginalClass") or stripped.startswith("@OriginalMember") or stripped.startswith("@OriginalArg"):
            # full-line annotations only
            if stripped.startswith("@OriginalClass") or stripped.startswith("@OriginalMember"):
                continue
        line = re.sub(r"@OriginalArg\(\d+\)\s*", "", line)
        line = re.sub(r"@Pc\(\d+\)\s*", "", line)
        out.append(line)
    return "".join(out)


def convert(text: str) -> str:
    text = ANN_IMPORT.sub("", text)
    text = strip_annotations(text)
    text = text.replace("java.awt", "voidawt")
    text = text.replace("java.applet", "voidapplet")

    def repl(m: re.Match) -> str:
        mods = m.group("mods")
        if "native" not in mods:
            return m.group(0)
        mods = " ".join(p for p in mods.split() if p != "native") + " "
        throws = (" " + m.group("throws")) if m.group("throws") else ""
        return f"{mods}{m.group('ret')} {m.group('name')}({m.group('args')}){throws} {stub_body(m.group('ret'))}"

    return NATIVE_FN.sub(repl, text)


def main() -> None:
    copied = 0
    for pkg in PACKAGES:
        src = SRC / pkg
        if not src.exists():
            raise SystemExit(f"missing {src}")
        for path in src.rglob("*.java"):
            rel = path.relative_to(SRC)
            out = DST / rel
            out.parent.mkdir(parents=True, exist_ok=True)
            text = convert(path.read_text())
            if path.name == "IDirect3D.java" and out.exists():
                copied += 1
                continue
            if path.name == "ti.java":
                text = text.replace("public final class ti", "public class ti")
            if path.name == "SimplePeer.java":
                if "public final void a()" not in text:
                    text = text.rstrip()
                    if text.endswith("}"):
                        text = text[:-1] + "    public final void a() { this.cleanUp(); }\n}\n"
            if path.name == "Stream.java":
                text = text.replace("this.c();", "this.flush();")
                text = text.replace("public void c() {", "public void flush() {")
                text = text.replace(
                    "public static boolean b() {\n        return getLSB(-65536) == -1;\n    }",
                    "public int b() {\n        return this.b + this.d;\n    }",
                )
                text = text.rstrip()
                if text.endswith("}"):
                    text = text[:-1] + "    public static boolean c() { return true; }\n}\n"
            out.write_text(text, encoding="utf-8")
            copied += 1
    hb = DST / "jaclib/peer/hb.java"
    hb.write_text("package jaclib.peer;\n\npublic final class hb extends ti {\n}\n", encoding="utf-8")
    (DST / "jagdx/fda.java").write_text(
        "package jagdx;\n\npublic class fda extends RuntimeException {\n"
        "    public fda() {}\n    public fda(String message) { super(message); }\n}\n",
        encoding="utf-8",
    )
    print(f"stubbed {copied} files -> {DST}")


if __name__ == "__main__":
    main()
