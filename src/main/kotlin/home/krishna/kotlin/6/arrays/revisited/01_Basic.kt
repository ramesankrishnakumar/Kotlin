package home.krishna.kotlin.`6`.arrays.revisited

fun main() {
    val nullableInt = arrayOfNulls<Int?>(5)
    for(i in nullableInt)
        println(i?.times(5))

}