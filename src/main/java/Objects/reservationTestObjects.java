package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class reservationTestObjects {


    WebDriver driver;

    By routes_Arrow = By.xpath("/html/body/main/section/div/div/div[1]/div/div/div/a[2]/span[1]");

    By select_Route = By.xpath("/html/body/main/section/div/div/div[1]/div/div/div/div[2]/div/div/ul/li[1]/a");

    By departure_Date = By.xpath("/html/body/div[1]/table/tbody/tr[3]/td[4]");

    By selectBus = By.xpath("/html/body/main/form/div[1]/div/div[2]/div[3]");

    By boardingPoint = By.id("Forward-1467550949362");

    By droppingPoint = By.id("Forward-1468044935052");

    By mobileNumber = By.xpath("//*[@id=\"mobileNo\"]");

    By Email = By.xpath("//*[@id=\"email\"]");

    By seatNumber = By.xpath("//*[@id=\"Forward30\"]");

    By passengerArea = By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[8]/div[4]/div/table/tbody/tr/td/div/div[1]/div[2]/div[3]/div/p/a");

    By passengerName = By.name("passengerName");

    By passengerGender = By.name("genderCodeId");

    By passengerAge = By.name("passengerAge");

    By selectConcession = By.name("concessionIds");

    By MakePayment = By.name("PgBtn");


    public reservationTestObjects(WebDriver driver) {

        this.driver = driver;
    }

    public void setSelectRoute() {

        driver.findElement(routes_Arrow).click();

        driver.findElement(select_Route).click();
    }


    public void setDepartureDate() {

        driver.findElement(departure_Date).click();
    }


    public void button_SelectBus() {

        driver.findElement(selectBus).click();
    }


    public void setSelectSeat() throws InterruptedException {

        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('SrvcSelectBtnForward3').click()");
    }


    public void set_BoardingPoint() {

        driver.findElement(boardingPoint).click();
    }


    public void set_DroppingPoint() {

        driver.findElement(droppingPoint).click();
    }


    public void set_MobileNumber(String Number) {

        driver.findElement(mobileNumber).sendKeys(Number);
    }


    public void set_Email(String Mail) {

        driver.findElement(Email).sendKeys(Mail);
    }


    public void set_SeatNumber() {

        driver.findElement(seatNumber).click();
    }


    public void passengerSquare() {

        driver.findElement(passengerArea).click();
    }


    public void set_PassengerName(String Name) {

        driver.findElement(passengerName).sendKeys(Name);
    }


    public void set_passengerGender() {

        WebElement dropdown = driver.findElement(passengerGender);
        Select Gender = new Select(dropdown);

        Gender.selectByVisibleText("MALE");
    }


    public void set_PassengerAge(String Age) {

        driver.findElement(passengerAge).sendKeys(Age);
    }


    public void setConcession() {

        WebElement dropdown1 = driver.findElement(selectConcession);
        Select Concession = new Select(dropdown1);

        Concession.selectByVisibleText("GENERAL PUBLIC");
    }


    public void button_MakePayment() {

        driver.findElement(MakePayment).click();
    }



}
