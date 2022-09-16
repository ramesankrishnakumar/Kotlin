package home.krishna.kotlin.`8`.oop.`3`.dataclass

import home.krishna.kotlin.`8`.oop.`1`.basics.AccessMod2


/**
 * data classes comes with default implementations of equals, toString,
 * hashcode and  copy
 *
 * data classes can be
 * 1. abstract
 * 2. sealed
 * 3. inner
 *
 * if you add extra properties in the data class
 * they are not included in toString, equals, hashcode and copy
 */
data class Car (val color: String, val model: String, val year: Int) {

}

fun main() {
    val car = Car("blue", "Accord", 2018)
    println(car)

    val car2 = car.copy()


    val emp = AccessMod2("kk")
    val emp2 = AccessMod2("kk")
    println("comparing normal class instances => ${emp == emp2}") // calls the default equals method that just checks the reference
    println("comparing data class instances => ${car2 == car}")

    val car3 = car.copy(year = 2013, color = "pink")
    println("checking a copied class with some custom values $car3")
}