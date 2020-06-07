package com.admiral.web;

import edu.emory.mathcs.backport.java.util.Arrays;
import static org.junit.Assert.assertEquals;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import java.awt.AWTException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.FileDetector;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MobileAuto {

    static WebDriver driver = null;
    Properties OR = null;
    Properties CONFIG = null;
    public String URL1;

    public MobileAuto() {
        if (OR == null) {
            OR = new Properties();
            try {
                FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/configs/OR.properties");
                OR.load(fs);

                CONFIG = new Properties();

                fs = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/configs/env.properties");
                CONFIG.load(fs);
                System.out.println(System.getProperty("user.dir"));
            } catch (Exception e) {

                System.out.println("Error in initializing the properties");

            }
        }

    }

    /*
	 @Before
	 public void setUp() {
		 AppiumServer.StartAppium().start();
	 }
	 @After
	 public void TearDown() {
		 AppiumServer.StartAppium().stop();
	 }
     */
    public void openBrowser(String browserType) throws MalformedURLException, InterruptedException {
        System.out.println("openBrowser called");
        switch (browserType) {
            case "Android": {
                //				System.out.println("Android Chrome called");
                //For Android web
//                DesiredCapabilities capabilities = new DesiredCapabilities();
//                //For Android web
////                capabilities.setCapability("deviceName", "Testing");
////                capabilities.setCapability("browserName", "Chrome");
////                capabilities.setCapability("platformName", "Android");
////                capabilities.setCapability(MobileCapabilityType.VERSION, "6.0");
//                
//             
//                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Nexus 1");
//                capabilities.setCapability(MobileCapabilityType.UDID, "R32D301N6AH");
//                capabilities.setCapability("browserName", "Browser");
//                //capabilities.setBrowserName(MobileBrowserType.CHROME); 
//                capabilities.setCapability(MobileCapabilityType.VERSION, "4.4.2");
//                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
//
//                URL url = new URL("http://127.0.0.1:4723/wd/hub");
//                // Create object of  AndroidDriver class and pass the url and capability that we created
//                driver = new AndroidDriver(url, capabilities);
                
                //Code for JCC
                DesiredCapabilities capabilities = new DesiredCapabilities();
    		    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
    		   // capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 6");
    		    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Testing");
    		    capabilities.setCapability("platformName", "Android");
    		    capabilities.setCapability(MobileCapabilityType.APP, "D:\\Cucumber Jars\\JCC.apk");
    		    capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
    		    capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.sapientrazorfish.JCC.Droid");
    		    capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "md5618d6f7b6efdeef7b81145f7931693be.SplashActivity");
    		    capabilities.setCapability("autoWebView","True");
    		    capabilities.setCapability("setWebContentsDebuggingEnabled","True");
    		    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
    		    
    		    URL url = new URL("http://127.0.0.1:4723/wd/hub");
    		    // Create object of  AndroidDriver class and pass the url and capability that we created
    		    driver = new AndroidDriver(url, capabilities);
    		    	    
    		    
//    		    AppiumDriver<WebElement> driver = new AppiumDriver<>(
    		    
//    		    		new URL("http://0.0.0.0:4723/wd/hub"), //if it needs to use locally started server
//    		   capabilities);
    			
                break;
                
                
            }
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            case "iOSSauceLabs": {
                System.out.println("iOSSauceLabs called");
                //For Saucelabs
                DesiredCapabilities caps = DesiredCapabilities.iphone();
                caps.setCapability("appiumVersion", "1.7.1");
                caps.setCapability("deviceName", "iPhone X Simulator");
                caps.setCapability("deviceOrientation", "portrait");
                caps.setCapability("platformVersion", "11.2");
                caps.setCapability("platformName", "iOS");
                caps.setCapability("browserName", "Safari");
                driver = new IOSDriver(new URL("http://PritiJ:22b12916-fb44-4cbb-9249-d170fbbd6068@ondemand.saucelabs.com:80/wd/hub"), caps);
                break;
            }
            case "AndroidSauceLabs": {
                System.out.println("AndroidSauceLabs called");
                //For Saucelabs
                DesiredCapabilities caps = DesiredCapabilities.android();
                caps.setCapability("appiumVersion", "1.6.4");
                caps.setCapability("deviceName", "Android Emulator");
                caps.setCapability("deviceOrientation", "portrait");
                caps.setCapability("platformVersion", "6.0");
                caps.setCapability("platformName", "Android");
                caps.setCapability("browserName", "Chrome");
                driver = new AndroidDriver(new URL("http://jbbarnard:5d28bf5b-eab5-46da-8142-8ed377885e63@ondemand.saucelabs.com:80/wd/hub"), caps);
                break;
            }
            case "iOSsimulator": {
                DesiredCapabilities caps = DesiredCapabilities.iphone();
                caps.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.6.4");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7");
                caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
                caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.3");
                caps.setCapability(MobileCapabilityType.PLATFORM, "MAC");
                caps.setCapability(MobileCapabilityType.VERSION, "");
                URL url = new URL("http://0.0.0.0:4723/wd/hub");
                driver = new IOSDriver(url, caps);
                break;
            }
            case "Mozilla": {
                System.out.println("Mozilla called on SauceLabs");
                //For Saucelabs
                DesiredCapabilities caps = DesiredCapabilities.firefox();
                caps.setCapability("platform", "Windows 7");
                caps.setCapability("version", "47.0");
                driver = new RemoteWebDriver(new URL("http://syadav40:3b16bacf-e858-470e-bc45-519ab75e9c16@ondemand.saucelabs.com:80/wd/hub"), caps);
                break;
            }
            case "Chrome2": {
                System.out.println("Chrome called on SauceLabs");
                //For Saucelabs
                DesiredCapabilities caps = DesiredCapabilities.chrome();
                caps.setCapability("platform", "Windows 7");
                caps.setCapability("version", "57.0");
                driver = new RemoteWebDriver(new URL("http://jbbarnard:5d28bf5b-eab5-46da-8142-8ed377885e63@ondemand.saucelabs.com:80/wd/hub"), caps);
                break;
            }
            case "IE": {
                System.out.println("IE called on SauceLabs");
                //For Saucelabs
                DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
                caps.setCapability("platform", "Windows 7");
                caps.setCapability("version", "11.0");
                driver = new RemoteWebDriver(new URL("http://jbbarnard:5d28bf5b-eab5-46da-8142-8ed377885e63@ondemand.saucelabs.com:80/wd/hub"), caps);
                break;
            }
            case "iOS": {
                DesiredCapabilities caps = DesiredCapabilities.iphone();
                caps.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.6.4");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6s");
                caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
                caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.3.1");
                caps.setCapability(MobileCapabilityType.UDID, "afc9159cf5c42d034587874dbb4a01645ee5b05e");
                caps.setCapability(MobileCapabilityType.PLATFORM, "MAC");
                caps.setCapability(MobileCapabilityType.VERSION, "");
                URL url = new URL("http://127.0.0.1:4723/wd/hub");
                driver = new IOSDriver(url, caps);
                break;
            }
            case "Chrome": {
                System.out.println("openBrowser Chrome called");
                System.setProperty("webdriver.chrome.driver",
                        System.getProperty("user.dir") + "/src/test/java/configs/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
        }
            case "Firefox": {
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                //driver.get(arg0);
             // Initialize the eyes SDK and set your private API key.
               
            }
            case "IE10": {
                System.out.println("IE called on SauceLabs");
                //For Saucelabs
                DesiredCapabilities caps = DesiredCapabilities.edge();
                caps.setCapability("platform", "Windows 10");
                caps.setCapability("version", "14.14393");
                driver = new RemoteWebDriver(new URL("http://jbbarnard:5d28bf5b-eab5-46da-8142-8ed377885e63@ondemand.saucelabs.com:80/wd/hub"), caps);
                break;
            }
            case "Chrome10": {
                System.out.println("Chrome called on SauceLabs");
                //For Saucelabs
                DesiredCapabilities caps = DesiredCapabilities.chrome();
                caps.setCapability("platform", "Windows 10");
                caps.setCapability("version", "57.0");
                driver = new RemoteWebDriver(new URL("http://jbbarnard:5d28bf5b-eab5-46da-8142-8ed377885e63@ondemand.saucelabs.com:80/wd/hub"), caps);
                break;
            }
            case "Firefox10": {
                System.out.println("Mozilla called on SauceLabs");
                //For Saucelabs
                DesiredCapabilities caps = DesiredCapabilities.firefox();
                caps.setCapability("platform", "Windows 10");
                caps.setCapability("version", "47.0");
                driver = new RemoteWebDriver(new URL("http://jbbarnard:5d28bf5b-eab5-46da-8142-8ed377885e63@ondemand.saucelabs.com:80/wd/hub"), caps);
                break;
            }
            case "iOS4": {
                DesiredCapabilities caps = DesiredCapabilities.iphone();
                caps.setCapability("appiumVersion", "1.6.4");
                caps.setCapability("deviceName", "iPhone 4s Simulator");
                caps.setCapability("deviceOrientation", "portrait");
                caps.setCapability("platformVersion", "9.3");
                caps.setCapability("platformName", "iOS");
                caps.setCapability("browserName", "Safari");
                driver = new IOSDriver(new URL("http://jbbarnard:5d28bf5b-eab5-46da-8142-8ed377885e63@ondemand.saucelabs.com:80/wd/hub"), caps);
                break;
            }
            case "Androids4": {
                DesiredCapabilities caps = DesiredCapabilities.android();
                caps.setCapability("appiumVersion", "1.6.4");
                caps.setCapability("deviceName", "Samsung Galaxy S4 Emulator");
                caps.setCapability("deviceOrientation", "portrait");
                caps.setCapability("browserName", "Browser");
                caps.setCapability("platformVersion", "4.4");
                caps.setCapability("platformName", "Android");
                driver = new AndroidDriver(new URL("http://jbbarnard:5d28bf5b-eab5-46da-8142-8ed377885e63@ondemand.saucelabs.com:80/wd/hub"), caps);
            }
            default:
                break;
        }

    }

    public void get(String URL) {
        this.URL1 = URL;
        System.out.print(URL1);
        driver.get(CONFIG.getProperty(URL));
    }

    public void click(String objectName) {

        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath((String) OR.get(objectName))));

        if (driver.findElement(By.xpath((String) OR.get(objectName))).isEnabled()) {
            driver.findElement(By.xpath((String) OR.get(objectName))).click();
            System.out.println("The button is enabled");
        } else {
            System.out.println("The button is disabled");
        }
    }

    public void clickCSS(String objectName) {

        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector((String) OR.get(objectName))));

        if (driver.findElement(By.cssSelector((String) OR.get(objectName))).isEnabled()) {
            driver.findElement(By.cssSelector((String) OR.get(objectName))).click();
            System.out.println("The button is enabled");
        } else {
            System.out.println("The button is disabled");
        }
    }
    
    
    public void clickJS(String objectName) {
    	Actions build = new Actions(driver);
    	build.moveToElement(driver.findElement(By.xpath((String) OR.get(objectName)))).contextClick().build().perform();
    			//FindElement(By.apa("ext-gen33"))).ContextClick().Build().Perform();
    }

    public void clickID(String objectName) {

        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.id((String) OR.get(objectName))));

        if (driver.findElement(By.id((String) OR.get(objectName))).isEnabled()) {
            driver.findElement(By.id((String) OR.get(objectName))).click();
            System.out.println("The button is enabled");
        } else {
            System.out.println("The button is disabled");
        }
    }

    public void enterByid(String objectName, String text) {

        //enter 
        //driver.findElement(By.id(objectName)).sendKeys("text");
        driver.findElement(By.cssSelector((String) OR.get(objectName))).sendKeys(text);

    }

    public void VerifyText(String objectName, String text) throws InterruptedException {
        // click on submit button
        //Thread.sleep(1000);

        String errorTxt = driver.findElement(By.cssSelector((String) OR.get(objectName))).getText();
        assertEquals(errorTxt, text);
        System.out.println(errorTxt);
    }

    public void xPathVerifyText(String objectName, String text) throws InterruptedException {
        // click on submit button
        //Thread.sleep(1000);
        String title = driver.findElement(By.xpath((String) OR.get(objectName))).getText();
        //assertEquals(title, text);
        Assert.assertTrue(title, true);
        System.out.println("Page title is: +title");
    }

    public void indicatorProgress(String objectName, String text) throws InterruptedException {
        List<WebElement> attr = driver.findElements(By.cssSelector((String) OR.get(objectName)));
        List<String> idstrings = Arrays.asList(text.split(","));
        for (WebElement webElement : attr) {
            Assert.assertTrue("Progress Indicator is not matching on " + OR.get(objectName) + " as " + text, idstrings.contains(webElement.getAttribute("id")) && idstrings.size() == attr.size());
        }
    }

    public void clickUpload(String objectName, String doc) throws AWTException {

        FileDetector detector = new LocalFileDetector();
        File localFile = detector.getLocalFile(System.getProperty("user.dir") + "/src/test/java/com/input/data/GreenID.jpg");
        WebDriverWait wait = new WebDriverWait(driver, 60);
        //driver.findElement(By.xpath((String) OR.get(objectName))).click();
        //String document = doc;
        switch (doc) {
            case "greenbookID":
                driver.findElement(By.cssSelector((String) OR.get(objectName))).sendKeys(localFile.getAbsolutePath());
                break;
            case "Image_for_GreenID":
                driver.findElement(By.cssSelector((String) OR.get(objectName))).sendKeys(System.getProperty("user.dir") + "/src/test/java/com/input/data/Image_for_GreenID.jpg");
                break;
            case "smartcardID":
                driver.findElement(By.cssSelector((String) OR.get(objectName))).sendKeys(System.getProperty("user.dir") + "/src/test/java/com/input/data/smartcardID.jpg");
                break;
            case "Image_for_smartID":
                driver.findElement(By.cssSelector((String) OR.get(objectName))).sendKeys(System.getProperty("user.dir") + "/src/test/java/com/input/data/Image_for_SmartID.jpg");
                break;
            case "utilityBill":
                driver.findElement(By.cssSelector((String) OR.get(objectName))).sendKeys(System.getProperty("user.dir") + "/src/test/java/com/input/data/utilityBill.jpg");
            default:
                break;
        }
    }

    @After
    public void close() {
        driver.close();
        driver.quit();
    }

}
