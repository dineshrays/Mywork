#-------------------------------------------------------------------------------------------------------------
# Author : Arvind                                                               Reviewer    : Kamal
# Date   : 25-02-2019                                                          Reviewed On : 22-02-2019
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Description
# CR #1 :project details page
#-------------------------------------------------------------------------------------------------------------

Feature: Project details page
   To download the agent authority confirmation

  #scenario-1
  
  @smoketest
  
 Scenario: To download the agent authority  pdf document
  
    Given User should see the details of project page
    When User should click the download link
    And  User should navigate to agent authority page
    And User should click the download button
    And User should see the pdf link
    And User should click the pdf link 
    Then User should download pdf 
   

    