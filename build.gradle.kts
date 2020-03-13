import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        maven("${PublishConfig.NEXUS_URL}/repository/maven-public/")
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
    }
}

plugins {
    kotlin("jvm") version "1.3.61"
}

group = "vip.mystery0.tools"
java.sourceCompatibility = JavaVersion.VERSION_1_8

val nexusUrl = System.getenv("NEXUS_URL") ?: PublishConfig.NEXUS_URL

repositories {
    maven("$nexusUrl/repository/maven-public/")
    maven("$nexusUrl/repository/maven-releases/")
    maven("$nexusUrl/repository/maven-snapshots/")
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    compileOnly("javax.servlet:servlet-api:2.5")
    compileOnly("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.9")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.5.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}

java {
    PublishConfig.sourceFiles = sourceSets["main"].java.srcDirs
}

apply(from = "push.gradle.kts")