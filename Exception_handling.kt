import java.lang.ArithmeticException
import java.lang.Exception

//Exception Handling in kotlin

fun main() {

    try {
        var data:Int = 20/0
    }catch (e:ArithmeticException){
        println("Cannot divide whith 0")
    }

    println("This code will execute successfully")

    try {
        val num = IntArray(5)
        num[4] = 10/0
    }catch (e:ArithmeticException){
        println("This is an arithmatic exception")
    }catch (e:ArrayIndexOutOfBoundsException){
        println("This is an out of bound exception")
    }catch (e:Exception){
        println("Parent Exception class")
    }

    try {
        val num = IntArray(5)
        num[4] = 10 / 0
    }catch (e:Exception){
            println("Parent Exception class")
    }catch (e:ArithmeticException){
        println("This is an arithmatic exception")
    }catch (e:ArrayIndexOutOfBoundsException){
        println("This is an out of bound exception")
    }


    println("This code will also execute")

//    nested try catch block

    val num = intArrayOf(4, 8 , 16, 32, 64, 128, 256)
    val num2 = intArrayOf(2, 0, 4 , 0, 8)
//
    try {
        for (i in num.indices){
            try {
                println(num[i].toString() + " / " + num2[i] + " is " + num[i] / num2[i])
            }catch (e:ArithmeticException){
                println("Cannot divide by 0")
            }
        }
    }catch (e:ArrayIndexOutOfBoundsException){
        println("Element not found")
    }

    println("This code will execute")

//    Finally block

    val num3 = intArrayOf(4, 8 , 16, 32, 64, 128, 256)
    val num4 = intArrayOf(2, 0, 4 , 0, 8)
//
    try {
        for (i in num3.indices){
            try {
                println(num3[i].toString() + " / " + num4[i] + " is " + num3[i] / num4[i])
            }catch (e:ArithmeticException){
                println("Cannot divide by 0")
            }
        }
    }catch (e:ArrayIndexOutOfBoundsException){
        println("Element not found")
    }finally {
        println("This is a finally block")
    }

//    Throw keyword

    adult(13)
}

fun adult(age:Int){
    if (age < 18){
        throw ArithmeticException("you are not adult")
    }else{
        println("You are adult")
    }
}