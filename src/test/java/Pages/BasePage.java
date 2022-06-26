package Pages;

import Methods.Methods;
import com.google.errorprone.annotations.Var;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Methods.Variables;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage extends Methods {

    public By elements = By.xpath("//h5[text()='Elements']");
    public By forms = By.xpath("//h5[text()='Forms']");
    public By alerts = By.xpath("//h5[text()='Alerts, Frame & Windows']");
    public By widgets = By.xpath("//h5[text()='Widgets']");
    public By interactions = By.xpath("//h5[text()='Interactions']");
    public By book = By.xpath("//h5[text()='Book Store Application']");
    public BasePage(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }
    public void goToElements(){
        click(elements);
    }
    public void goToForms(){
        click(forms);
    }
    public void goToAlerts(){
        click(alerts);
    }
    public void goToWidgets(){
        click(widgets);
    }
    public void goToInteractions(){
        click(interactions);
    }
    public void goToBooks(){
        click(book);
    }

}