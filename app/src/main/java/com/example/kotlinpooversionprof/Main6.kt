package com.example.kotlinpooversionprof

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.ZoneId
import java.util.Scanner

open class Ouvrier (private var dateEntree:String){

    override fun toString(): String {
        return "Ouvrier(dateEntree='$dateEntree')"
    }
    fun getDateEntree():String{
        return dateEntree
    }


}
class Employe(dateEntree: String,var matricule: String, var nom: String, var prenom: String, var dateNaissance: String):Ouvrier(dateEntree) {

    override fun toString(): String {
        return "Employe(matricule='$matricule', nom='$nom', prenom='$prenom', dateNaissance='$dateNaissance', dateEntree='${getDateEntree()}')"
    }
    fun getTimeDifference(date1:String,date2:String):Int{
        val dateFormat=SimpleDateFormat("yyyy-MM-dd")
        val parsedDate1= dateFormat.parse(date1)
        val parsedDate2= dateFormat.parse(date2)
        return parsedDate1.year-parsedDate2.year
    }

    fun getSalaire():Double{
        val today=LocalDate.now(ZoneId.of("Africa/Casablanca")).toString()
        val anciennete=getTimeDifference(today,getDateEntree())
        return 2500.0+anciennete*100.0
    }
}
fun main(){

    val employe=Employe("2000-10-24","E123","Meknassi","Mouad","1999-10-19")
    println(employe)
    println(employe.getSalaire().toString() + " MAD")

}
