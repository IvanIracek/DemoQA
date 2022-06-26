package Test;

import Methods.Methods;
import Pages.Alerts.Alerts;
import Pages.Alerts.BrowserWindows;
import Pages.Alerts.ModalDialogs;
import Pages.BasePage;
import Pages.BookStore.BookStore;
import Pages.BookStore.Login;
import Pages.BookStore.ProfilPage;
import Pages.Elements.*;
import Pages.Forms.PracticeForm;
import Pages.Menu;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;


    public BasePage basePage;
    public TextBox textBox;
    public Menu menu;
    public CheckBox checkBox;
    public RadioButton radioButton;
    public WebTables webTables;
    public Buttons buttons;
    public Methods methods;
    public Links links;
    public BrokenLinksImages brokenLinksImages;
    public UploadDownload uploadDownload;
    public DynamicProperties dynamicProperties;
    public PracticeForm practiceForm;
    public Login login;
    public ProfilPage profilPage;
    public BookStore bookStore;
    public BrowserWindows browserWindows;
    public Alerts alerts;
    public ModalDialogs modalDialogs;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        actions = new Actions(driver);
        methods = new Methods(driver, actions,  wait);

        basePage = new BasePage(driver, actions, wait);
        textBox = new TextBox(driver, actions, wait);
        menu = new Menu(driver, actions, wait);
        checkBox = new CheckBox(driver, actions, wait);
        radioButton = new RadioButton(driver, actions, wait);
        webTables = new WebTables(driver, actions, wait);
        buttons = new Buttons(driver, actions, wait);
        links = new Links(driver, actions, wait);
        brokenLinksImages = new BrokenLinksImages(driver, actions, wait);
        uploadDownload = new UploadDownload(driver, actions, wait);
        dynamicProperties = new DynamicProperties(driver, actions, wait);
        practiceForm = new PracticeForm(driver, actions, wait);
        login = new Login(driver, actions, wait);
        profilPage = new ProfilPage(driver, actions, wait);
        bookStore = new BookStore(driver, actions, wait);
        browserWindows = new BrowserWindows(driver, actions, wait);
        alerts = new Alerts(driver, actions, wait);
        modalDialogs = new ModalDialogs(driver, actions, wait);
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}