import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ParameterizedTesting {

	@Test
	public void readData() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.get(readValues("URL"));
		driver.findElement(By.name("userName")).sendKeys(readValues("UserName"));
		driver.findElement(By.name("password")).sendKeys(readValues("PassWord"));
		driver.findElement(By.name("login")).click();
		
	}
	
	public String readValues(String key) throws IOException
	{
		FileInputStream myFile= new FileInputStream("C:\\Users\\Dhruv\\eclipse-workspaceNew\\Introduction\\src\\dataDriven.properties");
		Properties myProp= new Properties();
		myProp.load(myFile);
		return myProp.getProperty(key);
	}
}
