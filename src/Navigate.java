

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Dimension d = new Dimension(200,200);
		driver.manage().window().setSize(d);
		driver.get("https://www.google.co.uk/");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();
		driver.navigate().forward();
}
}