fun main() {
    val valor = calculaAlgo()
}

fun calculaAlgo() {

    val str: String = "Ana Guerra"

    for (a in str) {

        print("$a ")

    }

    for(b in 0..100 step 2) {

        print(b)

    }

    for(c in 100 downTo 0) {

        println(c)

    }
}