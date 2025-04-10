dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

include(":subprojects:java")
include(":subprojects:kotlin")

rootProject.name = "gradle-eager-configuration-realization"
