package com.example.kotlinpooversionprof

fun countSubstringOccurrences(content: String, search: String): Int {
    var count = 0
    var startIndex = 0

    while (true) {
        val index = content.indexOf(search, startIndex)
        if (index == -1) {
            break
        }
        count++
        startIndex = index + search.length
    }

    return count
}

fun main() {

    val contentString = "ababababa"
    val searchString = "aba"
    val occurrenceCount = countSubstringOccurrences(contentString, searchString)
    println(occurrenceCount) // prints "4"

}