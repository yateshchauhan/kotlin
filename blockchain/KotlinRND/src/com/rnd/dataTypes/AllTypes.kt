package com.rnd.dataTypes

fun main() {

    charFun()
    stringFun()
    booleanFun()

}

fun charFun(){

    var value1:Char
    value1 = 'A'
    var value2:Char = 'B'

    var intValue = 65

    println("values amount \$are appearing below")
    println("value1 : $value1")
    println("value2 : $value2")
    println("char value of $intValue : ${intValue.toChar()}")
}

fun stringFun(){

    var text = "hello kotlin, I'm learning new new language" +
            "Is there any which i have to learn along with this"
    var text1= """Hello Kotlin, I'm new into this language
        | Will this help me to learn blockchain.
    """.trimMargin()
    var text2 = """ 
        !           1
        !           1 2
        !           1 2 3
        !           1 2 3 4
        !           1 2 3 4 5
    """.trimMargin("!")//by default '|' char does trim from array
    if(text is String){
        println(text)
    }
    if(text1 is String){
        println(text1)
    }
    println(text2)
}

fun booleanFun(){

    var booleanFlag: Boolean

    booleanFlag = true

    print(booleanFlag)

}