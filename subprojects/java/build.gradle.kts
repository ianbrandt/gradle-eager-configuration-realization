plugins {
    id("java-library")
}

@Suppress("UnstableApiUsage")
configurations.consumable("testingJavaLazyConfigurationRealization") {
    logger.lifecycle(
        "Java Library Plugin project consumable configuration created:",
        RuntimeException("Configuration realization stacktrace")
    )
}
