package com.example.kotlinpooversionprof

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.ZoneId

// Defining an abstract class called "Forme"
abstract class NewEmploye {
    abstract var matricule: String
    abstract var nom: String
    abstract var prenom: String
    abstract var dateNaissance: String

    abstract fun getSalaire(): Double

    override fun toString(): String {
        return "NewEmploye(matricule='$matricule', nom='$nom', prenom='$prenom', dateNaissance='$dateNaissance')"
    }

}

// Defining a concrete subclass called "Rectangle"
class NewOuvrier(var dateEntree:String) : NewEmploye() {
    override var matricule: String="E123"
    override var nom: String="Meknassi"
    override var prenom: String="Mouad"
    override var dateNaissance: String="1999-10-19"

    override fun getSalaire(): Double {
        val toDay=LocalDate.now(ZoneId.of("Africa/Casablanca")).toString()
        val dateFormat=SimpleDateFormat("yyyy-MM-dd")
        val parsedDate1=dateFormat.parse(toDay)
        val parsedDate2=dateFormat.parse(dateEntree)
        val anciennete= parsedDate1.year -parsedDate2.year
        return 2500.0+anciennete*100.0
    }

    override fun toString(): String {
        return "NewOuvrier(dateEntree='$dateEntree', matricule='$matricule', nom='$nom', prenom='$prenom', dateNaissance='$dateNaissance')"
    }


}
fun main(){
    val newOuvrier=NewOuvrier("2002-7-6")
    newOuvrier.dateEntree="2010-4-4"
    println(newOuvrier.dateNaissance)
    print(newOuvrier.matricule)
}
