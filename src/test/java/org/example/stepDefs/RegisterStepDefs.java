package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.RegisterPage;
import org.testng.Assert;


public class RegisterStepDefs {

    HomePage homeObject;
    RegisterPage registrationPageObject;






    @Given("user go to register page")
    public void user_go_to_register_page() {
        homeObject=new HomePage(Hooks.driver);
        homeObject.clickOnAccount();
        homeObject.clickOnRegisterLink();

    }
    @When("user enters {string},{string},{string},{string}")
    public void userEnters(String firstname, String lastname, String email, String password) {

        registrationPageObject=new RegisterPage(Hooks.driver);
        registrationPageObject.userRegister(firstname,lastname,email,password);

    }

    @Then("the registration page displayed successfully")
    public void theRegistrationPageDisplayedSuccessfully() {
        Assert.assertTrue(registrationPageObject.successMessage.getText().contains("Thank you for registering with Madison Island."));
    }
}
