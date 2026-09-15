import java.security.MessageDigest
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

// webpack.config.d/dev-credentials.js inlines VOID_DEV_USERNAME/VOID_DEV_PASSWORD from the build
// environment. Gradle does not see environment variables as task inputs, so without this a bundle
// built once with credentials would stay up-to-date (credentials included) until a source changed.
// A hash keeps the values themselves out of the task history.
tasks.withType<org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpack>().configureEach {
    val credentials = (System.getenv("VOID_DEV_USERNAME") ?: "") + "\u0000" + (System.getenv("VOID_DEV_PASSWORD") ?: "")
    inputs.property(
        "devCredentialsHash",
        MessageDigest.getInstance("SHA-256").digest(credentials.toByteArray()).joinToString("") { "%02x".format(it) },
    )
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