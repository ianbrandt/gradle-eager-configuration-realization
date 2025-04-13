package com.ianbrandt.mre.buildlogic.attributes

import org.gradle.api.attributes.AttributeContainer
import org.gradle.api.attributes.Bundling.BUNDLING_ATTRIBUTE
import org.gradle.api.attributes.Bundling.EXTERNAL
import org.gradle.api.attributes.Category.CATEGORY_ATTRIBUTE
import org.gradle.api.attributes.Category.LIBRARY
import org.gradle.api.attributes.LibraryElements.LIBRARY_ELEMENTS_ATTRIBUTE
import org.gradle.api.attributes.Usage.JAVA_RUNTIME
import org.gradle.api.attributes.Usage.USAGE_ATTRIBUTE
import org.gradle.api.model.ObjectFactory
import org.gradle.kotlin.dsl.named

fun AttributeContainer.applyExtraResourcesLibraryElementsAttributes(
    objects: ObjectFactory
) {
    attribute(BUNDLING_ATTRIBUTE, objects.named(EXTERNAL))
    attribute(CATEGORY_ATTRIBUTE, objects.named(LIBRARY))
    attribute(LIBRARY_ELEMENTS_ATTRIBUTE, objects.named("extra-resources"))
    attribute(USAGE_ATTRIBUTE, objects.named(JAVA_RUNTIME))
}
