Feature: Validar error por tamaño de documento excedido

  Scenario: Intentar cargar un archivo que excede el tamaño permitido
    Given el usuario está en la página de carga de documentos
    When el usuario selecciona un archivo que excede el tamaño máximo permitido
    Then el sistema identifica que el archivo es demasiado grande
    When el usuario intenta cargar el archivo
    Then se muestra un mensaje de error indicando que el archivo excede el tamaño permitido