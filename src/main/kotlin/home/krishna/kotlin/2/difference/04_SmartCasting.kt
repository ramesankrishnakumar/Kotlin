package home.krishna.kotlin.`2`.difference

fun main() {
    // smart casting
    val emp1 = Employee("kk2", 1)
    val emp2 = Employee("kk2", 3)
    var somthing: Any = emp1
    if(somthing is Employee) {
//        var empppp = somthing as Employee // kotlin has smart cast so 'as Employee' is not needed
        somthing = emp2  // this is fine
//        somthing = arrayListOf("a") // not good because of the usage of somthing as a Employee
        println(somthing.name)
        println(somthing.name)
    }
}