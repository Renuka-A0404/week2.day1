package week2.day2;
         import java.time.Duration;
         import org.openqa.selenium.By;
         import org.openqa.selenium.chrome.ChromeDriver;

   public class LearnImplicitWait {

		public static void main(String[] args) throws InterruptedException {
			// setup path and launch the browser
			ChromeDriver driver = new ChromeDriver();
			// Load the url
			driver.get("https://login.salesforce.com/");
			// maximize the window
			driver.manage().window().maximize();
			//wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Enter username
			driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
			//enter password
			driver.findElement(By.id("password")).sendKeys("Leaf$1234");
			//click login
			driver.findElement(By.id("Login")).click();
			Thread.sleep(2000);
			//Click AppLauncher
			driver.findElement(By.className("slds-icon-waffle")).click();

	}

}
