package test.by.av;
import by.av.Site;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Dimka on 03.06.2018.
 */
public class TestPageBrendCars {

    WebDriver webDriver;
    WebDriverWait webDriverWait;
    private static final int QUANTITYmODELiNFINITY = 12;
    private static final int QUANTITYcARiNFINITYoNpAGE = 25;
    Site site;

    @Before
    public void connectToUrl(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\snaip\\Desktop\\geckodriver.exe");
        webDriver = new FirefoxDriver();
        webDriverWait = new WebDriverWait(webDriver,30,500);
        webDriver.get("https://cars.av.by/infiniti");
        site = new Site(webDriver);
    }

    @Ignore
    @Test
    public void checkUrlPageBrend(){
        //webDriverWait.until(ExpectedConditions.stalenessOf(webDriver.findElement(By.className("brandslist"))));
        Assert.assertEquals("https://cars.av.by/infiniti",webDriver.getCurrentUrl());
    }
    @Ignore
    @Test
    public void checkQuantityModel(){
        Assert.assertTrue(site.pageBrendCars().qualityModelToPageBrend() == QUANTITYmODELiNFINITY);
        //webDriver.findElements(By.className("brandslist"));
    }
    @Ignore
    @Test
    public void checkQuantityCarOnPage(){
        Assert.assertTrue(site.pageBrendCars().qualityCarsToPageBrend() == QUANTITYcARiNFINITYoNpAGE);
    }
    /*@Test
    public void checkUrlPageAuthorization(){
        //webDriver.findElement(By.cssSelector("body > div.page > div.page-content > header > div > div.header-user > div > div > p > a:nth-child(2)")).click();
        //webDriver.findElement(By.cssSelector("input [a = Войдите]")).click();
        webDriver.findElement(By.partialLinkText("Войдите")).click();
        System.out.println("!!! ПРОВЕРКА  "+webDriver.getCurrentUrl());
        //body > div.page > div.page-content > header > div > div.header-user > div > div > p > a:nth-child(2)
        //site.pageAuthorization().authorizationOnSite();
        //Assert.assertEquals(webDriver.getCurrentUrl(),"https://av.by/login");
    }*/

    @After
    public void endToWebDriver(){
        if(webDriver != null){
            webDriver.quit();
        }
    }
}
