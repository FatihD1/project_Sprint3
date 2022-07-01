package com.fd.pages;

import com.fd.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    public Login_Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
     @FindBy(id = "login")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[.='Log in']")
    public WebElement login_button;
}
