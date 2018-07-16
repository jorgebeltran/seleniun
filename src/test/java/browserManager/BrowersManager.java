package browserManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowersManager {
    public static WebDriver driver;

    public  static  WebDriver getDriver(){
        if(driver==null){
            System.setProperty("webdriver.crhome.driver", "/usr/local/bin/chromedriver");
            driver =new ChromeDriver();
        }
        return driver;
    }
}
