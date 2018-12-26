package company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ProUtil;
import utils.TestBase;

public class BasePage extends TestBase {
    protected WebDriver driver;
    private By signInButton = By.linkText("Sign in");

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

//    public SignInPage clickSignInBtn() {
//        System.out.println("clicking on sign in button");
//        WebElement signInBtnElement = driver.findElement(signInButton);
//        if (signInBtnElement.isDisplayed() || signInBtnElement.isEnabled())
//            signInBtnElement.click();
//        else
//            System.out.println("Element not found");
//        return new SignInPage(driver);
//    }

    public void clickImagesLink() {
        // It should have a logic to click on images link
        // And it should navigate to google images page
    }

    public String getPageTitle() {
        String title = driver.getTitle();
        return title;
    }

    public boolean verifyBasePageTitle() {
        // String expectedPageTitle = "Google";
        String filePath = System.getProperty("user.dir") + "/src/test/java/configs/dataFile.properties";

        ProUtil prop = new ProUtil(filePath);
        String expectedPageTitle = prop.getProFileValue("exceptedPageTitle");
        return getPageTitle().contains(expectedPageTitle);
    }
}