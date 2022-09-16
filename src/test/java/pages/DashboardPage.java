package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import java.io.IOException;

public class DashboardPage {
    WebDriver driver;
    By ComputerHyperlink = By.xpath("//a[text()='Computers ']");
    By Notebook          = By.xpath("//a[text()=' Notebooks ']");
    By Cart              = By.xpath("//button[contains(@class,'button-2')]");
    By Cart2             = By.xpath("//button[text()=\"Add to cart\"][1]");
    By Shoppingcart      =  By.xpath("//a[@class='ico-cart']");
    By Checkout          = By.xpath("//button[@name='checkout']");
    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    public void DashboardUser() throws InterruptedException
    {
         Thread.sleep(2000);
         driver.findElement(ComputerHyperlink).click();
         driver.findElement(Notebook).click();
         driver.findElement(Cart).click();
        driver.findElement(Cart2).click();
        driver.findElement(Shoppingcart).click();
        driver.findElement(Checkout).click();

    }

}
