package section2

fun main() {
    printAgeIfPerson(Person("김예진", 10))
}


fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}