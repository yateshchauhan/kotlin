package com.rnd.constructor

fun main() {

    var car1: Car= Car("BMW","CW1","Red")
    var car2: Car= Car("BMW","CW1","Red")

    println(car1)//data class offer toString method
    println(car1 == car2)//data class bydefault offer equals method

    var car3: NonDataClassCar= NonDataClassCar("BMW","CW1","Red")
    var car4: NonDataClassCar= NonDataClassCar("BMW","CW1","Red")

    println("NonDataClass object $car3")//Non data class doesn't give toString method.
    println(car3 == car4)//Non data class doesn't give equals method by default //have to add manually if u want to use equals method

    println(car3)
    NonDataClassCar().printingRef("Hello","Kotlin","It's","array arguments")

    var getterSetterRef = GetterSetter("kotlin")
    println("Printing kotlin getter setter methods")
    //println("cons value: ${getterSetterRef._first}, set param value: ${getterSetterRef.first}")
    println("set param value: ${getterSetterRef.first}")

}

data class Car(var name:String, var model:String, val color:String){


}

class NonDataClassCar{
    var name:String
    var model:String
    var color:String? = null
    constructor(){
        name = "Default"
        model = "Default"
    }
    constructor(name:String, model:String, color:String)
    {
        this.name = name
        this.model = model
        this.color = color
    }

    override fun toString(): String {
        return "NonDataClassCar(name=$name, model=$model, color=$color)"
    }

    fun printingRef(vararg vals:String){
        println("printing all values...")
        for(value in vals){
            println(value)
        }
    }


}

class GetterSetter(_first:String){

    var first: String = "Default"
    //get() = field
    /*set(value){
        field = "manual value"
    }*/

    init{
        this.first = _first
    }
}