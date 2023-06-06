package Modelos

class Relatorios(
    val condutores: MutableList<Condutor> = mutableListOf(),
    val veiculos: MutableList<Veiculo> = mutableListOf(),
    val viagens: MutableList<Viagem> = mutableListOf()
) {

    fun adicionarCondutor(condutor: Condutor) {
        condutores.add(condutor)
    }

    fun adicionarVeiculo(veiculo: Veiculo) {
        veiculos.add(veiculo)
    }

    fun adicionarViagem(viagem: Viagem) {
        viagens.add(viagem)
    }

    fun imprimeCondutores() {
        condutores.sortedBy { it.cpf }
        for (condutor in condutores) {
            println("Nome: ${condutor.nome}")
            println("CPF: ${condutor.cpf}")
            println("Data de nascimento: ${condutor.dataNascimento}")
            println("Salario: ${condutor.salario}")
            println("------------------------------\n")
        }
    }

    fun imprimeViagens() {
        viagens.sortedBy { it.custo(5.0) }
        for (viagem in viagens) {
            println("Cidade de origem: ${viagem.cddOrigem}")
            println("Cidade de destino: ${viagem.cddDestino}")
            println("Distância: ${viagem.distancia}")
            println("Veículo: ${viagem.veiculo.nome}")
            println("Condutor: ${viagem.condutor.nome}")
            println("Custo: ${viagem.custo(5.0)}")
            println("---------------------------------\n")
        }
    }

    fun imprimeVeiculos() {
        veiculos.sort()
        for (veiculo in veiculos) {
            println("Veiculo: ${veiculo::class.simpleName}")
            println("Nome: ${veiculo.nome}")
            println("Combustivel: ${veiculo.combustivel}")
            println("Consumo: ${veiculo.consumo}")
            println("placa: ${veiculo.placa}")
            println("-----------------------------------\n")
        }
    }

    
}