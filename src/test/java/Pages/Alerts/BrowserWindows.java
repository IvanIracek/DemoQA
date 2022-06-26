package Pages.Alerts;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserWindows extends Methods {
    By newTab = By.id("tabButton");
    By newWindow = By.id("windowButton");
    By newWindowMessage = By.id("messageWindowButton");

    public BrowserWindows(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }

    public void clickNewTab(){
        click(newTab);
    }
    public void clickNewWindow(){
        click(newWindow);
    }
    public void clickNewWindowMessage(){
        click(newWindowMessage);
    }
}
