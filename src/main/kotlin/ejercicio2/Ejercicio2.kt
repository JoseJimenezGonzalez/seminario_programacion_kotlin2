package ejercicio2

import kotlin.math.pow

//Ejercicio 2. Crear la clase triangulo. Propiedades: longitud de los tres lados, perímetro, tipo de
//triángulo (isósceles, escaleno o equilátero). Implementar el método .rectangulo():Boolean que
//calcula si el triángulo es rectángulo.
fun main(){
    val triangulo1 = Triangulo(8.00, 6.00, 10.00)
    println("Triangulo 1")
    println(triangulo1.toString())
    println("¿Es un triangulo rectangulo? ${triangulo1.esRectangulo()}")
    println("Su perimetro es ${triangulo1.perimetro()}")
    println("Es ${triangulo1.tipo()}")
    val triangulo2 = Triangulo(10.00, 10.00, 10.00)
    println("Triangulo 2")
    println(triangulo2.toString())
    println("¿Es un triangulo rectangulo? ${triangulo2.esRectangulo()}")
    println("Su perimetro es ${triangulo2.perimetro()}")
    println("Es ${triangulo2.tipo()}")
}
class Triangulo(var lado1: Double, var lado2: Double, var lado3: Double){

    fun esRectangulo(): Boolean{
        val listaLados: List<Double> = listOf(lado1, lado2, lado3)
        val ordenados = listaLados.sortedDescending()
        val calculoTeoremaPitagorasIzq = ordenados[1].pow(2.0) + ordenados[2].pow(2.0)
        val calculoTeoremaPitagorasDer = ordenados[0].pow(2.0)
        return calculoTeoremaPitagorasDer == calculoTeoremaPitagorasIzq
    }

    fun tipo(): String{
        return when {
            lado1 == lado2 && lado2 == lado3 -> "Equilátero"
            lado1 == lado2 || lado2 == lado3 || lado1 == lado3 -> "Isósceles"
            else -> "Escaleno"
        }
    }

    fun perimetro(): Double = lado1 + lado2 + lado3


    override fun toString(): String {
        return "Lados: $lado1, $lado2, $lado3"
    }
}
