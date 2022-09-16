package pages;

import org.openqa.selenium.WebDriver;
public class PageFactory {
    WebDriver driver;
    private DashboardPage Dashboard;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public DashboardPage getDashboardPage() {
        if (Dashboard == null) {
            Dashboard = new DashboardPage(driver);
        }
        return Dashboard;
    }
}
