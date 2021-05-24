import java.lang.IllegalArgumentException

// (1+2)+4
interface Expressao

class Numero(val valor: Int) : Expressao

class Soma(val esquerdo:Expressao, val direito:Expressao): Expressao

fun avaliacao(expressao: Expressao): Int =
    when(expressao){
        is Numero -> {
            println("Expressão com número: ${expressao.valor}")
            expressao.valor
        }
        is Soma -> avaliacao((expressao.esquerdo))+avaliacao(expressao.direito)
        else -> throw IllegalArgumentException("Expressão é inválida.")
    }

fun main(){
    val resultado = avaliacao(Soma(Soma(Numero(1),Numero(2)),Numero(4)))
    println("Resultado: $resultado")
}