import PublishConfig.configPublications
import PublishConfig.configPublish
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        maven("http://nexus3.mystery0.vip/repository/maven-public/")
        maven("https://maven.aliyun.com/repository/public/")
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
    }
}

plugins {
    kotlin("jvm") version "1.4.30"
    `maven-publish`
}

group = "vip.mystery0.tools"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    maven("http://nexus3.mystery0.vip/repository/maven-public/")
    maven("https://maven.aliyun.com/repository/public/")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib", org.jetbrains.kotlin.config.KotlinCompilerVersion.VERSION))
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    compileOnly("javax.servlet:javax.servlet-api:4.0.1")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.1")
    api("com.google.guava:guava:30.1-jre")
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
    withSourcesJar()
}

publishing {
    configPublish(project)

    publications {
        create<MavenPublication>("maven") {
            configPublications(project, "java.tools")
        }
    }
}