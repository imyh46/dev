package yunhee.kotlin

import javax.print.attribute.standard.MediaSize

data class User(val name: String, val id: Int) {
    override fun equals(other: Any?) =
            other is User && other.id == this.id
}

fun main() {
    var user = User("Alex", 1)
    println(user)

    var secondUser = User("Alex", 1)
    var thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    // hasCode() function
    println(user.copy())
    println(user == user.copy())
    println(user === user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 3))

    println("name = ${user.component1()}")
    println("id = ${user.component2()}")
}

class DataClasses {

}