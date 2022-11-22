package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);}

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully()  throws InterruptedException {
        Thread.sleep(7);
        clickOnElement(By.linkText("Register"));
        String expectedM = "Register";
        Assert.assertEquals(expectedM, getTextFromElement(By.xpath("//div[@class='header-links']//a[contains(text(),'Register')]")));
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        clickOnElement(By.linkText("Register"));
        clickOnElement(By.className("forcheckbox"));
        sendTextToElement(By.id("FirstName"), "Vimal");
        sendTextToElement(By.id("LastName"), "Pan");
        String expectedM = "Register";
        Assert.assertEquals(expectedM, getTextFromElement(By.xpath("//h1[contains(text(),'Register')]")));
        sendTextToElement(By.name("DateOfBirthDay"),"1");
        sendTextToElement(By.name("DateOfBirthMonth"),"09");
        sendTextToElement(By.name("DateOfBirthYear"),"1989");
        sendTextToElement(By.id("Email"),"vimal@gmail.com");
        sendTextToElement(By.id("Company"),"Champ");
        clickOnElement(By.id("Newsletter"));
        sendTextToElement(By.id("Password"),"come123");
        sendTextToElement(By.id("ConfirmPassword"),"come123");
        clickOnElement(By.id("register-button"));
        String expectM1="Your registration completed";
        Assert.assertEquals(expectM1,getTextFromElement(By.xpath(" //div[@class='page-body']//div[contains(text(),'Your registration completed')]")));


    }
}



