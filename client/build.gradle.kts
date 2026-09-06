plugins {
    application
    id("com.gradleup.shadow") version "8.3.10"
}

group = "world.gregs.void"
version = "1.2.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(files("../libs/clientlibs.jar"))
    // Desktop DualShock / Xbox / etc. → virtual mouse + JoystickAlias (SDL via Jamepad).
    // Mobile hosts use Android InputDevice / iOS GCController instead — not on their CP.
    implementation("com.badlogicgames.jamepad:jamepad:2.26.5.0")
}

java {
    sourceSets {
        main {
            // All roots stay in the Java *unnamed* (default) package — a named package
            // cannot reference the 634 types. Nested dirs (toolkit/gl, …) are EACH a
            // separate srcDir so the directory name is not treated as a package.
            // See client/microbot/README.md for the domain map.
            java.srcDirs(
                "src",
                "fonts",
                "input",
                "menu",
                "void",
                "microbot",
                "rs2",
                "toolkit/base",
                "toolkit/gl",
                "toolkit/software",
                "toolkit/d3d",
                "shaders/base",
                "shaders/gl",
                "shaders/d3d",
                "sprites",
                "scene/graph",
                "scene/particles",
                "scene/buffers",
                "entities",
                "nodes",
                "defs",
                "cache",
                "net/socket",
                "net/crypto",
                "net/http",
                "net/packet",
                "media/audio",
                "media/ogg",
                "media/video",
                "script",
                "ifaces",
                "editor",
                "native",
                "text",
                "display",
                "components",
                "misc",
                "deob",
                "tts",
            )
            resources.srcDirs("resources")
        }
    }
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }

    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

application {
    mainClass = "Loader"
}

tasks.shadowJar {
    archiveBaseName.set("void-client")
    archiveClassifier.set("")
    // Keep jamepad + jnigen natives — minimize would strip the .dylib/.so.
    // gamecontrollerdb.txt is shipped from client/resources/ (jamepad jar omits it).
    minimize {
        exclude(dependency("com.badlogicgames.jamepad:jamepad:.*"))
        exclude(dependency("com.badlogicgames.gdx:gdx-jnigen-loader:.*"))
    }
}

// Must be a 32-bit jre - ideally with jlink
val jrePath = file("${System.getProperty("user.home")}/.jdks/jdk1.8.0_171/")

// Build a bundle with an in-built 32-bit jre.
tasks.register<Zip>("bundleApp") {
    dependsOn(tasks.named("shadowJar"))

    archiveFileName.set("void-bundle.zip")
    destinationDirectory.set(layout.buildDirectory.dir("dist"))

    val shadowJar = tasks.shadowJar.get()
    from(shadowJar.archiveFile) {
        rename { "client.jar" }
        into("void-bundle")
    }
    from(jrePath) {
        into("void-bundle/jre")
    }
}
