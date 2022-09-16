package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookPage {
    WebDriver driver;
    By Booklink           =  By.xpath("//a[text()='Books ']");
    By AddCArt            =  By.xpath("//button[contains(@class,'button-2')][1]");
    By Shoppingcart       =  By.xpath("//a[@class='ico-cart']");
    By AgreeButton        =  By.xpath("//input[@id=\"termsofservice\"]");
    By Checkout           = By.xpath("//button[@name='checkout']");
    By Register           = By.xpath("//button[text()='Register']");
    By Femalebutton       = By.xpath("//input[@id=\"gender-female\"]");
    By FirstName          = By.xpath("//input[@id=\"FirstName\"]");
    public BookPage(WebDriver driver) {
        this.driver = driver;
    }

    public void BookUser() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(Booklink).click();
        driver.findElement(AddCArt).click();
        driver.findElement(Shoppingcart).click();
        driver.findElement(AgreeButton).click();
        driver.findElement(Checkout).click();
        driver.findElement(Register).click();
        driver.findElement(Femalebutton).click();
        driver.findElement(Femalebutton).sendKeys("Pragati");
    }
}