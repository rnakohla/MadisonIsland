package org.example.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends PageBase{
    public ShoppingCart(WebDriver driver) {
        super(driver);
        jse=(JavascriptExecutor)driver;
    }

    @FindBy(xpath = "//*[@id=\"shopping-cart-totals-table\"]/tfoot/tr/td[2]/strong/span")
    public WebElement grandTotValue;

    public void scrollToViewGrandtotal(){
        scrollToBottom();
    }


}
