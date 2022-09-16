package home.krishna.kotlin.`4`.arrays

import home.krishna.java.Dummy

fun main() {
    val names = arrayOf("john", "james", "jill", "joe") // strings
    val longs = arrayOf(1L,2L,3L,5L)
    val anotherLongs = arrayOf<Long>(1,2,3,5,6)
    val ints = arrayOf(1,2,3,5)

    println(longs)
    println(anotherLongs)
    println("index0=> ${longs[0]}, index1: ${longs[1]}, index2: ${longs[2]}")

    // lambdas for creating an array
    var numbers = Array(100) {i -> i*2 }
    numbers = Array(100) {0 }
    // declare and later initialize
    val intArray : Array<Int>
    intArray = arrayOf(1,2,3,4,5)
    println(intArray)

    for(num in intArray){
        print(num)
        print(',')
    }


    println()
    // Array of mixed elements

    val mixedElements = arrayOf(10, "krishna", 'c', 20.45, "kk")
    for(num in mixedElements){
        print(num)
        print(',')
    }


    println()

    println("Calling Java int[] with Kotlin intArrays instead of Array<Int>")
    // error Dummy().printArrayOfElements(arrayOf(1,2,3,5)) Required IntArray! Found Array<Int>
    // IntArray is more performant than arrayof<Int>()
    Dummy().printArrayOfElements(intArrayOf(1,2,3,4))

    val someIntArray = IntArray(5)  // Array(5) not possible, here default to 0
    print("All elements initialized to 0:   ")
    for (num in someIntArray) {
        print(num) // all 0's
        print(',')
    }
    println()
    // no need to Assign the type
    var someArrayOfInts: Array<Int> = someIntArray.toTypedArray()  // to Array<Int>

    Dummy().printArrayOfElements(ints.toIntArray()) // This works


    println("This is strange emptyArray()")
    println(emptyArray<Int>())

    Dummy().printArrayOfElements(ints, "a") // This works for Integer[] num
}