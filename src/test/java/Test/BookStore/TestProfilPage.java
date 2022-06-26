package Test.BookStore;
import Methods.Variables;
import Test.BaseTest;
import com.google.errorprone.annotations.Var;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestProfilPage extends BaseTest {
    @BeforeMethod
    public void goTo(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("(//div[@class='card-up'])[6]")));
        basePage.goToBooks();
        menu.clickOnMenuElement(Variables.login);
    }

    @Test
    public void testGoToBookStore() throws InterruptedException {
        login.login();
        profilPage.clickBookStore();
        Assert.assertEquals(Variables.bookStorePage, driver.getCurrentUrl());
    }

    @Test
    public void testRows() {
        login.login();
        for(WebElement e : profilPage.getRowElements()){
            System.out.println(e.getText());
        }
    }

    @Test
    public void testBookInLibrary() {
        login.login();
        System.out.println(profilPage.getTitle(0));
        Assert.assertEquals(profilPage.getTitle(0), "Git Pocket Guide");
    }

    @Test
    public void testIsBookAdded() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        login.login();
        profilPage.clickBookStore();
        bookStore.clickOnBook(0);
        bookStore.clickAdd();
        try {
            wait.until(ExpectedConditions.alertIsPresent());
        }
        catch (UnhandledAlertException e){
            System.out.println("Timeout");
        }
        driver.switchTo().alert().accept();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        menu.clickOnMenuElement(Variables.profileTab);
        if(profilPage.getTitle(0).isBlank()){
            assert false;
        }
        else assert true;
        profilPage.clickDeleteAllBooks();
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));
        }
        catch (TimeoutException e){
            System.out.println("Timeout");
        }
        profilPage.clikOk();
        try {
            wait.until(ExpectedConditions.alertIsPresent());
        }
        catch (UnhandledAlertException e){
            System.out.println("Timeout");
        }
        driver.switchTo().alert().accept();
        if(profilPage.getRowElements().size() == 0) {
            assert true;
        }
        else assert false;
    }
}