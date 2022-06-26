package Test.Elements;
import Methods.Variables;
import Test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCheckBox extends BaseTest {

    @BeforeMethod
    public void goTo(){
        basePage.goToElements();
        menu.clickOnMenuElement(Variables.checkBox);
    }

    @Test
    public void testExpand() {
        checkBox.expand("Home");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[class='rct-node rct-node-parent rct-node-expanded'] ol")));
            assert true;
        }
        catch (TimeoutException e){
            assert false;
        }
    }

    @Test
    public void testHappyFlow() throws InterruptedException {
        checkBox.expand("Home");
        checkBox.expand("Desktop");
        checkBox.expand("Documents");
        checkBox.expand("Downloads");
        checkBox.clickBox("Desktop");
        checkBox.clickBox("Documents");
        checkBox.clickBox("Downloads");

        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(checkBox.result));
            assert true;
        }
        catch (NoSuchElementException e){
            assert false;
        }
    }
}
