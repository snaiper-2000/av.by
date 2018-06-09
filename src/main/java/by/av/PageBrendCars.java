package by.av;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Dimka on 03.06.2018.
 */
public class PageBrendCars {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    @FindBy(css="input[span = FX]")
    WebElement urlPageModelFX;

    /*@FindBy(css = "q")
    WebElement seachInputField;

    @FindBy(css = "input[type = submit]")
    WebElement  seachButton;*/

    public PageBrendCars(WebDriver webDriver){
        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, 30);

        PageFactory.initElements(webDriver, this);
    }

    public int qualityModelToPageBrend(){
        //System.out.println("количество моделей на странице бренда "+webDriver.findElement(By.className("brandslist")).findElements(By.tagName("li")).size());
       return webDriver.findElement(By.className("brandslist")).findElements(By.tagName("li")).size();
    }

    public int qualityCarsToPageBrend(){
        //System.out.println("количество объявлений авто на странице бренда "+webDriver.findElements(By.className("listing-item-body")).size());
        return webDriver.findElements(By.className("listing-item-body")).size();
    }

    /*public void clickAuthorization() {
        webDriver.findElement(By.partialLinkText("Войдите")).click();
    }*/

}
