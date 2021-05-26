fun main(){
    println("IsLetter ? ${isLetter('a')}")
    println("Is not a number? ${isNotDigit('b')}")
    println("Is not a number? ${isNotDigit('1')}")
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

// !in -> nao esta dentro
fun isNotDigit(c: Char) = c !in '0'..'9'