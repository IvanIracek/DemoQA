package Test.Elements;
import Methods.Variables;
import Test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestButtons extends BaseTest {
    @BeforeMethod
    public void goTo(){
        basePage.goToElements();
        menu.clickOnMenuElement(Variables.buttons);
    }

    @Test
    public void testClick() {
        buttons.click();
        if(buttons.getClickMessage().isDisplayed()){
            assert true;
        }
        else{
            assert  false;
        }
    }
    @Test
    public void testRightClick() {
        buttons.rightClick();
        if(buttons.getRightClickMessage().isDisplayed()){
            assert true;
        }
        else{
            assert  false;
        }
    }
    @Test
    public void testDoubleClick() {
        buttons.doubleClick();
        if(buttons.getDoubleClickMessage().isDisplayed()){
            assert true;
        }
        else{
            assert  false;
        }
    }

}
