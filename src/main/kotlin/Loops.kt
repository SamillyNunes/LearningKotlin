// Um programa para calcular e exibir o resultado da média de temperaturas informadas pelo usuário
fun main(){
    var temperatura: Int // podemos nao inicializar a variavel
    var somatorio: Int = 0
    var quantidade:Int =0

    // o do-while executa pelo menos uma vez
    do {
        println("Digite uma temperatura ou 999 para sair:")
        temperatura = readLine()!!.toInt() // aqui (!!) estamos afirmando que com certeza sera digitado um numero

        if(temperatura!=999){
            somatorio+=temperatura
            quantidade++
        }
    } while (temperatura!=999)

    var media:Int = 0
    if(quantidade!=0){
        media = somatorio/quantidade
    }

    println("Média: ${media}")
}