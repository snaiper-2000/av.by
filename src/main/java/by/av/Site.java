package by.av;

import org.openqa.selenium.WebDriver;

/**
 * Created by Dimka on 09.06.2018.
 */
public class Site {
    WebDriver webDriver;

    public Site(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public PageBrendCars pageBrendCars(){
        return new PageBrendCars(webDriver);
    }

    public PageAuthorization pageAuthorization() {return new PageAuthorization(webDriver);}

    public PageUser pageUser() {return new PageUser(webDriver);}
}
