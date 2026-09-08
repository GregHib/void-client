# Android

Software-rendered 634 client on ART. Root runbook: **[README.md](../README.md)**.

```bash
make android
make android-server SERVER_IP=192.168.1.10
make android-log
```

Defaults: USB reverse → `127.0.0.1`; emulator → `10.0.2.2`; else probe / LAN fallback via `debug.void.server` / `void.server`.
