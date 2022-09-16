package home.krishna.kotlin.`3`.types
import home.krishna.java.Dummy


fun main() {
    val i: Int // define , In this case have to specify type
    val myInt = 10
    var myLong = 22L // type inferred

    i = if(myInt % (myInt + myLong.toInt()) == 0) 0 else 2 // assign
    println("value of i: $i")

    myLong = myInt.toLong() // works

    val myByte: Byte = 111
    val myShort: Short = myByte.toShort() // widen

    // floating points -- Double is the default

    val floatingPointNumber = 26.778888
    println("my floatingPointNumber is by default Double: ${floatingPointNumber is Double}")

    val myFloat = 12.45f

    println("myFloat is float when assigned 12.45f: ${myFloat is Float}")

    // char

    val c = 'b' // same as c:Char = 'b'
    // val c =65 doesn't work as in Java or val c: Char = 65 as in Java

    val b = (65).toChar()
    println("char: $b")

    // Kotlin types can be converted to java no issues
    val isOnVacation = false
    val vacationMsg = Dummy().vacationMessage(isOnVacation)
    println(vacationMsg)



}