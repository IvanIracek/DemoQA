package Test.BookStore;
import Methods.Variables;

import Test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBookStore extends BaseTest {
    @BeforeMethod
    public void goTo() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("(//div[@class='card-up'])[6]")));
        basePage.goToBooks();
    }

    @Test
    public void testClickOnBooks() throws InterruptedException {
        bookStore.clickOnBook(0);
        String s = driver.getCurrentUrl();
        for (int j = s.length() - 1; j > s.length() - 14; j--) {
            if(Character.isDigit(s.charAt(j))){
                continue;
            }
            else assert false;
        }
        assert true;
    }
}
