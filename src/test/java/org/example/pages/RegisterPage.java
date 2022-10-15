package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }


     HomePage homeObject;
    @FindBy(id = "firstname")
    WebElement firstNameTxt;

    @FindBy(id = "lastname")
    WebElement lastNameTxt;

    @FindBy(id = "email_address")
    WebElement emailTxtField;

    @FindBy(id = "password")
    WebElement passwordTxtField;

    @FindBy(id = "confirmation")
    WebElement confirmPasswordTxt;
    @FindBy(xpath = "//*[@id=\"form-validate\"]/div[2]/button")
    WebElement registerBtn;

    @FindBy(linkText = "Log Out")
    WebElement logOutLink;

    @FindBy(xpath = "//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div/div/ul/li/ul/li/span")
    public WebElement successMessage;


    public void userRegister(String firstName,String lastName,String emailAddress,String password){

        sendTextElementText(firstNameTxt,firstName);
        sendTextElementText(lastNameTxt,lastName);
        sendTextElementText(emailTxtField,emailAddress);
        sendTextElementText(passwordTxtField,password);
        sendTextElementText(confirmPasswordTxt,password);
        clickButton(registerBtn);
    }

    public void logOut(){
        homeObject=new HomePage(Hooks.driver);
        homeObject.clickOnAccount();
        clickButton(logOutLink);

    }


}

