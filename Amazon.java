package Amzon;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test
class Amazon
{
	WebDriver driver;
	@Test(priority=0)
	public void LaunchApp() throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void NewSign() throws InterruptedException
	{
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void createAccount() throws InterruptedException
	{
		driver.findElement(By.id("createAccountSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_customer_name")).sendKeys("Jeevan Shanthan");
		Thread.sleep(2000);
		driver.findElement(By.id("ap_phone_number")).sendKeys("9361052870");
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys("jeevanshanthan14@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("Dd22!%@*");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void SignIn() throws InterruptedException
	{
		driver.findElement(By.id("ap_email")).sendKeys("jeevanshanthan14@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("Dd22!%@*");
		Thread.sleep(2000);
		driver.findElement(By.name("rememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		
	}
	@Test(priority=4)
	public void SearchBox() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone 15 pro Max");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Apple iPhone 15 Pro Max (256 GB) - Blue Titanium")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']")).click();
		Thread.sleep(8000);
		WebElement box=driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']"));
		box.click();
		Thread.sleep(9000);
		
	}
	@Test(priority=5)
	public void BuyNow() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='a-page']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.tagName("span")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	@Test(priority=6)
	public void Trending() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Movers and Shakers')]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	@Test(priority=7)
	public void Digital() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Echo & Alexa')]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}
}