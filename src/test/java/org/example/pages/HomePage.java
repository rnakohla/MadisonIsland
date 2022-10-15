package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{


    public HomePage(WebDriver driver) {
        super(driver);
        action=new Actions(driver);
    }


    //@FindBy(className = " cms-index-index cms-home")
    @FindBy(xpath = "//*[@id=\"header\"]/div/div[2]/a[3]/span[2]")
    public WebElement accountBtn;

    @FindBy(xpath = "//*[@id=\"nav\"]/ol/li[1]/a")
    WebElement womenMenu;
    @FindBy(xpath = "//*[@id=\"nav\"]/ol/li[1]/ul/li[4]/a")
    WebElement pantsitems;
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @FindBy(linkText = "Log In")
    WebElement loginLink;

    public void clickOnAccount(){
        clickButton(accountBtn);
    }

    public void clickOnRegisterLink(){
        clickButton(registerLink);
    }


    public void clickOnLogin(){
        clickButton(loginLink);
    }
    public void womenMenuHover(){
        action.moveToElement(womenMenu)
                .moveToElement(pantsitems)
                .click().build().perform();
    }
    @FindBy(xpath = "//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li[1]/div/div[2]/a")
    WebElement viewDetails;

    public void openItemDetails(){
        clickButton(viewDetails);
    }



}
