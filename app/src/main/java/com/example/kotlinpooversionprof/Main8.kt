package com.example.kotlinpooversionprof

import java.util.Collections

class MyOtherClass(var dateEntree:String){

    override fun toString(): String {
        return "MyOtherClass(dateEntree='$dateEntree')"
    }
    init {
        println("Hello User !")
        dateEntree="1999-10-19"
        println(dateEntree)
    }

}
val greeting:(String)->Unit={ name-> println("Hello $name !")}
val division={a:Double,b:Double ->
    if (b==0.0){
        "La division est impossible"
    }else{
        a/b
    }
}
fun main(){
    val myOtherClass=MyOtherClass("2002-3-4")
    println(myOtherClass)
    greeting("Mouad")
    println(division(4.0,2.0))
    val myArray=ArrayList<Int>()
    myArray.add(1)
    myArray.add(4)
    myArray.add(9)
    //Collections.sort(myArray)
    println(myArray)
    val str="Mouad"
    println(myArray.size)
}