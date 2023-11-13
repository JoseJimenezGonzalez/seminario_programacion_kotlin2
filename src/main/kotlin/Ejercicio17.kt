class Prueba {
    fun ejecutarPruebas() {
        // Crear un bloc de notas de ejemplo
        val blocNotas = BlocNotas()

        // Agregar algunas notas al bloc
        blocNotas.agregarNota(Nota(1, "Recordatorio importante"))
        blocNotas.agregarNota(NotaAlarma(2, "Cita médica", "10:30 AM"))
        blocNotas.agregarNota(Nota(3, "Comprar leche"))

        // Listar todas las notas en el bloc
        println("Notas en el bloc:")
        println(blocNotas.textoConLasNotas())

        // Contar y eliminar una nota
        println("Total de notas: ${blocNotas.numeroDeNotas()}")
        blocNotas.eliminarNotaPorPosicion(1)

        // Listar las notas actualizadas
        println("Notas en el bloc después de la eliminación:")
        println(blocNotas.textoConLasNotas())
    }
}

fun main() {
    // Instanciar y ejecutar las pruebas
    val prueba = Prueba()
    prueba.ejecutarPruebas()
}

open class Nota(var identificador: Int, var lineaTexto: String){
    init {
        println("Se ha creado una nota con identificador: $identificador y linea de texto: $lineaTexto")
    }
    override fun toString(): String = "Identificador: $identificador\nLinea de texto: $lineaTexto"
}
class NotaAlarma(identificador: Int, lineaTexto: String, var horaAlarma: String): Nota(identificador, lineaTexto){
    init {
        println("Se ha creado una nota de alarma con identificador: $identificador, linea de texto: $lineaTexto y hora de la alarma: $horaAlarma")
    }
    override fun toString(): String = "Identificador: $identificador\nLinea de texto: $lineaTexto\nHora de la alarma: $horaAlarma"
}
class BlocNotas(var notas: MutableList<Nota> = mutableListOf()){

    fun agregarNota(nota: Nota){
        notas.add(nota)
    }
    fun eliminarNotaPorPosicion(posicion: Int){
        notas.removeAt(posicion)
    }
    fun textoConLasNotas(): String{
        var res = ""
        notas.forEach { nota->
            res += "Nota:\n${nota.toString()}\n"
        }
        return res
    }
    fun numeroDeNotas(): Int = notas.size
}