package section2

fun main(){
    val number1 = 4 // 초기할당값을 보고 type을 int로 추론
//    val number2: Long = number1  // tyep mismatch
    val number2: Long = number1.toLong() // 명시적으로
}


// kotlin에서 type 변화는 명시적으로 이루어져야 한다.

