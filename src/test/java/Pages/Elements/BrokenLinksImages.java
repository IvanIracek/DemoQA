package Pages.Elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksImages extends Methods {
    By validImage = By.xpath("(//img[@src='/images/Toolsqa.jpg'])[2]");
    By brokenImage = By.xpath("//img[@src='/images/Toolsqa_1.jpg']");
    By validLink = By.linkText("Click Here for Valid Link");
    By brokenLink = By.linkText("Click Here for Broken Link");

    public BrokenLinksImages(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }

    public String getValidImage(){
        return element(validImage).getAttribute("src");
    }
    public String getBrokenImage(){
        return element(brokenImage).getAttribute("src");
    }
    public void clickValidLink(){
        click(validLink);
    }
    public void clickBrokenLink(){
        click(brokenLink);
    }
}
