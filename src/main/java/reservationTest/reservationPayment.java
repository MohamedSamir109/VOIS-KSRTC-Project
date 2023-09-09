package reservationTest;

import Objects.reservationTestObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import passengerData.PassengerDataSheet;

import java.time.Duration;

public class reservationPayment {

    static WebDriver driver = null;

    static reservationTestObjects resobj = null;

    static PassengerDataSheet data1 = null;


    @Given("The user is on the home page")
    public void the_user_is_on_the_home_page() {

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().setSize(new Dimension(1024,768));

        resobj = new reservationTestObjects(driver);

        String projectPath = System.getProperty("user.dir");
        data1 = new PassengerDataSheet(projectPath + "/Data/PassengerData.xlsx", "Sheet1");

        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");

    }

    @When("Select the desired trip route")
    public void select_the_desired_trip_route() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(50,300)");

        resobj.setSelectRoute();
    }

    @And("Select the Departure data")
    public void select_the_departure_data() {

        resobj.setDepartureDate();
    }

    @And("Press search for bus button")
    public void press_search_for_bus_button() {

        resobj.button_SelectBus();
    }

    @And("Select the desired seats")
    public void select_the_desired_seats() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(100,1000)");

        resobj.setSelectSeat();
    }

    @And("Define the boarding point")
    public void define_the_boarding_point() {

        resobj.set_BoardingPoint();
    }

    @And("Define the dropping point")
    public void define_the_dropping_point() {

        resobj.set_DroppingPoint();
    }

    @And("Enter mobile number")
    public void enter_mobile_number() {

        String input1 = data1.getCellData3(1,1);
        resobj.set_MobileNumber(input1);
    }

    @And("Enter Email")
    public void enter_email() {

        String input2 = data1.getCellData2(1,2);
        resobj.set_Email(input2);
    }

    @And("Select the seat number")
    public void select_the_seat_number(){

        resobj.set_SeatNumber();
    }

    @And("Press the arrow for more details")
    public void press_the_arrow_for_more_details() {

        resobj.passengerSquare();
    }

    @And("Enter the name")
    public void enter_the_name() {

        String input3 = data1.getCellData2(1,0);
        resobj.set_PassengerName(input3);
    }

    @And("Select gender from list")
    public void select_gender_from_list() {

        resobj.set_passengerGender();
    }

    @And("Enter age")
    public void enter_age() {

        String input4 = data1.getCellData3(1,3);
        resobj.set_PassengerAge(input4);
    }

    @And("Select concession from list")
    public void select_concession_from_list() {

        resobj.setConcession();
    }

    @When("Close the browser")
    public void close_the_browser() {

        driver.close();

        try {
            driver.quit();
        } catch (Exception ex1){
            System.out.println(ex1);
        }
    }

}
