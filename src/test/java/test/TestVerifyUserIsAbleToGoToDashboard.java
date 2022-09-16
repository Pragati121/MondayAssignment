package test;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestVerifyUserIsAbleToGoToDashboard extends BaseTest {

    @Test
    public void Dashboardtest() throws IOException, InterruptedException {
        pageFactory.getDashboardPage().DashboardUser();
    }
}
