plugins {
    id("java")
}

group = "com.serenity"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val SERENITY_VERSION by extra("3.6.23")
val SERENITY_MAVEN_VERSION by extra("3.11.0")
val JUNIT_VERSION by extra("4.13.2")

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("net.serenity-bdd:serenity-cucumber:${SERENITY_VERSION}")
    testImplementation("junit:junit:${JUNIT_VERSION}")
    implementation("net.serenity-bdd:serenity-core:${SERENITY_VERSION}")
    implementation("net.serenity-bdd:serenity-junit:${SERENITY_VERSION}")
    implementation("net.serenity-bdd:serenity-screenplay-webdriver:${SERENITY_VERSION}")
    implementation("net.serenity-bdd:serenity-screenplay:${SERENITY_VERSION}")
    implementation("net.serenity-bdd.maven.plugins:serenity-maven-plugin:${SERENITY_VERSION}")
    implementation("org.apache.maven.plugins:maven-compiler-plugin:${SERENITY_MAVEN_VERSION}")
}

tasks.test {
    useJUnitPlatform()
}