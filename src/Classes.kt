fun main() {

    val julia = PrimeiraPessoa("Júlia", 2003).saudacao()

    val ana = SegundaPessoa("Ana", 1999, 18)
    println(ana.nome)
    println(ana.anoDeNascimento)
    println(ana.saudacao())

}

// Classes possui propriedades e métodos.
// Construtor: Trecho de código chamado quando a classe é instanciada.

class PrimeiraPessoa(
    var nome: String,
    var anoNascimento: Int
    ) {

    fun saudacao() = println("Olá, o meu nome é $nome e eu nasci em $anoNascimento")

}

class SegundaPessoa(var nome: String, var anoDeNascimento: Int) {

    private var idade: Int? = null

    constructor(nome: String, anoDeNascimento: Int, idade: Int) : this(nome, anoDeNascimento) {
        this.idade = idade
    }

    fun saudacao() = println("Olá, o meu nome é $nome e eu nasci em $anoDeNascimento")

}