package test.by.av;

import by.av.Site;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Dimka on 09.06.2018.
 */
public class TestPageAuthorization {

    WebDriver webDriver;
    WebDriverWait webDriverWait;
    private static final String URLPAGELOGIN = "https://av.by/login";
    private static final String URLPAGEUSER = "https://cars.av.by/user/mylist";
    Site site;

    @Before
    public void connectToUrl(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\snaip\\Desktop\\geckodriver.exe");
        webDriver = new FirefoxDriver();
        webDriverWait = new WebDriverWait(webDriver,30,500);
        webDriver.get("https://cars.av.by/infiniti");
        site = new Site(webDriver);
    }

    @Test
    public void checkUrlPageAuthorization(){
        site.pageAuthorization().authorizationOnPage();
        System.out.println("!!!Проверка "+webDriver.getCurrentUrl());
        Assert.assertEquals(webDriver.getCurrentUrl(), URLPAGELOGIN);
    }
    @Ignore
    @Test
    public void checkUrlPageAfterAuthorization(){
        site.pageAuthorization().clickAuthorization();
        site.pageAuthorization().authorizationOnPage();
        //System.out.println("ТЕСТ!!!!"+webDriver.getCurrentUrl());
        Assert.assertEquals(webDriver.getCurrentUrl(), URLPAGEUSER);
    }

    @After
    public void endToWebDriver(){
        if(webDriver != null){
            webDriver.quit();
        }
    }
}
