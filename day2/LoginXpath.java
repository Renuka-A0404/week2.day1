package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpath {

	public static void main(String[] args)throws InterruptedException {
			//setup the path
			ChromeDriver driver =new ChromeDriver();
			//Load the url
			driver.get("http://leaftaps.com/opentaps/control/login");
			//maximize the window
			driver.manage().window().maximize();
			//findElement Enter username
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
			Thread.sleep(2000);
			//findElement Enter password
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			//findElement click login
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

	}

}
