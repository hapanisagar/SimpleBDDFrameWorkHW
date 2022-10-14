package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RegisterStepDefinations {
    WebDriver driver;
    @Given("^User able to open browser$")
    public void user_able_to_open_browser()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^Enter Url$")
    public void enter_Url() {
        driver.get("https://demo.nopcommerce.com/");

    }

    @Then("^User click on register link$")
    public void user_click_on_register_link() {
        driver.findElement(By.className("ico-register")).click();

    }

    @Then("^User on register page and verify register page title$")
    public void user_on_register_page_and_verify_register_page_title()  {
        String title =driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Register",title);

    }

    @Then("^select gender as male$")
    public void select_gender_as_male()  {
        driver.findElement(By.id("gender-male"));

    }

    @Then("^enter first name and last name$")
    public void enter_first_name_and_last_name() {
        driver.findElement(By.id("FirstName")).sendKeys("Sachin");
        driver.findElement(By.id("LastName")).sendKeys("Tendulker");


    }

    @Then("^enter Date of birth$")
    public void enter_Date_of_birth()  {
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("10");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("March");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1996");


    }

    @Then("^enter email id$")
    public void enter_email_id()  {
        driver.findElement(By.id("Email")).sendKeys("Test123@gmail.com");

    }

    @Then("^enter company detail$")
    public void enter_company_detail(){
        driver.findElement(By.id("Company")).sendKeys("UnifyTestingltd");

    }

    @Then("^Uncheck  in newsletter field box$")
    public void uncheck_in_newsletter_field_box()  {
        driver.findElement(By.id("Newsletter")).click();
;
    }

    @Then("^enter Password$")
    public void enter_Password() {

    }

    @Then("^enter confirm password$")
    public void enter_confirm_password() {
        driver.findElement(By.id("Password")).sendKeys("abc123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("abc123");


    }

    @Then("^click on register button$")
    public void click_on_register_button()  {
        driver.findElement(By.id("register-button")).click();

    }

    @Then("^user able to register succesfully\\.$")
    public void user_able_to_register_succesfully()  {

    }
    @Then("^User close the Browser$")
    public void user_close_the_Browser()  {
        driver.quit();
    }

}
