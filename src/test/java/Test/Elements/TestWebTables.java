package Test.Elements;
import Methods.Variables;
import Test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWebTables extends BaseTest {
    @BeforeMethod
    public void goTo(){
        basePage.goToElements();
        menu.clickOnMenuElement(Variables.webTables);
    }

    @Test
    public void testDelete() throws InterruptedException {
        int initialRowNumber = webTables.getRows().size();
        webTables.deleteRecord(0);
        Assert.assertNotEquals(webTables.getRows(), initialRowNumber);
    }

    @Test
    public void testEdit() throws InterruptedException {
        String initailName = webTables.getName(0);
        String initailLastName = webTables.getLastName(0);
        webTables.clickEdit(0);
        webTables.clearFirstName();
        webTables.sendFirstName(Variables.information[0]);
        webTables.clearLastName();
        webTables.sendLastName(Variables.information[1]);
        webTables.clearEmail();
        webTables.sendEmail(Variables.information[2]);
        webTables.clearAge();
        webTables.sendAge(Variables.information[3]);
        webTables.clearSalary();
        webTables.sendSalary(Variables.information[4]);
        webTables.clearDepartment();
        webTables.sendDepartment(Variables.information[5]);
        webTables.clickSubmit();
        Assert.assertNotEquals(webTables.getName(0), initailName);
        Assert.assertNotEquals(webTables.getLastName(0), initailLastName);
    }

    @Test
    public void testAdd() throws InterruptedException {
        int initialSize = webTables.getRows().size();
        webTables.clickAdd();
        webTables.sendFirstName(Variables.information[0]);
        webTables.sendLastName(Variables.information[1]);
        webTables.sendEmail(Variables.information[2]);
        webTables.sendAge(Variables.information[3]);
        webTables.sendSalary(Variables.information[4]);
        webTables.sendDepartment(Variables.information[5]);
        webTables.clickSubmit();
        Assert.assertNotEquals(webTables.getRows().size(), initialSize);
    }
}
