//This Snippet is all about function in kotlin

fun main(){
    greet()
    sum(26, 35)
    println(sum2(36, 26, 56))
}

//function without parameters

fun greet(){
    println("This is a greeting")
}

//function with parameters

fun sum(a:Int, b:Int){
    val c = a + b
    println("The sum of two numbers is $c")
}

//Function with return type

fun sum2 (x:Int, y:Int, z:Int): Int {
    return x + y + z
}
