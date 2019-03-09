import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("http://google.com");        // Opening the stated URL
	System.out.println(driver.getTitle());  // Validating page title
	
	System.out.println(driver.getCurrentUrl()); // Validating the correct URL
    //System.out.println(driver.getPageSource()); // Print Page Source
    driver.get("http:/yahoo.com");
    driver.navigate().back();
    driver.navigate().forward();
    driver.close();
    driver.quit();
    
}
}
