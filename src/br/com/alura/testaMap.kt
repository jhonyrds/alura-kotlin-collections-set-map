package br.com.alura

fun testaMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 100.0,
        5 to 150.0,
        6 to 80.0
    )

    val valorPedido = pedidos.getValue(4)
    println(valorPedido)

    val mensagem = pedidos.getOrElse(10) {
        "O pedido não existe"
    }
    println(mensagem)

    println(pedidos.getOrDefault(0, -1.0))
    println(pedidos.getOrDefault(1, -1.0))

    println(pedidos.keys)

    val pedido = pedidos[0]
    pedido?.let {
        println("pedido $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
        print("pedido: ${p.key} ")
        println("valor: R$ ${p.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)

    pedidos.put(5, 80.0)
    println(pedidos)

    pedidos[1] = 100.00
    println(pedidos)

    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)

    pedidos.remove(3, 500.0)
    println(pedidos)

    for (numero in pedidos.keys) {
        println("Pedido $numero")
    }
    println(pedidos.values)

    for (valor in pedidos.values) {
        println("Valor do pedido $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println("pedidos filtrados $pedidosFiltrados")

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 50.0
    }
    println("pedidos acima $pedidosAcima")

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println("pedidos pares $pedidosPares")

    println("Adicionando novos itens com o operador plus ${pedidos + mapOf(7 to 90.0, 8 to 20.0)}")

    println("Removendo pedidos com o minus ${pedidos - listOf(6, 5)}")

    pedidos.putAll(setOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0))
    println("Adicionando elementos com o putAll: $pedidos")

    pedidos.keys.remove(1)
    println("Removendo elementos pela chave: $pedidos")

    pedidos.values.remove(50.00)
    println("Removendo elementos pelo valor: $pedidos")

    pedidos -= 6
    println(pedidos)


}