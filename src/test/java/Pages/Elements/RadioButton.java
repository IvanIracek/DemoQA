package Pages.Elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton extends Methods {
    By yes = By.xpath("//label[normalize-space()='Yes']");
    By impresive = By.xpath("//label[normalize-space()='Impressive']");
    By no = By.cssSelector("label[for='noRadio']");
    By message = By.className("text-success");

    public RadioButton(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }

    public void clickYes(){
        element(yes).click();
    }

    public void clickImpressive(){
        element(impresive).click();
    }
    public void clickNo(){
        element(no).click();
    }
    public WebElement message(){
        return element(message);
    }
    public WebElement getNoElement(){
        return element(no);
    }
}
