package section3

/**
 * lec6 - 코틀린에서 반복문을 다루는 방법
 *
 * 1. for each 문
 * 2. 전통적인 for문
 * 3. Progression과 Range
 * 4. while문
 *
 *
 * 3 downTo 1 : 시작값 3, 끝값 1, 공차 -1 등차수열
 * 1..5 step2 : 시작값 1, 끝값 5, 공차 2 등차수열
 * downTo, step도 함수이다!(중위 호출 함수)
 *
 */

fun main() {

    // for

    println("\n upTo")
    for (i in 1..3){
        println(i)
    }

    println("\ndownTo")
    for ( i in 3 downTo 1){
        println(i)
    }

    println("\nstep")
    for (i in 1..5 step 2){
        println(i)
    }


    // while
    println("\nwhile")
    var i = 1
    while(i <=3){
        println(i)
        i++
    }

}