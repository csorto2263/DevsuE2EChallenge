Feature: Consultar una mascota por ID

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Consultar una mascota por ID
    Given path '/pet/{petId}'
    And path petId = 1
    When method get
    Then status 200
    And match response == { "id": 1, "name": "MascotaPrueba", "status": "available" }
