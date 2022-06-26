package Test.Forms;
import Methods.Variables;
import Test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestPracticeForm extends BaseTest {
    @BeforeMethod
    public void goTo(){
        basePage.goToForms();
        menu.clickOnMenuElement(Variables.practiceForm);
    }

    @Test
    public void testName() {
        practiceForm.inputFirstName(Variables.formInformation[0]);
        Assert.assertEquals(practiceForm.getFirstNameValue(), (Variables.formInformation[0]));;
    }

    @Test
    public void testDate() throws InterruptedException {
        String datePicked = "12 ".concat("Feb ").concat("1995");
        practiceForm.datePick("12",2,"1995");
        Assert.assertEquals(practiceForm.dateValue(), datePicked);
    }

    @Test
    public void testHappyFlow() throws IOException, InterruptedException {
        practiceForm.inputFirstName(Variables.formInformation[0]);
        practiceForm.inputLastName(Variables.formInformation[1]);
        practiceForm.inputEmail(Variables.formInformation[2]);
        practiceForm.clickGender(1);
        practiceForm.inputMobile(Variables.formInformation[3]);
        practiceForm.datePick("12",2,"1995");
        practiceForm.inputSubject(Variables.formInformation[4]);
        practiceForm.clickHobbies(2);
        practiceForm.inputCurrentAddress(Variables.formInformation[5]);
        practiceForm.selectCityState();
        practiceForm.clickSubmit();
        Assert.assertEquals(practiceForm.getRows(), practiceForm.initalList());
    }
}
