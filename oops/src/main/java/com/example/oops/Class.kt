package com.example.oops

fun main(){
    val car = Car(color = "Black", model = "XUV100")
    val secondCar = Car(color = "Red", model = "Ferrari")
    println("Car Color is: ${car.color} and Car model is: ${car.model}" )
    println("secondCar Color is: ${secondCar.color} and secondCar model : ${secondCar.model}" )
    car.speed(minSpeed = 100, maxSpeed = 300)
    println(car.drive())
    val truck = Truck()
    truck.speed(100,200)
    truck.drive()
}

class Truck:Car(color = "Red","Hyundai"){
    override fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Minimum speed of the truck is: $minSpeed and maximum speed of the truck is: $maxSpeed")
    }
    override fun drive() {
        println("Truck is Driving...")
    }
}

open class Car(var color : String , var model:String){
//    init {
//        color = "Red"
//        model = "XUV800"
//    }

    open fun speed( minSpeed : Int, maxSpeed:Int){
       println("Minimum speed is: $minSpeed and maximum speed is: $maxSpeed")
    }
    open fun drive(){
        println("Driving...")
    }
}