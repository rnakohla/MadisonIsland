package org.example.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
    public WebDriver driver;
    public Select select;
    public Actions action ;
    public JavascriptExecutor jse;




    public PageBase(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    protected static void clickButton(WebElement button){
        button.click();
    }
    protected static void sendTextElementText(WebElement txt, String value){
        txt.sendKeys(value);
    }

    public void scrollToBottom(){
        jse.executeScript("scrollBy(0,2500)");
    }
}
