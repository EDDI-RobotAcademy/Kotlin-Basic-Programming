fun main () {
    println(CompanionObjectTest.test)
}

class CompanionObjectTest {
    companion object {
        val test: Int = 3
    }
}