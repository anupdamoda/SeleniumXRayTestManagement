package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import utility.BrowserDriver;
import io.qameta.allure.Allure;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class HomePage extends BrowserDriver {

    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_link_LinkText = "Sign In Portal";
    public static String onlineProductsPage_link_LinkText = "Online Products";

    public static void click_hamburger_menu() throws InterruptedException, MalformedURLException {
        ChromeOptions options = new ChromeOptions();

        WebDriverManager.chromedriver().setup();
        driver = new RemoteWebDriver(new URL("http://selenium:4444/wd/hub"), options);
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();

    }

    public static void click_signIn_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(signIn_link_LinkText)).click();
    }

    public static void click_OnlineProducts_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(onlineProductsPage_link_LinkText)).click();
    }

}
