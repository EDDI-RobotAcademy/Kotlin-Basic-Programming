fun main () {
    val forTest = ForTest()
    forTest.test1()
    forTest.test2()
    forTest.test3()
}

class ForTest {
    fun test1 () {
        val collection = 1..10
        for (item in collection) print(item)
        println()
    }

    fun test2 () {
        for (i in 1..3) {
            println(i * 3)
        }
    }

    fun test3 () {
        for (i in 6 downTo 0 step 2) {
            println(i)
        }
    }
}