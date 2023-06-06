package Main

import Modelos.*
import java.time.LocalDate

fun main() {

    val condut = Condutor(
        nome = "Ariel",
        cpf = "122.122.122-11",
        dataNascimento = LocalDate.of(1902, 12, 23),
        salario = 2333.0
    )
    val condut2 = Condutor(
        nome = "Jonas",
        cpf = "233.233.233-22",
        dataNascimento = LocalDate.of(1900, 9, 12),
        salario = 1900.0
    )

    val relatorios = Relatorios()

    relatorios.adicionarCondutor(condut)
    relatorios.adicionarCondutor(condut2)
    relatorios.imprimeCondutores()

    val carro = Carro(
        nome = "Golf",
        combustivel = "Flex",
        consumo = 11.5,
        placa = "HTC0876",
        qtdPortas = 4
    )
    val moto = Moto(
        nome = "CB 500",
        combustivel = "flex",
        consumo = 15.0,
        placa = "FHY6532",
        cilindrada = 180
    )

    relatorios.adicionarVeiculo(carro)
    relatorios.adicionarVeiculo(moto)
    relatorios.adicionarVeiculo(
        Caminhao(
            nome = "Scania",
            combustivel = "Gasolina",
            consumo = 11.5,
            placa = "PKL7890",
            qtdEixos = 8
        )
    )
    relatorios.imprimeVeiculos()

    relatorios.adicionarViagem(
        Viagem(
            cddOrigem = "São Paulo",
            cddDestino = "Rio de Janeiro",
            distancia = 534.5,
            veiculo = carro,
            condutor = condut
        )
    )
    relatorios.adicionarViagem(
        Viagem(
            cddOrigem = "Rio de Janeiro",
            cddDestino = "Minas Gerais",
            distancia = 687.0,
            veiculo = moto,
            condut2
        )
    )
    relatorios.imprimeViagens()

    val folhaPagamento = FolhaDePagamento()
    folhaPagamento.adicionarCondutor(condut)
    folhaPagamento.adicionarCondutor(condut2)
    folhaPagamento.imprime()

    println("\nO gasto com combustível da viagem é: ${carro.gastoCombustivel(100.0, 5.0)}")
}