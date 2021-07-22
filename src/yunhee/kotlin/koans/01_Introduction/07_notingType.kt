package yunhee.kotlin.koans.`01_Introduction`

import java.lang.IllegalStateException

/*
* Nothing
* 1. 리턴될 일이 없는(종료되지 않는, 예외를 던지는, null을 리턴하는 함수) 경우
* 2. 예외를 던질 경우에 사용
* */
fun failWithWrongAge(age: Int?): Nothing {   // 예외를 던지는 함수의 리턴 타입으로 사용된 경우
    throw IllegalAccessException("Wrong age: $age")
}

fun checkAge(age: Int?) {
    if (age == null || age !in 0..150)
        failWithWrongAge(age)
    else println("Congrats! Next year you'll be ${age.plus(1)}.")
}

/* ex */
fun mayThrowAnException(throwException: Boolean): Nothing? {
    return if (throwException) {
        throw IllegalStateException()
    } else {
        println("Exception not thrown: ")
        null
    }
}

fun main() {
    checkAge(10)
    mayThrowAnException(false)
}