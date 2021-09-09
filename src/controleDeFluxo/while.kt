fun main() {

    val numero = whileExemple()

}

fun whileExemple() {

    var number: Int = 0

    while (number < 10) {
        println("O número é $number.")
        number++
    }

    do {
        println(number)
        number += 10
    } while(number < 50)

}