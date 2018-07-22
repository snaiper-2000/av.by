package by.av;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Dimka on 09.06.2018.
 */
public class PageAuthorization {
    WebDriver webDriver;
    WebDriverWait webDriverWait;
    Site site;
    private static final String LOGINUSER = "login";
    private static final String PASSWORDUSER = "pass";

    PageAuthorization(WebDriver webDriver){
        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, 30);

        PageFactory.initElements(webDriver, this);
    }

    public void clickAuthorization() {
        webDriver.findElement(By.partialLinkText("Войдите")).click();
    }

    private void inputLogin(){
        webDriver.findElement(By.id("login")).sendKeys(LOGINUSER);
    }

    private void inputPassword(){
        webDriver.findElement(By.id("password")).sendKeys(PASSWORDUSER);
    }

    private void inputNotSaveMe(){
        webDriver.findElement(By.id("remember")).click();
    }

    private void clickButtonAuthorization(){
        webDriver.findElement(By.cssSelector("input[type = 'submit']")).click();
    }

    public void authorizationOnPage(){
        inputLogin();
        inputPassword();
        inputNotSaveMe();
        clickButtonAuthorization();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
