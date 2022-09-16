package home.krishna.kotlin.`8`.oop.`1`.basics

/**
 *
 * constructor keyword is optional until we have access modifiers or
 * annotations on it
 *
 * secondary constructor won't declare any property for us
 * and the properties handled by the primary constructor needs to be delegated to it
 *
 */


class Demo {  // we can do the old school way
    val name: String  // default visibility is public

    constructor() {
        this.name = "Dummy"
    }

    constructor(name: String) {
        this.name = name
    }
}

fun main() {
    val emp = KotlinEmployeeV1("krishna", true)
    println("Employee, firstName: ${emp.firstName} isFullTime: ${emp.isFullTime}")

    val emp2 = KotlinEmployeeV2("kk")
    println("Employee, firstName: ${emp2.firstName} isFullTime: ${emp2.isFullTime}")

    var dum = Demo()
    println("Demo name: ${dum.name}")

    dum = Demo("intttttttt")
    println("Demo name: ${dum.name}")
}

class KotlinEmployeeV2(val firstName: String, var isFullTime: Boolean = true ) {

}


class KotlinEmployeeV1 constructor(val firstName: String ) {

    var isFullTime: Boolean = true

    constructor(firstName: String, isFullTime: Boolean) : this(firstName) {
        this.isFullTime = isFullTime
    }

}

