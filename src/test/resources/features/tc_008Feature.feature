Feature: Validate behavior with a corrupt or damaged document

  Scenario: User tries to upload a corrupted PDF file
    Given a corrupted PDF file is selected
    When the user attempts to upload the document
    Then the system detects the file is damaged
    And the upload is halted
    And an error message is displayed informing about the damage