Feature: Actualizar nombre y estatus de la mascota

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Actualizar nombre y estatus de la mascota
    Given path '/pet'
    And request { "id": 1, "name": "NuevaMascotaPrueba", "status": "sold" }
    When method put
    Then status 200
