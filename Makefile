.DEFAULT_GOAL := help

ANDROID     := android
IOS         := ios

JAVA_17     ?= $(HOME)/.jdks/jdk-17.0.20.1+1/Contents/Home

GAME_PORT   ?= 43594
SERVER_IP   ?=

ANDROID_PKG ?= world.gregs.voidosrs.android
ANDROID_ACT ?= $(ANDROID_PKG)/.MainActivity
IOS_PKG     ?= world.gregs.voidosrs.ios
IOS_DEVICE  ?= iPhone 17 Pro
IOS_ARCH    ?= arm64
TVOS_PKG    ?= world.gregs.voidosrs.tvos
TVOS_DEVICE ?= Apple TV

.PHONY: help \
	desktop desktop-jar desktop-run \
	component-lab component-lab-images \
	widget-dump-request widget-lab widget-map \
	desktop-log desktop-clear-log \
	android android-install android-build android-reverse android-run \
	android-stop android-log android-clean android-server \
	android-apk \
	ios ios-sim ios-build ios-relaunch ios-device ios-clean \
	tvos tvos-sim tvos-device tvos-clean

help:
	@echo "void-client"
	@echo "  Server must already be running elsewhere on TCP $(GAME_PORT)."
	@echo "  Point clients with SERVER_IP=… (see android-server / README)."
	@echo ""
	@echo "desktop"
	@echo "  make desktop          :client:run"
	@echo "  make desktop-jar      :client:shadowJar"
	@echo "  make desktop-run      jar with --address (SERVER_IP or 127.0.0.1)"
	@echo "  make desktop-log      jar + DeobProbe NDJSON (VOID_DEOB_LOG=…)"
	@echo "  make desktop-clear-log  rm the DeobProbe log"
	@echo ""
	@echo "Component Lab:"
	@echo "  make component-lab       browse components at http://127.0.0.1:8765"
	@echo "  make component-lab-images export SVG cards (OUT=...)"
	@echo "  make widget-lab          browse live WidgetDump crops (--widgets-dir)"
	@echo "  make widget-dump-request touch REQUEST (needs VOID_WIDGET_DUMP desktop-run)"
	@echo "  make widget-map         build widget-map/ from latest dump (no clicks)"
	@echo "  Shift+click in-game     pick widget → widget-map/picks.jsonl"
	@echo "  Ctrl+Shift+click        dump IF group tree → widget-map/group-N.txt"
	@echo ""
	@echo "android"
	@echo "  make android          installDebug + reverse + launch"
	@echo "  make android-install  :app:installDebug"
	@echo "  make android-build    :app:assembleDebug"
	@echo "  make android-apk      assembleDebug + copy app-debug.apk to resources/"
	@echo "  make android-reverse  adb reverse :$(GAME_PORT)"
	@echo "  make android-run      force-stop + reverse + start"
	@echo "  make android-stop     force-stop"
	@echo "  make android-log      logcat -s void-osrs:I"
	@echo "  make android-server   setprop debug.void.server=\$$SERVER_IP + relaunch"
	@echo "  make android-clean    clean"
	@echo "ios"
	@echo "  make ios              launchIPhoneSimulator ($(IOS_DEVICE))"
	@echo "  make ios-sim          alias of ios"
	@echo "  make ios-build        assemble (no launch)"
	@echo "  make ios-relaunch     simctl install + launch"
	@echo "  make ios-device       physical iPad (sign + devicectl)"
	@echo "  make ios-clean        clean"
	@echo "tvOS / Apple TV"
	@echo "  make tvos / tvos-sim  Apple TV Simulator (build + simctl)"
	@echo "  make tvos-device      physical Apple TV (sign + devicectl)"
	@echo "  make tvos-clean       clean (same ios/ module)"

check-java17:
	@test -x "$(JAVA_17)/bin/java" || (echo "missing arm64 JDK 17 at JAVA_17=$(JAVA_17)"; exit 1)
	@$(JAVA_17)/bin/java -XshowSettings:properties -version 2>&1 | grep -q 'os.arch = aarch64' \
		|| (echo "JAVA_17 must be arm64 (os.arch=aarch64), got:"; \
		    $(JAVA_17)/bin/java -XshowSettings:properties -version 2>&1 | grep os.arch; exit 1)

# ── desktop ──────────────────────────────────────────────────────────────────

DESKTOP_JAR := client/build/libs/void-client-1.2.0.jar
DESKTOP_ADDR := $(if $(SERVER_IP),$(SERVER_IP),127.0.0.1)

desktop: check-java17
	JAVA_HOME="$(JAVA_17)" PATH="$(JAVA_17)/bin:$$PATH" ./gradlew :client:run

desktop-jar: check-java17
	JAVA_HOME="$(JAVA_17)" PATH="$(JAVA_17)/bin:$$PATH" ./gradlew :client:shadowJar

# Rebuild jar, kill any prior desktop client, then launch with --address.
# Optional live widget dump: VOID_WIDGET_DUMP=widget-dumps make desktop-run …
desktop-run: desktop-jar
	@pkill -f 'void-client-1\.2\.0\.jar' 2>/dev/null || true
	@sleep 1
	@if [ -n "$$VOID_WIDGET_DUMP" ]; then mkdir -p "$$VOID_WIDGET_DUMP"; fi
	@if [ -n "$$VOID_WIDGET_DUMP" ]; then \
		"$(JAVA_17)/bin/java" -Dvoid.widget.dump="$$VOID_WIDGET_DUMP" \
			-jar "$(DESKTOP_JAR)" --address $(DESKTOP_ADDR); \
	else \
		"$(JAVA_17)/bin/java" -jar "$(DESKTOP_JAR)" --address $(DESKTOP_ADDR); \
	fi

# Run with the DeobProbe NDJSON harness enabled. Logs go to $(DEOB_LOG)
# (default deob-log.ndjson). Use a hypothesis id and grep the log later:
#   VOID_DEOB_LOG=deob-H1.ndjson make desktop-log
DEOB_LOG ?= deob-log.ndjson

desktop-log: desktop-jar
	@pkill -f 'void-client-1\.2\.0\.jar' 2>/dev/null || true
	@sleep 1
	"$(JAVA_17)/bin/java" -Dvoid.deob.log="$(DEOB_LOG)" -jar "$(DESKTOP_JAR)" --address $(DESKTOP_ADDR)

desktop-clear-log:
	rm -f "$(DEOB_LOG)"

WIDGET_DUMP_DIR ?= widget-dumps

component-lab:
	python3 tools/component_lab.py

component-lab-images:
	python3 tools/component_lab.py --export-dir "$${OUT:-component-cards}"

# Browse PNGs produced by WidgetDump (see VOID_WIDGET_DUMP / make widget-dump-request).
widget-lab:
	python3 tools/component_lab.py --widgets-dir "$(WIDGET_DUMP_DIR)" --port "$${PORT:-8767}"

# Ask a running desktop client (with VOID_WIDGET_DUMP set) to dump open widgets now.
widget-dump-request:
	@mkdir -p "$(WIDGET_DUMP_DIR)"
	@touch "$(WIDGET_DUMP_DIR)/REQUEST"
	@echo "queued dump → $(WIDGET_DUMP_DIR)/REQUEST (watch desktop console for void-osrs widget-dump:)"

# Build widget-map/ from latest (or DUMP=…) WidgetDump run — no clicks.
widget-map:
	python3 tools/widget_map_from_dump.py --latest

# ── android ──────────────────────────────────────────────────────────────────

android-build:
	cd $(ANDROID) && ./gradlew :app:assembleDebug

# Build the debug APK and copy it to resources/ at the repo root.
# Output: resources/app-debug.apk
# Fails if assembleDebug did not refresh the APK (stale copy from a prior success).
ANDROID_APK_SRC := $(ANDROID)/app/build/outputs/apk/debug/app-debug.apk
ANDROID_APK_DST := resources/app-debug.apk

android-apk: android-build
	@test -f $(ANDROID_APK_SRC) || (echo "missing $(ANDROID_APK_SRC) — assembleDebug failed"; exit 1)
	@mkdir -p resources
	@cp -f $(ANDROID_APK_SRC) $(ANDROID_APK_DST)
	@echo "APK -> $(ANDROID_APK_DST) ($$(stat -f '%Sm' -t '%Y-%m-%d %H:%M:%S' $(ANDROID_APK_DST)))"

android-install:
	cd $(ANDROID) && ./gradlew :app:installDebug

android-reverse:
	@$(ANDROID)/scripts/adb-reverse.sh $(GAME_PORT)

android-stop:
	adb shell am force-stop $(ANDROID_PKG)

android-run: android-stop android-reverse
	adb shell am start -n $(ANDROID_ACT)

android: android-install android-run

android-log:
	adb logcat -s void-osrs:I

android-server:
	@test -n "$(SERVER_IP)" || (echo "usage: make android-server SERVER_IP=192.168.1.10"; exit 1)
	adb shell setprop debug.void.server $(SERVER_IP)
	$(MAKE) android-run

android-clean:
	cd $(ANDROID) && ./gradlew clean

# ── ios ──────────────────────────────────────────────────────────────────────

ios ios-sim: check-java17
	cd $(IOS) && JAVA_HOME="$(JAVA_17)" PATH="$(JAVA_17)/bin:$$PATH" \
		./gradlew --no-daemon launchIPhoneSimulator \
		-Probovm.arch=$(IOS_ARCH) \
		-Probovm.device.name='$(IOS_DEVICE)'

ios-build: check-java17
	cd $(IOS) && JAVA_HOME="$(JAVA_17)" PATH="$(JAVA_17)/bin:$$PATH" \
		./gradlew --no-daemon assemble \
		-Probovm.arch=$(IOS_ARCH)

ios-relaunch:
	xcrun simctl install booted $(IOS)/build/robovm.tmp/Void.app
	xcrun simctl launch booted $(IOS_PKG)

ios-device:
	bash .cursor/skills/run-mobile-device/scripts/ios-device.sh

tvos tvos-sim: check-java17
	bash .cursor/skills/run-mobile-device/scripts/tvos-sim.sh

tvos-device:
	bash .cursor/skills/run-mobile-device/scripts/tvos-device.sh

tvos-clean: ios-clean

ios-clean: check-java17
	cd $(IOS) && JAVA_HOME="$(JAVA_17)" PATH="$(JAVA_17)/bin:$$PATH" ./gradlew --no-daemon clean
