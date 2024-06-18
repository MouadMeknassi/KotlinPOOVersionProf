package com.example.kotlinpooversionprof

class Main5 (var code:Int){
    override fun toString(): String {
        return "Main5(code=$code)"
    }

}
fun main(){
    var i=0
    val code1=Main5(i)
    println(code1)
    val code2=Main5(++i)
    println(code2)
    val code3=Main5(++i)
    println(code3)
    val code4=Main5(++i)
    println(code4)
}