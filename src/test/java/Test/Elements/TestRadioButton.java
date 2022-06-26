package Test.Elements;
import Methods.Variables;

import Test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestRadioButton extends BaseTest {

    @BeforeMethod
    public void goTo(){
        basePage.goToElements();
        menu.clickOnMenuElement(Variables.radioButton);
    }

    @Test
    public void testYes() throws InterruptedException {
        radioButton.clickYes();
        Assert.assertEquals(radioButton.message().getText(), "Yes");
    }

    @Test
    public void testImpressive() {
        radioButton.clickImpressive();
        Assert.assertEquals(radioButton.message().getText(), "Impressive");
    }

    @Test
    public void testNo() {
        try{
            radioButton.clickNo();
            wait.until(ExpectedConditions.elementToBeSelected(radioButton.getNoElement()));
            assert false;
        }
        catch (TimeoutException e){
            assert true;
        }
    }
}
