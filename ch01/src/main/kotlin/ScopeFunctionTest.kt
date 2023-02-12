fun main () {
    val scopeFunctionTest = ScopeFunctionTest()
    scopeFunctionTest.test1()
}

class ScopeFunctionTest {
    fun test1 () {
        data class Person(val name: String, var age: Int) {
            fun incrementAge() {
                this.age += 1
            }
        }

        Person("test", 77).let {
            println(it)
            it.incrementAge()
            println(it)
        }
    }
}