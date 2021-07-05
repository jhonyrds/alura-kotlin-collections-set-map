package br.com.alura

fun testaSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Jhony", "Stephanie", "Eloisa", "Miguel")
    val assistiramCursoKotlin: Set<String> = setOf("Jhony", "Stephanie", "Miguel", "Deivid")
//    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Jhony")
    assistiramAmbos.add("Stephanie")
    println(assistiramAmbos)

    //devolve um novo Set com a soma dos elementos dos conjuntos
    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid union assistiramCursoKotlin)

    //devolve um novo Set subtraindo os elementos contidos no segundo conjunto
    println(assistiramCursoKotlin - assistiramCursoAndroid)
    println(assistiramCursoKotlin subtract assistiramCursoAndroid)

    //devolve um novo Set apenas com os elementos contidos em ambos os conjuntos
    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Jhony")
    println(assistiramList)
    println(assistiramList.toSet())
}