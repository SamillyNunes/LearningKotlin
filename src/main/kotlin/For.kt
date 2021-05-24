// Numeros divisiveis por 15 = Fizzbuzz
// Numeros divisiveis por 3 = Fizz
// Numeros divisiveis por 5 = Buzz
// Caso contrario = imprime o num

fun fizzBuzz(numero:Int) = when{
    numero%15==0 -> "FizzBuzz"
    numero%3==0 -> "Fizz"
    numero%5==0 -> "Buzz"
    else -> "$numero"
}

fun main(){
    // No Kotlin, nao ha o for convencional, apenas o foreach
    // No kotlin representamos n1..n2 como um intervalo de numeros comecando em n1 e terminando (incluido) em n2
    for(numero in 1..100){
        println(fizzBuzz(numero))

    }
}