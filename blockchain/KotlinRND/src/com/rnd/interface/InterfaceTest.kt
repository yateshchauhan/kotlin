package com.rnd.`interface`

interface Car{
    fun engine()
    fun headlineDescription(name:String, model:String, price:Long)
}

class MarutiCar : Car{

    override fun engine() {
        println("Maruti engine")
    }

    override fun headlineDescription(name: String, model: String, price: Long) {
        println("Maruti description, [name=$name, model:$model, price=$price]")
    }
}

data class BMW(var name:String) : Car{
    override fun engine(){
        println("BMW engine")
    }

    override fun headlineDescription(name: String, model: String, price: Long) {
        println("BMW description, [name=$name, model:$model, price=$price]")
    }
}

fun main() {
    var maruti:MarutiCar = MarutiCar()
    maruti.engine()
    maruti.headlineDescription("i20", "BS6", 1200000)


    var bmw:BMW = BMW("BMW-Q3")
    bmw.engine()
    bmw.headlineDescription("BMW", "Q3", 2500000)
}