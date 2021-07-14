package yunhee.kotlin.Collections

fun main() {
    /* find, findLast */
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

    val first = words.find { it.startsWith("some") }        // "some"으로 시작하는 첫번째 단어
    val last = words.findLast { it.startsWith("some") }     // "some"으로 시작하는 마지막 단어

    val nothing = words.find { it.contains("nothing") }     // "nothing"이 포함된 첫번째 단어

    println("The first word starting with \"some\" is \"$first\"")
    println("The last word starting with \"some\" is \"$last\"")
    println("The first word containing \"nothing\" is ${nothing?.let { "\"$it\"" } ?: "null"}")
}