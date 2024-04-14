import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebdriverIntro {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://googlechromelabs.github.io/chrome-for-testing/");
       driver.quit();
       
       System.out.println("car");
	}
}
