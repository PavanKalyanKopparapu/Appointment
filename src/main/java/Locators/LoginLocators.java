package Locators;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginLocators extends PageObject {

    static WebDriver driver;
    public final String LoginPage = "//div//h2";
    public  final String username = "//input[@id='username']";
    public  final String password = "//input[@id='password']";
    public  final String login = "//button[@id='login']";
    public  final String errorMessage = "//div[@class='alert alert-danger']";
    public  final String alert = "//div[@class='card-body']";
    public  final String homePage = "//a[normalize-space()='Calendar']";

    public final String Customer = "//a[normalize-space()='Customers']";

    public final String Add_Btn = "//button[@id='add-customer']";

    public final String First_name = "//input[@id='first-name']";

    public final String Last_name = "//input[@id='last-name']";

    public final String Email = "//input[@id='email']";

    public final String Phone = "//input[@id='phone-number']";

    public final String Address = "//input[@id='address']";

    public final String City = "//input[@id='city']";

    public final String Zip_code = "//input[@id='zip-code']";

    public final String Language = "//select[@id='language']";

    public final String Language_Select = "//select/option[@value='catalan']";

    public final String TimeZone = "//*[@id='timezone']";

    public final String SelectTime = "//*[@id='timezone']/optgroup[1]/option";

    public void selectTimeZone(){
        Select timezone = new Select(driver.findElement(By.xpath("//select[@id='timezone']")));
        timezone.selectByVisibleText("Adak (-10:00)");
        }

        public final String Note = "//textarea[@id='notes']";
        public final String Save_btn = "//button[@id='save-customer']";
}
