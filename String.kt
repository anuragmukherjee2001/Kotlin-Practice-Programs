//Strings in kotlin

fun main() {
    val name = "Anurag"
    println(name)

    val ch = charArrayOf('A', 'n', 'u', 'r', 'a', 'g')
    val  st = String(ch)
    println(st)

//    in built Methods in string

    val strSample = "Anurag"
    val strSample2 = "anurag"

    println(strSample.length) // Length of the string
    println(strSample[0])
    println(strSample.get(2))
    println(strSample.equals(strSample2))
    println(strSample.substring(0, 5))

    val sampleString3 = """This
        |is
        |a
        |scattered
        |string.
    """.trimMargin()

    println(sampleString3)
}