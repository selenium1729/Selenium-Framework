import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginLogoutPageLocators1 {
	
	public static void main(String[] args) throws InterruptedException {
		String name="Priya";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Priya\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String password =getPassword(driver);
		driver.findElement(By.cssSelector("button[class*=\"login-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		String str1 = driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(str1, "You are successfully logged in.");
		String actual = driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
        Assert.assertEquals(actual, "Hello "+name+",");
//        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String str = driver.findElement(By.cssSelector(".infoMsg")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login
//		String[] p1 =str.split("'");
//		System.out.println(p1);
		//0th Please use temporary password
		//1st rahulshettyacademy' to Login
		String password =str.split("'")[1];
//		String password =p1[1].split("'")[0];
		return password;
	}
}
