package com.example.collections

fun main(){
    val friends = listOf("Harshu","shivu","soni","gogi") // immutable

    val numbers = mutableListOf(12,56,98,87) // mutable
    println(numbers)
    numbers.add(77)
    println(numbers)
    numbers.remove(56)
    println(numbers)
    println("Size of numbers list is: ${numbers.size}}" )
    println("first element of numbers list is: ${numbers[1]}")
    friends.forEach {
        println(it)
    }
}