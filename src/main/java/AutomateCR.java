import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateCR {

    /** Submit a contract request. **/
    public void submitCR002() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("gfs.edelman.com"); // need http address

        if (!driver.getTitle().equals("Homepage")) { // find tab name when logged in
            homepageNotLoggedIn(driver);
        }
    }

    /** Login to GFS if you hit the GFS log in page rather than the automatic redirect. **/
    public void homepageNotLoggedIn(WebDriver driver) {
        ;
    }

}
