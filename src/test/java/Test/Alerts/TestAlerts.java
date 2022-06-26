package Test.Alerts;
import Methods.Variables;
import Test.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAlerts extends BaseTest {
    @BeforeMethod
    public void goTo(){
        basePage.goToAlerts();
        menu.clickOnMenuElement(Variables.alerts);
    }

    @Test
    public void testAlert() throws InterruptedException {
        alerts.clickAlert();
        try{
            wait.until(ExpectedConditions.alertIsPresent());
        }
        catch (TimeoutException t){
            assert false;
        }
        driver.switchTo().alert().accept();
        assert true;
    }

    @Test
    public void testAfter5Seconds() throws InterruptedException {
        alerts.clickAlertAfter();
        Thread.sleep(5000);
        Alert after = driver.switchTo().alert();
        String s = after.getText();
        Assert.assertTrue(!s.isEmpty());
    }

    @Test
    public void testConfimrBoxAccept() throws InterruptedException {
        alerts.clickConfirmBox();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        if(alerts.getMessage().equals("You selected Ok")){
            assert true;
        }
        else assert false;
    }

    @Test
    public void testConfirmBoxCancel() throws InterruptedException {
        alerts.clickConfirmBox();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().dismiss();
        if(alerts.getMessage().equals("You selected Cancel")){
            assert true;
        }
        else assert false;
    }

    /*@Test
    public void testPromptBox() throws InterruptedException {
        alerts.clickPromptBox();
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(1000);
        driver.switchTo().alert().;
        actions.sendKeys("Ivan");
        Thread.sleep(3000);
    }*/
}
