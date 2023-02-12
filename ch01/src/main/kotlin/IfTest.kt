fun main () {
    val ifTest = IfTest()
    ifTest.test()
    ifTest.test2()
}

class IfTest {
    val testNumber = 7
    var testString: String = ""

    fun test () {
        if (testNumber >= 7) {
            testString = "gogosing"
        } else {
            testString = "letsgo"
        }

        println(testString)
    }

    fun test2 () {
        val testString2 = if (testNumber >= 7) {
            "gogosing"
        } else {
            "letsgo"
        }

        println(testString2)
    }
}