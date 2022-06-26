package Methods;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Methods {
    public WebDriver driver;
    public Actions actions;
    public WebDriverWait wait;

    public Methods(WebDriver driver, Actions actions,WebDriverWait wait) {
        this.driver = driver;
        this.actions = actions;
        this.wait = wait;
    }

    public WebElement element(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public List<WebElement> elements(By locator){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
    public void sendKeys(By locator, String s){
        element(locator).sendKeys(s);
    }
    public void click(By locator){
        element(locator).click();
    }
    public void clickIndex(By locator, int index){
        elements(locator).get(index).click();
    }
    public String getText(By locator){return element(locator).getText();
    }
    public String getValue(By locator){
        return element(locator).getAttribute("value");
    }
    public void javaExecutorScroll(By locator){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", element(locator));
    }
    public By getBoxLocator(String box){
        return By.xpath(String.format("//span[contains(text(),'%s')]", box));
    }
    public int getFromlist(String[] items, String element){
        return ArrayUtils.indexOf(items, element);
    }
}