import java.util.*

//Taking input from the user

fun main(){

//    This is a Java concept of taking input which will also work in kotlin

    var sc = Scanner(System.`in`)

    println("Enter any number")

    var num = sc.nextInt()
    println("The number is $num")

//    This is the new concept of taking input in kotlin

    println("Enter your name")

    var name = readLine()
    println("Your name is $name")


}