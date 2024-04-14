import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginLogoutPageLocators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Priya\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Priya");
		driver.findElement(By.name("inputPassword")).sendKeys("abcd");
		driver.findElement(By.className("signInBtn")).click();
		String error=driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(error);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Priya");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"text\"][2]")).clear();
		driver.findElement(By.xpath("//input[@type=\"text\"][2]")).sendKeys("priya@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8989898989");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		driver.findElement(By.cssSelector("button[class*=\"login-btn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Priya");
		driver.findElement(By.cssSelector("input[name=inputPassword]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.xpath("(//span/input)[2]")).click();
		driver.findElement(By.xpath("//button[contains(@class,\"submit\")]")).click();
		
//		driver.close();
	}

}
