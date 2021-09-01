fun main() {

    println(calculaBonus("Gerente", 1233.12f))
    println(calculaBonus("Coordenador", 31231.12f))

}

fun calculaBonus(cargo: String, salario: Float): Float {

    return if (cargo == "Coordenador") {
        salario * 4f
    } else if (cargo == "Gerente Sênior") {
        salario * 3f
    } else {
        salario * 2f
    }

}