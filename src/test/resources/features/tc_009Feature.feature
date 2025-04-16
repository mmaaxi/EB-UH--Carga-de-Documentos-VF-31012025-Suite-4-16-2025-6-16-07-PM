Feature: Validar opción de cancelar carga de documento

  Scenario: Cancelar la carga de un documento PDF
    Given que el usuario está en la página de carga de documentos
    When el usuario inicia la carga de un documento PDF
    Then el proceso de carga se inicia correctamente
    When el usuario hace clic en el botón 'Cancelar' durante el proceso de carga
    Then el proceso de carga se detiene y se revierte cualquier cambio parcial