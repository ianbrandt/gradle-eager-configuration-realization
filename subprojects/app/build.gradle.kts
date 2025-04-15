import com.ianbrandt.mre.buildlogic.com.ianbrandt.mre.buildlogic.attributes.applyLibraryElementsAttributes

plugins {
    id("application")
    // Not used in this project, but let's apply it to demonstrate that the
    // consumable configuration is thereby not realized.
    id("com.ianbrandt.mre.buildlogic.extra-configuration")
    id("com.ianbrandt.mre.buildlogic.kotlin-project")
}

application {
    mainClass.set("com.ianbrandt.mre.app.MainKt")
}

dependencies {
    runtimeOnly(project(":subprojects:java-library")) {
        attributes {
            applyLibraryElementsAttributes(objects)
        }
    }
    runtimeOnly(project(":subprojects:kotlin-library")) {
        attributes {
            applyLibraryElementsAttributes(objects)
        }
    }
}
