fun main () {
    val lambdaTest = LambdaTest()
    println(lambdaTest.test1({ str, num -> str + num.toString() }))
    lambdaTest.test2()
}

class LambdaTest {
    fun test1 (f: (String, Int) -> String): String {
        return f("test", 7)
    }

    fun test2 () {
        val test2Lambda = fun (str: String, num: Int): String {
            return str + num.toString()
        }

        println(test2Lambda("test", 37373))
    }
}