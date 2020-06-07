package com.admiral.web;

import java.net.MalformedURLException;

import com.admiral.web.MobileAuto;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class MapperClass {

    MobileAuto dm = new MobileAuto();

    @Given("^I launch \"([^\"]*)\" on \"([^\"]*)\"$")
    public void I_launch(String url, String browser) throws MalformedURLException, InterruptedException {
        dm.openBrowser(browser);
        dm.get(url);
        
    }

    @And("^I click on \"([^\"]*)\"$")
    public void I_clickthe_on(String objectName) throws Throwable {

        dm.click(objectName);
        //System.out.println("Clicked on login");
    }
    @And("^I added new step here$")
    public void I_added_step(String objectName) throws Throwable {

        dm.clickID(objectName);
        //System.out.println("Clicked on login");
    }
    
    @And("^I JSclick on \"([^\"]*)\"$")
    public void I_JSclickthe_on(String objectName) throws Throwable {

        dm.clickJS(objectName);
        //System.out.println("Clicked on login");
    }

    @And("^I click \"([^\"]*)\"$")
    public void I_click(String objectName) throws Throwable {

        dm.click(objectName);
        //System.out.println("Clicked on login");
    }
    
    @And("^I select \"([^\"]*)\"$")
    public void I_select(String objectName) throws Throwable {

        dm.click(objectName);
        //System.out.println("Clicked on login");
    }

    @And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
    public void I_enter(String objectName, String text) throws Throwable {

        dm.enterByid(objectName, text);

    }

    @Then("^\"([^\"]*)\" should be displayed as \"([^\"]*)\"$")
    public void Page_title_should_be(String objectName, String text) throws InterruptedException {
        dm.VerifyText(objectName, text);
        System.out.println("title matches");

    }
    
    
    @Then("^\"([^\"]*)\" page should be displayed with title \"([^\"]*)\"$")
    public void Page_should_be_displayed_with_title(String objectName, String text) throws InterruptedException {
        dm.xPathVerifyText(objectName, text);
        System.out.println("title matches");

    }
    
    @And("^\"([^\"]*)\" will be \"([^\"]*)\"$")
    public void Page_will_be(String objectName, String text) throws InterruptedException {
        dm.indicatorProgress(objectName, text);
        System.out.println("Indicator matches");

    }

    @Then("^Next page should be displayed$")
    public void Next_page_should_be() throws InterruptedException {
        System.out.println("Next page displayed successfully");

    }
    
    @And("^I have added this for testing$")
    public void I_have_added_this() throws InterruptedException {
        System.out.println("I have added this for testing");

    }

    @And("^I click \"([^\"]*)\" to upload \"([^\"]*)\"$")
    public void I_click_to_upload(String objectName, String doc) throws Throwable {

        dm.clickUpload(objectName, doc);
        //System.out.println("Clicked on login");
    }

    @And("^I wait for \"([^\"]*)\"$")
    public void I_wait_for(long time) throws Throwable {

        Thread.sleep(time);
        //System.out.println("Clicked on login");
    }
}
