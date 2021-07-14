package yunhee.kotlin

enum class State {
    IDEL, RUNNING, FINISHED
}

fun main() {
    //val state = State.RUNNING
    val state = State.FINISHED
    var message = when (state) {
        State.IDEL -> "It's idel"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)
}

class EnumClasses1 {
}