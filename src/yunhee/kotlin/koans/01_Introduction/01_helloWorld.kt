package yunhee.kotlin.koans.`01_Introduction`

fun start(): String = "Ok"

fun customPrint(s: String) {
    println(s)
}

fun customPrint2(args: Array<String>) {
    println(args.contentToString())
}

fun main() {
    println(start())

    /* ex */
    customPrint("Hello World")
    customPrint2(arrayOf("Hello", "World"))
}