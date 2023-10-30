//Ejercicio 1. Crear la clase planeta. Propiedades: nombre, tipo y masa (con al menos 3 métodos)
fun main(){
    val planeta1 = Planeta("Tierra", "Rocoso", 4.365724367327867E20)
    val planeta2 = Planeta("Saturno", "Gaseoso", 8.908989450890458E27)
    val planeta3 = Planeta("Urano", "Indefinido", 9.908989450890458E30)
    val sistema = SistemaSolar(mutableListOf(planeta1, planeta2))
    sistema.addPlanet(planeta3)
    println(sistema.planetaMayor()?.nombre)
    println(sistema.masaMedia())
    println(planeta3.toString())
    println(sistema.imprimirNombresSistema())
    println(sistema.masaMedia())
    println(sistema.planetaMenor()?.nombre)
}
class Planeta{
    var nombre: String
    var tipo: String
    var masa: Double
    constructor(nombre: String = "", tipo: String = "", masa: Double = 0.0){
        this.nombre = nombre
        if(tipo == "Rocoso" || tipo == "Gaseoso")
            this.tipo = tipo
        else
            this.tipo = "Rocoso"
        this.masa = masa
    }
    fun mostarNombre(){
        println("El planeta se llama $nombre")
    }

    fun mostrarTipo(){
        println("El planeta es de tipo $tipo")
    }

    fun mostrarMasa(){
        println("El planeta tiene una masa de $masa")
    }

    override fun toString(): String {
        return "$nombre\n$tipo\n$masa"
    }
}
class SistemaSolar(var listaPlanetas: MutableList<Planeta>){
    fun planetaMayor(): Planeta? = listaPlanetas.maxByOrNull { planet -> planet.masa }

    fun planetaMenor(): Planeta? = listaPlanetas.minByOrNull { planet -> planet.masa }

    fun addPlanet(planeta: Planeta){
        listaPlanetas.add(planeta)
    }
    fun masaMedia(): Double = (listaPlanetas.fold(0.0){ total, planet -> total + planet.masa })/listaPlanetas.size

    fun imprimirNombresSistema(): String{
        var res = ""
        listaPlanetas.forEach { planeta ->
            res += planeta.nombre + "\n"
        }
        return res
    }
}
