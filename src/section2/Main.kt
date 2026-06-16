package section2

fun main() {
    startsWithA4(null) // 오류 발생 케이
}

// 접근제어자 생략시 전부 public
fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean?{
    if (str == null)
        return null

    return str.startsWith("A")
}

/*
fun startsWithA3_error(str:String?) : Boolean{
    return str.startsWith("A")
}
*/

fun startsWithA3(str: String): Boolean{
    return str.startsWith("A")
}

fun startsWithA4(str: String?): Boolean{
    return str!!.startsWith("A") // null이 들어오는 경우 NullPointException이 발생할 수 있음.
}

// Elvis 연산자 ?:
fun starsWithA5(str: String?): Int{
    return str?.length ?: 0 // Elvis 연산자. 앞의 값이 null이면 뒤의 값을 사용한다.
}


// safe call
fun startsWithA6(str: String?){
    // str.length 실행 불가.
    str?.length // null이 아니면 실행 null이면 실행하지 않는다.
}



