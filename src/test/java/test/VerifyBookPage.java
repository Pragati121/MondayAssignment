package test;

import org.testng.annotations.Test;
import pages.PageFactory;

import java.io.IOException;

public class VerifyBookPage extends BaseTest {
    @Test
    public void Dashboardtest() throws InterruptedException {
        pageFactory.getDashboardPage().DashboardUser();
    }

    @Test
    public void Booktest() throws InterruptedException {
        pageFactory.getBook().BookUser();
    }
}





