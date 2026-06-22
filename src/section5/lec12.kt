package section5

/**
 * Lec12. 코틀린에서 object 키워드를 다루는 방법.
 * 1. companion object
 * 2. singleton
 * 3. 익명 클래스
 */

interface FactoryBasic<T> {
    fun create(): T
}

class Person private constructor(
    val name: String,
    val age: Int
) {

    /**
     * 클래스 안에 선언하는 단 하나의 특별한 객체로, 클래스 자체에 소속된 멤버를 정의할 때 사용한다.
     * Java의 static 멤버와 비슷한 역할을 하지만, 실제로는 객체이기 때문에 더 유연하다.
     */
    companion object Factory : FactoryBasic<Person> {
        private const val AGE = 10
        override fun create(): Person = Person("basic", AGE)
    }

    /**
     * Java의 static과의 차이
     * companion object는 실제 객체이므로 인터페이스를 구현하거나 다른 클래스를 상속할 수 있고,
     * 변수에 담아 전달할 수도 있다. 이 점이 단순한 static 멤버와 가장 큰 차이이다.
     */
    object Singleton {
        val a = 10
    }

}

interface Movable{
    fun move()
    fun fly()
}

fun main() {
    moveSomething(object: Movable{
        override fun move() {
            println("I am moving")
        }

        override fun fly() {
            println("I am flying")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.fly()
    movable.move()
}