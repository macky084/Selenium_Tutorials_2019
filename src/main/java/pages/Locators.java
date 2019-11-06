package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MOHAN\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*
		 * driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).
		 * sendKeys("MOhan");
		 * driver.findElement(By.xpath("//input[@type='text' and @name='lastname']")).
		 * sendKeys("Singh");
		 * driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		 */
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mohanssingh84@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("IPL2015@aa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\MOHAN\\Desktop\\Drivers\\IEDriverServer.exe");
		WebDriver driver1 = new InternetExplorerDriver();
		driver1.navigate().to("https://www.facebook.com/");
		/*
		 * driver1.findElement(By.xpath("//input[@name='email']")).sendKeys(
		 * "mohanssingh84@gmail.com");
		 * driver1.findElement(By.xpath("//input[@name='pass']")).sendKeys("IPL2015@aa")
		 * ; driver1.findElement(By.xpath("//input[@type='submit']")).click();
		 */
		driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("mohanssingh84@gmail.com");
		driver1.findElement(By.xpath("//input[@name='pass']")).sendKeys("IPL2015@aa");
		driver1.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\MOHAN\\Desktop\\Drivers\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.facebook.com/");
		/*
		 * driver2.findElement(By.xpath("//input[@type='text' and @name='firstname']")).
		 * sendKeys("MOhan");
		 * driver2.findElement(By.xpath("//input[@type='text' and @name='lastname']")).
		 * sendKeys("Singh");
		 * driver2.findElement(By.xpath("//button[@name='websubmit']")).click();
		 */
		
		driver2.findElement(By.xpath("//input[@name='email']")).sendKeys("mohanssingh84@gmail.com");
		driver2.findElement(By.xpath("//input[@name='pass']")).sendKeys("IPL2015@aa");
		driver2.findElement(By.xpath("//input[@type='submit']")).click();
	}
}