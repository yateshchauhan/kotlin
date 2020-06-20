package com.rnd.inheritance

fun main() {
    println("Main method started")
    //var car = Car("Maruti")
    var car = Car("Maruti", 4.0.toFloat())
    println("Main method completed")
}

open class Wheel{
    var size:Float
    constructor(_size:Float){
        println("Wheel::One parameter constructor invoked")
        size = _size
    }

}

data class Spoke(var spokeNo:Int){

}

class Car : Wheel{//only open class can inherited

    constructor(name: String):super(0.0.toFloat()){
        println("Car::One parameter constructor invoked")
    }
    //constructor(name:String, size: Float):super(size)
    constructor(name:String, size: Float):this(name){
        println("Car::Two parameters constructor invoked")
    }

}