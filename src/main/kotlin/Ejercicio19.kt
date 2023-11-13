open class PNJ(var nombre: String, var PV: Int, var PM: Int, var LVL: Int){
    open fun levelUp(){
        LVL++
    }
}
class Guerrero(nombre: String, PV: Int, PM: Int, LVL: Int):PNJ(nombre, PV, PM, LVL){
    override fun levelUp(){
        super.levelUp()
        PV += PV * 8 / 100
        PM += PM * 1 / 100
    }
}
class Mago(nombre: String, PV: Int, PM: Int, LVL: Int):PNJ(nombre, PV, PM, LVL){
    override fun levelUp(){
        super.levelUp()
        PV += PV * 4 / 100
        PM += PM * 3 / 100
    }
}
fun main(){
    var guerrero = Guerrero("Conan", 400, 50, 1)
    var mago = Mago("Voldemort", 1600, 150, 1)
    var nivel: String = ""
    while(true){
        if(guerrero.PV > mago.PV){
            nivel += "${guerrero.LVL}"
            break
        }
        guerrero.levelUp()
        mago.levelUp()
    }
    println("El guerrero tendra mas PV que el mago en el nivel $nivel")
}