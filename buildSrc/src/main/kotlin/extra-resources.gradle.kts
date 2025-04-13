package com.ianbrandt.mre.buildlogic

import com.ianbrandt.mre.buildlogic.attributes.applyExtraResourcesLibraryElementsAttributes
import org.gradle.api.artifacts.type.ArtifactTypeDefinition.JVM_RESOURCES_DIRECTORY

@Suppress("UnstableApiUsage")
configurations.consumable("extraElements") {
    logger.lifecycle(
        "Kotlin Gradle Plugin project consumable configuration created:",
        RuntimeException("Configuration realization stacktrace")
    )

    attributes {
        applyExtraResourcesLibraryElementsAttributes(objects)
    }
}

val extraResourcesDir: Provider<Directory> =
    provider { layout.projectDirectory.dir("src/main/extra") }

if (extraResourcesDir.get().asFile.exists()) {
    artifacts.add("extraElements", extraResourcesDir) {
        type = JVM_RESOURCES_DIRECTORY
    }
}
