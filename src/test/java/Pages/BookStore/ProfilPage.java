package Pages.BookStore;


import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ProfilPage extends Methods {
    By rows = By.className("rt-tr-group");
    By logOut = By.xpath("//div[@class='text-right col-md-5 col-sm-12']//button[@id='submit']");
    By goToBookStore = By.id("gotoStore");
    By deleteAcount = By.xpath("//div[@class='text-center button']//button[@id='submit']");
    By deleteAllBooks = By.xpath("//div[@class='text-right button di']//button[@id='submit']");
    By search = By.id("searchBox");
    By ok = By.id("closeSmallModal-ok");

    public ProfilPage(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }

    public void clickBookStore(){
        click(goToBookStore);
    }
    public void clickDeleteAcout(){
        click(deleteAcount);
    }
    public void clickDeleteAllBooks(){
        click(deleteAllBooks);
    }
    public List<WebElement> getRowElements(){
        List<WebElement>ro1 = new ArrayList<>();
        for(WebElement e : elements(rows)){
            if(e.getText().isBlank()){
                continue;
            }
            else ro1.add(e);
        }
        return ro1;
    }
    public String getTitle(int i){
        String[] li = getRowElements().get(i).getText().split("\n");
        return li[0];
    }
    public void clikOk(){
        click(ok);
    }
}