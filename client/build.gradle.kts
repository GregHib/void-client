plugins {
    application
    id("com.gradleup.shadow") version "8.3.10"
    jacoco
}

group = "world.gregs.void"
version = "1.2.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(files("../libs/clientlibs.jar"))
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

tasks.shadowJar {
    archiveBaseName.set("void-client")
    archiveClassifier.set("")
    minimize()
}

// Runs CacheItemSpriteDumper standalone and records, via JaCoCo, exactly which
// classes/methods actually execute - useful for figuring out what a slice of
// this codebase (e.g. "just render item icons") actually depends on so it can
// be extracted on its own.
val dumpItemSprites = tasks.register<JavaExec>("dumpItemSprites") {
    group = "tools"
    description = "Dumps every item's inventory icon from a local cache directory (see CacheItemSpriteDumper.java for the hardcoded cache path)."
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("CacheItemSpriteDumper")
}
jacoco.applyTo(dumpItemSprites.get())

tasks.register<JacocoReport>("dumpItemSpritesCoverageReport") {
    group = "tools"
    description = "HTML/CSV report of every class and method touched by the dumpItemSprites task."
    dependsOn("dumpItemSprites")
    executionData(layout.buildDirectory.file("jacoco/dumpItemSprites.exec"))
    sourceSets(sourceSets["main"])
    reports {
        html.required.set(true)
        csv.required.set(true)
        xml.required.set(false)
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