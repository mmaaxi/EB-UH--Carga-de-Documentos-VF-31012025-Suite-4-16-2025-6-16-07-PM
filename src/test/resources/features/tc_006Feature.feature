Feature: Validar rendimiento en condiciones de alta concurrencia

  Scenario: Simulación de múltiples usuarios cargando documentos
    Given el sistema está preparado para la carga de documentos
    When múltiples usuarios intentan cargar documentos simultáneamente
    Then el sistema mantiene rendimiento aceptable
    And no se generan bloqueos

  Scenario: Monitoreo de tiempo de respuesta
    Given el sistema está bajo carga alta
    When se monitorea el tiempo de respuesta
    Then el tiempo de respuesta se mantiene dentro de los límites aceptables