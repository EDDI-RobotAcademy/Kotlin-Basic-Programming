fun main () {
    val whenTest = WhenTest()
    whenTest.test()
    whenTest.test2()
    whenTest.test3()
    if (whenTest.test4("test")) {
        println("test true")
    } else if (whenTest.test4("test4")) {
        println("test4 true")
    } else {
        println("false")
    }
    whenTest.test5()
}

class WhenTest {
    val math = "green"
    var french: String = ""

    fun test () {
        when (math) {
            "blue" -> french = "red"
            "red" -> french = "green"
            "green" -> french = "blue"
            else -> french = "none"
        }

        println(french)
    }

    fun test2 () {
        val x = 5

        when (x) {
            in 1..10 -> println("range match")
            !in 10..20 -> println("range not match")
            else -> println("none")
        }
    }

    fun test3 () {
        data class Person(val name: String, val age: Int)

        val person = Person("gogosing", 77)

        when (person) {
            Person("letsgo", 73) -> println("match 73")
            Person("gogosing", 77) -> println("match 77")
        }
    }

    fun test4 (x: Any) = when(x) {
        is String -> x.startsWith("test4")
        else -> false
    }

    fun test5 () {
        val x = (1..10).random()
        val y = when {
            x in 1..5 -> x * 2
            x in 6..10 -> x + 100
            else -> 0
        }

        println(y)
    }
}