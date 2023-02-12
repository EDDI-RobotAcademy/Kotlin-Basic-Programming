fun main () {
    val classTest = ClassTest(3, 7)
    println(classTest.sum)
}

class ClassTest(var number1: Int, var number2: Int) {

    val sum: Int get () {
        return number1 + number2
    }
}