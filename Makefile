SHELL := bash

SRC_DIR ?= client/src
BUILD_DIR ?= build
CLASSES_DIR ?= $(BUILD_DIR)/classes
SOURCES_FILE ?= $(BUILD_DIR)/sources.txt

LIBS ?= libs/clientlibs.jar
MAIN_CLASS ?= Loader
OUT_JAR ?= $(BUILD_DIR)/void-client.jar

ifdef JAVA_HOME
JAVA := $(JAVA_HOME)/bin/java
JAVAC := $(JAVA_HOME)/bin/javac
JAR := $(JAVA_HOME)/bin/jar
else
JAVA ?= java
JAVAC ?= javac
JAR ?= jar
endif

.PHONY: help sources compile jar run clean

help:
	@echo "Targets:"
	@echo "  make sources   - write $(SOURCES_FILE)"
	@echo "  make compile   - compile $(SRC_DIR) into $(CLASSES_DIR)"
	@echo "  make jar       - build runnable jar at $(OUT_JAR) (Main-Class: $(MAIN_CLASS))"
	@echo "  make run       - run $(MAIN_CLASS) using $(OUT_JAR) + $(LIBS)"
	@echo "  make clean     - remove $(BUILD_DIR)"
	@echo ""
	@echo "Vars:"
	@echo "  JAVA_HOME=/path/to/jdk   (use a specific JDK)"
	@echo "  LIBS=libs/clientlibs.jar (classpath deps)"
	@echo ""
	@echo "Tip:"
	@echo "  tools/bootstrap-jdk.sh 8  (downloads a repo-local JDK into .jdk/)"

sources:
	@mkdir -p "$(BUILD_DIR)"
	@find "$(SRC_DIR)" -maxdepth 1 -name '*.java' -print | sort > "$(SOURCES_FILE)"
	@echo "Wrote $(SOURCES_FILE) ($$(wc -l < "$(SOURCES_FILE)") files)"

compile: sources
	@mkdir -p "$(CLASSES_DIR)"
	@echo "Compiling with: $(JAVAC)"
	@"$(JAVAC)" -Xlint:none -cp "$(LIBS)" -d "$(CLASSES_DIR)" @"$(SOURCES_FILE)"

jar: compile
	@mkdir -p "$(BUILD_DIR)"
	@echo "Jarring to: $(OUT_JAR)"
	@"$(JAR)" cfe "$(OUT_JAR)" "$(MAIN_CLASS)" -C "$(CLASSES_DIR)" .

run: jar
	@"$(JAVA)" -cp "$(OUT_JAR):$(LIBS)" "$(MAIN_CLASS)"

clean:
	rm -rf "$(BUILD_DIR)"
