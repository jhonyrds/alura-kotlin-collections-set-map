package br.com.alura

fun testaFuncoesRelacionadas() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)

    )
    println("pedidos $pedidos")
//    val pedidosMapeados: Map<Int, Pedido> = pedidos.associate { pedido: Pedido ->
//        pedido.numero to pedido
//    }

    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido: Pedido ->
        pedido.numero
    }
    println("pedidos mapeados $pedidosMapeados")

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println("pedido com frete grátis $pedidosFreteGratis")
    println(pedidosFreteGratis[Pedido(numero = 2, valor = 60.0)])

//   val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido ->
//       pedido.valor > 50.0
//   }
//    println(mapa)

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> =
        pedidos.groupBy { pedido: Pedido ->
            pedido.valor > 50.00
        }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[false])

    val pedidosAgrupados: Grouping<Pedido, Boolean> = pedidos.groupingBy { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosAgrupados.eachCount())

    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Raul",
        "Betina",
        "Mario",
        "Gisele"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }

    println(agenda)
    println(agenda['J'] ?: "nenhum nome encontrado")
}

data class Pedido(
    val numero: Int,
    val valor: Double
)
