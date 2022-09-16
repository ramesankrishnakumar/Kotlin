package home.krishna.kotlin.`5`.nulls

fun main() {
    val str: String? = "This isn't null"
    println(str!!.uppercase())  // non null assertion

    // you want an exception to be thrown when str is null
    // you cannot proceed with null

    var s: String? = null
//    var a = s!!  // throws java.lang.NullPointerException  here
//    println(a.lowercase())

   printerText(s?:"empty") // No issue
//   printerText(s!!) // throws NullPointerException

    s?.let { printerText(it) } // null safe call // This is a standard function

    val str4: String? = null
    val anotherSt4: String = "This is a string"

    println(str4 == anotherSt4) // equals operator is safe operator and prints false
}

fun printerText(str: String) {
    println(str)
}