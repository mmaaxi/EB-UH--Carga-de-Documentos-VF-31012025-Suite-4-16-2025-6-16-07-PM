Feature: Validate long filename document upload

  Scenario: Validate upload of document with long filename
    Given I navigate to the document upload page
    When I select a PDF file with an extremely long filename
    Then the system should accept the filename and proceed with the upload
    And the interface should display the filename correctly or truncate it appropriately