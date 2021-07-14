package yunhee.kotlin

fun main() {
    println(whenAssign("Hello"))    // 1
    println(whenAssign(3.4))        // 42
    println(whenAssign(1))          // one
    println(whenAssign(when2()))        // 42
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class when2 {
}