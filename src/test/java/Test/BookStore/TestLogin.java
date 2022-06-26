package Test.BookStore;

import Methods.Variables;
import Test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {
    @BeforeMethod
    public void goTo(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("(//div[@class='card-up'])[6]")));
        basePage.goToBooks();
        menu.clickOnMenuElement(Variables.login);


    }

    @Test
    public void testLogin() throws InterruptedException {
        login.inputUsername(Variables.bookstore[2]);
        login.inputPassword(Variables.bookstore[3]);
        login.clickSubmit();
        wait.until(ExpectedConditions.urlMatches(Variables.profilePage));
        Assert.assertEquals(Variables.profilePage, driver.getCurrentUrl());
    }
}
