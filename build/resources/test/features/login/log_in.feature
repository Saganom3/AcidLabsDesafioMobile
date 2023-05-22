@ALL
Feature: Log in

  @SUCCESSFUL
  Scenario: Try to log in with valid credentials
    Given Jorge Saganome wants to enter the application
    When he sends his credentials
    Then he should see the dashboard

  @FAILED
  Scenario: Try to log in with not valid credentials
    Given Jorge Saganome wants to enter the application
    When send your wrong credentials
    Then he shouldn't see the board