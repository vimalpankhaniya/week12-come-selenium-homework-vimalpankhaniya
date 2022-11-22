package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNevigatetocomputerPageSuccessfully() {
        WebElement computersTab = driver.findElement(By.linkText("Computers"));
        computersTab.click();

        String expectedMessage = "Computers";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']"));
        String actualMessage = actualTextMessageElement.getText();

        Assert.assertEquals("userShouldNevigatetocomputerPageSuccessfully", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        WebElement ElectronicsTab = driver.findElement(By.linkText("Electronics"));
        ElectronicsTab.click();

        String expectedMessage = "Electronics";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[text()='Electronics '][1]"));
        String actualMessage = actualTextMessageElement.getText();

        Assert.assertEquals("userShouldNavigateToElectronicsPageSuccessfully", expectedMessage, actualMessage);
    }


    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull() {
        WebElement DigitalDownloadsTab = driver.findElement(By.linkText("DigitalDownloads"));
        DigitalDownloadsTab.click();

        String expectedMessage = "DigitalDownloads";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[text()='DigitalDownloads '][1]"));
        String actualMessage = actualTextMessageElement.getText();


        Assert.assertEquals("userShouldNavigateToDigitalDownloadsPageSuccessfull", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfull() {
        WebElement BooksTab = driver.findElement(By.linkText("Books"));
        BooksTab.click();

        String expectedMessage = "Books";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[text()='Books'][1]"));
        String actualMessage = actualTextMessageElement.getText();


        Assert.assertEquals("userShouldNavigateToBooksPageSuccessfull", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        WebElement JewelryTab = driver.findElement(By.linkText("Jewelry"));
        JewelryTab.click();

        String expectedMessage = "Jewelry";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[text()='Jewelry'][1]"));
        String actualMessage = actualTextMessageElement.getText();


        Assert.assertEquals("userShouldNavigateToJewelryPageSuccessfully", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        WebElement GiftCardsTab = driver.findElement(By.linkText("Gift Cards"));
        GiftCardsTab.click();

        String expectedMessage = "Gift Cards";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("(//a[text()'Gift Cards'])[1]"));
        String actualMessage = actualTextMessageElement.getText();


        Assert.assertEquals("userShouldNavigateToGiftCardsPageSuccessfull", expectedMessage, actualMessage);
    }
    public void closeBrowser(){
        driver.quit();
}}
