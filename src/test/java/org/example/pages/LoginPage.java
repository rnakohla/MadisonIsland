package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "email")
    WebElement emailTxt;
    @FindBy(id = "pass")
    WebElement passwordTxt;
    @FindBy(id = "send2")
    WebElement loginBtn;

    public void login(String email,String password){
        sendTextElementText(emailTxt,email);
        sendTextElementText(passwordTxt,password);
        clickButton(loginBtn);
    }
}
