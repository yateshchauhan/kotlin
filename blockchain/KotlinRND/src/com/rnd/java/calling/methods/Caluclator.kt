package com.rnd.java.calling.methods

class Caluclator {

    fun addition(value1: Int, value2: Int): Int{

        println("value1: $value1 value2: $value2")
        return value1 + value2;
    }

     fun subtraction(value1:Int , value2:Int): Float{

         println("value1: $value1 value2: $value2")
         return (value1.toFloat() - value2)
     }

     fun multiply(value1:Int , value2: Int): Int{
         println("value1: $value1 value2: $value2")
         return value1 * value2
     }

     fun division(value1:Int, value2:Int): Int{
         println("value1: $value1 value2: $value2")
         var flag = ValidateInput(value1, value2)
         if(flag.verify()) {
             return value1 / value2
         }else{
             println("value2 can't be null/zero")
             return 0
         }
     }
}