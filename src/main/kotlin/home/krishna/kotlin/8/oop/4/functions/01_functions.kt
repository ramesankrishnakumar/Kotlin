package home.krishna.kotlin.`8`.oop.`4`.functions

import home.krishna.kotlin.`8`.oop.`3`.dataclass.Car

fun main() {
  println(multiply(2, 5, "The result is:"))
  println(multiplyV2(2, 5, "The result is:"))

  multiplyV2(text = "The result is:", value1 = 4, value2 = 5) // named arguments


}

fun multiply(value1: Int, value2 : Int, text: String): String { // block body
    return "$text ${value1 * value2}"
}

// expression body
fun multiplyV2(value1: Int, value2 : Int, text: String): String = "$text ${value1 * value2}"

fun printCars(vararg cars: Car) {  // varargs
    for (car in cars) {
        println(car)
    }
}
