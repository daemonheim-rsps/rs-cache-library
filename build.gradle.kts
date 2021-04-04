plugins {
    id("java")
    kotlin("jvm") version "1.4.32"
    id("maven")
}

group = "com.displee"
version = "6.8"
description = "A library written in Kotlin used to read and write to all cache formats of RuneScape."

tasks.withType<JavaCompile> {
    sourceCompatibility = "15"
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.github.jponge:lzma-java:1.3")
    implementation("com.displee:disio:2.2")
    implementation("org.apache.ant:ant:1.10.9")
    testImplementation("junit:junit:4.12")
}