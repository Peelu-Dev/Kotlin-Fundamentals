package com.example.generics

fun main(){
    val listOfNames = listOf("Peelu","Harshu","Sehwag","Sachin")
    val finder = Finder(listOfNames)
    finder.findItem("new"){
        println("Found $it")
    }
}

class Finder(private val list: List<String>){
    fun findItem(element:String,foundItem:(element:String?)-> Unit){
        val itemFoundList = list.filter {
            it == element
        }
        if(itemFoundList.isEmpty())
            foundItem("Null") else foundItem(itemFoundList.first())
    }
}