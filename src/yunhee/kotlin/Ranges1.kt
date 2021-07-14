package yunhee.kotlin

fun main() {
    for(i in 0..3){
        print(i)    // 0123
    }
    print(" ")

    for(i in 0 until 3) {
        print(i)    // 123
    }
    print(" ")

    for(i in 2..8 step 2) {
        print(i)    // 2468
    }
    print(" ")

    for(i in 3 downTo 0) {
        print(i)    // 3210
    }
    print(" ")

    for(c in 'a'..'d') {
        print(c)    // abcd
    }
    print(" ")

    for(c in 'z' downTo 's' step 2) {
        print(c)    // zxvt
    }
    print(" ")
}

class Ranges1 {
}