package Test.Alerts;

import Methods.Variables;
import Test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestBrowserWindows extends BaseTest {
    @BeforeMethod
    public void goTo() {
        basePage.goToAlerts();
        menu.clickOnMenuElement(Variables.browserWindows);
    }

    @Test
    public void testNewTab() throws InterruptedException {
        browserWindows.clickNewTab();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), ("https://demoqa.com/sample"));
    }

    @Test
    public void testNewWindow() throws InterruptedException {
        browserWindows.clickNewWindow();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        /*for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }*/
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/sample");
    }

    @Test
    public void testWindowsMessage() {
        browserWindows.clickNewWindowMessage();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        Assert.assertTrue(driver.getWindowHandles().size() == 2);
    }
}
