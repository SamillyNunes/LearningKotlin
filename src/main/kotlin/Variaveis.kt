fun main(){
    // o val vem de valor, e é imutável (equivalente ao final)
    val nome: String = "Samilly"
    println(nome)

    var idade: Int = 20
    idade = 21

    // o $ eh para usar um dado externo
    println("Idade: $idade")

    // Tambem eh possivel criar a variavel sem atrelar um valor junto
    var cidade: String
    cidade = "Arapiraca"

    println("Cidade: $cidade")

}