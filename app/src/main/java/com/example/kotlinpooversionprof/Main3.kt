package com.example.kotlinpooversionprof

fun main(){
    val mesQuestions=ArrayList<String>()
    mesQuestions.add("Quel  est le capital du Maroc ?")
    mesQuestions.add("Quel est le pays le plus peuplé du monde ? ")
    mesQuestions.add("Combien y a-t-il de continents sur terre ? ")
    val propositionsR = arrayListOf(arrayListOf<String>("Fes","Tanger","Rabat"),
        arrayListOf<String>("Chine","Inde","Etats-Unis"), arrayListOf<Int>(7,5,6))
    val vraiesR=arrayOf<Int>(2,0,0)
    val reponsesU= listOf<Int>(2,0,1)
    var score:Int =0
    println(mesQuestions[0])
    if (vraiesR[0]==reponsesU[0]){
        println("Votre réponse est : ${propositionsR[0][reponsesU[0]]} est correcte ! ")
        ++score
    }else{
        println("Votre réponse est : ${propositionsR[0][reponsesU[0]]} est incorrecte ! ")
    }
    println(mesQuestions[1])
    if (vraiesR[1]==reponsesU[1]){
        println("Votre réponse est : ${propositionsR[1][reponsesU[1]]} est correcte ! ")
        ++score
    }else{
        println("Votre réponse est : ${propositionsR[1][reponsesU[1]]} est incorrecte ! ")
    }
    println(mesQuestions[2])
    if (vraiesR[2]==reponsesU[2]){
        println("Votre réponse est : ${propositionsR[2][reponsesU[2]]} est correcte ! ")
        ++score
    }else{
        println("Votre réponse est : ${propositionsR[2][reponsesU[2]]} est incorrecte ! ")
    }
    println("Votre score final est de $score/3")

}