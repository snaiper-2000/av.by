package test.by.av;

import by.av.Site;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Dimka on 09.06.2018.
 */
public class TestPageUser {
    WebDriver webDriver;
    WebDriverWait webDriverWait;
    private static final String NAMEuSER = "Дмитрий!";
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
        //site.pageUser().chechUserNameOnPageUser();
        Assert.assertEquals(site.pageUser().chechUserNameOnPageUser(), "Дмитрий!");
    }



    @After
    public void endToWebDriver(){
        if(webDriver != null){
            webDriver.quit();
        }
    }
}
