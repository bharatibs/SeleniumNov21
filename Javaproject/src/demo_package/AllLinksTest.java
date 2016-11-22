package demo_package;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int x = links.size();
		System.out.println("Total Number of Links on the Webpage = " + x);
		
		String[] linktext = new String[x];
		int t =0;
		//extract the text from the links
		for (WebElement e : links){
			linktext[t] = e.getText();
			t++;
		}
		for (String s : linktext){
			driver.findElement(By.linkText(s)).click();
			if (driver.getTitle().equals("Under Construction: Mercury Tours")){
				System.out.println(s + " is not working");
			}
			else{
				System.out.println(s + " is working");
			}
			driver.navigate().back();
		}
		driver.close();

	}

}
