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

    PageAuthorization(WebDriver webDriver){
        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, 30);

        PageFactory.initElements(webDriver, this);
    }

    public void clickAuthorization() {
        webDriver.findElement(By.partialLinkText("Войдите")).click();
    }

    private void inputLogin(){
        webDriver.findElement(By.id("login")).sendKeys("snaiper-2000@mail.ru");
    }

    private void inputPassword(){
        webDriver.findElement(By.id("password")).sendKeys("KH17008042016");
    }

    private void inputNotSaveMe(){
        webDriver.findElement(By.id("remember")).click();
    }

    private void clickButtonAuthorization(){
        //webDriver.findElement(By.name("Submit")).click();
        webDriver.findElement(By.cssSelector("input[type = 'submit']")).click();
    }

    public void authorizationOnPage(){
        inputLogin();
        inputPassword();
        inputNotSaveMe();
        clickButtonAuthorization();
    }

}
