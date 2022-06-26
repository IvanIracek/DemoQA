package Pages;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menu extends Methods {

    public Menu(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }
    public void clickOnMenuElement(String s){
        click(By.xpath(String.format("//span[text()='%s']", s)));
    }

}
