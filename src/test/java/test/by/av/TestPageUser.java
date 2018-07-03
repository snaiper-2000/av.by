package test.by.av;

import by.av.Site;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPageUser {
    WebDriver webDriver;
    WebDriverWait webDriverWait;
    private static final String NAME_USER = "Дмитрий!";
    Site site;

    @Before
    public void connectToUrl(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\snaip\\Desktop\\geckodriver.exe");
        webDriver = new FirefoxDriver();
        webDriverWait = new WebDriverWait(webDriver,30,500);
        webDriver.get("https://av.by/login");
        site = new Site(webDriver);
    }

    @Test
    public void checkUrlPageAuthorization(){
        Assert.assertEquals(site.pageUser().chechUserNameOnPageUser(), NAME_USER);
    }



    @After
    public void endToWebDriver(){
        if(webDriver != null){
            webDriver.quit();
        }
    }
}
