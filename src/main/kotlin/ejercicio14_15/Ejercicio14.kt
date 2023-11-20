package ejercicio14_15

import kotlin.math.PI
import kotlin.math.absoluteValue
import kotlin.math.pow
import kotlin.math.sqrt

//Ejercicio 14: Crea la clase circunferencia. El constructor primario recibirá el radio de
//la circunferencia y el secundario recibirá la posición del centro de la circunferencia y
//un punto cualquiera de la misma. Crear el método longitud() y sobrecargar el método
//toString() de forma que muestre toda la info de la circunferencia

fun main(){
    val circunferencia1 = Circunferencia(5.39)
    val circunferencia2 = Circunferencia(Punto(0.0, 9.0), Punto(0.0, 0.0))
    println(circunferencia1.toString())
    println(circunferencia2.toString())
    val circulo1 = Circulo(Punto(0.0, 9.0), Punto(0.0, 0.0),"rojo")
    println(circulo1.toString())
    val circulo2 = Circulo(5.69, "azul")
    println(circulo2.toString())
}
data class Punto(val puntoEjeX: Double = 0.0, val puntoEjeY: Double = 0.0)

open class Circunferencia(var radio: Double = 0.0){

    var puntoCircunferencia: Punto = Punto()
    var puntoCentroCircunferencia: Punto = Punto()


    constructor(puntoCircunferencia: Punto, puntoCentroCircunferencia: Punto): this(){
        this.puntoCircunferencia = puntoCircunferencia
        this.puntoCentroCircunferencia = puntoCentroCircunferencia
        this.radio = calcularRadio()
    }

    fun longitud(): Double = 2 * PI * radio

    open fun calcularRadio(): Double{
        val puntoX1 = puntoCentroCircunferencia.puntoEjeX.absoluteValue
        val puntoX2 = puntoCircunferencia.puntoEjeX.absoluteValue
        val puntoY1 = puntoCentroCircunferencia.puntoEjeY.absoluteValue
        val puntoY2 = puntoCircunferencia.puntoEjeY.absoluteValue
        return sqrt((puntoX1+puntoX2).pow(2)+(puntoY1+puntoY2).pow(2))/2
    }

    override fun toString(): String = "Radio de la circunferencia: $radio\nCentro en la circunferencia: $puntoCentroCircunferencia\nPunto de la circunferencia: $puntoCircunferencia"

}
//: Circunferencia(radio = radio) -> Le tenemos que especificar para que lo construya el padre
class Circulo(radio: Double = 0.0, var color: String = ""): Circunferencia(radio = radio){
    // : this(color = color) -> Lo construye a traves del constructor primario
    constructor(centro: Punto, puntoCualquiera: Punto, color: String): this(color = color){
        //Secuencia : el secundario llama al principal y este llama al constructor de la clase padre, por eso podemos acceder a estos
        this.puntoCentroCircunferencia = centro
        this.puntoCircunferencia = puntoCualquiera
        this.radio = calcularRadio()
    }
    fun calcularArea(): Double = PI * radio * radio
    override fun toString(): String {
        // Me da el resultado del padre
        val padreString = super.toString()
        // Le añado mas cosas aparte de las del padre
        return padreString + "Color del circulo: $color\nÁrea del circulo: ${calcularArea()}\n"
    }
}