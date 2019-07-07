package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static WebElement element = null;

    public static WebElement username(WebDriver driver) {
        element = driver.findElement(By.id("edit-name"));
        return element;
    }

    public static WebElement password(WebDriver driver) {
        element = driver.findElement(By.id("edit-pass"));
        return element;
    }

    public static WebElement loginButton(WebDriver driver) {
        element = driver.findElement(By.id("edit-submit"));
        return element;
    }

    public static WebElement logoutButton(WebDriver driver) {
        element = driver.findElement(By.linkText("Log out"));
        return element;
    }

    public static WebElement loginMessageStatus(WebDriver driver) {
        element = driver.findElement(By.className("messages"));
        return element;
    }

}
