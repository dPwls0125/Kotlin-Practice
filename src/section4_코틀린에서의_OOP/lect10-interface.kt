package section4_코틀린에서의_OOP

interface Flyable {
    fun act() {
        println("파닥파닥")
    }
}

interface Swimmable {

    val simAbility: Int
        get() = 3

    fun act() {
        println("어푸어푸")
    }
}


fun main() {
    Derived(10)
}

/**
    상위 클래스의 생성자/init 블록에서 open 프로퍼티(자식이 override할 수 있는)에 접근하지 마라.
 **/

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base class")
        println(number)

    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived class")
        println(number)
    }
}

/**
 * 1. fina : override를 할 수 없게 한다. default로 보이지 않게 존재한다.
 * 2. open : override를 열어준다.
 * 3. abstract : 반드시 override 해야한다.
 * 4. override : 상위 타입을 override 해야 한다.
 */
