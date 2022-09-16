package home.krishna.kotlin.`2`.difference.ex1

fun main() {
    val im: Any = """The Any type is
        |root of the kotlin class hierarchy
    """.trimMargin()
    if(im is String){
        val str = im
        println(str.uppercase())
    }
    println("""   1
        |  11
        | 111
        |1111
    """.trimMargin())

    println("""   1   1
        1  11
        1 111
        11111
    """.trimMargin("1"))


}