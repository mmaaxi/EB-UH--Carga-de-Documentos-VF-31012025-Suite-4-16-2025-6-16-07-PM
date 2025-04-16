Feature: Validación de carga de documento PDF válido

  Scenario: El usuario carga un documento PDF válido
    Given que el usuario selecciona un archivo PDF válido
    When el usuario hace clic en el botón 'Cargar'
    Then el documento se carga correctamente en la interfaz