//Loops in kotlin

fun main() {
    val number = arrayOf(10,20,30,40,50)

    for (i in number)
        println(i)

//    indices is used to print the index of the array

    for (i in number.indices) {
        println(i + 1)
        println(number[i])
    }

    for (i in 1..5){
        println(i)
    }

    for (i in 5 downTo 1){
        println(i)
    }

    for (i in 1..10 step 2){
        println(i)
    }

    for (i in 10 downTo 1 step 2){
        println(i)
    }

}