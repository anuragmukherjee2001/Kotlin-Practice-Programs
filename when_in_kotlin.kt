import java.util.*

//The when keyword in kotlin

//Name of the month

fun main(){

    println("Enter the number of the month")

    val sc = Scanner(System.`in`)
    var month = sc.nextInt()

    when (month){
        1 ->{
            println("The month is January")
        }
        2 ->{
            println("The month is February")
        }
        3 ->{
            println("The month is March")
        }
        4 ->{
            println("The month is April")
        }
        5 ->{
            println("The month is May")
        }
        6 ->{
            println("The month is June")
        }
        7 ->{
            println("The month is July")
        }
        8 ->{
            println("The month is August")
        }
        9 ->{
            println("The month is September")
        }
        10 ->{
            println("The month is October")
        }
        11 ->{
            println("The month is November")
        }
        12 ->{
            println("The month is December")
        }
        else ->{
            println("Enter a valied number of the month")
        }
    }
}