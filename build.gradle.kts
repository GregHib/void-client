plugins {
    kotlin("multiplatform") version "2.2.20"
}

group = "world.gregs.void"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(24)

    jvm()

    js(IR) {
        browser {
            commonWebpackConfig {
                outputFileName = "void-client.js"
            }
        }
        binaries.executable()
    }

    sourceSets {
        jvmTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }

    compilerOptions {
        freeCompilerArgs.add("-Xexpect-actual-classes")
    }
    sourceSets.commonMain.dependencies {
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.11.0")
        implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.7.1")
    }
}

// jsBrowserDevelopmentWebpack emits only the bundle, so index.html would be missing from its
// output directory. Copy jsMain/resources alongside it to make that directory directly servable.
val jsCopyDevResources = tasks.register<Copy>("jsCopyDevResources") {
    from(tasks.named("jsProcessResources"))
    into(layout.buildDirectory.dir("kotlin-webpack/js/developmentExecutable"))
}

tasks.named("jsBrowserDevelopmentWebpack") {
    finalizedBy(jsCopyDevResources)
}

tasks {
    val fatJar = register<Jar>("fatJar") {
        dependsOn("jvmJar")
        archiveClassifier.set("standalone")
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
        manifest { attributes(mapOf("Main-Class" to "Loader")) }
        val runtimeClasspath = configurations.getByName("jvmRuntimeClasspath")
        val jvmJar = named<Jar>("jvmJar")
        from(jvmJar.map { zipTree(it.archiveFile) })
        from(runtimeClasspath.map { if (it.isDirectory) it else zipTree(it) })
    }
    build {
        dependsOn(fatJar)
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}