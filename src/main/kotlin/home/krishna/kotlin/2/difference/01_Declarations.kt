package home.krishna.kotlin.`2`.difference

fun main() {
    val immutable = 25 // preferred
    val num: Int = 35 // you cannot change

    var mutable = 25
    mutable = 26 // you can change

    val employee = Employee("Jones", 10)
    employee.name= "Jonas Brothers" // not changing the val employee

    val employee2: Employee // Just declaration no assignment
    var number2 = 20
    employee2 = if(immutable < number2)
        Employee("Jane", immutable)
    else
        Employee("Mary", number2)

    // number2 = "hello"  // cannot change types

}

class Employee(var name: String, val id: Int) { // This is a class

    override fun equals(other: Any?): Boolean {
       if(other is Employee)
           return name == other.name && id == other.id

        return false;
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + id
        return result
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }


}