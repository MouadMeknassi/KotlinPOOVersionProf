package com.example.kotlinpooversionprof

class CompteBancaire(var numeroDeCompte:Int, var nomDuTitulaire:String ,var blance:Double ) {

    override fun toString(): String {
        return "CompteBancaire(numeroDeCompte=$numeroDeCompte, nomDuTitulaire='$nomDuTitulaire', blance=$blance)"
    }

    fun deposer(sld:Double){

         blance+=sld

        println("solde provisionné")
    }

    fun retirer(sld:Double) {

        if(sld <= blance) {
            blance-=sld
            println("retrait avec succés ($sld)")
        }
        else {
            println("le sold demandée n'est pas disponible")
        }

    }
}
fun main(){
    val compteBancaire=CompteBancaire(12345,"Ahmed Raji",1000.0)
    println(compteBancaire)
    compteBancaire.retirer(100.0)
    println(compteBancaire)
    compteBancaire.deposer(200.0)
    println(compteBancaire)
}