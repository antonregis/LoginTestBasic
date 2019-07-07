package LoginTestBasic;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestBasic {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:/Automation/Libraries/Selenium/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://antonregis.com/user";

        // Successful login test
        performLogin(driver,"validUser", "1234567890", baseURL);
        String successfulLoginStatus = LoginPage.loginMessageStatus(driver).getText();
        System.out.println("CAPTURED SUCCESSFUL MESSAGE: \n" + successfulLoginStatus);
        Thread.sleep(5000);
        LoginPage.logoutButton(driver).click();

        // Failed login test
        performLogin(driver,"invalidUsername", "password", baseURL);
        String failedLoginStatus = LoginPage.loginMessageStatus(driver).getText();
        System.out.println("\nCAPTURED FAILED MESSAGE: \n" + failedLoginStatus);

        // Closing browser
        Thread.sleep(5000);
        driver.quit();

    }

    public static void performLogin(WebDriver driver, String username, String password, String baseURL) {
        driver.get(baseURL);
        LoginPage.username(driver).sendKeys(username);
        LoginPage.password(driver).sendKeys(password);
        LoginPage.loginButton(driver).click();
    }

}


