//this snippet is all about some new features in kotlin

fun main() {
    val res = greater(16, 55)
    println(res)

    println(season(12))
}

//using if else as a variable

fun greater(x: Int, y:Int): Int {
    return if (x > y){
        x
    }else{
        y
    }
}

//Using when statement in a variable

fun season(x:Int): String {
    return when(x){
        3,4,5,6 -> {
            "It is summer season"
        }
        7,8,9 -> {
            "It is rainy season"
        }
        10,11 -> {
            "It is Autumn"
        }
        12,1,2 ->{
            "It is winter season"
        }
        else -> "Enter a valied input. It is not a month"
    }
}