package yunhee.kotlin.koans

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name="d", number = 2, toUpperCase = true)
)

/* ex */
fun makePasta(menu: String = "토마토", topping: String = "없음", amount: Int) =
        println("메뉴: ${menu}, 토핑: ${topping}, 갯수: ${amount}")

fun main() {
    println(useFoo())

    /* ex */
    // 1. 파스타 1개주세요 => default 메뉴(갯수는 default 값이 없으므로 값 지정 필수)
    makePasta(amount = 1)
    // 2. 치즈토핑 파스타 2개주세요
    makePasta(topping = "치즈", amount = 2)
    // 3. 로제파스타(베이컨 토핑) 1개 주세요
    makePasta(menu = "로제", topping = "베이컨", amount = 1)
}