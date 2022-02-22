package Selenium.seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v93.overlay.model.LineStyle.Pattern;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Printseleniumautosuggestions {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chinnyreddy36@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Surender5850@");
		Thread.sleep(3000);
		WebElement webElement = driver.findElement(By.xpath("//input[@id='pass']"));// You can use xpath, ID or name
																					// whatever you like
		webElement.sendKeys(Keys.TAB);
		webElement.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Photo/Video']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@class='_1mf _1mj']")).sendKeys("newpost");
		Thread.sleep(5000);

		driver.findElement(By.xpath(("(//*[@class=\"hu5pjgll lzf7d6o1\"])[5]"))).click();
		
		 
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--disable-notifications");
//	WebDriverManager.chromedriver().setup();
//	 WebDriver driver2 = new ChromeDriver();

		// options.addArguments("--disable-popup-blocking");
//	Alert alert = driver.switchTo().alert(); // switch to alert
//	Thread.sleep(5000);
//
//	String alertMessage= driver.switchTo().alert().getText(); // capture alert message
//	Thread.sleep(5000);
//
//	System.out.println(alertMessage); // Print Alert Message
//	Thread.sleep(5000);
//	alert.accept();

		
	}

}
