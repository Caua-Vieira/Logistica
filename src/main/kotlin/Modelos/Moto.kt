package Modelos

class Moto(
    nome: String,
    combustivel: String,
    consumo: Double,
    placa: String,
    val cilindrada: Int
) : Veiculo(
    nome = nome,
    combustivel = combustivel,
    consumo = consumo,
    placa = placa
) {


}