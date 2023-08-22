Feature: Consultar mascotas por estatus

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Consultar mascotas por estatus
    Given path '/pet/findByStatus'
    And param status = 'sold'
    When method get
    Then status 200
    And match each response[*].status == 'sold'
