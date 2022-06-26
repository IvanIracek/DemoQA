package Pages.Elements;


import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Links extends Methods {
    By home =By.id("simpleLink");
    By home2 = By.id("dynamicLink");
    By created = By.id("created");
    By noContent = By.id("no-content");
    By moved = By.id("moved");
    By badRequest = By.id("bad-request");
    By unauthorized = By.id("unauthorized");
    By forbidden = By.id("forbidden");
    By notFound = By.id("invalid-url");
    By message = By.xpath("//p[@id='linkResponse']/*[1]");

    public Links(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }
    public String getMessage(){
        return element(message).getText();
    }

    public void clickHome(){
        click(home);
    }
    public void clickHome2(){
        click(home2);
    }
    public void clickCreated(){
        click(created);
    }
    public void clickNoContent(){
        click(noContent);
    }
    public void clickMoved(){
        click(moved);
    }
    public void clickBadRequest(){
        click(badRequest);
    }
    public void clickUnauthorized(){
        click(unauthorized);
    }
    public void clickForbidden(){
        click(forbidden);
    }
    public void clickNotFound(){
        click(notFound);
    }
}
