//Crea una clase llamada Contacto que represente la información de un contacto en una lista de
//contactos. La clase debe tener propiedades como nombre, número de teléfono y dirección de
//correo electrónico. Luego, crea una lista de objetos Contacto y permite a los usuarios agregar,
//eliminar y mostrar contactos.
fun main(){
    val contacto1 = Contacto("Jose", "666666666", "C/opopopogdfp")
    val contacto2 = Contacto("Andres", "688666666", "C/opopopogfdp")
    val contacto3 = Contacto("Miguel", "66669996", "C/opopopgdffdgdfgop")
    val lista = ListaContactos(mutableListOf(contacto1, contacto2, contacto3))
    println(lista.mostrarContactos())
    val contacto4 = Contacto("Aparicio", "66669996", "C/fgop")
    lista.agregarContacto(contacto4)
    println(lista.mostrarContactos())
    lista.eliminarContacto(contacto1)
    println(lista.mostrarContactos())
}
class Contacto(var nombre: String, var numeroTelefono: String, var direccionCorreo: String){
    constructor() : this("Defecto", "Defecto", "Defecto")
}
class ListaContactos(var listaContactos: MutableList<Contacto>){

    fun agregarContacto(contacto: Contacto){
        listaContactos.add(contacto)
    }
    fun eliminarContacto(contacto: Contacto){
        listaContactos.remove(contacto)
    }
    fun mostrarContactos(): String{
        var res: String = ""
        listaContactos.forEach { contacto ->
            res += "Nombre: ${contacto.nombre} - Numero de telefono: ${contacto.numeroTelefono} - Direccion de correo: ${contacto.direccionCorreo}\n"
        }
        return res
    }
}