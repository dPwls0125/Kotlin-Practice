package section4_코틀린에서의_OOP

/**
 * 1. 추상클래스
 * 2. 인터페이스
 * 3. 클래스를 상속할 때 주의할 점
 * 4. 상속 관련 지시어 정리
 */

fun main() {

}

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int, // property를 override할때는 무조건 open을 붙여줘야 함.
) {
    abstract fun move()
}

class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("고양이가 사뿐사뿐 걸어감^^")
    }

}

class Penguin(
    species: String,
    val wingCount: Int = 2
) : Animal(species, 3), Swimmable, Flyable { // 

    override fun move() {
        println("펭귄이 움직임 ^^")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimmable>.act()
        super<Flyable>.act()
    }
}


