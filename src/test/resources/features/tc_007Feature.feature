Feature: Validate Metadata Integrity and Verification

  Scenario: Validate metadata for a valid PDF document
    Given I have uploaded a valid PDF document with metadata
    When the system extracts and stores the associated metadata
    Then the metadata is correctly associated in the database
    And the metadata is displayed correctly in the admin interface