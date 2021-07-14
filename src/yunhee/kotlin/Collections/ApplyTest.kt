package yunhee.kotlin.Collections

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Person) {
    println("A new person ${p.name} was created.")
}

fun main() {
    /* apply */
    val jake = Person()
    val stringDescription = jake.apply {
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString()
    println(stringDescription)

    /* also */
    var alex = Person("Alex", 30, "Android developer")
            .also {
                writeCreationLog(it)
            }
}