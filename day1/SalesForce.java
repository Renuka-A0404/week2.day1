package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
