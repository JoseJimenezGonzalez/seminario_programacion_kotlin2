//Crea una clase llamada Estudiante que contenga información como nombre, edad y
//calificaciones. Luego, crea una lista de objetos Estudiante y permite a los usuarios agregar
//nuevos estudiantes, mostrar la información de un estudiante en particular y calcular el promedio
//de calificaciones de todos los estudiantes.
fun main(){

}
class Estudiante(var nombre: String, var edad: Int, var calificaciones: MutableList<Double>){

    fun mostrarInformacion(): String{
        var res = ""
        res += "Nombre: $nombre Edad: $edad Notas: "
        calificaciones.forEach { nota ->
            res += "$nota, "
        }
        res += "\n"
        return res
    }
    fun notaMedia(): Double = (calificaciones.fold(0.0){ sumatoria, nota -> sumatoria + nota })/calificaciones.size
}
class ClaseEstudiantes(var lista: MutableList<Estudiante>){

    fun agregarAlumno(alumno: Estudiante){
        lista.add(alumno)
    }
    fun mediaClase(): Double{
        var sumatoria = 0.0
        lista.forEach { estudiante ->
            sumatoria += estudiante.notaMedia()
        }
        return sumatoria/lista.size
    }
}