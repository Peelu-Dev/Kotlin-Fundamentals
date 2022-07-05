package com.example.loopsandconditionalstatements

fun main(){

//    if(amount == 450){
//        println("Less amount")
//    }else if(amount == 500){
//        println("Enough")
//    }else{
//        println("work hard")
//    }
    when(500){
        in 1..100 -> println("Between 1 and 100")
        in 100..500 -> println("Between 100 and 500")
        in 500..1000 -> println("Between 500 and 1000")
        else -> {
            println("Above 1000")
        }
    }
}