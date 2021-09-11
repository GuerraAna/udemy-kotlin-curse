package Poo

open class Computadores(
    val marca: String,
    val nucleos: Int
    ) {

    fun ligar() {
        println("Computador ligando...")
    }

    fun processar() {
        println("Computador ligado e processando...")
    }

    fun desligar() {
        println("Computador desligando...")
    }
}

class Celular(
    marca: String,
    nucleos: Int
) : Computadores(
    marca,
    nucleos
)

fun main() {

    val iphone = Celular("Apple", 10)

    with(iphone) {
        ligar()
        processar()
        desligar()
    }

}