package yunhee.kotlin.Collections

fun main() {
    /* associateBy, groupBy */
    data class Person(val name: String, val city: String, val phone: String)

    val people = listOf(
            Person("John", "Boston", "+1-888-123456"),
            Person("Sarah", "Munich", "+49-777-789123"),
            Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
            Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
    )
    //println("People: $people")

    val phoneBook = people.associateBy { it.phone }                     // phone number를 기준(it.phone = keySelector)으로 Map 생성, Person객체 자신이 value
    //println("Phone book: $phoneBook")

    val cityBook = people.associateBy(Person::phone, Person::city)      // phone number를 기준으로 Map 생성(<key,value> = <phone, city>로 생성)
    println("City book: $cityBook")

    val peopleCities = people.groupBy(Person::city, Person::name)       // groupBy : key가 중복될 때, value가 리스트로 만들어짐
    //println("peopleCities: $peopleCities")
    val peopleCity = people.associateBy(Person::city, Person::name)     // associateBy: key가 중복될 때, 마지막에 있는 원소가 value
    //println("peopleCity: $peopleCity")
}