plugins {
    kotlin("jvm") version "1.5.0"
    kotlin("kapt") version "1.5.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    kapt("com.google.dagger:dagger-compiler:2.35.1")
    implementation("com.google.dagger:dagger:2.35.1")
}
