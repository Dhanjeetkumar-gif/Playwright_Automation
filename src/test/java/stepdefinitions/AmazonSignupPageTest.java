package stepdefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webPages.AmazonSingupPage;

public class AmazonSignupPageTest {

    DriverFactory driverFactory;
    AmazonSingupPage amazonSingupPage;

 public  AmazonSignupPageTest(){
        driverFactory= new DriverFactory("chrome");
        amazonSingupPage=new AmazonSingupPage(driverFactory.getPage());
        System.out.println(amazonSingupPage.getClass());

    }



    @When("user enters {string} in search field")
    public void user_enters_in_search_field(String string) {

     amazonSingupPage.enterSearchItem(string);
     amazonSingupPage.clickOnSearchBtn();
    }
    @Then("text {string} is displayed")
    public void text_is_displayed(String string) {

     //amazonSingupPage.clickOnSearchBtn();
        amazonSingupPage.verifySuccessfulSearch(string);

    }


    @Given("user is on amazon signup page {string}")
    public void userIsOnAmazonSignupPage(String arg0) {
     amazonSingupPage.opensPage(arg0);
    }
}
