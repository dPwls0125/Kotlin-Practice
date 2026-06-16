package section2

fun main() {
    printAgeIfPerson(Person("김예진", 10))
    val str : String = "ABC"
    println(str[0])
}


fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person

    println("이름: ${person?.name}")
    println("나이: ${person?.age}")

    println("""
        안녕하쇼..! 
    """.trimIndent())
}