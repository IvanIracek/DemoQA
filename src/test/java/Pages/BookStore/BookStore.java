package Pages.BookStore;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
public class BookStore extends Methods {

    By books = By.xpath("//div[@class='action-buttons']//a");
    By add = By.xpath("//div[@class='text-right fullButton']//button[@id='addNewRecordButton']");
    public BookStore(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }
    public void clickOnBook(int i){
        List<WebElement> li = elements(books);
        li.get(i).click();
    }
    public void clickAdd(){
        click(add);
    }
}
