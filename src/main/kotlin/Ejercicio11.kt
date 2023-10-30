import java.util.*

fun main(){

    var equipo1 = EquipoDeFutbol("Real Madrid", "España")
    var equipo2 = EquipoDeFutbol("Real Madrid", "España")
    var equipo3 = EquipoDeFutbol("FC Barcelona", "España")
    var equipo4 = EquipoDeFutbol("Manchester United", "Inglaterra")
    var equipo5 = EquipoDeFutbol("Liverpool", "Inglaterra")
    var equipo6 = EquipoDeFutbol("Bayern Munich", "Alemania")
    var equipo7 = EquipoDeFutbol("Borussia Dortmund", "Alemania")
    var equipo8 = EquipoDeFutbol("Paris Saint-Germain", "Francia")
    var equipo9 = EquipoDeFutbol("Olympique de Marsella", "Francia")
    var equipo10 = EquipoDeFutbol("Juventus", "Italia")
    var equipo11 = EquipoDeFutbol("AC Milan", "Italia")
    var equipo12 = EquipoDeFutbol("FC Porto", "Portugal")
    var equipo13 = EquipoDeFutbol("Benfica", "Portugal")
    var equipo14 = EquipoDeFutbol("Ajax", "Países Bajos")
    var equipo15 = EquipoDeFutbol("PSV Eindhoven", "Países Bajos")
    var equipo16 = EquipoDeFutbol("Boca Juniors", "Argentina")
    var listaEquipos = mutableListOf<EquipoDeFutbol>(equipo1, equipo2, equipo3, equipo4, equipo5, equipo6,
        equipo7, equipo8, equipo9, equipo10, equipo11, equipo12, equipo13, equipo14, equipo15, equipo16)
}
class EquipoDeFutbol(var nombre: String, var pais: String)

fun championsLeague(lista: MutableList<EquipoDeFutbol>){
    var listaChampions = MutableList<Pair<EquipoDeFutbol, EquipoDeFutbol>>(4)
    val random = Random(System.currentTimeMillis())
    val numeroAleatorio = random.nextInt(16)
}

