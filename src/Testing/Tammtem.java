package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tammtem {

	public WebDriver driver;

	@BeforeTest

	public void pre_my_test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://store.tamatem.co/home");

	}

	@Test (priority = 1)
	public void Validate_the_Registration() {

		String Phone = "0787294620";
		String Pasword = "Alsaeed@1";
		String FullName = " jamal Alsaeed";
		String Email = "jamalalsaeed111@gmail.com";
		driver.findElement(By.xpath("/html/body/app-root/div[1]/app-header/div/div/div[3]/div/div[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//*[@id=\"mat-tab-link-2\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys(Pasword);
		driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys(FullName);
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys(Phone);
		driver.findElement(By.xpath("//*[@id=\"mat-tab-nav-panel-0\"]/app-email/div/form/div[8]/button")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	}
	@Test ()
	
	public void Validate_The_Login_page_And_selecting_Game()  {
		
		driver.findElement(By.xpath("/html/body/app-root/div[1]/app-header/div/div/div[3]/div/div[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/div/app-signup-tabs/div/div[1]/div/div[2]/span")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
		driver.findElement(By.xpath("//*[@id=\"mat-tab-link-5\"]")).click();
		String Email = "adnanalsaeed625@gmail.com";
		String Password = "Alsaeed@1"; 
		driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id=\"mat-tab-nav-panel-3\"]/app-email/div/div/div/form/div/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/div/app-game-list/div/div/div/div[2]/div/div/div[2]/button")).click();
	}
}

