package Test.Elements;
import Methods.Variables;
import Test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLinks extends BaseTest{
    @BeforeMethod
    public void goTo(){
        basePage.goToElements();
        menu.clickOnMenuElement(Variables.links);
    }

    @Test
    public void testHomeTab() throws InterruptedException {
        links.clickHome();
        links.clickHome2();
        Assert.assertTrue(driver.getWindowHandles().size() == 3);
    }

    @Test
    public void testCreated() {
        links.clickCreated();
        Assert.assertEquals(links.getMessage(), "201");
    }

    @Test
    public void testNoContent() {
        links.clickNoContent();
        Assert.assertEquals(links.getMessage(), "204");
    }

    @Test
    public void testMoved() {
        links.clickMoved();
        Assert.assertEquals(links.getMessage(), "301");
    }

    @Test
    public void testBadRequest() {
        links.clickBadRequest();
        Assert.assertEquals(links.getMessage(), "400");
    }

    @Test
    public void testUnauthorized() {
        links.clickUnauthorized();
        Assert.assertEquals(links.getMessage(), "401");
    }

    @Test
    public void testForbiden() {
        links.clickForbidden();
        Assert.assertEquals(links.getMessage(), "403");
    }

    @Test
    public void testNotFound() {
        links.clickNotFound();
        Assert.assertEquals(links.getMessage(), "404");
    }
}
