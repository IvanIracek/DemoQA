package Pages.Alerts;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalDialogs extends Methods {
    By smallModal = By.id("showSmallModal");
    By largeModal = By.id("showLargeModal");

    public ModalDialogs(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }
    public void clickSmallModal(){
        click(smallModal);
    }
    public void clickLargeModal(){
        click(largeModal);
    }
}
