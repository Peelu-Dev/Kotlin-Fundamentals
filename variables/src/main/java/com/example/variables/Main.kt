package com.example.variables

fun main(){
//    Byte => 8 bits memory in computer
//    Short => 16 bits memory in computer
//    Int => 32 bits memory in computer
//    Long => 64 bits memory in computer
//    Float => 32 bits memory in computer
//    Double => 64 bits memory in computer

    val name = "palash" // immutable => cannot change
    var myName = "Peelu" // mutable => can change
    myName = "Harshu"
    val age = 19
    println("Hello my name is $name and I'm $age")
    println("Hello $myName")
    val myLong = 234L // L is used to initialise long numbers
    println("Long number is: $myLong")
    val piFloat = 3.14765796397f
    val piDouble = 3.1421368342193787
    println("Float number is: $piFloat")
    println("Double number is: $piDouble")

    // Kotlin operators
    val a = 12
    val b = 56
    val c = 45.0
    val d = 7.0
    println(a+b)
    println(a-b)
    println(a*b)
    println(c/d)
    println(c%d)


}