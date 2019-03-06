Feature: Team information back end

  @wip
  Scenario: Team members db test
    Given user on the login page
    And user logs in using "ucharlot7y@nbcnews.com" and "archibaldmelloy"
    When the user goes to the "my team" page
    Then team information should match database records