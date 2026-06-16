package section2

fun main() {
//    val money1 = JavaMoney(1_000L)
//    val money2 = JavaMoney(1_000L)
//    val money3 = money1
//
//    println(money2 === money3)
//    println(money1 === money3)


    for(i in 1..3){
        println(i)
    }

    println()

    for(i in 3  downTo 1){

        println(i)
    }

    for( i in 1..10 step 2){ // 등차수열 사용
        println(i)
    }
}

class JavaMoney {
    val amount: Long?

    constructor(amount: Long?) {
        this.amount = amount
    }
}