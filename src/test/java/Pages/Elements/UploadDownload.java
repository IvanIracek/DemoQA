package Pages.Elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class UploadDownload extends Methods {
    public By download = By.id("downloadButton");
    By choseFile = By.id("uploadFile");
    public By message = By.id("uploadedFilePath");

    public UploadDownload(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }
    public void uploadFile() throws IOException {
        WebElement upload = element(choseFile);
        Path tempFile = Files.createTempFile("tempFile",".tmp");
        String fileName = tempFile.toAbsolutePath().toString();
        upload.sendKeys(fileName);
    }
}
