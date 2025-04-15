package com.ianbrandt.mre.buildlogic

import com.ianbrandt.mre.buildlogic.com.ianbrandt.mre.buildlogic.attributes.applyLibraryElementsAttributes
import org.gradle.api.artifacts.type.ArtifactTypeDefinition.JVM_RESOURCES_DIRECTORY

val extraElementsConfigurationName = "extraElements"

val extraResourcesDirectory: Directory =
    layout.projectDirectory.dir("src/main/extra")

if (extraResourcesDirectory.asFile.exists()) {

    @Suppress("UnstableApiUsage")
    configurations.consumable(extraElementsConfigurationName) {
        logger.lifecycle(
            "Consumable configuration configure action invoked...",
            RuntimeException("Configuration realization stacktrace")
        )

        attributes {
            applyLibraryElementsAttributes(objects)
        }

        project.artifacts.add(
            extraElementsConfigurationName,
            extraResourcesDirectory
        ) {
            type = JVM_RESOURCES_DIRECTORY
        }
    }
}
