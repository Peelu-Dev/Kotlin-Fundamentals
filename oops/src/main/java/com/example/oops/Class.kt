package com.example.oops

fun main(){
    val car = Car()
    car.color = "Black"
    car.model = "XUV100"
    println("Car Color is: ${car.color} and Car model is: ${car.model}" )
    println(car.drive())
}

class Car{
    var color = "Blue"
    var model = "BMW"

    fun drive(){
        println("Driving...")
    }
}