package home.krishna.kotlin.`8`.oop.`1`.basics

/**
 * kotlin has 4 access specifiers
 * 1. private  -- everything in the same file can access this
 * 2. protected -- there is no protected at top level
 * 3. public
 * 4. internal -- top level item, can be accessed within the same module
 *
 * top level items can be function, properties and classes
 *
 * items not mentioned an access specifier will be public by default
 * There is no filename matching requirement with the public items in the file
 * there can be many public items in a same file
 *
 * Module => group of file that is complied together
 * In kotlin classes can't see private members belonging to inner classes
 *
 * when kotlin compiles these access modifiers they are complied to the
 * one JVM can understand
 *
 * so private becomes package private or default
 * internal becomes public
 *
 * mixing java and kotlin can lead to breaking some encapsulation
 *
 * classes are public and final by default
 *
 *
 */


fun main() {
    val employee = Employee()
    println()

}

private class Employee {

}