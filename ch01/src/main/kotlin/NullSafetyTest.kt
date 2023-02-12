fun main () {
    val nullSafetyTest = NullSafetyTest()
    nullSafetyTest.test1()
    nullSafetyTest.test2()
    nullSafetyTest.test3()
}

class NullSafetyTest {
    fun test1 () {
        var str: String? = "Type System"
        println(str)

        str = null
        println(str)
    }

    fun test2 () {
        val str: String? = "gogosing"
        val length = if (str != null) str.length else -1

        println(length)
    }

    fun test3 () {
        val str: String? = "test string"
        val length = str?.length

        println(length)
    }

    fun test4 () {
        val str: String? = "Null Safety"
        val length = str?.length ?: -1

        println(length)
    }
}