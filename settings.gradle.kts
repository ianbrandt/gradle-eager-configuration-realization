dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

include(":subprojects:app")
include(":subprojects:java-library")
include(":subprojects:kotlin-library")

rootProject.name = "gradle-eager-configuration-realization"

gradle.beforeProject {
    // Set group and version properties for all projects
    group = "com.ianbrandt.mre"
    version = "1.0.0-SNAPSHOT"
}
