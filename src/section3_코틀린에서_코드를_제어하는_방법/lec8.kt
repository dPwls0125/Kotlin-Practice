package section3

/**
 * lec08 - 코틀린에서 함수를 다루는 방법
 * 1. 함수 선언 문법
 * 2. default parameter
 * 3. named argument (parameter)
 * 4. 같은 타입의 여러 파라미터 받기 (가변 인자)
 */

// 코틀린에서 함수를 다루는 방법
fun main(){
    printNameAndGender(name = "김예진", gender = "Male") // 빌더의 장점인 type으로 인해, type으로 인한 문제를 해결할 수 있음.
}

// 1. 함수 선언 문법

// public 생략  가능, 중괄호 대신 '=' 사용 가능
fun max(a: Int, b: Int): Int =
    return if(a > b) {
        a
    }else {
        b
    }


// 한줄로 작성 가능, 반환 타입 생략 가능
// block{}을 사용하는 경우에는 반환 타입이 Unit이 아니면, 명시적으로 작성해주어야 한다.
fun maxV2(a : Int, b : Int) = if (a > b) a else b


// 2. default parameter. 장점 : builder를 직접 만들지 않고 builder의 장점을 가지게 된다.
// 매개변수 이름을 통해 직접 값을 지정하고, 지정되지 않은 매개 변수는 기본 값을 사용한다.
fun printNameAndGender(name: String, gender: String){
    println("$name, $gender")
}

/**
 * - body가 하나의 값으로 간주되는 경우 block을 없앨 수도 있고, block이 없다면 반환 타입을 없앨 수도 있다.
 * - 함수 파라미터에 기본값을 설정해줄 수 있다.
 * - 함수를 호출할 때 특정 파라미터를 지정해 넣어줄 수 있다.
 */