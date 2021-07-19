package yunhee.kotlin.koans.`01_Introduction`

fun joinOptions(options: Collection<String>) =
        options.joinToString(prefix = "[", postfix = "]")

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    println(joinOptions(listOf("c", "h", "o", "i")))

    /* ex */
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println(numbers.joinToString())                                                     // 1, 2, 3, 4, 5, 6
    println(numbers.joinToString(prefix = "[", postfix = "]"))                          // [1, 2, 3, 4, 5, 6]
    println(numbers.joinToString(prefix = "<", postfix = ">", separator = "/"))         // <1/2/3/4/5/6>

    val chars = charArrayOf('a', 'b', 'c', 'd', 'e', 'f')
    println(chars.joinToString(limit = 3, truncated = "...끝!") {it -> it.uppercaseChar().toString()})
}

