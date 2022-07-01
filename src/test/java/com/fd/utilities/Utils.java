package com.fd.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
    public static boolean isClickable(WebElement element)
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
