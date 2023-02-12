fun main () {
    val dslTest = DslTest()

    val person: Person = dslTest.person {
        it.name = "Star"
        it.age = 777
    }

    println(person.name + ", " + person.age)

    val person2: Person = dslTest.person2 {
        name = "Star"
        age = 777
    }

    println(person2.name + ", " + person2.age)

    val person3: Person = dslTest.person2 {
        name = "Star"
        age = 333
        address {
            mandatory = "gogosing"
            detail = "letsgo"
            postalCode = "12345"
        }
    }

    println(person3.name + ", " + person3.age + ", " + (person3.address?.mandatory ?: null) +
                ", " + (person3.address?.detail ?: null) + ", " + (person3.address?.postalCode ?: null))
}

class DslTest {
    fun person (init: (Person) -> Unit): Person {
        val person = Person()
        init(person)
        return person
    }

    fun person2 (init: Person.() -> Unit): Person {
        val person = Person()
        init(person)
        return person
    }
}

class Person {
    var name: String? = null
    var age: Int? = null
    var address: Address? = null

    fun address (init: Address.() -> Unit) {
        val address = Address()
        init(address)
        this.address = address
    }
}

class Address {
    var mandatory: String? = null
    var detail: String? = null
    var postalCode: String? = null
}
