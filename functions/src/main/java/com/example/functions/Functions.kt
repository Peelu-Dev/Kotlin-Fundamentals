package com.example.functions

fun main(){
// sayHelloWithParameters( message = "is a multiple of", multipleOf = 7)
    val catAge = calculateCatAge(12)
    println("Cat Age is $catAge")
}
//fun sayHello(){
//    for(i in 1..10){
//        println("$i")
//    }
//}

//fun sayHelloWithParameters(first:Int=9,second:Int=90,message:String,multipleOf:Int){
//    for(i in first..second){
//        if(i % multipleOf == 0){
//            println("$i $message $multipleOf")
//        }
//    }
//}

fun calculateCatAge(age:Int):Int{
    return age * 5
}