package com.rnd.array


fun main(){

    var value: Int
    value = 10
    println(value)

    //var value1: Int? = null
    var value1: Int? = 20

    value1.let {
        println("'let operator behaviour' will run this block either value1 is null/not")
        println("parameter value: $it") // internally use lambda expression
    }

}

fun nullReferences(){

    //var str: String? = null

    //println("used safety operator '?' for confirming to compiler[Assigned value is not null] : ${str}")
    //println(str!!.toUpperCase()) //will throw null pointer exception[Used !! operator]

    var student = Student("Ram", "Meerut", 123456789)

    //var nullStudentObj: Student? = null
    var nullStudentObj: Student? = student

    println(student)
    println(nullStudentObj?.address?.contactDetails)
}

fun nullArray() {

    var str = arrayOfNulls<String>(5)

    str[2] = "not null value"
    for(text in str){
        println(text)
    }

}

data class Student(val name: String, val city: String, val mobNo: Number){

    var contactDetails: ContactDetails = ContactDetails(mobNo)
    var address = Address(city, contactDetails)

    fun getAddressRef(): Address{
        return address
    }


}
data class Address(val city: String, val contactDetails: ContactDetails){

    fun city(): String{
        return city
    }

}
data class ContactDetails(val mobNo: Number){
    fun getMobNumber(): Number{
        return mobNo
    }
}