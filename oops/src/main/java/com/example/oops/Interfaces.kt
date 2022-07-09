package com.example.oops

fun main(){
    val button = Button("Button")
    button.onClick("This is a button")

    val superMario = Character("Super Mario")
    superMario.onClick("Actor...")
}

class Button(private val label:String):ClickEvent{
    override fun onClick(message: String) {
        println("Clicked by label $label and here's a message for you $message")
    }
}

class Character(private val name : String): ClickEvent{
    override fun onClick(message: String) {
        println("Clicked by name $name and here's a message for you $message")
    }
}

interface ClickEvent{
    fun onClick(message:String){

    }
}