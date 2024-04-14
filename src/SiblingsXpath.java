
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingsXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Priya\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String str = driver.findElement(By.xpath("(//header/div/button/following-sibling::button)[1]")).getText();
		System.out.println(str);
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/div/button[2]")).getText());
	}

}
