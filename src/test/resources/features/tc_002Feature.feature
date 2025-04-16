Feature: Validar error en carga de formato no soportado

  Scenario: Seleccionar un archivo de formato no soportado - .docx
    Given el usuario navega a la página de carga de archivos
    When el usuario selecciona un archivo con formato .docx
    And el usuario hace clic en el botón "Cargar"
    Then el sistema debe rechazar el archivo
    And el sistema muestra un mensaje de error indicando formato no soportado