// O When eh equivalente aos switchs no java, e eh considerado uma expressao. Deve retornar algo
fun obterMnemonica(cor:Cor): String =
    when(cor){
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguém"
        Cor.VERDE -> "Viver"
        Cor.AZUL -> "Além é"
        Cor.LARANJA -> "Legal"
    }

// Lembrando que no corpo de bloco o tipo de retorno eh obrigatorio ser explicito
// Quando, ao utilizar o when, passamos varios valores por virgulas, significa que eh uma coisa ou outra e ja
// retorna aquilo
fun obterTemperatura(cor: Cor): String{
    return when(cor){
        Cor.VERMELHO, Cor.LARANJA, Cor.AMARELO -> "Quente"
        Cor.VERDE -> "Neutro"
        Cor.AZUL -> "Frio"
    }
}

fun main(){
    val mnemonica = obterMnemonica(Cor.VERMELHO)
    println("Mnemonica $mnemonica")

    val temperatura = obterTemperatura(Cor.AMARELO)
    println("Temperatura: $temperatura")
}