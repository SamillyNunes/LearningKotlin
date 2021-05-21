fun main(){
    println("Hello World!");
    println(max(10,5))
    println(min(10,5))
}

/// Funcoes com corpo de bloco
fun max(a: Int,b: Int): Int{
    return if (a>b) a else b
}

// Funcoes com corpo de expressao
// No caso da funcao abaixo, tambem eh possivel omitir o Int que identifica o tipo do retorno
// da função
fun min(a: Int, b:Int): Int = if (a<b) a else b