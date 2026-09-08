#!/usr/bin/env python3
"""Small local component browser and image-card generator.

This intentionally uses only the Python standard library. It does not execute
client code: opaque classes are not safe to instantiate without the game
bootstrap and cache. Instead it gives an investigator one isolated source
unit at a time, with a deterministic image that can be attached to an AI
analysis request.
"""

from __future__ import annotations

import argparse
import html
import json
import re
import socketserver
import struct
from dataclasses import dataclass
from pathlib import Path
from string import Template
from http.server import BaseHTTPRequestHandler
from urllib.parse import parse_qs, unquote, urlparse


ROOT = Path(__file__).resolve().parents[1]
SOURCE_ROOTS = (ROOT / "client" / "components", ROOT / "client" / "misc")
METHOD_RE = re.compile(r"(?m)^\s*(?:(?:public|private|protected|static|final|synchronized)\s+)+[\w<>\[\], ?]+\s+(\w+)\s*\(")
SAFE_NAME = re.compile(r"^[A-Za-z0-9_.-]+$")
SAFE_RUN = re.compile(r"^[0-9]{8}-[0-9]{6}$")


@dataclass(frozen=True)
class Component:
    name: str
    path: Path
    source: str

    @property
    def lines(self) -> int:
        return self.source.count("\n") + 1

    @property
    def methods(self) -> tuple[str, ...]:
        return tuple(dict.fromkeys(METHOD_RE.findall(self.source)))

    @property
    def field_count(self) -> int:
        """Approximate declarations for quick triage, not a Java parser."""
        return sum(1 for line in self.source.splitlines() if ";" in line and "(" not in line)


@dataclass(frozen=True)
class BufferView:
    path: Path
    data: bytes

    @property
    def name(self) -> str:
        return self.path.name


def components() -> dict[str, Component]:
    found: dict[str, Component] = {}
    for root in SOURCE_ROOTS:
        if not root.is_dir():
            continue
        for path in root.glob("*.java"):
            if not (path.name.startswith("Component") or path.name.startswith("DisplayModeManagerContainer")):
                continue
            found[path.stem] = Component(path.stem, path, path.read_text(encoding="utf-8", errors="replace"))
    return dict(sorted(found.items(), key=lambda item: item[0]))


def resolve_widget_run(widgets_dir: Path, run: str | None) -> Path | None:
    """Pick a dump run directory (explicit, LATEST pointer, or newest stamp)."""
    if not widgets_dir.is_dir():
        return None
    if run:
        if not SAFE_RUN.fullmatch(run):
            return None
        candidate = widgets_dir / run
        return candidate if candidate.is_dir() else None
    latest = widgets_dir / "LATEST"
    if latest.is_file():
        stamp = latest.read_text(encoding="utf-8").strip()
        if SAFE_RUN.fullmatch(stamp):
            candidate = widgets_dir / stamp
            if candidate.is_dir():
                return candidate
    stamped = sorted(
        (p for p in widgets_dir.iterdir() if p.is_dir() and SAFE_RUN.fullmatch(p.name)),
        key=lambda p: p.name,
        reverse=True,
    )
    return stamped[0] if stamped else None


def load_manifest(run_dir: Path) -> list[dict]:
    path = run_dir / "manifest.jsonl"
    if not path.is_file():
        return []
    rows: list[dict] = []
    for line in path.read_text(encoding="utf-8", errors="replace").splitlines():
        line = line.strip()
        if not line:
            continue
        try:
            rows.append(json.loads(line))
        except json.JSONDecodeError:
            continue
    return rows


def image_svg(component: Component) -> str:
    """Return a readable SVG source card; SVG is supported by browsers and vision tools."""
    lines = component.source.splitlines()
    width, line_height, top = 1500, 18, 118
    height = max(260, top + line_height * min(len(lines), 180) + 34)
    visible = lines[:180]
    text = "\n".join(
        f'<text x="32" y="{top + i * line_height}" class="code">'
        f'<tspan class="number">{i + 1:4d}</tspan> {html.escape(line[:170])}</text>'
        for i, line in enumerate(visible)
    )
    methods = ", ".join(component.methods[:8]) or "none detected"
    return f"""<svg xmlns="http://www.w3.org/2000/svg" width="{width}" height="{height}" viewBox="0 0 {width} {height}">
<rect width="100%" height="100%" fill="#101827"/>
<rect width="100%" height="84" fill="#17243a"/>
<text x="32" y="36" class="title">{html.escape(component.name)}</text>
<text x="32" y="62" class="meta">{component.lines} lines · {component.field_count} fields · methods: {html.escape(methods)}</text>
<text x="32" y="98" class="hint">Void Component Lab · source card · first 180 lines</text>
{text}
<style>
.title {{ font: 700 28px sans-serif; fill: #f8fafc }}
.meta,.hint {{ font: 15px sans-serif; fill: #9fb2cc }}
.code {{ font: 14px monospace; fill: #d8e2f0; white-space: pre }}
.number {{ fill: #7186a5 }}
</style></svg>"""


def buffer_svg(buffer: BufferView) -> str:
    """Render a bounded hex/ASCII view without interpreting game cache formats."""
    visible = buffer.data[:4096]
    rows = []
    for offset in range(0, len(visible), 16):
        chunk = visible[offset:offset + 16]
        hex_part = " ".join(f"{value:02x}" for value in chunk).ljust(47)
        ascii_part = "".join(chr(value) if 32 <= value < 127 else "." for value in chunk)
        rows.append(
            f'<text x="32" y="{124 + offset // 16 * 19}" class="code">'
            f'<tspan class="number">{offset:04x}</tspan> {hex_part}  {html.escape(ascii_part)}</text>'
        )
    height = max(260, 124 + len(rows) * 19 + 34)
    float_notes = []
    if len(buffer.data) >= 4:
        little = struct.unpack("<f", buffer.data[:4])[0]
        big = struct.unpack(">f", buffer.data[:4])[0]
        float_notes.append(f"first 4 bytes as float: LE {little:.6g} · BE {big:.6g}")
    note = " · ".join(float_notes) or "fewer than 4 bytes; no float preview"
    return f"""<svg xmlns="http://www.w3.org/2000/svg" width="1500" height="{height}" viewBox="0 0 1500 {height}">
<rect width="100%" height="100%" fill="#101827"/>
<rect width="100%" height="84" fill="#17243a"/>
<text x="32" y="36" class="title">{html.escape(buffer.name)}</text>
<text x="32" y="62" class="meta">{len(buffer.data)} bytes · showing {len(visible)} · {html.escape(note)}</text>
<text x="32" y="98" class="hint">Void Component Lab · local buffer view · hex + ASCII</text>
{"".join(rows)}
<style>
.title {{ font: 700 28px sans-serif; fill: #f8fafc }}
.meta,.hint {{ font: 15px sans-serif; fill: #9fb2cc }}
.code {{ font: 14px monospace; fill: #d8e2f0; white-space: pre }}
.number {{ fill: #7186a5 }}
</style></svg>"""


PAGE = Template("""<!doctype html>
<meta charset="utf-8">
<title>Void Component Lab</title>
<style>
body{font:15px system-ui;background:#0b1220;color:#e5edf8;margin:0}
header{padding:22px 28px;background:#17243a} h1{margin:0 0 6px}
header a{color:#b8d7ff;margin-right:14px}
main{display:grid;grid-template-columns:280px 1fr;min-height:calc(100vh - 105px)}
nav{padding:16px;border-right:1px solid #293952;overflow:auto}
nav a{display:block;color:#a9c8f5;text-decoration:none;padding:5px 8px;border-radius:4px}
nav a:hover,nav a.selected{background:#263b5d;color:white}
section{padding:24px;overflow:auto}.stats{color:#9fb2cc}
img{max-width:100%;background:#101827;border:1px solid #293952;image-rendering:pixelated}
pre{padding:16px;overflow:auto;background:#101827;border:1px solid #293952;font:13px monospace}
.button{color:#b8d7ff}
.grid{display:grid;grid-template-columns:repeat(auto-fill,minmax(140px,1fr));gap:12px}
.card{background:#101827;border:1px solid #293952;padding:8px;border-radius:6px}
.card img{width:100%;height:96px;object-fit:contain;background:#0b1220}
.card .meta{font:12px monospace;color:#9fb2cc;margin-top:6px;word-break:break-all}
.filters input{background:#0b1220;border:1px solid #293952;color:#e5edf8;padding:6px 8px;border-radius:4px;width:min(420px,100%)}
</style>
<header><h1>Void Component Lab</h1>
<div>$HEADER</div></header>
<main><nav>$NAV</nav><section>$CONTENT</section></main>
""")


class Handler(BaseHTTPRequestHandler):
    def __init__(
        self,
        request,
        client_address,
        server,
        catalog: dict[str, Component],
        buffer: BufferView | None,
        widgets_dir: Path | None,
    ):
        self.catalog = catalog
        self.buffer = buffer
        self.widgets_dir = widgets_dir
        super().__init__(request, client_address, server)

    def reply(self, body: str | bytes, content_type: str = "text/html; charset=utf-8", status: int = 200) -> None:
        data = body if isinstance(body, bytes) else body.encode("utf-8")
        self.send_response(status)
        self.send_header("Content-Type", content_type)
        self.send_header("Content-Length", str(len(data)))
        self.end_headers()
        self.wfile.write(data)

    def header_links(self) -> str:
        links = ['<a href="/">Components</a>']
        if self.widgets_dir is not None:
            links.append('<a href="/widgets">Live widgets</a>')
        if self.buffer is not None:
            links.append('<a href="/buffer.svg">Buffer card</a>')
        links.append('<span class="stats">source cards · live widget crops</span>')
        return " · ".join(links)

    def do_GET(self) -> None:  # noqa: N802 - BaseHTTPRequestHandler API
        parsed = urlparse(self.path)
        path = unquote(parsed.path)
        query = parse_qs(parsed.query)
        if path == "/":
            selected = next(iter(self.catalog), None)
            self.show(selected)
        elif path == "/buffer.svg":
            self.buffer_card()
        elif path == "/widgets":
            self.widgets_gallery(query.get("run", [None])[0], query.get("q", [""])[0])
        elif path.startswith("/widgets/file/"):
            self.widgets_file(path[len("/widgets/file/"):], query.get("run", [None])[0])
        elif path.startswith("/component/") and path.endswith(".svg"):
            self.svg(path[len("/component/"):-4])
        elif path.startswith("/component/"):
            self.show(path[len("/component/"):])
        else:
            self.reply("not found", "text/plain; charset=utf-8", 404)

    def show(self, name: str | None) -> None:
        if name is not None and not re.fullmatch(r"[A-Za-z0-9_]+", name):
            self.reply("not found", "text/plain; charset=utf-8", 404)
            return
        nav = "".join(
            f'<a class="{"selected" if item == name else ""}" href="/component/{html.escape(item)}">'
            f'{html.escape(item)}</a>' for item in self.catalog
        )
        component = self.catalog.get(name or "")
        if component is None:
            content = "<h2>No component selected</h2>"
        else:
            methods = ", ".join(component.methods) or "none detected"
            content = (f"<h2>{html.escape(component.name)}</h2>"
                       f'<p class="stats">{component.lines} lines · {component.field_count} field-like declarations</p>'
                       f'<p>Methods: {html.escape(methods)}</p>'
                       f'<p><a class="button" href="/component/{html.escape(component.name)}.svg">'
                       "Open image card</a> · right-click it to save for AI analysis</p>"
                       f"<pre>{html.escape(component.source)}</pre>")
        if self.buffer is not None:
            content += '<p><a class="button" href="/buffer.svg">Open local buffer card</a></p>'
        self.reply(PAGE.substitute(NAV=nav, CONTENT=content, HEADER=self.header_links()))

    def widgets_gallery(self, run: str | None, query: str) -> None:
        if self.widgets_dir is None:
            self.reply("no --widgets-dir supplied", "text/plain; charset=utf-8", 404)
            return
        run_dir = resolve_widget_run(self.widgets_dir, run)
        runs = sorted(
            (p.name for p in self.widgets_dir.iterdir() if p.is_dir() and SAFE_RUN.fullmatch(p.name)),
            reverse=True,
        ) if self.widgets_dir.is_dir() else []
        nav = "".join(
            f'<a class="{"selected" if r == (run_dir.name if run_dir else None) else ""}" '
            f'href="/widgets?run={html.escape(r)}">{html.escape(r)}</a>'
            for r in runs
        ) or '<span class="stats">no dumps yet</span>'
        if run_dir is None:
            content = (
                "<h2>Live widget dumps</h2>"
                "<p class=\"stats\">No dump runs found. With the desktop client running:</p>"
                "<pre>export VOID_WIDGET_DUMP=widget-dumps\n"
                "make desktop-run SERVER_IP=…\n"
                "make widget-dump-request</pre>"
            )
            self.reply(PAGE.substitute(NAV=nav, CONTENT=content, HEADER=self.header_links()))
            return
        rows = load_manifest(run_dir)
        q = (query or "").strip().lower()
        if q:
            filtered = []
            for row in rows:
                blob = " ".join(
                    str(row.get(k, ""))
                    for k in ("packedId", "spriteId", "contentType", "text", "textContent", "debugName", "options", "type")
                ).lower()
                if q in blob:
                    filtered.append(row)
            rows = filtered
        cards = []
        for row in rows:
            file_name = str(row.get("file", ""))
            if not SAFE_NAME.fullmatch(file_name):
                continue
            opts = row.get("options") or []
            opt_s = ", ".join(str(o) for o in opts[:4])
            label = row.get("debugName") or row.get("textContent") or row.get("text") or ""
            cards.append(
                "<div class=\"card\">"
                f'<a href="/widgets/file/{html.escape(file_name)}?run={html.escape(run_dir.name)}">'
                f'<img src="/widgets/file/{html.escape(file_name)}?run={html.escape(run_dir.name)}" '
                f'alt="{html.escape(file_name)}" loading="lazy"></a>'
                f'<div class="meta">packed={html.escape(str(row.get("packedId")))} '
                f'child={html.escape(str(row.get("childIndex")))}<br>'
                f'type={html.escape(str(row.get("type")))} '
                f'sprite={html.escape(str(row.get("spriteId")))} '
                f'ct={html.escape(str(row.get("contentType")))}<br>'
                f'{html.escape(str(label))}<br>{html.escape(opt_s)}</div></div>'
            )
        frame_link = ""
        if (run_dir / "_frame.png").is_file():
            frame_link = (
                f'<p><a class="button" href="/widgets/file/_frame.png?run={html.escape(run_dir.name)}">'
                "Open full frame</a></p>"
            )
        content = (
            f"<h2>Live widgets · {html.escape(run_dir.name)}</h2>"
            f'<p class="stats">{len(rows)} crops'
            f'{" (filtered)" if q else ""} · max edge 400px</p>'
            f'{frame_link}'
            f'<form class="filters" method="get" action="/widgets">'
            f'<input type="hidden" name="run" value="{html.escape(run_dir.name)}">'
            f'<input name="q" value="{html.escape(query or "")}" '
            f'placeholder="filter: packedId, sprite, text, option…">'
            f"</form>"
            f'<div class="grid">{"".join(cards) or "<p class=stats>no matching crops</p>"}</div>'
        )
        self.reply(PAGE.substitute(NAV=nav, CONTENT=content, HEADER=self.header_links()))

    def widgets_file(self, name: str, run: str | None) -> None:
        if self.widgets_dir is None or not SAFE_NAME.fullmatch(name):
            self.reply("not found", "text/plain; charset=utf-8", 404)
            return
        run_dir = resolve_widget_run(self.widgets_dir, run)
        if run_dir is None:
            self.reply("not found", "text/plain; charset=utf-8", 404)
            return
        path = (run_dir / name).resolve()
        if not str(path).startswith(str(run_dir.resolve())) or not path.is_file():
            self.reply("not found", "text/plain; charset=utf-8", 404)
            return
        self.reply(path.read_bytes(), "image/png")

    def svg(self, name: str) -> None:
        if not re.fullmatch(r"[A-Za-z0-9_]+", name):
            self.reply("not found", "text/plain; charset=utf-8", 404)
            return
        component = self.catalog.get(name)
        if component is None:
            self.reply("not found", "text/plain; charset=utf-8", 404)
        else:
            self.reply(image_svg(component), "image/svg+xml; charset=utf-8")

    def buffer_card(self) -> None:
        if self.buffer is None:
            self.reply("no buffer supplied; use --buffer PATH", "text/plain; charset=utf-8", 404)
        else:
            self.reply(buffer_svg(self.buffer), "image/svg+xml; charset=utf-8")

    def log_message(self, *_: object) -> None:
        pass


def export_cards(catalog: dict[str, Component], directory: Path) -> None:
    directory.mkdir(parents=True, exist_ok=True)
    for component in catalog.values():
        (directory / f"{component.name}.svg").write_text(image_svg(component), encoding="utf-8")
    print(f"exported {len(catalog)} image cards to {directory}")


def filter_catalog(catalog: dict[str, Component], names: list[str] | None) -> dict[str, Component]:
    """Keep only the named components when --component is set (one or more)."""
    if not names:
        return catalog
    missing = [name for name in names if name not in catalog]
    if missing:
        raise SystemExit(f"unknown component(s): {', '.join(missing)}")
    return {name: catalog[name] for name in names}


def main() -> None:
    parser = argparse.ArgumentParser(description="Browse opaque client components and make AI-ready SVG cards.")
    parser.add_argument("--port", type=int, default=8765)
    parser.add_argument(
        "--component",
        action="append",
        metavar="NAME",
        help="limit browse/export to this component (repeatable); e.g. --component Component2",
    )
    parser.add_argument("--export-dir", type=Path, help="write one SVG card per component and exit")
    parser.add_argument("--buffer", type=Path, help="read a local binary buffer and expose /buffer.svg")
    parser.add_argument("--export-buffer", type=Path, help="write the buffer SVG card to this path and exit")
    parser.add_argument(
        "--widgets-dir",
        type=Path,
        help="browse live WidgetDump PNG crops (VOID_WIDGET_DUMP dir)",
    )
    args = parser.parse_args()
    catalog = filter_catalog(components(), args.component)
    # Cap reads so main_file_cache.dat2 (~200MB) is not slurped for a 4KB SVG preview.
    buffer = None
    if args.buffer:
        path = args.buffer
        max_read = 512 * 1024
        with path.open("rb") as handle:
            data = handle.read(max_read)
        buffer = BufferView(path, data)
    if args.export_dir:
        export_cards(catalog, args.export_dir)
        return
    if args.export_buffer:
        if buffer is None:
            parser.error("--export-buffer requires --buffer")
        args.export_buffer.parent.mkdir(parents=True, exist_ok=True)
        args.export_buffer.write_text(buffer_svg(buffer), encoding="utf-8")
        print(f"exported buffer card to {args.export_buffer}")
        return
    widgets_dir = args.widgets_dir

    def handler(request, address, server):
        return Handler(request, address, server, catalog, buffer, widgets_dir)

    with socketserver.ThreadingTCPServer(("127.0.0.1", args.port), handler) as server:
        server.daemon_threads = True
        extra = f", widgets={widgets_dir}" if widgets_dir else ""
        print(f"Component Lab: http://127.0.0.1:{args.port}/ ({len(catalog)} components{extra})")
        if widgets_dir:
            print(f"  Live widgets: http://127.0.0.1:{args.port}/widgets")
        try:
            server.serve_forever()
        except KeyboardInterrupt:
            pass


if __name__ == "__main__":
    main()
