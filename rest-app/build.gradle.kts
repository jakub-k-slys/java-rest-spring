plugins {
    id("org.springframework.boot") version "3.0.4"
    id("java")
    id("me.champeau.jmh") version "0.6.8"
}

apply(plugin = "io.spring.dependency-management")

group = "dev.slys.example"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    jmh("org.openjdk.jmh:jmh-core:1.34")
    jmh("org.openjdk.jmh:jmh-generator-annprocess:1.34")
    jmhAnnotationProcessor("org.openjdk.jmh:jmh-generator-annprocess:1.34")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
