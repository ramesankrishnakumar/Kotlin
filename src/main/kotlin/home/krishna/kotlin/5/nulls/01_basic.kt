package home.krishna.kotlin.`5`.nulls

fun main() {
//     val str: String  = null // Null cannot be a value of the non-null type
    val str: String? = null // works
    val st: String? = "This isn't null"
    /**
     * if(st != null)
     *   st.uppercase()  // This works but not recommended
     */
    println("Calling on non-null with safe operator")
    println(st?.uppercase()) // similar to null check and call if it's safe

    val s: String? = null
    println("Calling on null with safe operator: s?.uppercase()") // value is null
    val sss: String? = s?.uppercase() // See the type
    println(sss)
    println("""Calling on null with safe operator: s?:"DefaultValue".uppercase()""")
    val ssss: String = s?:"Default value" // See the type
    println(ssss.uppercase()) // elvis operator

     println("""now you can do : bankBranch?.address?.country?.countryCode?:"US"  """)

     val someThing  = arrayOf(1,2,3)
    val nothing = someThing as? String  // val nothing: String = someThing as String // see the difference
    println("Safe cast => $nothing, henceforth can only used with elvis operator")  // can only be invoked with safe operator
}