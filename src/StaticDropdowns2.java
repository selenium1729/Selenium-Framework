import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class StaticDropdowns2 {
	public  static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.xpath("//div[@class=\"book\"]/div/div[6]/div[2]")).getText());
		driver.findElement(By.xpath("//div[@class=\"book\"]/div/div[6]/div[2]")).click();
		Thread.sleep(2000);
		int i=1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class=\"book\"]/div/div[6]/div[2]")).getText());
		
		
	}

}
