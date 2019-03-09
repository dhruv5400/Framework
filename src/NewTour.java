import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTour {
	 int i;
	@Test 
	public void flightBooking() throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("dhruv5400");
		driver.findElement(By.name("password")).sendKeys("Krinal5400");
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		List<WebElement>listEl= driver.findElements(By.name("tripType"));
		selectAnElementFromCollection(listEl,"defaultValue","oneway");
		listEl= driver.findElements(By.name("servClass"));
		selectAnElementFromCollection(listEl,"defaultValue","First");
		WebElement dropDown= driver.findElement(By.name("passCount"));
		selectAnElementFromDropDown(dropDown, 2);
		 dropDown= driver.findElement(By.name("fromPort"));
		selectAnElementFromDropDown(dropDown, "London");
		dropDown= driver.findElement(By.name("fromMonth"));
		selectAnElementFromDropDown(dropDown, 4);
		 dropDown= driver.findElement(By.name("fromDay"));
		selectAnElementFromDropDown(dropDown, "30");
		 dropDown= driver.findElement(By.name("toPort"));
		selectAnElementFromDropDown(dropDown, 2);
		 dropDown= driver.findElement(By.name("toMonth"));
		selectAnElementFromDropDown(dropDown, "June");
		 dropDown= driver.findElement(By.name("toDay"));
		selectAnElementFromDropDown(dropDown, "12");
		 dropDown= driver.findElement(By.name("airline"));
		selectAnElementFromDropDown(dropDown, 2);
		driver.findElement(By.name("findFlights")).click();
	}
	
	public void selectAnElementFromCollection(List<WebElement> listEl, String att, String attValue)
	
	{
		for(i=0;i<listEl.size();i++)
		{
			 if(listEl.get(i).getAttribute(att).equals(attValue))
			{
				 listEl.get(i).click();
				break;
			}
	     }
	
    }
	
	public void selectAnElementFromDropDown(WebElement dropDown, int i)
	{
		 new Select(dropDown).selectByIndex(i);
		
	}
	
	public void selectAnElementFromDropDown(WebElement dropDown, String visiText)
	{
		new Select(dropDown).selectByVisibleText(visiText);
	
		
	}
}
	
