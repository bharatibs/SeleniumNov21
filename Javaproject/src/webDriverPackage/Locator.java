package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
   //  	driver.findElement(By.id("email")).sendKeys("bharatibs@gmail.com");
     	driver.findElement(By.name("email")).sendKeys("bharatibs@gmail.com");
     	driver.findElement(By.cssSelector(null));
	}

}
