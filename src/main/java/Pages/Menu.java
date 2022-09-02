package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static Pages.PageFactory.driver;

public class Menu {
    public Menu(WebDriver driver) {
    }

    public static void hover(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("SC_Level_1_1_menu")));
    }
}
