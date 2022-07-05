package com.example.functions

fun main(){
 sayHelloWithParameters(1,200,6)
}
//fun sayHello(){
//    for(i in 1..10){
//        println("$i")
//    }
//}

fun sayHelloWithParameters(first:Int,second:Int,multipleOf:Int){
    for(i in first..second){
        if(i % multipleOf == 0){
            println("$i is a multiple of $multipleOf")
        }
    }
}