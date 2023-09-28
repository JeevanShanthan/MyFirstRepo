import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Firefox
{
	public static void main(String[] args) {
		System.out.println("Selenium 1st program");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jeevan Shanthan\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.meesho.com/");
		driver.close();
	}
}