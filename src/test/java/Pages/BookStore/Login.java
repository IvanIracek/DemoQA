package Pages.BookStore;

import Methods.Methods;
import Methods.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends Methods {
    By userName = By.id("userName");
    By password= By.id("password");
    By login = By.id("login");
    By newUser = By.id("newUser");
    By firstName = By.id("firstname");
    By lastName = By.id("lastname");
    By setUserName = By.id("userName");
    By setPassword = By.id("password");

    public Login(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }
    public void inputUsername(String s){
        sendKeys(userName, s);
    }
    public void inputPassword(String s){
        sendKeys(password, s);
    }
    public void clickSubmit(){
        click(login);
    }
    public void login(){
        inputUsername(Variables.bookstore[2]);
        inputPassword(Variables.bookstore[3]);
        clickSubmit();
    }
}
