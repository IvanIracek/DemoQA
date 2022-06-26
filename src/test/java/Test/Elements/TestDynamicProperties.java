package Test.Elements;
import Methods.Variables;
import Test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDynamicProperties extends BaseTest {
    @BeforeMethod
    public void goTo() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        basePage.goToElements();
        js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//span[normalize-space()='Dynamic Properties']")));
        menu.clickOnMenuElement(Variables.dynamicProperties);
    }

    @Test
    public void testEnable() {
        try{
            wait.until(ExpectedConditions.elementToBeClickable(dynamicProperties.enable));
            assert true;
        }
        catch (TimeoutException e){
            assert false;
        }
    }

    @Test
    public void testColorChange() throws InterruptedException {
        String initialColor = dynamicProperties.color();
        Thread.sleep(5000);
        Assert.assertNotEquals(initialColor, dynamicProperties.color());
    }

    @Test
    public void testVisible() {
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicProperties.visibleAfter));
            assert true;
        }
        catch (TimeoutException e){
            assert false;
        }
    }
}
