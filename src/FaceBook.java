

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	
		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			int i;
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
	WebDriver driver= new ChromeDriver();	
	driver.get("http://gmail.com");
	driver.findElement(By.name("identifier")).sendKeys("Dhruv5400@gmail.com");
	List<WebElement> webEl1 = driver.findElements(By.cssSelector(".RveJvd"));
	 webEl1.get(0).click();
	 Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("Vibhu5400");
	webEl1 = driver.findElements(By.cssSelector(".RveJvd"));
	for(i=0;i<webEl1.size();i++)
	{
                        WebElement ithStudent = webEl1.get(i);
 String att= ithStudent.getAttribute("innerHTML");
        if(att.equals("Next"))
        {
        	ithStudent.click();
        	break;
        }

	}
				
					

	}

}
