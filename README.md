# BDD-Selenium-Cucumber

### Test Automation example in Java , Cucumber and Selenium WebDriver with Page Object Model and Page Factory design pattern.
This project is an example of automated functional test for https://n11.com

The example test cases and scenarios are located in :  src/test/resources/Features/Steps.feature

**Step Definitions :** src/test/java/stepDefs/StepDefinitions

**Chrome Driver:** src/test/resources/Binaries/chromedriver_5

**Gecko Driver (Mozilla):** src/test/resources/Binaries/geckodriver

(By default, tests will run on Chrome.)

### Installation:

*You need to have Java 8 JDK installed along with maven.

**$ mvn clean install**
Running tests
**$ mvn test**

**Cucumber Extent Reports:** target/cucumber-reports/advanced-reports/extentreports/extent.html

**Other Reports:** target/cucumber-html-report

