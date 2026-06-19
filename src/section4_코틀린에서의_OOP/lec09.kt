package section4_코틀린에서의_OOP

import com.sun.tools.javac.code.TypeAnnotationPosition.field


/**
 * lec09 - 코틀린에서 클래스를 다루는 방법
 * 1. 클래스와 프로퍼티
 * 2. 생성자와 init
 * 3. 커스텀 getter, setter
 * 4. backing field
 */

fun main() {
    val person = Person("김예진")
    println(person.name)
    println(person.age)
    person.age = 20
    println(person.age)

//    val person2 = Person())
//    println(person2.age)
//
//    println(person2.isAdult3) // get() 함수를 이용해서, 프로퍼티 형식으로 만들어줄 수 있음.
}


//val isAdult3 : Boolean
//    get() = this.age > 3


/**
 *  프로퍼티 = 필트 + getter + setter
 *  코틀린에서는 필드만 만들면 getter, setter를 자동으로 만들어준다.
 */

class Person( //construct 생략 가능
    name: String = "최태현", // var
    var age: Int // class 선언과 생성자 생성을 동시에 할 수 있음.
) {
    var name = name // setter를 서야하므로 var로 바꾸어줌.

        // 근데 사실 setter는 잘 안쓰긴함. 이유는 잘 알것지뭐 응?
        /**
         * custome getter, custom setter에서 무한루프를 막기 위해 field라는 키워드를 사용한다. 이를 backing field 라고 부른다.
         */
        set(value) {
            field = value.uppercase()
        }
        get() = field.uppercase()


//    fun getUppercaseName(): String {
//        return this.name.uppercase()
//    }

    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("init 생성자")
    }

    /**
     * 사실... 부생성자보다는 default parameter를 권장한다.
     * Converting과 같은 경우, 부생성자를 사용할 수 있지만, 그보다는 정적 팩토리 메소드를 추천한다.
     */

    constructor(name: String) : this(name, 10)

    constructor() : this("홍길동") { // 부생성자는 바디를 가질수도, 안가질수도 있음.
        println("두번쨰 부생성자")
    }

    fun isAdult(): Boolean {
        return this.age > 18
    }

    val isAdult2: Boolean
        get() {
            return this.age > 20
        }

}


