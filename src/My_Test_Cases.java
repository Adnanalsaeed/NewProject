import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class My_Test_Cases extends Parameter {
//	@Test()
//	public void Check_The_Title() {
//		String myActualTitle = driver.getTitle();
//		MySoftAssert.assertEquals(myActualTitle, ExpectedTitle);
//		MySoftAssert.assertAll();
//	}

//	@Test ()
//	public void check_the_image_drawer() {
//		List<WebElement> Myimages = driver.findElements(By.className("img-fluid"));
//		boolean myimageCheck1 =  Myimages.get(0).getAttribute("src") == Myimages.get(1).getAttribute("src");
//		boolean myimageCheck2 =  Myimages.get(1).getAttribute("src") == Myimages.get(2).getAttribute("src");
//		boolean myimageCheck3 =  Myimages.get(2).getAttribute("src") == Myimages.get(0).getAttribute("src");
//		MySoftAssert.assertEquals(myimageCheck1,false,"image1 With image2");
//		MySoftAssert.assertEquals(myimageCheck2,false,"image2 With image3");
//		MySoftAssert.assertEquals(myimageCheck3,false,"image3 With image1");
//		MYSOFTASSERT.assertAll();
//	}
//	@Test(invocationCount = 4)
//	public void Validate_the_contact_form_information() throws InterruptedException {
//		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		String Emails[] = { "alsaeedadnan52@gmai.com", "alaasaeedadnan52@gmai.com", "alsaeed65552@gmai.com",
//				"alsaeedadnan52@yahoo.com" };
//		String Name = "Adnan";
//		Random Random = new Random();
//
//		int index = Random.nextInt(4);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys(Emails[index]);
////		driver.findElement(By.xpath("//*[@id=\"recipient-name\"]")).sendKeys(Name);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button/span")).click();
//
//		
//
//	}

	@Test()
	public void Validate_the_contact_form_information() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//**********************RandomEmail**********************************
//		String Email = RandomStringUtils.randomAlphanumeric(10)+"@gmail.com";
//		System.out.println(Email);
		//********************************************************
//		String Emails[] = {"alsaeed65552@gmai.com" ,"alsaeedadnan52gmai.net", "alaasaeedadnan52@gmaias", "alsaeed65552@gmai.com",
//				"@yahoo.com" };
//		String Name = "Adnan";
//		Random Random = new Random();
//
//		int index = Random.nextInt(4);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys(Emails[index]);
//		driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys(Emails[index]);	
//		driver.findElement(By.xpath("//*[@id=\"recipient-name\"]")).sendKeys(Name);
//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys(Emails[index]);
//		
//		
//		String myvalue = driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).getAttribute("value");
//		System.out.println(myvalue);
//		String regex = "^[A-Za-z0-9+_.-]+@(.+)+.(.+)$";
//		Pattern pattern = Pattern.compile(regex);
//		
//		Matcher matcher = pattern.matcher(Emails[index]);
//		System.out.println("****************");
//		System.out.println(Emails[index] +"is valid match : "+ matcher.matches());
//		System.out.println("****************");
//		boolean  mychckprocessfortheeamil = matcher.matches();
//		MySoftAssert.assertEquals(mychckprocessfortheeamil, true,"the emai structure is not matching the correct one");
//		MySoftAssert.assertAll();
				
	}
}
