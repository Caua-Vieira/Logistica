package Modelos

class Carro(
    nome: String,
    combustivel: String,
    consumo: Double,
    placa: String,
    val qtdPortas: Int
) : Veiculo(
    nome = nome,
    combustivel = combustivel,
    consumo = consumo,
    placa = placa
) {


}