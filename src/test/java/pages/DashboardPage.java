package pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.io.IOException;

public class DashboardPage {
    WebDriver driver;
    By HomePageVerify = By.xpath("//div[contains(@class,'header-logo')]");
    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    public void DashboardUser() throws IOException
    {

        driver.findElement(HomePageVerify).click();
        String actual = driver.findElement(HomePageVerify).getText();
        Assert.isTrue(actual.equals("Dashboard"), "Expected result does not match with actual result");
    }

}
