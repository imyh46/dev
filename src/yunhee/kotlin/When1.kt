package yunhee.kotlin

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(when1())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

class when1 {
}