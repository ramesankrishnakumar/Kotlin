package home.krishna.kotlin.`2`.difference

fun main() {
    val amount = 53.45
    println("Amount: \$$amount") // $ is escaped
    val numerator = 10.99
    val denominator = 20.00
    println("The value of the $numerator divided by the $denominator is : ${numerator/denominator}")

    val employee = Employee("Krishna", 1)
    println("Newhire employee name: ${employee.name} and id: ${employee.id}")

    // """ string here  """  => Raw Strings

    val filePath = """c:\Program Files\Applications"""

    // Space or Margin not trimmed
    val nurseryRhyme = """Humpty Dumpty sat on a wall  
       Humpty Dumpty had a great fall
       All the king's horses and all the king's men couldn't put Humpty together again
    """
    println(nurseryRhyme)
    // default margin trim
    val newRhyme = """Hiiiii
        |This is new Rhyme
    """.trimMargin()
    println("**********************")
    println(newRhyme)
    // specified margin trim
    val newRhyme2 = """Hiiiii
        *This is new Rhyme
        *This goes on forever
    """.trimMargin("*")
    println("**********************")
    println(newRhyme2)
    println("**********************")
    val egg = "Humpty"
    val templatedRhyme = """$egg Dumpty sat on a wall  
       |$egg Dumpty had a great fall
       |All the king's horses and all the king's men couldn't put $egg together again""".trimMargin()
    println(templatedRhyme)

}