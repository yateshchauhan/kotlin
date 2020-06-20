package com.rnd.array

fun main() {

    var textArr = Array(5){i->(i+1)*2}

    var i = 0
    for(text in textArr) {
        print("$text ,")
        textArr[i] = textArr[i] + 1
        i++
    }
    println("\nupdated values")
    for(text in textArr){
        print("$text , ")
    }

    var textArr1 = arrayOf(1,2,3,4)

    println("\n static array iteration")
    for(text in textArr){
        print("$text ,")
    }
}