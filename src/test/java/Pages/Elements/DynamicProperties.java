package Pages.Elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicProperties extends Methods {
    public By enable = By.id("enableAfter");
    public By colorChange = By.id("colorChange");
    public By visibleAfter = By.id("visibleAfter");

    public DynamicProperties(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }
    public WebElement enable(){
        return element(enable);
    }
    public WebElement colorChange(){
        return element(colorChange);
    }
    public WebElement visibleAfter(){
        return element(visibleAfter);
    }
    public String color(){
        return colorChange().getCssValue("color");
    }
}