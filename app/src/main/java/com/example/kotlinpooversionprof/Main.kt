package com.example.kotlinpooversionprof

import java.util.Scanner
import java.util.regex.Pattern

fun main() {
    val scanner = Scanner(System.`in`)
    println("Entrez un nombre entier :")
    val n = scanner.nextInt()

    var factorielle=n
    for (j in n-1 downTo  1 ){
        factorielle *= j
    }
    println(factorielle)

    /****************************************************/
    val str:String ="Bonjour tout le monde !"
    val str2= str.lastIndexOf("o",6)
    println(str2)

    val sc=Scanner(System.`in`)
    println("Entry a string value")
    val strTwo= sc.nextLine()
    println(strTwo)
}