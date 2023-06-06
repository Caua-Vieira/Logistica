package Modelos

import java.math.BigDecimal
import java.math.RoundingMode

class Viagem(
    val cddOrigem: String,
    val cddDestino: String,
    val distancia: Double,
    val veiculo: Veiculo,
    val condutor: Condutor
) {

    fun custo(valorCombustivel: Double): BigDecimal {
        val consumoCombustivel: BigDecimal = veiculo.gastoCombustivel(distancia, valorCombustivel )
        val diariaCondutor: BigDecimal = (kotlin.math.ceil(distancia / 700) * condutor.salario).toBigDecimal()
        return (consumoCombustivel + diariaCondutor).setScale(2, RoundingMode.UP)
    }
}