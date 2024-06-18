package com.example.kotlinpooversionprof

class Dog:Animal,MySecondInterface {
    override var averageAge: Int=12

    override fun makeSound() {
        println("Meow")
    }

    override fun toString(): String {
        return "Dog(averageAge=$averageAge, myAttribute='$myAttribute')"
    }

    override var myAttribute: String="Lool !"


}
fun main(){
    val dog=Dog()
    dog.makeSound()
    println(dog)
    val day=3
    val result=when(day){
        1-> "Lundi"
        2-> "Mardi"
        3->"Mercredi"
        else->"Invalide Jour !"

    }
    println(result)
}