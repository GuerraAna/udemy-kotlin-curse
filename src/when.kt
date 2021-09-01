fun main() {
    val primeiroCalculo: Int = calculaValores(12,6, "divisão")
    println(primeiroCalculo)
}

fun calculaValores(a: Int, b: Int, c: String): Int {

    return when(c) {
            "soma" -> a.plus(b)
            "subtração" -> a.minus(b)
            "multiplicação" -> a.times(b)
            "divisão" -> a.div(b)
            else -> return 0
    }

}