Feature: Agregar una mascota a la tienda

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Agregar una mascota a la tienda
    Given path '/pet'
    And request { "id": 1, "name": "MascotaPrueba", "status": "available" }
    When method post
    Then status 200
