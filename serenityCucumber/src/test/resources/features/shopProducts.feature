Feature: Comprar productos desde OpenCart

  @guest-user-tests
  Scenario Outline: Compra de dos productos con usuario Guest
    Given User esta en la pagina Home
    When agrego los productos al carro de compras
    Then veo los valores <precio_total> <sub_total> <eco_tax> <vat>
    #And navego a la pagina de carrito
    #Then reviso el carro de compras
    #And abro la pagina del carro de compras

    #Completar el formulario de Guest User

  Examples:
    | precio_total | sub_total | eco_tax | vat     |
    | $725.20      | $601.00   | $4.00   | $120.20 |
