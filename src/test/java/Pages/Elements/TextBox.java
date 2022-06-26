package Pages.Elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox extends Methods {

    public By fullName = By.id("userName");
    public By email = By.id("userEmail");
    public By currentAdress = By.id("currentAddress");
    public By permanentAdress = By.id("permanentAddress");
    public By submit = By.id("submit");

    public By confirmationBox = By.xpath("//div[@class='border col-md-12 col-sm-12']");

    public TextBox(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }
    public void enterFullName(String s){
        sendKeys(fullName, s);
    }
    public String getFullNameValue(){
        return getValue(fullName);
    }
    public void enterEmail(String s){
        sendKeys(email, s);
    }
    public WebElement getEmailElement(){
       return element(email);
    }
    public String getEmailValue(){
        return getValue(email);
    }
    public void enterCurrentAdress(String s){
        sendKeys(currentAdress, s);
    }
    public String getCurrentAdressValue(){
        return getValue(currentAdress);
    }
    public void enterPermanentAdress(String s){
        sendKeys(permanentAdress, s);
    }
    public String getPermanentAdress(){
        return getValue(permanentAdress);
    }
    public void clickSubmit(){
        click(submit);
    }
    public WebElement getSubmitButton(){
       return element(submit);
    }
    public WebElement getConfirmationBox(){
        return driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']"));
    }
}