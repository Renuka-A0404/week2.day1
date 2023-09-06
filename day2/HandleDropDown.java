package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		// setup path and launch the browser
				ChromeDriver driver = new ChromeDriver();
				// Load the url
				driver.get("https://www.leafground.com/select.xhtml");
				// maximize the window
				driver.manage().window().maximize();
				
				// Step:1 Locate the dropdown web element
				WebElement tools = driver.findElement(By.className("ui-selectonemenu"));//ctrl+2+l

				// Step:2 Instantiate Select class
				Select drop1 = new Select(tools);
				// Step:3 Call select class method to pick the option from dropdown
				//drop1.selectByIndex(2);
				drop1.selectByVisibleText("Selenium");
				//drop1.selectByValue("ui-selectonemenu-label");
				//Not present in <select> use As usual click
				driver.findElement(By.id("j_idt87:country_label")).click();
				//click the last option(USA)
				driver.findElement(By.id("j_idt87:country_4")).click();
				
	}

}
