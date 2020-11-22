//Recursion in kotlin

fun main() {
    rec()

    val factorial = factorial(5)
    println(factorial)

    println(recursiveSum(10000))

}

var count = 0

fun rec() {

    count ++
    if (count < 10){
        println("This number is $count")
        rec()
    }
}

fun factorial(n:Int):Long{
    return if (n == 1){
        n.toLong()
    }else {
        n * factorial(n - 1)
    }
}

//Tail recursion in Kotlin

tailrec fun recursiveSum(n: Long, res: Long = 0): Long{
    return if (n <= 0){
        res
    }else{
        recursiveSum(n - 1, n + res)
    }
}