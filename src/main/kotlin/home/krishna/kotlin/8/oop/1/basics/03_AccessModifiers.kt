package home.krishna.kotlin.`8`.oop.`1`.basics

/**
 *  public properties of a class are acccessed using the getters
 *  and setters even through it looks like we are using the fields directly
 *
 *  you can declare your own getter and setter, but you will lose the ease
 *  of defining and declaring them in the constructor
 *
 */

class AccessMod(private val name: String) {
   // defining a private modifier
}


class AccessMod2( val name: String,  fulltime: Boolean = true) { // notice no var or val for fulltime
    var fulltime = fulltime // compiler will generate the default getter and setter for us
        get() {
            println("accessing the custom getter")
            return field
        }
        set(value) {
            println("assigning the value $value")
            field = value
        }
}

class AccessMod3( val name: String,  var fulltime: Boolean = true) {
    init {
        println("init block here")
    }
}

fun main() {
    val obj = AccessMod("name-ke-vas")

 //    println("obj => name: ${obj.name}") // => leads to error

    val e1 = KotlinEmployeeV2("oo", true)
    e1.isFullTime // getter
    e1.isFullTime = false // setter

    val e2 = AccessMod2("ll")
    println("employee => ${e2.name} is fullTime: ${e2.fulltime}")
    e2.fulltime = false

    println(AccessMod3("init-block"))
}
