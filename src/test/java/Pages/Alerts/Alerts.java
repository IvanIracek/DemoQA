package Pages.Alerts;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts extends Methods {
    By alert = By.id("alertButton");
    By alertAfter5 = By.id("timerAlertButton");
    By confirmBox = By.id("confirmButton");
    By promptBox = By.id("promtButton");
    By message = By.id("confirmResult");

    public Alerts(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }
    public void clickAlert(){
        click(alert);
    }
    public void clickAlertAfter(){
        click(alertAfter5);
    }
    public void clickConfirmBox(){
        click(confirmBox);
    }
    public void clickPromptBox(){
        click(promptBox);
    }
    public String getMessage(){
        return element(message).getText();
    }

}
