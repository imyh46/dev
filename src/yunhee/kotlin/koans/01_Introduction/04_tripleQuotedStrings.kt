package yunhee.kotlin.koans.`01_Introduction`

const val question = "life, the universe, and everything"
const val answer = 42

val tripleQuotedString = """
    #question = "$question"
    #answer = $answer
    """.trimMargin("#")

val trimIndent = """
    여러 줄
        문자열
     가능
""".trimIndent()

val trimMargin = """
    |들여쓰기
        |모두
    |제거 O
""".trimMargin("|")     // '|' is default. 다른 문자로도 가능('#', '>' 등)

fun main() {
    println(tripleQuotedString)

    /* ex */
    println(trimIndent)
    println(trimMargin)
}