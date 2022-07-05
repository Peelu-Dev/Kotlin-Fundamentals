package com.example.loopsandconditionalstatements

fun main(){
    for (i in 1..100){
        if(i%3==0){
            println("$i is a multiple of 3")
        }else{
            println("***")
        }
    }
}