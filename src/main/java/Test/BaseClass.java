package Test;

import Pages.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    static WebDriver driver;
    protected static PageFactory pageFactory;
    public static void setup() {
        driver =new ChromeDriver();
        System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
        driver.navigate().to("https://www.marksandspencer.com/");
        pageFactory= new PageFactory(driver);
    }
}

