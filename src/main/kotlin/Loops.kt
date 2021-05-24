// Um programa para calcular e exibir o resultado da média de temperaturas informadas pelo usuário
fun main(){
    var temperatura: Int = 0
    var somatorio: Int = 0
    var quantidade:Int =0

    while (temperatura!=999){
        println("Digite uma temperatura ou 999 para sair:")
        temperatura = readLine()!!.toInt() // aqui (!!) estamos afirmando que com certeza sera digitado um numero

        if(temperatura!=999){
            somatorio+=temperatura
            quantidade++
        }
    }

    val media = somatorio/quantidade
    println("Média: ${media}")
}