package com.ianbrandt.mre.app

fun main() {
    val extraJavaResourcePath = "/extra-java-resource.txt"
    println(extraJavaResourcePath.readResourceOrNotFound())

    val extraKotlinResourcePath = "/extra-kotlin-resource.txt"
    println(extraKotlinResourcePath.readResourceOrNotFound())
}

fun String.readResource(): String? {
    return object {}.javaClass.getResourceAsStream(this)
        ?.bufferedReader()?.use { reader ->
            "$this content:\n${reader.readText()}"
        }
}

fun String.readResourceOrNotFound(): String {
    return readResource() ?: "$this not found!"
}
