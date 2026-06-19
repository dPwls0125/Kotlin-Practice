package section3

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/**
 * lec7 - 코틀린에서 예외를 다루는 방법
 *
 * kotlin에서는 try catch가 expression이다.
 *
 * 1. try catch finally 구문
 * 2. Checked Exception과 Unchecked Exception
 * 3. try with resources
 */


fun main(){
    println(parseIntOrThrowV2("string"))
    readFile()
}

// 1. try catch finally 구문
fun parseIntOrThrow(str : String) : Int {
    try {
        return str.toInt()
    }catch(e : NumberFormatException){
        throw IllegalArgumentException("주어진 ${str}은 ")
    }
}


// try catch 문도 expression 형식으로 활용할 수 있음/
fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    }catch (e : NumberFormatException){
        null
    }
}


/**Kotlin에서는 Checked Exception과 Unchecked Exception을 구분하지 않는다.
모두 Unchecked Exception 입니다.*/

fun readFile(){ // Java였다면, IOEXCEPTION을 명시적으로 처리해주어야했지만, kotlin은 아니기 때문에 괜찮다잉
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}
