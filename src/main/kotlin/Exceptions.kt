import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.IllegalArgumentException

fun main(){
    try{
        println("Porcentagem: ${porcentagem((150))}")

    } catch (e: IllegalArgumentException){
        println(e.message)

    }

    val idade = lerIdade()
    println("Idade: $idade")
}

// verificar se esta em um intervalo de 1 e 100, caso nao lancar uma excecao
fun porcentagem(numero: Int): String {
    return if(numero in 1..100){
        "$numero%"
    } else {
        throw IllegalArgumentException("Número inválido! Adicione um número entre  1 e 100.")
    }

}

fun lerIdade(): Int?{
    val reader = FileReader(File("src/main/kotlin/idades.txt"))
    val buffer = BufferedReader(reader) // para ler kda linha

    try{
        val numero = buffer.readLine() // lendo um arquivo de texto
        return Integer.parseInt(numero)
    } catch (e: NumberFormatException){
        return null
    } finally {
        // esse bloco so pra limpar o sistema
        buffer.close()
    }
}