//This snippet is all about operators

fun main(){

    var a = 26
    val b = 36

//    Arithmatic operators

    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)

//    Relational operators

    var c:Boolean = a > b
    println(c)

    c = a >= b
    println(c)
//
    c = a < b
    println(c)

    c = a <= b
    println(c)

    c = a == b
    println(c)

    c = a != b
    println(c)

    c = a === b
    println(c)

//    Assignment Operators

    a = 50

    a += 2
    println(a)

    a -= 2
    println(a)

    a *= 2
    println(a)

    a /= 2
    println(a)

    a %= 2
    println(a)

//    Unary operator

    var d = +a
    println(d)

    d = -a
    println(d)

    d = a++
    println(d)

    d = a--
    println(d)

//    Logical operator

    if (a in 21..59){
        println("The number is within the range 20 and 60")
    }

    if (a == 26 || a == 30){
        println("Either the number is 26 or the number is 30")
    }

    if (a != 26){
        println("The number is not 26")
    }

}