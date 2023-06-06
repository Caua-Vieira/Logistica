package Modelos

class Caminhao(
    nome: String,
    combustivel: String,
    consumo: Double,
    placa: String,
    val qtdEixos: Int
) : Veiculo(
    nome = nome,
    combustivel = combustivel,
    consumo = consumo,
    placa = placa
) {

}