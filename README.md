## Orange-HRM-Site Automation With TESTNG

##### This is an automation test suite for OrangeHRM site. OrangeHRM is a human resource management system. This site is automated using Selenium and TestNg and this automation suite contains a number of positive and negative test cases for various functionalities.

### Test Case for this Suite: 

 https://docs.google.com/spreadsheets/d/1dWenlpIgI72RAuOpfhvRDzcE2Dl5mmzQIFSCdT4s4JA/edit?usp=sharing

### Prerequisites: 
 -  JDK
 -  Gradle
### Tools and Technologies:
 - IntelliJ IDEA
 - Selenium Webdriver
 - TestNG Framework
 - Gradle
 - Allure
### How to run this project: 
 - Clone the repository ``` git@github.com:Katha-Sikdar/Orange-HRM-Site-Automation-By-TestNG.git ```
 -  Open Terminal
 -  Give the following command to run Smoke Test Suite-
      - gradle clean test -Pfilesuite="SmokeMasterSuite.xml"
  - Give the following command to run Regression Test Suite -
      - gradle clean test -Pfilesuite="RegressionMasterSuite.xml"
   - To generate Allure Report use following commands -
       - allure serve allure-results
       - allure generate allure-results --clean -output
 ### Allure Report for Regression Test - 
 
![over 1](https://github.com/Katha-Sikdar/Orange-HRM-Site-Automation-By-TestNG/assets/82141562/90c47dc6-8f92-4030-ad95-e1b2a551b290)
