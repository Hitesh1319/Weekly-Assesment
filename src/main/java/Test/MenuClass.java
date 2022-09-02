package Test;

import org.openqa.selenium.WebDriver;

import static Pages.Menu.hover;

public class MenuClass extends BaseClass{
    public MenuClass(WebDriver driver) {
        super();
    }

    public static void main(String[]args){
        setup();
        hover();
    }
}