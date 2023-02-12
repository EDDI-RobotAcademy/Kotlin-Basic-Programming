import java.lang.IllegalArgumentException
import java.lang.Integer.parseInt
import java.lang.NumberFormatException

fun main () {
    val throwTest = ThrowTest()
    throwTest.test1("33")
    throwTest.test2()
}

class ThrowTest {
    fun test1 (input: String) {
        val a: Int? = try { parseInt(input) } catch (e: NumberFormatException) { null }
        println(a)
    }

    fun test2 () {
        data class Person(val name: String, val age: Int)
        val person = Person("test", 77)

        val s = person.name ?: throw IllegalArgumentException("Name required")
        println(s)
    }
}