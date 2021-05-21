// Classe de apenas objetos valor (sem codigo, só dados)
// Por baixo dos panos, o kotlin gera um bytecode para essa classe em java
//o proprio kotlin ja gera no bytecode os gets e setters (se for possivel), alem do construtors
class Pessoa (
    val nome:String,
    val idade:Int
)

fun main(){
    val pessoa1:Pessoa = Pessoa("Sam",21)
    val pessoa2:Pessoa = Pessoa("Leo",23)
    println("Pessoa 1: ${pessoa1.nome}")
    println("Pessoa 2: ${pessoa2.nome}")
}