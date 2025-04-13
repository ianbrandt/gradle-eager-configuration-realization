plugins {
    `kotlin-dsl`
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(libs.jvm.dependency.conflict.resolution.gradle.plugin.dependency)
}
