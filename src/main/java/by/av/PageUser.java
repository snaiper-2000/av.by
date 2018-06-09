package by.av;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Dimka on 09.06.2018.
 */
public class PageUser {

    WebDriver webDriver;
    WebDriverWait webDriverWait;
    Site site;

    PageUser(WebDriver webDriver){
        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, 30);
        site = new Site(webDriver);

        PageFactory.initElements(webDriver, this);
    }

    public String chechUserNameOnPageUser(){
        site.pageAuthorization().authorizationOnPage();
        System.out.println("ТЕСТ!!!"+webDriver.findElement(By.className("userarea-desktop")).getText());
        return webDriver.findElement(By.className("userarea-desktop")).getText();
        //webDriver.findElement(By.cssSelector("body > div.page > div.page-content > header > div > div.header-user > div > div > p > span.userarea-desktop > a"));
        //return webDriver.findElement(By.className("userarea-desktop")).findElement(By.tagName("a")).getText();
    }
}
