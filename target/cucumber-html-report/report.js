$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Features/Steps.feature");
formatter.feature({
  "name": "Full scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@Positive"
    },
    {
      "name": "@Functional"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on MainPage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.given_i_am_on_mainpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.when_i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_enter_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search samsung from search bar",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.when_i_search_samsung_from_search_bar()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#searchData\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027IST01-eroglue\u0027, ip: \u0027fe80:0:0:0:b6:c4e2:270f:e3ef%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.3\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /var/folders/29/jm2tglrd7yx...}, goog:chromeOptions: {debuggerAddress: localhost:64617}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 00b236bedf2d829157619233f2c97261\n*** Element info: {Using\u003did, value\u003dsearchData}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\n\tat pages.MainPage.searchText(MainPage.java:54)\n\tat stepDefs.StepDefinitions.when_i_search_samsung_from_search_bar(StepDefinitions.java:70)\n\tat ✽.I search samsung from search bar(classpath:Features/Steps.feature:11)\n",
  "status": "failed"
});
formatter.step({
  "name": "I am on samsung category",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.then_i_am_on_samsung_category()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I navigate to second page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_navigate_to_second_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I add third product to favorites",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_add_third_product_to_favorites()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I go to favorites list",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_go_to_favorites_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify product is added to favorites",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.then_i_verify_product_is_added_to_favorites()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I delete product",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_i_delete_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify product is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.then_i_verify_product_is_deleted()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});