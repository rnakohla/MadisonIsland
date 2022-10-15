package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DetailsPage extends PageBase{
    public DetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "attribute92")
   // @FindBy(xpath = "//*[@id=\"attribute92\"]")
    WebElement colorDDL;
    @FindBy(id = "attribute180")
    WebElement sizeDDL;

   // @FindBy(css = "button.buttonbtn-cart")
    @FindBy(xpath = "//*[@id=\"product_addtocart_form\"]/div[3]/div[6]/div[2]/div[2]/button")
    WebElement addToCart;

    public void selectColor(){
        clickButton(colorDDL);
        select=new Select(colorDDL);
        select.selectByValue("20");
    }
    public void selectSize(){
        select=new Select(sizeDDL);
        select.selectByValue("64");
      //  select.selectByIndex(1);
    }

    public void addToCart(){
        clickButton(addToCart);
    }
}
