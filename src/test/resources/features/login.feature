Feature: Descargar documentación de Bono de Género

  Scenario: Acceder a la pagina Relación con Inversionistas
    Given que el usuario accede al sitio web de Banistmo
    When selecciona la opción "Acerca de" del menú
    And selecciona la opción "Información Corporativa" del submenú
    Then se muestra la pagina Relación con Inversionistas
