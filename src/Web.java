import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\chromedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		System.setProperty("wedriver.gecko.driver","C:\\Users\\Priya\\chromedriver\\geckodriver.exe");
//		WebDriver driver= new FirefoxDriver();

		System.setProperty("webdriver.edge.driver","C:\\Users\\Priya\\chromedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();  
		driver.get("https://googlechromelabs.github.io/chrome-for-testing/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
