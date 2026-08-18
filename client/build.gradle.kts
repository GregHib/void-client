plugins {
    application
    id("com.gradleup.shadow") version "8.3.10"
}

group = "world.gregs.void"
version = "1.2.0"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

val lwjglVersion = "3.3.6"
val lwjglNatives = listOf(
    "natives-macos-arm64", "natives-macos",
    "natives-linux", "natives-linux-arm64",
    "natives-windows", "natives-windows-x86"
)

dependencies {
    implementation(files("../libs/clientlibs.jar"))

    // Pure-Java jaggl/jaclib replacement backend (hardware rendering on modern
    // macOS/Linux/Windows). client/src/jaggl and client/src/jaclib shadow the
    // classes in clientlibs.jar - the classpath (and shadowJar) order makes the
    // project classes win.
    implementation("org.lwjgl:lwjgl:$lwjglVersion")
    implementation("org.lwjgl:lwjgl-opengl:$lwjglVersion")
    implementation("org.lwjgl:lwjgl-jawt:$lwjglVersion")
    implementation("org.lwjglx:lwjgl3-awt:0.2.3") {
        isTransitive = false // its pom leaks an unresolved ${lwjgl.natives} classifier
    }
    for (natives in lwjglNatives) {
        runtimeOnly("org.lwjgl:lwjgl:$lwjglVersion:$natives")
        runtimeOnly("org.lwjgl:lwjgl-opengl:$lwjglVersion:$natives")
    }
}

java {
    sourceSets {
        main {
            java.srcDirs("src")
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

// `./gradlew run -Pjfr` records a JDK Flight Recorder profile to client/client.jfr
// (open it with JDK Mission Control or `jfr print`). Requires a JRE with JFR
// (OpenJDK 8u262+; the provisioned toolchain qualifies).
tasks.named<JavaExec>("run") {
    if (project.hasProperty("jfr")) {
        jvmArgs(
            "-XX:StartFlightRecording=filename=client.jfr,settings=profile,dumponexit=true",
            "-XX:FlightRecorderOptions=stackdepth=256"
        )
    }
}

tasks.shadowJar {
    archiveBaseName.set("void-client")
    archiveClassifier.set("")
    minimize()
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