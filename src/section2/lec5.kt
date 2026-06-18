package section2

/**
 * 1. if문
 * java에서 if-else는 Statement이지만, Kotlin에서는 Expression이다. ==> if,else분의 return값을 바로 = 으로 대입할 수 있기 때문에 더이상 삼항 연산자기 필요하지 않다.
 * Statement : 프로그램의 문장, 하나의 값으로 도출되지 않는다.
 * Expresiion : 하나의 값으로 도출되는 문장
 * 2. Expression과 Statement
 * 3. Switch와 when
 */

fun main() {
    println(getPassOrFail(40))
}


/**
 * if, else
 */
fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}은 0보다 작을 수 없습니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun validateScore(score: Int) {
    if (score in 0..100) {
        println("범위 내에 존재합니다.")
    }
}

/**
 * when
 *
 * when을 return 뒤에 쓰면 Expression(값을 도출하는 문장) 으로 동작합니다. 그런데 Kotlin에서 when이 Expression일 때는 모든 경우를 다뤄야(exhaustive) 합니다. 지금은 9, 8, 7만 처리하고 나머지 값(예: 6, 100,
 * -1...)에 대한 처리가 없어서 "어떤 값을 return해야 할지" 결정할 수 없습니다.
 *
 * when은 Enum Class 혹은 Sealed Class와 함께 사용할 경우, 더욱 더 진가를 발휘한다.
 */

fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "F"
    }
}

fun getGradeWithSwitchV2(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 90..89 -> "B"
        else -> "D"
    }
}


fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> true
        else -> false
    }
}

fun judgeNumber(number : Int) {
    when {
        number == 0 -> println("주어진 숫지는 0입니다.")
        number % 2== 0 -> println("주어진 숫지는 짝수입니다.")
    }
}

