Feature: Validate recovery after load error

  Scenario: Validate system recovery after a loading error
    Given I simulate a network failure during the document loading
    Then the system captures the error and displays an informational message
    When I retry the document loading
    Then the system allows the retry without additional errors