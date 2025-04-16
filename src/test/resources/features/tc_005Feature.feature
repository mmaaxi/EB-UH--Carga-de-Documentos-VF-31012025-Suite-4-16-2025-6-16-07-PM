Feature: Validar comportamiento en caso de interrupción de carga
  Como usuario
  Quiero que el sistema maneje bien las interrupciones de carga
  Para garantizar una experiencia de usuario robusta

  Scenario: Interrumpir carga de documento PDF
    Given que he iniciado sesión en la aplicación
    When inicio la carga de un documento PDF válido
    And interrumpo la conexión a internet durante la carga
    Then el sistema debe detectar la interrupción
    And cancelar la carga con un mensaje de error