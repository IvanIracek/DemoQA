package Test.Elements;
import Methods.Variables;
import Pages.Menu;
import Test.BaseTest;
import com.google.errorprone.annotations.Var;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTextBox extends BaseTest {

    @BeforeMethod
    public void goTo(){
        basePage.goToElements();
        menu.clickOnMenuElement(Variables.textBox);
    }

    @Test
    public void testVerifyTextBox() {

        Assert.assertTrue(driver.getCurrentUrl().equals(Variables.textBoxUrl));
    }

    @Test
    public void testVerifyIfFullNameIsEntered() {
        textBox.enterFullName(Variables.fullName);
        Assert.assertTrue(textBox.getFullNameValue().equals(Variables.fullName));
    }

    @Test
    public void testVerifyIfEmailIsEntered() {
        textBox.enterEmail(Variables.email);
        System.out.println(textBox.getEmailValue());
        Assert.assertTrue(textBox.getEmailValue().equals(Variables.email));
    }

    @Test
    public void testVerifyIfCurrentAdressIsEntered() {
        textBox.enterCurrentAdress(Variables.currentAdress);
        Assert.assertTrue(textBox.getCurrentAdressValue().equals(Variables.currentAdress));
    }

    @Test
    public void testVerifyPermanenetAddress() {
        textBox.enterPermanentAdress(Variables.premanentAdress);
        Assert.assertTrue(textBox.getPermanentAdress().equals(Variables.premanentAdress));
    }

    @Test
    public void testButonIfClickable() {
        try{
            wait.until(ExpectedConditions.elementToBeClickable(textBox.getEmailElement()));
            assert true;
        }
        catch (NoSuchElementException e){
            assert false;
        }
    }

    @Test
    public void testHappyFlow() {
        textBox.enterFullName(Variables.fullName);
        textBox.enterEmail(Variables.email);
        textBox.enterCurrentAdress(Variables.currentAdress);
        textBox.enterPermanentAdress(Variables.premanentAdress);
        textBox.clickSubmit();

        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(textBox.confirmationBox));
            assert true;
        }
        catch (NoSuchElementException e){
            assert false;
        }
        //document.querySelector('.body-height').style.height = "200vh"
    }
}
