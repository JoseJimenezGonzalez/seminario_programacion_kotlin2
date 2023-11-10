import kotlin.math.PI
import kotlin.math.absoluteValue
import kotlin.math.pow
import kotlin.math.sqrt

//Ejercicio 14: Crea la clase circunferencia. El constructor primario recibirá el radio de
//la circunferencia y el secundario recibirá la posición del centro de la circunferencia y
//un punto cualquiera de la misma. Crear el método longitud() y sobrecargar el método
//toString() de forma que muestre toda la info de la circunferencia

fun main(){
    val circunferencia1: Circunferencia = Circunferencia(5.39)
    val circunferencia2: Circunferencia = Circunferencia(Punto(0.0, 9.0), Punto(0.0, 0.0))
    println(circunferencia1.toString())
    println(circunferencia2.toString())
}
data class Punto(val puntoEjeX: Double, val puntoEjeY: Double)

class Circunferencia(var radio: Double = 0.0){

    var puntoCircunferencia: Punto
    var puntoCentroCircunferencia: Punto

    init {
        puntoCircunferencia = Punto(0.0, 0.0)
        puntoCentroCircunferencia = Punto(0.0, 0.0)
    }

    constructor(puntoCircunferencia: Punto, puntoCentroCircunferencia: Punto): this(){
        this.puntoCircunferencia = puntoCircunferencia
        this.puntoCentroCircunferencia = puntoCentroCircunferencia
        this.radio = calcularRadio()
    }

    fun longitud(): Double = 2*PI*radio

    fun calcularRadio(): Double{
        val puntoX1 = puntoCentroCircunferencia.puntoEjeX.absoluteValue
        val puntoX2 = puntoCircunferencia.puntoEjeX.absoluteValue
        val puntoY1 = puntoCentroCircunferencia.puntoEjeY.absoluteValue
        val puntoY2 = puntoCircunferencia.puntoEjeY.absoluteValue
        return sqrt((puntoX1+puntoX2).pow(2)+(puntoY1+puntoY2).pow(2))/2
    }

    override fun toString(): String = "Radio de la circunferencia: $radio\nCentro en la circunferencia: $puntoCentroCircunferencia\nPunto de la circunferencia: $puntoCircunferencia"

}