import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select drop=new Select(dropDown);
		drop.selectByIndex(3);
		String str1=drop.getFirstSelectedOption().getText();
		System.out.println(str1);
		drop.selectByValue("AED");
		String str2 =drop.getFirstSelectedOption().getText();
		System.out.println(str2);
		drop.selectByVisibleText("USD");
		String str3=drop.getFirstSelectedOption().getText();
		System.out.println(str3); 
		
			
	}
}
