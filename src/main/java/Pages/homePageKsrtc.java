package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageKsrtc {

    private static WebElement element = null;


    public static WebElement arrow(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/main/section/div/div/div[1]/div/div/div/a[2]/span[1]"));
        return element;
    }


    public static WebElement route(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/main/section/div/div/div[1]/div/div/div/div[2]/div/div/ul/li[1]/a"));
        return element;
    }


    public static WebElement departureDate(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[3]/td[4]"));
        return element;
    }


    public static WebElement button_SelectBus(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/main/form/div[1]/div/div[2]/div[3]"));
        return element;
    }



}
