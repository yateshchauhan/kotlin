package com.rnd.java.calling.methods

data class ValidateInput(val value1: Int, val value2: Int) {


    fun verify():Boolean{
        if(value2 != 0){
            return true
        }else {
            return false
        }
    }
}