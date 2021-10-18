val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val koin_version: String by project.extra{"3.2.1"}
val kmongo_coroutine: String by project

plugins {
    application
    kotlin("jvm") version "1.5.31"
}

group = "com.devhighlevel"
version = "0.0.1"
application {
    mainClass.set("com.devhighlevel.ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-auth:$ktor_version")
    implementation("io.ktor:ktor-auth-jwt:$ktor_version")
    implementation("io.ktor:ktor-gson:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    // Koin for Ktor
    implementation("io.insert-koin:koin-ktor:3.1.2")
    // SLF4J Logger
    implementation ("io.insert-koin:koin-logger-slf4j:3.1.2")
    // KMongo
    implementation("org.litote.kmongo:kmongo-coroutine:$kmongo_coroutine")
    // https://mvnrepository.com/artifact/com.fasterxml.jackson.module/jackson-module-kotlin
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.0")

    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test:$kotlin_version")
}