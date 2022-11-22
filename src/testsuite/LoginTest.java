package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/ ";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully()  {

        {
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();
            // clickElement(By.linkText("log in "));
            String expectedMessage = "Welcome, Please Sign In!";
        }
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']"));
        String actualMessage = actualTextMessageElement.getText();

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("vimalpankhaniya2016@gmail.com");

        // Find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Champ2121@");

        // Find the login button click on it
        WebElement loginButton = driver.findElement(By.xpath("//a[text()='Log in']"));
        loginButton.click();

        WebElement logoutButton = driver.findElement(By.xpath(" "));
        logoutButton.click();

    }

     @Test
    public void verifyTheErrorMessage(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("test122@hotmail.co.uk");

        // Find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("vgdfkgjfjgd");

        // Find the login button click on it
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();



    }
    public void closeBrowser(){
        driver.quit();
}}


