import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Firefox
{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jeevan Shanthan\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("jeevanshanthan14@gmail.com");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		String at = driver.getTitle();
		String et = "gmail";
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test is Successfull");
		}
		else
		{
			System.out.println("Test is Failure");
		}
	}
}