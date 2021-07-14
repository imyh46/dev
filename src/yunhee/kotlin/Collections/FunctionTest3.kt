package yunhee.kotlin.Collections

fun main() {
    /* first, last */
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val first = numbers.first()
    val last = numbers.last()

    val firstEven = numbers.first { it % 2 == 0}
    val lastOdd = numbers.last { it % 2 != 0}

    println("Numbers: $numbers")
    println("First $first, last: $last, first even $firstEven, last odd $lastOdd")

    /* firstOrNull, lastOrNull */
    val words = listOf("foo", "bar", "baz", "faz")
    val empty = emptyList<String>()         // 빈 컬렉션

    val first2 = empty.firstOrNull()        // 빈 컬렉션에서 첫번째 요소 선택
    val last2 = empty.lastOrNull()          // 빈 컬렉션에서 마지막 요소 선택

    val firstF = words.firstOrNull { it.startsWith('f')}
    val firstZ = words.firstOrNull { it.startsWith('z')}
    val lastF = words.firstOrNull {it.endsWith('f')}
    val lastZ = words.firstOrNull {it.endsWith('z')}

    println("First $first2, last $last2")
    println("First starts with 'f' is $firstF, last starts with 'z' is $firstZ")    // foo, null
    println("First ends with 'f' is $lastF, last ends with 'z' is $lastZ")          // null, faz
}