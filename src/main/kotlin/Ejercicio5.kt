fun main(){
    val producto1 = Producto("Television LG", 500.76, 5)
    val producto2 = Producto("Frigorifico Bosh", 1500.00, 1)
    val lista = Inventario(mutableListOf(producto1, producto2))
    println(lista.imprimirTodo())
    producto2.actualizarStock(15)
    println(lista.imprimirTodo())

}
class Producto(var nombre: String, var precio: Double, var stock: Int){
    fun actualizarStock(cantidad: Int){
        if(cantidad > 0){
            stock = cantidad
        }
    }
    fun mostrarInformacion(): String = "Nombre: $nombre, Precio: $precio, Stock: $stock"
}

class Inventario(var lista: MutableList<Producto>){

    fun imprimirTodo(): String{
        var res = ""
        lista.forEach { elemento->
            res += "${elemento.mostrarInformacion()}\n"
        }
        return res
    }

    fun agregarProducto(producto: Producto){
        lista.add(producto)
    }
}
