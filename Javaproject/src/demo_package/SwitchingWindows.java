package demo_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingWindows {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.hdfcbank.com/");	
		
		String homePageWH = driver.getWindowHandle();
		System.out.println(homePageWH);
		driver.findElement(By.id("loginsubmit")).click();
		
		for (String t : driver.getWindowHandles()){
			driver.switchTo().window(t);
		}
		driver.findElement((By.xpath("//*[@id='wrapper']/div[6]/a/img"))).click();//new window
		//driver.quit();
		driver.close();
		driver.switchTo().window(homePageWH);

	}

}
