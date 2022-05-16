plugins {
    kotlin("jvm") version "1.6.20"
//    id "org.jetbrains.kotlin.jvm" version "1.9.0"
    application
}

group = "org.lyrieek.ldb"
description "接收许多不同数据来源的db"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain {
        (this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of(17))
    }
}
