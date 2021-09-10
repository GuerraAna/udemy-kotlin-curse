package Poo

/*
    * Enum precisa de uma propriedade e ela será passada em cada objeto
    * Enum = Enumeração
 */

enum class Propriedade(var id: Int) {
    BAIXA(1) {

    },
    MEDIA(2) {

    },
    ALTA(3) {

    }
}

fun main() {
    for(p in Propriedade.values()) {
        println("$p <--> ${p.id} <--> ${p.ordinal}")
    }
}