Feature: Housing Search

  Scenario: I want to search for a Flat to rent
    Given I am on the Home page
    And I click To rent link
    When I enter my choice in the Search field
    And I enter Minimum Price
    And Ienter maximum price
    And I enter property type
    When I click Search Button
    And I assert that rent properties are display
    And I assert that the default list view is enable
    #And I assert that the grid and map views are disabled
    And I click on the grid view and validate the view
    And I click on the map view and validate the view
    And I quit the browser
