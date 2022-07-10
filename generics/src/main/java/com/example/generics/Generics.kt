package com.example.generics

fun main(){
//    val listOfNames = listOf("Peelu","Harshu","Sehwag","Sachin")
    val listOfNumbers = listOf(12,23,46)
    val finder = Finder(listOfNumbers)
    finder.findItem(65){
        println("Found $it")
    }
}

class Finder<T>(private val list: List<T>){
    fun findItem(element:T,foundItem:(element:T?)-> Unit){
        val itemFoundList = list.filter {
            it == element
        }
        if(itemFoundList.isEmpty()) {
            foundItem(null)
        } else {
            foundItem(itemFoundList.first())
        }
    }
}