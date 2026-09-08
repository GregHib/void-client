#!/usr/bin/env python3
"""
Validate string-based reflection targets used by mobile hosts against client/.

Deob renames that leave Class.forName(...).getDeclaredField/Method("old")
break camera orbit, viewport sync, server picker, etc. — hosts catch Throwable
and swallow the failure.

Usage (from void-client/):
  python3 .cursor/skills/void-client-deobfuscate/scripts/check_reflection.py
"""
from __future__ import annotations

import re
import sys
from pathlib import Path

SKILL = Path(__file__).resolve().parents[1]
ROOT = SKILL.parents[2]  # void-client/
CLIENT = ROOT / "client"

HOST_FILES = [
    ROOT / "ios/src/main/java/voidawt/AwtHost.java",
    ROOT / "android/app/src/main/java/voidawt/AwtHost.java",
    ROOT / "android/app/src/main/java/world/gregs/voidosrs/ServerPrefs.java",
]

# Hand-parsed targets that matter (setStatic* + known forName chains).
# Keep in sync when adding new reflective bridges.
EXPECTED: list[tuple[str, str, str]] = [
    # kind, class, member
    ("field", "Component225", "aFrame476"),
    ("field", "InputHandler", "canvasWidth"),
    ("field", "DisplayModeManagerContainer295", "canvasWidth"),
    ("field", "DisplayModeManagerContainer23", "canvasWidth"),
    ("field", "GlToolkitSub2", "canvasHeight"),
    ("field", "Component236", "canvasWidth"),
    ("field", "PacketReader", "canvasHeight"),
    ("field", "SocketConnector", "canvasWidth"),
    ("field", "NpcNode", "canvasHeight"),
    ("field", "NodeSub48", "perFrameReset"),
    ("field", "DisplayModeManagerContainer147", "perDrawReset"),
    ("field", "Cp1252Decoder", "fullscreenAvailable"),
    ("field", "Component112", "cameraYaw"),
    ("field", "DisplayModeManagerContainer154", "cameraPitch"),
    ("method", "DisplayModeManagerContainer199", "clampCameraAngles"),
    ("field", "StringCache", "devConsoleOpen"),
    ("method", "Component192", "openDevConsole"),
    ("method", "AbstractShaderSub4", "closeDevConsole"),
    ("method", "BuildInfo", "isConsolePromptTap"),
    ("field", "Component49", "clientState"),
    ("field", "HardwareProbe", "aClass248_6601"),
    ("field", "Component253", "errorCount"),
    ("field", "JoystickAlias", "padConnected"),
    ("method", "JoystickAlias", "onPadButton"),
]

# Old names that must not appear as reflection string literals anymore.
STALE_STRINGS = (
    "ha_Sub2",
    "aBoolean5219",
    "aBoolean4328",
    "anInt4674",
    "anInt3213",
    "aFloat3938",
    "aFloat1287",
    "method1725",
    "method2363",
    "method3543",
    "NodeSub22",
)

SET_INT = re.compile(r'setStaticInt\(\s*"([^"]+)"\s*,\s*"([^"]+)"')
SET_BOOL = re.compile(r'setStaticBoolean\(\s*"([^"]+)"\s*,\s*"([^"]+)"')
FOR_NAME = re.compile(r'Class\.forName\(\s*"([^"]+)"\s*\)')
GET_FIELD = re.compile(r'getDeclaredField\(\s*"([^"]+)"\s*\)')
GET_METHOD = re.compile(r'getDeclaredMethod\(\s*"([^"]+)"\s*')


def class_file(name: str) -> Path | None:
    hits = list(CLIENT.rglob(f"{name}.java"))
    return hits[0] if hits else None


def has_member(cls: str, member: str, kind: str) -> tuple[bool, str]:
    path = class_file(cls)
    if path is None:
        return False, "CLASS_MISSING"
    text = path.read_text(errors="replace")
    if kind == "field":
        ok = re.search(rf"\b{re.escape(member)}\b", text) is not None
    else:
        ok = re.search(rf"\b{re.escape(member)}\s*\(", text) is not None
    return ok, str(path.relative_to(CLIENT))


def extract_live_targets() -> set[tuple[str, str, str]]:
    """Parse host sources for setStatic* and forName→getDeclared* chains.

    Chains may span lines (``.getDeclaredMethod(...)`` continued), but a new
    ``Class.forName`` resets the receiver so we do not cross-wire members.
    """
    found: set[tuple[str, str, str]] = set()
    for path in HOST_FILES:
        if not path.is_file():
            continue
        text = path.read_text(errors="replace")
        for m in SET_INT.finditer(text):
            found.add(("field", m.group(1), m.group(2)))
        for m in SET_BOOL.finditer(text):
            found.add(("field", m.group(1), m.group(2)))

        current: str | None = None
        for line in text.splitlines():
            fm = FOR_NAME.search(line)
            if fm:
                current = fm.group(1)
                if "." in current:
                    current = None  # host / JDK / packaged type
            if current is None:
                continue
            # Instance lookup: js5.getClass().getDeclaredField("errorCount")
            if "getClass()" in line and GET_FIELD.search(line):
                for ff in GET_FIELD.finditer(line):
                    found.add(("field", "Component253", ff.group(1)))
                continue
            for ff in GET_FIELD.finditer(line):
                found.add(("field", current, ff.group(1)))
            for mm in GET_METHOD.finditer(line):
                found.add(("method", current, mm.group(1)))
            # Keep `current` across lines so
            #   Class<?> c = Class.forName("Foo");
            #   c.getDeclaredField("bar");
            # pairs correctly. Next forName resets.
    return found


def main() -> int:
    if not CLIENT.is_dir():
        print(f"missing client dir: {CLIENT}", file=sys.stderr)
        return 1

    bad = 0
    print("=== expected reflection bridge ===")
    for kind, cls, mem in EXPECTED:
        ok, where = has_member(cls, mem, kind)
        status = "OK " if ok else "BAD"
        print(f"  {status} {cls}.{mem} ({kind})  [{where}]")
        if not ok:
            bad += 1

    print("\n=== live host string literals ===")
    live = extract_live_targets()
    for kind, cls, mem in sorted(live):
        ok, where = has_member(cls, mem, kind)
        status = "OK " if ok else "BAD"
        print(f"  {status} {cls}.{mem} ({kind})  [{where}]")
        if not ok:
            bad += 1

    print("\n=== stale reflection strings (must be absent) ===")
    for path in HOST_FILES:
        if not path.is_file():
            continue
        text = path.read_text(errors="replace")
        for stale in STALE_STRINGS:
            if f'"{stale}"' in text:
                print(f"  STALE {path.relative_to(ROOT)} → \"{stale}\"")
                bad += 1
    if bad == 0:
        print("  (none)")

    print(f"\n{'FAIL' if bad else 'PASS'}: {bad} problem(s)")
    return 1 if bad else 0


if __name__ == "__main__":
    raise SystemExit(main())
