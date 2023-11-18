package ejercicio18

// Clase base para cuerpos celestes
open class CuerpoCeleste(
    val nombre: String,
    val masa: Double,
    val diametro: Double,
    val periodoRotacion: Double,
    val periodoTraslacion: Double
) {
    open fun imprimirInformacion() {
        println("Nombre: $nombre")
        println("Masa: $masa kg")
        println("Diametro: $diametro km")
        println("Período de Rotación: $periodoRotacion horas")
        println("Período de Traslación: $periodoTraslacion días")
    }
}

// Clase para planetas que hereda de CuerpoCeleste
class Planeta(
    nombre: String,
    masa: Double,
    diametro: Double,
    periodoRotacion: Double,
    periodoTraslacion: Double,
    val distanciaMediaAlSol: Double,
    val excentricidadOrbita: Double
) : CuerpoCeleste(nombre, masa, diametro, periodoRotacion, periodoTraslacion) {

    override fun imprimirInformacion() {
        super.imprimirInformacion()
        println("Distancia Media al Sol: $distanciaMediaAlSol km")
        println("Excentricidad de la Órbita: $excentricidadOrbita")
    }
}

// Clase para satélites que hereda de CuerpoCeleste
class Satelite(
    nombre: String,
    masa: Double,
    diametro: Double,
    periodoRotacion: Double,
    periodoTraslacion: Double,
    val distanciaMediaAlPlaneta: Double
) : CuerpoCeleste(nombre, masa, diametro, periodoRotacion, periodoTraslacion) {

    override fun imprimirInformacion() {
        super.imprimirInformacion()
        println("Distancia Media al Planeta: $distanciaMediaAlPlaneta km")
    }
}

fun main() {
    // Ejemplo de uso
    val tierra = Planeta("Tierra", 5.972e24, 12742.0, 24.0, 365.25, 149.6e6, 0.0167)
    val luna = Satelite("Luna", 7.342e22, 3475.0, 27.3, 27.3, 384400.0)

    println("Información del Planeta:")
    tierra.imprimirInformacion()

    println("\nInformación del Satélite:")
    luna.imprimirInformacion()
}
