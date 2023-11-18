package ejercicio4

//Crea una clase llamada Estudiante que contenga información como nombre, edad y
//calificaciones. Luego, crea una lista de objetos Estudiante y permite a los usuarios agregar
//nuevos estudiantes, mostrar la información de un estudiante en particular y calcular el promedio
//de calificaciones de todos los estudiantes.
fun main(){
    val estudiante1 = Estudiante("Jose", 30, mutableListOf(10.0, 9.5, 9.6))
    val estudiante2 = Estudiante("Alejandro", 27, mutableListOf(10.0, 5.0))
    val estudiante3 = Estudiante("Federico", 20, mutableListOf(0.0, 0.0))
    println("La media de estudiante2 es: " + estudiante2.notaMedia())
    val clase = ClaseEstudiantes(mutableListOf(estudiante1, estudiante2))
    println(clase.mediaClase())
    clase.agregarAlumno(estudiante3)
    println(clase.mediaClase())
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
    fun mostrarInformacionEstudianteConcreto(nombre: String): String{
        var res = ""
        lista.forEach { estudiante ->
            if(estudiante.nombre == nombre){
                res += "${estudiante}"
            }
        }
        return res
    }
    fun mediaClase(): Double{
        var sumatoria = 0.0
        lista.forEach { estudiante ->
            sumatoria += estudiante.notaMedia()
        }
        return sumatoria/lista.size
    }
}