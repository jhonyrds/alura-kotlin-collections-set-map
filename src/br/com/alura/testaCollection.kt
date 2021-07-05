package br.com.alura

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salva("Jhony")
    banco.salva("Stephanie")
    println(nomesSalvos)
    println(banco.nomes)
}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaCollection() {
    val nomes: Collection<String> = mutableListOf("Jhony", "Stephanie", "Miguel", "Eloisa")

    for (nome: String in nomes) {
        println(nome)
    }

    println(nomes)
    println("Tem o nome Jhony? ${nomes.contains("Jhony")}")
    println(nomes.size)
}