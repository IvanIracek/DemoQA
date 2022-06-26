package Test;

import Methods.Variables;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBasePage extends BaseTest {

    @Test
    public void testElements() {
        basePage.goToElements();
        Assert.assertTrue(driver.getCurrentUrl().equals(Variables.elementsUrl));
    }
    @Test
    public void testForms() {
        basePage.goToForms();
        Assert.assertTrue(driver.getCurrentUrl().equals(Variables.formsUrl));
    }
    @Test
    public void testAlerts() {
        basePage.goToAlerts();
        Assert.assertTrue(driver.getCurrentUrl().equals(Variables.alertsUrl));
    }
    @Test
    public void testWidgets() {
        basePage.goToWidgets();
        Assert.assertTrue(driver.getCurrentUrl().equals(Variables.widgetUrl));
    }
    @Test
    public void testInteractions() {
        basePage.goToInteractions();
        Assert.assertTrue(driver.getCurrentUrl().equals(Variables.intractionsUrl));
    }
    @Test
    public void testBook() {
        methods.javaExecutorScroll(basePage.book);
        basePage.goToBooks();
        Assert.assertTrue(driver.getCurrentUrl().equals(Variables.bookUrl));
    }
}