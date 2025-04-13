package com.ianbrandt.mre.buildlogic

plugins {
    id("org.gradlex.jvm-dependency-conflict-detection")
    id("org.gradlex.jvm-dependency-conflict-resolution")
}

jvmDependencyConflicts {
    logging {
        enforceLog4J2()
    }
}
