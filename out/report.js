$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AdmiralWeb.feature");
formatter.feature({
  "name": "Launch Admiral web and create a quote for motor",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AdmiralWeb"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Launch Admiral web and go for single car insurance",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AdmiralWebLaunch"
    }
  ]
});
formatter.step({
  "name": "I launch \"Admiral\" on \"\u003cPlatform\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on \"MyAccount\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Platform"
      ]
    },
    {
      "cells": [
        "Chrome"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Launch Admiral web and go for single car insurance",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AdmiralWeb"
    },
    {
      "name": "@AdmiralWebLaunch"
    }
  ]
});
formatter.step({
  "name": "I launch \"Admiral\" on \"Chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.admiral.web.MapperClass.I_launch(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"MyAccount\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.admiral.web.MapperClass.I_clickthe_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Launch Admiral web and go for single car insurance",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AdmiralWebLaunch2"
    }
  ]
});
formatter.step({
  "name": "I launch \"Admiral\" on \"\u003cPlatform\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on \"CarInsuranceLink\"",
  "keyword": "And "
});
formatter.step({
  "name": "I select \"GetaQuote\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click on \"SingleCarInsurance\"",
  "keyword": "And "
});
formatter.step({
  "name": "\"CarInsurance\" page should be displayed with title \"Car Insurance\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Platform"
      ]
    },
    {
      "cells": [
        "Chrome"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Launch Admiral web and go for single car insurance",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AdmiralWeb"
    },
    {
      "name": "@AdmiralWebLaunch2"
    }
  ]
});
formatter.step({
  "name": "I launch \"Admiral\" on \"Chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.admiral.web.MapperClass.I_launch(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"CarInsuranceLink\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.admiral.web.MapperClass.I_clickthe_on(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d83.0.4103.97)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.18363 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 14.03 seconds\nBuild info: version: \u00272.52.0\u0027, revision: \u00274c2593cfc3689a7fcd7be52549167e5ccc93ad28\u0027, time: \u00272016-02-11 11:22:43\u0027\nSystem info: host: \u0027DESKTOP-KNP2U5C\u0027, ip: \u0027192.168.1.8\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\Lenovo\\AppData\\Local\\Temp\\scoped_dir17424_28514}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d83.0.4103.97, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 5af43c3057f38f6bf8f456be2c2b8a01\n*** Element info: {Using\u003dxpath, value\u003d(//span[contains(text(), \u0027Insurance\u0027)])[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:911)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:41)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:661)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:654)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:238)\r\n\tat com.admiral.web.MobileAuto.click(MobileAuto.java:288)\r\n\tat com.admiral.web.MapperClass.I_clickthe_on(MapperClass.java:27)\r\n\tat ✽.I click on \"CarInsuranceLink\"(file:///D:/Sapient%20D/Anand/Admiral_Cucumber/src/test/resources/features/AdmiralWeb.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I select \"GetaQuote\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.admiral.web.MapperClass.I_select(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on \"SingleCarInsurance\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.admiral.web.MapperClass.I_clickthe_on(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"CarInsurance\" page should be displayed with title \"Car Insurance\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.admiral.web.MapperClass.Page_should_be_displayed_with_title(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});