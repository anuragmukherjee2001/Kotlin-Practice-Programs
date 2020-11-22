import java.util.*

//Project 1 - Making a calculator in kotlin

fun main(){
    println("Welcome to our calculator CLI app")

    println("Enter the first number")

    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()

    println("Enter the second number")
    val num2 = sc.nextInt()

    println("Enter the number of the operation given in the choice")
    println("1. Addition 2. Substraction 3. Multiplication 4. Divition")
    println("Your choice")

    when(sc.nextInt()){
        1 ->{
            val result:Int = num1 + num2
            println("The addition of the two numbers is $result")
        }
        2 ->{
            val result:Int = num1 - num2
            println("The subtraction of the two numbers is $result")
        }
        3 ->{
            val result:Int = num1 * num2
            println("The multiplication of the two numbers is $result")
        }
        4 ->{
            val result:Int = num1 / num2
            println("The division of the two numbers is $result")
        }
        else ->{
            println("Enter a valid input")
        }
    }
}