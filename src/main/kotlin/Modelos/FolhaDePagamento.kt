package Modelos

class FolhaDePagamento(
    val condutores: MutableList<Condutor> = mutableListOf()
) {

    fun adicionarCondutor(condutor: Condutor) {
        condutores.add(condutor)
    }

    fun totalAPagar(): Double {
        var total: Double = 0.0
        for (condutor in condutores) {
            total += condutor.salario
        }
        return total
    }

    fun imprime() {
        for (condutor in condutores) {
            println("Condutor: ${condutor.nome}")
            println("Salário: ${condutor.salario}")
            println("------------------------------\n")
        }
        println("O total a pagar é: ${totalAPagar()}")
    }
}