# Saucedemo-automatedTest
Runnable automation test for the www.saucedemo.com site

 ```S
                Java + Selenium webDriver + Cucumber + Serenity + Junit
```

## Starting 🚀
 ### Pre-requirements 📋
You must have installed GIT A MAVEN in your local


### Installation 🔧
```
git clone https://github.com/Ignacioarranzoviedo/saucedemo-automatedTest.git
```

## Test execution LOCAL⚙️
```
mvn install verify
```
You can execute the test suite in different browser in local (by default chrome): 'browser.type =' - src/test/java/automation/saucedemo/config/configuration.properties

## Test execution SELENIUM-GRID⚙️
grid.run = true - src/test/java/automation/saucedemo/config/configuration.properties

Run the following comands in the remote machine /src/main/resources/ (selenium-server-standalone-3.141.59.jar.jar included src/main/resources/selenium-server-standalone-3.141.59.jar)
```
java -Dwebdriver.chrome.driver=chromedriver.exe -Dwebdriver.gecko.driver=geckodriver.exe -Dwebdriver.ie.driver=IEDriverServer.exe -jar selenium-server-standalone-3.141.59.jar  -role node -nodeConfig configNode.json
java -jar selenium-server-standalone-3.141.59.ja -role webdriver -hub http://IP:4444/grid/register -browser browserName=navegador –port 5567
mvn install verify
```
## Technologies 🛠️

* [Maven](https://maven.apache.org/)
* [Cucumber](https://cucumber.io/)
* [Selenium](http://www.selenium.dev/)
* [SerenityBDD](http://www.thucydides.info/#/)

## Author ✒️

* **Ignacio Arranz Oviedo** - [ignacioarranzoviedo](ignacio.a.oviedo@gmail.com)


---
⌨️ with ❤️ by [ignacioarranzoviedo](ignacio.a.oviedo@gmail.com) 😊