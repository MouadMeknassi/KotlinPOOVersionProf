package com.example.kotlinpooversionprof


class MyClass(var myAttribute: MyAttribute) {
    enum class MyAttribute {
        VALUE1, VALUE2
    }

    override fun toString(): String {
        return "MyClass(myAttribute=$myAttribute)"
    }


}
fun main(){
    val myClass=MyClass(MyClass.MyAttribute.VALUE1)
}


