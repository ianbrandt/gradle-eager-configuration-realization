plugins {
    alias(libs.plugins.kotlin.gradle.plugin)
}

@Suppress("UnstableApiUsage")
configurations.consumable("testingKotlinLazyConfigurationRealization") {
    logger.lifecycle(
        "Kotlin Gradle Plugin project consumable configuration created:",
        RuntimeException("Configuration realization stacktrace")
    )
}
