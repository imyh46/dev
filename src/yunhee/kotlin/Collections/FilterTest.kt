package yunhee.kotlin.Collections

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { it < 0}

    // map
    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { it * 3 }


    println("Numbers: $numbers")
    println("Positive Numbers: $positives")
    println("Negative Numbers: $negatives")
    println("Doubled Numbers: $doubled")
    println("Tripled Numbers: $tripled")
}