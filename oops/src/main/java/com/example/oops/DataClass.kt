package com.example.oops

fun main(){
    val harsh = Person("Harsh","Raghuwanshi",18)
    val palash = Person("Palash","Raghuwanshi",20)
    val soni = Person("Yash","Soni",18)

    val listofPeople = listOf(harsh,palash,soni)
    listofPeople.forEach {
        println(it)
    }
}

data class Person(val firstName:String,val lastName:String,val age:Int)