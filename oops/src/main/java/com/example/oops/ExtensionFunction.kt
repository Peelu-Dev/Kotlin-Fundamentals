package com.example.oops

fun main(){
    println("Hello Peelu,".append("Sir"))
    println("Peelu".removeFirstAndLastCharacter())
}

fun String.append(toAppend:String): String{
    return this.plus(toAppend)
}

fun String.removeFirstAndLastCharacter():String{
    return this.substring(1,this.length-1)
}