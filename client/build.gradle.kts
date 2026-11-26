plugins {
    application
    id("com.gradleup.shadow") version "8.3.10"
}

group = "world.gregs.void"
version = "1.2.1"

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