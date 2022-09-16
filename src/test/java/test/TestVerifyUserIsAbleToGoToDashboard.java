package test;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestVerifyUserIsAbleToGoToDashboard extends BaseTest {

    @Test
    public void Dashboardtest() throws IOException {
        pageFactory.getDashboardPage().DashboardUser();
    }
}
