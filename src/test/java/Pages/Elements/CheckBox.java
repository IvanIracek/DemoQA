package Pages.Elements;
import Methods.Variables;
import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class CheckBox extends Methods {
    By expandAll =By.xpath("//button[@title='Expand all']//*[name()='svg']");
    By colapseAll = By.xpath("//button[@title='Collapse all']//*[name()='svg']");
    By checkBox = By.className("rct-checkbox");
    public By result = By.id("result");

    public CheckBox(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }
    public void clickBox(String boxName){
        click(getBoxLocator(boxName));
    }
    public void expand(String boxName){
        WebElement expand = element(with(By.tagName("button")).toLeftOf(By.xpath(String.format("//span[contains(text(),'%s')]", boxName))));
        expand.click();
    }
    public WebElement getBox(String boxName){
        return element(getBoxLocator(boxName));
    }
    public By locator (String boxName){
        return getBoxLocator(boxName);
    }
    public WebElement getCheckBox(String boxName){
        return element(RelativeLocator.with(checkBox).toLeftOf(By.xpath(String.format("//span[contains(text(),'%s')]", boxName))));
    }
    public void clickExpandAll(){
        click(expandAll);
    }
    public void clickColapseAll(){
        click(colapseAll);
    }
    public WebElement result(){
        return element(result);
    }
}
