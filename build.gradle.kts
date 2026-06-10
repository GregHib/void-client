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

    sourceSets {
        jvmTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
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