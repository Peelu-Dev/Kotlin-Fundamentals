package com.example.collections

fun main(){
    val friends = listOf("Harshu","shivu","soni","gogi") // immutable

    val numbers = mutableListOf(12,56,98,87) // mutable
    println(numbers)
    numbers.add(77)
    println(numbers)
    numbers.remove(56)
    println(numbers)
    friends.forEach {
        println(it)
    }
}