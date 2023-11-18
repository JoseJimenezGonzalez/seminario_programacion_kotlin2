package ejercicio20

//Ejercicio 20. Crea la clase de datos Videojuego, que tendrá nombre, año y plataforma del
//juego. Crea una lista con 8 videojuegos de tres plataformas distintas. Crea una función
//que dada una lista de juegos, una año y una plataforma devuelve los juegos de la lista de
//dicho año y plataforma. La función también debe poder usarse especificando solo el año
//o solo la plataforma.
//Ejercicio 22. Crea una función que reciba una lista de juegos y devuelva un mapa
//donde las claves sean las plataformas y el valor el número de juegos para dicha
//plataforma.
fun main(){
    val listaJuegos = listOf(
        Videojuego("Resident Evil", 2000, "PS2"),
        Videojuego("Silent Hill 3", 2006, "PS2"),
        Videojuego("Rule Of Rose", 2006, "PS2"),
        Videojuego("Pokemon Rubí", 2002, "Game Boy"),
        Videojuego("Pokemon Rojo Fuego", 2002, "Game Boy"),
        Videojuego("Evil Within 2", 2017, "PC"),
        Videojuego("Imperium", 2006, "PC"),
        Videojuego("Quake", 1996, "PC"),
    )

    val juegosFiltrados1 = filtrarJuegos(listaJuegos, anio = 2006, plataforma = "PS2")
    println(juegosFiltrados1.toString())
    val juegosFiltrados2 = filtrarJuegos(listaJuegos, anio = 2006)
    println(juegosFiltrados2.toString())

    println("Contar juegos por plataforma")
    val mapaJuegos = contarJuegosPorPlataforma(listaJuegos)
    mapaJuegos.forEach{(plataforma, numeroJuegos) ->
        println("Plataforma: $plataforma, número de juegos: $numeroJuegos")
    }
}
class Videojuego(var nombre: String, var anio: Int, var plataforma: String){
    override fun toString(): String = "Nombre: $nombre\nAño: $anio\nPlataforma: $plataforma\n"
}
fun filtrarJuegos(juegos: List<Videojuego>, anio: Int? = null, plataforma: String? = null): List<Videojuego> {
    return juegos.filter { juego ->
        (anio == null || juego.anio == anio) && (plataforma == null || juego.plataforma == plataforma)
    }
}
fun contarJuegosPorPlataforma(listaJuegos: List<Videojuego>): Map<String, Int>{
    return listaJuegos.groupBy { juego -> juego.plataforma }
        .map { (plataforma, listaJuegosPorPlataforma) -> plataforma to listaJuegosPorPlataforma.size }
        .toMap()
}
