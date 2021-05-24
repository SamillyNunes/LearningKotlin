import java.util.*

// Objetivo: Imprimir as representações binárias dos caracteres de A a F

fun main(){
    // treeMap -> ja ordena pelas chaves
    val binaryRepresentation = TreeMap<Char, String>()

    for(c in 'A'..'F'){
        // c.toint vai retornar o codico ASCII
        val binary = Integer.toBinaryString(c.toInt())
        binaryRepresentation[c] = binary
    }

    // for((chave,valor)
    for((letter, binary) in binaryRepresentation){
        println("Caractere $letter-> Binary: $binary")
    }
}