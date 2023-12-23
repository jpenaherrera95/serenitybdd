Feature: Comprar productos desde OpenCart

  @guest-user-tests
  Scenario Outline: Compra de dos productos con usuario Guest
    #Validar la pagina principal
    Given User esta en la pagina Home
    When agrego los productos al carro de compras
    Then veo los valores <precio_total> <sub_total> <eco_tax> <vat>
    And navego a la pagina del carrito

    #Validar la pagina del carrito
    Then reviso los valores <precio_total> <sub_total> <eco_tax> <vat>
    And navego a la pagina del checkoout
    #And abro la pagina del carro de compras

    #Completar el formulario de Guest User

  Examples:
    | precio_total | sub_total | eco_tax | vat     |
    | $725.20      | $601.00   | $4.00   | $120.20 |
