package home.krishna.kotlin.`7`.practice

fun main() {
    val num = -3847.384F
    val num2 = (-3847.384).toFloat()

    val numNullable: Float? = num
    val num2Nullable: Float? = num2

    val arrOfShorts = shortArrayOf(1,2,3,4,5)
    val arrOfShorts2: Array<Short> = arrayOf(1,2,3,4,5)

    val nullableArrOfInts = Array<Int?>(40) {i -> (i+1) * 5 }
    for (i in nullableArrOfInts) {
        println(i)
    }

    val arrOfChars = charArrayOf('a', 'b', 'c')
    val x: String? = "I AM IN UPPERCASE"
    val a = x?:"I give up!".lowercase() //  This is not what we wanted
    println(a)
    val z = x?.lowercase() ?: "I give up!"
    println(z)

    x?.let { println(it.lowercase().replace("am", "am not")) }


    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble() // this will throw exception
}