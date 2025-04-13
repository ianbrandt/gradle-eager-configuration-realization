dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

include(":subprojects:control")
include(":subprojects:reproducer")

rootProject.name = "gradle-eager-configuration-realization"
