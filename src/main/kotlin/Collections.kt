fun main(){
    // ArrayList - Classe
    val frutas1 = ArrayList<String>()
    frutas1.add("Morango")
    frutas1.add("Abacaxi")
    frutas1.add("Maça")

    println(frutas1)

    // ArrayList - Funcao
    val frutas2 = arrayListOf<String>("Morango", "Abacaxi", "Maçã")
    println(frutas2)

    // Bibliotecas Java
    println(HashSet::class.java) // para saber de qual tipo eh a classe Hashset

    // Proveitos das coleções
    println(frutas1.last())

    val numeros = setOf<Int>(1,144,25)
    println(numeros.maxOrNull())
}