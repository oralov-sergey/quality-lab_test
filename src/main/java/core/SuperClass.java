package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.MailAccountPage;
import pageObject.MailRuPage;
import pageObject.NewEmailPage;

public class SuperClass {

    private static final int TIME_OUT_IN_SECONDS = 10;
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    public ActionsOnThePage actionsOnThePage;
    public MailRuPage mailRuPage;
    public MailAccountPage mailAccountPage;
    public NewEmailPage newEmailPage;

    @Before
    public void startWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, TIME_OUT_IN_SECONDS);
        this.actionsOnThePage = new ActionsOnThePage();
        this.mailRuPage = new MailRuPage();
        this.mailAccountPage = new MailAccountPage();
        this.newEmailPage = new NewEmailPage();
    }

    @After
    public void quiteDriver() {
        driver.quit();
    }
}
