package Test.Elements;
import Methods.Variables;
import Test.BaseTest;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.Time;

public class TestUploadDownload extends BaseTest {
    @BeforeMethod
    public void goTo(){
        basePage.goToElements();
        menu.clickOnMenuElement(Variables.uploadAndDownload);
    }

    @Test
    public void testUpload() throws IOException {
        uploadDownload.uploadFile();
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(uploadDownload.message));
            assert true;
        }
        catch (TimeoutException e){
            assert false;
        }
    }

    @Test
    public void testDownload() {
        try{
            wait.until(ExpectedConditions.elementToBeClickable(uploadDownload.download));
            assert true;
        }
        catch (TimeoutException e){
            assert false;
        }
    }
}
