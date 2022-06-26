package Pages.Elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons extends Methods {
    By doubleClick = By.id("doubleClickBtn");
    By rightClick = By.id("rightClickBtn");
    By clickMe = By.xpath("(//button[normalize-space()='Click Me'])[1]");
    By clickMeMessage = By.id("dynamicClickMessage");
    By rightClickMessage = By.id("rightClickMessage");
    By doubleClickMessage = By.id("doubleClickMessage");

    public Buttons(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }

    public void click(){
        click(clickMe);
    }
    public void rightClick(){
        actions.contextClick(element(rightClick)).build().perform();
    }
    public void doubleClick(){
        actions.doubleClick(element(doubleClick)).build().perform();
    }
    public WebElement getClickMessage(){
        return element(clickMeMessage);
    }
    public WebElement getRightClickMessage(){
        return element(rightClickMessage);
    }
    public WebElement getDoubleClickMessage(){
        return element(doubleClickMessage);
    }
}
