package home.krishna.kotlin.`2`.difference
typealias EmployeeSet = Set<Employee>  // alias for the type

fun main() {
    var employee: EmployeeSet

    val names = arrayListOf("Jane") // no need to specify arrayListOf<String> => implied

    // all the exceptions are unchecked so don't have to catch them

    // Difference in == operator

    val emp1 = Employee("kk", 1)
    val emp2 = Employee("kk", 1)
    val emp3 = Employee("kk2", 2)

    val emp4 = emp3;

    println(emp1 == emp2) // calls .equals method
    println(emp2 == emp3)
    println(emp1.equals(emp2))
    println(emp2.equals(emp3))

    println("This is referential equality emp4 === emp3: ${emp3 === emp4}")

}
