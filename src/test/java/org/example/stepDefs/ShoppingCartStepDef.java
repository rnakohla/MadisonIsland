package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.*;
import org.testng.Assert;

import static java.lang.Integer.parseInt;

public class ShoppingCartStepDef {

    HomePage homeObject;
    int max=350;
    RegisterPage registrationPageObject;
    DetailsPage detailsPageObject;
    ShoppingCart shoppingCartObject;


    @Given("user can login with newly registered account {string},{string},{string},{string}")
    public void user_can_login_with_newly_registered_account(String firstname, String lastname, String email, String password) {
        homeObject=new HomePage(Hooks.driver);
        homeObject.clickOnAccount();
        homeObject.clickOnRegisterLink();
        registrationPageObject=new RegisterPage(Hooks.driver);
        registrationPageObject.userRegister(firstname,lastname,email,password);




    }

    @When("user hover women menu select pants category and opens item details")
    public void userHoverWomenMenuSelectPantsCategoryAndOpensItemDetails() {
        homeObject.womenMenuHover();
        homeObject.openItemDetails();

    }

    @And("user select color,size and add item to shopping cart")
    public void userSelectColorSizeAndAddItemToShoppingCart() {
        detailsPageObject=new DetailsPage(Hooks.driver) ;
        detailsPageObject.selectColor();
        detailsPageObject.selectSize();
        detailsPageObject.addToCart();
        shoppingCartObject=new ShoppingCart(Hooks.driver);
        shoppingCartObject.scrollToBottom();
        String st=shoppingCartObject.grandTotValue.getText();
        System.out.println(shoppingCartObject.grandTotValue.getText());

    }

    @Then("the item Total is less than budget")
    public void theItemTotalIsLessThanBudget() {
        String st=shoppingCartObject.grandTotValue.getText();
        st=st.replace("$","");
        double itemTotal=Double.parseDouble(st);


         Assert.assertTrue(max>itemTotal);

    }

}
