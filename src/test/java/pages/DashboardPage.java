package pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;
    By WelcomePage       =By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By ComputerHyperlink = By.xpath("//a[text()='Computers ']");
    By Notebook          = By.xpath("//a[text()=' Notebooks ']");
    By Product = By.xpath("//a[contains(text(),'Asus N551JK-XO076H Laptop')]");
    By Cart2             = By.xpath("//button[@id='add-to-cart-button-5']");
    By Shoppingcart      =  By.xpath("//a[@class='ico-cart']");
    By Checkbox          =  By.xpath("//input[contains(@name,'termsofservice')]");
    By Checkout          = By.xpath("//button[@name='checkout']");
    By REgisterButton    = By.xpath("//button[text()='Register']");
    By Gender            = By.xpath("//input[@id='gender-female']");
    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    public void DashboardUser() throws InterruptedException
    {
         Thread.sleep(2000);
        String actual = driver.findElement(WelcomePage).getText();
        Assert.isTrue(actual.equals("Welcome to our store"), "Expected result does not match with actual result");
         driver.findElement(ComputerHyperlink).click();
         driver.findElement(Notebook).click();
         driver.findElement(Product).click();
        driver.findElement(Cart2).click();
        driver.findElement(Shoppingcart).click();
        driver.findElement(Checkbox).click();
        driver.findElement(Checkout).click();
        driver.findElement(REgisterButton).click();
        driver.findElement(Gender).click();

    }

}
