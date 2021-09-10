package Poo

data class Quadrado(val area: Float)

class Triangulo(val area: Float)

fun main() {

    val primeiroQuadrado = Quadrado(10f)
    val segundoQuadrado = Quadrado(10f)

    val primeiroTriangulo = Triangulo(10f)
    val segundoTriangulo = Triangulo(10f)

    println(primeiroQuadrado.hashCode())
    println(segundoQuadrado.hashCode())

    println(primeiroTriangulo.hashCode())
    println(segundoTriangulo.hashCode())

    val terceiroQuadrado = segundoQuadrado.copy()
    println(terceiroQuadrado)


}