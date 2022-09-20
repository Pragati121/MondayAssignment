package pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BookPage {
    WebDriver driver;
    By Booklink           =  By.xpath("//a[text()='Books ']");
    By AddCArt            =  By.xpath("//button[contains(@class,'button-2')][1]");
    By Shoppingcart       =  By.xpath("//a[@class='ico-cart']");
    By AgreeButton        =  By.xpath("//input[@id=\"termsofservice\"]");
    By Checkout           = By.xpath("//button[@name='checkout']");
    By Register           = By.xpath("//button[text()='Register']");
    By Femalebutton       = By.xpath("//input[@id=\"gender-female\"]");
    By FirstName          = By.xpath("//input[@name='FirstName']");
    By Lastname           = By.xpath("//input[@name='LastName']");
    By Email              = By.xpath("//input[@name='Email']");
    By Address            = By.xpath("//input[@name='Company']");
    By Password           = By.xpath("//input[@name='Password']");
    By ConfirmPassword    = By.xpath("//input[@name='ConfirmPassword']");
    By RegisterButton     = By.xpath("//button[@name='register-button']");
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
    }
    public void login() throws IOException {
        String path = System.getProperty("user.dir") + "//src//test//java//TestData//DataDriven23.xlsx";
        FileInputStream prop1 = null;
        try {
            prop1 = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook wb = new XSSFWorkbook(prop1);
        XSSFSheet sheet = wb.getSheet("Sheet1");
        String Username = sheet.getRow(1).getCell(0).getStringCellValue();
        String Username2 = sheet.getRow(1).getCell(1).getStringCellValue();
        String Username3 = sheet.getRow(1).getCell(2).getStringCellValue();
        String Username4 = sheet.getRow(1).getCell(3).getStringCellValue();
        String Username5 = sheet.getRow(1).getCell(4).getStringCellValue();
        String Username6 = sheet.getRow(1).getCell(5).getStringCellValue();
        driver.findElement(FirstName).sendKeys(Username);
        driver.findElement(Lastname).sendKeys(Username2);
        driver.findElement(Email).sendKeys(Username3);
        driver.findElement(Address).sendKeys(Username4);
        driver.findElement(Password).sendKeys(Username5);
        driver.findElement(ConfirmPassword).sendKeys(Username5);
        driver.findElement(Register).click();
    }
}