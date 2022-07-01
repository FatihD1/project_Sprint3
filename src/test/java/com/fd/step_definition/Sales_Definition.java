package com.fd.step_definition;

import com.fd.pages.Login_Page;
import com.fd.pages.Sales_Page;
import com.fd.utilities.Driver;
import com.fd.utilities.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sales_Definition {
    Sales_Page sales = new Sales_Page();
    Login_Page login = new Login_Page();
    @Given("user is on the home page and on customer option")
    public void userIsOnTheHomePageAndOnCustomerOption() {
        Driver.getDriver().get("https://qa.centrilli.com/");
        login.username.sendKeys("posmanager10@info.com");
        login.password.sendKeys("posmanager");
        login.login_button.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(sales.Sales_button));
        sales.Sales_button.click();
        sales.Customer_button.click();
    }

    @When("User click's List button")
    public void userClickSListButton() {
        boolean sales_b = Utils.isClickable(sales.List_button);
        Assert.assertTrue(sales_b);
    }

    @And("User click's Kanban button")
    public void userClickSKanbanButton() {
        boolean sales_k = Utils.isClickable(sales.Kanban_Button);
        Assert.assertTrue(sales_k);
    }

    @Then("User click's Create button")
    public void userClickSCreateButton() {
        boolean sales_c = Utils.isClickable(sales.Create_button);
        Assert.assertTrue(sales_c);
    }

    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//

    @When("User clicks Create button")
    public void userClicksCreateButton() {
        sales.Create_button.click();
    }

    @And("User enter name")
    public void userEnterSName() {

        sales.Customer_name.sendKeys("FD_Sprint3");
    }

    @And("User enter address")
    public void userEnterSAddress() {
        sales.address_text.sendKeys("Warsaw");
    }

    @And("User click's save")
    public void userClickSSave() {
        sales.save_button.click();
    }

    @Then("User should see name and address on the title of the page")
    public void userShouldSeeNameAndAddressOnTheTitleOfThePage() {
        String Excepted_Title = "FD - Warsaw";
        String Actual_Title = Driver.getDriver().getTitle();
        Assert.assertEquals(Excepted_Title,Actual_Title);
    }


    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//
    // --------------------------------------------------------------------------------//


    @And("User enter created name on text")
    public void userEnterCreatedNameOnText() {
        sales.search_text.sendKeys("FD_sprint3"+Keys.ENTER);
    }
    @Then("User sees the searched value")
    public void userSeesTheSearchedValue() {
        Assert.assertTrue(sales.search_value.isDisplayed());
    }





}
