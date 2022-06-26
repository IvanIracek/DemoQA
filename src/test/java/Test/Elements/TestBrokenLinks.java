package Test.Elements;
import Methods.Variables;
import Test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBrokenLinks extends BaseTest {

    @BeforeMethod
    public void goTo(){
        basePage.goToElements();
        menu.clickOnMenuElement(Variables.brokenLinks);
    }

    @Test
    public void testValidImage() throws InterruptedException {
        driver.navigate().to(brokenLinksImages.getValidImage());
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src='https://demoqa.com/images/Toolsqa.jpg']")));
            assert true;
        }
        catch(TimeoutException e){
            assert false;
        }
    }

    @Test
    public void testBrokenImage() {
        driver.navigate().to(brokenLinksImages.getBrokenImage());
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src='https://demoqa.com/images/Toolsqa 1.jpg']")));
            assert false;
        }
        catch(TimeoutException e){
            assert true;
        }
    }

    @Test
    public void testValidLink() {
        brokenLinksImages.clickValidLink();
        if(driver.getCurrentUrl().equals("https://demoqa.com/")){
            assert true;
        }
        else assert false;
    }

    @Test
    public void testBrokenLink() {
        brokenLinksImages.clickBrokenLink();
        if(driver.getCurrentUrl().equals("https://demoqa.com/")){
            assert false;
        }
        else assert true;
    }
}
