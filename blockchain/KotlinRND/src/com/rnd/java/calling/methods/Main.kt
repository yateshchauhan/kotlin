package com.rnd.java.calling.methods

import java.util.*

typealias CalculatorApi = Caluclator
typealias ScannerKotlin = Scanner
fun main() {

    var number1: Int = 10
    var number2 = 20


    println("Calculator API....")
    /*println("number1: $number1")
    println("number2: $number2")
    */
    var result : Number = 0
    var caluclator = CalculatorApi()
    var scanner = ScannerKotlin(System.`in`)
    println("Enter value1")
    number1 = scanner.nextInt()
    println("Enter value2")
    number2 = scanner.nextInt()
    while(true) {
        println("Enter input")
        var step = scanner.nextLine()
        if (step == "Q") {
            break
        } else if (step == "Add") {
            result = caluclator.addition(number1, number2)
        } else if (step == "Sub") {
            result = caluclator.subtraction(number1, number2)
        } else if (step == "Div") {
            result = caluclator.division(number1, number2)
        } else if (step == "Mul") {
            result = caluclator.multiply(number1, number2)
        }
        println("Addition: $result")
    }

    println("Thank you...")

}