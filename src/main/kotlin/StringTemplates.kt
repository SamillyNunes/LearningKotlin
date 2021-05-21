fun main(){
    val nome:String = "Sam"
    // utlizamos o $ para utilizar variaveis edntro das strings
    println("Nome: $nome")

    // Caso queira-se utilizar o cifrao como simbolo na string, passamos a contra barra antes
    println("Nome: \$nome")

    // Para utilizar o retorno de funcoes, utilizamos as chaves com o cifrao ${chamadaDaFuncao(args)}
    println("Soma é: ${soma(10,20)}")
}

fun soma(a:Int, b:Int):Int{
    return a+b
}