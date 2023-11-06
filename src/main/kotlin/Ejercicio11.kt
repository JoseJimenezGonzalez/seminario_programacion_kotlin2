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
    println(imprimirEquiposChampions(championsLeague(listaEquipos)))
}
class EquipoDeFutbol(var nombre: String, var pais: String)

fun championsLeague(lista: MutableList<EquipoDeFutbol>): MutableList<Pair<EquipoDeFutbol, EquipoDeFutbol>> {
    var listaEntrada = lista
    var listaChampions = mutableListOf<Pair<EquipoDeFutbol, EquipoDeFutbol>>()
    val random = Random(System.currentTimeMillis())
    for(i in 0..3){
        //Primer equipo
        val indicePrimerEquipo = random.nextInt(lista.size-1)
        val primerEquipo = lista[indicePrimerEquipo]
        listaEntrada.removeAt(indicePrimerEquipo)
        //Segundo equipo
        val indiceSegundoEquipo = random.nextInt(lista.size-1)
        val segundoEquipo = lista[indiceSegundoEquipo]
        listaEntrada.removeAt(indiceSegundoEquipo)
        //Añadimos los dos equipos al par
        listaChampions.add(Pair(primerEquipo, segundoEquipo))
    }
    return listaChampions
}

fun imprimirEquiposChampions(equiposChampions: MutableList<Pair<EquipoDeFutbol, EquipoDeFutbol>>): String{
    var res = ""
    for (i in equiposChampions.indices){
        res += "${equiposChampions[i].first.nombre}(${equiposChampions[i].first.pais}) juega contra ${equiposChampions[i].second.nombre}(${equiposChampions[i].second.pais})\n"
    }
    return res
}

