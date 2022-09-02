package Pages;

import Test.BaseClass;
import Test.MenuClass;
import org.openqa.selenium.WebDriver;

public class PageFactory {
    static WebDriver driver;
    private static MenuClass menuClass;

    private static BaseClass baseClass;
    private static Menu hover;
    public PageFactory(WebDriver driver){

        this.driver =driver;
    }
    public MenuClass menuClass(){
        if(menuClass == null){
            menuClass =new MenuClass(driver);
        }
        return menuClass;
    }
    public Menu gethover(){
        if(hover == null){
            hover =new Menu(driver);
        }
        return hover;
    }
}
