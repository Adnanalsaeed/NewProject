package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Smart_By {
	public WebDriver driver;
	
	public int numberOfTry = 10;
	
//	public int item_in_inventory = 4;
	
	SoftAssert softAssertprocess = new SoftAssert();
	
	@BeforeTest

	public void pre_my_test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smartbuy-me.com/smartbuystore/");
		driver.findElement(By.xpath("/html/body/main/header/div[2]/div/div[2]/a")).click();
	}

	@Test()
	public void Test_Adding_Item_Samsung50inch() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		for(int i = 0 ; i <numberOfTry; i++) {
//			
//			if (i == item_in_inventory ) {
//				break;
//			}
				
		driver.findElement(By.xpath(
				"//*[@id=\"newtab-Featured\"]/div/div[1]/div/div/div/div[2]/div/div[3]/div[1]/div/div/form[1]/div[1]/button"))
				.click();
	
		driver.findElement(By.xpath(
				"//*[@id=\"addToCartLayer\"]/a[2]"))
				.click();
		}
	}

	@Test()
	public void We_need_to_check_the_correct_price()  {
	
		String the_single_item_price = driver
				.findElement(By.xpath("//*[@id=\"newtab-Featured\"]/div/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div/div/span[3]"))
				.getText();
		String[] the_update_single_item_price = the_single_item_price.split("JOD");
		String the_Final_Single_item_price_inString = the_update_single_item_price[0].trim();
		String updated = the_Final_Single_item_price_inString.replace(",", ".");
		Double final_price = Double.parseDouble(updated);
		System.out.println(final_price);
		System.out.println(final_price*numberOfTry);
		
//		String ActualWibsite = driver.getTitle();
//		softAssertprocess.assertEquals(ActualWibsite, "Adnan");
//		SoftAssert softAssertprocess = new SoftAssert();
//		softAssertprocess.assertEquals(final_price * numberOfTry ,4.347 );
//		
//		softAssertprocess.assertAll();
//		

	}

}
