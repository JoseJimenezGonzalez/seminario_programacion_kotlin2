fun main(){
    val numero1: Double = 5.0
    val numero2: Double = 6.0
    val suma = Matematicas.sumar(numero1, numero2)
    val resta = Matematicas.restar(numero1, numero2)
    val producto = Matematicas.multiplicar(numero1, numero2)
    val division = Matematicas.division(numero1, numero2)
    println("La suma es: $suma")
    println("La resta es: $resta")
    println("El producto  es: $producto")
    println("La division es: $division")
}

class Matematicas{
    companion object{
        fun sumar(numero1: Double, numero2: Double): Double = numero1 + numero2
        fun restar(numero1: Double, numero2: Double): Double = numero1 - numero2
        fun multiplicar(numero1: Double, numero2: Double): Double = numero1 * numero2
        fun division(numero1: Double, numero2: Double): Double = numero1 / numero2
    }
}