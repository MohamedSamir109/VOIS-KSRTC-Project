package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selectSeatPage {

    private static WebElement element = null;

    public static WebElement button_SelectSeat(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[8]/div[1]/div[1]"));
        return element;
    }


    public static WebElement boardingPoint(WebDriver driver){

        element = driver.findElement(By.id("Forward-1467550949362"));
        return element;
    }


    public static WebElement dropping_point(WebDriver driver){

        element = driver.findElement(By.id("Forward-1468044935052"));
        return element;
    }


    public static WebElement textBox_Mobile(WebDriver driver){

        element = driver.findElement(By.name("mobileNo"));
        return element;
    }


    public static WebElement textBox_Email(WebDriver driver){

        element = driver.findElement(By.name("email"));
        return element;
    }


    public static WebElement selectSeat(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"Forward30\"]"));
        return element;
    }


    public static WebElement passengerData(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[8]/div[4]/div/table/tbody/tr/td/div/div[1]/div[2]/div[3]/div/p/a"));
        return element;
    }


    public static WebElement textBox_Name(WebDriver driver){

        element = driver.findElement(By.name("passengerName"));
        return element;
    }


    public static WebElement select_GenderList(WebDriver driver){

        element = driver.findElement(By.name("genderCodeId"));
        return element;
    }


    public static WebElement textBox_Age(WebDriver driver){

        element = driver.findElement(By.name("passengerAge"));
        return element;
    }


    public static WebElement select_ConcessionList(WebDriver driver){

        element = driver.findElement(By.name("concessionIds"));
        return element;
    }



    public static WebElement button_MakePayment(WebDriver driver){

        element = driver.findElement(By.name("PgBtn"));
        return element;
    }


}
