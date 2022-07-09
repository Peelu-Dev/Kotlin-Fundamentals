package com.example.oops

fun main(){
    val car = Car(color = "Black", model = "XUV100")
    val secondCar = Car(color = "Red", model = "Ferrari")
    println("Car Color is: ${car.color} and Car model is: ${car.model}" )
    println("Car Color is: ${secondCar.color} and Car model is: ${secondCar.model}" )
    println(car.drive())
}

class Car(var color : String = "Blue", var model:String = "BMW"){

    fun drive(){
        println("Driving...")
    }
}