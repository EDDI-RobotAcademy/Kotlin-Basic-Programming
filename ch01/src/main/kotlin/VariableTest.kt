fun main () {
    val variableTest = VariableTest()
    val result = variableTest.sum(3, 7)
    println(result)

    val name: String = "rich";
    println(name)
}

class VariableTest {
    fun sum (number1: Int, number2: Int) = number1 + number2
}