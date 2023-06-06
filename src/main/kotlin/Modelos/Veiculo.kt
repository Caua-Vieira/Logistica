package Modelos

import java.math.BigDecimal
import java.math.RoundingMode

abstract class Veiculo(
    val nome: String,
    val combustivel: String,
    val consumo: Double,
    val placa: String
) : Comparable<Veiculo> {

    override fun compareTo(other: Veiculo): Int {
        return this.nome.compareTo(other.nome)
    }

    fun gastoCombustivel(distancia: Double, valorCombustivel: Double): BigDecimal {
        return ((distancia / consumo) * valorCombustivel).toBigDecimal().setScale(2, RoundingMode.UP)
    }
}