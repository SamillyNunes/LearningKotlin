// Enums no Kotlin são soft-keywords, oq que signigica que só são palavras-chaves
// quando vêm antes da palavra-chave "class"

// aqui definimos propriedades rgb para cada Cor, sendo elas vermelho, verde e azul
enum class Cor(val vermelho:Int, val verde:Int, val azul:Int){
    VERMELHO(255,0,0),
    LARANJA(255,165,0),
    AMARELO(255,255,0),
    VERDE(0,255,0),
    AZUL(0,0,255); // nesse caso eh obrigatorio: quando separamos as ctts das funcoes

    fun rgbToDecimal() = ((vermelho*256 + verde)*256+azul)
}

fun main(){
    val rgb = Cor.VERMELHO.rgbToDecimal()
    println("Rgb: $rgb")
}