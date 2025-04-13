package com.ianbrandt.mre.buildlogic

@Suppress("UnstableApiUsage")
configurations.consumable("testConfiguration") {
    logger.lifecycle(
        "Consumable configuration configure action invoked...",
        RuntimeException("Configuration realization stacktrace")
    )
}
