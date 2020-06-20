package com.rnd.inheritance

open abstract class StudentAddress{
    abstract fun address(description:String)
}

class Student: StudentAddress(){//Inherited abstract class

    override fun address(description: String) {
        println("Student address, $description")
    }
}

fun main() {
    println("main method invoked")
    var student:Student
    student = Student()
    student.address("Bangalore")

    println("main method completed")
}