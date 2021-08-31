fun main() {

    println(calculaBonus("Gerente", 1233.12f))
    println(calculaBonus("Coordenador", 31231.12f))

}

fun calculaBonus(cargo: String, salario: Float): Float {

    val bonus: Float

    if(cargo == "Coordenador") {
        bonus = salario * 4f
    } else if(cargo == "Gerente Sênior") {
        bonus = salario * 3f
    } else {
        bonus = salario * 2f
    }

    return bonus
}