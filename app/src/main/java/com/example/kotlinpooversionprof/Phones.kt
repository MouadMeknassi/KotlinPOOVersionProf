package com.example.kotlinpooversionprof

import java.security.Policy

import kotlin.collections.ArrayList

class Phone(var nom:String, var anneeSortie:Int, var prix:Double, var qtStock:Int, var ref:String) {

    override fun toString(): String {
        return "Phone(nom='$nom', qtStock=$qtStock, ref='$ref')"
    }


    fun provisionner(qt:Int){

        qtStock +=qt

        println("stck provisionné")
    }

    fun sortie(qt:Int):Int {
        if(qt <= qtStock) {
            qtStock-=qt
            println("sortie avec succés $ref ( $qt )")

        }
        else {
            println("la quantité demandée de $ref n'est pas disponible")
        }
        return qtStock

    }

    fun estDisponible():Boolean{
        if(qtStock>0) return true
        else return false

    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Phone

        if (nom != other.nom) return false
        if (anneeSortie != other.anneeSortie) return false
        if (prix != other.prix) return false
        if (qtStock != other.qtStock) return false
        return ref == other.ref
    }

    override fun hashCode(): Int {
        var result = nom.hashCode()
        result = 31 * result + anneeSortie
        result = 31 * result + prix.hashCode()
        result = 31 * result + qtStock
        result = 31 * result + ref.hashCode()
        return result
    }

}

class Client(var cin:String, var pannier:ArrayList<Phone>, var qtachette:ArrayList<Int>,var estFidel:Boolean) {

    fun calculerTotal():Double {

        var total = 0.0
        for (i in  0..pannier.size-1) {

            total+=pannier[i].prix * qtachette[i]

        }
        return total

    }

    fun ajouterAuPannier(ref:String, stock:ArrayList<Phone>, qt:Int) {

        var refNonDispo = true
        for (i in 0..stock.size - 1) {
            if (stock[i].ref == ref) {
                refNonDispo = false
                if (qt <= stock[i].qtStock) {
                    stock[i].sortie(qt)
                    pannier.add(stock[i])
                    qtachette.add(qt)
                    println("produit $ref ($qt) ajouté au pannier")
                } else {
                    println("qt demandée non disponible")

                }
            }
            if (refNonDispo) println("refrence $ref non disponible dans le stock")
        }
    }

    fun supprimerDuPannier(ref:String, stock: ArrayList<Phone>) {
        for (i in 0..pannier.size-1){
            if(pannier[i].ref == ref) {
                var qtDemandee = qtachette[i]
                pannier.removeAt(i)
                qtachette.removeAt(i)
                for (j in 0..stock.size-1){
                    if(stock[j].ref==ref) {
                        stock[j].provisionner(qtDemandee)
                    }
                }
            }
            else {
                println("ce smartphone n est pas dans votre pannier")
            }
        }

    }

    fun viderPannier() {

        pannier.clear()
        qtachette.clear()
    }


}

fun main() {

    var stock = ArrayList<Phone>()

    var phone1 = Phone("Samsung galaxy 21",2021,5300.0,10,"SAM123")
    var phone2 = Phone("iphone 14",2022,6400.0,15,"IPH322")
    var phone3 = Phone("Redmi 15",2023,3800.0,8,"RED555")
    var phone4 = Phone("Redmi 16",2021,3300.0,8,"RED555")

    stock.add(phone1)
    stock.add(phone2)
    stock.add(phone3)

    println("stock initial :")

    for(ph in stock) {
        println(ph)
    }


    var c1 = Client("KB230", ArrayList<Phone>(), ArrayList<Int>(),true)

    c1.ajouterAuPannier("SAM122",stock,2)
    c1.ajouterAuPannier("IPH322",stock,3)

    println(c1.calculerTotal())


    println("stock restant :")

    for(ph in stock) {
        println(ph)
    }

    println(phone1.hashCode())
    println(phone3.equals(phone4))
}
