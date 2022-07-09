package com.example.collections

fun main() {
//    val friends = listOf("Harshu", "shivu", "soni", "gogi") // immutable

//    val numbers = mutableListOf(12, 56, 98, 87) // mutable
//    println(numbers)
//    numbers.add(77)
//    println(numbers)
//    numbers.remove(56)
//    println(numbers)
//    println("Size of numbers list is: ${numbers.size}}" )
//    println("first element of numbers list is: ${numbers[1]}")

//    friends.forEach {
//        println(it)
//}
        // Sets
        val mySet = setOf("US","UK","AU","IND","SL")
        println(mySet)
        val myMutableSet = mutableSetOf(10,56,89,97)
        println(myMutableSet)
        myMutableSet.add(89)
        println(myMutableSet)

        // Maps
        val myMap = mapOf("Up" to 1, "Down" to 2, "Left" to 3, "Right" to 4)
        println(myMap)

        val myMutableMap = mutableMapOf("Hello" to 5, "Bye" to 6, "Bro" to 7)
        myMutableMap["cool"] = 8
        println(myMutableMap)
}