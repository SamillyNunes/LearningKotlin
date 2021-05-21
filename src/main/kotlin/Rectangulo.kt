class Retangulo(val altura:Int, val largura:Int) {
    // esse isQuadrado eh um metodo acessor customizado, e sera computado toda vez q for chamado
    val isQuadrado:Boolean
        get(){
            return altura==largura
        }
}

fun main(){
    val retangulo: Retangulo = Retangulo(5,10)
    println("É quadrado: ${retangulo.isQuadrado}")
}