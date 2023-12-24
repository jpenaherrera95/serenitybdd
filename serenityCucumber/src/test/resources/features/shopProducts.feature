Feature: Comprar productos desde OpenCart

  @guest-user-tests
  Scenario Outline: Compra de dos productos con usuario Guest
    #Validar la pagina principal
    Given User esta en la pagina Home
    When agrego los productos al carro de compras
    Then veo los valores <total_price> <sub_total> <eco_tax> <vat>
    And navego a la pagina del carrito

    #Validar la pagina del carrito
    Then reviso los valores <total_price> <sub_total> <eco_tax> <vat>
    And navego a la pagina del checkoout

    #Validar la pagina del checkout
    When selecciono la opcion de usuario invitado
    And ingreso la informacion como invitado
    Then valido los precios antes de comprar <sub_total> <flat> <total_with_flat>
    And completo la compra

  Examples:
    | total_price | sub_total | eco_tax | vat     | flat  | total_with_flat |
    | $725.20     | $601.00   | $4.00   | $120.20 | $5.00 | $606.00         |
