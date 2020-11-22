//Flow of Control

import java.util.*

fun main(){

    println("Enter the number of the month")

    val sc = Scanner(System.`in`)
    val month = sc.nextInt()


    if (month == 1){
        println("The month is January")
    }else if (month == 2){
        println("The month is February")
    }else if (month == 3){
        println("The month is March")
    }else if (month == 4){
        println("The month is April")
    }else if (month == 5){
        println("The month is May")
    }else if (month == 6){
        println("The month is June")
    }else if (month == 7){
        println("The month is July")
    }else if (month == 8){
        println("The month is August")
    }else if (month == 9){
        println("The month is September")
    }else if (month == 10){
        println("The month is October")
    }else if (month == 11){
        println("The month is November")
    }else if (month == 12) {
        println("The month is December")
    }else
        println("Enter a valid number of the month")
}